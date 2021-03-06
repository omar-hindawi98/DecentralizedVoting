package se.chalmers.datx02.lib;

import com.google.protobuf.ByteString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import sawtooth.sdk.protobuf.*;
import se.chalmers.datx02.lib.exceptions.*;
import se.chalmers.datx02.lib.impl.ZmqService;
import se.chalmers.datx02.lib.models.ConsensusFuture;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class ZmqServiceTest {
    private Service service;
    private String url;
    private Communicator communicator;


    @BeforeEach
    void before(@Mock Communicator communicator) {
        this.communicator = communicator;
        service = new ZmqService(communicator, 10);
    }

    private ConsensusFuture makeFuture(Message.MessageType messageType, byte[] content) {
        ConsensusFuture future = new ConsensusFuture(messageType);
        future.setResponse(content, messageType);
        return future;
    }

    @Test
    void testSendTo() {
        ConsensusSendToResponse resp = ConsensusSendToResponse.newBuilder()
                .setStatus(ConsensusSendToResponse.Status.OK)
                .build();
        when(communicator.send(any(byte[].class), any(Message.MessageType.class))).thenReturn(
                makeFuture(
                        Message.MessageType.CONSENSUS_SEND_TO_RESPONSE,
                        resp.toByteArray()));

        service.sendTo(
                "receiverId".getBytes(),
                Message.MessageType.PING_REQUEST.toString(),
                "payload".getBytes()
        );

        verify(communicator).send(ConsensusSendToRequest.newBuilder()
                .setContent(ByteString.copyFrom("payload".getBytes()))
                .setReceiverId(ByteString.copyFrom("receiverId".getBytes()))
                .setMessageType(Message.MessageType.PING_REQUEST.toString())
                .build().toByteArray(), Message.MessageType.CONSENSUS_SEND_TO_REQUEST);
    }

    @Test
    void testBroadcast() {
        ConsensusBroadcastResponse resp = ConsensusBroadcastResponse.newBuilder()
                .setStatus((ConsensusBroadcastResponse.Status.OK)).build();
        when(communicator.send(any(byte[].class), any(Message.MessageType.class))).thenReturn(
                makeFuture(
                        Message.MessageType.CONSENSUS_BROADCAST_RESPONSE,
                        resp.toByteArray()));

        service.broadcast(
                Message.MessageType.PING_REQUEST.toString(),
                "payload".getBytes()
        );

        verify(communicator).send(
                ConsensusBroadcastRequest.newBuilder()
                        .setContent(ByteString.copyFrom("payload".getBytes()))
                        .setMessageType(Message.MessageType.PING_REQUEST.toString())
                        .build().toByteArray(), Message.MessageType.CONSENSUS_BROADCAST_REQUEST
        );
    }

    @Test
    void testInitializeBlock() throws ReceiveErrorException, InvalidStateException, UnknownBlockException {
        ConsensusInitializeBlockResponse resp = ConsensusInitializeBlockResponse.newBuilder()
                .setStatus((ConsensusInitializeBlockResponse.Status.OK)).build();
        when(communicator.send(any(byte[].class), any(Message.MessageType.class))).thenReturn(
                makeFuture(
                        Message.MessageType.CONSENSUS_INITIALIZE_BLOCK_RESPONSE,
                        resp.toByteArray()
                ));

        service.initializeBlock(
                "previousId".getBytes()
        );

        verify(communicator).send(
                ConsensusInitializeBlockRequest.newBuilder()
                        .setPreviousId(ByteString.copyFrom("previousId".getBytes()))
                        .build().toByteArray(), Message.MessageType.CONSENSUS_INITIALIZE_BLOCK_REQUEST
        );
    }

    @Test
    void testSummarizeBlock() throws ReceiveErrorException, InvalidStateException, BlockNotReadyException {
        ConsensusSummarizeBlockResponse resp = ConsensusSummarizeBlockResponse.newBuilder()
                .setStatus(ConsensusSummarizeBlockResponse.Status.OK)
                .setSummary(ByteString.copyFrom("summary".getBytes()))
                .build();

        when(communicator.send(any(byte[].class), any(Message.MessageType.class))).thenReturn(
                makeFuture(
                        Message.MessageType.CONSENSUS_SUMMARIZE_BLOCK_RESPONSE,
                        resp.toByteArray()
                )
        );

        byte[] result = service.summarizeBlock();

        verify(communicator).send(ConsensusSummarizeBlockRequest.newBuilder()
                        .build().toByteArray(),
                Message.MessageType.CONSENSUS_SUMMARIZE_BLOCK_REQUEST);

        assertEquals(ByteString.copyFrom(result), ByteString.copyFrom("summary".getBytes()));
    }

    @Test
    void testFinalizeBlock() throws ReceiveErrorException, InvalidStateException, UnknownBlockException, BlockNotReadyException {
        String blockId = "blockId";
        ByteString blockIdBytes = ByteString.copyFromUtf8(blockId);
        ConsensusFinalizeBlockResponse resp = ConsensusFinalizeBlockResponse.newBuilder()
                .setStatus(ConsensusFinalizeBlockResponse.Status.OK)
                .setBlockId(blockIdBytes)
                .build();
        when(communicator.send(any(byte[].class), any(Message.MessageType.class))).thenReturn(
                makeFuture(
                        Message.MessageType.CONSENSUS_FINALIZE_BLOCK_RESPONSE,
                        resp.toByteArray()
                ));

        byte[] response = service.finalizeBlock(
                blockIdBytes.toByteArray()
        );

        verify(communicator).send(
                ConsensusFinalizeBlockRequest.newBuilder()
                        .setData(blockIdBytes)
                        .build().toByteArray(), Message.MessageType.CONSENSUS_FINALIZE_BLOCK_REQUEST
        );
        assertArrayEquals(blockIdBytes.toByteArray(), response);
    }

    @Test
    void testCancelBlock() throws ReceiveErrorException, InvalidStateException {
        ConsensusCancelBlockResponse resp = ConsensusCancelBlockResponse.newBuilder()
                .setStatus(ConsensusCancelBlockResponse.Status.OK).build();

        when(communicator.send(any(byte[].class), any(Message.MessageType.class))).thenReturn(
                makeFuture(
                        Message.MessageType.CONSENSUS_CANCEL_BLOCK_RESPONSE,
                        resp.toByteArray()
                ));

        service.cancelBlock();

        verify(communicator).send(
                ConsensusCancelBlockRequest.newBuilder().build().toByteArray(),
                Message.MessageType.CONSENSUS_CANCEL_BLOCK_REQUEST
        );
    }

    @Test
    void testCheckBlocks() throws UnknownBlockException, ReceiveErrorException {
        List<byte[]> priority = new ArrayList<>();
        priority.add("test1".getBytes());
        priority.add("test2".getBytes());

        ConsensusCheckBlocksResponse resp = ConsensusCheckBlocksResponse.newBuilder()
                .setStatus(ConsensusCheckBlocksResponse.Status.OK).build();

        when(communicator.send(any(byte[].class), any(Message.MessageType.class))).thenReturn(
                makeFuture(
                        Message.MessageType.CONSENSUS_CHECK_BLOCKS_RESPONSE,
                        resp.toByteArray()
                ));

        service.checkBlocks(priority);

        verify(communicator).send(
                ConsensusCheckBlocksRequest.newBuilder()
                        .addAllBlockIds(priority.stream()
                                .map(ByteString::copyFrom)
                                .collect(Collectors.toList()))
                        .build().toByteArray(),
                Message.MessageType.CONSENSUS_CHECK_BLOCKS_REQUEST
        );
    }

    @Test
    void testCommitBlocks() throws UnknownBlockException, ReceiveErrorException {
        ConsensusCommitBlockResponse resp = ConsensusCommitBlockResponse.newBuilder()
                .setStatus(ConsensusCommitBlockResponse.Status.OK).build();

        when(communicator.send(any(byte[].class), any(Message.MessageType.class))).thenReturn(
                makeFuture(
                        Message.MessageType.CONSENSUS_COMMIT_BLOCK_RESPONSE,
                        resp.toByteArray()
                )
        );

        service.commitBlock("test".getBytes());

        verify(communicator).send(
                ConsensusCommitBlockRequest.newBuilder()
                        .setBlockId(ByteString.copyFrom("test".getBytes())).build().toByteArray(),
                Message.MessageType.CONSENSUS_COMMIT_BLOCK_REQUEST
        );
    }

    @Test
    void testIgnoreBlocks() throws UnknownBlockException, ReceiveErrorException {
        ConsensusIgnoreBlockResponse resp = ConsensusIgnoreBlockResponse.newBuilder()
                .setStatus(ConsensusIgnoreBlockResponse.Status.OK).build();

        when(communicator.send(any(byte[].class), any(Message.MessageType.class))).thenReturn(
                makeFuture(
                        Message.MessageType.CONSENSUS_IGNORE_BLOCK_RESPONSE,
                        resp.toByteArray()
                )
        );

        service.ignoreBlock("test".getBytes());

        verify(communicator).send(ConsensusIgnoreBlockRequest.newBuilder()
                        .setBlockId(ByteString.copyFrom("test".getBytes())).build().toByteArray(),
                Message.MessageType.CONSENSUS_IGNORE_BLOCK_REQUEST
        );
    }

    @Test
    void testFailBlock() throws UnknownBlockException, ReceiveErrorException {
        ConsensusFailBlockResponse resp = ConsensusFailBlockResponse.newBuilder()
                .setStatus(ConsensusFailBlockResponse.Status.OK).build();

        when(communicator.send(any(byte[].class), any(Message.MessageType.class))).thenReturn(
                makeFuture(
                        Message.MessageType.CONSENSUS_FAIL_BLOCK_RESPONSE,
                        resp.toByteArray()
                )
        );

        service.failBlock("test".getBytes());

        verify(communicator).send(
                ConsensusFailBlockRequest.newBuilder()
                        .setBlockId(ByteString.copyFrom("test".getBytes()))
                        .build().toByteArray(),
                Message.MessageType.CONSENSUS_FAIL_BLOCK_REQUEST
        );
    }

    @Test
    void testGetBlocks() throws UnknownBlockException, ReceiveErrorException {
        Map<ByteString, ConsensusBlock> blockList = new HashMap<>();

        ConsensusBlock block1 = ConsensusBlock.newBuilder()
                .setBlockId(ByteString.copyFrom("block1".getBytes()))
                .setPreviousId(ByteString.copyFrom("block0".getBytes()))
                .setSignerId(ByteString.copyFrom("signer1".getBytes()))
                .setBlockNum(1)
                .setPayload(ByteString.copyFrom("test1".getBytes())).build();

        ConsensusBlock block2 = ConsensusBlock.newBuilder()
                .setBlockId(ByteString.copyFrom("block2".getBytes()))
                .setPreviousId(ByteString.copyFrom("block1".getBytes()))
                .setSignerId(ByteString.copyFrom("signer2".getBytes()))
                .setBlockNum(2)
                .setPayload(ByteString.copyFrom("test2".getBytes())).build();

        blockList.put(block1.getBlockId(), block1);
        blockList.put(block2.getBlockId(), block2);

        ConsensusBlocksGetResponse resp = ConsensusBlocksGetResponse.newBuilder()
                .setStatus(ConsensusBlocksGetResponse.Status.OK)
                .addAllBlocks(blockList.values()).build();

        when(communicator.send(any(byte[].class), any(Message.MessageType.class))).thenReturn(
                makeFuture(
                        Message.MessageType.CONSENSUS_BLOCKS_GET_RESPONSE,
                        resp.toByteArray()
                )
        );

        List<byte[]> blockIds = new ArrayList<>();
        blockIds.add("block1".getBytes());
        blockIds.add("block2".getBytes());

        Map<ByteString, ConsensusBlock> response = service.getBlocks(blockIds);

        verify(communicator).send(
                ConsensusBlocksGetRequest.newBuilder()
                .addAllBlockIds(blockIds.stream()
                        .map(ByteString::copyFrom)
                        .collect(Collectors.toList())).build().toByteArray(),
                Message.MessageType.CONSENSUS_BLOCKS_GET_REQUEST
        );

        assertEquals(blockList, response);

    }

    @Test
    void testGetChainHead() throws NoChainHeadException, ReceiveErrorException {
        ConsensusBlock block = ConsensusBlock.newBuilder()
                .setBlockId(ByteString.copyFrom("block".getBytes()))
                .setPreviousId(ByteString.copyFrom("block0".getBytes()))
                .setSignerId(ByteString.copyFrom("signer".getBytes()))
                .setBlockNum(1)
                .setPayload(ByteString.copyFrom("test".getBytes()))
                .build();

        ConsensusChainHeadGetResponse resp = ConsensusChainHeadGetResponse.newBuilder()
                .setBlock(block)
                .setStatus(ConsensusChainHeadGetResponse.Status.OK)
                .build();

        when(communicator.send(any(byte[].class), any(Message.MessageType.class))).thenReturn(
                makeFuture(
                        Message.MessageType.CONSENSUS_CHAIN_HEAD_GET_RESPONSE,
                        resp.toByteArray()
                )
        );

        ConsensusBlock chainHead = service.getChainHead();

        verify(communicator).send(ConsensusChainHeadGetRequest.newBuilder().build().toByteArray(),
                Message.MessageType.CONSENSUS_CHAIN_HEAD_GET_REQUEST);

        assertEquals(chainHead.getBlockId(), ByteString.copyFrom("block".getBytes()));
        assertEquals(chainHead.getPreviousId(), ByteString.copyFrom("block0".getBytes()));
        assertEquals(chainHead.getSignerId(), ByteString.copyFrom("signer".getBytes()));
        assertEquals(chainHead.getBlockNum(), 1);
        assertEquals(chainHead.getPayload(), ByteString.copyFrom("test".getBytes()));
    }

    @Test
    void testGetSettings() throws UnknownBlockException, ReceiveErrorException {
        List<ConsensusSettingsEntry> settingEntries = new ArrayList<>();

        ConsensusSettingsEntry entry1 = ConsensusSettingsEntry.newBuilder().setKey("key1").setValue("value1").build();
        ConsensusSettingsEntry entry2 = ConsensusSettingsEntry.newBuilder().setKey("key2").setValue("value2").build();

        settingEntries.add(entry1);
        settingEntries.add(entry2);

        ConsensusSettingsGetResponse resp = ConsensusSettingsGetResponse.newBuilder()
                .setStatus(ConsensusSettingsGetResponse.Status.OK)
                .addAllEntries(settingEntries).build();

        when(communicator.send(any(byte[].class), any(Message.MessageType.class))).thenReturn(
                makeFuture(
                        Message.MessageType.CONSENSUS_SETTINGS_GET_RESPONSE,
                        resp.toByteArray()
                )
        );

        List<String> settings = new ArrayList<>();
        settings.add("test1");
        settings.add("test2");

        Map<String, String> entries = service.getSettings("test".getBytes(), settings);

        verify(communicator).send(
                ConsensusSettingsGetRequest.newBuilder().setBlockId(ByteString.copyFrom("test".getBytes()))
                        .addAllKeys(settings)
                        .build().toByteArray(),
                Message.MessageType.CONSENSUS_SETTINGS_GET_REQUEST
        );
        Map<String, String> toCompare = new HashMap<>();
        toCompare.put(settingEntries.get(0).getKey(), settingEntries.get(0).getValue());
        toCompare.put(settingEntries.get(1).getKey(), settingEntries.get(1).getValue());
        assertEquals(entries, toCompare);
    }

    @Test
    void testGetState() throws UnknownBlockException, ReceiveErrorException {
        List<ConsensusStateEntry> stateEntries = new ArrayList<>();

        ConsensusStateEntry entry1 = ConsensusStateEntry.newBuilder()
                .setAddress("address1")
                .setData(ByteString.copyFrom("data1".getBytes())).build();
        ConsensusStateEntry entry2 = ConsensusStateEntry.newBuilder()
                .setAddress("address2")
                .setData(ByteString.copyFrom("data2".getBytes())).build();

        stateEntries.add(entry1);
        stateEntries.add(entry2);

        ConsensusStateGetResponse resp = ConsensusStateGetResponse.newBuilder()
                .setStatus(ConsensusStateGetResponse.Status.OK)
                .addAllEntries(stateEntries).build();

        when(communicator.send(any(byte[].class), any(Message.MessageType.class))).thenReturn(
                makeFuture(
                        Message.MessageType.CONSENSUS_STATE_GET_RESPONSE,
                        resp.toByteArray()
                )
        );

        List<String> addresses = new ArrayList<>();
        addresses.add("test1");
        addresses.add("test2");

        Map<String, ByteString> entries = service.getState("test".getBytes(), addresses);

        verify(communicator).send(
                ConsensusStateGetRequest.newBuilder()
                .setBlockId(ByteString.copyFrom("test".getBytes()))
                        .addAllAddresses(addresses)
                        .build().toByteArray(),
                Message.MessageType.CONSENSUS_STATE_GET_REQUEST
        );

        Map<String, ByteString> toCompare = new HashMap<>();

        toCompare.put(stateEntries.get(0).getAddress(), stateEntries.get(0).getData());
        toCompare.put(stateEntries.get(1).getAddress(), stateEntries.get(1).getData());

        assertEquals(entries, toCompare);

    }
}