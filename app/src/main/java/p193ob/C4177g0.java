package p193ob;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p193ob.C4200y;
import p205pb.C4286e;
import sb.C4557f;

/* renamed from: ob.g0 */
/* loaded from: classes.dex */
public final class C4177g0 {

    /* renamed from: a */
    final C4201z f17121a;

    /* renamed from: b */
    final String f17122b;

    /* renamed from: c */
    final C4200y f17123c;

    /* renamed from: d */
    final AbstractC4179h0 f17124d;

    /* renamed from: e */
    final Map<Class<?>, Object> f17125e;

    /* renamed from: f */
    private volatile C4174f f17126f;

    C4177g0(a aVar) {
        this.f17121a = aVar.f17127a;
        this.f17122b = aVar.f17128b;
        this.f17123c = aVar.f17129c.m17565e();
        this.f17124d = aVar.f17130d;
        this.f17125e = C4286e.m17758v(aVar.f17131e);
    }

    /* renamed from: a */
    public AbstractC4179h0 m17391a() {
        return this.f17124d;
    }

    /* renamed from: b */
    public C4174f m17392b() {
        C4174f c4174f = this.f17126f;
        if (c4174f != null) {
            return c4174f;
        }
        C4174f m17361k = C4174f.m17361k(this.f17123c);
        this.f17126f = m17361k;
        return m17361k;
    }

    /* renamed from: c */
    public String m17393c(String str) {
        return this.f17123c.m17555c(str);
    }

    /* renamed from: d */
    public List<String> m17394d(String str) {
        return this.f17123c.m17560j(str);
    }

    /* renamed from: e */
    public C4200y m17395e() {
        return this.f17123c;
    }

    /* renamed from: f */
    public boolean m17396f() {
        return this.f17121a.m17594n();
    }

    /* renamed from: g */
    public String m17397g() {
        return this.f17122b;
    }

    /* renamed from: h */
    public a m17398h() {
        return new a(this);
    }

    /* renamed from: i */
    public <T> T m17399i(Class<? extends T> cls) {
        return cls.cast(this.f17125e.get(cls));
    }

    /* renamed from: j */
    public C4201z m17400j() {
        return this.f17121a;
    }

    public String toString() {
        return "Request{method=" + this.f17122b + ", url=" + this.f17121a + ", tags=" + this.f17125e + '}';
    }

    /* renamed from: ob.g0$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        C4201z f17127a;

        /* renamed from: b */
        String f17128b;

        /* renamed from: c */
        C4200y.a f17129c;

        /* renamed from: d */
        AbstractC4179h0 f17130d;

        /* renamed from: e */
        Map<Class<?>, Object> f17131e;

        public a() {
            this.f17131e = Collections.emptyMap();
            this.f17128b = "GET";
            this.f17129c = new C4200y.a();
        }

        /* renamed from: a */
        public C4177g0 m17401a() {
            if (this.f17127a != null) {
                return new C4177g0(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: b */
        public a m17402b(String str, String str2) {
            this.f17129c.m17568h(str, str2);
            return this;
        }

        /* renamed from: c */
        public a m17403c(C4200y c4200y) {
            this.f17129c = c4200y.m17557f();
            return this;
        }

        /* renamed from: d */
        public a m17404d(String str, AbstractC4179h0 abstractC4179h0) {
            Objects.requireNonNull(str, "method == null");
            if (str.length() != 0) {
                if (abstractC4179h0 != null && !C4557f.m18629b(str)) {
                    throw new IllegalArgumentException("method " + str + " must not have a request body.");
                }
                if (abstractC4179h0 == null && C4557f.m18632e(str)) {
                    throw new IllegalArgumentException("method " + str + " must have a request body.");
                }
                this.f17128b = str;
                this.f17130d = abstractC4179h0;
                return this;
            }
            throw new IllegalArgumentException("method.length() == 0");
        }

        /* renamed from: e */
        public a m17405e(AbstractC4179h0 abstractC4179h0) {
            return m17404d("POST", abstractC4179h0);
        }

        /* renamed from: f */
        public a m17406f(String str) {
            this.f17129c.m17567g(str);
            return this;
        }

        /* renamed from: g */
        public <T> a m17407g(Class<? super T> cls, T t10) {
            Objects.requireNonNull(cls, "type == null");
            if (t10 == null) {
                this.f17131e.remove(cls);
            } else {
                if (this.f17131e.isEmpty()) {
                    this.f17131e = new LinkedHashMap();
                }
                this.f17131e.put(cls, cls.cast(t10));
            }
            return this;
        }

        /* renamed from: h */
        public a m17408h(String str) {
            Objects.requireNonNull(str, "url == null");
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                str = "http:" + str.substring(3);
            } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                str = "https:" + str.substring(4);
            }
            return m17409i(C4201z.m17575l(str));
        }

        /* renamed from: i */
        public a m17409i(C4201z c4201z) {
            Objects.requireNonNull(c4201z, "url == null");
            this.f17127a = c4201z;
            return this;
        }

        a(C4177g0 c4177g0) {
            Map<Class<?>, Object> linkedHashMap;
            this.f17131e = Collections.emptyMap();
            this.f17127a = c4177g0.f17121a;
            this.f17128b = c4177g0.f17122b;
            this.f17130d = c4177g0.f17124d;
            if (c4177g0.f17125e.isEmpty()) {
                linkedHashMap = Collections.emptyMap();
            } else {
                linkedHashMap = new LinkedHashMap<>(c4177g0.f17125e);
            }
            this.f17131e = linkedHashMap;
            this.f17129c = c4177g0.f17123c.m17557f();
        }
    }
}
