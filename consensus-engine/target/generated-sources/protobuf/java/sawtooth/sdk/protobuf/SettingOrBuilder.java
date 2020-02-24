// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: setting.proto

package sawtooth.sdk.protobuf;

public interface SettingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Setting)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of setting entries - more than one implies a state key collision
   * </pre>
   *
   * <code>repeated .Setting.Entry entries = 1;</code>
   */
  java.util.List<sawtooth.sdk.protobuf.Setting.Entry> 
      getEntriesList();
  /**
   * <pre>
   * List of setting entries - more than one implies a state key collision
   * </pre>
   *
   * <code>repeated .Setting.Entry entries = 1;</code>
   */
  sawtooth.sdk.protobuf.Setting.Entry getEntries(int index);
  /**
   * <pre>
   * List of setting entries - more than one implies a state key collision
   * </pre>
   *
   * <code>repeated .Setting.Entry entries = 1;</code>
   */
  int getEntriesCount();
  /**
   * <pre>
   * List of setting entries - more than one implies a state key collision
   * </pre>
   *
   * <code>repeated .Setting.Entry entries = 1;</code>
   */
  java.util.List<? extends sawtooth.sdk.protobuf.Setting.EntryOrBuilder> 
      getEntriesOrBuilderList();
  /**
   * <pre>
   * List of setting entries - more than one implies a state key collision
   * </pre>
   *
   * <code>repeated .Setting.Entry entries = 1;</code>
   */
  sawtooth.sdk.protobuf.Setting.EntryOrBuilder getEntriesOrBuilder(
      int index);
}