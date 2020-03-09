// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transaction_receipt.proto

package sawtooth.sdk.protobuf;

public interface TransactionReceiptOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TransactionReceipt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * State changes made by this transaction
   * StateChange is defined in protos/transaction_receipt.proto
   * </pre>
   *
   * <code>repeated .StateChange state_changes = 1;</code>
   */
  java.util.List<sawtooth.sdk.protobuf.StateChange> 
      getStateChangesList();
  /**
   * <pre>
   * State changes made by this transaction
   * StateChange is defined in protos/transaction_receipt.proto
   * </pre>
   *
   * <code>repeated .StateChange state_changes = 1;</code>
   */
  sawtooth.sdk.protobuf.StateChange getStateChanges(int index);
  /**
   * <pre>
   * State changes made by this transaction
   * StateChange is defined in protos/transaction_receipt.proto
   * </pre>
   *
   * <code>repeated .StateChange state_changes = 1;</code>
   */
  int getStateChangesCount();
  /**
   * <pre>
   * State changes made by this transaction
   * StateChange is defined in protos/transaction_receipt.proto
   * </pre>
   *
   * <code>repeated .StateChange state_changes = 1;</code>
   */
  java.util.List<? extends sawtooth.sdk.protobuf.StateChangeOrBuilder> 
      getStateChangesOrBuilderList();
  /**
   * <pre>
   * State changes made by this transaction
   * StateChange is defined in protos/transaction_receipt.proto
   * </pre>
   *
   * <code>repeated .StateChange state_changes = 1;</code>
   */
  sawtooth.sdk.protobuf.StateChangeOrBuilder getStateChangesOrBuilder(
      int index);

  /**
   * <pre>
   * Events fired by this transaction
   * </pre>
   *
   * <code>repeated .Event events = 2;</code>
   */
  java.util.List<sawtooth.sdk.protobuf.Event> 
      getEventsList();
  /**
   * <pre>
   * Events fired by this transaction
   * </pre>
   *
   * <code>repeated .Event events = 2;</code>
   */
  sawtooth.sdk.protobuf.Event getEvents(int index);
  /**
   * <pre>
   * Events fired by this transaction
   * </pre>
   *
   * <code>repeated .Event events = 2;</code>
   */
  int getEventsCount();
  /**
   * <pre>
   * Events fired by this transaction
   * </pre>
   *
   * <code>repeated .Event events = 2;</code>
   */
  java.util.List<? extends sawtooth.sdk.protobuf.EventOrBuilder> 
      getEventsOrBuilderList();
  /**
   * <pre>
   * Events fired by this transaction
   * </pre>
   *
   * <code>repeated .Event events = 2;</code>
   */
  sawtooth.sdk.protobuf.EventOrBuilder getEventsOrBuilder(
      int index);

  /**
   * <pre>
   * Transaction family defined data
   * </pre>
   *
   * <code>repeated bytes data = 3;</code>
   */
  java.util.List<com.google.protobuf.ByteString> getDataList();
  /**
   * <pre>
   * Transaction family defined data
   * </pre>
   *
   * <code>repeated bytes data = 3;</code>
   */
  int getDataCount();
  /**
   * <pre>
   * Transaction family defined data
   * </pre>
   *
   * <code>repeated bytes data = 3;</code>
   */
  com.google.protobuf.ByteString getData(int index);

  /**
   * <code>string transaction_id = 4;</code>
   */
  java.lang.String getTransactionId();
  /**
   * <code>string transaction_id = 4;</code>
   */
  com.google.protobuf.ByteString
      getTransactionIdBytes();
}
