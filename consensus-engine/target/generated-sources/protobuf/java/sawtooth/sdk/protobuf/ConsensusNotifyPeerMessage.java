// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: consensus.proto

package sawtooth.sdk.protobuf;

/**
 * <pre>
 * A new message was received from a peer
 * </pre>
 *
 * Protobuf type {@code ConsensusNotifyPeerMessage}
 */
public  final class ConsensusNotifyPeerMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ConsensusNotifyPeerMessage)
    ConsensusNotifyPeerMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConsensusNotifyPeerMessage.newBuilder() to construct.
  private ConsensusNotifyPeerMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConsensusNotifyPeerMessage() {
    senderId_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConsensusNotifyPeerMessage(
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
            sawtooth.sdk.protobuf.ConsensusPeerMessage.Builder subBuilder = null;
            if (message_ != null) {
              subBuilder = message_.toBuilder();
            }
            message_ = input.readMessage(sawtooth.sdk.protobuf.ConsensusPeerMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(message_);
              message_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {

            senderId_ = input.readBytes();
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
    return sawtooth.sdk.protobuf.Consensus.internal_static_ConsensusNotifyPeerMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sawtooth.sdk.protobuf.Consensus.internal_static_ConsensusNotifyPeerMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage.class, sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage.Builder.class);
  }

  public static final int MESSAGE_FIELD_NUMBER = 1;
  private sawtooth.sdk.protobuf.ConsensusPeerMessage message_;
  /**
   * <pre>
   * The message sent
   * </pre>
   *
   * <code>.ConsensusPeerMessage message = 1;</code>
   */
  public boolean hasMessage() {
    return message_ != null;
  }
  /**
   * <pre>
   * The message sent
   * </pre>
   *
   * <code>.ConsensusPeerMessage message = 1;</code>
   */
  public sawtooth.sdk.protobuf.ConsensusPeerMessage getMessage() {
    return message_ == null ? sawtooth.sdk.protobuf.ConsensusPeerMessage.getDefaultInstance() : message_;
  }
  /**
   * <pre>
   * The message sent
   * </pre>
   *
   * <code>.ConsensusPeerMessage message = 1;</code>
   */
  public sawtooth.sdk.protobuf.ConsensusPeerMessageOrBuilder getMessageOrBuilder() {
    return getMessage();
  }

  public static final int SENDER_ID_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString senderId_;
  /**
   * <pre>
   * The node that sent the message, not necessarily the node that created it
   * </pre>
   *
   * <code>bytes sender_id = 2;</code>
   */
  public com.google.protobuf.ByteString getSenderId() {
    return senderId_;
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
    if (message_ != null) {
      output.writeMessage(1, getMessage());
    }
    if (!senderId_.isEmpty()) {
      output.writeBytes(2, senderId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (message_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMessage());
    }
    if (!senderId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, senderId_);
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
    if (!(obj instanceof sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage)) {
      return super.equals(obj);
    }
    sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage other = (sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage) obj;

    boolean result = true;
    result = result && (hasMessage() == other.hasMessage());
    if (hasMessage()) {
      result = result && getMessage()
          .equals(other.getMessage());
    }
    result = result && getSenderId()
        .equals(other.getSenderId());
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
    if (hasMessage()) {
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
    }
    hash = (37 * hash) + SENDER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSenderId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage parseFrom(
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
  public static Builder newBuilder(sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage prototype) {
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
   * A new message was received from a peer
   * </pre>
   *
   * Protobuf type {@code ConsensusNotifyPeerMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ConsensusNotifyPeerMessage)
      sawtooth.sdk.protobuf.ConsensusNotifyPeerMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sawtooth.sdk.protobuf.Consensus.internal_static_ConsensusNotifyPeerMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sawtooth.sdk.protobuf.Consensus.internal_static_ConsensusNotifyPeerMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage.class, sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage.Builder.class);
    }

    // Construct using sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage.newBuilder()
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
      if (messageBuilder_ == null) {
        message_ = null;
      } else {
        message_ = null;
        messageBuilder_ = null;
      }
      senderId_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sawtooth.sdk.protobuf.Consensus.internal_static_ConsensusNotifyPeerMessage_descriptor;
    }

    @java.lang.Override
    public sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage getDefaultInstanceForType() {
      return sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage.getDefaultInstance();
    }

    @java.lang.Override
    public sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage build() {
      sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage buildPartial() {
      sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage result = new sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage(this);
      if (messageBuilder_ == null) {
        result.message_ = message_;
      } else {
        result.message_ = messageBuilder_.build();
      }
      result.senderId_ = senderId_;
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
      if (other instanceof sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage) {
        return mergeFrom((sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage other) {
      if (other == sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage.getDefaultInstance()) return this;
      if (other.hasMessage()) {
        mergeMessage(other.getMessage());
      }
      if (other.getSenderId() != com.google.protobuf.ByteString.EMPTY) {
        setSenderId(other.getSenderId());
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
      sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private sawtooth.sdk.protobuf.ConsensusPeerMessage message_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        sawtooth.sdk.protobuf.ConsensusPeerMessage, sawtooth.sdk.protobuf.ConsensusPeerMessage.Builder, sawtooth.sdk.protobuf.ConsensusPeerMessageOrBuilder> messageBuilder_;
    /**
     * <pre>
     * The message sent
     * </pre>
     *
     * <code>.ConsensusPeerMessage message = 1;</code>
     */
    public boolean hasMessage() {
      return messageBuilder_ != null || message_ != null;
    }
    /**
     * <pre>
     * The message sent
     * </pre>
     *
     * <code>.ConsensusPeerMessage message = 1;</code>
     */
    public sawtooth.sdk.protobuf.ConsensusPeerMessage getMessage() {
      if (messageBuilder_ == null) {
        return message_ == null ? sawtooth.sdk.protobuf.ConsensusPeerMessage.getDefaultInstance() : message_;
      } else {
        return messageBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The message sent
     * </pre>
     *
     * <code>.ConsensusPeerMessage message = 1;</code>
     */
    public Builder setMessage(sawtooth.sdk.protobuf.ConsensusPeerMessage value) {
      if (messageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        message_ = value;
        onChanged();
      } else {
        messageBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The message sent
     * </pre>
     *
     * <code>.ConsensusPeerMessage message = 1;</code>
     */
    public Builder setMessage(
        sawtooth.sdk.protobuf.ConsensusPeerMessage.Builder builderForValue) {
      if (messageBuilder_ == null) {
        message_ = builderForValue.build();
        onChanged();
      } else {
        messageBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The message sent
     * </pre>
     *
     * <code>.ConsensusPeerMessage message = 1;</code>
     */
    public Builder mergeMessage(sawtooth.sdk.protobuf.ConsensusPeerMessage value) {
      if (messageBuilder_ == null) {
        if (message_ != null) {
          message_ =
            sawtooth.sdk.protobuf.ConsensusPeerMessage.newBuilder(message_).mergeFrom(value).buildPartial();
        } else {
          message_ = value;
        }
        onChanged();
      } else {
        messageBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The message sent
     * </pre>
     *
     * <code>.ConsensusPeerMessage message = 1;</code>
     */
    public Builder clearMessage() {
      if (messageBuilder_ == null) {
        message_ = null;
        onChanged();
      } else {
        message_ = null;
        messageBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The message sent
     * </pre>
     *
     * <code>.ConsensusPeerMessage message = 1;</code>
     */
    public sawtooth.sdk.protobuf.ConsensusPeerMessage.Builder getMessageBuilder() {
      
      onChanged();
      return getMessageFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The message sent
     * </pre>
     *
     * <code>.ConsensusPeerMessage message = 1;</code>
     */
    public sawtooth.sdk.protobuf.ConsensusPeerMessageOrBuilder getMessageOrBuilder() {
      if (messageBuilder_ != null) {
        return messageBuilder_.getMessageOrBuilder();
      } else {
        return message_ == null ?
            sawtooth.sdk.protobuf.ConsensusPeerMessage.getDefaultInstance() : message_;
      }
    }
    /**
     * <pre>
     * The message sent
     * </pre>
     *
     * <code>.ConsensusPeerMessage message = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        sawtooth.sdk.protobuf.ConsensusPeerMessage, sawtooth.sdk.protobuf.ConsensusPeerMessage.Builder, sawtooth.sdk.protobuf.ConsensusPeerMessageOrBuilder> 
        getMessageFieldBuilder() {
      if (messageBuilder_ == null) {
        messageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            sawtooth.sdk.protobuf.ConsensusPeerMessage, sawtooth.sdk.protobuf.ConsensusPeerMessage.Builder, sawtooth.sdk.protobuf.ConsensusPeerMessageOrBuilder>(
                getMessage(),
                getParentForChildren(),
                isClean());
        message_ = null;
      }
      return messageBuilder_;
    }

    private com.google.protobuf.ByteString senderId_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * The node that sent the message, not necessarily the node that created it
     * </pre>
     *
     * <code>bytes sender_id = 2;</code>
     */
    public com.google.protobuf.ByteString getSenderId() {
      return senderId_;
    }
    /**
     * <pre>
     * The node that sent the message, not necessarily the node that created it
     * </pre>
     *
     * <code>bytes sender_id = 2;</code>
     */
    public Builder setSenderId(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      senderId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The node that sent the message, not necessarily the node that created it
     * </pre>
     *
     * <code>bytes sender_id = 2;</code>
     */
    public Builder clearSenderId() {
      
      senderId_ = getDefaultInstance().getSenderId();
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


    // @@protoc_insertion_point(builder_scope:ConsensusNotifyPeerMessage)
  }

  // @@protoc_insertion_point(class_scope:ConsensusNotifyPeerMessage)
  private static final sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage();
  }

  public static sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConsensusNotifyPeerMessage>
      PARSER = new com.google.protobuf.AbstractParser<ConsensusNotifyPeerMessage>() {
    @java.lang.Override
    public ConsensusNotifyPeerMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConsensusNotifyPeerMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConsensusNotifyPeerMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConsensusNotifyPeerMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public sawtooth.sdk.protobuf.ConsensusNotifyPeerMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

