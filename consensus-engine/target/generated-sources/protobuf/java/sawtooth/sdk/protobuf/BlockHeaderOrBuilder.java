// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: block.proto

package sawtooth.sdk.protobuf;

public interface BlockHeaderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:BlockHeader)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Block number in the chain
   * </pre>
   *
   * <code>uint64 block_num = 1;</code>
   */
  long getBlockNum();

  /**
   * <pre>
   * The header_signature of the previous block that was added to the chain.
   * </pre>
   *
   * <code>string previous_block_id = 2;</code>
   */
  java.lang.String getPreviousBlockId();
  /**
   * <pre>
   * The header_signature of the previous block that was added to the chain.
   * </pre>
   *
   * <code>string previous_block_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getPreviousBlockIdBytes();

  /**
   * <pre>
   * Public key for the component internal to the validator that
   * signed the BlockHeader
   * </pre>
   *
   * <code>string signer_public_key = 3;</code>
   */
  java.lang.String getSignerPublicKey();
  /**
   * <pre>
   * Public key for the component internal to the validator that
   * signed the BlockHeader
   * </pre>
   *
   * <code>string signer_public_key = 3;</code>
   */
  com.google.protobuf.ByteString
      getSignerPublicKeyBytes();

  /**
   * <pre>
   * List of batch.header_signatures that match the order of batches
   * required for the block
   * </pre>
   *
   * <code>repeated string batch_ids = 4;</code>
   */
  java.util.List<java.lang.String>
      getBatchIdsList();
  /**
   * <pre>
   * List of batch.header_signatures that match the order of batches
   * required for the block
   * </pre>
   *
   * <code>repeated string batch_ids = 4;</code>
   */
  int getBatchIdsCount();
  /**
   * <pre>
   * List of batch.header_signatures that match the order of batches
   * required for the block
   * </pre>
   *
   * <code>repeated string batch_ids = 4;</code>
   */
  java.lang.String getBatchIds(int index);
  /**
   * <pre>
   * List of batch.header_signatures that match the order of batches
   * required for the block
   * </pre>
   *
   * <code>repeated string batch_ids = 4;</code>
   */
  com.google.protobuf.ByteString
      getBatchIdsBytes(int index);

  /**
   * <pre>
   * Bytes that are set and verified by the consensus algorithm used to
   * create and validate the block
   * </pre>
   *
   * <code>bytes consensus = 5;</code>
   */
  com.google.protobuf.ByteString getConsensus();

  /**
   * <pre>
   * The state_root_hash should match the final state_root after all
   * transactions in the batches have been applied, otherwise the block
   * is not valid
   * </pre>
   *
   * <code>string state_root_hash = 6;</code>
   */
  java.lang.String getStateRootHash();
  /**
   * <pre>
   * The state_root_hash should match the final state_root after all
   * transactions in the batches have been applied, otherwise the block
   * is not valid
   * </pre>
   *
   * <code>string state_root_hash = 6;</code>
   */
  com.google.protobuf.ByteString
      getStateRootHashBytes();
}
