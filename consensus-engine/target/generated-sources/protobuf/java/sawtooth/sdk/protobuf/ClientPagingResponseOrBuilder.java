// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client_list_control.proto

package sawtooth.sdk.protobuf;

public interface ClientPagingResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ClientPagingResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string next = 1;</code>
   */
  java.lang.String getNext();
  /**
   * <code>string next = 1;</code>
   */
  com.google.protobuf.ByteString
      getNextBytes();

  /**
   * <code>string start = 2;</code>
   */
  java.lang.String getStart();
  /**
   * <code>string start = 2;</code>
   */
  com.google.protobuf.ByteString
      getStartBytes();

  /**
   * <code>int32 limit = 3;</code>
   */
  int getLimit();
}
