package p091gc;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p091gc.AbstractC3344p;
import p119ic.InterfaceC3557a;
import p119ic.InterfaceC3558b;
import p119ic.InterfaceC3559c;
import p119ic.InterfaceC3560d;
import p119ic.InterfaceC3561e;
import p119ic.InterfaceC3562f;
import p119ic.InterfaceC3563g;
import p119ic.InterfaceC3564h;
import p119ic.InterfaceC3565i;
import p119ic.InterfaceC3566j;
import p119ic.InterfaceC3567k;
import p119ic.InterfaceC3568l;
import p119ic.InterfaceC3569m;
import p119ic.InterfaceC3570n;
import p119ic.InterfaceC3571o;
import p119ic.InterfaceC3572p;
import p119ic.InterfaceC3573q;
import p119ic.InterfaceC3574r;
import p119ic.InterfaceC3575s;
import p119ic.InterfaceC3576t;
import p119ic.InterfaceC3577u;
import p119ic.InterfaceC3578v;
import p119ic.InterfaceC3580x;
import p119ic.InterfaceC3581y;
import p193ob.C4167b0;
import p193ob.C4169c0;
import p193ob.C4177g0;
import p193ob.C4200y;
import p193ob.C4201z;
import va.InterfaceC4999c;

/* renamed from: gc.s */
/* loaded from: classes.dex */
public final class C3347s {

    /* renamed from: a */
    private final Method f13969a;

    /* renamed from: b */
    private final C4201z f13970b;

    /* renamed from: c */
    final String f13971c;

    /* renamed from: d */
    private final String f13972d;

    /* renamed from: e */
    private final C4200y f13973e;

    /* renamed from: f */
    private final C4167b0 f13974f;

    /* renamed from: g */
    private final boolean f13975g;

    /* renamed from: h */
    private final boolean f13976h;

    /* renamed from: i */
    private final boolean f13977i;

    /* renamed from: j */
    private final AbstractC3344p<?>[] f13978j;

    /* renamed from: k */
    final boolean f13979k;

    /* renamed from: gc.s$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: x */
        private static final Pattern f13980x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y */
        private static final Pattern f13981y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a */
        final C3349u f13982a;

        /* renamed from: b */
        final Method f13983b;

        /* renamed from: c */
        final Annotation[] f13984c;

        /* renamed from: d */
        final Annotation[][] f13985d;

        /* renamed from: e */
        final Type[] f13986e;

        /* renamed from: f */
        boolean f13987f;

        /* renamed from: g */
        boolean f13988g;

        /* renamed from: h */
        boolean f13989h;

        /* renamed from: i */
        boolean f13990i;

        /* renamed from: j */
        boolean f13991j;

        /* renamed from: k */
        boolean f13992k;

        /* renamed from: l */
        boolean f13993l;

        /* renamed from: m */
        boolean f13994m;

        /* renamed from: n */
        String f13995n;

        /* renamed from: o */
        boolean f13996o;

        /* renamed from: p */
        boolean f13997p;

        /* renamed from: q */
        boolean f13998q;

        /* renamed from: r */
        String f13999r;

        /* renamed from: s */
        C4200y f14000s;

        /* renamed from: t */
        C4167b0 f14001t;

        /* renamed from: u */
        Set<String> f14002u;

        /* renamed from: v */
        AbstractC3344p<?>[] f14003v;

        /* renamed from: w */
        boolean f14004w;

        a(C3349u c3349u, Method method) {
            this.f13982a = c3349u;
            this.f13983b = method;
            this.f13984c = method.getAnnotations();
            this.f13986e = method.getGenericParameterTypes();
            this.f13985d = method.getParameterAnnotations();
        }

        /* renamed from: a */
        private static Class<?> m14719a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        /* renamed from: c */
        private C4200y m14720c(String[] strArr) {
            C4200y.a aVar = new C4200y.a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw C3353y.m14768m(this.f13983b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    try {
                        this.f14001t = C4167b0.m17278c(trim);
                    } catch (IllegalArgumentException e10) {
                        throw C3353y.m14769n(this.f13983b, e10, "Malformed content type: %s", trim);
                    }
                } else {
                    aVar.m17561a(substring, trim);
                }
            }
            return aVar.m17565e();
        }

        /* renamed from: d */
        private void m14721d(String str, String str2, boolean z10) {
            String str3 = this.f13995n;
            if (str3 != null) {
                throw C3353y.m14768m(this.f13983b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f13995n = str;
            this.f13996o = z10;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (f13980x.matcher(substring).find()) {
                    throw C3353y.m14768m(this.f13983b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.f13999r = str2;
            this.f14002u = m14725h(str2);
        }

        /* renamed from: e */
        private void m14722e(Annotation annotation) {
            if (annotation instanceof InterfaceC3558b) {
                m14721d("DELETE", ((InterfaceC3558b) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC3562f) {
                m14721d("GET", ((InterfaceC3562f) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC3563g) {
                m14721d("HEAD", ((InterfaceC3563g) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC3570n) {
                m14721d("PATCH", ((InterfaceC3570n) annotation).value(), true);
                return;
            }
            if (annotation instanceof InterfaceC3571o) {
                m14721d("POST", ((InterfaceC3571o) annotation).value(), true);
                return;
            }
            if (annotation instanceof InterfaceC3572p) {
                m14721d("PUT", ((InterfaceC3572p) annotation).value(), true);
                return;
            }
            if (annotation instanceof InterfaceC3569m) {
                m14721d("OPTIONS", ((InterfaceC3569m) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC3564h) {
                InterfaceC3564h interfaceC3564h = (InterfaceC3564h) annotation;
                m14721d(interfaceC3564h.method(), interfaceC3564h.path(), interfaceC3564h.hasBody());
                return;
            }
            if (annotation instanceof InterfaceC3567k) {
                String[] value = ((InterfaceC3567k) annotation).value();
                if (value.length != 0) {
                    this.f14000s = m14720c(value);
                    return;
                }
                throw C3353y.m14768m(this.f13983b, "@Headers annotation is empty.", new Object[0]);
            }
            if (annotation instanceof InterfaceC3568l) {
                if (!this.f13997p) {
                    this.f13998q = true;
                    return;
                }
                throw C3353y.m14768m(this.f13983b, "Only one encoding annotation is allowed.", new Object[0]);
            }
            if (annotation instanceof InterfaceC3561e) {
                if (!this.f13998q) {
                    this.f13997p = true;
                    return;
                }
                throw C3353y.m14768m(this.f13983b, "Only one encoding annotation is allowed.", new Object[0]);
            }
        }

        /* renamed from: f */
        private AbstractC3344p<?> m14723f(int i10, Type type, Annotation[] annotationArr, boolean z10) {
            AbstractC3344p<?> abstractC3344p;
            if (annotationArr != null) {
                abstractC3344p = null;
                for (Annotation annotation : annotationArr) {
                    AbstractC3344p<?> m14724g = m14724g(i10, type, annotationArr, annotation);
                    if (m14724g != null) {
                        if (abstractC3344p != null) {
                            throw C3353y.m14770o(this.f13983b, i10, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        abstractC3344p = m14724g;
                    }
                }
            } else {
                abstractC3344p = null;
            }
            if (abstractC3344p != null) {
                return abstractC3344p;
            }
            if (z10) {
                try {
                    if (C3353y.m14763h(type) == InterfaceC4999c.class) {
                        this.f14004w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw C3353y.m14770o(this.f13983b, i10, "No Retrofit annotation found.", new Object[0]);
        }

        /* renamed from: g */
        private AbstractC3344p<?> m14724g(int i10, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof InterfaceC3581y) {
                m14727j(i10, type);
                if (!this.f13994m) {
                    if (!this.f13990i) {
                        if (!this.f13991j) {
                            if (!this.f13992k) {
                                if (!this.f13993l) {
                                    if (this.f13999r != null) {
                                        throw C3353y.m14770o(this.f13983b, i10, "@Url cannot be used with @%s URL", this.f13995n);
                                    }
                                    this.f13994m = true;
                                    if (type != C4201z.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                        throw C3353y.m14770o(this.f13983b, i10, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                    }
                                    return new AbstractC3344p.p(this.f13983b, i10);
                                }
                                throw C3353y.m14770o(this.f13983b, i10, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                            }
                            throw C3353y.m14770o(this.f13983b, i10, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                        }
                        throw C3353y.m14770o(this.f13983b, i10, "A @Url parameter must not come after a @Query.", new Object[0]);
                    }
                    throw C3353y.m14770o(this.f13983b, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                throw C3353y.m14770o(this.f13983b, i10, "Multiple @Url method annotations found.", new Object[0]);
            }
            if (annotation instanceof InterfaceC3575s) {
                m14727j(i10, type);
                if (!this.f13991j) {
                    if (!this.f13992k) {
                        if (!this.f13993l) {
                            if (!this.f13994m) {
                                if (this.f13999r == null) {
                                    throw C3353y.m14770o(this.f13983b, i10, "@Path can only be used with relative url on @%s", this.f13995n);
                                }
                                this.f13990i = true;
                                InterfaceC3575s interfaceC3575s = (InterfaceC3575s) annotation;
                                String value = interfaceC3575s.value();
                                m14726i(i10, value);
                                return new AbstractC3344p.k(this.f13983b, i10, value, this.f13982a.m14746i(type, annotationArr), interfaceC3575s.encoded());
                            }
                            throw C3353y.m14770o(this.f13983b, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                        }
                        throw C3353y.m14770o(this.f13983b, i10, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                    }
                    throw C3353y.m14770o(this.f13983b, i10, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                throw C3353y.m14770o(this.f13983b, i10, "A @Path parameter must not come after a @Query.", new Object[0]);
            }
            if (annotation instanceof InterfaceC3576t) {
                m14727j(i10, type);
                InterfaceC3576t interfaceC3576t = (InterfaceC3576t) annotation;
                String value2 = interfaceC3576t.value();
                boolean encoded = interfaceC3576t.encoded();
                Class<?> m14763h = C3353y.m14763h(type);
                this.f13991j = true;
                if (Iterable.class.isAssignableFrom(m14763h)) {
                    if (type instanceof ParameterizedType) {
                        return new AbstractC3344p.l(value2, this.f13982a.m14746i(C3353y.m14762g(0, (ParameterizedType) type), annotationArr), encoded).m14685c();
                    }
                    throw C3353y.m14770o(this.f13983b, i10, m14763h.getSimpleName() + " must include generic type (e.g., " + m14763h.getSimpleName() + "<String>)", new Object[0]);
                }
                if (m14763h.isArray()) {
                    return new AbstractC3344p.l(value2, this.f13982a.m14746i(m14719a(m14763h.getComponentType()), annotationArr), encoded).m14684b();
                }
                return new AbstractC3344p.l(value2, this.f13982a.m14746i(type, annotationArr), encoded);
            }
            if (annotation instanceof InterfaceC3578v) {
                m14727j(i10, type);
                boolean encoded2 = ((InterfaceC3578v) annotation).encoded();
                Class<?> m14763h2 = C3353y.m14763h(type);
                this.f13992k = true;
                if (Iterable.class.isAssignableFrom(m14763h2)) {
                    if (type instanceof ParameterizedType) {
                        return new AbstractC3344p.n(this.f13982a.m14746i(C3353y.m14762g(0, (ParameterizedType) type), annotationArr), encoded2).m14685c();
                    }
                    throw C3353y.m14770o(this.f13983b, i10, m14763h2.getSimpleName() + " must include generic type (e.g., " + m14763h2.getSimpleName() + "<String>)", new Object[0]);
                }
                if (m14763h2.isArray()) {
                    return new AbstractC3344p.n(this.f13982a.m14746i(m14719a(m14763h2.getComponentType()), annotationArr), encoded2).m14684b();
                }
                return new AbstractC3344p.n(this.f13982a.m14746i(type, annotationArr), encoded2);
            }
            if (annotation instanceof InterfaceC3577u) {
                m14727j(i10, type);
                Class<?> m14763h3 = C3353y.m14763h(type);
                this.f13993l = true;
                if (Map.class.isAssignableFrom(m14763h3)) {
                    Type m14764i = C3353y.m14764i(type, m14763h3, Map.class);
                    if (m14764i instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) m14764i;
                        Type m14762g = C3353y.m14762g(0, parameterizedType);
                        if (String.class == m14762g) {
                            return new AbstractC3344p.m(this.f13983b, i10, this.f13982a.m14746i(C3353y.m14762g(1, parameterizedType), annotationArr), ((InterfaceC3577u) annotation).encoded());
                        }
                        throw C3353y.m14770o(this.f13983b, i10, "@QueryMap keys must be of type String: " + m14762g, new Object[0]);
                    }
                    throw C3353y.m14770o(this.f13983b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw C3353y.m14770o(this.f13983b, i10, "@QueryMap parameter type must be Map.", new Object[0]);
            }
            if (annotation instanceof InterfaceC3565i) {
                m14727j(i10, type);
                String value3 = ((InterfaceC3565i) annotation).value();
                Class<?> m14763h4 = C3353y.m14763h(type);
                if (Iterable.class.isAssignableFrom(m14763h4)) {
                    if (type instanceof ParameterizedType) {
                        return new AbstractC3344p.f(value3, this.f13982a.m14746i(C3353y.m14762g(0, (ParameterizedType) type), annotationArr)).m14685c();
                    }
                    throw C3353y.m14770o(this.f13983b, i10, m14763h4.getSimpleName() + " must include generic type (e.g., " + m14763h4.getSimpleName() + "<String>)", new Object[0]);
                }
                if (m14763h4.isArray()) {
                    return new AbstractC3344p.f(value3, this.f13982a.m14746i(m14719a(m14763h4.getComponentType()), annotationArr)).m14684b();
                }
                return new AbstractC3344p.f(value3, this.f13982a.m14746i(type, annotationArr));
            }
            if (annotation instanceof InterfaceC3566j) {
                if (type == C4200y.class) {
                    return new AbstractC3344p.h(this.f13983b, i10);
                }
                m14727j(i10, type);
                Class<?> m14763h5 = C3353y.m14763h(type);
                if (Map.class.isAssignableFrom(m14763h5)) {
                    Type m14764i2 = C3353y.m14764i(type, m14763h5, Map.class);
                    if (m14764i2 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) m14764i2;
                        Type m14762g2 = C3353y.m14762g(0, parameterizedType2);
                        if (String.class == m14762g2) {
                            return new AbstractC3344p.g(this.f13983b, i10, this.f13982a.m14746i(C3353y.m14762g(1, parameterizedType2), annotationArr));
                        }
                        throw C3353y.m14770o(this.f13983b, i10, "@HeaderMap keys must be of type String: " + m14762g2, new Object[0]);
                    }
                    throw C3353y.m14770o(this.f13983b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw C3353y.m14770o(this.f13983b, i10, "@HeaderMap parameter type must be Map.", new Object[0]);
            }
            if (annotation instanceof InterfaceC3559c) {
                m14727j(i10, type);
                if (this.f13997p) {
                    InterfaceC3559c interfaceC3559c = (InterfaceC3559c) annotation;
                    String value4 = interfaceC3559c.value();
                    boolean encoded3 = interfaceC3559c.encoded();
                    this.f13987f = true;
                    Class<?> m14763h6 = C3353y.m14763h(type);
                    if (Iterable.class.isAssignableFrom(m14763h6)) {
                        if (type instanceof ParameterizedType) {
                            return new AbstractC3344p.d(value4, this.f13982a.m14746i(C3353y.m14762g(0, (ParameterizedType) type), annotationArr), encoded3).m14685c();
                        }
                        throw C3353y.m14770o(this.f13983b, i10, m14763h6.getSimpleName() + " must include generic type (e.g., " + m14763h6.getSimpleName() + "<String>)", new Object[0]);
                    }
                    if (m14763h6.isArray()) {
                        return new AbstractC3344p.d(value4, this.f13982a.m14746i(m14719a(m14763h6.getComponentType()), annotationArr), encoded3).m14684b();
                    }
                    return new AbstractC3344p.d(value4, this.f13982a.m14746i(type, annotationArr), encoded3);
                }
                throw C3353y.m14770o(this.f13983b, i10, "@Field parameters can only be used with form encoding.", new Object[0]);
            }
            if (annotation instanceof InterfaceC3560d) {
                m14727j(i10, type);
                if (this.f13997p) {
                    Class<?> m14763h7 = C3353y.m14763h(type);
                    if (Map.class.isAssignableFrom(m14763h7)) {
                        Type m14764i3 = C3353y.m14764i(type, m14763h7, Map.class);
                        if (m14764i3 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) m14764i3;
                            Type m14762g3 = C3353y.m14762g(0, parameterizedType3);
                            if (String.class == m14762g3) {
                                InterfaceC3334f m14746i = this.f13982a.m14746i(C3353y.m14762g(1, parameterizedType3), annotationArr);
                                this.f13987f = true;
                                return new AbstractC3344p.e(this.f13983b, i10, m14746i, ((InterfaceC3560d) annotation).encoded());
                            }
                            throw C3353y.m14770o(this.f13983b, i10, "@FieldMap keys must be of type String: " + m14762g3, new Object[0]);
                        }
                        throw C3353y.m14770o(this.f13983b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw C3353y.m14770o(this.f13983b, i10, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw C3353y.m14770o(this.f13983b, i10, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            }
            if (annotation instanceof InterfaceC3573q) {
                m14727j(i10, type);
                if (this.f13998q) {
                    InterfaceC3573q interfaceC3573q = (InterfaceC3573q) annotation;
                    this.f13988g = true;
                    String value5 = interfaceC3573q.value();
                    Class<?> m14763h8 = C3353y.m14763h(type);
                    if (value5.isEmpty()) {
                        if (Iterable.class.isAssignableFrom(m14763h8)) {
                            if (type instanceof ParameterizedType) {
                                if (C4169c0.b.class.isAssignableFrom(C3353y.m14763h(C3353y.m14762g(0, (ParameterizedType) type)))) {
                                    return AbstractC3344p.o.f13946a.m14685c();
                                }
                                throw C3353y.m14770o(this.f13983b, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                            }
                            throw C3353y.m14770o(this.f13983b, i10, m14763h8.getSimpleName() + " must include generic type (e.g., " + m14763h8.getSimpleName() + "<String>)", new Object[0]);
                        }
                        if (m14763h8.isArray()) {
                            if (C4169c0.b.class.isAssignableFrom(m14763h8.getComponentType())) {
                                return AbstractC3344p.o.f13946a.m14684b();
                            }
                            throw C3353y.m14770o(this.f13983b, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                        if (C4169c0.b.class.isAssignableFrom(m14763h8)) {
                            return AbstractC3344p.o.f13946a;
                        }
                        throw C3353y.m14770o(this.f13983b, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    C4200y m17554g = C4200y.m17554g("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", interfaceC3573q.encoding());
                    if (Iterable.class.isAssignableFrom(m14763h8)) {
                        if (type instanceof ParameterizedType) {
                            Type m14762g4 = C3353y.m14762g(0, (ParameterizedType) type);
                            if (!C4169c0.b.class.isAssignableFrom(C3353y.m14763h(m14762g4))) {
                                return new AbstractC3344p.i(this.f13983b, i10, m17554g, this.f13982a.m14744g(m14762g4, annotationArr, this.f13984c)).m14685c();
                            }
                            throw C3353y.m14770o(this.f13983b, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                        throw C3353y.m14770o(this.f13983b, i10, m14763h8.getSimpleName() + " must include generic type (e.g., " + m14763h8.getSimpleName() + "<String>)", new Object[0]);
                    }
                    if (m14763h8.isArray()) {
                        Class<?> m14719a = m14719a(m14763h8.getComponentType());
                        if (!C4169c0.b.class.isAssignableFrom(m14719a)) {
                            return new AbstractC3344p.i(this.f13983b, i10, m17554g, this.f13982a.m14744g(m14719a, annotationArr, this.f13984c)).m14684b();
                        }
                        throw C3353y.m14770o(this.f13983b, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    if (!C4169c0.b.class.isAssignableFrom(m14763h8)) {
                        return new AbstractC3344p.i(this.f13983b, i10, m17554g, this.f13982a.m14744g(type, annotationArr, this.f13984c));
                    }
                    throw C3353y.m14770o(this.f13983b, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                throw C3353y.m14770o(this.f13983b, i10, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            if (annotation instanceof InterfaceC3574r) {
                m14727j(i10, type);
                if (this.f13998q) {
                    this.f13988g = true;
                    Class<?> m14763h9 = C3353y.m14763h(type);
                    if (Map.class.isAssignableFrom(m14763h9)) {
                        Type m14764i4 = C3353y.m14764i(type, m14763h9, Map.class);
                        if (m14764i4 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) m14764i4;
                            Type m14762g5 = C3353y.m14762g(0, parameterizedType4);
                            if (String.class == m14762g5) {
                                Type m14762g6 = C3353y.m14762g(1, parameterizedType4);
                                if (!C4169c0.b.class.isAssignableFrom(C3353y.m14763h(m14762g6))) {
                                    return new AbstractC3344p.j(this.f13983b, i10, this.f13982a.m14744g(m14762g6, annotationArr, this.f13984c), ((InterfaceC3574r) annotation).encoding());
                                }
                                throw C3353y.m14770o(this.f13983b, i10, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            throw C3353y.m14770o(this.f13983b, i10, "@PartMap keys must be of type String: " + m14762g5, new Object[0]);
                        }
                        throw C3353y.m14770o(this.f13983b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw C3353y.m14770o(this.f13983b, i10, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw C3353y.m14770o(this.f13983b, i10, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            }
            if (annotation instanceof InterfaceC3557a) {
                m14727j(i10, type);
                if (!this.f13997p && !this.f13998q) {
                    if (!this.f13989h) {
                        try {
                            InterfaceC3334f m14744g = this.f13982a.m14744g(type, annotationArr, this.f13984c);
                            this.f13989h = true;
                            return new AbstractC3344p.c(this.f13983b, i10, m14744g);
                        } catch (RuntimeException e10) {
                            throw C3353y.m14771p(this.f13983b, e10, i10, "Unable to create @Body converter for %s", type);
                        }
                    }
                    throw C3353y.m14770o(this.f13983b, i10, "Multiple @Body method annotations found.", new Object[0]);
                }
                throw C3353y.m14770o(this.f13983b, i10, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
            }
            if (!(annotation instanceof InterfaceC3580x)) {
                return null;
            }
            m14727j(i10, type);
            Class<?> m14763h10 = C3353y.m14763h(type);
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                AbstractC3344p<?> abstractC3344p = this.f14003v[i11];
                if ((abstractC3344p instanceof AbstractC3344p.q) && ((AbstractC3344p.q) abstractC3344p).f13949a.equals(m14763h10)) {
                    throw C3353y.m14770o(this.f13983b, i10, "@Tag type " + m14763h10.getName() + " is duplicate of parameter #" + (i11 + 1) + " and would always overwrite its value.", new Object[0]);
                }
            }
            return new AbstractC3344p.q(m14763h10);
        }

        /* renamed from: h */
        static Set<String> m14725h(String str) {
            Matcher matcher = f13980x.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        /* renamed from: i */
        private void m14726i(int i10, String str) {
            if (f13981y.matcher(str).matches()) {
                if (!this.f14002u.contains(str)) {
                    throw C3353y.m14770o(this.f13983b, i10, "URL \"%s\" does not contain \"{%s}\".", this.f13999r, str);
                }
                return;
            }
            throw C3353y.m14770o(this.f13983b, i10, "@Path parameter name must match %s. Found: %s", f13980x.pattern(), str);
        }

        /* renamed from: j */
        private void m14727j(int i10, Type type) {
            if (C3353y.m14765j(type)) {
                throw C3353y.m14770o(this.f13983b, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        /* renamed from: b */
        C3347s m14728b() {
            for (Annotation annotation : this.f13984c) {
                m14722e(annotation);
            }
            if (this.f13995n != null) {
                if (!this.f13996o) {
                    if (!this.f13998q) {
                        if (this.f13997p) {
                            throw C3353y.m14768m(this.f13983b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                        }
                    } else {
                        throw C3353y.m14768m(this.f13983b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.f13985d.length;
                this.f14003v = new AbstractC3344p[length];
                int i10 = length - 1;
                int i11 = 0;
                while (true) {
                    boolean z10 = true;
                    if (i11 >= length) {
                        break;
                    }
                    AbstractC3344p<?>[] abstractC3344pArr = this.f14003v;
                    Type type = this.f13986e[i11];
                    Annotation[] annotationArr = this.f13985d[i11];
                    if (i11 != i10) {
                        z10 = false;
                    }
                    abstractC3344pArr[i11] = m14723f(i11, type, annotationArr, z10);
                    i11++;
                }
                if (this.f13999r == null && !this.f13994m) {
                    throw C3353y.m14768m(this.f13983b, "Missing either @%s URL or @Url parameter.", this.f13995n);
                }
                boolean z11 = this.f13997p;
                if (!z11 && !this.f13998q && !this.f13996o && this.f13989h) {
                    throw C3353y.m14768m(this.f13983b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z11 && !this.f13987f) {
                    throw C3353y.m14768m(this.f13983b, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (this.f13998q && !this.f13988g) {
                    throw C3353y.m14768m(this.f13983b, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                return new C3347s(this);
            }
            throw C3353y.m14768m(this.f13983b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
        }
    }

    C3347s(a aVar) {
        this.f13969a = aVar.f13983b;
        this.f13970b = aVar.f13982a.f14010c;
        this.f13971c = aVar.f13995n;
        this.f13972d = aVar.f13999r;
        this.f13973e = aVar.f14000s;
        this.f13974f = aVar.f14001t;
        this.f13975g = aVar.f13996o;
        this.f13976h = aVar.f13997p;
        this.f13977i = aVar.f13998q;
        this.f13978j = aVar.f14003v;
        this.f13979k = aVar.f14004w;
    }

    /* renamed from: b */
    public static C3347s m14717b(C3349u c3349u, Method method) {
        return new a(c3349u, method).m14728b();
    }

    /* renamed from: a */
    public C4177g0 m14718a(Object[] objArr) throws IOException {
        AbstractC3344p<?>[] abstractC3344pArr = this.f13978j;
        int length = objArr.length;
        if (length == abstractC3344pArr.length) {
            C3346r c3346r = new C3346r(this.f13971c, this.f13970b, this.f13972d, this.f13973e, this.f13974f, this.f13975g, this.f13976h, this.f13977i);
            if (this.f13979k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(objArr[i10]);
                abstractC3344pArr[i10].mo14683a(c3346r, objArr[i10]);
            }
            return c3346r.m14711k().m17407g(C3340l.class, new C3340l(this.f13969a, arrayList)).m17401a();
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + abstractC3344pArr.length + ")");
    }
}
