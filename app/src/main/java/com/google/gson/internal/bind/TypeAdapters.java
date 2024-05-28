package com.google.gson.internal.bind;

import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p020b6.AbstractC1061l;
import p020b6.AbstractC1071v;
import p020b6.C1055f;
import p020b6.C1058i;
import p020b6.C1062m;
import p020b6.C1063n;
import p020b6.C1064o;
import p020b6.C1066q;
import p020b6.C1069t;
import p020b6.InterfaceC1072w;

/* loaded from: classes.dex */
public final class TypeAdapters {
    public static final AbstractC1071v<AtomicBoolean> ATOMIC_BOOLEAN;
    public static final InterfaceC1072w ATOMIC_BOOLEAN_FACTORY;
    public static final AbstractC1071v<AtomicInteger> ATOMIC_INTEGER;
    public static final AbstractC1071v<AtomicIntegerArray> ATOMIC_INTEGER_ARRAY;
    public static final InterfaceC1072w ATOMIC_INTEGER_ARRAY_FACTORY;
    public static final InterfaceC1072w ATOMIC_INTEGER_FACTORY;
    public static final AbstractC1071v<BigDecimal> BIG_DECIMAL;
    public static final AbstractC1071v<BigInteger> BIG_INTEGER;
    public static final AbstractC1071v<BitSet> BIT_SET;
    public static final InterfaceC1072w BIT_SET_FACTORY;
    public static final AbstractC1071v<Boolean> BOOLEAN;
    public static final AbstractC1071v<Boolean> BOOLEAN_AS_STRING;
    public static final InterfaceC1072w BOOLEAN_FACTORY;
    public static final AbstractC1071v<Number> BYTE;
    public static final InterfaceC1072w BYTE_FACTORY;
    public static final AbstractC1071v<Calendar> CALENDAR;
    public static final InterfaceC1072w CALENDAR_FACTORY;
    public static final AbstractC1071v<Character> CHARACTER;
    public static final InterfaceC1072w CHARACTER_FACTORY;
    public static final AbstractC1071v<Class> CLASS;
    public static final InterfaceC1072w CLASS_FACTORY;
    public static final AbstractC1071v<Currency> CURRENCY;
    public static final InterfaceC1072w CURRENCY_FACTORY;
    public static final AbstractC1071v<Number> DOUBLE;
    public static final InterfaceC1072w ENUM_FACTORY;
    public static final AbstractC1071v<Number> FLOAT;
    public static final AbstractC1071v<InetAddress> INET_ADDRESS;
    public static final InterfaceC1072w INET_ADDRESS_FACTORY;
    public static final AbstractC1071v<Number> INTEGER;
    public static final InterfaceC1072w INTEGER_FACTORY;
    public static final AbstractC1071v<AbstractC1061l> JSON_ELEMENT;
    public static final InterfaceC1072w JSON_ELEMENT_FACTORY;
    public static final AbstractC1071v<Locale> LOCALE;
    public static final InterfaceC1072w LOCALE_FACTORY;
    public static final AbstractC1071v<Number> LONG;
    public static final AbstractC1071v<Number> NUMBER;
    public static final InterfaceC1072w NUMBER_FACTORY;
    public static final AbstractC1071v<Number> SHORT;
    public static final InterfaceC1072w SHORT_FACTORY;
    public static final AbstractC1071v<String> STRING;
    public static final AbstractC1071v<StringBuffer> STRING_BUFFER;
    public static final InterfaceC1072w STRING_BUFFER_FACTORY;
    public static final AbstractC1071v<StringBuilder> STRING_BUILDER;
    public static final InterfaceC1072w STRING_BUILDER_FACTORY;
    public static final InterfaceC1072w STRING_FACTORY;
    public static final InterfaceC1072w TIMESTAMP_FACTORY;
    public static final AbstractC1071v<URI> URI;
    public static final InterfaceC1072w URI_FACTORY;
    public static final AbstractC1071v<URL> URL;
    public static final InterfaceC1072w URL_FACTORY;
    public static final AbstractC1071v<UUID> UUID;
    public static final InterfaceC1072w UUID_FACTORY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.gson.internal.bind.TypeAdapters$36 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C269836 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class EnumTypeAdapter<T extends Enum<T>> extends AbstractC1071v<T> {
        private final Map<String, T> nameToConstant = new HashMap();
        private final Map<T, String> constantToName = new HashMap();

        public EnumTypeAdapter(Class<T> cls) {
            try {
                for (T t10 : cls.getEnumConstants()) {
                    String name = t10.name();
                    SerializedName serializedName = (SerializedName) cls.getField(name).getAnnotation(SerializedName.class);
                    if (serializedName != null) {
                        name = serializedName.value();
                        for (String str : serializedName.alternate()) {
                            this.nameToConstant.put(str, t10);
                        }
                    }
                    this.nameToConstant.put(name, t10);
                    this.constantToName.put(t10, name);
                }
            } catch (NoSuchFieldException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // p020b6.AbstractC1071v
        public T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return this.nameToConstant.get(jsonReader.nextString());
        }

        @Override // p020b6.AbstractC1071v
        public void write(JsonWriter jsonWriter, T t10) throws IOException {
            jsonWriter.value(t10 == null ? null : this.constantToName.get(t10));
        }
    }

    static {
        AbstractC1071v<Class> nullSafe = new AbstractC1071v<Class>() { // from class: com.google.gson.internal.bind.TypeAdapters.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p020b6.AbstractC1071v
            public Class read(JsonReader jsonReader) throws IOException {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            @Override // p020b6.AbstractC1071v
            public void write(JsonWriter jsonWriter, Class cls) throws IOException {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
            }
        }.nullSafe();
        CLASS = nullSafe;
        CLASS_FACTORY = newFactory(Class.class, nullSafe);
        AbstractC1071v<BitSet> nullSafe2 = new AbstractC1071v<BitSet>() { // from class: com.google.gson.internal.bind.TypeAdapters.2
            /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
            
                if (java.lang.Integer.parseInt(r1) != 0) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
            
                r5 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
            
                if (r8.nextInt() != 0) goto L23;
             */
            @Override // p020b6.AbstractC1071v
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.util.BitSet read(com.google.gson.stream.JsonReader r8) throws java.io.IOException {
                /*
                    r7 = this;
                    java.util.BitSet r0 = new java.util.BitSet
                    r0.<init>()
                    r8.beginArray()
                    com.google.gson.stream.JsonToken r1 = r8.peek()
                    r2 = 0
                    r3 = 0
                Le:
                    com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.END_ARRAY
                    if (r1 == r4) goto L75
                    int[] r4 = com.google.gson.internal.bind.TypeAdapters.C269836.$SwitchMap$com$google$gson$stream$JsonToken
                    int r5 = r1.ordinal()
                    r4 = r4[r5]
                    r5 = 1
                    if (r4 == r5) goto L63
                    r6 = 2
                    if (r4 == r6) goto L5e
                    r6 = 3
                    if (r4 != r6) goto L47
                    java.lang.String r1 = r8.nextString()
                    int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L30
                    if (r1 == 0) goto L2e
                    goto L69
                L2e:
                    r5 = 0
                    goto L69
                L30:
                    b6.t r8 = new b6.t
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                    r0.append(r2)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    r8.<init>(r0)
                    throw r8
                L47:
                    b6.t r8 = new b6.t
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r2 = "Invalid bitset value type: "
                    r0.append(r2)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    r8.<init>(r0)
                    throw r8
                L5e:
                    boolean r5 = r8.nextBoolean()
                    goto L69
                L63:
                    int r1 = r8.nextInt()
                    if (r1 == 0) goto L2e
                L69:
                    if (r5 == 0) goto L6e
                    r0.set(r3)
                L6e:
                    int r3 = r3 + 1
                    com.google.gson.stream.JsonToken r1 = r8.peek()
                    goto Le
                L75:
                    r8.endArray()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.C26802.read(com.google.gson.stream.JsonReader):java.util.BitSet");
            }

            @Override // p020b6.AbstractC1071v
            public void write(JsonWriter jsonWriter, BitSet bitSet) throws IOException {
                jsonWriter.beginArray();
                int length = bitSet.length();
                for (int i10 = 0; i10 < length; i10++) {
                    jsonWriter.value(bitSet.get(i10) ? 1L : 0L);
                }
                jsonWriter.endArray();
            }
        }.nullSafe();
        BIT_SET = nullSafe2;
        BIT_SET_FACTORY = newFactory(BitSet.class, nullSafe2);
        AbstractC1071v<Boolean> abstractC1071v = new AbstractC1071v<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p020b6.AbstractC1071v
            public Boolean read(JsonReader jsonReader) throws IOException {
                JsonToken peek = jsonReader.peek();
                if (peek == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                if (peek == JsonToken.STRING) {
                    return Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString()));
                }
                return Boolean.valueOf(jsonReader.nextBoolean());
            }

            @Override // p020b6.AbstractC1071v
            public void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
                jsonWriter.value(bool);
            }
        };
        BOOLEAN = abstractC1071v;
        BOOLEAN_AS_STRING = new AbstractC1071v<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p020b6.AbstractC1071v
            public Boolean read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return Boolean.valueOf(jsonReader.nextString());
            }

            @Override // p020b6.AbstractC1071v
            public void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
                jsonWriter.value(bool == null ? "null" : bool.toString());
            }
        };
        BOOLEAN_FACTORY = newFactory(Boolean.TYPE, Boolean.class, abstractC1071v);
        AbstractC1071v<Number> abstractC1071v2 = new AbstractC1071v<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p020b6.AbstractC1071v
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) jsonReader.nextInt());
                } catch (NumberFormatException e10) {
                    throw new C1069t(e10);
                }
            }

            @Override // p020b6.AbstractC1071v
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        BYTE = abstractC1071v2;
        BYTE_FACTORY = newFactory(Byte.TYPE, Byte.class, abstractC1071v2);
        AbstractC1071v<Number> abstractC1071v3 = new AbstractC1071v<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p020b6.AbstractC1071v
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Short.valueOf((short) jsonReader.nextInt());
                } catch (NumberFormatException e10) {
                    throw new C1069t(e10);
                }
            }

            @Override // p020b6.AbstractC1071v
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        SHORT = abstractC1071v3;
        SHORT_FACTORY = newFactory(Short.TYPE, Short.class, abstractC1071v3);
        AbstractC1071v<Number> abstractC1071v4 = new AbstractC1071v<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p020b6.AbstractC1071v
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Integer.valueOf(jsonReader.nextInt());
                } catch (NumberFormatException e10) {
                    throw new C1069t(e10);
                }
            }

            @Override // p020b6.AbstractC1071v
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        INTEGER = abstractC1071v4;
        INTEGER_FACTORY = newFactory(Integer.TYPE, Integer.class, abstractC1071v4);
        AbstractC1071v<AtomicInteger> nullSafe3 = new AbstractC1071v<AtomicInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // p020b6.AbstractC1071v
            public AtomicInteger read(JsonReader jsonReader) throws IOException {
                try {
                    return new AtomicInteger(jsonReader.nextInt());
                } catch (NumberFormatException e10) {
                    throw new C1069t(e10);
                }
            }

            @Override // p020b6.AbstractC1071v
            public void write(JsonWriter jsonWriter, AtomicInteger atomicInteger) throws IOException {
                jsonWriter.value(atomicInteger.get());
            }
        }.nullSafe();
        ATOMIC_INTEGER = nullSafe3;
        ATOMIC_INTEGER_FACTORY = newFactory(AtomicInteger.class, nullSafe3);
        AbstractC1071v<AtomicBoolean> nullSafe4 = new AbstractC1071v<AtomicBoolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // p020b6.AbstractC1071v
            public AtomicBoolean read(JsonReader jsonReader) throws IOException {
                return new AtomicBoolean(jsonReader.nextBoolean());
            }

            @Override // p020b6.AbstractC1071v
            public void write(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) throws IOException {
                jsonWriter.value(atomicBoolean.get());
            }
        }.nullSafe();
        ATOMIC_BOOLEAN = nullSafe4;
        ATOMIC_BOOLEAN_FACTORY = newFactory(AtomicBoolean.class, nullSafe4);
        AbstractC1071v<AtomicIntegerArray> nullSafe5 = new AbstractC1071v<AtomicIntegerArray>() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // p020b6.AbstractC1071v
            public AtomicIntegerArray read(JsonReader jsonReader) throws IOException {
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    try {
                        arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                    } catch (NumberFormatException e10) {
                        throw new C1069t(e10);
                    }
                }
                jsonReader.endArray();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // p020b6.AbstractC1071v
            public void write(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) throws IOException {
                jsonWriter.beginArray();
                int length = atomicIntegerArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    jsonWriter.value(atomicIntegerArray.get(i10));
                }
                jsonWriter.endArray();
            }
        }.nullSafe();
        ATOMIC_INTEGER_ARRAY = nullSafe5;
        ATOMIC_INTEGER_ARRAY_FACTORY = newFactory(AtomicIntegerArray.class, nullSafe5);
        LONG = new AbstractC1071v<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p020b6.AbstractC1071v
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Long.valueOf(jsonReader.nextLong());
                } catch (NumberFormatException e10) {
                    throw new C1069t(e10);
                }
            }

            @Override // p020b6.AbstractC1071v
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        FLOAT = new AbstractC1071v<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p020b6.AbstractC1071v
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return Float.valueOf((float) jsonReader.nextDouble());
            }

            @Override // p020b6.AbstractC1071v
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        DOUBLE = new AbstractC1071v<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p020b6.AbstractC1071v
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return Double.valueOf(jsonReader.nextDouble());
            }

            @Override // p020b6.AbstractC1071v
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        AbstractC1071v<Number> abstractC1071v5 = new AbstractC1071v<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p020b6.AbstractC1071v
            public Number read(JsonReader jsonReader) throws IOException {
                JsonToken peek = jsonReader.peek();
                int i10 = C269836.$SwitchMap$com$google$gson$stream$JsonToken[peek.ordinal()];
                if (i10 == 1 || i10 == 3) {
                    return new LazilyParsedNumber(jsonReader.nextString());
                }
                if (i10 == 4) {
                    jsonReader.nextNull();
                    return null;
                }
                throw new C1069t("Expecting number, got: " + peek);
            }

            @Override // p020b6.AbstractC1071v
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        NUMBER = abstractC1071v5;
        NUMBER_FACTORY = newFactory(Number.class, abstractC1071v5);
        AbstractC1071v<Character> abstractC1071v6 = new AbstractC1071v<Character>() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p020b6.AbstractC1071v
            public Character read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                if (nextString.length() == 1) {
                    return Character.valueOf(nextString.charAt(0));
                }
                throw new C1069t("Expecting character, got: " + nextString);
            }

            @Override // p020b6.AbstractC1071v
            public void write(JsonWriter jsonWriter, Character ch) throws IOException {
                jsonWriter.value(ch == null ? null : String.valueOf(ch));
            }
        };
        CHARACTER = abstractC1071v6;
        CHARACTER_FACTORY = newFactory(Character.TYPE, Character.class, abstractC1071v6);
        AbstractC1071v<String> abstractC1071v7 = new AbstractC1071v<String>() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // p020b6.AbstractC1071v
            public String read(JsonReader jsonReader) throws IOException {
                JsonToken peek = jsonReader.peek();
                if (peek == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                if (peek == JsonToken.BOOLEAN) {
                    return Boolean.toString(jsonReader.nextBoolean());
                }
                return jsonReader.nextString();
            }

            @Override // p020b6.AbstractC1071v
            public void write(JsonWriter jsonWriter, String str) throws IOException {
                jsonWriter.value(str);
            }
        };
        STRING = abstractC1071v7;
        BIG_DECIMAL = new AbstractC1071v<BigDecimal>() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // p020b6.AbstractC1071v
            public BigDecimal read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return new BigDecimal(jsonReader.nextString());
                } catch (NumberFormatException e10) {
                    throw new C1069t(e10);
                }
            }

            @Override // p020b6.AbstractC1071v
            public void write(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
                jsonWriter.value(bigDecimal);
            }
        };
        BIG_INTEGER = new AbstractC1071v<BigInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            @Override // p020b6.AbstractC1071v
            public BigInteger read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return new BigInteger(jsonReader.nextString());
                } catch (NumberFormatException e10) {
                    throw new C1069t(e10);
                }
            }

            @Override // p020b6.AbstractC1071v
            public void write(JsonWriter jsonWriter, BigInteger bigInteger) throws IOException {
                jsonWriter.value(bigInteger);
            }
        };
        STRING_FACTORY = newFactory(String.class, abstractC1071v7);
        AbstractC1071v<StringBuilder> abstractC1071v8 = new AbstractC1071v<StringBuilder>() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // p020b6.AbstractC1071v
            public StringBuilder read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return new StringBuilder(jsonReader.nextString());
            }

            @Override // p020b6.AbstractC1071v
            public void write(JsonWriter jsonWriter, StringBuilder sb2) throws IOException {
                jsonWriter.value(sb2 == null ? null : sb2.toString());
            }
        };
        STRING_BUILDER = abstractC1071v8;
        STRING_BUILDER_FACTORY = newFactory(StringBuilder.class, abstractC1071v8);
        AbstractC1071v<StringBuffer> abstractC1071v9 = new AbstractC1071v<StringBuffer>() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // p020b6.AbstractC1071v
            public StringBuffer read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return new StringBuffer(jsonReader.nextString());
            }

            @Override // p020b6.AbstractC1071v
            public void write(JsonWriter jsonWriter, StringBuffer stringBuffer) throws IOException {
                jsonWriter.value(stringBuffer == null ? null : stringBuffer.toString());
            }
        };
        STRING_BUFFER = abstractC1071v9;
        STRING_BUFFER_FACTORY = newFactory(StringBuffer.class, abstractC1071v9);
        AbstractC1071v<URL> abstractC1071v10 = new AbstractC1071v<URL>() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // p020b6.AbstractC1071v
            public URL read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                if ("null".equals(nextString)) {
                    return null;
                }
                return new URL(nextString);
            }

            @Override // p020b6.AbstractC1071v
            public void write(JsonWriter jsonWriter, URL url) throws IOException {
                jsonWriter.value(url == null ? null : url.toExternalForm());
            }
        };
        URL = abstractC1071v10;
        URL_FACTORY = newFactory(URL.class, abstractC1071v10);
        AbstractC1071v<URI> abstractC1071v11 = new AbstractC1071v<URI>() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // p020b6.AbstractC1071v
            public URI read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    String nextString = jsonReader.nextString();
                    if ("null".equals(nextString)) {
                        return null;
                    }
                    return new URI(nextString);
                } catch (URISyntaxException e10) {
                    throw new C1062m(e10);
                }
            }

            @Override // p020b6.AbstractC1071v
            public void write(JsonWriter jsonWriter, URI uri) throws IOException {
                jsonWriter.value(uri == null ? null : uri.toASCIIString());
            }
        };
        URI = abstractC1071v11;
        URI_FACTORY = newFactory(URI.class, abstractC1071v11);
        AbstractC1071v<InetAddress> abstractC1071v12 = new AbstractC1071v<InetAddress>() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // p020b6.AbstractC1071v
            public InetAddress read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return InetAddress.getByName(jsonReader.nextString());
            }

            @Override // p020b6.AbstractC1071v
            public void write(JsonWriter jsonWriter, InetAddress inetAddress) throws IOException {
                jsonWriter.value(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        INET_ADDRESS = abstractC1071v12;
        INET_ADDRESS_FACTORY = newTypeHierarchyFactory(InetAddress.class, abstractC1071v12);
        AbstractC1071v<UUID> abstractC1071v13 = new AbstractC1071v<UUID>() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // p020b6.AbstractC1071v
            public UUID read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return UUID.fromString(jsonReader.nextString());
            }

            @Override // p020b6.AbstractC1071v
            public void write(JsonWriter jsonWriter, UUID uuid) throws IOException {
                jsonWriter.value(uuid == null ? null : uuid.toString());
            }
        };
        UUID = abstractC1071v13;
        UUID_FACTORY = newFactory(UUID.class, abstractC1071v13);
        AbstractC1071v<Currency> nullSafe6 = new AbstractC1071v<Currency>() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // p020b6.AbstractC1071v
            public Currency read(JsonReader jsonReader) throws IOException {
                return Currency.getInstance(jsonReader.nextString());
            }

            @Override // p020b6.AbstractC1071v
            public void write(JsonWriter jsonWriter, Currency currency) throws IOException {
                jsonWriter.value(currency.getCurrencyCode());
            }
        }.nullSafe();
        CURRENCY = nullSafe6;
        CURRENCY_FACTORY = newFactory(Currency.class, nullSafe6);
        TIMESTAMP_FACTORY = new InterfaceC1072w() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            @Override // p020b6.InterfaceC1072w
            public <T> AbstractC1071v<T> create(C1055f c1055f, TypeToken<T> typeToken) {
                if (typeToken.getRawType() != Timestamp.class) {
                    return null;
                }
                final AbstractC1071v<T> m6308m = c1055f.m6308m(Date.class);
                return (AbstractC1071v<T>) new AbstractC1071v<Timestamp>() { // from class: com.google.gson.internal.bind.TypeAdapters.26.1
                    @Override // p020b6.AbstractC1071v
                    public Timestamp read(JsonReader jsonReader) throws IOException {
                        Date date = (Date) m6308m.read(jsonReader);
                        if (date != null) {
                            return new Timestamp(date.getTime());
                        }
                        return null;
                    }

                    @Override // p020b6.AbstractC1071v
                    public void write(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
                        m6308m.write(jsonWriter, timestamp);
                    }
                };
            }
        };
        AbstractC1071v<Calendar> abstractC1071v14 = new AbstractC1071v<Calendar>() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            private static final String DAY_OF_MONTH = "dayOfMonth";
            private static final String HOUR_OF_DAY = "hourOfDay";
            private static final String MINUTE = "minute";
            private static final String MONTH = "month";
            private static final String SECOND = "second";
            private static final String YEAR = "year";

            @Override // p020b6.AbstractC1071v
            public Calendar read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (jsonReader.peek() != JsonToken.END_OBJECT) {
                    String nextName = jsonReader.nextName();
                    int nextInt = jsonReader.nextInt();
                    if (YEAR.equals(nextName)) {
                        i10 = nextInt;
                    } else if (MONTH.equals(nextName)) {
                        i11 = nextInt;
                    } else if (DAY_OF_MONTH.equals(nextName)) {
                        i12 = nextInt;
                    } else if (HOUR_OF_DAY.equals(nextName)) {
                        i13 = nextInt;
                    } else if (MINUTE.equals(nextName)) {
                        i14 = nextInt;
                    } else if (SECOND.equals(nextName)) {
                        i15 = nextInt;
                    }
                }
                jsonReader.endObject();
                return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
            }

            @Override // p020b6.AbstractC1071v
            public void write(JsonWriter jsonWriter, Calendar calendar) throws IOException {
                if (calendar == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginObject();
                jsonWriter.name(YEAR);
                jsonWriter.value(calendar.get(1));
                jsonWriter.name(MONTH);
                jsonWriter.value(calendar.get(2));
                jsonWriter.name(DAY_OF_MONTH);
                jsonWriter.value(calendar.get(5));
                jsonWriter.name(HOUR_OF_DAY);
                jsonWriter.value(calendar.get(11));
                jsonWriter.name(MINUTE);
                jsonWriter.value(calendar.get(12));
                jsonWriter.name(SECOND);
                jsonWriter.value(calendar.get(13));
                jsonWriter.endObject();
            }
        };
        CALENDAR = abstractC1071v14;
        CALENDAR_FACTORY = newFactoryForMultipleTypes(Calendar.class, GregorianCalendar.class, abstractC1071v14);
        AbstractC1071v<Locale> abstractC1071v15 = new AbstractC1071v<Locale>() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            @Override // p020b6.AbstractC1071v
            public Locale read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (nextToken2 == null && nextToken3 == null) {
                    return new Locale(nextToken);
                }
                if (nextToken3 == null) {
                    return new Locale(nextToken, nextToken2);
                }
                return new Locale(nextToken, nextToken2, nextToken3);
            }

            @Override // p020b6.AbstractC1071v
            public void write(JsonWriter jsonWriter, Locale locale) throws IOException {
                jsonWriter.value(locale == null ? null : locale.toString());
            }
        };
        LOCALE = abstractC1071v15;
        LOCALE_FACTORY = newFactory(Locale.class, abstractC1071v15);
        AbstractC1071v<AbstractC1061l> abstractC1071v16 = new AbstractC1071v<AbstractC1061l>() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p020b6.AbstractC1071v
            public AbstractC1061l read(JsonReader jsonReader) throws IOException {
                switch (C269836.$SwitchMap$com$google$gson$stream$JsonToken[jsonReader.peek().ordinal()]) {
                    case 1:
                        return new C1066q(new LazilyParsedNumber(jsonReader.nextString()));
                    case 2:
                        return new C1066q(Boolean.valueOf(jsonReader.nextBoolean()));
                    case 3:
                        return new C1066q(jsonReader.nextString());
                    case 4:
                        jsonReader.nextNull();
                        return C1063n.f5296a;
                    case 5:
                        C1058i c1058i = new C1058i();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            c1058i.m6332p(read(jsonReader));
                        }
                        jsonReader.endArray();
                        return c1058i;
                    case 6:
                        C1064o c1064o = new C1064o();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            c1064o.m6341p(jsonReader.nextName(), read(jsonReader));
                        }
                        jsonReader.endObject();
                        return c1064o;
                    default:
                        throw new IllegalArgumentException();
                }
            }

            @Override // p020b6.AbstractC1071v
            public void write(JsonWriter jsonWriter, AbstractC1061l abstractC1061l) throws IOException {
                if (abstractC1061l != null && !abstractC1061l.m6338l()) {
                    if (abstractC1061l.m6340o()) {
                        C1066q m6336i = abstractC1061l.m6336i();
                        if (m6336i.m6355z()) {
                            jsonWriter.value(m6336i.m6352v());
                            return;
                        } else if (m6336i.m6354x()) {
                            jsonWriter.value(m6336i.m6347p());
                            return;
                        } else {
                            jsonWriter.value(m6336i.m6353w());
                            return;
                        }
                    }
                    if (abstractC1061l.m6337k()) {
                        jsonWriter.beginArray();
                        Iterator<AbstractC1061l> it = abstractC1061l.m6334c().iterator();
                        while (it.hasNext()) {
                            write(jsonWriter, it.next());
                        }
                        jsonWriter.endArray();
                        return;
                    }
                    if (abstractC1061l.m6339m()) {
                        jsonWriter.beginObject();
                        for (Map.Entry<String, AbstractC1061l> entry : abstractC1061l.m6335e().m6342q()) {
                            jsonWriter.name(entry.getKey());
                            write(jsonWriter, entry.getValue());
                        }
                        jsonWriter.endObject();
                        return;
                    }
                    throw new IllegalArgumentException("Couldn't write " + abstractC1061l.getClass());
                }
                jsonWriter.nullValue();
            }
        };
        JSON_ELEMENT = abstractC1071v16;
        JSON_ELEMENT_FACTORY = newTypeHierarchyFactory(AbstractC1061l.class, abstractC1071v16);
        ENUM_FACTORY = new InterfaceC1072w() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // p020b6.InterfaceC1072w
            public <T> AbstractC1071v<T> create(C1055f c1055f, TypeToken<T> typeToken) {
                Class<? super T> rawType = typeToken.getRawType();
                if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                    return null;
                }
                if (!rawType.isEnum()) {
                    rawType = rawType.getSuperclass();
                }
                return new EnumTypeAdapter(rawType);
            }
        };
    }

    private TypeAdapters() {
        throw new UnsupportedOperationException();
    }

    public static <TT> InterfaceC1072w newFactory(final TypeToken<TT> typeToken, final AbstractC1071v<TT> abstractC1071v) {
        return new InterfaceC1072w() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            @Override // p020b6.InterfaceC1072w
            public <T> AbstractC1071v<T> create(C1055f c1055f, TypeToken<T> typeToken2) {
                if (typeToken2.equals(TypeToken.this)) {
                    return abstractC1071v;
                }
                return null;
            }
        };
    }

    public static <TT> InterfaceC1072w newFactoryForMultipleTypes(final Class<TT> cls, final Class<? extends TT> cls2, final AbstractC1071v<? super TT> abstractC1071v) {
        return new InterfaceC1072w() { // from class: com.google.gson.internal.bind.TypeAdapters.34
            @Override // p020b6.InterfaceC1072w
            public <T> AbstractC1071v<T> create(C1055f c1055f, TypeToken<T> typeToken) {
                Class<? super T> rawType = typeToken.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return abstractC1071v;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + abstractC1071v + "]";
            }
        };
    }

    public static <T1> InterfaceC1072w newTypeHierarchyFactory(final Class<T1> cls, final AbstractC1071v<T1> abstractC1071v) {
        return new InterfaceC1072w() { // from class: com.google.gson.internal.bind.TypeAdapters.35
            @Override // p020b6.InterfaceC1072w
            public <T2> AbstractC1071v<T2> create(C1055f c1055f, TypeToken<T2> typeToken) {
                final Class<? super T2> rawType = typeToken.getRawType();
                if (cls.isAssignableFrom(rawType)) {
                    return (AbstractC1071v<T2>) new AbstractC1071v<T1>() { // from class: com.google.gson.internal.bind.TypeAdapters.35.1
                        @Override // p020b6.AbstractC1071v
                        public T1 read(JsonReader jsonReader) throws IOException {
                            T1 t12 = (T1) abstractC1071v.read(jsonReader);
                            if (t12 == null || rawType.isInstance(t12)) {
                                return t12;
                            }
                            throw new C1069t("Expected a " + rawType.getName() + " but was " + t12.getClass().getName());
                        }

                        @Override // p020b6.AbstractC1071v
                        public void write(JsonWriter jsonWriter, T1 t12) throws IOException {
                            abstractC1071v.write(jsonWriter, t12);
                        }
                    };
                }
                return null;
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + abstractC1071v + "]";
            }
        };
    }

    public static <TT> InterfaceC1072w newFactory(final Class<TT> cls, final AbstractC1071v<TT> abstractC1071v) {
        return new InterfaceC1072w() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            @Override // p020b6.InterfaceC1072w
            public <T> AbstractC1071v<T> create(C1055f c1055f, TypeToken<T> typeToken) {
                if (typeToken.getRawType() == cls) {
                    return abstractC1071v;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + abstractC1071v + "]";
            }
        };
    }

    public static <TT> InterfaceC1072w newFactory(final Class<TT> cls, final Class<TT> cls2, final AbstractC1071v<? super TT> abstractC1071v) {
        return new InterfaceC1072w() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            @Override // p020b6.InterfaceC1072w
            public <T> AbstractC1071v<T> create(C1055f c1055f, TypeToken<T> typeToken) {
                Class<? super T> rawType = typeToken.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return abstractC1071v;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + abstractC1071v + "]";
            }
        };
    }
}
