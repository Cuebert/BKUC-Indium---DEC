package p193ob;

import java.io.Closeable;
import p193ob.C4200y;
import p230rb.C4472c;

/* renamed from: ob.i0 */
/* loaded from: classes.dex */
public final class C4181i0 implements Closeable {

    /* renamed from: A */
    private volatile C4174f f17146A;

    /* renamed from: n */
    final C4177g0 f17147n;

    /* renamed from: o */
    final EnumC4173e0 f17148o;

    /* renamed from: p */
    final int f17149p;

    /* renamed from: q */
    final String f17150q;

    /* renamed from: r */
    final C4199x f17151r;

    /* renamed from: s */
    final C4200y f17152s;

    /* renamed from: t */
    final AbstractC4183j0 f17153t;

    /* renamed from: u */
    final C4181i0 f17154u;

    /* renamed from: v */
    final C4181i0 f17155v;

    /* renamed from: w */
    final C4181i0 f17156w;

    /* renamed from: x */
    final long f17157x;

    /* renamed from: y */
    final long f17158y;

    /* renamed from: z */
    final C4472c f17159z;

    C4181i0(a aVar) {
        this.f17147n = aVar.f17160a;
        this.f17148o = aVar.f17161b;
        this.f17149p = aVar.f17162c;
        this.f17150q = aVar.f17163d;
        this.f17151r = aVar.f17164e;
        this.f17152s = aVar.f17165f.m17565e();
        this.f17153t = aVar.f17166g;
        this.f17154u = aVar.f17167h;
        this.f17155v = aVar.f17168i;
        this.f17156w = aVar.f17169j;
        this.f17157x = aVar.f17170k;
        this.f17158y = aVar.f17171l;
        this.f17159z = aVar.f17172m;
    }

    /* renamed from: O */
    public C4200y m17424O() {
        return this.f17152s;
    }

    /* renamed from: Q */
    public boolean m17425Q() {
        int i10 = this.f17149p;
        return i10 >= 200 && i10 < 300;
    }

    /* renamed from: T */
    public String m17426T() {
        return this.f17150q;
    }

    /* renamed from: W */
    public C4181i0 m17427W() {
        return this.f17154u;
    }

    /* renamed from: X */
    public a m17428X() {
        return new a(this);
    }

    /* renamed from: Y */
    public C4181i0 m17429Y() {
        return this.f17156w;
    }

    /* renamed from: b */
    public AbstractC4183j0 m17430b() {
        return this.f17153t;
    }

    /* renamed from: c */
    public C4174f m17431c() {
        C4174f c4174f = this.f17146A;
        if (c4174f != null) {
            return c4174f;
        }
        C4174f m17361k = C4174f.m17361k(this.f17152s);
        this.f17146A = m17361k;
        return m17361k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC4183j0 abstractC4183j0 = this.f17153t;
        if (abstractC4183j0 != null) {
            abstractC4183j0.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    /* renamed from: e */
    public int m17432e() {
        return this.f17149p;
    }

    /* renamed from: e0 */
    public EnumC4173e0 m17433e0() {
        return this.f17148o;
    }

    /* renamed from: i */
    public C4199x m17434i() {
        return this.f17151r;
    }

    /* renamed from: j0 */
    public long m17435j0() {
        return this.f17158y;
    }

    /* renamed from: k0 */
    public C4177g0 m17436k0() {
        return this.f17147n;
    }

    /* renamed from: l */
    public String m17437l(String str) {
        return m17439z(str, null);
    }

    /* renamed from: l0 */
    public long m17438l0() {
        return this.f17157x;
    }

    public String toString() {
        return "Response{protocol=" + this.f17148o + ", code=" + this.f17149p + ", message=" + this.f17150q + ", url=" + this.f17147n.m17400j() + '}';
    }

    /* renamed from: z */
    public String m17439z(String str, String str2) {
        String m17555c = this.f17152s.m17555c(str);
        return m17555c != null ? m17555c : str2;
    }

    /* renamed from: ob.i0$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        C4177g0 f17160a;

        /* renamed from: b */
        EnumC4173e0 f17161b;

        /* renamed from: c */
        int f17162c;

        /* renamed from: d */
        String f17163d;

        /* renamed from: e */
        C4199x f17164e;

        /* renamed from: f */
        C4200y.a f17165f;

        /* renamed from: g */
        AbstractC4183j0 f17166g;

        /* renamed from: h */
        C4181i0 f17167h;

        /* renamed from: i */
        C4181i0 f17168i;

        /* renamed from: j */
        C4181i0 f17169j;

        /* renamed from: k */
        long f17170k;

        /* renamed from: l */
        long f17171l;

        /* renamed from: m */
        C4472c f17172m;

        public a() {
            this.f17162c = -1;
            this.f17165f = new C4200y.a();
        }

        /* renamed from: e */
        private void m17440e(C4181i0 c4181i0) {
            if (c4181i0.f17153t != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* renamed from: f */
        private void m17441f(String str, C4181i0 c4181i0) {
            if (c4181i0.f17153t == null) {
                if (c4181i0.f17154u == null) {
                    if (c4181i0.f17155v == null) {
                        if (c4181i0.f17156w == null) {
                            return;
                        }
                        throw new IllegalArgumentException(str + ".priorResponse != null");
                    }
                    throw new IllegalArgumentException(str + ".cacheResponse != null");
                }
                throw new IllegalArgumentException(str + ".networkResponse != null");
            }
            throw new IllegalArgumentException(str + ".body != null");
        }

        /* renamed from: a */
        public a m17442a(String str, String str2) {
            this.f17165f.m17561a(str, str2);
            return this;
        }

        /* renamed from: b */
        public a m17443b(AbstractC4183j0 abstractC4183j0) {
            this.f17166g = abstractC4183j0;
            return this;
        }

        /* renamed from: c */
        public C4181i0 m17444c() {
            if (this.f17160a != null) {
                if (this.f17161b != null) {
                    if (this.f17162c >= 0) {
                        if (this.f17163d != null) {
                            return new C4181i0(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("code < 0: " + this.f17162c);
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }

        /* renamed from: d */
        public a m17445d(C4181i0 c4181i0) {
            if (c4181i0 != null) {
                m17441f("cacheResponse", c4181i0);
            }
            this.f17168i = c4181i0;
            return this;
        }

        /* renamed from: g */
        public a m17446g(int i10) {
            this.f17162c = i10;
            return this;
        }

        /* renamed from: h */
        public a m17447h(C4199x c4199x) {
            this.f17164e = c4199x;
            return this;
        }

        /* renamed from: i */
        public a m17448i(String str, String str2) {
            this.f17165f.m17568h(str, str2);
            return this;
        }

        /* renamed from: j */
        public a m17449j(C4200y c4200y) {
            this.f17165f = c4200y.m17557f();
            return this;
        }

        /* renamed from: k */
        public void m17450k(C4472c c4472c) {
            this.f17172m = c4472c;
        }

        /* renamed from: l */
        public a m17451l(String str) {
            this.f17163d = str;
            return this;
        }

        /* renamed from: m */
        public a m17452m(C4181i0 c4181i0) {
            if (c4181i0 != null) {
                m17441f("networkResponse", c4181i0);
            }
            this.f17167h = c4181i0;
            return this;
        }

        /* renamed from: n */
        public a m17453n(C4181i0 c4181i0) {
            if (c4181i0 != null) {
                m17440e(c4181i0);
            }
            this.f17169j = c4181i0;
            return this;
        }

        /* renamed from: o */
        public a m17454o(EnumC4173e0 enumC4173e0) {
            this.f17161b = enumC4173e0;
            return this;
        }

        /* renamed from: p */
        public a m17455p(long j10) {
            this.f17171l = j10;
            return this;
        }

        /* renamed from: q */
        public a m17456q(C4177g0 c4177g0) {
            this.f17160a = c4177g0;
            return this;
        }

        /* renamed from: r */
        public a m17457r(long j10) {
            this.f17170k = j10;
            return this;
        }

        a(C4181i0 c4181i0) {
            this.f17162c = -1;
            this.f17160a = c4181i0.f17147n;
            this.f17161b = c4181i0.f17148o;
            this.f17162c = c4181i0.f17149p;
            this.f17163d = c4181i0.f17150q;
            this.f17164e = c4181i0.f17151r;
            this.f17165f = c4181i0.f17152s.m17557f();
            this.f17166g = c4181i0.f17153t;
            this.f17167h = c4181i0.f17154u;
            this.f17168i = c4181i0.f17155v;
            this.f17169j = c4181i0.f17156w;
            this.f17170k = c4181i0.f17157x;
            this.f17171l = c4181i0.f17158y;
            this.f17172m = c4181i0.f17159z;
        }
    }
}
