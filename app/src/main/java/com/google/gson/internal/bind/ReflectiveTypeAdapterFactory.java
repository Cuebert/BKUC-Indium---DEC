package com.google.gson.internal.bind;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.reflect.ReflectionAccessor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p020b6.AbstractC1071v;
import p020b6.C1055f;
import p020b6.C1069t;
import p020b6.InterfaceC1054e;
import p020b6.InterfaceC1072w;

/* loaded from: classes.dex */
public final class ReflectiveTypeAdapterFactory implements InterfaceC1072w {
    private final ReflectionAccessor accessor = ReflectionAccessor.getInstance();
    private final ConstructorConstructor constructorConstructor;
    private final Excluder excluder;
    private final InterfaceC1054e fieldNamingPolicy;
    private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1 */
    /* loaded from: classes.dex */
    public class C26651 extends BoundField {
        final /* synthetic */ C1055f val$context;
        final /* synthetic */ Field val$field;
        final /* synthetic */ TypeToken val$fieldType;
        final /* synthetic */ boolean val$isPrimitive;
        final /* synthetic */ boolean val$jsonAdapterPresent;
        final /* synthetic */ AbstractC1071v val$typeAdapter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26651(String str, boolean z10, boolean z11, Field field, boolean z12, AbstractC1071v abstractC1071v, C1055f c1055f, TypeToken typeToken, boolean z13) {
            super(str, z10, z11);
            r5 = field;
            r6 = z12;
            r7 = abstractC1071v;
            r8 = c1055f;
            r9 = typeToken;
            r10 = z13;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
        void read(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException {
            Object read = r7.read(jsonReader);
            if (read == null && r10) {
                return;
            }
            r5.set(obj, read);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
        void write(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException {
            (r6 ? r7 : new TypeAdapterRuntimeTypeWrapper(r8, r7, r9.getType())).write(jsonWriter, r5.get(obj));
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
        public boolean writeField(Object obj) throws IOException, IllegalAccessException {
            return this.serialized && r5.get(obj) != obj;
        }
    }

    /* loaded from: classes.dex */
    public static final class Adapter<T> extends AbstractC1071v<T> {
        private final Map<String, BoundField> boundFields;
        private final ObjectConstructor<T> constructor;

        Adapter(ObjectConstructor<T> objectConstructor, Map<String, BoundField> map) {
            this.constructor = objectConstructor;
            this.boundFields = map;
        }

        @Override // p020b6.AbstractC1071v
        public T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            T construct = this.constructor.construct();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    BoundField boundField = this.boundFields.get(jsonReader.nextName());
                    if (boundField != null && boundField.deserialized) {
                        boundField.read(jsonReader, construct);
                    }
                    jsonReader.skipValue();
                }
                jsonReader.endObject();
                return construct;
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (IllegalStateException e11) {
                throw new C1069t(e11);
            }
        }

        @Override // p020b6.AbstractC1071v
        public void write(JsonWriter jsonWriter, T t10) throws IOException {
            if (t10 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                for (BoundField boundField : this.boundFields.values()) {
                    if (boundField.writeField(t10)) {
                        jsonWriter.name(boundField.name);
                        boundField.write(jsonWriter, t10);
                    }
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class BoundField {
        final boolean deserialized;
        final String name;
        final boolean serialized;

        protected BoundField(String str, boolean z10, boolean z11) {
            this.name = str;
            this.serialized = z10;
            this.deserialized = z11;
        }

        abstract void read(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException;

        abstract void write(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException;

        abstract boolean writeField(Object obj) throws IOException, IllegalAccessException;
    }

    public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorConstructor, InterfaceC1054e interfaceC1054e, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.constructorConstructor = constructorConstructor;
        this.fieldNamingPolicy = interfaceC1054e;
        this.excluder = excluder;
        this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
    }

    private BoundField createBoundField(C1055f c1055f, Field field, String str, TypeToken<?> typeToken, boolean z10, boolean z11) {
        boolean isPrimitive = Primitives.isPrimitive(typeToken.getRawType());
        JsonAdapter jsonAdapter = (JsonAdapter) field.getAnnotation(JsonAdapter.class);
        AbstractC1071v<?> typeAdapter = jsonAdapter != null ? this.jsonAdapterFactory.getTypeAdapter(this.constructorConstructor, c1055f, typeToken, jsonAdapter) : null;
        boolean z12 = typeAdapter != null;
        if (typeAdapter == null) {
            typeAdapter = c1055f.m6307l(typeToken);
        }
        return new BoundField(str, z10, z11) { // from class: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.1
            final /* synthetic */ C1055f val$context;
            final /* synthetic */ Field val$field;
            final /* synthetic */ TypeToken val$fieldType;
            final /* synthetic */ boolean val$isPrimitive;
            final /* synthetic */ boolean val$jsonAdapterPresent;
            final /* synthetic */ AbstractC1071v val$typeAdapter;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C26651(String str2, boolean z102, boolean z112, Field field2, boolean z122, AbstractC1071v typeAdapter2, C1055f c1055f2, TypeToken typeToken2, boolean isPrimitive2) {
                super(str2, z102, z112);
                r5 = field2;
                r6 = z122;
                r7 = typeAdapter2;
                r8 = c1055f2;
                r9 = typeToken2;
                r10 = isPrimitive2;
            }

            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            void read(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException {
                Object read = r7.read(jsonReader);
                if (read == null && r10) {
                    return;
                }
                r5.set(obj, read);
            }

            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            void write(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException {
                (r6 ? r7 : new TypeAdapterRuntimeTypeWrapper(r8, r7, r9.getType())).write(jsonWriter, r5.get(obj));
            }

            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            public boolean writeField(Object obj) throws IOException, IllegalAccessException {
                return this.serialized && r5.get(obj) != obj;
            }
        };
    }

    private Map<String, BoundField> getBoundFields(C1055f c1055f, TypeToken<?> typeToken, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = typeToken.getType();
        TypeToken<?> typeToken2 = typeToken;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z10 = false;
            int i10 = 0;
            while (i10 < length) {
                Field field = declaredFields[i10];
                boolean excludeField = excludeField(field, true);
                boolean excludeField2 = excludeField(field, z10);
                if (excludeField || excludeField2) {
                    this.accessor.makeAccessible(field);
                    Type resolve = C$Gson$Types.resolve(typeToken2.getType(), cls2, field.getGenericType());
                    List<String> fieldNames = getFieldNames(field);
                    int size = fieldNames.size();
                    BoundField boundField = null;
                    int i11 = 0;
                    while (i11 < size) {
                        String str = fieldNames.get(i11);
                        boolean z11 = i11 != 0 ? false : excludeField;
                        int i12 = i11;
                        BoundField boundField2 = boundField;
                        int i13 = size;
                        List<String> list = fieldNames;
                        Field field2 = field;
                        boundField = boundField2 == null ? (BoundField) linkedHashMap.put(str, createBoundField(c1055f, field, str, TypeToken.get(resolve), z11, excludeField2)) : boundField2;
                        i11 = i12 + 1;
                        excludeField = z11;
                        fieldNames = list;
                        size = i13;
                        field = field2;
                    }
                    BoundField boundField3 = boundField;
                    if (boundField3 != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + boundField3.name);
                    }
                }
                i10++;
                z10 = false;
            }
            typeToken2 = TypeToken.get(C$Gson$Types.resolve(typeToken2.getType(), cls2, cls2.getGenericSuperclass()));
            cls2 = typeToken2.getRawType();
        }
        return linkedHashMap;
    }

    private List<String> getFieldNames(Field field) {
        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
        if (serializedName == null) {
            return Collections.singletonList(this.fieldNamingPolicy.mo6294b(field));
        }
        String value = serializedName.value();
        String[] alternate = serializedName.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String str : alternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // p020b6.InterfaceC1072w
    public <T> AbstractC1071v<T> create(C1055f c1055f, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (Object.class.isAssignableFrom(rawType)) {
            return new Adapter(this.constructorConstructor.get(typeToken), getBoundFields(c1055f, typeToken, rawType));
        }
        return null;
    }

    public boolean excludeField(Field field, boolean z10) {
        return excludeField(field, z10, this.excluder);
    }

    static boolean excludeField(Field field, boolean z10, Excluder excluder) {
        return (excluder.excludeClass(field.getType(), z10) || excluder.excludeField(field, z10)) ? false : true;
    }
}
