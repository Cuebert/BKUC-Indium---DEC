package sb;

import ac.C0082l;
import ac.InterfaceC0074d;
import java.io.IOException;
import java.net.ProtocolException;
import p193ob.C4177g0;
import p193ob.C4181i0;
import p193ob.InterfaceC4165a0;
import p205pb.C4286e;
import p230rb.C4472c;

/* renamed from: sb.b */
/* loaded from: classes.dex */
public final class C4553b implements InterfaceC4165a0 {

    /* renamed from: a */
    private final boolean f18309a;

    public C4553b(boolean z10) {
        this.f18309a = z10;
    }

    @Override // p193ob.InterfaceC4165a0
    /* renamed from: a */
    public C4181i0 mo17270a(InterfaceC4165a0.a aVar) throws IOException {
        boolean z10;
        C4181i0 m17444c;
        C4558g c4558g = (C4558g) aVar;
        C4472c m18633g = c4558g.m18633g();
        C4177g0 mo17275e = c4558g.mo17275e();
        long currentTimeMillis = System.currentTimeMillis();
        m18633g.m18355p(mo17275e);
        C4181i0.a aVar2 = null;
        if (C4557f.m18629b(mo17275e.m17397g()) && mo17275e.m17391a() != null) {
            if ("100-continue".equalsIgnoreCase(mo17275e.m17393c("Expect"))) {
                m18633g.m18346g();
                m18633g.m18353n();
                aVar2 = m18633g.m18351l(true);
                z10 = true;
            } else {
                z10 = false;
            }
            if (aVar2 == null) {
                if (mo17275e.m17391a().m17414g()) {
                    m18633g.m18346g();
                    mo17275e.m17391a().mo14716i(C0082l.m424c(m18633g.m18343d(mo17275e, true)));
                } else {
                    InterfaceC0074d m424c = C0082l.m424c(m18633g.m18343d(mo17275e, false));
                    mo17275e.m17391a().mo14716i(m424c);
                    m424c.close();
                }
            } else {
                m18633g.m18349j();
                if (!m18633g.m18342c().m18381o()) {
                    m18633g.m18348i();
                }
            }
        } else {
            m18633g.m18349j();
            z10 = false;
        }
        if (mo17275e.m17391a() == null || !mo17275e.m17391a().m17414g()) {
            m18633g.m18345f();
        }
        if (!z10) {
            m18633g.m18353n();
        }
        if (aVar2 == null) {
            aVar2 = m18633g.m18351l(false);
        }
        C4181i0 m17444c2 = aVar2.m17456q(mo17275e).m17447h(m18633g.m18342c().m18378l()).m17457r(currentTimeMillis).m17455p(System.currentTimeMillis()).m17444c();
        int m17432e = m17444c2.m17432e();
        if (m17432e == 100) {
            m17444c2 = m18633g.m18351l(false).m17456q(mo17275e).m17447h(m18633g.m18342c().m18378l()).m17457r(currentTimeMillis).m17455p(System.currentTimeMillis()).m17444c();
            m17432e = m17444c2.m17432e();
        }
        m18633g.m18352m(m17444c2);
        if (this.f18309a && m17432e == 101) {
            m17444c = m17444c2.m17428X().m17443b(C4286e.f17494d).m17444c();
        } else {
            m17444c = m17444c2.m17428X().m17443b(m18633g.m18350k(m17444c2)).m17444c();
        }
        if ("close".equalsIgnoreCase(m17444c.m17436k0().m17393c("Connection")) || "close".equalsIgnoreCase(m17444c.m17437l("Connection"))) {
            m18633g.m18348i();
        }
        if ((m17432e != 204 && m17432e != 205) || m17444c.m17430b().mo14680i() <= 0) {
            return m17444c;
        }
        throw new ProtocolException("HTTP " + m17432e + " had non-zero Content-Length: " + m17444c.m17430b().mo14680i());
    }
}
