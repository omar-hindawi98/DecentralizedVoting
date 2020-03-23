// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pbft_message.proto

package pbft.sdk.protobuf;

/**
 * <pre>
 * A generic PBFT message (PrePrepare, Prepare, Commit, ViewChange, SealRequest)
 * </pre>
 *
 * Protobuf type {@code PbftMessage}
 */
public  final class PbftMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PbftMessage)
    PbftMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PbftMessage.newBuilder() to construct.
  private PbftMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PbftMessage() {
    blockId_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PbftMessage(
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
            pbft.sdk.protobuf.PbftMessageInfo.Builder subBuilder = null;
            if (info_ != null) {
              subBuilder = info_.toBuilder();
            }
            info_ = input.readMessage(pbft.sdk.protobuf.PbftMessageInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(info_);
              info_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {

            blockId_ = input.readBytes();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return pbft.sdk.protobuf.PbftMessageOuterClass.internal_static_PbftMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return pbft.sdk.protobuf.PbftMessageOuterClass.internal_static_PbftMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            pbft.sdk.protobuf.PbftMessage.class, pbft.sdk.protobuf.PbftMessage.Builder.class);
  }

  public static final int INFO_FIELD_NUMBER = 1;
  private pbft.sdk.protobuf.PbftMessageInfo info_;
  /**
   * <pre>
   * Message information
   * </pre>
   *
   * <code>.PbftMessageInfo info = 1;</code>
   */
  public boolean hasInfo() {
    return info_ != null;
  }
  /**
   * <pre>
   * Message information
   * </pre>
   *
   * <code>.PbftMessageInfo info = 1;</code>
   */
  public pbft.sdk.protobuf.PbftMessageInfo getInfo() {
    return info_ == null ? pbft.sdk.protobuf.PbftMessageInfo.getDefaultInstance() : info_;
  }
  /**
   * <pre>
   * Message information
   * </pre>
   *
   * <code>.PbftMessageInfo info = 1;</code>
   */
  public pbft.sdk.protobuf.PbftMessageInfoOrBuilder getInfoOrBuilder() {
    return getInfo();
  }

  public static final int BLOCK_ID_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString blockId_;
  /**
   * <pre>
   * The block this message is for
   * </pre>
   *
   * <code>bytes block_id = 2;</code>
   */
  public com.google.protobuf.ByteString getBlockId() {
    return blockId_;
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
    if (info_ != null) {
      output.writeMessage(1, getInfo());
    }
    if (!blockId_.isEmpty()) {
      output.writeBytes(2, blockId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (info_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getInfo());
    }
    if (!blockId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, blockId_);
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
    if (!(obj instanceof pbft.sdk.protobuf.PbftMessage)) {
      return super.equals(obj);
    }
    pbft.sdk.protobuf.PbftMessage other = (pbft.sdk.protobuf.PbftMessage) obj;

    boolean result = true;
    result = result && (hasInfo() == other.hasInfo());
    if (hasInfo()) {
      result = result && getInfo()
          .equals(other.getInfo());
    }
    result = result && getBlockId()
        .equals(other.getBlockId());
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
    if (hasInfo()) {
      hash = (37 * hash) + INFO_FIELD_NUMBER;
      hash = (53 * hash) + getInfo().hashCode();
    }
    hash = (37 * hash) + BLOCK_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBlockId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static pbft.sdk.protobuf.PbftMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pbft.sdk.protobuf.PbftMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pbft.sdk.protobuf.PbftMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pbft.sdk.protobuf.PbftMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pbft.sdk.protobuf.PbftMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pbft.sdk.protobuf.PbftMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pbft.sdk.protobuf.PbftMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static pbft.sdk.protobuf.PbftMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static pbft.sdk.protobuf.PbftMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static pbft.sdk.protobuf.PbftMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static pbft.sdk.protobuf.PbftMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static pbft.sdk.protobuf.PbftMessage parseFrom(
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
  public static Builder newBuilder(pbft.sdk.protobuf.PbftMessage prototype) {
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
   * A generic PBFT message (PrePrepare, Prepare, Commit, ViewChange, SealRequest)
   * </pre>
   *
   * Protobuf type {@code PbftMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PbftMessage)
      pbft.sdk.protobuf.PbftMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pbft.sdk.protobuf.PbftMessageOuterClass.internal_static_PbftMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pbft.sdk.protobuf.PbftMessageOuterClass.internal_static_PbftMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              pbft.sdk.protobuf.PbftMessage.class, pbft.sdk.protobuf.PbftMessage.Builder.class);
    }

    // Construct using pbft.sdk.protobuf.PbftMessage.newBuilder()
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
      if (infoBuilder_ == null) {
        info_ = null;
      } else {
        info_ = null;
        infoBuilder_ = null;
      }
      blockId_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return pbft.sdk.protobuf.PbftMessageOuterClass.internal_static_PbftMessage_descriptor;
    }

    @java.lang.Override
    public pbft.sdk.protobuf.PbftMessage getDefaultInstanceForType() {
      return pbft.sdk.protobuf.PbftMessage.getDefaultInstance();
    }

    @java.lang.Override
    public pbft.sdk.protobuf.PbftMessage build() {
      pbft.sdk.protobuf.PbftMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public pbft.sdk.protobuf.PbftMessage buildPartial() {
      pbft.sdk.protobuf.PbftMessage result = new pbft.sdk.protobuf.PbftMessage(this);
      if (infoBuilder_ == null) {
        result.info_ = info_;
      } else {
        result.info_ = infoBuilder_.build();
      }
      result.blockId_ = blockId_;
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
      if (other instanceof pbft.sdk.protobuf.PbftMessage) {
        return mergeFrom((pbft.sdk.protobuf.PbftMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(pbft.sdk.protobuf.PbftMessage other) {
      if (other == pbft.sdk.protobuf.PbftMessage.getDefaultInstance()) return this;
      if (other.hasInfo()) {
        mergeInfo(other.getInfo());
      }
      if (other.getBlockId() != com.google.protobuf.ByteString.EMPTY) {
        setBlockId(other.getBlockId());
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
      pbft.sdk.protobuf.PbftMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (pbft.sdk.protobuf.PbftMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private pbft.sdk.protobuf.PbftMessageInfo info_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        pbft.sdk.protobuf.PbftMessageInfo, pbft.sdk.protobuf.PbftMessageInfo.Builder, pbft.sdk.protobuf.PbftMessageInfoOrBuilder> infoBuilder_;
    /**
     * <pre>
     * Message information
     * </pre>
     *
     * <code>.PbftMessageInfo info = 1;</code>
     */
    public boolean hasInfo() {
      return infoBuilder_ != null || info_ != null;
    }
    /**
     * <pre>
     * Message information
     * </pre>
     *
     * <code>.PbftMessageInfo info = 1;</code>
     */
    public pbft.sdk.protobuf.PbftMessageInfo getInfo() {
      if (infoBuilder_ == null) {
        return info_ == null ? pbft.sdk.protobuf.PbftMessageInfo.getDefaultInstance() : info_;
      } else {
        return infoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Message information
     * </pre>
     *
     * <code>.PbftMessageInfo info = 1;</code>
     */
    public Builder setInfo(pbft.sdk.protobuf.PbftMessageInfo value) {
      if (infoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        info_ = value;
        onChanged();
      } else {
        infoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Message information
     * </pre>
     *
     * <code>.PbftMessageInfo info = 1;</code>
     */
    public Builder setInfo(
        pbft.sdk.protobuf.PbftMessageInfo.Builder builderForValue) {
      if (infoBuilder_ == null) {
        info_ = builderForValue.build();
        onChanged();
      } else {
        infoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Message information
     * </pre>
     *
     * <code>.PbftMessageInfo info = 1;</code>
     */
    public Builder mergeInfo(pbft.sdk.protobuf.PbftMessageInfo value) {
      if (infoBuilder_ == null) {
        if (info_ != null) {
          info_ =
            pbft.sdk.protobuf.PbftMessageInfo.newBuilder(info_).mergeFrom(value).buildPartial();
        } else {
          info_ = value;
        }
        onChanged();
      } else {
        infoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Message information
     * </pre>
     *
     * <code>.PbftMessageInfo info = 1;</code>
     */
    public Builder clearInfo() {
      if (infoBuilder_ == null) {
        info_ = null;
        onChanged();
      } else {
        info_ = null;
        infoBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Message information
     * </pre>
     *
     * <code>.PbftMessageInfo info = 1;</code>
     */
    public pbft.sdk.protobuf.PbftMessageInfo.Builder getInfoBuilder() {
      
      onChanged();
      return getInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Message information
     * </pre>
     *
     * <code>.PbftMessageInfo info = 1;</code>
     */
    public pbft.sdk.protobuf.PbftMessageInfoOrBuilder getInfoOrBuilder() {
      if (infoBuilder_ != null) {
        return infoBuilder_.getMessageOrBuilder();
      } else {
        return info_ == null ?
            pbft.sdk.protobuf.PbftMessageInfo.getDefaultInstance() : info_;
      }
    }
    /**
     * <pre>
     * Message information
     * </pre>
     *
     * <code>.PbftMessageInfo info = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        pbft.sdk.protobuf.PbftMessageInfo, pbft.sdk.protobuf.PbftMessageInfo.Builder, pbft.sdk.protobuf.PbftMessageInfoOrBuilder> 
        getInfoFieldBuilder() {
      if (infoBuilder_ == null) {
        infoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            pbft.sdk.protobuf.PbftMessageInfo, pbft.sdk.protobuf.PbftMessageInfo.Builder, pbft.sdk.protobuf.PbftMessageInfoOrBuilder>(
                getInfo(),
                getParentForChildren(),
                isClean());
        info_ = null;
      }
      return infoBuilder_;
    }

    private com.google.protobuf.ByteString blockId_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * The block this message is for
     * </pre>
     *
     * <code>bytes block_id = 2;</code>
     */
    public com.google.protobuf.ByteString getBlockId() {
      return blockId_;
    }
    /**
     * <pre>
     * The block this message is for
     * </pre>
     *
     * <code>bytes block_id = 2;</code>
     */
    public Builder setBlockId(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      blockId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The block this message is for
     * </pre>
     *
     * <code>bytes block_id = 2;</code>
     */
    public Builder clearBlockId() {
      
      blockId_ = getDefaultInstance().getBlockId();
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


    // @@protoc_insertion_point(builder_scope:PbftMessage)
  }

  // @@protoc_insertion_point(class_scope:PbftMessage)
  private static final pbft.sdk.protobuf.PbftMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new pbft.sdk.protobuf.PbftMessage();
  }

  public static pbft.sdk.protobuf.PbftMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PbftMessage>
      PARSER = new com.google.protobuf.AbstractParser<PbftMessage>() {
    @java.lang.Override
    public PbftMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PbftMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PbftMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PbftMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public pbft.sdk.protobuf.PbftMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
