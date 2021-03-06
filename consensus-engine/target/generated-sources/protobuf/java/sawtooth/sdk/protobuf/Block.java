// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: block.proto

package sawtooth.sdk.protobuf;

/**
 * Protobuf type {@code Block}
 */
public  final class Block extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Block)
    BlockOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Block.newBuilder() to construct.
  private Block(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Block() {
    header_ = com.google.protobuf.ByteString.EMPTY;
    headerSignature_ = "";
    batches_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Block(
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

            header_ = input.readBytes();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            headerSignature_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              batches_ = new java.util.ArrayList<sawtooth.sdk.protobuf.Batch>();
              mutable_bitField0_ |= 0x00000004;
            }
            batches_.add(
                input.readMessage(sawtooth.sdk.protobuf.Batch.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        batches_ = java.util.Collections.unmodifiableList(batches_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return sawtooth.sdk.protobuf.BlockOuterClass.internal_static_Block_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sawtooth.sdk.protobuf.BlockOuterClass.internal_static_Block_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sawtooth.sdk.protobuf.Block.class, sawtooth.sdk.protobuf.Block.Builder.class);
  }

  private int bitField0_;
  public static final int HEADER_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString header_;
  /**
   * <pre>
   * The serialized version of the BlockHeader
   * </pre>
   *
   * <code>bytes header = 1;</code>
   */
  public com.google.protobuf.ByteString getHeader() {
    return header_;
  }

  public static final int HEADER_SIGNATURE_FIELD_NUMBER = 2;
  private volatile java.lang.Object headerSignature_;
  /**
   * <pre>
   * The signature derived from signing the header
   * </pre>
   *
   * <code>string header_signature = 2;</code>
   */
  public java.lang.String getHeaderSignature() {
    java.lang.Object ref = headerSignature_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      headerSignature_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The signature derived from signing the header
   * </pre>
   *
   * <code>string header_signature = 2;</code>
   */
  public com.google.protobuf.ByteString
      getHeaderSignatureBytes() {
    java.lang.Object ref = headerSignature_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      headerSignature_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BATCHES_FIELD_NUMBER = 3;
  private java.util.List<sawtooth.sdk.protobuf.Batch> batches_;
  /**
   * <pre>
   * A list of batches. The batches may contain new batches that other
   * validators may not have received yet, or they will be all batches needed
   * for block validation when passed to the journal
   * </pre>
   *
   * <code>repeated .Batch batches = 3;</code>
   */
  public java.util.List<sawtooth.sdk.protobuf.Batch> getBatchesList() {
    return batches_;
  }
  /**
   * <pre>
   * A list of batches. The batches may contain new batches that other
   * validators may not have received yet, or they will be all batches needed
   * for block validation when passed to the journal
   * </pre>
   *
   * <code>repeated .Batch batches = 3;</code>
   */
  public java.util.List<? extends sawtooth.sdk.protobuf.BatchOrBuilder> 
      getBatchesOrBuilderList() {
    return batches_;
  }
  /**
   * <pre>
   * A list of batches. The batches may contain new batches that other
   * validators may not have received yet, or they will be all batches needed
   * for block validation when passed to the journal
   * </pre>
   *
   * <code>repeated .Batch batches = 3;</code>
   */
  public int getBatchesCount() {
    return batches_.size();
  }
  /**
   * <pre>
   * A list of batches. The batches may contain new batches that other
   * validators may not have received yet, or they will be all batches needed
   * for block validation when passed to the journal
   * </pre>
   *
   * <code>repeated .Batch batches = 3;</code>
   */
  public sawtooth.sdk.protobuf.Batch getBatches(int index) {
    return batches_.get(index);
  }
  /**
   * <pre>
   * A list of batches. The batches may contain new batches that other
   * validators may not have received yet, or they will be all batches needed
   * for block validation when passed to the journal
   * </pre>
   *
   * <code>repeated .Batch batches = 3;</code>
   */
  public sawtooth.sdk.protobuf.BatchOrBuilder getBatchesOrBuilder(
      int index) {
    return batches_.get(index);
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
    if (!header_.isEmpty()) {
      output.writeBytes(1, header_);
    }
    if (!getHeaderSignatureBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, headerSignature_);
    }
    for (int i = 0; i < batches_.size(); i++) {
      output.writeMessage(3, batches_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!header_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, header_);
    }
    if (!getHeaderSignatureBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, headerSignature_);
    }
    for (int i = 0; i < batches_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, batches_.get(i));
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
    if (!(obj instanceof sawtooth.sdk.protobuf.Block)) {
      return super.equals(obj);
    }
    sawtooth.sdk.protobuf.Block other = (sawtooth.sdk.protobuf.Block) obj;

    boolean result = true;
    result = result && getHeader()
        .equals(other.getHeader());
    result = result && getHeaderSignature()
        .equals(other.getHeaderSignature());
    result = result && getBatchesList()
        .equals(other.getBatchesList());
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
    hash = (37 * hash) + HEADER_FIELD_NUMBER;
    hash = (53 * hash) + getHeader().hashCode();
    hash = (37 * hash) + HEADER_SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getHeaderSignature().hashCode();
    if (getBatchesCount() > 0) {
      hash = (37 * hash) + BATCHES_FIELD_NUMBER;
      hash = (53 * hash) + getBatchesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sawtooth.sdk.protobuf.Block parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sawtooth.sdk.protobuf.Block parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.Block parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sawtooth.sdk.protobuf.Block parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.Block parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sawtooth.sdk.protobuf.Block parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.Block parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sawtooth.sdk.protobuf.Block parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.Block parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static sawtooth.sdk.protobuf.Block parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.Block parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sawtooth.sdk.protobuf.Block parseFrom(
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
  public static Builder newBuilder(sawtooth.sdk.protobuf.Block prototype) {
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
   * Protobuf type {@code Block}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Block)
      sawtooth.sdk.protobuf.BlockOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sawtooth.sdk.protobuf.BlockOuterClass.internal_static_Block_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sawtooth.sdk.protobuf.BlockOuterClass.internal_static_Block_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sawtooth.sdk.protobuf.Block.class, sawtooth.sdk.protobuf.Block.Builder.class);
    }

    // Construct using sawtooth.sdk.protobuf.Block.newBuilder()
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
        getBatchesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      header_ = com.google.protobuf.ByteString.EMPTY;

      headerSignature_ = "";

      if (batchesBuilder_ == null) {
        batches_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        batchesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sawtooth.sdk.protobuf.BlockOuterClass.internal_static_Block_descriptor;
    }

    @java.lang.Override
    public sawtooth.sdk.protobuf.Block getDefaultInstanceForType() {
      return sawtooth.sdk.protobuf.Block.getDefaultInstance();
    }

    @java.lang.Override
    public sawtooth.sdk.protobuf.Block build() {
      sawtooth.sdk.protobuf.Block result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public sawtooth.sdk.protobuf.Block buildPartial() {
      sawtooth.sdk.protobuf.Block result = new sawtooth.sdk.protobuf.Block(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.header_ = header_;
      result.headerSignature_ = headerSignature_;
      if (batchesBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          batches_ = java.util.Collections.unmodifiableList(batches_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.batches_ = batches_;
      } else {
        result.batches_ = batchesBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof sawtooth.sdk.protobuf.Block) {
        return mergeFrom((sawtooth.sdk.protobuf.Block)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sawtooth.sdk.protobuf.Block other) {
      if (other == sawtooth.sdk.protobuf.Block.getDefaultInstance()) return this;
      if (other.getHeader() != com.google.protobuf.ByteString.EMPTY) {
        setHeader(other.getHeader());
      }
      if (!other.getHeaderSignature().isEmpty()) {
        headerSignature_ = other.headerSignature_;
        onChanged();
      }
      if (batchesBuilder_ == null) {
        if (!other.batches_.isEmpty()) {
          if (batches_.isEmpty()) {
            batches_ = other.batches_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureBatchesIsMutable();
            batches_.addAll(other.batches_);
          }
          onChanged();
        }
      } else {
        if (!other.batches_.isEmpty()) {
          if (batchesBuilder_.isEmpty()) {
            batchesBuilder_.dispose();
            batchesBuilder_ = null;
            batches_ = other.batches_;
            bitField0_ = (bitField0_ & ~0x00000004);
            batchesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBatchesFieldBuilder() : null;
          } else {
            batchesBuilder_.addAllMessages(other.batches_);
          }
        }
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
      sawtooth.sdk.protobuf.Block parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (sawtooth.sdk.protobuf.Block) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.ByteString header_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * The serialized version of the BlockHeader
     * </pre>
     *
     * <code>bytes header = 1;</code>
     */
    public com.google.protobuf.ByteString getHeader() {
      return header_;
    }
    /**
     * <pre>
     * The serialized version of the BlockHeader
     * </pre>
     *
     * <code>bytes header = 1;</code>
     */
    public Builder setHeader(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      header_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The serialized version of the BlockHeader
     * </pre>
     *
     * <code>bytes header = 1;</code>
     */
    public Builder clearHeader() {
      
      header_ = getDefaultInstance().getHeader();
      onChanged();
      return this;
    }

    private java.lang.Object headerSignature_ = "";
    /**
     * <pre>
     * The signature derived from signing the header
     * </pre>
     *
     * <code>string header_signature = 2;</code>
     */
    public java.lang.String getHeaderSignature() {
      java.lang.Object ref = headerSignature_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        headerSignature_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The signature derived from signing the header
     * </pre>
     *
     * <code>string header_signature = 2;</code>
     */
    public com.google.protobuf.ByteString
        getHeaderSignatureBytes() {
      java.lang.Object ref = headerSignature_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        headerSignature_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The signature derived from signing the header
     * </pre>
     *
     * <code>string header_signature = 2;</code>
     */
    public Builder setHeaderSignature(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      headerSignature_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The signature derived from signing the header
     * </pre>
     *
     * <code>string header_signature = 2;</code>
     */
    public Builder clearHeaderSignature() {
      
      headerSignature_ = getDefaultInstance().getHeaderSignature();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The signature derived from signing the header
     * </pre>
     *
     * <code>string header_signature = 2;</code>
     */
    public Builder setHeaderSignatureBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      headerSignature_ = value;
      onChanged();
      return this;
    }

    private java.util.List<sawtooth.sdk.protobuf.Batch> batches_ =
      java.util.Collections.emptyList();
    private void ensureBatchesIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        batches_ = new java.util.ArrayList<sawtooth.sdk.protobuf.Batch>(batches_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        sawtooth.sdk.protobuf.Batch, sawtooth.sdk.protobuf.Batch.Builder, sawtooth.sdk.protobuf.BatchOrBuilder> batchesBuilder_;

    /**
     * <pre>
     * A list of batches. The batches may contain new batches that other
     * validators may not have received yet, or they will be all batches needed
     * for block validation when passed to the journal
     * </pre>
     *
     * <code>repeated .Batch batches = 3;</code>
     */
    public java.util.List<sawtooth.sdk.protobuf.Batch> getBatchesList() {
      if (batchesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(batches_);
      } else {
        return batchesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of batches. The batches may contain new batches that other
     * validators may not have received yet, or they will be all batches needed
     * for block validation when passed to the journal
     * </pre>
     *
     * <code>repeated .Batch batches = 3;</code>
     */
    public int getBatchesCount() {
      if (batchesBuilder_ == null) {
        return batches_.size();
      } else {
        return batchesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of batches. The batches may contain new batches that other
     * validators may not have received yet, or they will be all batches needed
     * for block validation when passed to the journal
     * </pre>
     *
     * <code>repeated .Batch batches = 3;</code>
     */
    public sawtooth.sdk.protobuf.Batch getBatches(int index) {
      if (batchesBuilder_ == null) {
        return batches_.get(index);
      } else {
        return batchesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of batches. The batches may contain new batches that other
     * validators may not have received yet, or they will be all batches needed
     * for block validation when passed to the journal
     * </pre>
     *
     * <code>repeated .Batch batches = 3;</code>
     */
    public Builder setBatches(
        int index, sawtooth.sdk.protobuf.Batch value) {
      if (batchesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBatchesIsMutable();
        batches_.set(index, value);
        onChanged();
      } else {
        batchesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of batches. The batches may contain new batches that other
     * validators may not have received yet, or they will be all batches needed
     * for block validation when passed to the journal
     * </pre>
     *
     * <code>repeated .Batch batches = 3;</code>
     */
    public Builder setBatches(
        int index, sawtooth.sdk.protobuf.Batch.Builder builderForValue) {
      if (batchesBuilder_ == null) {
        ensureBatchesIsMutable();
        batches_.set(index, builderForValue.build());
        onChanged();
      } else {
        batchesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of batches. The batches may contain new batches that other
     * validators may not have received yet, or they will be all batches needed
     * for block validation when passed to the journal
     * </pre>
     *
     * <code>repeated .Batch batches = 3;</code>
     */
    public Builder addBatches(sawtooth.sdk.protobuf.Batch value) {
      if (batchesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBatchesIsMutable();
        batches_.add(value);
        onChanged();
      } else {
        batchesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of batches. The batches may contain new batches that other
     * validators may not have received yet, or they will be all batches needed
     * for block validation when passed to the journal
     * </pre>
     *
     * <code>repeated .Batch batches = 3;</code>
     */
    public Builder addBatches(
        int index, sawtooth.sdk.protobuf.Batch value) {
      if (batchesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBatchesIsMutable();
        batches_.add(index, value);
        onChanged();
      } else {
        batchesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of batches. The batches may contain new batches that other
     * validators may not have received yet, or they will be all batches needed
     * for block validation when passed to the journal
     * </pre>
     *
     * <code>repeated .Batch batches = 3;</code>
     */
    public Builder addBatches(
        sawtooth.sdk.protobuf.Batch.Builder builderForValue) {
      if (batchesBuilder_ == null) {
        ensureBatchesIsMutable();
        batches_.add(builderForValue.build());
        onChanged();
      } else {
        batchesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of batches. The batches may contain new batches that other
     * validators may not have received yet, or they will be all batches needed
     * for block validation when passed to the journal
     * </pre>
     *
     * <code>repeated .Batch batches = 3;</code>
     */
    public Builder addBatches(
        int index, sawtooth.sdk.protobuf.Batch.Builder builderForValue) {
      if (batchesBuilder_ == null) {
        ensureBatchesIsMutable();
        batches_.add(index, builderForValue.build());
        onChanged();
      } else {
        batchesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of batches. The batches may contain new batches that other
     * validators may not have received yet, or they will be all batches needed
     * for block validation when passed to the journal
     * </pre>
     *
     * <code>repeated .Batch batches = 3;</code>
     */
    public Builder addAllBatches(
        java.lang.Iterable<? extends sawtooth.sdk.protobuf.Batch> values) {
      if (batchesBuilder_ == null) {
        ensureBatchesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, batches_);
        onChanged();
      } else {
        batchesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of batches. The batches may contain new batches that other
     * validators may not have received yet, or they will be all batches needed
     * for block validation when passed to the journal
     * </pre>
     *
     * <code>repeated .Batch batches = 3;</code>
     */
    public Builder clearBatches() {
      if (batchesBuilder_ == null) {
        batches_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        batchesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of batches. The batches may contain new batches that other
     * validators may not have received yet, or they will be all batches needed
     * for block validation when passed to the journal
     * </pre>
     *
     * <code>repeated .Batch batches = 3;</code>
     */
    public Builder removeBatches(int index) {
      if (batchesBuilder_ == null) {
        ensureBatchesIsMutable();
        batches_.remove(index);
        onChanged();
      } else {
        batchesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of batches. The batches may contain new batches that other
     * validators may not have received yet, or they will be all batches needed
     * for block validation when passed to the journal
     * </pre>
     *
     * <code>repeated .Batch batches = 3;</code>
     */
    public sawtooth.sdk.protobuf.Batch.Builder getBatchesBuilder(
        int index) {
      return getBatchesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of batches. The batches may contain new batches that other
     * validators may not have received yet, or they will be all batches needed
     * for block validation when passed to the journal
     * </pre>
     *
     * <code>repeated .Batch batches = 3;</code>
     */
    public sawtooth.sdk.protobuf.BatchOrBuilder getBatchesOrBuilder(
        int index) {
      if (batchesBuilder_ == null) {
        return batches_.get(index);  } else {
        return batchesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of batches. The batches may contain new batches that other
     * validators may not have received yet, or they will be all batches needed
     * for block validation when passed to the journal
     * </pre>
     *
     * <code>repeated .Batch batches = 3;</code>
     */
    public java.util.List<? extends sawtooth.sdk.protobuf.BatchOrBuilder> 
         getBatchesOrBuilderList() {
      if (batchesBuilder_ != null) {
        return batchesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(batches_);
      }
    }
    /**
     * <pre>
     * A list of batches. The batches may contain new batches that other
     * validators may not have received yet, or they will be all batches needed
     * for block validation when passed to the journal
     * </pre>
     *
     * <code>repeated .Batch batches = 3;</code>
     */
    public sawtooth.sdk.protobuf.Batch.Builder addBatchesBuilder() {
      return getBatchesFieldBuilder().addBuilder(
          sawtooth.sdk.protobuf.Batch.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of batches. The batches may contain new batches that other
     * validators may not have received yet, or they will be all batches needed
     * for block validation when passed to the journal
     * </pre>
     *
     * <code>repeated .Batch batches = 3;</code>
     */
    public sawtooth.sdk.protobuf.Batch.Builder addBatchesBuilder(
        int index) {
      return getBatchesFieldBuilder().addBuilder(
          index, sawtooth.sdk.protobuf.Batch.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of batches. The batches may contain new batches that other
     * validators may not have received yet, or they will be all batches needed
     * for block validation when passed to the journal
     * </pre>
     *
     * <code>repeated .Batch batches = 3;</code>
     */
    public java.util.List<sawtooth.sdk.protobuf.Batch.Builder> 
         getBatchesBuilderList() {
      return getBatchesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        sawtooth.sdk.protobuf.Batch, sawtooth.sdk.protobuf.Batch.Builder, sawtooth.sdk.protobuf.BatchOrBuilder> 
        getBatchesFieldBuilder() {
      if (batchesBuilder_ == null) {
        batchesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            sawtooth.sdk.protobuf.Batch, sawtooth.sdk.protobuf.Batch.Builder, sawtooth.sdk.protobuf.BatchOrBuilder>(
                batches_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        batches_ = null;
      }
      return batchesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Block)
  }

  // @@protoc_insertion_point(class_scope:Block)
  private static final sawtooth.sdk.protobuf.Block DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sawtooth.sdk.protobuf.Block();
  }

  public static sawtooth.sdk.protobuf.Block getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Block>
      PARSER = new com.google.protobuf.AbstractParser<Block>() {
    @java.lang.Override
    public Block parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Block(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Block> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Block> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public sawtooth.sdk.protobuf.Block getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

