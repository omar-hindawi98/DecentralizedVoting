// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: state_context.proto

package sawtooth.sdk.protobuf;

public interface TpEventAddRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TpEventAddRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string context_id = 1;</code>
   */
  java.lang.String getContextId();
  /**
   * <code>string context_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getContextIdBytes();

  /**
   * <code>.Event event = 2;</code>
   */
  boolean hasEvent();
  /**
   * <code>.Event event = 2;</code>
   */
  sawtooth.sdk.protobuf.Event getEvent();
  /**
   * <code>.Event event = 2;</code>
   */
  sawtooth.sdk.protobuf.EventOrBuilder getEventOrBuilder();
}
