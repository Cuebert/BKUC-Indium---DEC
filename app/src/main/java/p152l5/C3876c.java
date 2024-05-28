package p152l5;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: l5.c */
/* loaded from: classes.dex */
public final class C3876c {

    /* renamed from: a */
    private final String f16115a;

    /* renamed from: b */
    private final Map<Class<?>, Object> f16116b;

    /* renamed from: l5.c$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final String f16117a;

        /* renamed from: b */
        private Map<Class<?>, Object> f16118b = null;

        b(String str) {
            this.f16117a = str;
        }

        /* renamed from: a */
        public C3876c m16481a() {
            Map unmodifiableMap;
            String str = this.f16117a;
            if (this.f16118b == null) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(this.f16118b));
            }
            return new C3876c(str, unmodifiableMap);
        }

        /* renamed from: b */
        public <T extends Annotation> b m16482b(T t10) {
            if (this.f16118b == null) {
                this.f16118b = new HashMap();
            }
            this.f16118b.put(t10.annotationType(), t10);
            return this;
        }
    }

    /* renamed from: a */
    public static b m16477a(String str) {
        return new b(str);
    }

    /* renamed from: d */
    public static C3876c m16478d(String str) {
        return new C3876c(str, Collections.emptyMap());
    }

    /* renamed from: b */
    public String m16479b() {
        return this.f16115a;
    }

    /* renamed from: c */
    public <T extends Annotation> T m16480c(Class<T> cls) {
        return (T) this.f16116b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3876c)) {
            return false;
        }
        C3876c c3876c = (C3876c) obj;
        return this.f16115a.equals(c3876c.f16115a) && this.f16116b.equals(c3876c.f16116b);
    }

    public int hashCode() {
        return (this.f16115a.hashCode() * 31) + this.f16116b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f16115a + ", properties=" + this.f16116b.values() + "}";
    }

    private C3876c(String str, Map<Class<?>, Object> map) {
        this.f16115a = str;
        this.f16116b = map;
    }
}
