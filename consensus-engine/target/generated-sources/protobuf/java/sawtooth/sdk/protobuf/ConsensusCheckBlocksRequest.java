// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: consensus.proto

package sawtooth.sdk.protobuf;

/**
 * <pre>
 * Request that, for each block block in order, the block is checked to
 * determine whether the block can be committed successfully or not. Blocks
 * may be checked in parallel. If a new request arrives, it overrides the
 * previous request allowing the engine to reprioritize the list of blocks to
 * check.
 * NOTE: OK does not mean the blocks will all commit successfully, only that
 * the directive was received successfully. The engine must listen for
 * notifications from the consuming component to learn if the blocks would
 * commit or not.
 * </pre>
 *
 * Protobuf type {@code ConsensusCheckBlocksRequest}
 */
public  final class ConsensusCheckBlocksRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ConsensusCheckBlocksRequest)
    ConsensusCheckBlocksRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConsensusCheckBlocksRequest.newBuilder() to construct.
  private ConsensusCheckBlocksRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConsensusCheckBlocksRequest() {
    blockIds_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConsensusCheckBlocksRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              blockIds_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
              mutable_bitField0_ |= 0x00000001;
            }
            blockIds_.add(input.readBytes());
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        blockIds_ = java.util.Collections.unmodifiableList(blockIds_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return sawtooth.sdk.protobuf.Consensus.internal_static_ConsensusCheckBlocksRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sawtooth.sdk.protobuf.Consensus.internal_static_ConsensusCheckBlocksRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest.class, sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest.Builder.class);
  }

  public static final int BLOCK_IDS_FIELD_NUMBER = 1;
  private java.util.List<com.google.protobuf.ByteString> blockIds_;
  /**
   * <code>repeated bytes block_ids = 1;</code>
   */
  public java.util.List<com.google.protobuf.ByteString>
      getBlockIdsList() {
    return blockIds_;
  }
  /**
   * <code>repeated bytes block_ids = 1;</code>
   */
  public int getBlockIdsCount() {
    return blockIds_.size();
  }
  /**
   * <code>repeated bytes block_ids = 1;</code>
   */
  public com.google.protobuf.ByteString getBlockIds(int index) {
    return blockIds_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < blockIds_.size(); i++) {
      output.writeBytes(1, blockIds_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < blockIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(blockIds_.get(i));
      }
      size += dataSize;
      size += 1 * getBlockIdsList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest)) {
      return super.equals(obj);
    }
    sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest other = (sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest) obj;

    boolean result = true;
    result = result && getBlockIdsList()
        .equals(other.getBlockIdsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getBlockIdsCount() > 0) {
      hash = (37 * hash) + BLOCK_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getBlockIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request that, for each block block in order, the block is checked to
   * determine whether the block can be committed successfully or not. Blocks
   * may be checked in parallel. If a new request arrives, it overrides the
   * previous request allowing the engine to reprioritize the list of blocks to
   * check.
   * NOTE: OK does not mean the blocks will all commit successfully, only that
   * the directive was received successfully. The engine must listen for
   * notifications from the consuming component to learn if the blocks would
   * commit or not.
   * </pre>
   *
   * Protobuf type {@code ConsensusCheckBlocksRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ConsensusCheckBlocksRequest)
      sawtooth.sdk.protobuf.ConsensusCheckBlocksRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sawtooth.sdk.protobuf.Consensus.internal_static_ConsensusCheckBlocksRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sawtooth.sdk.protobuf.Consensus.internal_static_ConsensusCheckBlocksRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest.class, sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest.Builder.class);
    }

    // Construct using sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      blockIds_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sawtooth.sdk.protobuf.Consensus.internal_static_ConsensusCheckBlocksRequest_descriptor;
    }

    @java.lang.Override
    public sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest getDefaultInstanceForType() {
      return sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest.getDefaultInstance();
    }

    @java.lang.Override
    public sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest build() {
      sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest buildPartial() {
      sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest result = new sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        blockIds_ = java.util.Collections.unmodifiableList(blockIds_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.blockIds_ = blockIds_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest) {
        return mergeFrom((sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest other) {
      if (other == sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest.getDefaultInstance()) return this;
      if (!other.blockIds_.isEmpty()) {
        if (blockIds_.isEmpty()) {
          blockIds_ = other.blockIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureBlockIdsIsMutable();
          blockIds_.addAll(other.blockIds_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.protobuf.ByteString> blockIds_ = java.util.Collections.emptyList();
    private void ensureBlockIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        blockIds_ = new java.util.ArrayList<com.google.protobuf.ByteString>(blockIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated bytes block_ids = 1;</code>
     */
    public java.util.List<com.google.protobuf.ByteString>
        getBlockIdsList() {
      return java.util.Collections.unmodifiableList(blockIds_);
    }
    /**
     * <code>repeated bytes block_ids = 1;</code>
     */
    public int getBlockIdsCount() {
      return blockIds_.size();
    }
    /**
     * <code>repeated bytes block_ids = 1;</code>
     */
    public com.google.protobuf.ByteString getBlockIds(int index) {
      return blockIds_.get(index);
    }
    /**
     * <code>repeated bytes block_ids = 1;</code>
     */
    public Builder setBlockIds(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureBlockIdsIsMutable();
      blockIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes block_ids = 1;</code>
     */
    public Builder addBlockIds(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureBlockIdsIsMutable();
      blockIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes block_ids = 1;</code>
     */
    public Builder addAllBlockIds(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureBlockIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, blockIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes block_ids = 1;</code>
     */
    public Builder clearBlockIds() {
      blockIds_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ConsensusCheckBlocksRequest)
  }

  // @@protoc_insertion_point(class_scope:ConsensusCheckBlocksRequest)
  private static final sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest();
  }

  public static sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConsensusCheckBlocksRequest>
      PARSER = new com.google.protobuf.AbstractParser<ConsensusCheckBlocksRequest>() {
    @java.lang.Override
    public ConsensusCheckBlocksRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConsensusCheckBlocksRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConsensusCheckBlocksRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConsensusCheckBlocksRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public sawtooth.sdk.protobuf.ConsensusCheckBlocksRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

