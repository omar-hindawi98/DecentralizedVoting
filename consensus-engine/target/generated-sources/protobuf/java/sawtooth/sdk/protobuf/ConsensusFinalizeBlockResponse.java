// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: consensus.proto

package sawtooth.sdk.protobuf;

/**
 * Protobuf type {@code ConsensusFinalizeBlockResponse}
 */
public  final class ConsensusFinalizeBlockResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ConsensusFinalizeBlockResponse)
    ConsensusFinalizeBlockResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConsensusFinalizeBlockResponse.newBuilder() to construct.
  private ConsensusFinalizeBlockResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConsensusFinalizeBlockResponse() {
    status_ = 0;
    blockId_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConsensusFinalizeBlockResponse(
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
          case 8: {
            int rawValue = input.readEnum();

            status_ = rawValue;
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
    return sawtooth.sdk.protobuf.Consensus.internal_static_ConsensusFinalizeBlockResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sawtooth.sdk.protobuf.Consensus.internal_static_ConsensusFinalizeBlockResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse.class, sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code ConsensusFinalizeBlockResponse.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>STATUS_UNSET = 0;</code>
     */
    STATUS_UNSET(0),
    /**
     * <code>OK = 1;</code>
     */
    OK(1),
    /**
     * <code>BAD_REQUEST = 2;</code>
     */
    BAD_REQUEST(2),
    /**
     * <code>SERVICE_ERROR = 3;</code>
     */
    SERVICE_ERROR(3),
    /**
     * <code>NOT_READY = 4;</code>
     */
    NOT_READY(4),
    /**
     * <code>INVALID_STATE = 5;</code>
     */
    INVALID_STATE(5),
    /**
     * <code>BLOCK_NOT_READY = 6;</code>
     */
    BLOCK_NOT_READY(6),
    /**
     * <code>NOT_ACTIVE_ENGINE = 7;</code>
     */
    NOT_ACTIVE_ENGINE(7),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>STATUS_UNSET = 0;</code>
     */
    public static final int STATUS_UNSET_VALUE = 0;
    /**
     * <code>OK = 1;</code>
     */
    public static final int OK_VALUE = 1;
    /**
     * <code>BAD_REQUEST = 2;</code>
     */
    public static final int BAD_REQUEST_VALUE = 2;
    /**
     * <code>SERVICE_ERROR = 3;</code>
     */
    public static final int SERVICE_ERROR_VALUE = 3;
    /**
     * <code>NOT_READY = 4;</code>
     */
    public static final int NOT_READY_VALUE = 4;
    /**
     * <code>INVALID_STATE = 5;</code>
     */
    public static final int INVALID_STATE_VALUE = 5;
    /**
     * <code>BLOCK_NOT_READY = 6;</code>
     */
    public static final int BLOCK_NOT_READY_VALUE = 6;
    /**
     * <code>NOT_ACTIVE_ENGINE = 7;</code>
     */
    public static final int NOT_ACTIVE_ENGINE_VALUE = 7;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Status valueOf(int value) {
      return forNumber(value);
    }

    public static Status forNumber(int value) {
      switch (value) {
        case 0: return STATUS_UNSET;
        case 1: return OK;
        case 2: return BAD_REQUEST;
        case 3: return SERVICE_ERROR;
        case 4: return NOT_READY;
        case 5: return INVALID_STATE;
        case 6: return BLOCK_NOT_READY;
        case 7: return NOT_ACTIVE_ENGINE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse.getDescriptor().getEnumTypes().get(0);
    }

    private static final Status[] VALUES = values();

    public static Status valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Status(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ConsensusFinalizeBlockResponse.Status)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.ConsensusFinalizeBlockResponse.Status status = 1;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.ConsensusFinalizeBlockResponse.Status status = 1;</code>
   */
  public sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse.Status getStatus() {
    @SuppressWarnings("deprecation")
    sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse.Status result = sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse.Status.valueOf(status_);
    return result == null ? sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse.Status.UNRECOGNIZED : result;
  }

  public static final int BLOCK_ID_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString blockId_;
  /**
   * <pre>
   * The block id of the newly created block
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
    if (status_ != sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse.Status.STATUS_UNSET.getNumber()) {
      output.writeEnum(1, status_);
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
    if (status_ != sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse.Status.STATUS_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
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
    if (!(obj instanceof sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse)) {
      return super.equals(obj);
    }
    sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse other = (sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse) obj;

    boolean result = true;
    result = result && status_ == other.status_;
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (37 * hash) + BLOCK_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBlockId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse parseFrom(
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
  public static Builder newBuilder(sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse prototype) {
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
   * Protobuf type {@code ConsensusFinalizeBlockResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ConsensusFinalizeBlockResponse)
      sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sawtooth.sdk.protobuf.Consensus.internal_static_ConsensusFinalizeBlockResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sawtooth.sdk.protobuf.Consensus.internal_static_ConsensusFinalizeBlockResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse.class, sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse.Builder.class);
    }

    // Construct using sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse.newBuilder()
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
      status_ = 0;

      blockId_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sawtooth.sdk.protobuf.Consensus.internal_static_ConsensusFinalizeBlockResponse_descriptor;
    }

    @java.lang.Override
    public sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse getDefaultInstanceForType() {
      return sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse.getDefaultInstance();
    }

    @java.lang.Override
    public sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse build() {
      sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse buildPartial() {
      sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse result = new sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse(this);
      result.status_ = status_;
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
      if (other instanceof sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse) {
        return mergeFrom((sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse other) {
      if (other == sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
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
      sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int status_ = 0;
    /**
     * <code>.ConsensusFinalizeBlockResponse.Status status = 1;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.ConsensusFinalizeBlockResponse.Status status = 1;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.ConsensusFinalizeBlockResponse.Status status = 1;</code>
     */
    public sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse.Status getStatus() {
      @SuppressWarnings("deprecation")
      sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse.Status result = sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse.Status.valueOf(status_);
      return result == null ? sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.ConsensusFinalizeBlockResponse.Status status = 1;</code>
     */
    public Builder setStatus(sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.ConsensusFinalizeBlockResponse.Status status = 1;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString blockId_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * The block id of the newly created block
     * </pre>
     *
     * <code>bytes block_id = 2;</code>
     */
    public com.google.protobuf.ByteString getBlockId() {
      return blockId_;
    }
    /**
     * <pre>
     * The block id of the newly created block
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
     * The block id of the newly created block
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


    // @@protoc_insertion_point(builder_scope:ConsensusFinalizeBlockResponse)
  }

  // @@protoc_insertion_point(class_scope:ConsensusFinalizeBlockResponse)
  private static final sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse();
  }

  public static sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConsensusFinalizeBlockResponse>
      PARSER = new com.google.protobuf.AbstractParser<ConsensusFinalizeBlockResponse>() {
    @java.lang.Override
    public ConsensusFinalizeBlockResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConsensusFinalizeBlockResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConsensusFinalizeBlockResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConsensusFinalizeBlockResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public sawtooth.sdk.protobuf.ConsensusFinalizeBlockResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

