package com.google.gson.internal.bind;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.reflect.TypeToken;
import p020b6.AbstractC1071v;
import p020b6.C1055f;
import p020b6.InterfaceC1060k;
import p020b6.InterfaceC1068s;
import p020b6.InterfaceC1072w;

/* loaded from: classes.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements InterfaceC1072w {
    private final ConstructorConstructor constructorConstructor;

    public JsonAdapterAnnotationTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.constructorConstructor = constructorConstructor;
    }

    @Override // p020b6.InterfaceC1072w
    public <T> AbstractC1071v<T> create(C1055f c1055f, TypeToken<T> typeToken) {
        JsonAdapter jsonAdapter = (JsonAdapter) typeToken.getRawType().getAnnotation(JsonAdapter.class);
        if (jsonAdapter == null) {
            return null;
        }
        return (AbstractC1071v<T>) getTypeAdapter(this.constructorConstructor, c1055f, typeToken, jsonAdapter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1071v<?> getTypeAdapter(ConstructorConstructor constructorConstructor, C1055f c1055f, TypeToken<?> typeToken, JsonAdapter jsonAdapter) {
        AbstractC1071v<?> treeTypeAdapter;
        Object construct = constructorConstructor.get(TypeToken.get((Class) jsonAdapter.value())).construct();
        if (construct instanceof AbstractC1071v) {
            treeTypeAdapter = (AbstractC1071v) construct;
        } else if (construct instanceof InterfaceC1072w) {
            treeTypeAdapter = ((InterfaceC1072w) construct).create(c1055f, typeToken);
        } else {
            boolean z10 = construct instanceof InterfaceC1068s;
            if (!z10 && !(construct instanceof InterfaceC1060k)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + construct.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            treeTypeAdapter = new TreeTypeAdapter<>(z10 ? (InterfaceC1068s) construct : null, construct instanceof InterfaceC1060k ? (InterfaceC1060k) construct : null, c1055f, typeToken, null);
        }
        return (treeTypeAdapter == null || !jsonAdapter.nullSafe()) ? treeTypeAdapter : treeTypeAdapter.nullSafe();
    }
}
