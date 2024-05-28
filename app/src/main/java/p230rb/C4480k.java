package p230rb;

import ac.C0071a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p193ob.AbstractC4197v;
import p193ob.C4164a;
import p193ob.C4171d0;
import p193ob.C4177g0;
import p193ob.C4180i;
import p193ob.C4201z;
import p193ob.InterfaceC4165a0;
import p193ob.InterfaceC4176g;
import p205pb.AbstractC4282a;
import p205pb.C4286e;
import p291wb.C5492f;

/* renamed from: rb.k */
/* loaded from: classes.dex */
public final class C4480k {

    /* renamed from: a */
    private final C4171d0 f18150a;

    /* renamed from: b */
    private final C4476g f18151b;

    /* renamed from: c */
    private final InterfaceC4176g f18152c;

    /* renamed from: d */
    private final AbstractC4197v f18153d;

    /* renamed from: e */
    private final C0071a f18154e;

    /* renamed from: f */
    private Object f18155f;

    /* renamed from: g */
    private C4177g0 f18156g;

    /* renamed from: h */
    private C4473d f18157h;

    /* renamed from: i */
    public C4474e f18158i;

    /* renamed from: j */
    private C4472c f18159j;

    /* renamed from: k */
    private boolean f18160k;

    /* renamed from: l */
    private boolean f18161l;

    /* renamed from: m */
    private boolean f18162m;

    /* renamed from: n */
    private boolean f18163n;

    /* renamed from: o */
    private boolean f18164o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rb.k$a */
    /* loaded from: classes.dex */
    public class a extends C0071a {
        a() {
        }

        @Override // ac.C0071a
        /* renamed from: t */
        protected void mo312t() {
            C4480k.this.m18418d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rb.k$b */
    /* loaded from: classes.dex */
    public static final class b extends WeakReference<C4480k> {

        /* renamed from: a */
        final Object f18166a;

        b(C4480k c4480k, Object obj) {
            super(c4480k);
            this.f18166a = obj;
        }
    }

    public C4480k(C4171d0 c4171d0, InterfaceC4176g interfaceC4176g) {
        a aVar = new a();
        this.f18154e = aVar;
        this.f18150a = c4171d0;
        this.f18151b = AbstractC4282a.f17486a.mo17326h(c4171d0.m17305j());
        this.f18152c = interfaceC4176g;
        this.f18153d = c4171d0.m17310p().mo17514a(interfaceC4176g);
        aVar.mo413g(c4171d0.m17302f(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: e */
    private C4164a m18412e(C4201z c4201z) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        C4180i c4180i;
        if (c4201z.m17594n()) {
            SSLSocketFactory m17298H = this.f18150a.m17298H();
            hostnameVerifier = this.f18150a.m17313s();
            sSLSocketFactory = m17298H;
            c4180i = this.f18150a.m17303g();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            c4180i = null;
        }
        return new C4164a(c4201z.m17593m(), c4201z.m17598y(), this.f18150a.m17309o(), this.f18150a.m17297G(), sSLSocketFactory, hostnameVerifier, c4180i, this.f18150a.m17293C(), this.f18150a.m17292B(), this.f18150a.m17291A(), this.f18150a.m17306k(), this.f18150a.m17294D());
    }

    /* renamed from: j */
    private IOException m18413j(IOException iOException, boolean z10) {
        C4474e c4474e;
        Socket m18426n;
        boolean z11;
        synchronized (this.f18151b) {
            if (z10) {
                if (this.f18159j != null) {
                    throw new IllegalStateException("cannot release connection while it is in use");
                }
            }
            c4474e = this.f18158i;
            m18426n = (c4474e != null && this.f18159j == null && (z10 || this.f18164o)) ? m18426n() : null;
            if (this.f18158i != null) {
                c4474e = null;
            }
            z11 = this.f18164o && this.f18159j == null;
        }
        C4286e.m17744h(m18426n);
        if (c4474e != null) {
            this.f18153d.mo17525i(this.f18152c, c4474e);
        }
        if (z11) {
            boolean z12 = iOException != null;
            iOException = m18414q(iOException);
            if (z12) {
                this.f18153d.m17519c(this.f18152c, iOException);
            } else {
                this.f18153d.mo17518b(this.f18152c);
            }
        }
        return iOException;
    }

    /* renamed from: q */
    private IOException m18414q(IOException iOException) {
        if (this.f18163n || !this.f18154e.m308n()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: a */
    public void m18415a(C4474e c4474e) {
        if (this.f18158i == null) {
            this.f18158i = c4474e;
            c4474e.f18127p.add(new b(this, this.f18155f));
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public void m18416b() {
        this.f18155f = C5492f.m20215l().mo20195p("response.body().close()");
        this.f18153d.mo17520d(this.f18152c);
    }

    /* renamed from: c */
    public boolean m18417c() {
        return this.f18157h.m18364f() && this.f18157h.m18363e();
    }

    /* renamed from: d */
    public void m18418d() {
        C4472c c4472c;
        C4474e c4474e;
        synchronized (this.f18151b) {
            this.f18162m = true;
            c4472c = this.f18159j;
            C4473d c4473d = this.f18157h;
            if (c4473d != null && c4473d.m18361a() != null) {
                c4474e = this.f18157h.m18361a();
            } else {
                c4474e = this.f18158i;
            }
        }
        if (c4472c != null) {
            c4472c.m18341b();
        } else if (c4474e != null) {
            c4474e.m18376d();
        }
    }

    /* renamed from: f */
    public void m18419f() {
        synchronized (this.f18151b) {
            if (!this.f18164o) {
                this.f18159j = null;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: g */
    public IOException m18420g(C4472c c4472c, boolean z10, boolean z11, IOException iOException) {
        boolean z12;
        synchronized (this.f18151b) {
            C4472c c4472c2 = this.f18159j;
            if (c4472c != c4472c2) {
                return iOException;
            }
            boolean z13 = true;
            if (z10) {
                z12 = !this.f18160k;
                this.f18160k = true;
            } else {
                z12 = false;
            }
            if (z11) {
                if (!this.f18161l) {
                    z12 = true;
                }
                this.f18161l = true;
            }
            if (this.f18160k && this.f18161l && z12) {
                c4472c2.m18342c().f18124m++;
                this.f18159j = null;
            } else {
                z13 = false;
            }
            return z13 ? m18413j(iOException, false) : iOException;
        }
    }

    /* renamed from: h */
    public boolean m18421h() {
        boolean z10;
        synchronized (this.f18151b) {
            z10 = this.f18159j != null;
        }
        return z10;
    }

    /* renamed from: i */
    public boolean m18422i() {
        boolean z10;
        synchronized (this.f18151b) {
            z10 = this.f18162m;
        }
        return z10;
    }

    /* renamed from: k */
    public C4472c m18423k(InterfaceC4165a0.a aVar, boolean z10) {
        synchronized (this.f18151b) {
            if (!this.f18164o) {
                if (this.f18159j != null) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                }
            } else {
                throw new IllegalStateException("released");
            }
        }
        C4472c c4472c = new C4472c(this, this.f18152c, this.f18153d, this.f18157h, this.f18157h.m18362b(this.f18150a, aVar, z10));
        synchronized (this.f18151b) {
            this.f18159j = c4472c;
            this.f18160k = false;
            this.f18161l = false;
        }
        return c4472c;
    }

    /* renamed from: l */
    public IOException m18424l(IOException iOException) {
        synchronized (this.f18151b) {
            this.f18164o = true;
        }
        return m18413j(iOException, false);
    }

    /* renamed from: m */
    public void m18425m(C4177g0 c4177g0) {
        C4177g0 c4177g02 = this.f18156g;
        if (c4177g02 != null) {
            if (C4286e.m17728E(c4177g02.m17400j(), c4177g0.m17400j()) && this.f18157h.m18363e()) {
                return;
            }
            if (this.f18159j == null) {
                if (this.f18157h != null) {
                    m18413j(null, true);
                    this.f18157h = null;
                }
            } else {
                throw new IllegalStateException();
            }
        }
        this.f18156g = c4177g0;
        this.f18157h = new C4473d(this, this.f18151b, m18412e(c4177g0.m17400j()), this.f18152c, this.f18153d);
    }

    /* renamed from: n */
    public Socket m18426n() {
        int i10 = 0;
        int size = this.f18158i.f18127p.size();
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            if (this.f18158i.f18127p.get(i10).get() == this) {
                break;
            }
            i10++;
        }
        if (i10 != -1) {
            C4474e c4474e = this.f18158i;
            c4474e.f18127p.remove(i10);
            this.f18158i = null;
            if (!c4474e.f18127p.isEmpty()) {
                return null;
            }
            c4474e.f18128q = System.nanoTime();
            if (this.f18151b.m18393d(c4474e)) {
                return c4474e.m18385t();
            }
            return null;
        }
        throw new IllegalStateException();
    }

    /* renamed from: o */
    public void m18427o() {
        if (!this.f18163n) {
            this.f18163n = true;
            this.f18154e.m308n();
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: p */
    public void m18428p() {
        this.f18154e.m305k();
    }
}
