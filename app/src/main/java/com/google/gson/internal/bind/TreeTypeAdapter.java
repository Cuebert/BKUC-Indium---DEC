package com.google.gson.internal.bind;

import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import p020b6.AbstractC1061l;
import p020b6.AbstractC1071v;
import p020b6.C1055f;
import p020b6.C1065p;
import p020b6.InterfaceC1059j;
import p020b6.InterfaceC1060k;
import p020b6.InterfaceC1067r;
import p020b6.InterfaceC1068s;
import p020b6.InterfaceC1072w;

/* loaded from: classes.dex */
public final class TreeTypeAdapter<T> extends AbstractC1071v<T> {
    private final TreeTypeAdapter<T>.GsonContextImpl context = new GsonContextImpl();
    private AbstractC1071v<T> delegate;
    private final InterfaceC1060k<T> deserializer;
    final C1055f gson;
    private final InterfaceC1068s<T> serializer;
    private final InterfaceC1072w skipPast;
    private final TypeToken<T> typeToken;

    /* loaded from: classes.dex */
    private final class GsonContextImpl implements InterfaceC1067r, InterfaceC1059j {
        private GsonContextImpl() {
        }

        public <R> R deserialize(AbstractC1061l abstractC1061l, Type type) throws C1065p {
            return (R) TreeTypeAdapter.this.gson.m6302g(abstractC1061l, type);
        }

        public AbstractC1061l serialize(Object obj) {
            return TreeTypeAdapter.this.gson.m6319y(obj);
        }

        public AbstractC1061l serialize(Object obj, Type type) {
            return TreeTypeAdapter.this.gson.m6320z(obj, type);
        }
    }

    /* loaded from: classes.dex */
    private static final class SingleTypeFactory implements InterfaceC1072w {
        private final InterfaceC1060k<?> deserializer;
        private final TypeToken<?> exactType;
        private final Class<?> hierarchyType;
        private final boolean matchRawType;
        private final InterfaceC1068s<?> serializer;

        SingleTypeFactory(Object obj, TypeToken<?> typeToken, boolean z10, Class<?> cls) {
            InterfaceC1068s<?> interfaceC1068s = obj instanceof InterfaceC1068s ? (InterfaceC1068s) obj : null;
            this.serializer = interfaceC1068s;
            InterfaceC1060k<?> interfaceC1060k = obj instanceof InterfaceC1060k ? (InterfaceC1060k) obj : null;
            this.deserializer = interfaceC1060k;
            C$Gson$Preconditions.checkArgument((interfaceC1068s == null && interfaceC1060k == null) ? false : true);
            this.exactType = typeToken;
            this.matchRawType = z10;
            this.hierarchyType = cls;
        }

        @Override // p020b6.InterfaceC1072w
        public <T> AbstractC1071v<T> create(C1055f c1055f, TypeToken<T> typeToken) {
            boolean isAssignableFrom;
            TypeToken<?> typeToken2 = this.exactType;
            if (typeToken2 != null) {
                isAssignableFrom = typeToken2.equals(typeToken) || (this.matchRawType && this.exactType.getType() == typeToken.getRawType());
            } else {
                isAssignableFrom = this.hierarchyType.isAssignableFrom(typeToken.getRawType());
            }
            if (isAssignableFrom) {
                return new TreeTypeAdapter(this.serializer, this.deserializer, c1055f, typeToken, this);
            }
            return null;
        }
    }

    public TreeTypeAdapter(InterfaceC1068s<T> interfaceC1068s, InterfaceC1060k<T> interfaceC1060k, C1055f c1055f, TypeToken<T> typeToken, InterfaceC1072w interfaceC1072w) {
        this.serializer = interfaceC1068s;
        this.deserializer = interfaceC1060k;
        this.gson = c1055f;
        this.typeToken = typeToken;
        this.skipPast = interfaceC1072w;
    }

    private AbstractC1071v<T> delegate() {
        AbstractC1071v<T> abstractC1071v = this.delegate;
        if (abstractC1071v != null) {
            return abstractC1071v;
        }
        AbstractC1071v<T> m6309n = this.gson.m6309n(this.skipPast, this.typeToken);
        this.delegate = m6309n;
        return m6309n;
    }

    public static InterfaceC1072w newFactory(TypeToken<?> typeToken, Object obj) {
        return new SingleTypeFactory(obj, typeToken, false, null);
    }

    public static InterfaceC1072w newFactoryWithMatchRawType(TypeToken<?> typeToken, Object obj) {
        return new SingleTypeFactory(obj, typeToken, typeToken.getType() == typeToken.getRawType(), null);
    }

    public static InterfaceC1072w newTypeHierarchyFactory(Class<?> cls, Object obj) {
        return new SingleTypeFactory(obj, null, false, cls);
    }

    @Override // p020b6.AbstractC1071v
    public T read(JsonReader jsonReader) throws IOException {
        if (this.deserializer == null) {
            return delegate().read(jsonReader);
        }
        AbstractC1061l parse = Streams.parse(jsonReader);
        if (parse.m6338l()) {
            return null;
        }
        return this.deserializer.m6333a(parse, this.typeToken.getType(), this.context);
    }

    @Override // p020b6.AbstractC1071v
    public void write(JsonWriter jsonWriter, T t10) throws IOException {
        InterfaceC1068s<T> interfaceC1068s = this.serializer;
        if (interfaceC1068s == null) {
            delegate().write(jsonWriter, t10);
        } else if (t10 == null) {
            jsonWriter.nullValue();
        } else {
            Streams.write(interfaceC1068s.m6356a(t10, this.typeToken.getType(), this.context), jsonWriter);
        }
    }
}
