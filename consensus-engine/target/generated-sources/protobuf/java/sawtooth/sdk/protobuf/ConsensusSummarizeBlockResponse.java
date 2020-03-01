// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: consensus.proto

package sawtooth.sdk.protobuf;

/**
 * Protobuf type {@code ConsensusSummarizeBlockResponse}
 */
public  final class ConsensusSummarizeBlockResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ConsensusSummarizeBlockResponse)
    ConsensusSummarizeBlockResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConsensusSummarizeBlockResponse.newBuilder() to construct.
  private ConsensusSummarizeBlockResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConsensusSummarizeBlockResponse() {
    status_ = 0;
    summary_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConsensusSummarizeBlockResponse(
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

            summary_ = input.readBytes();
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
    return sawtooth.sdk.protobuf.Consensus.internal_static_ConsensusSummarizeBlockResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sawtooth.sdk.protobuf.Consensus.internal_static_ConsensusSummarizeBlockResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse.class, sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code ConsensusSummarizeBlockResponse.Status}
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
      return sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:ConsensusSummarizeBlockResponse.Status)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.ConsensusSummarizeBlockResponse.Status status = 1;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.ConsensusSummarizeBlockResponse.Status status = 1;</code>
   */
  public sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse.Status getStatus() {
    @SuppressWarnings("deprecation")
    sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse.Status result = sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse.Status.valueOf(status_);
    return result == null ? sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse.Status.UNRECOGNIZED : result;
  }

  public static final int SUMMARY_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString summary_;
  /**
   * <pre>
   * A summary of the block contents
   * </pre>
   *
   * <code>bytes summary = 2;</code>
   */
  public com.google.protobuf.ByteString getSummary() {
    return summary_;
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
    if (status_ != sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse.Status.STATUS_UNSET.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (!summary_.isEmpty()) {
      output.writeBytes(2, summary_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse.Status.STATUS_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (!summary_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, summary_);
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
    if (!(obj instanceof sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse)) {
      return super.equals(obj);
    }
    sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse other = (sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse) obj;

    boolean result = true;
    result = result && status_ == other.status_;
    result = result && getSummary()
        .equals(other.getSummary());
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
    hash = (37 * hash) + SUMMARY_FIELD_NUMBER;
    hash = (53 * hash) + getSummary().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse parseFrom(
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
  public static Builder newBuilder(sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse prototype) {
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
   * Protobuf type {@code ConsensusSummarizeBlockResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ConsensusSummarizeBlockResponse)
      sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sawtooth.sdk.protobuf.Consensus.internal_static_ConsensusSummarizeBlockResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sawtooth.sdk.protobuf.Consensus.internal_static_ConsensusSummarizeBlockResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse.class, sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse.Builder.class);
    }

    // Construct using sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse.newBuilder()
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

      summary_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sawtooth.sdk.protobuf.Consensus.internal_static_ConsensusSummarizeBlockResponse_descriptor;
    }

    @java.lang.Override
    public sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse getDefaultInstanceForType() {
      return sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse.getDefaultInstance();
    }

    @java.lang.Override
    public sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse build() {
      sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse buildPartial() {
      sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse result = new sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse(this);
      result.status_ = status_;
      result.summary_ = summary_;
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
      if (other instanceof sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse) {
        return mergeFrom((sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse other) {
      if (other == sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.getSummary() != com.google.protobuf.ByteString.EMPTY) {
        setSummary(other.getSummary());
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
      sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse) e.getUnfinishedMessage();
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
     * <code>.ConsensusSummarizeBlockResponse.Status status = 1;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.ConsensusSummarizeBlockResponse.Status status = 1;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.ConsensusSummarizeBlockResponse.Status status = 1;</code>
     */
    public sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse.Status getStatus() {
      @SuppressWarnings("deprecation")
      sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse.Status result = sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse.Status.valueOf(status_);
      return result == null ? sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.ConsensusSummarizeBlockResponse.Status status = 1;</code>
     */
    public Builder setStatus(sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.ConsensusSummarizeBlockResponse.Status status = 1;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString summary_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * A summary of the block contents
     * </pre>
     *
     * <code>bytes summary = 2;</code>
     */
    public com.google.protobuf.ByteString getSummary() {
      return summary_;
    }
    /**
     * <pre>
     * A summary of the block contents
     * </pre>
     *
     * <code>bytes summary = 2;</code>
     */
    public Builder setSummary(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      summary_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A summary of the block contents
     * </pre>
     *
     * <code>bytes summary = 2;</code>
     */
    public Builder clearSummary() {
      
      summary_ = getDefaultInstance().getSummary();
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


    // @@protoc_insertion_point(builder_scope:ConsensusSummarizeBlockResponse)
  }

  // @@protoc_insertion_point(class_scope:ConsensusSummarizeBlockResponse)
  private static final sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse();
  }

  public static sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConsensusSummarizeBlockResponse>
      PARSER = new com.google.protobuf.AbstractParser<ConsensusSummarizeBlockResponse>() {
    @java.lang.Override
    public ConsensusSummarizeBlockResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConsensusSummarizeBlockResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConsensusSummarizeBlockResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConsensusSummarizeBlockResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public sawtooth.sdk.protobuf.ConsensusSummarizeBlockResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

