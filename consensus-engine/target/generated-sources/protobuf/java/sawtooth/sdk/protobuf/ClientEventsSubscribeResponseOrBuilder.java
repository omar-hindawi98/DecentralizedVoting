// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client_event.proto

package sawtooth.sdk.protobuf;

public interface ClientEventsSubscribeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ClientEventsSubscribeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.ClientEventsSubscribeResponse.Status status = 1;</code>
   */
  int getStatusValue();
  /**
   * <code>.ClientEventsSubscribeResponse.Status status = 1;</code>
   */
  sawtooth.sdk.protobuf.ClientEventsSubscribeResponse.Status getStatus();

  /**
   * <pre>
   * Additional information about the response status
   * </pre>
   *
   * <code>string response_message = 2;</code>
   */
  java.lang.String getResponseMessage();
  /**
   * <pre>
   * Additional information about the response status
   * </pre>
   *
   * <code>string response_message = 2;</code>
   */
  com.google.protobuf.ByteString
      getResponseMessageBytes();
}