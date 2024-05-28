package com.google.gson.internal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p020b6.AbstractC1071v;
import p020b6.C1052c;
import p020b6.C1055f;
import p020b6.InterfaceC1051b;
import p020b6.InterfaceC1072w;

/* loaded from: classes.dex */
public final class Excluder implements InterfaceC1072w, Cloneable {
    public static final Excluder DEFAULT = new Excluder();
    private static final double IGNORE_VERSIONS = -1.0d;
    private boolean requireExpose;
    private double version = IGNORE_VERSIONS;
    private int modifiers = 136;
    private boolean serializeInnerClasses = true;
    private List<InterfaceC1051b> serializationStrategies = Collections.emptyList();
    private List<InterfaceC1051b> deserializationStrategies = Collections.emptyList();

    private boolean excludeClassChecks(Class<?> cls) {
        if (this.version == IGNORE_VERSIONS || isValidVersion((Since) cls.getAnnotation(Since.class), (Until) cls.getAnnotation(Until.class))) {
            return (!this.serializeInnerClasses && isInnerClass(cls)) || isAnonymousOrLocal(cls);
        }
        return true;
    }

    private boolean excludeClassInStrategy(Class<?> cls, boolean z10) {
        Iterator<InterfaceC1051b> it = (z10 ? this.serializationStrategies : this.deserializationStrategies).iterator();
        while (it.hasNext()) {
            if (it.next().m6289a(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean isAnonymousOrLocal(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    private boolean isInnerClass(Class<?> cls) {
        return cls.isMemberClass() && !isStatic(cls);
    }

    private boolean isStatic(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean isValidSince(Since since) {
        return since == null || since.value() <= this.version;
    }

    private boolean isValidUntil(Until until) {
        return until == null || until.value() > this.version;
    }

    private boolean isValidVersion(Since since, Until until) {
        return isValidSince(since) && isValidUntil(until);
    }

    @Override // p020b6.InterfaceC1072w
    public <T> AbstractC1071v<T> create(final C1055f c1055f, final TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        boolean excludeClassChecks = excludeClassChecks(rawType);
        final boolean z10 = excludeClassChecks || excludeClassInStrategy(rawType, true);
        final boolean z11 = excludeClassChecks || excludeClassInStrategy(rawType, false);
        if (z10 || z11) {
            return new AbstractC1071v<T>() { // from class: com.google.gson.internal.Excluder.1
                private AbstractC1071v<T> delegate;

                private AbstractC1071v<T> delegate() {
                    AbstractC1071v<T> abstractC1071v = this.delegate;
                    if (abstractC1071v != null) {
                        return abstractC1071v;
                    }
                    AbstractC1071v<T> m6309n = c1055f.m6309n(Excluder.this, typeToken);
                    this.delegate = m6309n;
                    return m6309n;
                }

                @Override // p020b6.AbstractC1071v
                public T read(JsonReader jsonReader) throws IOException {
                    if (z11) {
                        jsonReader.skipValue();
                        return null;
                    }
                    return delegate().read(jsonReader);
                }

                @Override // p020b6.AbstractC1071v
                public void write(JsonWriter jsonWriter, T t10) throws IOException {
                    if (z10) {
                        jsonWriter.nullValue();
                    } else {
                        delegate().write(jsonWriter, t10);
                    }
                }
            };
        }
        return null;
    }

    public Excluder disableInnerClassSerialization() {
        Excluder m21372clone = m21372clone();
        m21372clone.serializeInnerClasses = false;
        return m21372clone;
    }

    public boolean excludeClass(Class<?> cls, boolean z10) {
        return excludeClassChecks(cls) || excludeClassInStrategy(cls, z10);
    }

    public boolean excludeField(Field field, boolean z10) {
        Expose expose;
        if ((this.modifiers & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.version != IGNORE_VERSIONS && !isValidVersion((Since) field.getAnnotation(Since.class), (Until) field.getAnnotation(Until.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.requireExpose && ((expose = (Expose) field.getAnnotation(Expose.class)) == null || (!z10 ? expose.deserialize() : expose.serialize()))) {
            return true;
        }
        if ((!this.serializeInnerClasses && isInnerClass(field.getType())) || isAnonymousOrLocal(field.getType())) {
            return true;
        }
        List<InterfaceC1051b> list = z10 ? this.serializationStrategies : this.deserializationStrategies;
        if (list.isEmpty()) {
            return false;
        }
        C1052c c1052c = new C1052c(field);
        Iterator<InterfaceC1051b> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().m6290b(c1052c)) {
                return true;
            }
        }
        return false;
    }

    public Excluder excludeFieldsWithoutExposeAnnotation() {
        Excluder m21372clone = m21372clone();
        m21372clone.requireExpose = true;
        return m21372clone;
    }

    public Excluder withExclusionStrategy(InterfaceC1051b interfaceC1051b, boolean z10, boolean z11) {
        Excluder m21372clone = m21372clone();
        if (z10) {
            ArrayList arrayList = new ArrayList(this.serializationStrategies);
            m21372clone.serializationStrategies = arrayList;
            arrayList.add(interfaceC1051b);
        }
        if (z11) {
            ArrayList arrayList2 = new ArrayList(this.deserializationStrategies);
            m21372clone.deserializationStrategies = arrayList2;
            arrayList2.add(interfaceC1051b);
        }
        return m21372clone;
    }

    public Excluder withModifiers(int... iArr) {
        Excluder m21372clone = m21372clone();
        m21372clone.modifiers = 0;
        for (int i10 : iArr) {
            m21372clone.modifiers = i10 | m21372clone.modifiers;
        }
        return m21372clone;
    }

    public Excluder withVersion(double d10) {
        Excluder m21372clone = m21372clone();
        m21372clone.version = d10;
        return m21372clone;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Excluder m21372clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }
}
