package com.google.gson.internal.bind;

import com.google.gson.internal.C$Gson$Types;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p020b6.AbstractC1071v;
import p020b6.C1055f;
import p020b6.InterfaceC1072w;

/* loaded from: classes.dex */
public final class ArrayTypeAdapter<E> extends AbstractC1071v<Object> {
    public static final InterfaceC1072w FACTORY = new InterfaceC1072w() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // p020b6.InterfaceC1072w
        public <T> AbstractC1071v<T> create(C1055f c1055f, TypeToken<T> typeToken) {
            Type type = typeToken.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type arrayComponentType = C$Gson$Types.getArrayComponentType(type);
            return new ArrayTypeAdapter(c1055f, c1055f.m6307l(TypeToken.get(arrayComponentType)), C$Gson$Types.getRawType(arrayComponentType));
        }
    };
    private final Class<E> componentType;
    private final AbstractC1071v<E> componentTypeAdapter;

    public ArrayTypeAdapter(C1055f c1055f, AbstractC1071v<E> abstractC1071v, Class<E> cls) {
        this.componentTypeAdapter = new TypeAdapterRuntimeTypeWrapper(c1055f, abstractC1071v, cls);
        this.componentType = cls;
    }

    @Override // p020b6.AbstractC1071v
    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.componentTypeAdapter.read(jsonReader));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.componentType, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(newInstance, i10, arrayList.get(i10));
        }
        return newInstance;
    }

    @Override // p020b6.AbstractC1071v
    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.componentTypeAdapter.write(jsonWriter, Array.get(obj, i10));
        }
        jsonWriter.endArray();
    }
}
