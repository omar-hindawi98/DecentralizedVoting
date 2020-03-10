package se.chalmers.datx02.lib.impl;

import com.google.protobuf.ByteString;
import com.google.protobuf.Parser;
import sawtooth.sdk.protobuf.*;
import se.chalmers.datx02.lib.Communicator;
import se.chalmers.datx02.lib.Service;
import se.chalmers.datx02.lib.exceptions.InvalidState;
import se.chalmers.datx02.lib.exceptions.ReceiveError;
import se.chalmers.datx02.lib.exceptions.UnknownBlock;
import se.chalmers.datx02.lib.models.ConsensusFuture;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ZmqService implements Service {
    private Communicator communicator;
    private long timeout;

    public ZmqService(Communicator communicator, long timeout) {
        this.communicator = communicator;
        this.timeout = timeout;
    }

    private <T> T send(byte[] request, Message.MessageType messageType, Parser<T> responseParser) {
        try {
            byte[] response = communicator.send(request, messageType).result(timeout).getContent();
            return responseParser.parseFrom(response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void sendTo(byte[] receiverId, Message.MessageType messageType, byte[] payload) {
        ByteString messageContent = ByteString.copyFrom(payload);
        ByteString peerId = ByteString.copyFrom(receiverId);
        byte[] request = ConsensusSendToRequest.newBuilder()
                .setContent(messageContent)
                .setMessageType(messageType.toString())
                .setReceiverId(peerId)
                .build().toByteArray();

        send(request, Message.MessageType.CONSENSUS_SEND_TO_REQUEST, ConsensusSendToResponse.parser());
    }

    public void broadcast(String messageType, byte[] payload) {
        ByteString messageContent = ByteString.copyFrom(payload);
        byte[] request = ConsensusBroadcastRequest.newBuilder()
                .setContent(messageContent)
                .setMessageType(messageType)
                .build().toByteArray();

        send(request, Message.MessageType.CONSENSUS_BROADCAST_REQUEST, ConsensusBroadcastRequest.parser());
    }

    // block creating

    public void initializeBlock(byte[] previousId) throws InvalidState, UnknownBlock, ReceiveError {
        ConsensusInitializeBlockRequest.Builder builder = ConsensusInitializeBlockRequest.newBuilder();
        if (previousId != null) {
            ByteString previousBlockId = ByteString.copyFrom(previousId);
            builder.setPreviousId(previousBlockId);
        }
        byte[] request = builder.build().toByteArray();

        ConsensusInitializeBlockResponse response = send(request,
                Message.MessageType.CONSENSUS_INITIALIZE_BLOCK_REQUEST, ConsensusInitializeBlockResponse.parser());

        ConsensusInitializeBlockResponse.Status status = response.getStatus();

        if (status == ConsensusInitializeBlockResponse.Status.INVALID_STATE) {
            throw new InvalidState("Cannot initialize block in current state");
        }
        if (status == ConsensusInitializeBlockResponse.Status.UNKNOWN_BLOCK) {
            throw new UnknownBlock("Unknown block");
        }
        if (status != ConsensusInitializeBlockResponse.Status.OK) {
            throw new ReceiveError("Receive Error, failed with status: " + status.name());
        }
    }

    public byte[] summarizeBlock() {
        // TODO

        return new byte[0];
    }

    public byte[] finalizeBlock(byte[] data) throws InvalidState, UnknownBlock, ReceiveError {
        ByteString content = ByteString.copyFrom(data);
        byte[] request = ConsensusFinalizeBlockRequest.newBuilder().setData(content).build().toByteArray();

        ConsensusFinalizeBlockResponse response = send(request, Message.MessageType.CONSENSUS_FINALIZE_BLOCK_REQUEST,
                ConsensusFinalizeBlockResponse.parser());

        ConsensusFinalizeBlockResponse.Status status = response.getStatus();

        if (status == ConsensusFinalizeBlockResponse.Status.INVALID_STATE) {
            throw new InvalidState("cannot finalize block in current state");
        }
        if (status == ConsensusFinalizeBlockResponse.Status.NOT_READY) {
            throw new UnknownBlock("Block not ready to be finalized");
        }
        if (status != ConsensusFinalizeBlockResponse.Status.OK) {
            throw new ReceiveError("Receive Error, failed with status: " + status.name());
        }

        return response.getBlockId().toByteArray();
    }

    public void cancelBlock() throws InvalidState, ReceiveError {
        byte[] request = ConsensusCancelBlockRequest.newBuilder().build().toByteArray();

        ConsensusCancelBlockResponse response = send(request, Message.MessageType.CONSENSUS_CANCEL_BLOCK_REQUEST,
                ConsensusCancelBlockResponse.parser());

        ConsensusCancelBlockResponse.Status status = response.getStatus();

        if (status == ConsensusCancelBlockResponse.Status.INVALID_STATE) {
            throw new InvalidState("Cannot cancel block in current state");
        }
        if (status != ConsensusCancelBlockResponse.Status.OK) {
            throw new ReceiveError("Receive Error, Failed with status: " + status.name());
        }
    }

    public void checkBlocks(List<byte[]> priority) throws UnknownBlock, ReceiveError {
        for (int i = 0; i < priority.size(); i++) {
            ByteString value = ByteString.copyFrom(priority.get(i));
            byte[] request = ConsensusCheckBlocksRequest.newBuilder().setBlockIds(i, value).build().toByteArray();
            ConsensusCheckBlocksResponse response = send(request, Message.MessageType.CONSENSUS_CHECK_BLOCKS_REQUEST,
                    ConsensusCheckBlocksResponse.parser());
            ConsensusCheckBlocksResponse.Status status = response.getStatus();

            if (status == ConsensusCheckBlocksResponse.Status.UNKNOWN_BLOCK) {
                throw new UnknownBlock("Unknown block");
            }
            if (status != ConsensusCheckBlocksResponse.Status.OK) {
                throw new ReceiveError("Receive Error, Failed with status: " + status.name());
            }
        }
    }

    public void commitBlock(byte[] blockId) throws UnknownBlock, ReceiveError {
        ByteString value = ByteString.copyFrom(blockId);
        byte[] request = ConsensusCommitBlockRequest.newBuilder().setBlockId(value).build().toByteArray();

        ConsensusCommitBlockResponse response = send(request, Message.MessageType.CONSENSUS_COMMIT_BLOCK_REQUEST,
                ConsensusCommitBlockResponse.parser());
        ConsensusCommitBlockResponse.Status status = response.getStatus();

        if (status == ConsensusCommitBlockResponse.Status.UNKNOWN_BLOCK) {
            throw new UnknownBlock("Unknown block");
        }
        if (status != ConsensusCommitBlockResponse.Status.OK) {
            throw new ReceiveError("Receive Error, failed with status: " + status.name());
        }
    }

    public void ignoreBlock(byte[] blockId) throws UnknownBlock, ReceiveError {
        ByteString id = ByteString.copyFrom(blockId);

        byte[] request = ConsensusIgnoreBlockRequest.newBuilder().setBlockId(id).build().toByteArray();

        ConsensusIgnoreBlockResponse response = send(request, Message.MessageType.CONSENSUS_IGNORE_BLOCK_REQUEST,
                ConsensusIgnoreBlockResponse.parser());

        ConsensusIgnoreBlockResponse.Status status = response.getStatus();

        if (status == ConsensusIgnoreBlockResponse.Status.UNKNOWN_BLOCK) {
            throw new UnknownBlock("Unknown block");
        }
        if (status != ConsensusIgnoreBlockResponse.Status.OK) {
            throw new ReceiveError("Receive Error, failed with status: " + status.name());
        }
    }

    public void failBlock(byte[] blockId) throws UnknownBlock, ReceiveError {
        ByteString id = ByteString.copyFrom(blockId);

        byte[] request = ConsensusFailBlockRequest.newBuilder().setBlockId(id).build().toByteArray();

        ConsensusFailBlockResponse response = send(request, Message.MessageType.CONSENSUS_FAIL_BLOCK_REQUEST,
                ConsensusFailBlockResponse.parser());

        ConsensusFailBlockResponse.Status status = response.getStatus();

        if (status == ConsensusFailBlockResponse.Status.UNKNOWN_BLOCK) {
            throw new UnknownBlock("Unknown block");
        }
        if (status != ConsensusFailBlockResponse.Status.OK) {
            throw new ReceiveError("Receive Error, failed with status: " + status.name());
        }
    }

    // -- Queries --

    @Override
    public Map<byte[], ConsensusBlock> getBlocks(List<byte[]> blockIds) throws UnknownBlock, ReceiveError {
        Map<byte[], ConsensusBlock> toReturn = new HashMap<>();

        Iterable<ByteString> byteBlockIds = blockIds.stream().map(ByteString::copyFrom).collect(Collectors.toList());

        byte[] request = ConsensusBlocksGetRequest.newBuilder().addAllBlockIds(byteBlockIds).build().toByteArray();

        ConsensusBlocksGetResponse response = send(request, Message.MessageType.CONSENSUS_BLOCKS_GET_REQUEST, ConsensusBlocksGetResponse.parser());

        ConsensusBlocksGetResponse.Status status = response.getStatus();

        if (status == ConsensusBlocksGetResponse.Status.UNKNOWN_BLOCK)
            throw new UnknownBlock("Unknown Block");
        if (status != ConsensusBlocksGetResponse.Status.OK)
            throw new ReceiveError("Receive Error, Failed with status: " + status.name());

        for (ConsensusBlock c : response.getBlocksList()) {
            toReturn.put(c.getBlockId().toByteArray(), c);
        }

        return toReturn;
    }

    @Override
    public ConsensusBlock getChainHead() {
        // TODO
        return null;
    }

    public Map<String, String> getSettings(byte[] blockId, List<String> settings) throws UnknownBlock, ReceiveError {
        Map<String, String> blockSettings = new HashMap<>();
        ByteString id = ByteString.copyFrom(blockId);

        byte[] request = ConsensusSettingsGetRequest.newBuilder()
                .addAllKeys(settings).setBlockId(id)
                .build().toByteArray();

        ConsensusSettingsGetResponse response = send(request, Message.MessageType.CONSENSUS_SETTINGS_GET_REQUEST,
                ConsensusSettingsGetResponse.parser());

        ConsensusSettingsGetResponse.Status status = response.getStatus();

        if (status == ConsensusSettingsGetResponse.Status.UNKNOWN_BLOCK) {
            throw new UnknownBlock("Unknown block");
        }
        if (status != ConsensusSettingsGetResponse.Status.OK) {
            throw new ReceiveError("Receive error, failed with status: " + status.name());
        }

        for (ConsensusSettingsEntry c : response.getEntriesList()) {
            blockSettings.put(c.getKey(), c.getValue());
        }

        return blockSettings;
    }

    public Map<String, byte[]> getState(byte[] blockId, List<String> addresses) throws UnknownBlock, ReceiveError {
        ByteString id = ByteString.copyFrom(blockId);
        Map<String, byte[]> toReturn = new HashMap<>();

        byte[] request = ConsensusStateGetRequest.newBuilder()
                .setBlockId(id)
                .addAllAddresses(addresses)
                .build().toByteArray();

        ConsensusStateGetResponse response = send(request, Message.MessageType.CONSENSUS_STATE_GET_REQUEST, ConsensusStateGetResponse.parser());

        ConsensusStateGetResponse.Status status = response.getStatus();

        if (status == ConsensusStateGetResponse.Status.UNKNOWN_BLOCK)
            throw new UnknownBlock("Unknown block");
        if (status != ConsensusStateGetResponse.Status.OK)
            throw new ReceiveError("Receive Error, Failed with status: " + status.name() );

        for (ConsensusStateEntry e : response.getEntriesList()) {
            toReturn.put(e.getAddress(), e.getData().toByteArray());
        }
        
        return toReturn;

    }
}