package p193ob;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import p193ob.AbstractC4197v;
import p193ob.C4181i0;
import p193ob.C4200y;
import p193ob.InterfaceC4176g;
import p205pb.AbstractC4282a;
import p205pb.C4286e;
import p217qb.InterfaceC4371f;
import p230rb.C4472c;
import p230rb.C4476g;
import p291wb.C5492f;
import p304xb.C5580a;
import p317yb.AbstractC5930c;
import p317yb.C5931d;

/* renamed from: ob.d0 */
/* loaded from: classes.dex */
public class C4171d0 implements Cloneable, InterfaceC4176g.a {

    /* renamed from: P */
    static final List<EnumC4173e0> f16990P = C4286e.m17757u(EnumC4173e0.HTTP_2, EnumC4173e0.HTTP_1_1);

    /* renamed from: Q */
    static final List<C4189n> f16991Q = C4286e.m17757u(C4189n.f17318h, C4189n.f17320j);

    /* renamed from: A */
    final AbstractC5930c f16992A;

    /* renamed from: B */
    final HostnameVerifier f16993B;

    /* renamed from: C */
    final C4180i f16994C;

    /* renamed from: D */
    final InterfaceC4170d f16995D;

    /* renamed from: E */
    final InterfaceC4170d f16996E;

    /* renamed from: F */
    final C4188m f16997F;

    /* renamed from: G */
    final InterfaceC4195t f16998G;

    /* renamed from: H */
    final boolean f16999H;

    /* renamed from: I */
    final boolean f17000I;

    /* renamed from: J */
    final boolean f17001J;

    /* renamed from: K */
    final int f17002K;

    /* renamed from: L */
    final int f17003L;

    /* renamed from: M */
    final int f17004M;

    /* renamed from: N */
    final int f17005N;

    /* renamed from: O */
    final int f17006O;

    /* renamed from: n */
    final C4192q f17007n;

    /* renamed from: o */
    final Proxy f17008o;

    /* renamed from: p */
    final List<EnumC4173e0> f17009p;

    /* renamed from: q */
    final List<C4189n> f17010q;

    /* renamed from: r */
    final List<InterfaceC4165a0> f17011r;

    /* renamed from: s */
    final List<InterfaceC4165a0> f17012s;

    /* renamed from: t */
    final AbstractC4197v.b f17013t;

    /* renamed from: u */
    final ProxySelector f17014u;

    /* renamed from: v */
    final InterfaceC4191p f17015v;

    /* renamed from: w */
    final C4172e f17016w;

    /* renamed from: x */
    final InterfaceC4371f f17017x;

    /* renamed from: y */
    final SocketFactory f17018y;

    /* renamed from: z */
    final SSLSocketFactory f17019z;

    /* renamed from: ob.d0$a */
    /* loaded from: classes.dex */
    class a extends AbstractC4282a {
        a() {
        }

        @Override // p205pb.AbstractC4282a
        /* renamed from: a */
        public void mo17319a(C4200y.a aVar, String str) {
            aVar.m17563c(str);
        }

        @Override // p205pb.AbstractC4282a
        /* renamed from: b */
        public void mo17320b(C4200y.a aVar, String str, String str2) {
            aVar.m17564d(str, str2);
        }

        @Override // p205pb.AbstractC4282a
        /* renamed from: c */
        public void mo17321c(C4189n c4189n, SSLSocket sSLSocket, boolean z10) {
            c4189n.m17480a(sSLSocket, z10);
        }

        @Override // p205pb.AbstractC4282a
        /* renamed from: d */
        public int mo17322d(C4181i0.a aVar) {
            return aVar.f17162c;
        }

        @Override // p205pb.AbstractC4282a
        /* renamed from: e */
        public boolean mo17323e(C4164a c4164a, C4164a c4164a2) {
            return c4164a.m17261d(c4164a2);
        }

        @Override // p205pb.AbstractC4282a
        /* renamed from: f */
        public C4472c mo17324f(C4181i0 c4181i0) {
            return c4181i0.f17159z;
        }

        @Override // p205pb.AbstractC4282a
        /* renamed from: g */
        public void mo17325g(C4181i0.a aVar, C4472c c4472c) {
            aVar.m17450k(c4472c);
        }

        @Override // p205pb.AbstractC4282a
        /* renamed from: h */
        public C4476g mo17326h(C4188m c4188m) {
            return c4188m.f17314a;
        }
    }

    static {
        AbstractC4282a.f17486a = new a();
    }

    public C4171d0() {
        this(new b());
    }

    /* renamed from: x */
    private static SSLSocketFactory m17290x(X509TrustManager x509TrustManager) {
        try {
            SSLContext mo20194n = C5492f.m20215l().mo20194n();
            mo20194n.init(null, new TrustManager[]{x509TrustManager}, null);
            return mo20194n.getSocketFactory();
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS", e10);
        }
    }

    /* renamed from: A */
    public List<EnumC4173e0> m17291A() {
        return this.f17009p;
    }

    /* renamed from: B */
    public Proxy m17292B() {
        return this.f17008o;
    }

    /* renamed from: C */
    public InterfaceC4170d m17293C() {
        return this.f16995D;
    }

    /* renamed from: D */
    public ProxySelector m17294D() {
        return this.f17014u;
    }

    /* renamed from: E */
    public int m17295E() {
        return this.f17004M;
    }

    /* renamed from: F */
    public boolean m17296F() {
        return this.f17001J;
    }

    /* renamed from: G */
    public SocketFactory m17297G() {
        return this.f17018y;
    }

    /* renamed from: H */
    public SSLSocketFactory m17298H() {
        return this.f17019z;
    }

    /* renamed from: I */
    public int m17299I() {
        return this.f17005N;
    }

    @Override // p193ob.InterfaceC4176g.a
    /* renamed from: a */
    public InterfaceC4176g mo17300a(C4177g0 c4177g0) {
        return C4175f0.m17376g(this, c4177g0, false);
    }

    /* renamed from: d */
    public InterfaceC4170d m17301d() {
        return this.f16996E;
    }

    /* renamed from: f */
    public int m17302f() {
        return this.f17002K;
    }

    /* renamed from: g */
    public C4180i m17303g() {
        return this.f16994C;
    }

    /* renamed from: h */
    public int m17304h() {
        return this.f17003L;
    }

    /* renamed from: j */
    public C4188m m17305j() {
        return this.f16997F;
    }

    /* renamed from: k */
    public List<C4189n> m17306k() {
        return this.f17010q;
    }

    /* renamed from: m */
    public InterfaceC4191p m17307m() {
        return this.f17015v;
    }

    /* renamed from: n */
    public C4192q m17308n() {
        return this.f17007n;
    }

    /* renamed from: o */
    public InterfaceC4195t m17309o() {
        return this.f16998G;
    }

    /* renamed from: p */
    public AbstractC4197v.b m17310p() {
        return this.f17013t;
    }

    /* renamed from: q */
    public boolean m17311q() {
        return this.f17000I;
    }

    /* renamed from: r */
    public boolean m17312r() {
        return this.f16999H;
    }

    /* renamed from: s */
    public HostnameVerifier m17313s() {
        return this.f16993B;
    }

    /* renamed from: t */
    public List<InterfaceC4165a0> m17314t() {
        return this.f17011r;
    }

    /* renamed from: u */
    public InterfaceC4371f m17315u() {
        C4172e c4172e = this.f17016w;
        return c4172e != null ? c4172e.f17048n : this.f17017x;
    }

    /* renamed from: v */
    public List<InterfaceC4165a0> m17316v() {
        return this.f17012s;
    }

    /* renamed from: w */
    public b m17317w() {
        return new b(this);
    }

    /* renamed from: y */
    public int m17318y() {
        return this.f17006O;
    }

    C4171d0(b bVar) {
        boolean z10;
        this.f17007n = bVar.f17022a;
        this.f17008o = bVar.f17023b;
        this.f17009p = bVar.f17024c;
        List<C4189n> list = bVar.f17025d;
        this.f17010q = list;
        this.f17011r = C4286e.m17756t(bVar.f17026e);
        this.f17012s = C4286e.m17756t(bVar.f17027f);
        this.f17013t = bVar.f17028g;
        this.f17014u = bVar.f17029h;
        this.f17015v = bVar.f17030i;
        this.f17016w = bVar.f17031j;
        this.f17017x = bVar.f17032k;
        this.f17018y = bVar.f17033l;
        Iterator<C4189n> it = list.iterator();
        loop0: while (true) {
            while (it.hasNext()) {
                z10 = z10 || it.next().m17483d();
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.f17034m;
        if (sSLSocketFactory == null && z10) {
            X509TrustManager m17727D = C4286e.m17727D();
            this.f17019z = m17290x(m17727D);
            this.f16992A = AbstractC5930c.m21093b(m17727D);
        } else {
            this.f17019z = sSLSocketFactory;
            this.f16992A = bVar.f17035n;
        }
        if (this.f17019z != null) {
            C5492f.m20215l().mo20206f(this.f17019z);
        }
        this.f16993B = bVar.f17036o;
        this.f16994C = bVar.f17037p.m17421f(this.f16992A);
        this.f16995D = bVar.f17038q;
        this.f16996E = bVar.f17039r;
        this.f16997F = bVar.f17040s;
        this.f16998G = bVar.f17041t;
        this.f16999H = bVar.f17042u;
        this.f17000I = bVar.f17043v;
        this.f17001J = bVar.f17044w;
        this.f17002K = bVar.f17045x;
        this.f17003L = bVar.f17046y;
        this.f17004M = bVar.f17047z;
        this.f17005N = bVar.f17020A;
        this.f17006O = bVar.f17021B;
        if (!this.f17011r.contains(null)) {
            if (this.f17012s.contains(null)) {
                throw new IllegalStateException("Null network interceptor: " + this.f17012s);
            }
            return;
        }
        throw new IllegalStateException("Null interceptor: " + this.f17011r);
    }

    /* renamed from: ob.d0$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: A */
        int f17020A;

        /* renamed from: B */
        int f17021B;

        /* renamed from: a */
        C4192q f17022a;

        /* renamed from: b */
        Proxy f17023b;

        /* renamed from: c */
        List<EnumC4173e0> f17024c;

        /* renamed from: d */
        List<C4189n> f17025d;

        /* renamed from: e */
        final List<InterfaceC4165a0> f17026e;

        /* renamed from: f */
        final List<InterfaceC4165a0> f17027f;

        /* renamed from: g */
        AbstractC4197v.b f17028g;

        /* renamed from: h */
        ProxySelector f17029h;

        /* renamed from: i */
        InterfaceC4191p f17030i;

        /* renamed from: j */
        C4172e f17031j;

        /* renamed from: k */
        InterfaceC4371f f17032k;

        /* renamed from: l */
        SocketFactory f17033l;

        /* renamed from: m */
        SSLSocketFactory f17034m;

        /* renamed from: n */
        AbstractC5930c f17035n;

        /* renamed from: o */
        HostnameVerifier f17036o;

        /* renamed from: p */
        C4180i f17037p;

        /* renamed from: q */
        InterfaceC4170d f17038q;

        /* renamed from: r */
        InterfaceC4170d f17039r;

        /* renamed from: s */
        C4188m f17040s;

        /* renamed from: t */
        InterfaceC4195t f17041t;

        /* renamed from: u */
        boolean f17042u;

        /* renamed from: v */
        boolean f17043v;

        /* renamed from: w */
        boolean f17044w;

        /* renamed from: x */
        int f17045x;

        /* renamed from: y */
        int f17046y;

        /* renamed from: z */
        int f17047z;

        public b() {
            this.f17026e = new ArrayList();
            this.f17027f = new ArrayList();
            this.f17022a = new C4192q();
            this.f17024c = C4171d0.f16990P;
            this.f17025d = C4171d0.f16991Q;
            this.f17028g = AbstractC4197v.m17516l(AbstractC4197v.f17353a);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f17029h = proxySelector;
            if (proxySelector == null) {
                this.f17029h = new C5580a();
            }
            this.f17030i = InterfaceC4191p.f17342a;
            this.f17033l = SocketFactory.getDefault();
            this.f17036o = C5931d.f21819a;
            this.f17037p = C4180i.f17138c;
            InterfaceC4170d interfaceC4170d = InterfaceC4170d.f16989a;
            this.f17038q = interfaceC4170d;
            this.f17039r = interfaceC4170d;
            this.f17040s = new C4188m();
            this.f17041t = InterfaceC4195t.f17351a;
            this.f17042u = true;
            this.f17043v = true;
            this.f17044w = true;
            this.f17045x = 0;
            this.f17046y = 10000;
            this.f17047z = 10000;
            this.f17020A = 10000;
            this.f17021B = 0;
        }

        /* renamed from: a */
        public b m17327a(InterfaceC4165a0 interfaceC4165a0) {
            if (interfaceC4165a0 != null) {
                this.f17026e.add(interfaceC4165a0);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        /* renamed from: b */
        public b m17328b(InterfaceC4165a0 interfaceC4165a0) {
            if (interfaceC4165a0 != null) {
                this.f17027f.add(interfaceC4165a0);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        /* renamed from: c */
        public C4171d0 m17329c() {
            return new C4171d0(this);
        }

        /* renamed from: d */
        public b m17330d(C4172e c4172e) {
            this.f17031j = c4172e;
            this.f17032k = null;
            return this;
        }

        /* renamed from: e */
        public b m17331e(long j10, TimeUnit timeUnit) {
            this.f17046y = C4286e.m17741e("timeout", j10, timeUnit);
            return this;
        }

        /* renamed from: f */
        public b m17332f(InterfaceC4191p interfaceC4191p) {
            Objects.requireNonNull(interfaceC4191p, "cookieJar == null");
            this.f17030i = interfaceC4191p;
            return this;
        }

        /* renamed from: g */
        public b m17333g(AbstractC4197v abstractC4197v) {
            Objects.requireNonNull(abstractC4197v, "eventListener == null");
            this.f17028g = AbstractC4197v.m17516l(abstractC4197v);
            return this;
        }

        /* renamed from: h */
        public b m17334h(boolean z10) {
            this.f17043v = z10;
            return this;
        }

        /* renamed from: i */
        public b m17335i(long j10, TimeUnit timeUnit) {
            this.f17047z = C4286e.m17741e("timeout", j10, timeUnit);
            return this;
        }

        b(C4171d0 c4171d0) {
            ArrayList arrayList = new ArrayList();
            this.f17026e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f17027f = arrayList2;
            this.f17022a = c4171d0.f17007n;
            this.f17023b = c4171d0.f17008o;
            this.f17024c = c4171d0.f17009p;
            this.f17025d = c4171d0.f17010q;
            arrayList.addAll(c4171d0.f17011r);
            arrayList2.addAll(c4171d0.f17012s);
            this.f17028g = c4171d0.f17013t;
            this.f17029h = c4171d0.f17014u;
            this.f17030i = c4171d0.f17015v;
            this.f17032k = c4171d0.f17017x;
            this.f17031j = c4171d0.f17016w;
            this.f17033l = c4171d0.f17018y;
            this.f17034m = c4171d0.f17019z;
            this.f17035n = c4171d0.f16992A;
            this.f17036o = c4171d0.f16993B;
            this.f17037p = c4171d0.f16994C;
            this.f17038q = c4171d0.f16995D;
            this.f17039r = c4171d0.f16996E;
            this.f17040s = c4171d0.f16997F;
            this.f17041t = c4171d0.f16998G;
            this.f17042u = c4171d0.f16999H;
            this.f17043v = c4171d0.f17000I;
            this.f17044w = c4171d0.f17001J;
            this.f17045x = c4171d0.f17002K;
            this.f17046y = c4171d0.f17003L;
            this.f17047z = c4171d0.f17004M;
            this.f17020A = c4171d0.f17005N;
            this.f17021B = c4171d0.f17006O;
        }
    }
}
