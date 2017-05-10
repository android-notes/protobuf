// source: ShopsData.proto

public final class ShopsData {
    private ShopsData() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface ShopDataOrBuilder extends
            // @@protoc_insertion_point(interface_extends:ShopData)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>optional int32 tabType = 1;</code>
         */
        int getTabType();

        /**
         * <code>optional string mbook = 2;</code>
         */
        String getMbook();

        /**
         * <code>optional string mbook = 2;</code>
         */
        com.google.protobuf.ByteString
        getMbookBytes();

        /**
         * <code>optional bool isEnd = 3;</code>
         */
        boolean getIsEnd();

        /**
         * <pre>
         *    List&lt;Shop&gt; list;
         * </pre>
         * <p>
         * <code>repeated .Shop list = 4;</code>
         */
        java.util.List<Shop>
        getListList();

        /**
         * <pre>
         *    List&lt;Shop&gt; list;
         * </pre>
         * <p>
         * <code>repeated .Shop list = 4;</code>
         */
        ShopsData.Shop getList(int index);

        /**
         * <pre>
         *    List&lt;Shop&gt; list;
         * </pre>
         * <p>
         * <code>repeated .Shop list = 4;</code>
         */
        int getListCount();

        /**
         * <pre>
         *    List&lt;Shop&gt; list;
         * </pre>
         * <p>
         * <code>repeated .Shop list = 4;</code>
         */
        java.util.List<? extends ShopOrBuilder>
        getListOrBuilderList();

        /**
         * <pre>
         *    List&lt;Shop&gt; list;
         * </pre>
         * <p>
         * <code>repeated .Shop list = 4;</code>
         */
        ShopsData.ShopOrBuilder getListOrBuilder(
                int index);
    }

    /**
     * Protobuf type {@code ShopData}
     */
    public static final class ShopData extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:ShopData)
            ShopDataOrBuilder {
        // Use ShopData.newBuilder() to construct.
        private ShopData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private ShopData() {
            tabType_ = 0;
            mbook_ = "";
            isEnd_ = false;
            list_ = java.util.Collections.emptyList();
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private ShopData(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {

                            tabType_ = input.readInt32();
                            break;
                        }
                        case 18: {
                            String s = input.readStringRequireUtf8();

                            mbook_ = s;
                            break;
                        }
                        case 24: {

                            isEnd_ = input.readBool();
                            break;
                        }
                        case 34: {
                            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                                list_ = new java.util.ArrayList<Shop>();
                                mutable_bitField0_ |= 0x00000008;
                            }
                            list_.add(
                                    input.readMessage(ShopsData.Shop.parser(), extensionRegistry));
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
                if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                    list_ = java.util.Collections.unmodifiableList(list_);
                }
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return ShopsData.internal_static_ShopData_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return ShopsData.internal_static_ShopData_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            ShopsData.ShopData.class, ShopsData.ShopData.Builder.class);
        }

        private int bitField0_;
        public static final int TABTYPE_FIELD_NUMBER = 1;
        private int tabType_;

        /**
         * <code>optional int32 tabType = 1;</code>
         */
        public int getTabType() {
            return tabType_;
        }

        public static final int MBOOK_FIELD_NUMBER = 2;
        private volatile Object mbook_;

        /**
         * <code>optional string mbook = 2;</code>
         */
        public String getMbook() {
            Object ref = mbook_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                mbook_ = s;
                return s;
            }
        }

        /**
         * <code>optional string mbook = 2;</code>
         */
        public com.google.protobuf.ByteString
        getMbookBytes() {
            Object ref = mbook_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                mbook_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int ISEND_FIELD_NUMBER = 3;
        private boolean isEnd_;

        /**
         * <code>optional bool isEnd = 3;</code>
         */
        public boolean getIsEnd() {
            return isEnd_;
        }

        public static final int LIST_FIELD_NUMBER = 4;
        private java.util.List<Shop> list_;

        /**
         * <pre>
         *    List&lt;Shop&gt; list;
         * </pre>
         * <p>
         * <code>repeated .Shop list = 4;</code>
         */
        public java.util.List<Shop> getListList() {
            return list_;
        }

        /**
         * <pre>
         *    List&lt;Shop&gt; list;
         * </pre>
         * <p>
         * <code>repeated .Shop list = 4;</code>
         */
        public java.util.List<? extends ShopOrBuilder>
        getListOrBuilderList() {
            return list_;
        }

        /**
         * <pre>
         *    List&lt;Shop&gt; list;
         * </pre>
         * <p>
         * <code>repeated .Shop list = 4;</code>
         */
        public int getListCount() {
            return list_.size();
        }

        /**
         * <pre>
         *    List&lt;Shop&gt; list;
         * </pre>
         * <p>
         * <code>repeated .Shop list = 4;</code>
         */
        public ShopsData.Shop getList(int index) {
            return list_.get(index);
        }

        /**
         * <pre>
         *    List&lt;Shop&gt; list;
         * </pre>
         * <p>
         * <code>repeated .Shop list = 4;</code>
         */
        public ShopsData.ShopOrBuilder getListOrBuilder(
                int index) {
            return list_.get(index);
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
            if (tabType_ != 0) {
                output.writeInt32(1, tabType_);
            }
            if (!getMbookBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, mbook_);
            }
            if (isEnd_ != false) {
                output.writeBool(3, isEnd_);
            }
            for (int i = 0; i < list_.size(); i++) {
                output.writeMessage(4, list_.get(i));
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (tabType_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, tabType_);
            }
            if (!getMbookBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, mbook_);
            }
            if (isEnd_ != false) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(3, isEnd_);
            }
            for (int i = 0; i < list_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(4, list_.get(i));
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShopsData.ShopData)) {
                return super.equals(obj);
            }
            ShopsData.ShopData other = (ShopsData.ShopData) obj;

            boolean result = true;
            result = result && (getTabType()
                    == other.getTabType());
            result = result && getMbook()
                    .equals(other.getMbook());
            result = result && (getIsEnd()
                    == other.getIsEnd());
            result = result && getListList()
                    .equals(other.getListList());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptorForType().hashCode();
            hash = (37 * hash) + TABTYPE_FIELD_NUMBER;
            hash = (53 * hash) + getTabType();
            hash = (37 * hash) + MBOOK_FIELD_NUMBER;
            hash = (53 * hash) + getMbook().hashCode();
            hash = (37 * hash) + ISEND_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                    getIsEnd());
            if (getListCount() > 0) {
                hash = (37 * hash) + LIST_FIELD_NUMBER;
                hash = (53 * hash) + getListList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static ShopsData.ShopData parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ShopsData.ShopData parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ShopsData.ShopData parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ShopsData.ShopData parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ShopsData.ShopData parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static ShopsData.ShopData parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static ShopsData.ShopData parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static ShopsData.ShopData parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static ShopsData.ShopData parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static ShopsData.ShopData parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(ShopsData.ShopData prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code ShopData}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:ShopData)
                ShopsData.ShopDataOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ShopsData.internal_static_ShopData_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ShopsData.internal_static_ShopData_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                ShopsData.ShopData.class, ShopsData.ShopData.Builder.class);
            }

            // Construct using ShopsData.ShopData.newBuilder()
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
                    getListFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                tabType_ = 0;

                mbook_ = "";

                isEnd_ = false;

                if (listBuilder_ == null) {
                    list_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000008);
                } else {
                    listBuilder_.clear();
                }
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return ShopsData.internal_static_ShopData_descriptor;
            }

            public ShopsData.ShopData getDefaultInstanceForType() {
                return ShopsData.ShopData.getDefaultInstance();
            }

            public ShopsData.ShopData build() {
                ShopsData.ShopData result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public ShopsData.ShopData buildPartial() {
                ShopsData.ShopData result = new ShopsData.ShopData(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                result.tabType_ = tabType_;
                result.mbook_ = mbook_;
                result.isEnd_ = isEnd_;
                if (listBuilder_ == null) {
                    if (((bitField0_ & 0x00000008) == 0x00000008)) {
                        list_ = java.util.Collections.unmodifiableList(list_);
                        bitField0_ = (bitField0_ & ~0x00000008);
                    }
                    result.list_ = list_;
                } else {
                    result.list_ = listBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }

            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof ShopsData.ShopData) {
                    return mergeFrom((ShopsData.ShopData) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(ShopsData.ShopData other) {
                if (other == ShopsData.ShopData.getDefaultInstance()) return this;
                if (other.getTabType() != 0) {
                    setTabType(other.getTabType());
                }
                if (!other.getMbook().isEmpty()) {
                    mbook_ = other.mbook_;
                    onChanged();
                }
                if (other.getIsEnd() != false) {
                    setIsEnd(other.getIsEnd());
                }
                if (listBuilder_ == null) {
                    if (!other.list_.isEmpty()) {
                        if (list_.isEmpty()) {
                            list_ = other.list_;
                            bitField0_ = (bitField0_ & ~0x00000008);
                        } else {
                            ensureListIsMutable();
                            list_.addAll(other.list_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.list_.isEmpty()) {
                        if (listBuilder_.isEmpty()) {
                            listBuilder_.dispose();
                            listBuilder_ = null;
                            list_ = other.list_;
                            bitField0_ = (bitField0_ & ~0x00000008);
                            listBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getListFieldBuilder() : null;
                        } else {
                            listBuilder_.addAllMessages(other.list_);
                        }
                    }
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                ShopsData.ShopData parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (ShopsData.ShopData) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            private int tabType_;

            /**
             * <code>optional int32 tabType = 1;</code>
             */
            public int getTabType() {
                return tabType_;
            }

            /**
             * <code>optional int32 tabType = 1;</code>
             */
            public Builder setTabType(int value) {

                tabType_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional int32 tabType = 1;</code>
             */
            public Builder clearTabType() {

                tabType_ = 0;
                onChanged();
                return this;
            }

            private Object mbook_ = "";

            /**
             * <code>optional string mbook = 2;</code>
             */
            public String getMbook() {
                Object ref = mbook_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    mbook_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>optional string mbook = 2;</code>
             */
            public com.google.protobuf.ByteString
            getMbookBytes() {
                Object ref = mbook_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    mbook_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>optional string mbook = 2;</code>
             */
            public Builder setMbook(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                mbook_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional string mbook = 2;</code>
             */
            public Builder clearMbook() {

                mbook_ = getDefaultInstance().getMbook();
                onChanged();
                return this;
            }

            /**
             * <code>optional string mbook = 2;</code>
             */
            public Builder setMbookBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                mbook_ = value;
                onChanged();
                return this;
            }

            private boolean isEnd_;

            /**
             * <code>optional bool isEnd = 3;</code>
             */
            public boolean getIsEnd() {
                return isEnd_;
            }

            /**
             * <code>optional bool isEnd = 3;</code>
             */
            public Builder setIsEnd(boolean value) {

                isEnd_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional bool isEnd = 3;</code>
             */
            public Builder clearIsEnd() {

                isEnd_ = false;
                onChanged();
                return this;
            }

            private java.util.List<Shop> list_ =
                    java.util.Collections.emptyList();

            private void ensureListIsMutable() {
                if (!((bitField0_ & 0x00000008) == 0x00000008)) {
                    list_ = new java.util.ArrayList<Shop>(list_);
                    bitField0_ |= 0x00000008;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    ShopsData.Shop, ShopsData.Shop.Builder, ShopsData.ShopOrBuilder> listBuilder_;

            /**
             * <pre>
             *    List&lt;Shop&gt; list;
             * </pre>
             * <p>
             * <code>repeated .Shop list = 4;</code>
             */
            public java.util.List<Shop> getListList() {
                if (listBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(list_);
                } else {
                    return listBuilder_.getMessageList();
                }
            }

            /**
             * <pre>
             *    List&lt;Shop&gt; list;
             * </pre>
             * <p>
             * <code>repeated .Shop list = 4;</code>
             */
            public int getListCount() {
                if (listBuilder_ == null) {
                    return list_.size();
                } else {
                    return listBuilder_.getCount();
                }
            }

            /**
             * <pre>
             *    List&lt;Shop&gt; list;
             * </pre>
             * <p>
             * <code>repeated .Shop list = 4;</code>
             */
            public ShopsData.Shop getList(int index) {
                if (listBuilder_ == null) {
                    return list_.get(index);
                } else {
                    return listBuilder_.getMessage(index);
                }
            }

            /**
             * <pre>
             *    List&lt;Shop&gt; list;
             * </pre>
             * <p>
             * <code>repeated .Shop list = 4;</code>
             */
            public Builder setList(
                    int index, ShopsData.Shop value) {
                if (listBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureListIsMutable();
                    list_.set(index, value);
                    onChanged();
                } else {
                    listBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <pre>
             *    List&lt;Shop&gt; list;
             * </pre>
             * <p>
             * <code>repeated .Shop list = 4;</code>
             */
            public Builder setList(
                    int index, ShopsData.Shop.Builder builderForValue) {
                if (listBuilder_ == null) {
                    ensureListIsMutable();
                    list_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    listBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <pre>
             *    List&lt;Shop&gt; list;
             * </pre>
             * <p>
             * <code>repeated .Shop list = 4;</code>
             */
            public Builder addList(ShopsData.Shop value) {
                if (listBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureListIsMutable();
                    list_.add(value);
                    onChanged();
                } else {
                    listBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <pre>
             *    List&lt;Shop&gt; list;
             * </pre>
             * <p>
             * <code>repeated .Shop list = 4;</code>
             */
            public Builder addList(
                    int index, ShopsData.Shop value) {
                if (listBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureListIsMutable();
                    list_.add(index, value);
                    onChanged();
                } else {
                    listBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <pre>
             *    List&lt;Shop&gt; list;
             * </pre>
             * <p>
             * <code>repeated .Shop list = 4;</code>
             */
            public Builder addList(
                    ShopsData.Shop.Builder builderForValue) {
                if (listBuilder_ == null) {
                    ensureListIsMutable();
                    list_.add(builderForValue.build());
                    onChanged();
                } else {
                    listBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <pre>
             *    List&lt;Shop&gt; list;
             * </pre>
             * <p>
             * <code>repeated .Shop list = 4;</code>
             */
            public Builder addList(
                    int index, ShopsData.Shop.Builder builderForValue) {
                if (listBuilder_ == null) {
                    ensureListIsMutable();
                    list_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    listBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <pre>
             *    List&lt;Shop&gt; list;
             * </pre>
             * <p>
             * <code>repeated .Shop list = 4;</code>
             */
            public Builder addAllList(
                    Iterable<? extends Shop> values) {
                if (listBuilder_ == null) {
                    ensureListIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, list_);
                    onChanged();
                } else {
                    listBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <pre>
             *    List&lt;Shop&gt; list;
             * </pre>
             * <p>
             * <code>repeated .Shop list = 4;</code>
             */
            public Builder clearList() {
                if (listBuilder_ == null) {
                    list_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000008);
                    onChanged();
                } else {
                    listBuilder_.clear();
                }
                return this;
            }

            /**
             * <pre>
             *    List&lt;Shop&gt; list;
             * </pre>
             * <p>
             * <code>repeated .Shop list = 4;</code>
             */
            public Builder removeList(int index) {
                if (listBuilder_ == null) {
                    ensureListIsMutable();
                    list_.remove(index);
                    onChanged();
                } else {
                    listBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <pre>
             *    List&lt;Shop&gt; list;
             * </pre>
             * <p>
             * <code>repeated .Shop list = 4;</code>
             */
            public ShopsData.Shop.Builder getListBuilder(
                    int index) {
                return getListFieldBuilder().getBuilder(index);
            }

            /**
             * <pre>
             *    List&lt;Shop&gt; list;
             * </pre>
             * <p>
             * <code>repeated .Shop list = 4;</code>
             */
            public ShopsData.ShopOrBuilder getListOrBuilder(
                    int index) {
                if (listBuilder_ == null) {
                    return list_.get(index);
                } else {
                    return listBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <pre>
             *    List&lt;Shop&gt; list;
             * </pre>
             * <p>
             * <code>repeated .Shop list = 4;</code>
             */
            public java.util.List<? extends ShopOrBuilder>
            getListOrBuilderList() {
                if (listBuilder_ != null) {
                    return listBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(list_);
                }
            }

            /**
             * <pre>
             *    List&lt;Shop&gt; list;
             * </pre>
             * <p>
             * <code>repeated .Shop list = 4;</code>
             */
            public ShopsData.Shop.Builder addListBuilder() {
                return getListFieldBuilder().addBuilder(
                        ShopsData.Shop.getDefaultInstance());
            }

            /**
             * <pre>
             *    List&lt;Shop&gt; list;
             * </pre>
             * <p>
             * <code>repeated .Shop list = 4;</code>
             */
            public ShopsData.Shop.Builder addListBuilder(
                    int index) {
                return getListFieldBuilder().addBuilder(
                        index, ShopsData.Shop.getDefaultInstance());
            }

            /**
             * <pre>
             *    List&lt;Shop&gt; list;
             * </pre>
             * <p>
             * <code>repeated .Shop list = 4;</code>
             */
            public java.util.List<Shop.Builder>
            getListBuilderList() {
                return getListFieldBuilder().getBuilderList();
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    ShopsData.Shop, ShopsData.Shop.Builder, ShopsData.ShopOrBuilder>
            getListFieldBuilder() {
                if (listBuilder_ == null) {
                    listBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            ShopsData.Shop, ShopsData.Shop.Builder, ShopsData.ShopOrBuilder>(
                            list_,
                            ((bitField0_ & 0x00000008) == 0x00000008),
                            getParentForChildren(),
                            isClean());
                    list_ = null;
                }
                return listBuilder_;
            }

            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:ShopData)
        }

        // @@protoc_insertion_point(class_scope:ShopData)
        private static final ShopsData.ShopData DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new ShopsData.ShopData();
        }

        public static ShopsData.ShopData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<ShopData>
                PARSER = new com.google.protobuf.AbstractParser<ShopData>() {
            public ShopData parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new ShopData(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<ShopData> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<ShopData> getParserForType() {
            return PARSER;
        }

        public ShopsData.ShopData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface ShopOrBuilder extends
            // @@protoc_insertion_point(interface_extends:Shop)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * ": "http
         * </pre>
         * <p>
         * <code>optional string avatar = 1;</code>
         */
        String getAvatar();

        /**
         * <pre>
         * ": "http
         * </pre>
         * <p>
         * <code>optional string avatar = 1;</code>
         */
        com.google.protobuf.ByteString
        getAvatarBytes();

        /**
         * <pre>
         * ": "颜料袋家xx
         * </pre>
         * <p>
         * <code>optional string name = 2;</code>
         */
        String getName();

        /**
         * <pre>
         * ": "颜料袋家xx
         * </pre>
         * <p>
         * <code>optional string name = 2;</code>
         */
        com.google.protobuf.ByteString
        getNameBytes();

        /**
         * <pre>
         * ": "袋子Bab
         * </pre>
         * <p>
         * <code>optional string uname = 3;</code>
         */
        String getUname();

        /**
         * <pre>
         * ": "袋子Bab
         * </pre>
         * <p>
         * <code>optional string uname = 3;</code>
         */
        com.google.protobuf.ByteString
        getUnameBytes();

        /**
         * <pre>
         * ":
         * </pre>
         * <p>
         * <code>optional bool isCollected = 4;</code>
         */
        boolean getIsCollected();

        /**
         * <pre>
         * ": 2,
         * </pre>
         * <p>
         * <code>optional int32 newNum = 5;</code>
         */
        int getNewNum();

        /**
         * <pre>
         * ": "销量:586
         * </pre>
         * <p>
         * <code>optional string sale = 6;</code>
         */
        String getSale();

        /**
         * <pre>
         * ": "销量:586
         * </pre>
         * <p>
         * <code>optional string sale = 6;</code>
         */
        com.google.protobuf.ByteString
        getSaleBytes();

        /**
         * <pre>
         * "
         * </pre>
         * <p>
         * <code>optional string recommendText = 7;</code>
         */
        String getRecommendText();

        /**
         * <pre>
         * "
         * </pre>
         * <p>
         * <code>optional string recommendText = 7;</code>
         */
        com.google.protobuf.ByteString
        getRecommendTextBytes();

        /**
         * <pre>
         * ": "mgj
         * </pre>
         * <p>
         * <code>optional string shopUrl = 8;</code>
         */
        String getShopUrl();

        /**
         * <pre>
         * ": "mgj
         * </pre>
         * <p>
         * <code>optional string shopUrl = 8;</code>
         */
        com.google.protobuf.ByteString
        getShopUrlBytes();

        /**
         * <pre>
         * ": "14t9
         * </pre>
         * <p>
         * <code>optional string shopId = 9;</code>
         */
        String getShopId();

        /**
         * <pre>
         * ": "14t9
         * </pre>
         * <p>
         * <code>optional string shopId = 9;</code>
         */
        com.google.protobuf.ByteString
        getShopIdBytes();

        /**
         * <pre>
         * ": "12rt
         * </pre>
         * <p>
         * <code>optional string userId = 10;</code>
         */
        String getUserId();

        /**
         * <pre>
         * ": "12rt
         * </pre>
         * <p>
         * <code>optional string userId = 10;</code>
         */
        com.google.protobuf.ByteString
        getUserIdBytes();

        /**
         * <pre>
         * ": "",
         * </pre>
         * <p>
         * <code>optional string icon = 11;</code>
         */
        String getIcon();

        /**
         * <pre>
         * ": "",
         * </pre>
         * <p>
         * <code>optional string icon = 11;</code>
         */
        com.google.protobuf.ByteString
        getIconBytes();

        /**
         * <pre>
         *    List&lt;Goods&gt;goods;
         * </pre>
         * <p>
         * <code>repeated .Goods goods = 12;</code>
         */
        java.util.List<Goods>
        getGoodsList();

        /**
         * <pre>
         *    List&lt;Goods&gt;goods;
         * </pre>
         * <p>
         * <code>repeated .Goods goods = 12;</code>
         */
        ShopsData.Goods getGoods(int index);

        /**
         * <pre>
         *    List&lt;Goods&gt;goods;
         * </pre>
         * <p>
         * <code>repeated .Goods goods = 12;</code>
         */
        int getGoodsCount();

        /**
         * <pre>
         *    List&lt;Goods&gt;goods;
         * </pre>
         * <p>
         * <code>repeated .Goods goods = 12;</code>
         */
        java.util.List<? extends GoodsOrBuilder>
        getGoodsOrBuilderList();

        /**
         * <pre>
         *    List&lt;Goods&gt;goods;
         * </pre>
         * <p>
         * <code>repeated .Goods goods = 12;</code>
         */
        ShopsData.GoodsOrBuilder getGoodsOrBuilder(
                int index);

        /**
         * <code>optional int32 originOrder = 13;</code>
         */
        int getOriginOrder();

        /**
         * <pre>
         *    List&lt;Campaign&gt;shopCampaigns;
         * </pre>
         * <p>
         * <code>repeated .Campaign shopCampaigns = 14;</code>
         */
        java.util.List<Campaign>
        getShopCampaignsList();

        /**
         * <pre>
         *    List&lt;Campaign&gt;shopCampaigns;
         * </pre>
         * <p>
         * <code>repeated .Campaign shopCampaigns = 14;</code>
         */
        ShopsData.Campaign getShopCampaigns(int index);

        /**
         * <pre>
         *    List&lt;Campaign&gt;shopCampaigns;
         * </pre>
         * <p>
         * <code>repeated .Campaign shopCampaigns = 14;</code>
         */
        int getShopCampaignsCount();

        /**
         * <pre>
         *    List&lt;Campaign&gt;shopCampaigns;
         * </pre>
         * <p>
         * <code>repeated .Campaign shopCampaigns = 14;</code>
         */
        java.util.List<? extends CampaignOrBuilder>
        getShopCampaignsOrBuilderList();

        /**
         * <pre>
         *    List&lt;Campaign&gt;shopCampaigns;
         * </pre>
         * <p>
         * <code>repeated .Campaign shopCampaigns = 14;</code>
         */
        ShopsData.CampaignOrBuilder getShopCampaignsOrBuilder(
                int index);

        /**
         * <code>optional bool collected = 15;</code>
         */
        boolean getCollected();
    }

    /**
     * Protobuf type {@code Shop}
     */
    public static final class Shop extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:Shop)
            ShopOrBuilder {
        // Use Shop.newBuilder() to construct.
        private Shop(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private Shop() {
            avatar_ = "";
            name_ = "";
            uname_ = "";
            isCollected_ = false;
            newNum_ = 0;
            sale_ = "";
            recommendText_ = "";
            shopUrl_ = "";
            shopId_ = "";
            userId_ = "";
            icon_ = "";
            goods_ = java.util.Collections.emptyList();
            originOrder_ = 0;
            shopCampaigns_ = java.util.Collections.emptyList();
            collected_ = false;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private Shop(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            String s = input.readStringRequireUtf8();

                            avatar_ = s;
                            break;
                        }
                        case 18: {
                            String s = input.readStringRequireUtf8();

                            name_ = s;
                            break;
                        }
                        case 26: {
                            String s = input.readStringRequireUtf8();

                            uname_ = s;
                            break;
                        }
                        case 32: {

                            isCollected_ = input.readBool();
                            break;
                        }
                        case 40: {

                            newNum_ = input.readInt32();
                            break;
                        }
                        case 50: {
                            String s = input.readStringRequireUtf8();

                            sale_ = s;
                            break;
                        }
                        case 58: {
                            String s = input.readStringRequireUtf8();

                            recommendText_ = s;
                            break;
                        }
                        case 66: {
                            String s = input.readStringRequireUtf8();

                            shopUrl_ = s;
                            break;
                        }
                        case 74: {
                            String s = input.readStringRequireUtf8();

                            shopId_ = s;
                            break;
                        }
                        case 82: {
                            String s = input.readStringRequireUtf8();

                            userId_ = s;
                            break;
                        }
                        case 90: {
                            String s = input.readStringRequireUtf8();

                            icon_ = s;
                            break;
                        }
                        case 98: {
                            if (!((mutable_bitField0_ & 0x00000800) == 0x00000800)) {
                                goods_ = new java.util.ArrayList<Goods>();
                                mutable_bitField0_ |= 0x00000800;
                            }
                            goods_.add(
                                    input.readMessage(ShopsData.Goods.parser(), extensionRegistry));
                            break;
                        }
                        case 104: {

                            originOrder_ = input.readInt32();
                            break;
                        }
                        case 114: {
                            if (!((mutable_bitField0_ & 0x00002000) == 0x00002000)) {
                                shopCampaigns_ = new java.util.ArrayList<Campaign>();
                                mutable_bitField0_ |= 0x00002000;
                            }
                            shopCampaigns_.add(
                                    input.readMessage(ShopsData.Campaign.parser(), extensionRegistry));
                            break;
                        }
                        case 120: {

                            collected_ = input.readBool();
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
                if (((mutable_bitField0_ & 0x00000800) == 0x00000800)) {
                    goods_ = java.util.Collections.unmodifiableList(goods_);
                }
                if (((mutable_bitField0_ & 0x00002000) == 0x00002000)) {
                    shopCampaigns_ = java.util.Collections.unmodifiableList(shopCampaigns_);
                }
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return ShopsData.internal_static_Shop_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return ShopsData.internal_static_Shop_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            ShopsData.Shop.class, ShopsData.Shop.Builder.class);
        }

        private int bitField0_;
        public static final int AVATAR_FIELD_NUMBER = 1;
        private volatile Object avatar_;

        /**
         * <pre>
         * ": "http
         * </pre>
         * <p>
         * <code>optional string avatar = 1;</code>
         */
        public String getAvatar() {
            Object ref = avatar_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                avatar_ = s;
                return s;
            }
        }

        /**
         * <pre>
         * ": "http
         * </pre>
         * <p>
         * <code>optional string avatar = 1;</code>
         */
        public com.google.protobuf.ByteString
        getAvatarBytes() {
            Object ref = avatar_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                avatar_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int NAME_FIELD_NUMBER = 2;
        private volatile Object name_;

        /**
         * <pre>
         * ": "颜料袋家xx
         * </pre>
         * <p>
         * <code>optional string name = 2;</code>
         */
        public String getName() {
            Object ref = name_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                name_ = s;
                return s;
            }
        }

        /**
         * <pre>
         * ": "颜料袋家xx
         * </pre>
         * <p>
         * <code>optional string name = 2;</code>
         */
        public com.google.protobuf.ByteString
        getNameBytes() {
            Object ref = name_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                name_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int UNAME_FIELD_NUMBER = 3;
        private volatile Object uname_;

        /**
         * <pre>
         * ": "袋子Bab
         * </pre>
         * <p>
         * <code>optional string uname = 3;</code>
         */
        public String getUname() {
            Object ref = uname_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                uname_ = s;
                return s;
            }
        }

        /**
         * <pre>
         * ": "袋子Bab
         * </pre>
         * <p>
         * <code>optional string uname = 3;</code>
         */
        public com.google.protobuf.ByteString
        getUnameBytes() {
            Object ref = uname_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                uname_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int ISCOLLECTED_FIELD_NUMBER = 4;
        private boolean isCollected_;

        /**
         * <pre>
         * ":
         * </pre>
         * <p>
         * <code>optional bool isCollected = 4;</code>
         */
        public boolean getIsCollected() {
            return isCollected_;
        }

        public static final int NEWNUM_FIELD_NUMBER = 5;
        private int newNum_;

        /**
         * <pre>
         * ": 2,
         * </pre>
         * <p>
         * <code>optional int32 newNum = 5;</code>
         */
        public int getNewNum() {
            return newNum_;
        }

        public static final int SALE_FIELD_NUMBER = 6;
        private volatile Object sale_;

        /**
         * <pre>
         * ": "销量:586
         * </pre>
         * <p>
         * <code>optional string sale = 6;</code>
         */
        public String getSale() {
            Object ref = sale_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                sale_ = s;
                return s;
            }
        }

        /**
         * <pre>
         * ": "销量:586
         * </pre>
         * <p>
         * <code>optional string sale = 6;</code>
         */
        public com.google.protobuf.ByteString
        getSaleBytes() {
            Object ref = sale_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                sale_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int RECOMMENDTEXT_FIELD_NUMBER = 7;
        private volatile Object recommendText_;

        /**
         * <pre>
         * "
         * </pre>
         * <p>
         * <code>optional string recommendText = 7;</code>
         */
        public String getRecommendText() {
            Object ref = recommendText_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                recommendText_ = s;
                return s;
            }
        }

        /**
         * <pre>
         * "
         * </pre>
         * <p>
         * <code>optional string recommendText = 7;</code>
         */
        public com.google.protobuf.ByteString
        getRecommendTextBytes() {
            Object ref = recommendText_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                recommendText_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int SHOPURL_FIELD_NUMBER = 8;
        private volatile Object shopUrl_;

        /**
         * <pre>
         * ": "mgj
         * </pre>
         * <p>
         * <code>optional string shopUrl = 8;</code>
         */
        public String getShopUrl() {
            Object ref = shopUrl_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                shopUrl_ = s;
                return s;
            }
        }

        /**
         * <pre>
         * ": "mgj
         * </pre>
         * <p>
         * <code>optional string shopUrl = 8;</code>
         */
        public com.google.protobuf.ByteString
        getShopUrlBytes() {
            Object ref = shopUrl_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                shopUrl_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int SHOPID_FIELD_NUMBER = 9;
        private volatile Object shopId_;

        /**
         * <pre>
         * ": "14t9
         * </pre>
         * <p>
         * <code>optional string shopId = 9;</code>
         */
        public String getShopId() {
            Object ref = shopId_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                shopId_ = s;
                return s;
            }
        }

        /**
         * <pre>
         * ": "14t9
         * </pre>
         * <p>
         * <code>optional string shopId = 9;</code>
         */
        public com.google.protobuf.ByteString
        getShopIdBytes() {
            Object ref = shopId_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                shopId_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int USERID_FIELD_NUMBER = 10;
        private volatile Object userId_;

        /**
         * <pre>
         * ": "12rt
         * </pre>
         * <p>
         * <code>optional string userId = 10;</code>
         */
        public String getUserId() {
            Object ref = userId_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                userId_ = s;
                return s;
            }
        }

        /**
         * <pre>
         * ": "12rt
         * </pre>
         * <p>
         * <code>optional string userId = 10;</code>
         */
        public com.google.protobuf.ByteString
        getUserIdBytes() {
            Object ref = userId_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                userId_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int ICON_FIELD_NUMBER = 11;
        private volatile Object icon_;

        /**
         * <pre>
         * ": "",
         * </pre>
         * <p>
         * <code>optional string icon = 11;</code>
         */
        public String getIcon() {
            Object ref = icon_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                icon_ = s;
                return s;
            }
        }

        /**
         * <pre>
         * ": "",
         * </pre>
         * <p>
         * <code>optional string icon = 11;</code>
         */
        public com.google.protobuf.ByteString
        getIconBytes() {
            Object ref = icon_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                icon_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int GOODS_FIELD_NUMBER = 12;
        private java.util.List<Goods> goods_;

        /**
         * <pre>
         *    List&lt;Goods&gt;goods;
         * </pre>
         * <p>
         * <code>repeated .Goods goods = 12;</code>
         */
        public java.util.List<Goods> getGoodsList() {
            return goods_;
        }

        /**
         * <pre>
         *    List&lt;Goods&gt;goods;
         * </pre>
         * <p>
         * <code>repeated .Goods goods = 12;</code>
         */
        public java.util.List<? extends GoodsOrBuilder>
        getGoodsOrBuilderList() {
            return goods_;
        }

        /**
         * <pre>
         *    List&lt;Goods&gt;goods;
         * </pre>
         * <p>
         * <code>repeated .Goods goods = 12;</code>
         */
        public int getGoodsCount() {
            return goods_.size();
        }

        /**
         * <pre>
         *    List&lt;Goods&gt;goods;
         * </pre>
         * <p>
         * <code>repeated .Goods goods = 12;</code>
         */
        public ShopsData.Goods getGoods(int index) {
            return goods_.get(index);
        }

        /**
         * <pre>
         *    List&lt;Goods&gt;goods;
         * </pre>
         * <p>
         * <code>repeated .Goods goods = 12;</code>
         */
        public ShopsData.GoodsOrBuilder getGoodsOrBuilder(
                int index) {
            return goods_.get(index);
        }

        public static final int ORIGINORDER_FIELD_NUMBER = 13;
        private int originOrder_;

        /**
         * <code>optional int32 originOrder = 13;</code>
         */
        public int getOriginOrder() {
            return originOrder_;
        }

        public static final int SHOPCAMPAIGNS_FIELD_NUMBER = 14;
        private java.util.List<Campaign> shopCampaigns_;

        /**
         * <pre>
         *    List&lt;Campaign&gt;shopCampaigns;
         * </pre>
         * <p>
         * <code>repeated .Campaign shopCampaigns = 14;</code>
         */
        public java.util.List<Campaign> getShopCampaignsList() {
            return shopCampaigns_;
        }

        /**
         * <pre>
         *    List&lt;Campaign&gt;shopCampaigns;
         * </pre>
         * <p>
         * <code>repeated .Campaign shopCampaigns = 14;</code>
         */
        public java.util.List<? extends CampaignOrBuilder>
        getShopCampaignsOrBuilderList() {
            return shopCampaigns_;
        }

        /**
         * <pre>
         *    List&lt;Campaign&gt;shopCampaigns;
         * </pre>
         * <p>
         * <code>repeated .Campaign shopCampaigns = 14;</code>
         */
        public int getShopCampaignsCount() {
            return shopCampaigns_.size();
        }

        /**
         * <pre>
         *    List&lt;Campaign&gt;shopCampaigns;
         * </pre>
         * <p>
         * <code>repeated .Campaign shopCampaigns = 14;</code>
         */
        public ShopsData.Campaign getShopCampaigns(int index) {
            return shopCampaigns_.get(index);
        }

        /**
         * <pre>
         *    List&lt;Campaign&gt;shopCampaigns;
         * </pre>
         * <p>
         * <code>repeated .Campaign shopCampaigns = 14;</code>
         */
        public ShopsData.CampaignOrBuilder getShopCampaignsOrBuilder(
                int index) {
            return shopCampaigns_.get(index);
        }

        public static final int COLLECTED_FIELD_NUMBER = 15;
        private boolean collected_;

        /**
         * <code>optional bool collected = 15;</code>
         */
        public boolean getCollected() {
            return collected_;
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
            if (!getAvatarBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, avatar_);
            }
            if (!getNameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
            }
            if (!getUnameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, uname_);
            }
            if (isCollected_ != false) {
                output.writeBool(4, isCollected_);
            }
            if (newNum_ != 0) {
                output.writeInt32(5, newNum_);
            }
            if (!getSaleBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 6, sale_);
            }
            if (!getRecommendTextBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 7, recommendText_);
            }
            if (!getShopUrlBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 8, shopUrl_);
            }
            if (!getShopIdBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 9, shopId_);
            }
            if (!getUserIdBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 10, userId_);
            }
            if (!getIconBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 11, icon_);
            }
            for (int i = 0; i < goods_.size(); i++) {
                output.writeMessage(12, goods_.get(i));
            }
            if (originOrder_ != 0) {
                output.writeInt32(13, originOrder_);
            }
            for (int i = 0; i < shopCampaigns_.size(); i++) {
                output.writeMessage(14, shopCampaigns_.get(i));
            }
            if (collected_ != false) {
                output.writeBool(15, collected_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getAvatarBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, avatar_);
            }
            if (!getNameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
            }
            if (!getUnameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, uname_);
            }
            if (isCollected_ != false) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(4, isCollected_);
            }
            if (newNum_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(5, newNum_);
            }
            if (!getSaleBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, sale_);
            }
            if (!getRecommendTextBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, recommendText_);
            }
            if (!getShopUrlBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, shopUrl_);
            }
            if (!getShopIdBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, shopId_);
            }
            if (!getUserIdBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, userId_);
            }
            if (!getIconBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, icon_);
            }
            for (int i = 0; i < goods_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(12, goods_.get(i));
            }
            if (originOrder_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(13, originOrder_);
            }
            for (int i = 0; i < shopCampaigns_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(14, shopCampaigns_.get(i));
            }
            if (collected_ != false) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(15, collected_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShopsData.Shop)) {
                return super.equals(obj);
            }
            ShopsData.Shop other = (ShopsData.Shop) obj;

            boolean result = true;
            result = result && getAvatar()
                    .equals(other.getAvatar());
            result = result && getName()
                    .equals(other.getName());
            result = result && getUname()
                    .equals(other.getUname());
            result = result && (getIsCollected()
                    == other.getIsCollected());
            result = result && (getNewNum()
                    == other.getNewNum());
            result = result && getSale()
                    .equals(other.getSale());
            result = result && getRecommendText()
                    .equals(other.getRecommendText());
            result = result && getShopUrl()
                    .equals(other.getShopUrl());
            result = result && getShopId()
                    .equals(other.getShopId());
            result = result && getUserId()
                    .equals(other.getUserId());
            result = result && getIcon()
                    .equals(other.getIcon());
            result = result && getGoodsList()
                    .equals(other.getGoodsList());
            result = result && (getOriginOrder()
                    == other.getOriginOrder());
            result = result && getShopCampaignsList()
                    .equals(other.getShopCampaignsList());
            result = result && (getCollected()
                    == other.getCollected());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptorForType().hashCode();
            hash = (37 * hash) + AVATAR_FIELD_NUMBER;
            hash = (53 * hash) + getAvatar().hashCode();
            hash = (37 * hash) + NAME_FIELD_NUMBER;
            hash = (53 * hash) + getName().hashCode();
            hash = (37 * hash) + UNAME_FIELD_NUMBER;
            hash = (53 * hash) + getUname().hashCode();
            hash = (37 * hash) + ISCOLLECTED_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                    getIsCollected());
            hash = (37 * hash) + NEWNUM_FIELD_NUMBER;
            hash = (53 * hash) + getNewNum();
            hash = (37 * hash) + SALE_FIELD_NUMBER;
            hash = (53 * hash) + getSale().hashCode();
            hash = (37 * hash) + RECOMMENDTEXT_FIELD_NUMBER;
            hash = (53 * hash) + getRecommendText().hashCode();
            hash = (37 * hash) + SHOPURL_FIELD_NUMBER;
            hash = (53 * hash) + getShopUrl().hashCode();
            hash = (37 * hash) + SHOPID_FIELD_NUMBER;
            hash = (53 * hash) + getShopId().hashCode();
            hash = (37 * hash) + USERID_FIELD_NUMBER;
            hash = (53 * hash) + getUserId().hashCode();
            hash = (37 * hash) + ICON_FIELD_NUMBER;
            hash = (53 * hash) + getIcon().hashCode();
            if (getGoodsCount() > 0) {
                hash = (37 * hash) + GOODS_FIELD_NUMBER;
                hash = (53 * hash) + getGoodsList().hashCode();
            }
            hash = (37 * hash) + ORIGINORDER_FIELD_NUMBER;
            hash = (53 * hash) + getOriginOrder();
            if (getShopCampaignsCount() > 0) {
                hash = (37 * hash) + SHOPCAMPAIGNS_FIELD_NUMBER;
                hash = (53 * hash) + getShopCampaignsList().hashCode();
            }
            hash = (37 * hash) + COLLECTED_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                    getCollected());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static ShopsData.Shop parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ShopsData.Shop parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ShopsData.Shop parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ShopsData.Shop parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ShopsData.Shop parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static ShopsData.Shop parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static ShopsData.Shop parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static ShopsData.Shop parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static ShopsData.Shop parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static ShopsData.Shop parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(ShopsData.Shop prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code Shop}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:Shop)
                ShopsData.ShopOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ShopsData.internal_static_Shop_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ShopsData.internal_static_Shop_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                ShopsData.Shop.class, ShopsData.Shop.Builder.class);
            }

            // Construct using ShopsData.Shop.newBuilder()
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
                    getGoodsFieldBuilder();
                    getShopCampaignsFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                avatar_ = "";

                name_ = "";

                uname_ = "";

                isCollected_ = false;

                newNum_ = 0;

                sale_ = "";

                recommendText_ = "";

                shopUrl_ = "";

                shopId_ = "";

                userId_ = "";

                icon_ = "";

                if (goodsBuilder_ == null) {
                    goods_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000800);
                } else {
                    goodsBuilder_.clear();
                }
                originOrder_ = 0;

                if (shopCampaignsBuilder_ == null) {
                    shopCampaigns_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00002000);
                } else {
                    shopCampaignsBuilder_.clear();
                }
                collected_ = false;

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return ShopsData.internal_static_Shop_descriptor;
            }

            public ShopsData.Shop getDefaultInstanceForType() {
                return ShopsData.Shop.getDefaultInstance();
            }

            public ShopsData.Shop build() {
                ShopsData.Shop result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public ShopsData.Shop buildPartial() {
                ShopsData.Shop result = new ShopsData.Shop(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                result.avatar_ = avatar_;
                result.name_ = name_;
                result.uname_ = uname_;
                result.isCollected_ = isCollected_;
                result.newNum_ = newNum_;
                result.sale_ = sale_;
                result.recommendText_ = recommendText_;
                result.shopUrl_ = shopUrl_;
                result.shopId_ = shopId_;
                result.userId_ = userId_;
                result.icon_ = icon_;
                if (goodsBuilder_ == null) {
                    if (((bitField0_ & 0x00000800) == 0x00000800)) {
                        goods_ = java.util.Collections.unmodifiableList(goods_);
                        bitField0_ = (bitField0_ & ~0x00000800);
                    }
                    result.goods_ = goods_;
                } else {
                    result.goods_ = goodsBuilder_.build();
                }
                result.originOrder_ = originOrder_;
                if (shopCampaignsBuilder_ == null) {
                    if (((bitField0_ & 0x00002000) == 0x00002000)) {
                        shopCampaigns_ = java.util.Collections.unmodifiableList(shopCampaigns_);
                        bitField0_ = (bitField0_ & ~0x00002000);
                    }
                    result.shopCampaigns_ = shopCampaigns_;
                } else {
                    result.shopCampaigns_ = shopCampaignsBuilder_.build();
                }
                result.collected_ = collected_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }

            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof ShopsData.Shop) {
                    return mergeFrom((ShopsData.Shop) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(ShopsData.Shop other) {
                if (other == ShopsData.Shop.getDefaultInstance()) return this;
                if (!other.getAvatar().isEmpty()) {
                    avatar_ = other.avatar_;
                    onChanged();
                }
                if (!other.getName().isEmpty()) {
                    name_ = other.name_;
                    onChanged();
                }
                if (!other.getUname().isEmpty()) {
                    uname_ = other.uname_;
                    onChanged();
                }
                if (other.getIsCollected() != false) {
                    setIsCollected(other.getIsCollected());
                }
                if (other.getNewNum() != 0) {
                    setNewNum(other.getNewNum());
                }
                if (!other.getSale().isEmpty()) {
                    sale_ = other.sale_;
                    onChanged();
                }
                if (!other.getRecommendText().isEmpty()) {
                    recommendText_ = other.recommendText_;
                    onChanged();
                }
                if (!other.getShopUrl().isEmpty()) {
                    shopUrl_ = other.shopUrl_;
                    onChanged();
                }
                if (!other.getShopId().isEmpty()) {
                    shopId_ = other.shopId_;
                    onChanged();
                }
                if (!other.getUserId().isEmpty()) {
                    userId_ = other.userId_;
                    onChanged();
                }
                if (!other.getIcon().isEmpty()) {
                    icon_ = other.icon_;
                    onChanged();
                }
                if (goodsBuilder_ == null) {
                    if (!other.goods_.isEmpty()) {
                        if (goods_.isEmpty()) {
                            goods_ = other.goods_;
                            bitField0_ = (bitField0_ & ~0x00000800);
                        } else {
                            ensureGoodsIsMutable();
                            goods_.addAll(other.goods_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.goods_.isEmpty()) {
                        if (goodsBuilder_.isEmpty()) {
                            goodsBuilder_.dispose();
                            goodsBuilder_ = null;
                            goods_ = other.goods_;
                            bitField0_ = (bitField0_ & ~0x00000800);
                            goodsBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getGoodsFieldBuilder() : null;
                        } else {
                            goodsBuilder_.addAllMessages(other.goods_);
                        }
                    }
                }
                if (other.getOriginOrder() != 0) {
                    setOriginOrder(other.getOriginOrder());
                }
                if (shopCampaignsBuilder_ == null) {
                    if (!other.shopCampaigns_.isEmpty()) {
                        if (shopCampaigns_.isEmpty()) {
                            shopCampaigns_ = other.shopCampaigns_;
                            bitField0_ = (bitField0_ & ~0x00002000);
                        } else {
                            ensureShopCampaignsIsMutable();
                            shopCampaigns_.addAll(other.shopCampaigns_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.shopCampaigns_.isEmpty()) {
                        if (shopCampaignsBuilder_.isEmpty()) {
                            shopCampaignsBuilder_.dispose();
                            shopCampaignsBuilder_ = null;
                            shopCampaigns_ = other.shopCampaigns_;
                            bitField0_ = (bitField0_ & ~0x00002000);
                            shopCampaignsBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getShopCampaignsFieldBuilder() : null;
                        } else {
                            shopCampaignsBuilder_.addAllMessages(other.shopCampaigns_);
                        }
                    }
                }
                if (other.getCollected() != false) {
                    setCollected(other.getCollected());
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                ShopsData.Shop parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (ShopsData.Shop) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            private Object avatar_ = "";

            /**
             * <pre>
             * ": "http
             * </pre>
             * <p>
             * <code>optional string avatar = 1;</code>
             */
            public String getAvatar() {
                Object ref = avatar_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    avatar_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <pre>
             * ": "http
             * </pre>
             * <p>
             * <code>optional string avatar = 1;</code>
             */
            public com.google.protobuf.ByteString
            getAvatarBytes() {
                Object ref = avatar_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    avatar_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <pre>
             * ": "http
             * </pre>
             * <p>
             * <code>optional string avatar = 1;</code>
             */
            public Builder setAvatar(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                avatar_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "http
             * </pre>
             * <p>
             * <code>optional string avatar = 1;</code>
             */
            public Builder clearAvatar() {

                avatar_ = getDefaultInstance().getAvatar();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "http
             * </pre>
             * <p>
             * <code>optional string avatar = 1;</code>
             */
            public Builder setAvatarBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                avatar_ = value;
                onChanged();
                return this;
            }

            private Object name_ = "";

            /**
             * <pre>
             * ": "颜料袋家xx
             * </pre>
             * <p>
             * <code>optional string name = 2;</code>
             */
            public String getName() {
                Object ref = name_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    name_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <pre>
             * ": "颜料袋家xx
             * </pre>
             * <p>
             * <code>optional string name = 2;</code>
             */
            public com.google.protobuf.ByteString
            getNameBytes() {
                Object ref = name_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    name_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <pre>
             * ": "颜料袋家xx
             * </pre>
             * <p>
             * <code>optional string name = 2;</code>
             */
            public Builder setName(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                name_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "颜料袋家xx
             * </pre>
             * <p>
             * <code>optional string name = 2;</code>
             */
            public Builder clearName() {

                name_ = getDefaultInstance().getName();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "颜料袋家xx
             * </pre>
             * <p>
             * <code>optional string name = 2;</code>
             */
            public Builder setNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                name_ = value;
                onChanged();
                return this;
            }

            private Object uname_ = "";

            /**
             * <pre>
             * ": "袋子Bab
             * </pre>
             * <p>
             * <code>optional string uname = 3;</code>
             */
            public String getUname() {
                Object ref = uname_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    uname_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <pre>
             * ": "袋子Bab
             * </pre>
             * <p>
             * <code>optional string uname = 3;</code>
             */
            public com.google.protobuf.ByteString
            getUnameBytes() {
                Object ref = uname_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    uname_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <pre>
             * ": "袋子Bab
             * </pre>
             * <p>
             * <code>optional string uname = 3;</code>
             */
            public Builder setUname(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                uname_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "袋子Bab
             * </pre>
             * <p>
             * <code>optional string uname = 3;</code>
             */
            public Builder clearUname() {

                uname_ = getDefaultInstance().getUname();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "袋子Bab
             * </pre>
             * <p>
             * <code>optional string uname = 3;</code>
             */
            public Builder setUnameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                uname_ = value;
                onChanged();
                return this;
            }

            private boolean isCollected_;

            /**
             * <pre>
             * ":
             * </pre>
             * <p>
             * <code>optional bool isCollected = 4;</code>
             */
            public boolean getIsCollected() {
                return isCollected_;
            }

            /**
             * <pre>
             * ":
             * </pre>
             * <p>
             * <code>optional bool isCollected = 4;</code>
             */
            public Builder setIsCollected(boolean value) {

                isCollected_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ":
             * </pre>
             * <p>
             * <code>optional bool isCollected = 4;</code>
             */
            public Builder clearIsCollected() {

                isCollected_ = false;
                onChanged();
                return this;
            }

            private int newNum_;

            /**
             * <pre>
             * ": 2,
             * </pre>
             * <p>
             * <code>optional int32 newNum = 5;</code>
             */
            public int getNewNum() {
                return newNum_;
            }

            /**
             * <pre>
             * ": 2,
             * </pre>
             * <p>
             * <code>optional int32 newNum = 5;</code>
             */
            public Builder setNewNum(int value) {

                newNum_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": 2,
             * </pre>
             * <p>
             * <code>optional int32 newNum = 5;</code>
             */
            public Builder clearNewNum() {

                newNum_ = 0;
                onChanged();
                return this;
            }

            private Object sale_ = "";

            /**
             * <pre>
             * ": "销量:586
             * </pre>
             * <p>
             * <code>optional string sale = 6;</code>
             */
            public String getSale() {
                Object ref = sale_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    sale_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <pre>
             * ": "销量:586
             * </pre>
             * <p>
             * <code>optional string sale = 6;</code>
             */
            public com.google.protobuf.ByteString
            getSaleBytes() {
                Object ref = sale_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    sale_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <pre>
             * ": "销量:586
             * </pre>
             * <p>
             * <code>optional string sale = 6;</code>
             */
            public Builder setSale(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                sale_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "销量:586
             * </pre>
             * <p>
             * <code>optional string sale = 6;</code>
             */
            public Builder clearSale() {

                sale_ = getDefaultInstance().getSale();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "销量:586
             * </pre>
             * <p>
             * <code>optional string sale = 6;</code>
             */
            public Builder setSaleBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                sale_ = value;
                onChanged();
                return this;
            }

            private Object recommendText_ = "";

            /**
             * <pre>
             * "
             * </pre>
             * <p>
             * <code>optional string recommendText = 7;</code>
             */
            public String getRecommendText() {
                Object ref = recommendText_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    recommendText_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <pre>
             * "
             * </pre>
             * <p>
             * <code>optional string recommendText = 7;</code>
             */
            public com.google.protobuf.ByteString
            getRecommendTextBytes() {
                Object ref = recommendText_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    recommendText_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <pre>
             * "
             * </pre>
             * <p>
             * <code>optional string recommendText = 7;</code>
             */
            public Builder setRecommendText(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                recommendText_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * "
             * </pre>
             * <p>
             * <code>optional string recommendText = 7;</code>
             */
            public Builder clearRecommendText() {

                recommendText_ = getDefaultInstance().getRecommendText();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * "
             * </pre>
             * <p>
             * <code>optional string recommendText = 7;</code>
             */
            public Builder setRecommendTextBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                recommendText_ = value;
                onChanged();
                return this;
            }

            private Object shopUrl_ = "";

            /**
             * <pre>
             * ": "mgj
             * </pre>
             * <p>
             * <code>optional string shopUrl = 8;</code>
             */
            public String getShopUrl() {
                Object ref = shopUrl_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    shopUrl_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <pre>
             * ": "mgj
             * </pre>
             * <p>
             * <code>optional string shopUrl = 8;</code>
             */
            public com.google.protobuf.ByteString
            getShopUrlBytes() {
                Object ref = shopUrl_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    shopUrl_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <pre>
             * ": "mgj
             * </pre>
             * <p>
             * <code>optional string shopUrl = 8;</code>
             */
            public Builder setShopUrl(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                shopUrl_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "mgj
             * </pre>
             * <p>
             * <code>optional string shopUrl = 8;</code>
             */
            public Builder clearShopUrl() {

                shopUrl_ = getDefaultInstance().getShopUrl();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "mgj
             * </pre>
             * <p>
             * <code>optional string shopUrl = 8;</code>
             */
            public Builder setShopUrlBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                shopUrl_ = value;
                onChanged();
                return this;
            }

            private Object shopId_ = "";

            /**
             * <pre>
             * ": "14t9
             * </pre>
             * <p>
             * <code>optional string shopId = 9;</code>
             */
            public String getShopId() {
                Object ref = shopId_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    shopId_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <pre>
             * ": "14t9
             * </pre>
             * <p>
             * <code>optional string shopId = 9;</code>
             */
            public com.google.protobuf.ByteString
            getShopIdBytes() {
                Object ref = shopId_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    shopId_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <pre>
             * ": "14t9
             * </pre>
             * <p>
             * <code>optional string shopId = 9;</code>
             */
            public Builder setShopId(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                shopId_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "14t9
             * </pre>
             * <p>
             * <code>optional string shopId = 9;</code>
             */
            public Builder clearShopId() {

                shopId_ = getDefaultInstance().getShopId();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "14t9
             * </pre>
             * <p>
             * <code>optional string shopId = 9;</code>
             */
            public Builder setShopIdBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                shopId_ = value;
                onChanged();
                return this;
            }

            private Object userId_ = "";

            /**
             * <pre>
             * ": "12rt
             * </pre>
             * <p>
             * <code>optional string userId = 10;</code>
             */
            public String getUserId() {
                Object ref = userId_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    userId_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <pre>
             * ": "12rt
             * </pre>
             * <p>
             * <code>optional string userId = 10;</code>
             */
            public com.google.protobuf.ByteString
            getUserIdBytes() {
                Object ref = userId_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    userId_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <pre>
             * ": "12rt
             * </pre>
             * <p>
             * <code>optional string userId = 10;</code>
             */
            public Builder setUserId(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                userId_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "12rt
             * </pre>
             * <p>
             * <code>optional string userId = 10;</code>
             */
            public Builder clearUserId() {

                userId_ = getDefaultInstance().getUserId();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "12rt
             * </pre>
             * <p>
             * <code>optional string userId = 10;</code>
             */
            public Builder setUserIdBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                userId_ = value;
                onChanged();
                return this;
            }

            private Object icon_ = "";

            /**
             * <pre>
             * ": "",
             * </pre>
             * <p>
             * <code>optional string icon = 11;</code>
             */
            public String getIcon() {
                Object ref = icon_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    icon_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <pre>
             * ": "",
             * </pre>
             * <p>
             * <code>optional string icon = 11;</code>
             */
            public com.google.protobuf.ByteString
            getIconBytes() {
                Object ref = icon_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    icon_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <pre>
             * ": "",
             * </pre>
             * <p>
             * <code>optional string icon = 11;</code>
             */
            public Builder setIcon(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                icon_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "",
             * </pre>
             * <p>
             * <code>optional string icon = 11;</code>
             */
            public Builder clearIcon() {

                icon_ = getDefaultInstance().getIcon();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "",
             * </pre>
             * <p>
             * <code>optional string icon = 11;</code>
             */
            public Builder setIconBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                icon_ = value;
                onChanged();
                return this;
            }

            private java.util.List<Goods> goods_ =
                    java.util.Collections.emptyList();

            private void ensureGoodsIsMutable() {
                if (!((bitField0_ & 0x00000800) == 0x00000800)) {
                    goods_ = new java.util.ArrayList<Goods>(goods_);
                    bitField0_ |= 0x00000800;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    ShopsData.Goods, ShopsData.Goods.Builder, ShopsData.GoodsOrBuilder> goodsBuilder_;

            /**
             * <pre>
             *    List&lt;Goods&gt;goods;
             * </pre>
             * <p>
             * <code>repeated .Goods goods = 12;</code>
             */
            public java.util.List<Goods> getGoodsList() {
                if (goodsBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(goods_);
                } else {
                    return goodsBuilder_.getMessageList();
                }
            }

            /**
             * <pre>
             *    List&lt;Goods&gt;goods;
             * </pre>
             * <p>
             * <code>repeated .Goods goods = 12;</code>
             */
            public int getGoodsCount() {
                if (goodsBuilder_ == null) {
                    return goods_.size();
                } else {
                    return goodsBuilder_.getCount();
                }
            }

            /**
             * <pre>
             *    List&lt;Goods&gt;goods;
             * </pre>
             * <p>
             * <code>repeated .Goods goods = 12;</code>
             */
            public ShopsData.Goods getGoods(int index) {
                if (goodsBuilder_ == null) {
                    return goods_.get(index);
                } else {
                    return goodsBuilder_.getMessage(index);
                }
            }

            /**
             * <pre>
             *    List&lt;Goods&gt;goods;
             * </pre>
             * <p>
             * <code>repeated .Goods goods = 12;</code>
             */
            public Builder setGoods(
                    int index, ShopsData.Goods value) {
                if (goodsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureGoodsIsMutable();
                    goods_.set(index, value);
                    onChanged();
                } else {
                    goodsBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <pre>
             *    List&lt;Goods&gt;goods;
             * </pre>
             * <p>
             * <code>repeated .Goods goods = 12;</code>
             */
            public Builder setGoods(
                    int index, ShopsData.Goods.Builder builderForValue) {
                if (goodsBuilder_ == null) {
                    ensureGoodsIsMutable();
                    goods_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    goodsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <pre>
             *    List&lt;Goods&gt;goods;
             * </pre>
             * <p>
             * <code>repeated .Goods goods = 12;</code>
             */
            public Builder addGoods(ShopsData.Goods value) {
                if (goodsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureGoodsIsMutable();
                    goods_.add(value);
                    onChanged();
                } else {
                    goodsBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <pre>
             *    List&lt;Goods&gt;goods;
             * </pre>
             * <p>
             * <code>repeated .Goods goods = 12;</code>
             */
            public Builder addGoods(
                    int index, ShopsData.Goods value) {
                if (goodsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureGoodsIsMutable();
                    goods_.add(index, value);
                    onChanged();
                } else {
                    goodsBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <pre>
             *    List&lt;Goods&gt;goods;
             * </pre>
             * <p>
             * <code>repeated .Goods goods = 12;</code>
             */
            public Builder addGoods(
                    ShopsData.Goods.Builder builderForValue) {
                if (goodsBuilder_ == null) {
                    ensureGoodsIsMutable();
                    goods_.add(builderForValue.build());
                    onChanged();
                } else {
                    goodsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <pre>
             *    List&lt;Goods&gt;goods;
             * </pre>
             * <p>
             * <code>repeated .Goods goods = 12;</code>
             */
            public Builder addGoods(
                    int index, ShopsData.Goods.Builder builderForValue) {
                if (goodsBuilder_ == null) {
                    ensureGoodsIsMutable();
                    goods_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    goodsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <pre>
             *    List&lt;Goods&gt;goods;
             * </pre>
             * <p>
             * <code>repeated .Goods goods = 12;</code>
             */
            public Builder addAllGoods(
                    Iterable<? extends Goods> values) {
                if (goodsBuilder_ == null) {
                    ensureGoodsIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, goods_);
                    onChanged();
                } else {
                    goodsBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <pre>
             *    List&lt;Goods&gt;goods;
             * </pre>
             * <p>
             * <code>repeated .Goods goods = 12;</code>
             */
            public Builder clearGoods() {
                if (goodsBuilder_ == null) {
                    goods_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000800);
                    onChanged();
                } else {
                    goodsBuilder_.clear();
                }
                return this;
            }

            /**
             * <pre>
             *    List&lt;Goods&gt;goods;
             * </pre>
             * <p>
             * <code>repeated .Goods goods = 12;</code>
             */
            public Builder removeGoods(int index) {
                if (goodsBuilder_ == null) {
                    ensureGoodsIsMutable();
                    goods_.remove(index);
                    onChanged();
                } else {
                    goodsBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <pre>
             *    List&lt;Goods&gt;goods;
             * </pre>
             * <p>
             * <code>repeated .Goods goods = 12;</code>
             */
            public ShopsData.Goods.Builder getGoodsBuilder(
                    int index) {
                return getGoodsFieldBuilder().getBuilder(index);
            }

            /**
             * <pre>
             *    List&lt;Goods&gt;goods;
             * </pre>
             * <p>
             * <code>repeated .Goods goods = 12;</code>
             */
            public ShopsData.GoodsOrBuilder getGoodsOrBuilder(
                    int index) {
                if (goodsBuilder_ == null) {
                    return goods_.get(index);
                } else {
                    return goodsBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <pre>
             *    List&lt;Goods&gt;goods;
             * </pre>
             * <p>
             * <code>repeated .Goods goods = 12;</code>
             */
            public java.util.List<? extends GoodsOrBuilder>
            getGoodsOrBuilderList() {
                if (goodsBuilder_ != null) {
                    return goodsBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(goods_);
                }
            }

            /**
             * <pre>
             *    List&lt;Goods&gt;goods;
             * </pre>
             * <p>
             * <code>repeated .Goods goods = 12;</code>
             */
            public ShopsData.Goods.Builder addGoodsBuilder() {
                return getGoodsFieldBuilder().addBuilder(
                        ShopsData.Goods.getDefaultInstance());
            }

            /**
             * <pre>
             *    List&lt;Goods&gt;goods;
             * </pre>
             * <p>
             * <code>repeated .Goods goods = 12;</code>
             */
            public ShopsData.Goods.Builder addGoodsBuilder(
                    int index) {
                return getGoodsFieldBuilder().addBuilder(
                        index, ShopsData.Goods.getDefaultInstance());
            }

            /**
             * <pre>
             *    List&lt;Goods&gt;goods;
             * </pre>
             * <p>
             * <code>repeated .Goods goods = 12;</code>
             */
            public java.util.List<Goods.Builder>
            getGoodsBuilderList() {
                return getGoodsFieldBuilder().getBuilderList();
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    ShopsData.Goods, ShopsData.Goods.Builder, ShopsData.GoodsOrBuilder>
            getGoodsFieldBuilder() {
                if (goodsBuilder_ == null) {
                    goodsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            ShopsData.Goods, ShopsData.Goods.Builder, ShopsData.GoodsOrBuilder>(
                            goods_,
                            ((bitField0_ & 0x00000800) == 0x00000800),
                            getParentForChildren(),
                            isClean());
                    goods_ = null;
                }
                return goodsBuilder_;
            }

            private int originOrder_;

            /**
             * <code>optional int32 originOrder = 13;</code>
             */
            public int getOriginOrder() {
                return originOrder_;
            }

            /**
             * <code>optional int32 originOrder = 13;</code>
             */
            public Builder setOriginOrder(int value) {

                originOrder_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional int32 originOrder = 13;</code>
             */
            public Builder clearOriginOrder() {

                originOrder_ = 0;
                onChanged();
                return this;
            }

            private java.util.List<Campaign> shopCampaigns_ =
                    java.util.Collections.emptyList();

            private void ensureShopCampaignsIsMutable() {
                if (!((bitField0_ & 0x00002000) == 0x00002000)) {
                    shopCampaigns_ = new java.util.ArrayList<Campaign>(shopCampaigns_);
                    bitField0_ |= 0x00002000;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    ShopsData.Campaign, ShopsData.Campaign.Builder, ShopsData.CampaignOrBuilder> shopCampaignsBuilder_;

            /**
             * <pre>
             *    List&lt;Campaign&gt;shopCampaigns;
             * </pre>
             * <p>
             * <code>repeated .Campaign shopCampaigns = 14;</code>
             */
            public java.util.List<Campaign> getShopCampaignsList() {
                if (shopCampaignsBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(shopCampaigns_);
                } else {
                    return shopCampaignsBuilder_.getMessageList();
                }
            }

            /**
             * <pre>
             *    List&lt;Campaign&gt;shopCampaigns;
             * </pre>
             * <p>
             * <code>repeated .Campaign shopCampaigns = 14;</code>
             */
            public int getShopCampaignsCount() {
                if (shopCampaignsBuilder_ == null) {
                    return shopCampaigns_.size();
                } else {
                    return shopCampaignsBuilder_.getCount();
                }
            }

            /**
             * <pre>
             *    List&lt;Campaign&gt;shopCampaigns;
             * </pre>
             * <p>
             * <code>repeated .Campaign shopCampaigns = 14;</code>
             */
            public ShopsData.Campaign getShopCampaigns(int index) {
                if (shopCampaignsBuilder_ == null) {
                    return shopCampaigns_.get(index);
                } else {
                    return shopCampaignsBuilder_.getMessage(index);
                }
            }

            /**
             * <pre>
             *    List&lt;Campaign&gt;shopCampaigns;
             * </pre>
             * <p>
             * <code>repeated .Campaign shopCampaigns = 14;</code>
             */
            public Builder setShopCampaigns(
                    int index, ShopsData.Campaign value) {
                if (shopCampaignsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureShopCampaignsIsMutable();
                    shopCampaigns_.set(index, value);
                    onChanged();
                } else {
                    shopCampaignsBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <pre>
             *    List&lt;Campaign&gt;shopCampaigns;
             * </pre>
             * <p>
             * <code>repeated .Campaign shopCampaigns = 14;</code>
             */
            public Builder setShopCampaigns(
                    int index, ShopsData.Campaign.Builder builderForValue) {
                if (shopCampaignsBuilder_ == null) {
                    ensureShopCampaignsIsMutable();
                    shopCampaigns_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    shopCampaignsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <pre>
             *    List&lt;Campaign&gt;shopCampaigns;
             * </pre>
             * <p>
             * <code>repeated .Campaign shopCampaigns = 14;</code>
             */
            public Builder addShopCampaigns(ShopsData.Campaign value) {
                if (shopCampaignsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureShopCampaignsIsMutable();
                    shopCampaigns_.add(value);
                    onChanged();
                } else {
                    shopCampaignsBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <pre>
             *    List&lt;Campaign&gt;shopCampaigns;
             * </pre>
             * <p>
             * <code>repeated .Campaign shopCampaigns = 14;</code>
             */
            public Builder addShopCampaigns(
                    int index, ShopsData.Campaign value) {
                if (shopCampaignsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureShopCampaignsIsMutable();
                    shopCampaigns_.add(index, value);
                    onChanged();
                } else {
                    shopCampaignsBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <pre>
             *    List&lt;Campaign&gt;shopCampaigns;
             * </pre>
             * <p>
             * <code>repeated .Campaign shopCampaigns = 14;</code>
             */
            public Builder addShopCampaigns(
                    ShopsData.Campaign.Builder builderForValue) {
                if (shopCampaignsBuilder_ == null) {
                    ensureShopCampaignsIsMutable();
                    shopCampaigns_.add(builderForValue.build());
                    onChanged();
                } else {
                    shopCampaignsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <pre>
             *    List&lt;Campaign&gt;shopCampaigns;
             * </pre>
             * <p>
             * <code>repeated .Campaign shopCampaigns = 14;</code>
             */
            public Builder addShopCampaigns(
                    int index, ShopsData.Campaign.Builder builderForValue) {
                if (shopCampaignsBuilder_ == null) {
                    ensureShopCampaignsIsMutable();
                    shopCampaigns_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    shopCampaignsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <pre>
             *    List&lt;Campaign&gt;shopCampaigns;
             * </pre>
             * <p>
             * <code>repeated .Campaign shopCampaigns = 14;</code>
             */
            public Builder addAllShopCampaigns(
                    Iterable<? extends Campaign> values) {
                if (shopCampaignsBuilder_ == null) {
                    ensureShopCampaignsIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, shopCampaigns_);
                    onChanged();
                } else {
                    shopCampaignsBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <pre>
             *    List&lt;Campaign&gt;shopCampaigns;
             * </pre>
             * <p>
             * <code>repeated .Campaign shopCampaigns = 14;</code>
             */
            public Builder clearShopCampaigns() {
                if (shopCampaignsBuilder_ == null) {
                    shopCampaigns_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00002000);
                    onChanged();
                } else {
                    shopCampaignsBuilder_.clear();
                }
                return this;
            }

            /**
             * <pre>
             *    List&lt;Campaign&gt;shopCampaigns;
             * </pre>
             * <p>
             * <code>repeated .Campaign shopCampaigns = 14;</code>
             */
            public Builder removeShopCampaigns(int index) {
                if (shopCampaignsBuilder_ == null) {
                    ensureShopCampaignsIsMutable();
                    shopCampaigns_.remove(index);
                    onChanged();
                } else {
                    shopCampaignsBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <pre>
             *    List&lt;Campaign&gt;shopCampaigns;
             * </pre>
             * <p>
             * <code>repeated .Campaign shopCampaigns = 14;</code>
             */
            public ShopsData.Campaign.Builder getShopCampaignsBuilder(
                    int index) {
                return getShopCampaignsFieldBuilder().getBuilder(index);
            }

            /**
             * <pre>
             *    List&lt;Campaign&gt;shopCampaigns;
             * </pre>
             * <p>
             * <code>repeated .Campaign shopCampaigns = 14;</code>
             */
            public ShopsData.CampaignOrBuilder getShopCampaignsOrBuilder(
                    int index) {
                if (shopCampaignsBuilder_ == null) {
                    return shopCampaigns_.get(index);
                } else {
                    return shopCampaignsBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <pre>
             *    List&lt;Campaign&gt;shopCampaigns;
             * </pre>
             * <p>
             * <code>repeated .Campaign shopCampaigns = 14;</code>
             */
            public java.util.List<? extends CampaignOrBuilder>
            getShopCampaignsOrBuilderList() {
                if (shopCampaignsBuilder_ != null) {
                    return shopCampaignsBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(shopCampaigns_);
                }
            }

            /**
             * <pre>
             *    List&lt;Campaign&gt;shopCampaigns;
             * </pre>
             * <p>
             * <code>repeated .Campaign shopCampaigns = 14;</code>
             */
            public ShopsData.Campaign.Builder addShopCampaignsBuilder() {
                return getShopCampaignsFieldBuilder().addBuilder(
                        ShopsData.Campaign.getDefaultInstance());
            }

            /**
             * <pre>
             *    List&lt;Campaign&gt;shopCampaigns;
             * </pre>
             * <p>
             * <code>repeated .Campaign shopCampaigns = 14;</code>
             */
            public ShopsData.Campaign.Builder addShopCampaignsBuilder(
                    int index) {
                return getShopCampaignsFieldBuilder().addBuilder(
                        index, ShopsData.Campaign.getDefaultInstance());
            }

            /**
             * <pre>
             *    List&lt;Campaign&gt;shopCampaigns;
             * </pre>
             * <p>
             * <code>repeated .Campaign shopCampaigns = 14;</code>
             */
            public java.util.List<Campaign.Builder>
            getShopCampaignsBuilderList() {
                return getShopCampaignsFieldBuilder().getBuilderList();
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    ShopsData.Campaign, ShopsData.Campaign.Builder, ShopsData.CampaignOrBuilder>
            getShopCampaignsFieldBuilder() {
                if (shopCampaignsBuilder_ == null) {
                    shopCampaignsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            ShopsData.Campaign, ShopsData.Campaign.Builder, ShopsData.CampaignOrBuilder>(
                            shopCampaigns_,
                            ((bitField0_ & 0x00002000) == 0x00002000),
                            getParentForChildren(),
                            isClean());
                    shopCampaigns_ = null;
                }
                return shopCampaignsBuilder_;
            }

            private boolean collected_;

            /**
             * <code>optional bool collected = 15;</code>
             */
            public boolean getCollected() {
                return collected_;
            }

            /**
             * <code>optional bool collected = 15;</code>
             */
            public Builder setCollected(boolean value) {

                collected_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional bool collected = 15;</code>
             */
            public Builder clearCollected() {

                collected_ = false;
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:Shop)
        }

        // @@protoc_insertion_point(class_scope:Shop)
        private static final ShopsData.Shop DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new ShopsData.Shop();
        }

        public static ShopsData.Shop getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<Shop>
                PARSER = new com.google.protobuf.AbstractParser<Shop>() {
            public Shop parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new Shop(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<Shop> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<Shop> getParserForType() {
            return PARSER;
        }

        public ShopsData.Shop getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface GoodsOrBuilder extends
            // @@protoc_insertion_point(interface_extends:Goods)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * ": "http://
         * </pre>
         * <p>
         * <code>optional string imgUrl = 1;</code>
         */
        String getImgUrl();

        /**
         * <pre>
         * ": "http://
         * </pre>
         * <p>
         * <code>optional string imgUrl = 1;</code>
         */
        com.google.protobuf.ByteString
        getImgUrlBytes();

        /**
         * <pre>
         * ": "1k7lgi8
         * </pre>
         * <p>
         * <code>optional string goodId = 2;</code>
         */
        String getGoodId();

        /**
         * <pre>
         * ": "1k7lgi8
         * </pre>
         * <p>
         * <code>optional string goodId = 2;</code>
         */
        com.google.protobuf.ByteString
        getGoodIdBytes();

        /**
         * <pre>
         * ": "46
         * </pre>
         * <p>
         * <code>optional string originPrice = 3;</code>
         */
        String getOriginPrice();

        /**
         * <pre>
         * ": "46
         * </pre>
         * <p>
         * <code>optional string originPrice = 3;</code>
         */
        com.google.protobuf.ByteString
        getOriginPriceBytes();

        /**
         * <pre>
         * ": "
         * </pre>
         * <p>
         * <code>optional string discountPrice = 4;</code>
         */
        String getDiscountPrice();

        /**
         * <pre>
         * ": "
         * </pre>
         * <p>
         * <code>optional string discountPrice = 4;</code>
         */
        com.google.protobuf.ByteString
        getDiscountPriceBytes();

        /**
         * <pre>
         * ": "mgj://
         * </pre>
         * <p>
         * <code>optional string goodUrl = 5;</code>
         */
        String getGoodUrl();

        /**
         * <pre>
         * ": "mgj://
         * </pre>
         * <p>
         * <code>optional string goodUrl = 5;</code>
         */
        com.google.protobuf.ByteString
        getGoodUrlBytes();
    }

    /**
     * Protobuf type {@code Goods}
     */
    public static final class Goods extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:Goods)
            GoodsOrBuilder {
        // Use Goods.newBuilder() to construct.
        private Goods(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private Goods() {
            imgUrl_ = "";
            goodId_ = "";
            originPrice_ = "";
            discountPrice_ = "";
            goodUrl_ = "";
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private Goods(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            String s = input.readStringRequireUtf8();

                            imgUrl_ = s;
                            break;
                        }
                        case 18: {
                            String s = input.readStringRequireUtf8();

                            goodId_ = s;
                            break;
                        }
                        case 26: {
                            String s = input.readStringRequireUtf8();

                            originPrice_ = s;
                            break;
                        }
                        case 34: {
                            String s = input.readStringRequireUtf8();

                            discountPrice_ = s;
                            break;
                        }
                        case 42: {
                            String s = input.readStringRequireUtf8();

                            goodUrl_ = s;
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
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return ShopsData.internal_static_Goods_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return ShopsData.internal_static_Goods_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            ShopsData.Goods.class, ShopsData.Goods.Builder.class);
        }

        public static final int IMGURL_FIELD_NUMBER = 1;
        private volatile Object imgUrl_;

        /**
         * <pre>
         * ": "http://
         * </pre>
         * <p>
         * <code>optional string imgUrl = 1;</code>
         */
        public String getImgUrl() {
            Object ref = imgUrl_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                imgUrl_ = s;
                return s;
            }
        }

        /**
         * <pre>
         * ": "http://
         * </pre>
         * <p>
         * <code>optional string imgUrl = 1;</code>
         */
        public com.google.protobuf.ByteString
        getImgUrlBytes() {
            Object ref = imgUrl_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                imgUrl_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int GOODID_FIELD_NUMBER = 2;
        private volatile Object goodId_;

        /**
         * <pre>
         * ": "1k7lgi8
         * </pre>
         * <p>
         * <code>optional string goodId = 2;</code>
         */
        public String getGoodId() {
            Object ref = goodId_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                goodId_ = s;
                return s;
            }
        }

        /**
         * <pre>
         * ": "1k7lgi8
         * </pre>
         * <p>
         * <code>optional string goodId = 2;</code>
         */
        public com.google.protobuf.ByteString
        getGoodIdBytes() {
            Object ref = goodId_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                goodId_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int ORIGINPRICE_FIELD_NUMBER = 3;
        private volatile Object originPrice_;

        /**
         * <pre>
         * ": "46
         * </pre>
         * <p>
         * <code>optional string originPrice = 3;</code>
         */
        public String getOriginPrice() {
            Object ref = originPrice_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                originPrice_ = s;
                return s;
            }
        }

        /**
         * <pre>
         * ": "46
         * </pre>
         * <p>
         * <code>optional string originPrice = 3;</code>
         */
        public com.google.protobuf.ByteString
        getOriginPriceBytes() {
            Object ref = originPrice_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                originPrice_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int DISCOUNTPRICE_FIELD_NUMBER = 4;
        private volatile Object discountPrice_;

        /**
         * <pre>
         * ": "
         * </pre>
         * <p>
         * <code>optional string discountPrice = 4;</code>
         */
        public String getDiscountPrice() {
            Object ref = discountPrice_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                discountPrice_ = s;
                return s;
            }
        }

        /**
         * <pre>
         * ": "
         * </pre>
         * <p>
         * <code>optional string discountPrice = 4;</code>
         */
        public com.google.protobuf.ByteString
        getDiscountPriceBytes() {
            Object ref = discountPrice_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                discountPrice_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int GOODURL_FIELD_NUMBER = 5;
        private volatile Object goodUrl_;

        /**
         * <pre>
         * ": "mgj://
         * </pre>
         * <p>
         * <code>optional string goodUrl = 5;</code>
         */
        public String getGoodUrl() {
            Object ref = goodUrl_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                goodUrl_ = s;
                return s;
            }
        }

        /**
         * <pre>
         * ": "mgj://
         * </pre>
         * <p>
         * <code>optional string goodUrl = 5;</code>
         */
        public com.google.protobuf.ByteString
        getGoodUrlBytes() {
            Object ref = goodUrl_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                goodUrl_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
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
            if (!getImgUrlBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, imgUrl_);
            }
            if (!getGoodIdBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, goodId_);
            }
            if (!getOriginPriceBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, originPrice_);
            }
            if (!getDiscountPriceBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 4, discountPrice_);
            }
            if (!getGoodUrlBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 5, goodUrl_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getImgUrlBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, imgUrl_);
            }
            if (!getGoodIdBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, goodId_);
            }
            if (!getOriginPriceBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, originPrice_);
            }
            if (!getDiscountPriceBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, discountPrice_);
            }
            if (!getGoodUrlBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, goodUrl_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShopsData.Goods)) {
                return super.equals(obj);
            }
            ShopsData.Goods other = (ShopsData.Goods) obj;

            boolean result = true;
            result = result && getImgUrl()
                    .equals(other.getImgUrl());
            result = result && getGoodId()
                    .equals(other.getGoodId());
            result = result && getOriginPrice()
                    .equals(other.getOriginPrice());
            result = result && getDiscountPrice()
                    .equals(other.getDiscountPrice());
            result = result && getGoodUrl()
                    .equals(other.getGoodUrl());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptorForType().hashCode();
            hash = (37 * hash) + IMGURL_FIELD_NUMBER;
            hash = (53 * hash) + getImgUrl().hashCode();
            hash = (37 * hash) + GOODID_FIELD_NUMBER;
            hash = (53 * hash) + getGoodId().hashCode();
            hash = (37 * hash) + ORIGINPRICE_FIELD_NUMBER;
            hash = (53 * hash) + getOriginPrice().hashCode();
            hash = (37 * hash) + DISCOUNTPRICE_FIELD_NUMBER;
            hash = (53 * hash) + getDiscountPrice().hashCode();
            hash = (37 * hash) + GOODURL_FIELD_NUMBER;
            hash = (53 * hash) + getGoodUrl().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static ShopsData.Goods parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ShopsData.Goods parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ShopsData.Goods parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ShopsData.Goods parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ShopsData.Goods parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static ShopsData.Goods parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static ShopsData.Goods parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static ShopsData.Goods parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static ShopsData.Goods parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static ShopsData.Goods parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(ShopsData.Goods prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code Goods}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:Goods)
                ShopsData.GoodsOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ShopsData.internal_static_Goods_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ShopsData.internal_static_Goods_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                ShopsData.Goods.class, ShopsData.Goods.Builder.class);
            }

            // Construct using ShopsData.Goods.newBuilder()
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

            public Builder clear() {
                super.clear();
                imgUrl_ = "";

                goodId_ = "";

                originPrice_ = "";

                discountPrice_ = "";

                goodUrl_ = "";

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return ShopsData.internal_static_Goods_descriptor;
            }

            public ShopsData.Goods getDefaultInstanceForType() {
                return ShopsData.Goods.getDefaultInstance();
            }

            public ShopsData.Goods build() {
                ShopsData.Goods result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public ShopsData.Goods buildPartial() {
                ShopsData.Goods result = new ShopsData.Goods(this);
                result.imgUrl_ = imgUrl_;
                result.goodId_ = goodId_;
                result.originPrice_ = originPrice_;
                result.discountPrice_ = discountPrice_;
                result.goodUrl_ = goodUrl_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }

            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof ShopsData.Goods) {
                    return mergeFrom((ShopsData.Goods) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(ShopsData.Goods other) {
                if (other == ShopsData.Goods.getDefaultInstance()) return this;
                if (!other.getImgUrl().isEmpty()) {
                    imgUrl_ = other.imgUrl_;
                    onChanged();
                }
                if (!other.getGoodId().isEmpty()) {
                    goodId_ = other.goodId_;
                    onChanged();
                }
                if (!other.getOriginPrice().isEmpty()) {
                    originPrice_ = other.originPrice_;
                    onChanged();
                }
                if (!other.getDiscountPrice().isEmpty()) {
                    discountPrice_ = other.discountPrice_;
                    onChanged();
                }
                if (!other.getGoodUrl().isEmpty()) {
                    goodUrl_ = other.goodUrl_;
                    onChanged();
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                ShopsData.Goods parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (ShopsData.Goods) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private Object imgUrl_ = "";

            /**
             * <pre>
             * ": "http://
             * </pre>
             * <p>
             * <code>optional string imgUrl = 1;</code>
             */
            public String getImgUrl() {
                Object ref = imgUrl_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    imgUrl_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <pre>
             * ": "http://
             * </pre>
             * <p>
             * <code>optional string imgUrl = 1;</code>
             */
            public com.google.protobuf.ByteString
            getImgUrlBytes() {
                Object ref = imgUrl_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    imgUrl_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <pre>
             * ": "http://
             * </pre>
             * <p>
             * <code>optional string imgUrl = 1;</code>
             */
            public Builder setImgUrl(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                imgUrl_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "http://
             * </pre>
             * <p>
             * <code>optional string imgUrl = 1;</code>
             */
            public Builder clearImgUrl() {

                imgUrl_ = getDefaultInstance().getImgUrl();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "http://
             * </pre>
             * <p>
             * <code>optional string imgUrl = 1;</code>
             */
            public Builder setImgUrlBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                imgUrl_ = value;
                onChanged();
                return this;
            }

            private Object goodId_ = "";

            /**
             * <pre>
             * ": "1k7lgi8
             * </pre>
             * <p>
             * <code>optional string goodId = 2;</code>
             */
            public String getGoodId() {
                Object ref = goodId_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    goodId_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <pre>
             * ": "1k7lgi8
             * </pre>
             * <p>
             * <code>optional string goodId = 2;</code>
             */
            public com.google.protobuf.ByteString
            getGoodIdBytes() {
                Object ref = goodId_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    goodId_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <pre>
             * ": "1k7lgi8
             * </pre>
             * <p>
             * <code>optional string goodId = 2;</code>
             */
            public Builder setGoodId(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                goodId_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "1k7lgi8
             * </pre>
             * <p>
             * <code>optional string goodId = 2;</code>
             */
            public Builder clearGoodId() {

                goodId_ = getDefaultInstance().getGoodId();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "1k7lgi8
             * </pre>
             * <p>
             * <code>optional string goodId = 2;</code>
             */
            public Builder setGoodIdBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                goodId_ = value;
                onChanged();
                return this;
            }

            private Object originPrice_ = "";

            /**
             * <pre>
             * ": "46
             * </pre>
             * <p>
             * <code>optional string originPrice = 3;</code>
             */
            public String getOriginPrice() {
                Object ref = originPrice_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    originPrice_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <pre>
             * ": "46
             * </pre>
             * <p>
             * <code>optional string originPrice = 3;</code>
             */
            public com.google.protobuf.ByteString
            getOriginPriceBytes() {
                Object ref = originPrice_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    originPrice_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <pre>
             * ": "46
             * </pre>
             * <p>
             * <code>optional string originPrice = 3;</code>
             */
            public Builder setOriginPrice(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                originPrice_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "46
             * </pre>
             * <p>
             * <code>optional string originPrice = 3;</code>
             */
            public Builder clearOriginPrice() {

                originPrice_ = getDefaultInstance().getOriginPrice();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "46
             * </pre>
             * <p>
             * <code>optional string originPrice = 3;</code>
             */
            public Builder setOriginPriceBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                originPrice_ = value;
                onChanged();
                return this;
            }

            private Object discountPrice_ = "";

            /**
             * <pre>
             * ": "
             * </pre>
             * <p>
             * <code>optional string discountPrice = 4;</code>
             */
            public String getDiscountPrice() {
                Object ref = discountPrice_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    discountPrice_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <pre>
             * ": "
             * </pre>
             * <p>
             * <code>optional string discountPrice = 4;</code>
             */
            public com.google.protobuf.ByteString
            getDiscountPriceBytes() {
                Object ref = discountPrice_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    discountPrice_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <pre>
             * ": "
             * </pre>
             * <p>
             * <code>optional string discountPrice = 4;</code>
             */
            public Builder setDiscountPrice(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                discountPrice_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "
             * </pre>
             * <p>
             * <code>optional string discountPrice = 4;</code>
             */
            public Builder clearDiscountPrice() {

                discountPrice_ = getDefaultInstance().getDiscountPrice();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "
             * </pre>
             * <p>
             * <code>optional string discountPrice = 4;</code>
             */
            public Builder setDiscountPriceBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                discountPrice_ = value;
                onChanged();
                return this;
            }

            private Object goodUrl_ = "";

            /**
             * <pre>
             * ": "mgj://
             * </pre>
             * <p>
             * <code>optional string goodUrl = 5;</code>
             */
            public String getGoodUrl() {
                Object ref = goodUrl_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    goodUrl_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <pre>
             * ": "mgj://
             * </pre>
             * <p>
             * <code>optional string goodUrl = 5;</code>
             */
            public com.google.protobuf.ByteString
            getGoodUrlBytes() {
                Object ref = goodUrl_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    goodUrl_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <pre>
             * ": "mgj://
             * </pre>
             * <p>
             * <code>optional string goodUrl = 5;</code>
             */
            public Builder setGoodUrl(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                goodUrl_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "mgj://
             * </pre>
             * <p>
             * <code>optional string goodUrl = 5;</code>
             */
            public Builder clearGoodUrl() {

                goodUrl_ = getDefaultInstance().getGoodUrl();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "mgj://
             * </pre>
             * <p>
             * <code>optional string goodUrl = 5;</code>
             */
            public Builder setGoodUrlBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                goodUrl_ = value;
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:Goods)
        }

        // @@protoc_insertion_point(class_scope:Goods)
        private static final ShopsData.Goods DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new ShopsData.Goods();
        }

        public static ShopsData.Goods getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<Goods>
                PARSER = new com.google.protobuf.AbstractParser<Goods>() {
            public Goods parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new Goods(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<Goods> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<Goods> getParserForType() {
            return PARSER;
        }

        public ShopsData.Goods getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface CampaignOrBuilder extends
            // @@protoc_insertion_point(interface_extends:Campaign)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * ": "99",
         * </pre>
         * <p>
         * <code>optional string limitPrice = 1;</code>
         */
        String getLimitPrice();

        /**
         * <pre>
         * ": "99",
         * </pre>
         * <p>
         * <code>optional string limitPrice = 1;</code>
         */
        com.google.protobuf.ByteString
        getLimitPriceBytes();

        /**
         * <pre>
         * ": "5",
         * </pre>
         * <p>
         * <code>optional string cutPrice = 2;</code>
         */
        String getCutPrice();

        /**
         * <pre>
         * ": "5",
         * </pre>
         * <p>
         * <code>optional string cutPrice = 2;</code>
         */
        com.google.protobuf.ByteString
        getCutPriceBytes();

        /**
         * <pre>
         * ": "满99元立减5元"
         * </pre>
         * <p>
         * <code>optional string campaignDesc = 3;</code>
         */
        String getCampaignDesc();

        /**
         * <pre>
         * ": "满99元立减5元"
         * </pre>
         * <p>
         * <code>optional string campaignDesc = 3;</code>
         */
        com.google.protobuf.ByteString
        getCampaignDescBytes();
    }

    /**
     * Protobuf type {@code Campaign}
     */
    public static final class Campaign extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:Campaign)
            CampaignOrBuilder {
        // Use Campaign.newBuilder() to construct.
        private Campaign(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private Campaign() {
            limitPrice_ = "";
            cutPrice_ = "";
            campaignDesc_ = "";
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private Campaign(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            String s = input.readStringRequireUtf8();

                            limitPrice_ = s;
                            break;
                        }
                        case 18: {
                            String s = input.readStringRequireUtf8();

                            cutPrice_ = s;
                            break;
                        }
                        case 26: {
                            String s = input.readStringRequireUtf8();

                            campaignDesc_ = s;
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
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return ShopsData.internal_static_Campaign_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return ShopsData.internal_static_Campaign_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            ShopsData.Campaign.class, ShopsData.Campaign.Builder.class);
        }

        public static final int LIMITPRICE_FIELD_NUMBER = 1;
        private volatile Object limitPrice_;

        /**
         * <pre>
         * ": "99",
         * </pre>
         * <p>
         * <code>optional string limitPrice = 1;</code>
         */
        public String getLimitPrice() {
            Object ref = limitPrice_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                limitPrice_ = s;
                return s;
            }
        }

        /**
         * <pre>
         * ": "99",
         * </pre>
         * <p>
         * <code>optional string limitPrice = 1;</code>
         */
        public com.google.protobuf.ByteString
        getLimitPriceBytes() {
            Object ref = limitPrice_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                limitPrice_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int CUTPRICE_FIELD_NUMBER = 2;
        private volatile Object cutPrice_;

        /**
         * <pre>
         * ": "5",
         * </pre>
         * <p>
         * <code>optional string cutPrice = 2;</code>
         */
        public String getCutPrice() {
            Object ref = cutPrice_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                cutPrice_ = s;
                return s;
            }
        }

        /**
         * <pre>
         * ": "5",
         * </pre>
         * <p>
         * <code>optional string cutPrice = 2;</code>
         */
        public com.google.protobuf.ByteString
        getCutPriceBytes() {
            Object ref = cutPrice_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                cutPrice_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int CAMPAIGNDESC_FIELD_NUMBER = 3;
        private volatile Object campaignDesc_;

        /**
         * <pre>
         * ": "满99元立减5元"
         * </pre>
         * <p>
         * <code>optional string campaignDesc = 3;</code>
         */
        public String getCampaignDesc() {
            Object ref = campaignDesc_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                campaignDesc_ = s;
                return s;
            }
        }

        /**
         * <pre>
         * ": "满99元立减5元"
         * </pre>
         * <p>
         * <code>optional string campaignDesc = 3;</code>
         */
        public com.google.protobuf.ByteString
        getCampaignDescBytes() {
            Object ref = campaignDesc_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                campaignDesc_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
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
            if (!getLimitPriceBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, limitPrice_);
            }
            if (!getCutPriceBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, cutPrice_);
            }
            if (!getCampaignDescBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, campaignDesc_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getLimitPriceBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, limitPrice_);
            }
            if (!getCutPriceBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, cutPrice_);
            }
            if (!getCampaignDescBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, campaignDesc_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShopsData.Campaign)) {
                return super.equals(obj);
            }
            ShopsData.Campaign other = (ShopsData.Campaign) obj;

            boolean result = true;
            result = result && getLimitPrice()
                    .equals(other.getLimitPrice());
            result = result && getCutPrice()
                    .equals(other.getCutPrice());
            result = result && getCampaignDesc()
                    .equals(other.getCampaignDesc());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptorForType().hashCode();
            hash = (37 * hash) + LIMITPRICE_FIELD_NUMBER;
            hash = (53 * hash) + getLimitPrice().hashCode();
            hash = (37 * hash) + CUTPRICE_FIELD_NUMBER;
            hash = (53 * hash) + getCutPrice().hashCode();
            hash = (37 * hash) + CAMPAIGNDESC_FIELD_NUMBER;
            hash = (53 * hash) + getCampaignDesc().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static ShopsData.Campaign parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ShopsData.Campaign parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ShopsData.Campaign parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ShopsData.Campaign parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ShopsData.Campaign parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static ShopsData.Campaign parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static ShopsData.Campaign parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static ShopsData.Campaign parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static ShopsData.Campaign parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static ShopsData.Campaign parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(ShopsData.Campaign prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code Campaign}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:Campaign)
                ShopsData.CampaignOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ShopsData.internal_static_Campaign_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ShopsData.internal_static_Campaign_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                ShopsData.Campaign.class, ShopsData.Campaign.Builder.class);
            }

            // Construct using ShopsData.Campaign.newBuilder()
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

            public Builder clear() {
                super.clear();
                limitPrice_ = "";

                cutPrice_ = "";

                campaignDesc_ = "";

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return ShopsData.internal_static_Campaign_descriptor;
            }

            public ShopsData.Campaign getDefaultInstanceForType() {
                return ShopsData.Campaign.getDefaultInstance();
            }

            public ShopsData.Campaign build() {
                ShopsData.Campaign result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public ShopsData.Campaign buildPartial() {
                ShopsData.Campaign result = new ShopsData.Campaign(this);
                result.limitPrice_ = limitPrice_;
                result.cutPrice_ = cutPrice_;
                result.campaignDesc_ = campaignDesc_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }

            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof ShopsData.Campaign) {
                    return mergeFrom((ShopsData.Campaign) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(ShopsData.Campaign other) {
                if (other == ShopsData.Campaign.getDefaultInstance()) return this;
                if (!other.getLimitPrice().isEmpty()) {
                    limitPrice_ = other.limitPrice_;
                    onChanged();
                }
                if (!other.getCutPrice().isEmpty()) {
                    cutPrice_ = other.cutPrice_;
                    onChanged();
                }
                if (!other.getCampaignDesc().isEmpty()) {
                    campaignDesc_ = other.campaignDesc_;
                    onChanged();
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                ShopsData.Campaign parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (ShopsData.Campaign) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private Object limitPrice_ = "";

            /**
             * <pre>
             * ": "99",
             * </pre>
             * <p>
             * <code>optional string limitPrice = 1;</code>
             */
            public String getLimitPrice() {
                Object ref = limitPrice_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    limitPrice_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <pre>
             * ": "99",
             * </pre>
             * <p>
             * <code>optional string limitPrice = 1;</code>
             */
            public com.google.protobuf.ByteString
            getLimitPriceBytes() {
                Object ref = limitPrice_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    limitPrice_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <pre>
             * ": "99",
             * </pre>
             * <p>
             * <code>optional string limitPrice = 1;</code>
             */
            public Builder setLimitPrice(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                limitPrice_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "99",
             * </pre>
             * <p>
             * <code>optional string limitPrice = 1;</code>
             */
            public Builder clearLimitPrice() {

                limitPrice_ = getDefaultInstance().getLimitPrice();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "99",
             * </pre>
             * <p>
             * <code>optional string limitPrice = 1;</code>
             */
            public Builder setLimitPriceBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                limitPrice_ = value;
                onChanged();
                return this;
            }

            private Object cutPrice_ = "";

            /**
             * <pre>
             * ": "5",
             * </pre>
             * <p>
             * <code>optional string cutPrice = 2;</code>
             */
            public String getCutPrice() {
                Object ref = cutPrice_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    cutPrice_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <pre>
             * ": "5",
             * </pre>
             * <p>
             * <code>optional string cutPrice = 2;</code>
             */
            public com.google.protobuf.ByteString
            getCutPriceBytes() {
                Object ref = cutPrice_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    cutPrice_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <pre>
             * ": "5",
             * </pre>
             * <p>
             * <code>optional string cutPrice = 2;</code>
             */
            public Builder setCutPrice(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                cutPrice_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "5",
             * </pre>
             * <p>
             * <code>optional string cutPrice = 2;</code>
             */
            public Builder clearCutPrice() {

                cutPrice_ = getDefaultInstance().getCutPrice();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "5",
             * </pre>
             * <p>
             * <code>optional string cutPrice = 2;</code>
             */
            public Builder setCutPriceBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                cutPrice_ = value;
                onChanged();
                return this;
            }

            private Object campaignDesc_ = "";

            /**
             * <pre>
             * ": "满99元立减5元"
             * </pre>
             * <p>
             * <code>optional string campaignDesc = 3;</code>
             */
            public String getCampaignDesc() {
                Object ref = campaignDesc_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    campaignDesc_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <pre>
             * ": "满99元立减5元"
             * </pre>
             * <p>
             * <code>optional string campaignDesc = 3;</code>
             */
            public com.google.protobuf.ByteString
            getCampaignDescBytes() {
                Object ref = campaignDesc_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    campaignDesc_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <pre>
             * ": "满99元立减5元"
             * </pre>
             * <p>
             * <code>optional string campaignDesc = 3;</code>
             */
            public Builder setCampaignDesc(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                campaignDesc_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "满99元立减5元"
             * </pre>
             * <p>
             * <code>optional string campaignDesc = 3;</code>
             */
            public Builder clearCampaignDesc() {

                campaignDesc_ = getDefaultInstance().getCampaignDesc();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ": "满99元立减5元"
             * </pre>
             * <p>
             * <code>optional string campaignDesc = 3;</code>
             */
            public Builder setCampaignDescBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                campaignDesc_ = value;
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:Campaign)
        }

        // @@protoc_insertion_point(class_scope:Campaign)
        private static final ShopsData.Campaign DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new ShopsData.Campaign();
        }

        public static ShopsData.Campaign getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<Campaign>
                PARSER = new com.google.protobuf.AbstractParser<Campaign>() {
            public Campaign parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new Campaign(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<Campaign> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<Campaign> getParserForType() {
            return PARSER;
        }

        public ShopsData.Campaign getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_ShopData_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_ShopData_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_Shop_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_Shop_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_Goods_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_Goods_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_Campaign_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_Campaign_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        String[] descriptorData = {
                "\n\017ShopsData.proto\"N\n\010ShopData\022\017\n\007tabType" +
                        "\030\001 \001(\005\022\r\n\005mbook\030\002 \001(\t\022\r\n\005isEnd\030\003 \001(\010\022\023\n\004" +
                        "list\030\004 \003(\0132\005.Shop\"\235\002\n\004Shop\022\016\n\006avatar\030\001 \001" +
                        "(\t\022\014\n\004name\030\002 \001(\t\022\r\n\005uname\030\003 \001(\t\022\023\n\013isCol" +
                        "lected\030\004 \001(\010\022\016\n\006newNum\030\005 \001(\005\022\014\n\004sale\030\006 \001" +
                        "(\t\022\025\n\rrecommendText\030\007 \001(\t\022\017\n\007shopUrl\030\010 \001" +
                        "(\t\022\016\n\006shopId\030\t \001(\t\022\016\n\006userId\030\n \001(\t\022\014\n\004ic" +
                        "on\030\013 \001(\t\022\025\n\005goods\030\014 \003(\0132\006.Goods\022\023\n\013origi" +
                        "nOrder\030\r \001(\005\022 \n\rshopCampaigns\030\016 \003(\0132\t.Ca" +
                        "mpaign\022\021\n\tcollected\030\017 \001(\010\"d\n\005Goods\022\016\n\006im",
                "gUrl\030\001 \001(\t\022\016\n\006goodId\030\002 \001(\t\022\023\n\013originPric" +
                        "e\030\003 \001(\t\022\025\n\rdiscountPrice\030\004 \001(\t\022\017\n\007goodUr" +
                        "l\030\005 \001(\t\"F\n\010Campaign\022\022\n\nlimitPrice\030\001 \001(\t\022" +
                        "\020\n\010cutPrice\030\002 \001(\t\022\024\n\014campaignDesc\030\003 \001(\tb" +
                        "\006proto3"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                        }, assigner);
        internal_static_ShopData_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_ShopData_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_ShopData_descriptor,
                new String[]{"TabType", "Mbook", "IsEnd", "List",});
        internal_static_Shop_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_Shop_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_Shop_descriptor,
                new String[]{"Avatar", "Name", "Uname", "IsCollected", "NewNum", "Sale", "RecommendText", "ShopUrl", "ShopId", "UserId", "Icon", "Goods", "OriginOrder", "ShopCampaigns", "Collected",});
        internal_static_Goods_descriptor =
                getDescriptor().getMessageTypes().get(2);
        internal_static_Goods_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_Goods_descriptor,
                new String[]{"ImgUrl", "GoodId", "OriginPrice", "DiscountPrice", "GoodUrl",});
        internal_static_Campaign_descriptor =
                getDescriptor().getMessageTypes().get(3);
        internal_static_Campaign_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_Campaign_descriptor,
                new String[]{"LimitPrice", "CutPrice", "CampaignDesc",});
    }

    // @@protoc_insertion_point(outer_class_scope)
}
