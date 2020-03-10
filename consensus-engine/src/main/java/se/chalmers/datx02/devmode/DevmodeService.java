package se.chalmers.datx02.devmode;

import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin;
import sawtooth.sdk.protobuf.ConsensusBlock;
import sawtooth.sdk.protobuf.Message.MessageType;
import se.chalmers.datx02.lib.Service;
import se.chalmers.datx02.lib.exceptions.InvalidState;
import se.chalmers.datx02.lib.exceptions.ReceiveError;
import se.chalmers.datx02.lib.exceptions.UnknownBlock;


import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class DevmodeService {
    private boolean not_ready_to_summarize,
            not_ready_to_finalize;

    private final static Logger LOGGER = Logger.getLogger(DevmodeService.class.getName());

    private final int DEFAULT_WAIT_TIME = 0;
    public final static byte[] NULL_BLOCK_IDENTIFIER = {0, 0, 0, 0, 0, 0, 0, 0};

    private Service service;

    public DevmodeService(Service service){
        this.service = service;
    }

    public ConsensusBlock getChainHead(){
        LOGGER.info("Getting chain head");

        try{
            return this.service.getChainHead();
        }
        catch(RuntimeException e){
            LOGGER.warning("Failed to get chain head");
            return null;
        }
    }

    public ConsensusBlock getBlock(byte[] blockId){
        LOGGER.info("Getting block " + HexBin.encode(blockId));

        // Generate a list of only one block id
        ArrayList<byte[]> blockList = new ArrayList<>();
        blockList.add(blockId);

        try{
            Map<byte[], ConsensusBlock> result = this.service.getBlocks(blockList);

            ConsensusBlock resultBlock = (ConsensusBlock) result.values().toArray()[0];

            return resultBlock;
        }
        catch(UnknownBlock | ReceiveError e){
            LOGGER.warning("Failed to get block: " + HexBin.encode(blockId));

            return null;
        }
    }

    public void initializeBlock(){
        LOGGER.info("Initializing block");
        try {
            this.service.initializeBlock(null);
        }
        catch(InvalidState | UnknownBlock | ReceiveError e){
            LOGGER.warning("Failed to initialize");
        }
    }

    public byte[] finalizeBlock(){
        LOGGER.info("Finalizing block");

        // Try to summarize block
        byte[] summary = null;


        while(true) {
            // Log
            if(!not_ready_to_summarize){
                not_ready_to_summarize = true;
                LOGGER.info("Block not ready to summarize");
            }

            // Sleep thread
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                throw new RuntimeException("Could not sleep thread");
            }

            // Try to get summarized block
            try{
                summary = this.service.summarizeBlock();
                break;
            }
            catch(RuntimeException e){
                LOGGER.warning("Failed to summarize block");
                break;
            }
        }

        not_ready_to_summarize = false;

        byte[] consensus = DevmodeEngine.createConsensus(summary);

        byte[] block_id = new byte[0];
        try {
            block_id = this.service.finalizeBlock(consensus);
        } catch (InvalidState | UnknownBlock | ReceiveError e) {
            e.printStackTrace();
        }

        while(true) {
            // Log
            if(!not_ready_to_finalize){
                not_ready_to_finalize = true;
                LOGGER.info("Block not ready to finalize");
            }

            // Sleep thread
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                throw new RuntimeException("Could not sleep thread");
            }

            // Try to get summarized block
            try{
                block_id = this.service.finalizeBlock(consensus);
                break;
            }
            catch (InvalidState | UnknownBlock | ReceiveError e) {
                LOGGER.warning("Failed to finalize block");
                break;
            }
        }
        not_ready_to_finalize = false;

        LOGGER.info("Block has been finalized sucessfully : " + HexBin.encode(block_id));

        return block_id;
    }

    public void checkBlock(byte[] blockId){
        LOGGER.info("Checking block " + HexBin.encode(blockId));

        // Generate a list of only one block id
        ArrayList<byte[]> blockList = new ArrayList<>();
        blockList.add(blockId);

        try{
            this.service.checkBlocks(blockList);
        }
        catch(UnknownBlock | ReceiveError e){
            LOGGER.warning("Failed to check block");
        }
    }

    public void failBlock(byte[] blockId){
        LOGGER.info("Failing block " + HexBin.encode(blockId));

        try{
            this.service.failBlock(blockId);
        }
        catch(UnknownBlock | ReceiveError e){
            LOGGER.warning("Failed to fail block");
        }
    }

    public void ignoreBlock(byte[] blockId){
        LOGGER.info("Ignoring block " + HexBin.encode(blockId));

        try{
            this.service.ignoreBlock(blockId);
        }
        catch(UnknownBlock | ReceiveError e){
            LOGGER.warning("Failed to ignore block");
        }
    }

    public void commitBlock(byte[] blockId){
        LOGGER.info("Commiting block " + HexBin.encode(blockId));

        try{
            this.service.commitBlock(blockId);
        }
        catch(UnknownBlock | ReceiveError e){
            LOGGER.warning("Failed to commit block");
        }
    }

    public void cancelBlock(){
        LOGGER.info("Canceling block ");

        try{
            this.service.cancelBlock();
        }
        catch (InvalidState | ReceiveError e) {
            LOGGER.warning("Failed to cancel block");
        }
    }

    public void broadcastPublishedBlock(byte[] blockId){
        LOGGER.info("Broadcasting published block " + HexBin.encode(blockId));

        try{
            this.service.broadcast("published", blockId);
        }
        catch(RuntimeException e){
            LOGGER.warning("Failed to broadcast published block");
        }
    }

    public void sendBlockReceived(ConsensusBlock block){
        try{
            this.service.sendTo(block.getSignerId().toByteArray(), MessageType.CONSENSUS_NOTIFY_PEER_MESSAGE, block.getBlockId().toByteArray());
        }
        catch(RuntimeException e){
            LOGGER.warning("Failed to send block received");
        }
    }

    public void sendBlockAck(byte[] senderId, byte[] blockId){
        try{
            this.service.sendTo(senderId, MessageType.CONSENSUS_NOTIFY_ACK, blockId);
        }
        catch(RuntimeException e){
            LOGGER.warning("Failed to send block ack");
        }
    }

    public int calculateWaitTime(byte[] blockId){
        Map<String, String> settings = null;
        List<String> settingsList = new ArrayList<>();
        int wait_time;

        settingsList.add("sawtooth.consensus.min_wait_time");
        settingsList.add("sawtooth.consensus.max_wait_time");

        try {
            settings = this.service.getSettings(blockId, settingsList);

            int min_wait_time = Integer.parseInt(settings.get("sawtooth.consensus.min_wait_time"));
            int max_wait_time = Integer.parseInt(settings.get("sawtooth.consensus.max_wait_time"));

            LOGGER.info("Min: " + min_wait_time + " -- Max: " + max_wait_time);

            if(min_wait_time >= max_wait_time)
                wait_time = DEFAULT_WAIT_TIME;
            else
                wait_time = ThreadLocalRandom.current().nextInt(min_wait_time, max_wait_time + 1);
        }
        catch(UnknownBlock | ReceiveError e){
            wait_time = DEFAULT_WAIT_TIME;
        }

        LOGGER.info("Wait time: " + wait_time);

        return wait_time;
    }
}