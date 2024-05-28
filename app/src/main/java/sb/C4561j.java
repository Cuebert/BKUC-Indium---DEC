package sb;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import p193ob.AbstractC4179h0;
import p193ob.C4171d0;
import p193ob.C4177g0;
import p193ob.C4181i0;
import p193ob.C4185k0;
import p193ob.C4201z;
import p193ob.InterfaceC4165a0;
import p205pb.AbstractC4282a;
import p205pb.C4286e;
import p230rb.C4472c;
import p230rb.C4478i;
import p230rb.C4480k;
import p266ub.C4909a;

/* renamed from: sb.j */
/* loaded from: classes.dex */
public final class C4561j implements InterfaceC4165a0 {

    /* renamed from: a */
    private final C4171d0 f18328a;

    public C4561j(C4171d0 c4171d0) {
        this.f18328a = c4171d0;
    }

    /* renamed from: b */
    private C4177g0 m18639b(C4181i0 c4181i0, C4185k0 c4185k0) throws IOException {
        String m17437l;
        C4201z m17584C;
        Proxy m17292B;
        if (c4181i0 != null) {
            int m17432e = c4181i0.m17432e();
            String m17397g = c4181i0.m17436k0().m17397g();
            if (m17432e == 307 || m17432e == 308) {
                if (!m17397g.equals("GET") && !m17397g.equals("HEAD")) {
                    return null;
                }
            } else {
                if (m17432e == 401) {
                    return this.f18328a.m17301d().mo17277a(c4185k0, c4181i0);
                }
                if (m17432e == 503) {
                    if ((c4181i0.m17429Y() == null || c4181i0.m17429Y().m17432e() != 503) && m18643f(c4181i0, Integer.MAX_VALUE) == 0) {
                        return c4181i0.m17436k0();
                    }
                    return null;
                }
                if (m17432e == 407) {
                    if (c4185k0 != null) {
                        m17292B = c4185k0.m17472b();
                    } else {
                        m17292B = this.f18328a.m17292B();
                    }
                    if (m17292B.type() == Proxy.Type.HTTP) {
                        return this.f18328a.m17293C().mo17277a(c4185k0, c4181i0);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                if (m17432e == 408) {
                    if (!this.f18328a.m17296F()) {
                        return null;
                    }
                    AbstractC4179h0 m17391a = c4181i0.m17436k0().m17391a();
                    if (m17391a != null && m17391a.m17415h()) {
                        return null;
                    }
                    if ((c4181i0.m17429Y() == null || c4181i0.m17429Y().m17432e() != 408) && m18643f(c4181i0, 0) <= 0) {
                        return c4181i0.m17436k0();
                    }
                    return null;
                }
                switch (m17432e) {
                    case 300:
                    case 301:
                    case 302:
                    case 303:
                        break;
                    default:
                        return null;
                }
            }
            if (!this.f18328a.m17311q() || (m17437l = c4181i0.m17437l("Location")) == null || (m17584C = c4181i0.m17436k0().m17400j().m17584C(m17437l)) == null) {
                return null;
            }
            if (!m17584C.m17585D().equals(c4181i0.m17436k0().m17400j().m17585D()) && !this.f18328a.m17312r()) {
                return null;
            }
            C4177g0.a m17398h = c4181i0.m17436k0().m17398h();
            if (C4557f.m18629b(m17397g)) {
                boolean m18631d = C4557f.m18631d(m17397g);
                if (C4557f.m18630c(m17397g)) {
                    m17398h.m17404d("GET", null);
                } else {
                    m17398h.m17404d(m17397g, m18631d ? c4181i0.m17436k0().m17391a() : null);
                }
                if (!m18631d) {
                    m17398h.m17406f("Transfer-Encoding");
                    m17398h.m17406f("Content-Length");
                    m17398h.m17406f("Content-Type");
                }
            }
            if (!C4286e.m17728E(c4181i0.m17436k0().m17400j(), m17584C)) {
                m17398h.m17406f("Authorization");
            }
            return m17398h.m17409i(m17584C).m17401a();
        }
        throw new IllegalStateException();
    }

    /* renamed from: c */
    private boolean m18640c(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z10 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    /* renamed from: d */
    private boolean m18641d(IOException iOException, C4480k c4480k, boolean z10, C4177g0 c4177g0) {
        if (this.f18328a.m17296F()) {
            return !(z10 && m18642e(iOException, c4177g0)) && m18640c(iOException, z10) && c4480k.m18417c();
        }
        return false;
    }

    /* renamed from: e */
    private boolean m18642e(IOException iOException, C4177g0 c4177g0) {
        AbstractC4179h0 m17391a = c4177g0.m17391a();
        return (m17391a != null && m17391a.m17415h()) || (iOException instanceof FileNotFoundException);
    }

    /* renamed from: f */
    private int m18643f(C4181i0 c4181i0, int i10) {
        String m17437l = c4181i0.m17437l("Retry-After");
        if (m17437l == null) {
            return i10;
        }
        if (m17437l.matches("\\d+")) {
            return Integer.valueOf(m17437l).intValue();
        }
        return Integer.MAX_VALUE;
    }

    @Override // p193ob.InterfaceC4165a0
    /* renamed from: a */
    public C4181i0 mo17270a(InterfaceC4165a0.a aVar) throws IOException {
        C4472c mo17324f;
        C4177g0 m18639b;
        C4177g0 mo17275e = aVar.mo17275e();
        C4558g c4558g = (C4558g) aVar;
        C4480k m18635i = c4558g.m18635i();
        C4181i0 c4181i0 = null;
        int i10 = 0;
        while (true) {
            m18635i.m18425m(mo17275e);
            if (!m18635i.m18422i()) {
                try {
                    try {
                        C4181i0 m18634h = c4558g.m18634h(mo17275e, m18635i, null);
                        if (c4181i0 != null) {
                            m18634h = m18634h.m17428X().m17453n(c4181i0.m17428X().m17443b(null).m17444c()).m17444c();
                        }
                        c4181i0 = m18634h;
                        mo17324f = AbstractC4282a.f17486a.mo17324f(c4181i0);
                        m18639b = m18639b(c4181i0, mo17324f != null ? mo17324f.m18342c().m18384r() : null);
                    } catch (IOException e10) {
                        if (!m18641d(e10, m18635i, !(e10 instanceof C4909a), mo17275e)) {
                            throw e10;
                        }
                    } catch (C4478i e11) {
                        if (!m18641d(e11.m18401c(), m18635i, false, mo17275e)) {
                            throw e11.m18400b();
                        }
                    }
                    if (m18639b == null) {
                        if (mo17324f != null && mo17324f.m18347h()) {
                            m18635i.m18427o();
                        }
                        return c4181i0;
                    }
                    AbstractC4179h0 m17391a = m18639b.m17391a();
                    if (m17391a != null && m17391a.m17415h()) {
                        return c4181i0;
                    }
                    C4286e.m17743g(c4181i0.m17430b());
                    if (m18635i.m18421h()) {
                        mo17324f.m18344e();
                    }
                    i10++;
                    if (i10 > 20) {
                        throw new ProtocolException("Too many follow-up requests: " + i10);
                    }
                    mo17275e = m18639b;
                } finally {
                    m18635i.m18419f();
                }
            } else {
                throw new IOException("Canceled");
            }
        }
    }
}
