package se.chalmers.datx02;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import sawtooth.sdk.protobuf.ConsensusBlock;
import sawtooth.sdk.protobuf.ConsensusNotifyBlockCommit;
import sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage;
import se.chalmers.datx02.lib.Engine;
import se.chalmers.datx02.lib.Service;
import se.chalmers.datx02.lib.StartupState;
import se.chalmers.datx02.lib.models.DriverUpdate;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

public class DevmodeEngine implements Engine {
    private final static Logger LOGGER = Logger.getLogger(DevmodeEngine.class.getName());
    private final AtomicBoolean exit = new AtomicBoolean(false);
    private BlockingQueue<DriverUpdate> updates;
    private StartupState startupState;
    private DevmodeService service;


    @Override
    public void start(BlockingQueue<DriverUpdate> updates, Service service, StartupState startupState) {
        this.service = new DevmodeService(service);
        this.startupState = startupState;
        this.updates = updates;
        try {
            engineLoop();
        } catch (InvalidProtocolBufferException e) {
            throw new RuntimeException("Could not parse protocol buffer", e);
        } catch (InterruptedException e) {
            throw new RuntimeException("Engine update interrupted", e);
        }
    }

    private void engineLoop() throws InvalidProtocolBufferException, InterruptedException {
        ConsensusBlock chainHead = startupState.getChainHead();
        int wait_time = service.calculateWaitTime(chainHead.getBlockId().toByteArray());

        boolean published_at_height = false;
        Instant start = Instant.now(); // Get time

        service.initializeBlock();

        /*
         * 1. Wait for an incoming message
         * 2. Check for exit
         * 3. Handle the message
         * 4. Check for publishing
         */
        DriverUpdate update;
        ConsensusBlock block;
        while (!exit.get()) {
            update = updates.poll(Duration.ofMillis(10).getSeconds(), TimeUnit.SECONDS);
            if (update == null) {
                // no message, continue
                continue;
            }
            System.out.println("Received message: " + update.getMessageType());

            switch (update.getMessageType()) {
                case CONSENSUS_NOTIFY_ENGINE_DEACTIVATED:
                    this.stop();
                    break;
                case CONSENSUS_NOTIFY_BLOCK_NEW:
                    System.out.println("Checking consensus data: ");
                    block = ConsensusBlock.parseFrom(update.getData());
                    if (Arrays.equals(block.getBlockId().toByteArray(), service.NULL_BLOCK_IDENTIFIER)) {
                        System.out.println("WARNING: Received genesis block; ignoring");
                        continue;
                    }
                    if (checkConsensus(block)) {
                        LOGGER.info("Passed consensus check: " + block.getBlockId());
                        service.checkBlock(block.getBlockId().toByteArray());
                    } else {
                        LOGGER.info("Failed consensus check: " + block.getBlockId());
                        service.failBlock(block.getBlockId().toByteArray());
                    }
                    break;
                case CONSENSUS_NOTIFY_BLOCK_VALID:
                    byte[] blockId = update.getData();
                    block = service.getBlock(blockId);
                    service.sendBlockReceived(block);
                    chainHead = service.getChainHead();
                    LOGGER.info("Choosing between chain heads: \nCurrent: " + chainHead.getBlockId() + "\nNew: " + block.getBlockId());

                    if (block.getBlockNum() > chainHead.getBlockNum() || (
                            block.getBlockNum() == chainHead.getBlockNum() &&
                                    block.getBlockId().toStringUtf8().compareTo(chainHead.getBlockId().toStringUtf8()) > 0)
                    ) {
                        LOGGER.info("Committing: " + block.getBlockId());
                        service.commitBlock(block.getBlockId().toByteArray());
                    } else if (block.getBlockNum() < chainHead.getBlockNum()) {
                        ConsensusBlock chainBlock = service.getBlock(chainHead.getPreviousId().toByteArray());
                        // loop backwards till the block has been found
                        while (!Arrays.equals(chainBlock.getBlockId().toByteArray(), block.getBlockId().toByteArray())) {
                            chainBlock = service.getBlock(chainBlock.getPreviousId().toByteArray());
                        }
                        if (block.getBlockId().toStringUtf8().compareTo(chainBlock.getBlockId().toStringUtf8()) > 0) {
                            LOGGER.info("Switching to new fork: " + block.getBlockId());
                            service.commitBlock(block.getBlockId().toByteArray());
                        } else {
                            LOGGER.info("Ignoring fork: " + block.getBlockId());
                            service.ignoreBlock(block.getBlockId().toByteArray());
                        }

                    } else {
                        LOGGER.info("Ignoring: " + block.getBlockId());
                        service.ignoreBlock(block.getBlockId().toByteArray());
                    }
                    break;
                // The chain head was updated, so abandon the
                // block in progress and start a new one.
                case CONSENSUS_NOTIFY_BLOCK_COMMIT:
                    ConsensusNotifyBlockCommit consensusNotifyBlockCommit = ConsensusNotifyBlockCommit.parseFrom(update.getData());
                    ByteString newChainHeadId = consensusNotifyBlockCommit.getBlockId();

                    LOGGER.info("Chain head updated to " + newChainHeadId + ", abandoning block in progress");
                    service.cancelBlock();
                    wait_time = service.calculateWaitTime(newChainHeadId.toByteArray());
                    published_at_height = false;
                    start = Instant.now();
                    service.initializeBlock();
                    break;
                case CONSENSUS_NOTIFY_PEER_MESSAGE:
                    ConsensusNotifyPeerMessage peerMessage = ConsensusNotifyPeerMessage.parseFrom(update.getData());
                    // TODO parse peer message correctly
                    break;
                default:
                    // Ignore all other message types
                    break;
            }

            // Publish block when timer expires
            if (!published_at_height && Duration.between(Instant.now(), start).getSeconds() > wait_time) {
                System.out.println("Timer expired - publishing block");
                byte[] new_blockId = service.finalizeBlock();
                published_at_height = true;

                service.broadcastPublishedBlock(new_blockId);
            }
        }
    }

    private static boolean checkConsensus(ConsensusBlock block) {
        return Arrays.equals(block.getPayload().toByteArray(), createConsensus(block.getSummary().toByteArray()));
    }

    private static byte[] createConsensus(byte[] blockSummary) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            baos.write("Devmode".getBytes());
            baos.write(blockSummary);
            return baos.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException("Could not write bytearrayoutputstream");
        }
    }

    @Override
    public void stop() {
        this.exit.set(true);
    }

    @Override
    public String getVersion() {
        return "0.1";
    }

    @Override
    public String getName() {
        return "Devmode-java";
    }

    @Override
    public Map<String, String> additionalProtocol() {
        return Collections.emptyMap();
    }
}
