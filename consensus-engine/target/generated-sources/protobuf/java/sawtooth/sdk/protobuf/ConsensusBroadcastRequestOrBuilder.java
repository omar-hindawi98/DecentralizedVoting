// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: consensus.proto

package sawtooth.sdk.protobuf;

public interface ConsensusBroadcastRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ConsensusBroadcastRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Payload to broadcast peers
   * NOTE: This payload will be wrapped up in a ConsensusPeerMessage struct,
   * which includes computing its SHA-512 digest, inserting this engine's
   * registration info, and the validator's public key, and signing everything
   * with the validator's private key.
   * </pre>
   *
   * <code>bytes content = 1;</code>
   */
  com.google.protobuf.ByteString getContent();

  /**
   * <code>string message_type = 2;</code>
   */
  java.lang.String getMessageType();
  /**
   * <code>string message_type = 2;</code>
   */
  com.google.protobuf.ByteString
      getMessageTypeBytes();
}