// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: state_context.proto

package sawtooth.sdk.protobuf;

public interface TpStateGetResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TpStateGetResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .TpStateEntry entries = 1;</code>
   */
  java.util.List<sawtooth.sdk.protobuf.TpStateEntry> 
      getEntriesList();
  /**
   * <code>repeated .TpStateEntry entries = 1;</code>
   */
  sawtooth.sdk.protobuf.TpStateEntry getEntries(int index);
  /**
   * <code>repeated .TpStateEntry entries = 1;</code>
   */
  int getEntriesCount();
  /**
   * <code>repeated .TpStateEntry entries = 1;</code>
   */
  java.util.List<? extends sawtooth.sdk.protobuf.TpStateEntryOrBuilder> 
      getEntriesOrBuilderList();
  /**
   * <code>repeated .TpStateEntry entries = 1;</code>
   */
  sawtooth.sdk.protobuf.TpStateEntryOrBuilder getEntriesOrBuilder(
      int index);

  /**
   * <code>.TpStateGetResponse.Status status = 2;</code>
   */
  int getStatusValue();
  /**
   * <code>.TpStateGetResponse.Status status = 2;</code>
   */
  sawtooth.sdk.protobuf.TpStateGetResponse.Status getStatus();
}
