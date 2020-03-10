// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: merkle.proto

package sawtooth.sdk.protobuf;

public interface ChangeLogEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ChangeLogEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A root hash of a merkle trie this tree was based off.
   * </pre>
   *
   * <code>bytes parent = 1;</code>
   */
  com.google.protobuf.ByteString getParent();

  /**
   * <pre>
   * The hashes that were added for this root. These may be deleted during
   * pruning, if this root is being abandoned.
   * </pre>
   *
   * <code>repeated bytes additions = 2;</code>
   */
  java.util.List<com.google.protobuf.ByteString> getAdditionsList();
  /**
   * <pre>
   * The hashes that were added for this root. These may be deleted during
   * pruning, if this root is being abandoned.
   * </pre>
   *
   * <code>repeated bytes additions = 2;</code>
   */
  int getAdditionsCount();
  /**
   * <pre>
   * The hashes that were added for this root. These may be deleted during
   * pruning, if this root is being abandoned.
   * </pre>
   *
   * <code>repeated bytes additions = 2;</code>
   */
  com.google.protobuf.ByteString getAdditions(int index);

  /**
   * <pre>
   * The list of successors.
   * </pre>
   *
   * <code>repeated .ChangeLogEntry.Successor successors = 3;</code>
   */
  java.util.List<sawtooth.sdk.protobuf.ChangeLogEntry.Successor> 
      getSuccessorsList();
  /**
   * <pre>
   * The list of successors.
   * </pre>
   *
   * <code>repeated .ChangeLogEntry.Successor successors = 3;</code>
   */
  sawtooth.sdk.protobuf.ChangeLogEntry.Successor getSuccessors(int index);
  /**
   * <pre>
   * The list of successors.
   * </pre>
   *
   * <code>repeated .ChangeLogEntry.Successor successors = 3;</code>
   */
  int getSuccessorsCount();
  /**
   * <pre>
   * The list of successors.
   * </pre>
   *
   * <code>repeated .ChangeLogEntry.Successor successors = 3;</code>
   */
  java.util.List<? extends sawtooth.sdk.protobuf.ChangeLogEntry.SuccessorOrBuilder> 
      getSuccessorsOrBuilderList();
  /**
   * <pre>
   * The list of successors.
   * </pre>
   *
   * <code>repeated .ChangeLogEntry.Successor successors = 3;</code>
   */
  sawtooth.sdk.protobuf.ChangeLogEntry.SuccessorOrBuilder getSuccessorsOrBuilder(
      int index);
}