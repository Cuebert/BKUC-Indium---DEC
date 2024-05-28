package com.google.gson.internal.bind;

import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import p020b6.AbstractC1071v;
import p020b6.C1055f;

/* loaded from: classes.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends AbstractC1071v<T> {
    private final C1055f context;
    private final AbstractC1071v<T> delegate;
    private final Type type;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TypeAdapterRuntimeTypeWrapper(C1055f c1055f, AbstractC1071v<T> abstractC1071v, Type type) {
        this.context = c1055f;
        this.delegate = abstractC1071v;
        this.type = type;
    }

    private Type getRuntimeTypeIfMoreSpecific(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    @Override // p020b6.AbstractC1071v
    public T read(JsonReader jsonReader) throws IOException {
        return this.delegate.read(jsonReader);
    }

    @Override // p020b6.AbstractC1071v
    public void write(JsonWriter jsonWriter, T t10) throws IOException {
        AbstractC1071v<T> abstractC1071v = this.delegate;
        Type runtimeTypeIfMoreSpecific = getRuntimeTypeIfMoreSpecific(this.type, t10);
        if (runtimeTypeIfMoreSpecific != this.type) {
            abstractC1071v = this.context.m6307l(TypeToken.get(runtimeTypeIfMoreSpecific));
            if (abstractC1071v instanceof ReflectiveTypeAdapterFactory.Adapter) {
                AbstractC1071v<T> abstractC1071v2 = this.delegate;
                if (!(abstractC1071v2 instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                    abstractC1071v = abstractC1071v2;
                }
            }
        }
        abstractC1071v.write(jsonWriter, t10);
    }
}
