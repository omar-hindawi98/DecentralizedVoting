// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: consensus.proto

package sawtooth.sdk.protobuf;

public interface ConsensusSummarizeBlockResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ConsensusSummarizeBlockResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.ConsensusSummarizeBlockResponse.Status status = 1;</code>
   */
  int getStatusValue();
  /**
   * <code>.ConsensusSummarizeBlockResponse.Status status = 1;</code>
   */
  sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse.Status getStatus();

  /**
   * <pre>
   * A summary of the block contents
   * </pre>
   *
   * <code>bytes summary = 2;</code>
   */
  com.google.protobuf.ByteString getSummary();
}
