// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: consensus.proto

package sawtooth.sdk.protobuf;

/**
 * Protobuf type {@code ConsensusStateGetResponse}
 */
public  final class ConsensusStateGetResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ConsensusStateGetResponse)
    ConsensusStateGetResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConsensusStateGetResponse.newBuilder() to construct.
  private ConsensusStateGetResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConsensusStateGetResponse() {
    status_ = 0;
    entries_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConsensusStateGetResponse(
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
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              entries_ = new java.util.ArrayList<sawtooth.sdk.protobuf.ConsensusStateEntry>();
              mutable_bitField0_ |= 0x00000002;
            }
            entries_.add(
                input.readMessage(sawtooth.sdk.protobuf.ConsensusStateEntry.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        entries_ = java.util.Collections.unmodifiableList(entries_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return sawtooth.sdk.protobuf.Consensus.internal_static_ConsensusStateGetResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sawtooth.sdk.protobuf.Consensus.internal_static_ConsensusStateGetResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sawtooth.sdk.protobuf.ConsensusStateGetResponse.class, sawtooth.sdk.protobuf.ConsensusStateGetResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code ConsensusStateGetResponse.Status}
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
     * <code>UNKNOWN_BLOCK = 5;</code>
     */
    UNKNOWN_BLOCK(5),
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
     * <code>UNKNOWN_BLOCK = 5;</code>
     */
    public static final int UNKNOWN_BLOCK_VALUE = 5;


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
        case 5: return UNKNOWN_BLOCK;
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
      return sawtooth.sdk.protobuf.ConsensusStateGetResponse.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:ConsensusStateGetResponse.Status)
  }

  private int bitField0_;
  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.ConsensusStateGetResponse.Status status = 1;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.ConsensusStateGetResponse.Status status = 1;</code>
   */
  public sawtooth.sdk.protobuf.ConsensusStateGetResponse.Status getStatus() {
    @SuppressWarnings("deprecation")
    sawtooth.sdk.protobuf.ConsensusStateGetResponse.Status result = sawtooth.sdk.protobuf.ConsensusStateGetResponse.Status.valueOf(status_);
    return result == null ? sawtooth.sdk.protobuf.ConsensusStateGetResponse.Status.UNRECOGNIZED : result;
  }

  public static final int ENTRIES_FIELD_NUMBER = 2;
  private java.util.List<sawtooth.sdk.protobuf.ConsensusStateEntry> entries_;
  /**
   * <code>repeated .ConsensusStateEntry entries = 2;</code>
   */
  public java.util.List<sawtooth.sdk.protobuf.ConsensusStateEntry> getEntriesList() {
    return entries_;
  }
  /**
   * <code>repeated .ConsensusStateEntry entries = 2;</code>
   */
  public java.util.List<? extends sawtooth.sdk.protobuf.ConsensusStateEntryOrBuilder> 
      getEntriesOrBuilderList() {
    return entries_;
  }
  /**
   * <code>repeated .ConsensusStateEntry entries = 2;</code>
   */
  public int getEntriesCount() {
    return entries_.size();
  }
  /**
   * <code>repeated .ConsensusStateEntry entries = 2;</code>
   */
  public sawtooth.sdk.protobuf.ConsensusStateEntry getEntries(int index) {
    return entries_.get(index);
  }
  /**
   * <code>repeated .ConsensusStateEntry entries = 2;</code>
   */
  public sawtooth.sdk.protobuf.ConsensusStateEntryOrBuilder getEntriesOrBuilder(
      int index) {
    return entries_.get(index);
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
    if (status_ != sawtooth.sdk.protobuf.ConsensusStateGetResponse.Status.STATUS_UNSET.getNumber()) {
      output.writeEnum(1, status_);
    }
    for (int i = 0; i < entries_.size(); i++) {
      output.writeMessage(2, entries_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != sawtooth.sdk.protobuf.ConsensusStateGetResponse.Status.STATUS_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    for (int i = 0; i < entries_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, entries_.get(i));
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
    if (!(obj instanceof sawtooth.sdk.protobuf.ConsensusStateGetResponse)) {
      return super.equals(obj);
    }
    sawtooth.sdk.protobuf.ConsensusStateGetResponse other = (sawtooth.sdk.protobuf.ConsensusStateGetResponse) obj;

    boolean result = true;
    result = result && status_ == other.status_;
    result = result && getEntriesList()
        .equals(other.getEntriesList());
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
    if (getEntriesCount() > 0) {
      hash = (37 * hash) + ENTRIES_FIELD_NUMBER;
      hash = (53 * hash) + getEntriesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sawtooth.sdk.protobuf.ConsensusStateGetResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sawtooth.sdk.protobuf.ConsensusStateGetResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.ConsensusStateGetResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sawtooth.sdk.protobuf.ConsensusStateGetResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.ConsensusStateGetResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sawtooth.sdk.protobuf.ConsensusStateGetResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.ConsensusStateGetResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sawtooth.sdk.protobuf.ConsensusStateGetResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.ConsensusStateGetResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static sawtooth.sdk.protobuf.ConsensusStateGetResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.ConsensusStateGetResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sawtooth.sdk.protobuf.ConsensusStateGetResponse parseFrom(
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
  public static Builder newBuilder(sawtooth.sdk.protobuf.ConsensusStateGetResponse prototype) {
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
   * Protobuf type {@code ConsensusStateGetResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ConsensusStateGetResponse)
      sawtooth.sdk.protobuf.ConsensusStateGetResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sawtooth.sdk.protobuf.Consensus.internal_static_ConsensusStateGetResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sawtooth.sdk.protobuf.Consensus.internal_static_ConsensusStateGetResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sawtooth.sdk.protobuf.ConsensusStateGetResponse.class, sawtooth.sdk.protobuf.ConsensusStateGetResponse.Builder.class);
    }

    // Construct using sawtooth.sdk.protobuf.ConsensusStateGetResponse.newBuilder()
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
        getEntriesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      status_ = 0;

      if (entriesBuilder_ == null) {
        entries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        entriesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sawtooth.sdk.protobuf.Consensus.internal_static_ConsensusStateGetResponse_descriptor;
    }

    @java.lang.Override
    public sawtooth.sdk.protobuf.ConsensusStateGetResponse getDefaultInstanceForType() {
      return sawtooth.sdk.protobuf.ConsensusStateGetResponse.getDefaultInstance();
    }

    @java.lang.Override
    public sawtooth.sdk.protobuf.ConsensusStateGetResponse build() {
      sawtooth.sdk.protobuf.ConsensusStateGetResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public sawtooth.sdk.protobuf.ConsensusStateGetResponse buildPartial() {
      sawtooth.sdk.protobuf.ConsensusStateGetResponse result = new sawtooth.sdk.protobuf.ConsensusStateGetResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.status_ = status_;
      if (entriesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          entries_ = java.util.Collections.unmodifiableList(entries_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.entries_ = entries_;
      } else {
        result.entries_ = entriesBuilder_.build();
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
      if (other instanceof sawtooth.sdk.protobuf.ConsensusStateGetResponse) {
        return mergeFrom((sawtooth.sdk.protobuf.ConsensusStateGetResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sawtooth.sdk.protobuf.ConsensusStateGetResponse other) {
      if (other == sawtooth.sdk.protobuf.ConsensusStateGetResponse.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (entriesBuilder_ == null) {
        if (!other.entries_.isEmpty()) {
          if (entries_.isEmpty()) {
            entries_ = other.entries_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureEntriesIsMutable();
            entries_.addAll(other.entries_);
          }
          onChanged();
        }
      } else {
        if (!other.entries_.isEmpty()) {
          if (entriesBuilder_.isEmpty()) {
            entriesBuilder_.dispose();
            entriesBuilder_ = null;
            entries_ = other.entries_;
            bitField0_ = (bitField0_ & ~0x00000002);
            entriesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEntriesFieldBuilder() : null;
          } else {
            entriesBuilder_.addAllMessages(other.entries_);
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
      sawtooth.sdk.protobuf.ConsensusStateGetResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (sawtooth.sdk.protobuf.ConsensusStateGetResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int status_ = 0;
    /**
     * <code>.ConsensusStateGetResponse.Status status = 1;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.ConsensusStateGetResponse.Status status = 1;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.ConsensusStateGetResponse.Status status = 1;</code>
     */
    public sawtooth.sdk.protobuf.ConsensusStateGetResponse.Status getStatus() {
      @SuppressWarnings("deprecation")
      sawtooth.sdk.protobuf.ConsensusStateGetResponse.Status result = sawtooth.sdk.protobuf.ConsensusStateGetResponse.Status.valueOf(status_);
      return result == null ? sawtooth.sdk.protobuf.ConsensusStateGetResponse.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.ConsensusStateGetResponse.Status status = 1;</code>
     */
    public Builder setStatus(sawtooth.sdk.protobuf.ConsensusStateGetResponse.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.ConsensusStateGetResponse.Status status = 1;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<sawtooth.sdk.protobuf.ConsensusStateEntry> entries_ =
      java.util.Collections.emptyList();
    private void ensureEntriesIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        entries_ = new java.util.ArrayList<sawtooth.sdk.protobuf.ConsensusStateEntry>(entries_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        sawtooth.sdk.protobuf.ConsensusStateEntry, sawtooth.sdk.protobuf.ConsensusStateEntry.Builder, sawtooth.sdk.protobuf.ConsensusStateEntryOrBuilder> entriesBuilder_;

    /**
     * <code>repeated .ConsensusStateEntry entries = 2;</code>
     */
    public java.util.List<sawtooth.sdk.protobuf.ConsensusStateEntry> getEntriesList() {
      if (entriesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(entries_);
      } else {
        return entriesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ConsensusStateEntry entries = 2;</code>
     */
    public int getEntriesCount() {
      if (entriesBuilder_ == null) {
        return entries_.size();
      } else {
        return entriesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ConsensusStateEntry entries = 2;</code>
     */
    public sawtooth.sdk.protobuf.ConsensusStateEntry getEntries(int index) {
      if (entriesBuilder_ == null) {
        return entries_.get(index);
      } else {
        return entriesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ConsensusStateEntry entries = 2;</code>
     */
    public Builder setEntries(
        int index, sawtooth.sdk.protobuf.ConsensusStateEntry value) {
      if (entriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntriesIsMutable();
        entries_.set(index, value);
        onChanged();
      } else {
        entriesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ConsensusStateEntry entries = 2;</code>
     */
    public Builder setEntries(
        int index, sawtooth.sdk.protobuf.ConsensusStateEntry.Builder builderForValue) {
      if (entriesBuilder_ == null) {
        ensureEntriesIsMutable();
        entries_.set(index, builderForValue.build());
        onChanged();
      } else {
        entriesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ConsensusStateEntry entries = 2;</code>
     */
    public Builder addEntries(sawtooth.sdk.protobuf.ConsensusStateEntry value) {
      if (entriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntriesIsMutable();
        entries_.add(value);
        onChanged();
      } else {
        entriesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ConsensusStateEntry entries = 2;</code>
     */
    public Builder addEntries(
        int index, sawtooth.sdk.protobuf.ConsensusStateEntry value) {
      if (entriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntriesIsMutable();
        entries_.add(index, value);
        onChanged();
      } else {
        entriesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ConsensusStateEntry entries = 2;</code>
     */
    public Builder addEntries(
        sawtooth.sdk.protobuf.ConsensusStateEntry.Builder builderForValue) {
      if (entriesBuilder_ == null) {
        ensureEntriesIsMutable();
        entries_.add(builderForValue.build());
        onChanged();
      } else {
        entriesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ConsensusStateEntry entries = 2;</code>
     */
    public Builder addEntries(
        int index, sawtooth.sdk.protobuf.ConsensusStateEntry.Builder builderForValue) {
      if (entriesBuilder_ == null) {
        ensureEntriesIsMutable();
        entries_.add(index, builderForValue.build());
        onChanged();
      } else {
        entriesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ConsensusStateEntry entries = 2;</code>
     */
    public Builder addAllEntries(
        java.lang.Iterable<? extends sawtooth.sdk.protobuf.ConsensusStateEntry> values) {
      if (entriesBuilder_ == null) {
        ensureEntriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, entries_);
        onChanged();
      } else {
        entriesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ConsensusStateEntry entries = 2;</code>
     */
    public Builder clearEntries() {
      if (entriesBuilder_ == null) {
        entries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        entriesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ConsensusStateEntry entries = 2;</code>
     */
    public Builder removeEntries(int index) {
      if (entriesBuilder_ == null) {
        ensureEntriesIsMutable();
        entries_.remove(index);
        onChanged();
      } else {
        entriesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ConsensusStateEntry entries = 2;</code>
     */
    public sawtooth.sdk.protobuf.ConsensusStateEntry.Builder getEntriesBuilder(
        int index) {
      return getEntriesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ConsensusStateEntry entries = 2;</code>
     */
    public sawtooth.sdk.protobuf.ConsensusStateEntryOrBuilder getEntriesOrBuilder(
        int index) {
      if (entriesBuilder_ == null) {
        return entries_.get(index);  } else {
        return entriesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ConsensusStateEntry entries = 2;</code>
     */
    public java.util.List<? extends sawtooth.sdk.protobuf.ConsensusStateEntryOrBuilder> 
         getEntriesOrBuilderList() {
      if (entriesBuilder_ != null) {
        return entriesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(entries_);
      }
    }
    /**
     * <code>repeated .ConsensusStateEntry entries = 2;</code>
     */
    public sawtooth.sdk.protobuf.ConsensusStateEntry.Builder addEntriesBuilder() {
      return getEntriesFieldBuilder().addBuilder(
          sawtooth.sdk.protobuf.ConsensusStateEntry.getDefaultInstance());
    }
    /**
     * <code>repeated .ConsensusStateEntry entries = 2;</code>
     */
    public sawtooth.sdk.protobuf.ConsensusStateEntry.Builder addEntriesBuilder(
        int index) {
      return getEntriesFieldBuilder().addBuilder(
          index, sawtooth.sdk.protobuf.ConsensusStateEntry.getDefaultInstance());
    }
    /**
     * <code>repeated .ConsensusStateEntry entries = 2;</code>
     */
    public java.util.List<sawtooth.sdk.protobuf.ConsensusStateEntry.Builder> 
         getEntriesBuilderList() {
      return getEntriesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        sawtooth.sdk.protobuf.ConsensusStateEntry, sawtooth.sdk.protobuf.ConsensusStateEntry.Builder, sawtooth.sdk.protobuf.ConsensusStateEntryOrBuilder> 
        getEntriesFieldBuilder() {
      if (entriesBuilder_ == null) {
        entriesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            sawtooth.sdk.protobuf.ConsensusStateEntry, sawtooth.sdk.protobuf.ConsensusStateEntry.Builder, sawtooth.sdk.protobuf.ConsensusStateEntryOrBuilder>(
                entries_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        entries_ = null;
      }
      return entriesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ConsensusStateGetResponse)
  }

  // @@protoc_insertion_point(class_scope:ConsensusStateGetResponse)
  private static final sawtooth.sdk.protobuf.ConsensusStateGetResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sawtooth.sdk.protobuf.ConsensusStateGetResponse();
  }

  public static sawtooth.sdk.protobuf.ConsensusStateGetResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConsensusStateGetResponse>
      PARSER = new com.google.protobuf.AbstractParser<ConsensusStateGetResponse>() {
    @java.lang.Override
    public ConsensusStateGetResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConsensusStateGetResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConsensusStateGetResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConsensusStateGetResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public sawtooth.sdk.protobuf.ConsensusStateGetResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
