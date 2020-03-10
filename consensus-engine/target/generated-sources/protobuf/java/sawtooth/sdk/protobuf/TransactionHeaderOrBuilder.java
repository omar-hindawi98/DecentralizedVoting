// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transaction.proto

package sawtooth.sdk.protobuf;

public interface TransactionHeaderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TransactionHeader)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Public key for the client who added this transaction to a batch
   * </pre>
   *
   * <code>string batcher_public_key = 1;</code>
   */
  java.lang.String getBatcherPublicKey();
  /**
   * <pre>
   * Public key for the client who added this transaction to a batch
   * </pre>
   *
   * <code>string batcher_public_key = 1;</code>
   */
  com.google.protobuf.ByteString
      getBatcherPublicKeyBytes();

  /**
   * <pre>
   * A list of transaction signatures that describe the transactions that
   * must be processed before this transaction can be valid
   * </pre>
   *
   * <code>repeated string dependencies = 2;</code>
   */
  java.util.List<java.lang.String>
      getDependenciesList();
  /**
   * <pre>
   * A list of transaction signatures that describe the transactions that
   * must be processed before this transaction can be valid
   * </pre>
   *
   * <code>repeated string dependencies = 2;</code>
   */
  int getDependenciesCount();
  /**
   * <pre>
   * A list of transaction signatures that describe the transactions that
   * must be processed before this transaction can be valid
   * </pre>
   *
   * <code>repeated string dependencies = 2;</code>
   */
  java.lang.String getDependencies(int index);
  /**
   * <pre>
   * A list of transaction signatures that describe the transactions that
   * must be processed before this transaction can be valid
   * </pre>
   *
   * <code>repeated string dependencies = 2;</code>
   */
  com.google.protobuf.ByteString
      getDependenciesBytes(int index);

  /**
   * <pre>
   * The family name correlates to the transaction processor's family name
   * that this transaction can be processed on, for example 'intkey'
   * </pre>
   *
   * <code>string family_name = 3;</code>
   */
  java.lang.String getFamilyName();
  /**
   * <pre>
   * The family name correlates to the transaction processor's family name
   * that this transaction can be processed on, for example 'intkey'
   * </pre>
   *
   * <code>string family_name = 3;</code>
   */
  com.google.protobuf.ByteString
      getFamilyNameBytes();

  /**
   * <pre>
   * The family version correlates to the transaction processor's family
   * version that this transaction can be processed on, for example "1.0"
   * </pre>
   *
   * <code>string family_version = 4;</code>
   */
  java.lang.String getFamilyVersion();
  /**
   * <pre>
   * The family version correlates to the transaction processor's family
   * version that this transaction can be processed on, for example "1.0"
   * </pre>
   *
   * <code>string family_version = 4;</code>
   */
  com.google.protobuf.ByteString
      getFamilyVersionBytes();

  /**
   * <pre>
   * A list of addresses that are given to the context manager and control
   * what addresses the transaction processor is allowed to read from.
   * </pre>
   *
   * <code>repeated string inputs = 5;</code>
   */
  java.util.List<java.lang.String>
      getInputsList();
  /**
   * <pre>
   * A list of addresses that are given to the context manager and control
   * what addresses the transaction processor is allowed to read from.
   * </pre>
   *
   * <code>repeated string inputs = 5;</code>
   */
  int getInputsCount();
  /**
   * <pre>
   * A list of addresses that are given to the context manager and control
   * what addresses the transaction processor is allowed to read from.
   * </pre>
   *
   * <code>repeated string inputs = 5;</code>
   */
  java.lang.String getInputs(int index);
  /**
   * <pre>
   * A list of addresses that are given to the context manager and control
   * what addresses the transaction processor is allowed to read from.
   * </pre>
   *
   * <code>repeated string inputs = 5;</code>
   */
  com.google.protobuf.ByteString
      getInputsBytes(int index);

  /**
   * <pre>
   * A random string that provides uniqueness for transactions with
   * otherwise identical fields.
   * </pre>
   *
   * <code>string nonce = 6;</code>
   */
  java.lang.String getNonce();
  /**
   * <pre>
   * A random string that provides uniqueness for transactions with
   * otherwise identical fields.
   * </pre>
   *
   * <code>string nonce = 6;</code>
   */
  com.google.protobuf.ByteString
      getNonceBytes();

  /**
   * <pre>
   * A list of addresses that are given to the context manager and control
   * what addresses the transaction processor is allowed to write to.
   * </pre>
   *
   * <code>repeated string outputs = 7;</code>
   */
  java.util.List<java.lang.String>
      getOutputsList();
  /**
   * <pre>
   * A list of addresses that are given to the context manager and control
   * what addresses the transaction processor is allowed to write to.
   * </pre>
   *
   * <code>repeated string outputs = 7;</code>
   */
  int getOutputsCount();
  /**
   * <pre>
   * A list of addresses that are given to the context manager and control
   * what addresses the transaction processor is allowed to write to.
   * </pre>
   *
   * <code>repeated string outputs = 7;</code>
   */
  java.lang.String getOutputs(int index);
  /**
   * <pre>
   * A list of addresses that are given to the context manager and control
   * what addresses the transaction processor is allowed to write to.
   * </pre>
   *
   * <code>repeated string outputs = 7;</code>
   */
  com.google.protobuf.ByteString
      getOutputsBytes(int index);

  /**
   * <pre>
   *The sha512 hash of the encoded payload
   * </pre>
   *
   * <code>string payload_sha512 = 9;</code>
   */
  java.lang.String getPayloadSha512();
  /**
   * <pre>
   *The sha512 hash of the encoded payload
   * </pre>
   *
   * <code>string payload_sha512 = 9;</code>
   */
  com.google.protobuf.ByteString
      getPayloadSha512Bytes();

  /**
   * <pre>
   * Public key for the client that signed the TransactionHeader
   * </pre>
   *
   * <code>string signer_public_key = 10;</code>
   */
  java.lang.String getSignerPublicKey();
  /**
   * <pre>
   * Public key for the client that signed the TransactionHeader
   * </pre>
   *
   * <code>string signer_public_key = 10;</code>
   */
  com.google.protobuf.ByteString
      getSignerPublicKeyBytes();
}