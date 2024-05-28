package com.google.gson.internal.bind;

import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import p020b6.AbstractC1061l;
import p020b6.AbstractC1071v;
import p020b6.C1055f;
import p020b6.C1066q;
import p020b6.C1069t;
import p020b6.InterfaceC1072w;

/* loaded from: classes.dex */
public final class MapTypeAdapterFactory implements InterfaceC1072w {
    final boolean complexMapKeySerialization;
    private final ConstructorConstructor constructorConstructor;

    /* loaded from: classes.dex */
    private final class Adapter<K, V> extends AbstractC1071v<Map<K, V>> {
        private final ObjectConstructor<? extends Map<K, V>> constructor;
        private final AbstractC1071v<K> keyTypeAdapter;
        private final AbstractC1071v<V> valueTypeAdapter;

        public Adapter(C1055f c1055f, Type type, AbstractC1071v<K> abstractC1071v, Type type2, AbstractC1071v<V> abstractC1071v2, ObjectConstructor<? extends Map<K, V>> objectConstructor) {
            this.keyTypeAdapter = new TypeAdapterRuntimeTypeWrapper(c1055f, abstractC1071v, type);
            this.valueTypeAdapter = new TypeAdapterRuntimeTypeWrapper(c1055f, abstractC1071v2, type2);
            this.constructor = objectConstructor;
        }

        private String keyToString(AbstractC1061l abstractC1061l) {
            if (abstractC1061l.m6340o()) {
                C1066q m6336i = abstractC1061l.m6336i();
                if (m6336i.m6355z()) {
                    return String.valueOf(m6336i.m6352v());
                }
                if (m6336i.m6354x()) {
                    return Boolean.toString(m6336i.m6347p());
                }
                if (m6336i.m6345B()) {
                    return m6336i.m6353w();
                }
                throw new AssertionError();
            }
            if (abstractC1061l.m6338l()) {
                return "null";
            }
            throw new AssertionError();
        }

        @Override // p020b6.AbstractC1071v
        public Map<K, V> read(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map<K, V> construct = this.constructor.construct();
            if (peek == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginArray();
                    K read = this.keyTypeAdapter.read(jsonReader);
                    if (construct.put(read, this.valueTypeAdapter.read(jsonReader)) == null) {
                        jsonReader.endArray();
                    } else {
                        throw new C1069t("duplicate key: " + read);
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(jsonReader);
                    K read2 = this.keyTypeAdapter.read(jsonReader);
                    if (construct.put(read2, this.valueTypeAdapter.read(jsonReader)) != null) {
                        throw new C1069t("duplicate key: " + read2);
                    }
                }
                jsonReader.endObject();
            }
            return construct;
        }

        @Override // p020b6.AbstractC1071v
        public void write(JsonWriter jsonWriter, Map<K, V> map) throws IOException {
            if (map == null) {
                jsonWriter.nullValue();
                return;
            }
            if (!MapTypeAdapterFactory.this.complexMapKeySerialization) {
                jsonWriter.beginObject();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    jsonWriter.name(String.valueOf(entry.getKey()));
                    this.valueTypeAdapter.write(jsonWriter, entry.getValue());
                }
                jsonWriter.endObject();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i10 = 0;
            boolean z10 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                AbstractC1061l jsonTree = this.keyTypeAdapter.toJsonTree(entry2.getKey());
                arrayList.add(jsonTree);
                arrayList2.add(entry2.getValue());
                z10 |= jsonTree.m6337k() || jsonTree.m6339m();
            }
            if (z10) {
                jsonWriter.beginArray();
                int size = arrayList.size();
                while (i10 < size) {
                    jsonWriter.beginArray();
                    Streams.write((AbstractC1061l) arrayList.get(i10), jsonWriter);
                    this.valueTypeAdapter.write(jsonWriter, arrayList2.get(i10));
                    jsonWriter.endArray();
                    i10++;
                }
                jsonWriter.endArray();
                return;
            }
            jsonWriter.beginObject();
            int size2 = arrayList.size();
            while (i10 < size2) {
                jsonWriter.name(keyToString((AbstractC1061l) arrayList.get(i10)));
                this.valueTypeAdapter.write(jsonWriter, arrayList2.get(i10));
                i10++;
            }
            jsonWriter.endObject();
        }
    }

    public MapTypeAdapterFactory(ConstructorConstructor constructorConstructor, boolean z10) {
        this.constructorConstructor = constructorConstructor;
        this.complexMapKeySerialization = z10;
    }

    private AbstractC1071v<?> getKeyAdapter(C1055f c1055f, Type type) {
        if (type != Boolean.TYPE && type != Boolean.class) {
            return c1055f.m6307l(TypeToken.get(type));
        }
        return TypeAdapters.BOOLEAN_AS_STRING;
    }

    @Override // p020b6.InterfaceC1072w
    public <T> AbstractC1071v<T> create(C1055f c1055f, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        if (!Map.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        Type[] mapKeyAndValueTypes = C$Gson$Types.getMapKeyAndValueTypes(type, C$Gson$Types.getRawType(type));
        return new Adapter(c1055f, mapKeyAndValueTypes[0], getKeyAdapter(c1055f, mapKeyAndValueTypes[0]), mapKeyAndValueTypes[1], c1055f.m6307l(TypeToken.get(mapKeyAndValueTypes[1])), this.constructorConstructor.get(typeToken));
    }
}
