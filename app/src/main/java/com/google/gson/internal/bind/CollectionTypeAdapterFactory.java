package com.google.gson.internal.bind;

import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import p020b6.AbstractC1071v;
import p020b6.C1055f;
import p020b6.InterfaceC1072w;

/* loaded from: classes.dex */
public final class CollectionTypeAdapterFactory implements InterfaceC1072w {
    private final ConstructorConstructor constructorConstructor;

    /* loaded from: classes.dex */
    private static final class Adapter<E> extends AbstractC1071v<Collection<E>> {
        private final ObjectConstructor<? extends Collection<E>> constructor;
        private final AbstractC1071v<E> elementTypeAdapter;

        public Adapter(C1055f c1055f, Type type, AbstractC1071v<E> abstractC1071v, ObjectConstructor<? extends Collection<E>> objectConstructor) {
            this.elementTypeAdapter = new TypeAdapterRuntimeTypeWrapper(c1055f, abstractC1071v, type);
            this.constructor = objectConstructor;
        }

        @Override // p020b6.AbstractC1071v
        public Collection<E> read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection<E> construct = this.constructor.construct();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                construct.add(this.elementTypeAdapter.read(jsonReader));
            }
            jsonReader.endArray();
            return construct;
        }

        @Override // p020b6.AbstractC1071v
        public void write(JsonWriter jsonWriter, Collection<E> collection) throws IOException {
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.elementTypeAdapter.write(jsonWriter, it.next());
            }
            jsonWriter.endArray();
        }
    }

    public CollectionTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.constructorConstructor = constructorConstructor;
    }

    @Override // p020b6.InterfaceC1072w
    public <T> AbstractC1071v<T> create(C1055f c1055f, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type collectionElementType = C$Gson$Types.getCollectionElementType(type, rawType);
        return new Adapter(c1055f, collectionElementType, c1055f.m6307l(TypeToken.get(collectionElementType)), this.constructorConstructor.get(typeToken));
    }
}
