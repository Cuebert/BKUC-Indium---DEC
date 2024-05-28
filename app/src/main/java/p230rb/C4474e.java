package p230rb;

import ac.C0082l;
import ac.C0091u;
import ac.InterfaceC0074d;
import ac.InterfaceC0075e;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import p193ob.AbstractC4197v;
import p193ob.C4164a;
import p193ob.C4171d0;
import p193ob.C4177g0;
import p193ob.C4180i;
import p193ob.C4181i0;
import p193ob.C4185k0;
import p193ob.C4189n;
import p193ob.C4199x;
import p193ob.C4201z;
import p193ob.EnumC4173e0;
import p193ob.InterfaceC4165a0;
import p193ob.InterfaceC4176g;
import p193ob.InterfaceC4186l;
import p205pb.AbstractC4282a;
import p205pb.C4286e;
import p205pb.C4287f;
import p254tb.C4756a;
import p266ub.C4909a;
import p266ub.C4914f;
import p266ub.C4915g;
import p266ub.C4917i;
import p266ub.C4922n;
import p266ub.EnumC4910b;
import p291wb.C5492f;
import p317yb.C5931d;
import sb.InterfaceC4554c;

/* renamed from: rb.e */
/* loaded from: classes.dex */
public final class C4474e extends C4914f.j implements InterfaceC4186l {

    /* renamed from: b */
    public final C4476g f18113b;

    /* renamed from: c */
    private final C4185k0 f18114c;

    /* renamed from: d */
    private Socket f18115d;

    /* renamed from: e */
    private Socket f18116e;

    /* renamed from: f */
    private C4199x f18117f;

    /* renamed from: g */
    private EnumC4173e0 f18118g;

    /* renamed from: h */
    private C4914f f18119h;

    /* renamed from: i */
    private InterfaceC0075e f18120i;

    /* renamed from: j */
    private InterfaceC0074d f18121j;

    /* renamed from: k */
    boolean f18122k;

    /* renamed from: l */
    int f18123l;

    /* renamed from: m */
    int f18124m;

    /* renamed from: n */
    private int f18125n;

    /* renamed from: o */
    private int f18126o = 1;

    /* renamed from: p */
    final List<Reference<C4480k>> f18127p = new ArrayList();

    /* renamed from: q */
    long f18128q = Long.MAX_VALUE;

    public C4474e(C4476g c4476g, C4185k0 c4185k0) {
        this.f18113b = c4476g;
        this.f18114c = c4185k0;
    }

    /* renamed from: f */
    private void m18366f(int i10, int i11, InterfaceC4176g interfaceC4176g, AbstractC4197v abstractC4197v) throws IOException {
        Socket createSocket;
        Proxy m17472b = this.f18114c.m17472b();
        C4164a m17471a = this.f18114c.m17471a();
        if (m17472b.type() != Proxy.Type.DIRECT && m17472b.type() != Proxy.Type.HTTP) {
            createSocket = new Socket(m17472b);
        } else {
            createSocket = m17471a.m17267j().createSocket();
        }
        this.f18115d = createSocket;
        abstractC4197v.mo17523g(interfaceC4176g, this.f18114c.m17474d(), m17472b);
        this.f18115d.setSoTimeout(i11);
        try {
            C5492f.m20215l().mo20193h(this.f18115d, this.f18114c.m17474d(), i10);
            try {
                this.f18120i = C0082l.m425d(C0082l.m434m(this.f18115d));
                this.f18121j = C0082l.m424c(C0082l.m430i(this.f18115d));
            } catch (NullPointerException e10) {
                if ("throw with null exception".equals(e10.getMessage())) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f18114c.m17474d());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    /* renamed from: g */
    private void m18367g(C4471b c4471b) throws IOException {
        EnumC4173e0 enumC4173e0;
        C4164a m17471a = this.f18114c.m17471a();
        SSLSocket sSLSocket = null;
        try {
            try {
                SSLSocket sSLSocket2 = (SSLSocket) m17471a.m17268k().createSocket(this.f18115d, m17471a.m17269l().m17593m(), m17471a.m17269l().m17598y(), true);
                try {
                    C4189n m18338a = c4471b.m18338a(sSLSocket2);
                    if (m18338a.m17484f()) {
                        C5492f.m20215l().mo20185g(sSLSocket2, m17471a.m17269l().m17593m(), m17471a.m17263f());
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    C4199x m17544b = C4199x.m17544b(session);
                    if (!m17471a.m17262e().verify(m17471a.m17269l().m17593m(), session)) {
                        List<Certificate> m17549f = m17544b.m17549f();
                        if (!m17549f.isEmpty()) {
                            X509Certificate x509Certificate = (X509Certificate) m17549f.get(0);
                            throw new SSLPeerUnverifiedException("Hostname " + m17471a.m17269l().m17593m() + " not verified:\n    certificate: " + C4180i.m17416c(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + C5931d.m21094a(x509Certificate));
                        }
                        throw new SSLPeerUnverifiedException("Hostname " + m17471a.m17269l().m17593m() + " not verified (no certificates)");
                    }
                    m17471a.m17258a().m17419a(m17471a.m17269l().m17593m(), m17544b.m17549f());
                    String mo20186o = m18338a.m17484f() ? C5492f.m20215l().mo20186o(sSLSocket2) : null;
                    this.f18116e = sSLSocket2;
                    this.f18120i = C0082l.m425d(C0082l.m434m(sSLSocket2));
                    this.f18121j = C0082l.m424c(C0082l.m430i(this.f18116e));
                    this.f18117f = m17544b;
                    if (mo20186o != null) {
                        enumC4173e0 = EnumC4173e0.m17359b(mo20186o);
                    } else {
                        enumC4173e0 = EnumC4173e0.HTTP_1_1;
                    }
                    this.f18118g = enumC4173e0;
                    C5492f.m20215l().mo20208a(sSLSocket2);
                } catch (AssertionError e10) {
                    e = e10;
                    if (!C4286e.m17724A(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        C5492f.m20215l().mo20208a(sSLSocket);
                    }
                    C4286e.m17744h(sSLSocket);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (AssertionError e11) {
            e = e11;
        }
    }

    /* renamed from: h */
    private void m18368h(int i10, int i11, int i12, InterfaceC4176g interfaceC4176g, AbstractC4197v abstractC4197v) throws IOException {
        C4177g0 m18370j = m18370j();
        C4201z m17400j = m18370j.m17400j();
        for (int i13 = 0; i13 < 21; i13++) {
            m18366f(i10, i11, interfaceC4176g, abstractC4197v);
            m18370j = m18369i(i11, i12, m18370j, m17400j);
            if (m18370j == null) {
                return;
            }
            C4286e.m17744h(this.f18115d);
            this.f18115d = null;
            this.f18121j = null;
            this.f18120i = null;
            abstractC4197v.mo17521e(interfaceC4176g, this.f18114c.m17474d(), this.f18114c.m17472b(), null);
        }
    }

    /* renamed from: i */
    private C4177g0 m18369i(int i10, int i11, C4177g0 c4177g0, C4201z c4201z) throws IOException {
        String str = "CONNECT " + C4286e.m17755s(c4201z, true) + " HTTP/1.1";
        while (true) {
            C4756a c4756a = new C4756a(null, null, this.f18120i, this.f18121j);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f18120i.mo316f().mo413g(i10, timeUnit);
            this.f18121j.mo314f().mo413g(i11, timeUnit);
            c4756a.m18930B(c4177g0.m17395e(), str);
            c4756a.mo18604c();
            C4181i0 m17444c = c4756a.mo18609h(false).m17456q(c4177g0).m17444c();
            c4756a.m18929A(m17444c);
            int m17432e = m17444c.m17432e();
            if (m17432e == 200) {
                if (this.f18120i.mo352d().mo328F() && this.f18121j.mo348a().mo328F()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (m17432e == 407) {
                C4177g0 mo17277a = this.f18114c.m17471a().m17265h().mo17277a(this.f18114c, m17444c);
                if (mo17277a != null) {
                    if ("close".equalsIgnoreCase(m17444c.m17437l("Connection"))) {
                        return mo17277a;
                    }
                    c4177g0 = mo17277a;
                } else {
                    throw new IOException("Failed to authenticate with proxy");
                }
            } else {
                throw new IOException("Unexpected response code for CONNECT: " + m17444c.m17432e());
            }
        }
    }

    /* renamed from: j */
    private C4177g0 m18370j() throws IOException {
        C4177g0 m17401a = new C4177g0.a().m17409i(this.f18114c.m17471a().m17269l()).m17404d("CONNECT", null).m17402b("Host", C4286e.m17755s(this.f18114c.m17471a().m17269l(), true)).m17402b("Proxy-Connection", "Keep-Alive").m17402b("User-Agent", C4287f.m17763a()).m17401a();
        C4177g0 mo17277a = this.f18114c.m17471a().m17265h().mo17277a(this.f18114c, new C4181i0.a().m17456q(m17401a).m17454o(EnumC4173e0.HTTP_1_1).m17446g(407).m17451l("Preemptive Authenticate").m17443b(C4286e.f17494d).m17457r(-1L).m17455p(-1L).m17448i("Proxy-Authenticate", "OkHttp-Preemptive").m17444c());
        return mo17277a != null ? mo17277a : m17401a;
    }

    /* renamed from: k */
    private void m18371k(C4471b c4471b, int i10, InterfaceC4176g interfaceC4176g, AbstractC4197v abstractC4197v) throws IOException {
        if (this.f18114c.m17471a().m17268k() == null) {
            List<EnumC4173e0> m17263f = this.f18114c.m17471a().m17263f();
            EnumC4173e0 enumC4173e0 = EnumC4173e0.H2_PRIOR_KNOWLEDGE;
            if (m17263f.contains(enumC4173e0)) {
                this.f18116e = this.f18115d;
                this.f18118g = enumC4173e0;
                m18373u(i10);
                return;
            } else {
                this.f18116e = this.f18115d;
                this.f18118g = EnumC4173e0.HTTP_1_1;
                return;
            }
        }
        abstractC4197v.mo17539y(interfaceC4176g);
        m18367g(c4471b);
        abstractC4197v.mo17538x(interfaceC4176g, this.f18117f);
        if (this.f18118g == EnumC4173e0.HTTP_2) {
            m18373u(i10);
        }
    }

    /* renamed from: s */
    private boolean m18372s(List<C4185k0> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C4185k0 c4185k0 = list.get(i10);
            if (c4185k0.m17472b().type() == Proxy.Type.DIRECT && this.f18114c.m17472b().type() == Proxy.Type.DIRECT && this.f18114c.m17474d().equals(c4185k0.m17474d())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: u */
    private void m18373u(int i10) throws IOException {
        this.f18116e.setSoTimeout(0);
        C4914f m19235a = new C4914f.h(true).m19238d(this.f18116e, this.f18114c.m17471a().m17269l().m17593m(), this.f18120i, this.f18121j).m19236b(this).m19237c(i10).m19235a();
        this.f18119h = m19235a;
        m19235a.m19232x0();
    }

    @Override // p193ob.InterfaceC4186l
    /* renamed from: a */
    public EnumC4173e0 mo17475a() {
        return this.f18118g;
    }

    @Override // p266ub.C4914f.j
    /* renamed from: b */
    public void mo18374b(C4914f c4914f) {
        synchronized (this.f18113b) {
            this.f18126o = c4914f.m19222l0();
        }
    }

    @Override // p266ub.C4914f.j
    /* renamed from: c */
    public void mo18375c(C4917i c4917i) throws IOException {
        c4917i.m19272d(EnumC4910b.REFUSED_STREAM, null);
    }

    /* renamed from: d */
    public void m18376d() {
        C4286e.m17744h(this.f18115d);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m18377e(int r17, int r18, int r19, int r20, boolean r21, p193ob.InterfaceC4176g r22, p193ob.AbstractC4197v r23) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p230rb.C4474e.m18377e(int, int, int, int, boolean, ob.g, ob.v):void");
    }

    /* renamed from: l */
    public C4199x m18378l() {
        return this.f18117f;
    }

    /* renamed from: m */
    public boolean m18379m(C4164a c4164a, List<C4185k0> list) {
        if (this.f18127p.size() >= this.f18126o || this.f18122k || !AbstractC4282a.f17486a.mo17323e(this.f18114c.m17471a(), c4164a)) {
            return false;
        }
        if (c4164a.m17269l().m17593m().equals(m18384r().m17471a().m17269l().m17593m())) {
            return true;
        }
        if (this.f18119h == null || list == null || !m18372s(list) || c4164a.m17262e() != C5931d.f21819a || !m18386v(c4164a.m17269l())) {
            return false;
        }
        try {
            c4164a.m17258a().m17419a(c4164a.m17269l().m17593m(), m18378l().m17549f());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* renamed from: n */
    public boolean m18380n(boolean z10) {
        if (this.f18116e.isClosed() || this.f18116e.isInputShutdown() || this.f18116e.isOutputShutdown()) {
            return false;
        }
        C4914f c4914f = this.f18119h;
        if (c4914f != null) {
            return c4914f.m19221k0(System.nanoTime());
        }
        if (z10) {
            try {
                int soTimeout = this.f18116e.getSoTimeout();
                try {
                    this.f18116e.setSoTimeout(1);
                    return !this.f18120i.mo328F();
                } finally {
                    this.f18116e.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o */
    public boolean m18381o() {
        return this.f18119h != null;
    }

    /* renamed from: p */
    public InterfaceC4554c m18382p(C4171d0 c4171d0, InterfaceC4165a0.a aVar) throws SocketException {
        if (this.f18119h != null) {
            return new C4915g(c4171d0, this, aVar, this.f18119h);
        }
        this.f18116e.setSoTimeout(aVar.mo17274d());
        C0091u mo316f = this.f18120i.mo316f();
        long mo17274d = aVar.mo17274d();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        mo316f.mo413g(mo17274d, timeUnit);
        this.f18121j.mo314f().mo413g(aVar.mo17276f(), timeUnit);
        return new C4756a(c4171d0, this, this.f18120i, this.f18121j);
    }

    /* renamed from: q */
    public void m18383q() {
        synchronized (this.f18113b) {
            this.f18122k = true;
        }
    }

    /* renamed from: r */
    public C4185k0 m18384r() {
        return this.f18114c;
    }

    /* renamed from: t */
    public Socket m18385t() {
        return this.f18116e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.f18114c.m17471a().m17269l().m17593m());
        sb2.append(":");
        sb2.append(this.f18114c.m17471a().m17269l().m17598y());
        sb2.append(", proxy=");
        sb2.append(this.f18114c.m17472b());
        sb2.append(" hostAddress=");
        sb2.append(this.f18114c.m17474d());
        sb2.append(" cipherSuite=");
        C4199x c4199x = this.f18117f;
        sb2.append(c4199x != null ? c4199x.m17547a() : "none");
        sb2.append(" protocol=");
        sb2.append(this.f18118g);
        sb2.append('}');
        return sb2.toString();
    }

    /* renamed from: v */
    public boolean m18386v(C4201z c4201z) {
        if (c4201z.m17598y() != this.f18114c.m17471a().m17269l().m17598y()) {
            return false;
        }
        if (c4201z.m17593m().equals(this.f18114c.m17471a().m17269l().m17593m())) {
            return true;
        }
        return this.f18117f != null && C5931d.f21819a.m21098c(c4201z.m17593m(), (X509Certificate) this.f18117f.m17549f().get(0));
    }

    /* renamed from: w */
    public void m18387w(IOException iOException) {
        synchronized (this.f18113b) {
            if (iOException instanceof C4922n) {
                EnumC4910b enumC4910b = ((C4922n) iOException).f18958n;
                if (enumC4910b == EnumC4910b.REFUSED_STREAM) {
                    int i10 = this.f18125n + 1;
                    this.f18125n = i10;
                    if (i10 > 1) {
                        this.f18122k = true;
                        this.f18123l++;
                    }
                } else if (enumC4910b != EnumC4910b.CANCEL) {
                    this.f18122k = true;
                    this.f18123l++;
                }
            } else if (!m18381o() || (iOException instanceof C4909a)) {
                this.f18122k = true;
                if (this.f18124m == 0) {
                    if (iOException != null) {
                        this.f18113b.m18392c(this.f18114c, iOException);
                    }
                    this.f18123l++;
                }
            }
        }
    }
}
