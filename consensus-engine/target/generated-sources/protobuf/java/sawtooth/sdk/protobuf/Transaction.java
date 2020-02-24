// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transaction.proto

package sawtooth.sdk.protobuf;

/**
 * Protobuf type {@code Transaction}
 */
public  final class Transaction extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Transaction)
    TransactionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Transaction.newBuilder() to construct.
  private Transaction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Transaction() {
    header_ = com.google.protobuf.ByteString.EMPTY;
    headerSignature_ = "";
    payload_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Transaction(
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

            payload_ = input.readBytes();
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
    return sawtooth.sdk.protobuf.TransactionOuterClass.internal_static_Transaction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sawtooth.sdk.protobuf.TransactionOuterClass.internal_static_Transaction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sawtooth.sdk.protobuf.Transaction.class, sawtooth.sdk.protobuf.Transaction.Builder.class);
  }

  public static final int HEADER_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString header_;
  /**
   * <pre>
   * The serialized version of the TransactionHeader
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

  public static final int PAYLOAD_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString payload_;
  /**
   * <pre>
   * The payload is the encoded family specific information of the
   * transaction. Example cbor({'Verb': verb, 'Name': name,'Value': value})
   * </pre>
   *
   * <code>bytes payload = 3;</code>
   */
  public com.google.protobuf.ByteString getPayload() {
    return payload_;
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
    if (!payload_.isEmpty()) {
      output.writeBytes(3, payload_);
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
    if (!payload_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, payload_);
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
    if (!(obj instanceof sawtooth.sdk.protobuf.Transaction)) {
      return super.equals(obj);
    }
    sawtooth.sdk.protobuf.Transaction other = (sawtooth.sdk.protobuf.Transaction) obj;

    boolean result = true;
    result = result && getHeader()
        .equals(other.getHeader());
    result = result && getHeaderSignature()
        .equals(other.getHeaderSignature());
    result = result && getPayload()
        .equals(other.getPayload());
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
    hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
    hash = (53 * hash) + getPayload().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sawtooth.sdk.protobuf.Transaction parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sawtooth.sdk.protobuf.Transaction parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.Transaction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sawtooth.sdk.protobuf.Transaction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.Transaction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sawtooth.sdk.protobuf.Transaction parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.Transaction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sawtooth.sdk.protobuf.Transaction parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.Transaction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static sawtooth.sdk.protobuf.Transaction parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.Transaction parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sawtooth.sdk.protobuf.Transaction parseFrom(
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
  public static Builder newBuilder(sawtooth.sdk.protobuf.Transaction prototype) {
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
   * Protobuf type {@code Transaction}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Transaction)
      sawtooth.sdk.protobuf.TransactionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sawtooth.sdk.protobuf.TransactionOuterClass.internal_static_Transaction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sawtooth.sdk.protobuf.TransactionOuterClass.internal_static_Transaction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sawtooth.sdk.protobuf.Transaction.class, sawtooth.sdk.protobuf.Transaction.Builder.class);
    }

    // Construct using sawtooth.sdk.protobuf.Transaction.newBuilder()
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
      header_ = com.google.protobuf.ByteString.EMPTY;

      headerSignature_ = "";

      payload_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sawtooth.sdk.protobuf.TransactionOuterClass.internal_static_Transaction_descriptor;
    }

    @java.lang.Override
    public sawtooth.sdk.protobuf.Transaction getDefaultInstanceForType() {
      return sawtooth.sdk.protobuf.Transaction.getDefaultInstance();
    }

    @java.lang.Override
    public sawtooth.sdk.protobuf.Transaction build() {
      sawtooth.sdk.protobuf.Transaction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public sawtooth.sdk.protobuf.Transaction buildPartial() {
      sawtooth.sdk.protobuf.Transaction result = new sawtooth.sdk.protobuf.Transaction(this);
      result.header_ = header_;
      result.headerSignature_ = headerSignature_;
      result.payload_ = payload_;
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
      if (other instanceof sawtooth.sdk.protobuf.Transaction) {
        return mergeFrom((sawtooth.sdk.protobuf.Transaction)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sawtooth.sdk.protobuf.Transaction other) {
      if (other == sawtooth.sdk.protobuf.Transaction.getDefaultInstance()) return this;
      if (other.getHeader() != com.google.protobuf.ByteString.EMPTY) {
        setHeader(other.getHeader());
      }
      if (!other.getHeaderSignature().isEmpty()) {
        headerSignature_ = other.headerSignature_;
        onChanged();
      }
      if (other.getPayload() != com.google.protobuf.ByteString.EMPTY) {
        setPayload(other.getPayload());
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
      sawtooth.sdk.protobuf.Transaction parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (sawtooth.sdk.protobuf.Transaction) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString header_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * The serialized version of the TransactionHeader
     * </pre>
     *
     * <code>bytes header = 1;</code>
     */
    public com.google.protobuf.ByteString getHeader() {
      return header_;
    }
    /**
     * <pre>
     * The serialized version of the TransactionHeader
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
     * The serialized version of the TransactionHeader
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

    private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * The payload is the encoded family specific information of the
     * transaction. Example cbor({'Verb': verb, 'Name': name,'Value': value})
     * </pre>
     *
     * <code>bytes payload = 3;</code>
     */
    public com.google.protobuf.ByteString getPayload() {
      return payload_;
    }
    /**
     * <pre>
     * The payload is the encoded family specific information of the
     * transaction. Example cbor({'Verb': verb, 'Name': name,'Value': value})
     * </pre>
     *
     * <code>bytes payload = 3;</code>
     */
    public Builder setPayload(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      payload_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The payload is the encoded family specific information of the
     * transaction. Example cbor({'Verb': verb, 'Name': name,'Value': value})
     * </pre>
     *
     * <code>bytes payload = 3;</code>
     */
    public Builder clearPayload() {
      
      payload_ = getDefaultInstance().getPayload();
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


    // @@protoc_insertion_point(builder_scope:Transaction)
  }

  // @@protoc_insertion_point(class_scope:Transaction)
  private static final sawtooth.sdk.protobuf.Transaction DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sawtooth.sdk.protobuf.Transaction();
  }

  public static sawtooth.sdk.protobuf.Transaction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Transaction>
      PARSER = new com.google.protobuf.AbstractParser<Transaction>() {
    @java.lang.Override
    public Transaction parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Transaction(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Transaction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Transaction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public sawtooth.sdk.protobuf.Transaction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
