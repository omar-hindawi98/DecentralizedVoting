// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: genesis.proto

package sawtooth.sdk.protobuf;

public interface GenesisDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GenesisData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of batches that will be applied during the genesis process
   * </pre>
   *
   * <code>repeated .Batch batches = 1;</code>
   */
  java.util.List<sawtooth.sdk.protobuf.Batch> 
      getBatchesList();
  /**
   * <pre>
   * The list of batches that will be applied during the genesis process
   * </pre>
   *
   * <code>repeated .Batch batches = 1;</code>
   */
  sawtooth.sdk.protobuf.Batch getBatches(int index);
  /**
   * <pre>
   * The list of batches that will be applied during the genesis process
   * </pre>
   *
   * <code>repeated .Batch batches = 1;</code>
   */
  int getBatchesCount();
  /**
   * <pre>
   * The list of batches that will be applied during the genesis process
   * </pre>
   *
   * <code>repeated .Batch batches = 1;</code>
   */
  java.util.List<? extends sawtooth.sdk.protobuf.BatchOrBuilder> 
      getBatchesOrBuilderList();
  /**
   * <pre>
   * The list of batches that will be applied during the genesis process
   * </pre>
   *
   * <code>repeated .Batch batches = 1;</code>
   */
  sawtooth.sdk.protobuf.BatchOrBuilder getBatchesOrBuilder(
      int index);
}
