// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: consensus.proto

package sawtooth.sdk.protobuf;

public interface ConsensusStateGetResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ConsensusStateGetResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.ConsensusStateGetResponse.Status status = 1;</code>
   */
  int getStatusValue();
  /**
   * <code>.ConsensusStateGetResponse.Status status = 1;</code>
   */
  sawtooth.sdk.protobuf.ConsensusStateGetResponse.Status getStatus();

  /**
   * <code>repeated .ConsensusStateEntry entries = 2;</code>
   */
  java.util.List<sawtooth.sdk.protobuf.ConsensusStateEntry> 
      getEntriesList();
  /**
   * <code>repeated .ConsensusStateEntry entries = 2;</code>
   */
  sawtooth.sdk.protobuf.ConsensusStateEntry getEntries(int index);
  /**
   * <code>repeated .ConsensusStateEntry entries = 2;</code>
   */
  int getEntriesCount();
  /**
   * <code>repeated .ConsensusStateEntry entries = 2;</code>
   */
  java.util.List<? extends sawtooth.sdk.protobuf.ConsensusStateEntryOrBuilder> 
      getEntriesOrBuilderList();
  /**
   * <code>repeated .ConsensusStateEntry entries = 2;</code>
   */
  sawtooth.sdk.protobuf.ConsensusStateEntryOrBuilder getEntriesOrBuilder(
      int index);
}
