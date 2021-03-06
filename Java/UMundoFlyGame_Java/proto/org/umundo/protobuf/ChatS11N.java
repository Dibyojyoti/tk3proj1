// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChatS11N.proto

package org.umundo.protobuf;

public final class ChatS11N {
  private ChatS11N() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ChatMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChatMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string username = 8;</code>
     */
    boolean hasUsername();
    /**
     * <code>optional string username = 8;</code>
     */
    java.lang.String getUsername();
    /**
     * <code>optional string username = 8;</code>
     */
    com.google.protobuf.ByteString
        getUsernameBytes();

    /**
     * <code>optional string message = 1;</code>
     */
    boolean hasMessage();
    /**
     * <code>optional string message = 1;</code>
     */
    java.lang.String getMessage();
    /**
     * <code>optional string message = 1;</code>
     */
    com.google.protobuf.ByteString
        getMessageBytes();

    /**
     * <code>optional string flycordx = 2;</code>
     */
    boolean hasFlycordx();
    /**
     * <code>optional string flycordx = 2;</code>
     */
    java.lang.String getFlycordx();
    /**
     * <code>optional string flycordx = 2;</code>
     */
    com.google.protobuf.ByteString
        getFlycordxBytes();

    /**
     * <code>optional string flycordy = 3;</code>
     */
    boolean hasFlycordy();
    /**
     * <code>optional string flycordy = 3;</code>
     */
    java.lang.String getFlycordy();
    /**
     * <code>optional string flycordy = 3;</code>
     */
    com.google.protobuf.ByteString
        getFlycordyBytes();

    /**
     * <code>optional int32 score = 4;</code>
     */
    boolean hasScore();
    /**
     * <code>optional int32 score = 4;</code>
     */
    int getScore();

    /**
     * <code>optional int32 x = 5;</code>
     */
    boolean hasX();
    /**
     * <code>optional int32 x = 5;</code>
     */
    int getX();

    /**
     * <code>optional int32 y = 6;</code>
     */
    boolean hasY();
    /**
     * <code>optional int32 y = 6;</code>
     */
    int getY();

    /**
     * <code>optional int32 type = 7;</code>
     */
    boolean hasType();
    /**
     * <code>optional int32 type = 7;</code>
     */
    int getType();
  }
  /**
   * Protobuf type {@code ChatMsg}
   */
  public static final class ChatMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ChatMsg)
      ChatMsgOrBuilder {
    // Use ChatMsg.newBuilder() to construct.
    private ChatMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ChatMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ChatMsg defaultInstance;
    public static ChatMsg getDefaultInstance() {
      return defaultInstance;
    }

    public ChatMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ChatMsg(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              message_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              flycordx_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              flycordy_ = bs;
              break;
            }
            case 32: {
              bitField0_ |= 0x00000010;
              score_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000020;
              x_ = input.readInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000040;
              y_ = input.readInt32();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000080;
              type_ = input.readInt32();
              break;
            }
            case 66: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              username_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.umundo.protobuf.ChatS11N.internal_static_ChatMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.umundo.protobuf.ChatS11N.internal_static_ChatMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.umundo.protobuf.ChatS11N.ChatMsg.class, org.umundo.protobuf.ChatS11N.ChatMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<ChatMsg> PARSER =
        new com.google.protobuf.AbstractParser<ChatMsg>() {
      public ChatMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChatMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ChatMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int USERNAME_FIELD_NUMBER = 8;
    private java.lang.Object username_;
    /**
     * <code>optional string username = 8;</code>
     */
    public boolean hasUsername() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string username = 8;</code>
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          username_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string username = 8;</code>
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MESSAGE_FIELD_NUMBER = 1;
    private java.lang.Object message_;
    /**
     * <code>optional string message = 1;</code>
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string message = 1;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          message_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string message = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FLYCORDX_FIELD_NUMBER = 2;
    private java.lang.Object flycordx_;
    /**
     * <code>optional string flycordx = 2;</code>
     */
    public boolean hasFlycordx() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string flycordx = 2;</code>
     */
    public java.lang.String getFlycordx() {
      java.lang.Object ref = flycordx_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          flycordx_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string flycordx = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFlycordxBytes() {
      java.lang.Object ref = flycordx_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        flycordx_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FLYCORDY_FIELD_NUMBER = 3;
    private java.lang.Object flycordy_;
    /**
     * <code>optional string flycordy = 3;</code>
     */
    public boolean hasFlycordy() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string flycordy = 3;</code>
     */
    public java.lang.String getFlycordy() {
      java.lang.Object ref = flycordy_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          flycordy_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string flycordy = 3;</code>
     */
    public com.google.protobuf.ByteString
        getFlycordyBytes() {
      java.lang.Object ref = flycordy_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        flycordy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SCORE_FIELD_NUMBER = 4;
    private int score_;
    /**
     * <code>optional int32 score = 4;</code>
     */
    public boolean hasScore() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional int32 score = 4;</code>
     */
    public int getScore() {
      return score_;
    }

    public static final int X_FIELD_NUMBER = 5;
    private int x_;
    /**
     * <code>optional int32 x = 5;</code>
     */
    public boolean hasX() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional int32 x = 5;</code>
     */
    public int getX() {
      return x_;
    }

    public static final int Y_FIELD_NUMBER = 6;
    private int y_;
    /**
     * <code>optional int32 y = 6;</code>
     */
    public boolean hasY() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional int32 y = 6;</code>
     */
    public int getY() {
      return y_;
    }

    public static final int TYPE_FIELD_NUMBER = 7;
    private int type_;
    /**
     * <code>optional int32 type = 7;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional int32 type = 7;</code>
     */
    public int getType() {
      return type_;
    }

    private void initFields() {
      username_ = "";
      message_ = "";
      flycordx_ = "";
      flycordy_ = "";
      score_ = 0;
      x_ = 0;
      y_ = 0;
      type_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(1, getMessageBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(2, getFlycordxBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(3, getFlycordyBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(4, score_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(5, x_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeInt32(6, y_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeInt32(7, type_);
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(8, getUsernameBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getMessageBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getFlycordxBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getFlycordyBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, score_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, x_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, y_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, type_);
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(8, getUsernameBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static org.umundo.protobuf.ChatS11N.ChatMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.umundo.protobuf.ChatS11N.ChatMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.umundo.protobuf.ChatS11N.ChatMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.umundo.protobuf.ChatS11N.ChatMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.umundo.protobuf.ChatS11N.ChatMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.umundo.protobuf.ChatS11N.ChatMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.umundo.protobuf.ChatS11N.ChatMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.umundo.protobuf.ChatS11N.ChatMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.umundo.protobuf.ChatS11N.ChatMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.umundo.protobuf.ChatS11N.ChatMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.umundo.protobuf.ChatS11N.ChatMsg prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ChatMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChatMsg)
        org.umundo.protobuf.ChatS11N.ChatMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.umundo.protobuf.ChatS11N.internal_static_ChatMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.umundo.protobuf.ChatS11N.internal_static_ChatMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.umundo.protobuf.ChatS11N.ChatMsg.class, org.umundo.protobuf.ChatS11N.ChatMsg.Builder.class);
      }

      // Construct using org.umundo.protobuf.ChatS11N.ChatMsg.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        username_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        message_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        flycordx_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        flycordy_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        score_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        x_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        y_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000080);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.umundo.protobuf.ChatS11N.internal_static_ChatMsg_descriptor;
      }

      public org.umundo.protobuf.ChatS11N.ChatMsg getDefaultInstanceForType() {
        return org.umundo.protobuf.ChatS11N.ChatMsg.getDefaultInstance();
      }

      public org.umundo.protobuf.ChatS11N.ChatMsg build() {
        org.umundo.protobuf.ChatS11N.ChatMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.umundo.protobuf.ChatS11N.ChatMsg buildPartial() {
        org.umundo.protobuf.ChatS11N.ChatMsg result = new org.umundo.protobuf.ChatS11N.ChatMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.username_ = username_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.message_ = message_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.flycordx_ = flycordx_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.flycordy_ = flycordy_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.score_ = score_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.x_ = x_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.y_ = y_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.type_ = type_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.umundo.protobuf.ChatS11N.ChatMsg) {
          return mergeFrom((org.umundo.protobuf.ChatS11N.ChatMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.umundo.protobuf.ChatS11N.ChatMsg other) {
        if (other == org.umundo.protobuf.ChatS11N.ChatMsg.getDefaultInstance()) return this;
        if (other.hasUsername()) {
          bitField0_ |= 0x00000001;
          username_ = other.username_;
          onChanged();
        }
        if (other.hasMessage()) {
          bitField0_ |= 0x00000002;
          message_ = other.message_;
          onChanged();
        }
        if (other.hasFlycordx()) {
          bitField0_ |= 0x00000004;
          flycordx_ = other.flycordx_;
          onChanged();
        }
        if (other.hasFlycordy()) {
          bitField0_ |= 0x00000008;
          flycordy_ = other.flycordy_;
          onChanged();
        }
        if (other.hasScore()) {
          setScore(other.getScore());
        }
        if (other.hasX()) {
          setX(other.getX());
        }
        if (other.hasY()) {
          setY(other.getY());
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.umundo.protobuf.ChatS11N.ChatMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.umundo.protobuf.ChatS11N.ChatMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object username_ = "";
      /**
       * <code>optional string username = 8;</code>
       */
      public boolean hasUsername() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string username = 8;</code>
       */
      public java.lang.String getUsername() {
        java.lang.Object ref = username_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            username_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string username = 8;</code>
       */
      public com.google.protobuf.ByteString
          getUsernameBytes() {
        java.lang.Object ref = username_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          username_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string username = 8;</code>
       */
      public Builder setUsername(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        username_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string username = 8;</code>
       */
      public Builder clearUsername() {
        bitField0_ = (bitField0_ & ~0x00000001);
        username_ = getDefaultInstance().getUsername();
        onChanged();
        return this;
      }
      /**
       * <code>optional string username = 8;</code>
       */
      public Builder setUsernameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        username_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object message_ = "";
      /**
       * <code>optional string message = 1;</code>
       */
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string message = 1;</code>
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            message_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string message = 1;</code>
       */
      public com.google.protobuf.ByteString
          getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string message = 1;</code>
       */
      public Builder setMessage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        message_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string message = 1;</code>
       */
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000002);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       * <code>optional string message = 1;</code>
       */
      public Builder setMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        message_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object flycordx_ = "";
      /**
       * <code>optional string flycordx = 2;</code>
       */
      public boolean hasFlycordx() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string flycordx = 2;</code>
       */
      public java.lang.String getFlycordx() {
        java.lang.Object ref = flycordx_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            flycordx_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string flycordx = 2;</code>
       */
      public com.google.protobuf.ByteString
          getFlycordxBytes() {
        java.lang.Object ref = flycordx_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          flycordx_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string flycordx = 2;</code>
       */
      public Builder setFlycordx(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        flycordx_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string flycordx = 2;</code>
       */
      public Builder clearFlycordx() {
        bitField0_ = (bitField0_ & ~0x00000004);
        flycordx_ = getDefaultInstance().getFlycordx();
        onChanged();
        return this;
      }
      /**
       * <code>optional string flycordx = 2;</code>
       */
      public Builder setFlycordxBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        flycordx_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object flycordy_ = "";
      /**
       * <code>optional string flycordy = 3;</code>
       */
      public boolean hasFlycordy() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string flycordy = 3;</code>
       */
      public java.lang.String getFlycordy() {
        java.lang.Object ref = flycordy_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            flycordy_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string flycordy = 3;</code>
       */
      public com.google.protobuf.ByteString
          getFlycordyBytes() {
        java.lang.Object ref = flycordy_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          flycordy_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string flycordy = 3;</code>
       */
      public Builder setFlycordy(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        flycordy_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string flycordy = 3;</code>
       */
      public Builder clearFlycordy() {
        bitField0_ = (bitField0_ & ~0x00000008);
        flycordy_ = getDefaultInstance().getFlycordy();
        onChanged();
        return this;
      }
      /**
       * <code>optional string flycordy = 3;</code>
       */
      public Builder setFlycordyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        flycordy_ = value;
        onChanged();
        return this;
      }

      private int score_ ;
      /**
       * <code>optional int32 score = 4;</code>
       */
      public boolean hasScore() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional int32 score = 4;</code>
       */
      public int getScore() {
        return score_;
      }
      /**
       * <code>optional int32 score = 4;</code>
       */
      public Builder setScore(int value) {
        bitField0_ |= 0x00000010;
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 score = 4;</code>
       */
      public Builder clearScore() {
        bitField0_ = (bitField0_ & ~0x00000010);
        score_ = 0;
        onChanged();
        return this;
      }

      private int x_ ;
      /**
       * <code>optional int32 x = 5;</code>
       */
      public boolean hasX() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional int32 x = 5;</code>
       */
      public int getX() {
        return x_;
      }
      /**
       * <code>optional int32 x = 5;</code>
       */
      public Builder setX(int value) {
        bitField0_ |= 0x00000020;
        x_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 x = 5;</code>
       */
      public Builder clearX() {
        bitField0_ = (bitField0_ & ~0x00000020);
        x_ = 0;
        onChanged();
        return this;
      }

      private int y_ ;
      /**
       * <code>optional int32 y = 6;</code>
       */
      public boolean hasY() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional int32 y = 6;</code>
       */
      public int getY() {
        return y_;
      }
      /**
       * <code>optional int32 y = 6;</code>
       */
      public Builder setY(int value) {
        bitField0_ |= 0x00000040;
        y_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 y = 6;</code>
       */
      public Builder clearY() {
        bitField0_ = (bitField0_ & ~0x00000040);
        y_ = 0;
        onChanged();
        return this;
      }

      private int type_ ;
      /**
       * <code>optional int32 type = 7;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional int32 type = 7;</code>
       */
      public int getType() {
        return type_;
      }
      /**
       * <code>optional int32 type = 7;</code>
       */
      public Builder setType(int value) {
        bitField0_ |= 0x00000080;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 type = 7;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000080);
        type_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ChatMsg)
    }

    static {
      defaultInstance = new ChatMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ChatMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChatMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ChatMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016ChatS11N.proto\"\203\001\n\007ChatMsg\022\020\n\010username" +
      "\030\010 \001(\t\022\017\n\007message\030\001 \001(\t\022\020\n\010flycordx\030\002 \001(" +
      "\t\022\020\n\010flycordy\030\003 \001(\t\022\r\n\005score\030\004 \001(\005\022\t\n\001x\030" +
      "\005 \001(\005\022\t\n\001y\030\006 \001(\005\022\014\n\004type\030\007 \001(\005B\025\n\023org.um" +
      "undo.protobuf"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_ChatMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChatMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ChatMsg_descriptor,
        new java.lang.String[] { "Username", "Message", "Flycordx", "Flycordy", "Score", "X", "Y", "Type", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
