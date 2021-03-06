// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: consensus.proto

package sawtooth.sdk.protobuf;

public interface ConsensusPeerMessageHeaderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ConsensusPeerMessageHeader)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Public key for the component internal to the validator that
   * signed the message
   * </pre>
   *
   * <code>bytes signer_id = 1;</code>
   */
  com.google.protobuf.ByteString getSignerId();

  /**
   * <pre>
   * The sha512 hash of the encoded message
   * </pre>
   *
   * <code>bytes content_sha512 = 2;</code>
   */
  com.google.protobuf.ByteString getContentSha512();

  /**
   * <pre>
   * Interpretation is left to the consensus engine implementation
   * </pre>
   *
   * <code>string message_type = 5;</code>
   */
  java.lang.String getMessageType();
  /**
   * <pre>
   * Interpretation is left to the consensus engine implementation
   * </pre>
   *
   * <code>string message_type = 5;</code>
   */
  com.google.protobuf.ByteString
      getMessageTypeBytes();

  /**
   * <pre>
   * Used to identify the consensus engine that produced this message
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Used to identify the consensus engine that produced this message
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string version = 4;</code>
   */
  java.lang.String getVersion();
  /**
   * <code>string version = 4;</code>
   */
  com.google.protobuf.ByteString
      getVersionBytes();
}
