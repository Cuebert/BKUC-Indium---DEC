package p020b6;

import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* renamed from: b6.f */
/* loaded from: classes.dex */
public final class C1055f {

    /* renamed from: v */
    private static final TypeToken<?> f5252v = TypeToken.get(Object.class);

    /* renamed from: a */
    private final ThreadLocal<Map<TypeToken<?>, f<?>>> f5253a;

    /* renamed from: b */
    private final Map<TypeToken<?>, AbstractC1071v<?>> f5254b;

    /* renamed from: c */
    private final ConstructorConstructor f5255c;

    /* renamed from: d */
    private final JsonAdapterAnnotationTypeAdapterFactory f5256d;

    /* renamed from: e */
    final List<InterfaceC1072w> f5257e;

    /* renamed from: f */
    final Excluder f5258f;

    /* renamed from: g */
    final InterfaceC1054e f5259g;

    /* renamed from: h */
    final Map<Type, InterfaceC1057h<?>> f5260h;

    /* renamed from: i */
    final boolean f5261i;

    /* renamed from: j */
    final boolean f5262j;

    /* renamed from: k */
    final boolean f5263k;

    /* renamed from: l */
    final boolean f5264l;

    /* renamed from: m */
    final boolean f5265m;

    /* renamed from: n */
    final boolean f5266n;

    /* renamed from: o */
    final boolean f5267o;

    /* renamed from: p */
    final String f5268p;

    /* renamed from: q */
    final int f5269q;

    /* renamed from: r */
    final int f5270r;

    /* renamed from: s */
    final EnumC1070u f5271s;

    /* renamed from: t */
    final List<InterfaceC1072w> f5272t;

    /* renamed from: u */
    final List<InterfaceC1072w> f5273u;

    /* renamed from: b6.f$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC1071v<Number> {
        a() {
        }

        @Override // p020b6.AbstractC1071v
        /* renamed from: a */
        public Double read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Double.valueOf(jsonReader.nextDouble());
        }

        @Override // p020b6.AbstractC1071v
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                C1055f.m6298d(number.doubleValue());
                jsonWriter.value(number);
            }
        }
    }

    /* renamed from: b6.f$b */
    /* loaded from: classes.dex */
    public class b extends AbstractC1071v<Number> {
        b() {
        }

        @Override // p020b6.AbstractC1071v
        /* renamed from: a */
        public Float read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Float.valueOf((float) jsonReader.nextDouble());
        }

        @Override // p020b6.AbstractC1071v
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                C1055f.m6298d(number.floatValue());
                jsonWriter.value(number);
            }
        }
    }

    /* renamed from: b6.f$c */
    /* loaded from: classes.dex */
    public static class c extends AbstractC1071v<Number> {
        c() {
        }

        @Override // p020b6.AbstractC1071v
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Long.valueOf(jsonReader.nextLong());
        }

        @Override // p020b6.AbstractC1071v
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(number.toString());
            }
        }
    }

    /* renamed from: b6.f$d */
    /* loaded from: classes.dex */
    public static class d extends AbstractC1071v<AtomicLong> {

        /* renamed from: a */
        final /* synthetic */ AbstractC1071v f5276a;

        d(AbstractC1071v abstractC1071v) {
            this.f5276a = abstractC1071v;
        }

        @Override // p020b6.AbstractC1071v
        /* renamed from: a */
        public AtomicLong read(JsonReader jsonReader) throws IOException {
            return new AtomicLong(((Number) this.f5276a.read(jsonReader)).longValue());
        }

        @Override // p020b6.AbstractC1071v
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, AtomicLong atomicLong) throws IOException {
            this.f5276a.write(jsonWriter, Long.valueOf(atomicLong.get()));
        }
    }

    /* renamed from: b6.f$e */
    /* loaded from: classes.dex */
    public static class e extends AbstractC1071v<AtomicLongArray> {

        /* renamed from: a */
        final /* synthetic */ AbstractC1071v f5277a;

        e(AbstractC1071v abstractC1071v) {
            this.f5277a = abstractC1071v;
        }

        @Override // p020b6.AbstractC1071v
        /* renamed from: a */
        public AtomicLongArray read(JsonReader jsonReader) throws IOException {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(Long.valueOf(((Number) this.f5277a.read(jsonReader)).longValue()));
            }
            jsonReader.endArray();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
            }
            return atomicLongArray;
        }

        @Override // p020b6.AbstractC1071v
        /* renamed from: b */
        public void write(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
            jsonWriter.beginArray();
            int length = atomicLongArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                this.f5277a.write(jsonWriter, Long.valueOf(atomicLongArray.get(i10)));
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: b6.f$f */
    /* loaded from: classes.dex */
    public static class f<T> extends AbstractC1071v<T> {

        /* renamed from: a */
        private AbstractC1071v<T> f5278a;

        f() {
        }

        /* renamed from: a */
        public void m6327a(AbstractC1071v<T> abstractC1071v) {
            if (this.f5278a == null) {
                this.f5278a = abstractC1071v;
                return;
            }
            throw new AssertionError();
        }

        @Override // p020b6.AbstractC1071v
        public T read(JsonReader jsonReader) throws IOException {
            AbstractC1071v<T> abstractC1071v = this.f5278a;
            if (abstractC1071v != null) {
                return abstractC1071v.read(jsonReader);
            }
            throw new IllegalStateException();
        }

        @Override // p020b6.AbstractC1071v
        public void write(JsonWriter jsonWriter, T t10) throws IOException {
            AbstractC1071v<T> abstractC1071v = this.f5278a;
            if (abstractC1071v != null) {
                abstractC1071v.write(jsonWriter, t10);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public C1055f() {
        this(Excluder.DEFAULT, EnumC1053d.f5245n, Collections.emptyMap(), false, false, false, true, false, false, false, EnumC1070u.f5300n, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    /* renamed from: a */
    private static void m6295a(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() == JsonToken.END_DOCUMENT) {
                } else {
                    throw new C1062m("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e10) {
                throw new C1069t(e10);
            } catch (IOException e11) {
                throw new C1062m(e11);
            }
        }
    }

    /* renamed from: b */
    private static AbstractC1071v<AtomicLong> m6296b(AbstractC1071v<Number> abstractC1071v) {
        return new d(abstractC1071v).nullSafe();
    }

    /* renamed from: c */
    private static AbstractC1071v<AtomicLongArray> m6297c(AbstractC1071v<Number> abstractC1071v) {
        return new e(abstractC1071v).nullSafe();
    }

    /* renamed from: d */
    static void m6298d(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: e */
    private AbstractC1071v<Number> m6299e(boolean z10) {
        if (z10) {
            return TypeAdapters.DOUBLE;
        }
        return new a();
    }

    /* renamed from: f */
    private AbstractC1071v<Number> m6300f(boolean z10) {
        if (z10) {
            return TypeAdapters.FLOAT;
        }
        return new b();
    }

    /* renamed from: o */
    private static AbstractC1071v<Number> m6301o(EnumC1070u enumC1070u) {
        if (enumC1070u == EnumC1070u.f5300n) {
            return TypeAdapters.LONG;
        }
        return new c();
    }

    /* renamed from: g */
    public <T> T m6302g(AbstractC1061l abstractC1061l, Type type) throws C1069t {
        if (abstractC1061l == null) {
            return null;
        }
        return (T) m6303h(new JsonTreeReader(abstractC1061l), type);
    }

    /* renamed from: h */
    public <T> T m6303h(JsonReader jsonReader, Type type) throws C1062m, C1069t {
        boolean isLenient = jsonReader.isLenient();
        boolean z10 = true;
        jsonReader.setLenient(true);
        try {
            try {
                try {
                    jsonReader.peek();
                    z10 = false;
                    T read = m6307l(TypeToken.get(type)).read(jsonReader);
                    jsonReader.setLenient(isLenient);
                    return read;
                } catch (EOFException e10) {
                    if (z10) {
                        jsonReader.setLenient(isLenient);
                        return null;
                    }
                    throw new C1069t(e10);
                } catch (AssertionError e11) {
                    throw new AssertionError("AssertionError (GSON 2.8.5): " + e11.getMessage(), e11);
                }
            } catch (IOException e12) {
                throw new C1069t(e12);
            } catch (IllegalStateException e13) {
                throw new C1069t(e13);
            }
        } catch (Throwable th) {
            jsonReader.setLenient(isLenient);
            throw th;
        }
    }

    /* renamed from: i */
    public <T> T m6304i(Reader reader, Type type) throws C1062m, C1069t {
        JsonReader m6310p = m6310p(reader);
        T t10 = (T) m6303h(m6310p, type);
        m6295a(t10, m6310p);
        return t10;
    }

    /* renamed from: j */
    public <T> T m6305j(String str, Class<T> cls) throws C1069t {
        return (T) Primitives.wrap(cls).cast(m6306k(str, cls));
    }

    /* renamed from: k */
    public <T> T m6306k(String str, Type type) throws C1069t {
        if (str == null) {
            return null;
        }
        return (T) m6304i(new StringReader(str), type);
    }

    /* renamed from: l */
    public <T> AbstractC1071v<T> m6307l(TypeToken<T> typeToken) {
        AbstractC1071v<T> abstractC1071v = (AbstractC1071v) this.f5254b.get(typeToken == null ? f5252v : typeToken);
        if (abstractC1071v != null) {
            return abstractC1071v;
        }
        Map<TypeToken<?>, f<?>> map = this.f5253a.get();
        boolean z10 = false;
        if (map == null) {
            map = new HashMap<>();
            this.f5253a.set(map);
            z10 = true;
        }
        f<?> fVar = map.get(typeToken);
        if (fVar != null) {
            return fVar;
        }
        try {
            f<?> fVar2 = new f<>();
            map.put(typeToken, fVar2);
            Iterator<InterfaceC1072w> it = this.f5257e.iterator();
            while (it.hasNext()) {
                AbstractC1071v<T> create = it.next().create(this, typeToken);
                if (create != null) {
                    fVar2.m6327a(create);
                    this.f5254b.put(typeToken, create);
                    return create;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.5) cannot handle " + typeToken);
        } finally {
            map.remove(typeToken);
            if (z10) {
                this.f5253a.remove();
            }
        }
    }

    /* renamed from: m */
    public <T> AbstractC1071v<T> m6308m(Class<T> cls) {
        return m6307l(TypeToken.get((Class) cls));
    }

    /* renamed from: n */
    public <T> AbstractC1071v<T> m6309n(InterfaceC1072w interfaceC1072w, TypeToken<T> typeToken) {
        if (!this.f5257e.contains(interfaceC1072w)) {
            interfaceC1072w = this.f5256d;
        }
        boolean z10 = false;
        for (InterfaceC1072w interfaceC1072w2 : this.f5257e) {
            if (z10) {
                AbstractC1071v<T> create = interfaceC1072w2.create(this, typeToken);
                if (create != null) {
                    return create;
                }
            } else if (interfaceC1072w2 == interfaceC1072w) {
                z10 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
    }

    /* renamed from: p */
    public JsonReader m6310p(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        jsonReader.setLenient(this.f5266n);
        return jsonReader;
    }

    /* renamed from: q */
    public JsonWriter m6311q(Writer writer) throws IOException {
        if (this.f5263k) {
            writer.write(")]}'\n");
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (this.f5265m) {
            jsonWriter.setIndent("  ");
        }
        jsonWriter.setSerializeNulls(this.f5261i);
        return jsonWriter;
    }

    /* renamed from: r */
    public String m6312r(AbstractC1061l abstractC1061l) {
        StringWriter stringWriter = new StringWriter();
        m6316v(abstractC1061l, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: s */
    public String m6313s(Object obj) {
        if (obj == null) {
            return m6312r(C1063n.f5296a);
        }
        return m6314t(obj, obj.getClass());
    }

    /* renamed from: t */
    public String m6314t(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        m6318x(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public String toString() {
        return "{serializeNulls:" + this.f5261i + ",factories:" + this.f5257e + ",instanceCreators:" + this.f5255c + "}";
    }

    /* renamed from: u */
    public void m6315u(AbstractC1061l abstractC1061l, JsonWriter jsonWriter) throws C1062m {
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f5264l);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.f5261i);
        try {
            try {
                Streams.write(abstractC1061l, jsonWriter);
            } catch (IOException e10) {
                throw new C1062m(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e11.getMessage(), e11);
            }
        } finally {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    /* renamed from: v */
    public void m6316v(AbstractC1061l abstractC1061l, Appendable appendable) throws C1062m {
        try {
            m6315u(abstractC1061l, m6311q(Streams.writerForAppendable(appendable)));
        } catch (IOException e10) {
            throw new C1062m(e10);
        }
    }

    /* renamed from: w */
    public void m6317w(Object obj, Type type, JsonWriter jsonWriter) throws C1062m {
        AbstractC1071v m6307l = m6307l(TypeToken.get(type));
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f5264l);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.f5261i);
        try {
            try {
                m6307l.write(jsonWriter, obj);
            } catch (IOException e10) {
                throw new C1062m(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e11.getMessage(), e11);
            }
        } finally {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    /* renamed from: x */
    public void m6318x(Object obj, Type type, Appendable appendable) throws C1062m {
        try {
            m6317w(obj, type, m6311q(Streams.writerForAppendable(appendable)));
        } catch (IOException e10) {
            throw new C1062m(e10);
        }
    }

    /* renamed from: y */
    public AbstractC1061l m6319y(Object obj) {
        if (obj == null) {
            return C1063n.f5296a;
        }
        return m6320z(obj, obj.getClass());
    }

    /* renamed from: z */
    public AbstractC1061l m6320z(Object obj, Type type) {
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        m6317w(obj, type, jsonTreeWriter);
        return jsonTreeWriter.get();
    }

    public C1055f(Excluder excluder, InterfaceC1054e interfaceC1054e, Map<Type, InterfaceC1057h<?>> map, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, EnumC1070u enumC1070u, String str, int i10, int i11, List<InterfaceC1072w> list, List<InterfaceC1072w> list2, List<InterfaceC1072w> list3) {
        this.f5253a = new ThreadLocal<>();
        this.f5254b = new ConcurrentHashMap();
        this.f5258f = excluder;
        this.f5259g = interfaceC1054e;
        this.f5260h = map;
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(map);
        this.f5255c = constructorConstructor;
        this.f5261i = z10;
        this.f5262j = z11;
        this.f5263k = z12;
        this.f5264l = z13;
        this.f5265m = z14;
        this.f5266n = z15;
        this.f5267o = z16;
        this.f5271s = enumC1070u;
        this.f5268p = str;
        this.f5269q = i10;
        this.f5270r = i11;
        this.f5272t = list;
        this.f5273u = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.JSON_ELEMENT_FACTORY);
        arrayList.add(ObjectTypeAdapter.FACTORY);
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.STRING_FACTORY);
        arrayList.add(TypeAdapters.INTEGER_FACTORY);
        arrayList.add(TypeAdapters.BOOLEAN_FACTORY);
        arrayList.add(TypeAdapters.BYTE_FACTORY);
        arrayList.add(TypeAdapters.SHORT_FACTORY);
        AbstractC1071v<Number> m6301o = m6301o(enumC1070u);
        arrayList.add(TypeAdapters.newFactory(Long.TYPE, Long.class, m6301o));
        arrayList.add(TypeAdapters.newFactory(Double.TYPE, Double.class, m6299e(z16)));
        arrayList.add(TypeAdapters.newFactory(Float.TYPE, Float.class, m6300f(z16)));
        arrayList.add(TypeAdapters.NUMBER_FACTORY);
        arrayList.add(TypeAdapters.ATOMIC_INTEGER_FACTORY);
        arrayList.add(TypeAdapters.ATOMIC_BOOLEAN_FACTORY);
        arrayList.add(TypeAdapters.newFactory(AtomicLong.class, m6296b(m6301o)));
        arrayList.add(TypeAdapters.newFactory(AtomicLongArray.class, m6297c(m6301o)));
        arrayList.add(TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY);
        arrayList.add(TypeAdapters.CHARACTER_FACTORY);
        arrayList.add(TypeAdapters.STRING_BUILDER_FACTORY);
        arrayList.add(TypeAdapters.STRING_BUFFER_FACTORY);
        arrayList.add(TypeAdapters.newFactory(BigDecimal.class, TypeAdapters.BIG_DECIMAL));
        arrayList.add(TypeAdapters.newFactory(BigInteger.class, TypeAdapters.BIG_INTEGER));
        arrayList.add(TypeAdapters.URL_FACTORY);
        arrayList.add(TypeAdapters.URI_FACTORY);
        arrayList.add(TypeAdapters.UUID_FACTORY);
        arrayList.add(TypeAdapters.CURRENCY_FACTORY);
        arrayList.add(TypeAdapters.LOCALE_FACTORY);
        arrayList.add(TypeAdapters.INET_ADDRESS_FACTORY);
        arrayList.add(TypeAdapters.BIT_SET_FACTORY);
        arrayList.add(DateTypeAdapter.FACTORY);
        arrayList.add(TypeAdapters.CALENDAR_FACTORY);
        arrayList.add(TimeTypeAdapter.FACTORY);
        arrayList.add(SqlDateTypeAdapter.FACTORY);
        arrayList.add(TypeAdapters.TIMESTAMP_FACTORY);
        arrayList.add(ArrayTypeAdapter.FACTORY);
        arrayList.add(TypeAdapters.CLASS_FACTORY);
        arrayList.add(new CollectionTypeAdapterFactory(constructorConstructor));
        arrayList.add(new MapTypeAdapterFactory(constructorConstructor, z11));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);
        this.f5256d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.ENUM_FACTORY);
        arrayList.add(new ReflectiveTypeAdapterFactory(constructorConstructor, interfaceC1054e, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f5257e = Collections.unmodifiableList(arrayList);
    }
}
