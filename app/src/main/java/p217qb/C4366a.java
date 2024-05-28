package p217qb;

import ac.C0073c;
import ac.C0082l;
import ac.C0091u;
import ac.InterfaceC0074d;
import ac.InterfaceC0075e;
import ac.InterfaceC0089s;
import ac.InterfaceC0090t;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p193ob.C4177g0;
import p193ob.C4181i0;
import p193ob.C4200y;
import p193ob.EnumC4173e0;
import p193ob.InterfaceC4165a0;
import p205pb.AbstractC4282a;
import p205pb.C4286e;
import p217qb.C4368c;
import sb.C4556e;
import sb.C4557f;
import sb.C4559h;

/* renamed from: qb.a */
/* loaded from: classes.dex */
public final class C4366a implements InterfaceC4165a0 {

    /* renamed from: a */
    final InterfaceC4371f f17837a;

    /* renamed from: qb.a$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC0090t {

        /* renamed from: n */
        boolean f17838n;

        /* renamed from: o */
        final /* synthetic */ InterfaceC0075e f17839o;

        /* renamed from: p */
        final /* synthetic */ InterfaceC4367b f17840p;

        /* renamed from: q */
        final /* synthetic */ InterfaceC0074d f17841q;

        a(InterfaceC0075e interfaceC0075e, InterfaceC4367b interfaceC4367b, InterfaceC0074d interfaceC0074d) {
            this.f17839o = interfaceC0075e;
            this.f17840p = interfaceC4367b;
            this.f17841q = interfaceC0074d;
        }

        @Override // ac.InterfaceC0090t
        /* renamed from: V */
        public long mo315V(C0073c c0073c, long j10) throws IOException {
            try {
                long mo315V = this.f17839o.mo315V(c0073c, j10);
                if (mo315V == -1) {
                    if (!this.f17838n) {
                        this.f17838n = true;
                        this.f17841q.close();
                    }
                    return -1L;
                }
                c0073c.m360k0(this.f17841q.mo348a(), c0073c.m381y0() - mo315V, mo315V);
                this.f17841q.mo344R();
                return mo315V;
            } catch (IOException e10) {
                if (!this.f17838n) {
                    this.f17838n = true;
                    this.f17840p.mo17352b();
                }
                throw e10;
            }
        }

        @Override // ac.InterfaceC0090t, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.f17838n && !C4286e.m17752p(this, 100, TimeUnit.MILLISECONDS)) {
                this.f17838n = true;
                this.f17840p.mo17352b();
            }
            this.f17839o.close();
        }

        @Override // ac.InterfaceC0090t
        /* renamed from: f */
        public C0091u mo316f() {
            return this.f17839o.mo316f();
        }
    }

    public C4366a(InterfaceC4371f interfaceC4371f) {
        this.f17837a = interfaceC4371f;
    }

    /* renamed from: b */
    private C4181i0 m18057b(InterfaceC4367b interfaceC4367b, C4181i0 c4181i0) throws IOException {
        InterfaceC0089s mo17351a;
        if (interfaceC4367b == null || (mo17351a = interfaceC4367b.mo17351a()) == null) {
            return c4181i0;
        }
        return c4181i0.m17428X().m17443b(new C4559h(c4181i0.m17437l("Content-Type"), c4181i0.m17430b().mo14680i(), C0082l.m425d(new a(c4181i0.m17430b().mo14678Q(), interfaceC4367b, C0082l.m424c(mo17351a))))).m17444c();
    }

    /* renamed from: c */
    private static C4200y m18058c(C4200y c4200y, C4200y c4200y2) {
        C4200y.a aVar = new C4200y.a();
        int m17558h = c4200y.m17558h();
        for (int i10 = 0; i10 < m17558h; i10++) {
            String m17556e = c4200y.m17556e(i10);
            String m17559i = c4200y.m17559i(i10);
            if ((!"Warning".equalsIgnoreCase(m17556e) || !m17559i.startsWith("1")) && (m18059d(m17556e) || !m18060e(m17556e) || c4200y2.m17555c(m17556e) == null)) {
                AbstractC4282a.f17486a.mo17320b(aVar, m17556e, m17559i);
            }
        }
        int m17558h2 = c4200y2.m17558h();
        for (int i11 = 0; i11 < m17558h2; i11++) {
            String m17556e2 = c4200y2.m17556e(i11);
            if (!m18059d(m17556e2) && m18060e(m17556e2)) {
                AbstractC4282a.f17486a.mo17320b(aVar, m17556e2, c4200y2.m17559i(i11));
            }
        }
        return aVar.m17565e();
    }

    /* renamed from: d */
    static boolean m18059d(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    /* renamed from: e */
    static boolean m18060e(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    /* renamed from: f */
    private static C4181i0 m18061f(C4181i0 c4181i0) {
        return (c4181i0 == null || c4181i0.m17430b() == null) ? c4181i0 : c4181i0.m17428X().m17443b(null).m17444c();
    }

    @Override // p193ob.InterfaceC4165a0
    /* renamed from: a */
    public C4181i0 mo17270a(InterfaceC4165a0.a aVar) throws IOException {
        InterfaceC4371f interfaceC4371f = this.f17837a;
        C4181i0 mo17346b = interfaceC4371f != null ? interfaceC4371f.mo17346b(aVar.mo17275e()) : null;
        C4368c m18068c = new C4368c.a(System.currentTimeMillis(), aVar.mo17275e(), mo17346b).m18068c();
        C4177g0 c4177g0 = m18068c.f17843a;
        C4181i0 c4181i0 = m18068c.f17844b;
        InterfaceC4371f interfaceC4371f2 = this.f17837a;
        if (interfaceC4371f2 != null) {
            interfaceC4371f2.mo17348d(m18068c);
        }
        if (mo17346b != null && c4181i0 == null) {
            C4286e.m17743g(mo17346b.m17430b());
        }
        if (c4177g0 == null && c4181i0 == null) {
            return new C4181i0.a().m17456q(aVar.mo17275e()).m17454o(EnumC4173e0.HTTP_1_1).m17446g(504).m17451l("Unsatisfiable Request (only-if-cached)").m17443b(C4286e.f17494d).m17457r(-1L).m17455p(System.currentTimeMillis()).m17444c();
        }
        if (c4177g0 == null) {
            return c4181i0.m17428X().m17445d(m18061f(c4181i0)).m17444c();
        }
        try {
            C4181i0 mo17272b = aVar.mo17272b(c4177g0);
            if (mo17272b == null && mo17346b != null) {
            }
            if (c4181i0 != null) {
                if (mo17272b.m17432e() == 304) {
                    C4181i0 m17444c = c4181i0.m17428X().m17449j(m18058c(c4181i0.m17424O(), mo17272b.m17424O())).m17457r(mo17272b.m17438l0()).m17455p(mo17272b.m17435j0()).m17445d(m18061f(c4181i0)).m17452m(m18061f(mo17272b)).m17444c();
                    mo17272b.m17430b().close();
                    this.f17837a.mo17345a();
                    this.f17837a.mo17347c(c4181i0, m17444c);
                    return m17444c;
                }
                C4286e.m17743g(c4181i0.m17430b());
            }
            C4181i0 m17444c2 = mo17272b.m17428X().m17445d(m18061f(c4181i0)).m17452m(m18061f(mo17272b)).m17444c();
            if (this.f17837a != null) {
                if (C4556e.m18615c(m17444c2) && C4368c.m18062a(m17444c2, c4177g0)) {
                    return m18057b(this.f17837a.mo17350f(m17444c2), m17444c2);
                }
                if (C4557f.m18628a(c4177g0.m17397g())) {
                    try {
                        this.f17837a.mo17349e(c4177g0);
                    } catch (IOException unused) {
                    }
                }
            }
            return m17444c2;
        } finally {
            if (mo17346b != null) {
                C4286e.m17743g(mo17346b.m17430b());
            }
        }
    }
}
