package p230rb;

import ac.AbstractC0077g;
import ac.AbstractC0078h;
import ac.C0073c;
import ac.C0082l;
import ac.InterfaceC0089s;
import ac.InterfaceC0090t;
import java.io.IOException;
import java.net.ProtocolException;
import p193ob.AbstractC4183j0;
import p193ob.AbstractC4197v;
import p193ob.C4177g0;
import p193ob.C4181i0;
import p193ob.InterfaceC4176g;
import p205pb.AbstractC4282a;
import sb.C4559h;
import sb.InterfaceC4554c;

/* renamed from: rb.c */
/* loaded from: classes.dex */
public final class C4472c {

    /* renamed from: a */
    final C4480k f18087a;

    /* renamed from: b */
    final InterfaceC4176g f18088b;

    /* renamed from: c */
    final AbstractC4197v f18089c;

    /* renamed from: d */
    final C4473d f18090d;

    /* renamed from: e */
    final InterfaceC4554c f18091e;

    /* renamed from: f */
    private boolean f18092f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rb.c$a */
    /* loaded from: classes.dex */
    public final class a extends AbstractC0077g {

        /* renamed from: o */
        private boolean f18093o;

        /* renamed from: p */
        private long f18094p;

        /* renamed from: q */
        private long f18095q;

        /* renamed from: r */
        private boolean f18096r;

        a(InterfaceC0089s interfaceC0089s, long j10) {
            super(interfaceC0089s);
            this.f18094p = j10;
        }

        /* renamed from: b */
        private IOException m18356b(IOException iOException) {
            if (this.f18093o) {
                return iOException;
            }
            this.f18093o = true;
            return C4472c.this.m18340a(this.f18095q, false, true, iOException);
        }

        @Override // ac.AbstractC0077g, ac.InterfaceC0089s
        /* renamed from: C */
        public void mo313C(C0073c c0073c, long j10) throws IOException {
            if (!this.f18096r) {
                long j11 = this.f18094p;
                if (j11 != -1 && this.f18095q + j10 > j11) {
                    throw new ProtocolException("expected " + this.f18094p + " bytes but received " + (this.f18095q + j10));
                }
                try {
                    super.mo313C(c0073c, j10);
                    this.f18095q += j10;
                    return;
                } catch (IOException e10) {
                    throw m18356b(e10);
                }
            }
            throw new IllegalStateException("closed");
        }

        @Override // ac.AbstractC0077g, ac.InterfaceC0089s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f18096r) {
                return;
            }
            this.f18096r = true;
            long j10 = this.f18094p;
            if (j10 != -1 && this.f18095q != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                m18356b(null);
            } catch (IOException e10) {
                throw m18356b(e10);
            }
        }

        @Override // ac.AbstractC0077g, ac.InterfaceC0089s, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                throw m18356b(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rb.c$b */
    /* loaded from: classes.dex */
    public final class b extends AbstractC0078h {

        /* renamed from: o */
        private final long f18098o;

        /* renamed from: p */
        private long f18099p;

        /* renamed from: q */
        private boolean f18100q;

        /* renamed from: r */
        private boolean f18101r;

        b(InterfaceC0090t interfaceC0090t, long j10) {
            super(interfaceC0090t);
            this.f18098o = j10;
            if (j10 == 0) {
                m18357c(null);
            }
        }

        @Override // ac.AbstractC0078h, ac.InterfaceC0090t
        /* renamed from: V */
        public long mo315V(C0073c c0073c, long j10) throws IOException {
            if (!this.f18101r) {
                try {
                    long mo315V = m406b().mo315V(c0073c, j10);
                    if (mo315V == -1) {
                        m18357c(null);
                        return -1L;
                    }
                    long j11 = this.f18099p + mo315V;
                    long j12 = this.f18098o;
                    if (j12 != -1 && j11 > j12) {
                        throw new ProtocolException("expected " + this.f18098o + " bytes but received " + j11);
                    }
                    this.f18099p = j11;
                    if (j11 == j12) {
                        m18357c(null);
                    }
                    return mo315V;
                } catch (IOException e10) {
                    throw m18357c(e10);
                }
            }
            throw new IllegalStateException("closed");
        }

        /* renamed from: c */
        IOException m18357c(IOException iOException) {
            if (this.f18100q) {
                return iOException;
            }
            this.f18100q = true;
            return C4472c.this.m18340a(this.f18099p, true, false, iOException);
        }

        @Override // ac.AbstractC0078h, ac.InterfaceC0090t, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f18101r) {
                return;
            }
            this.f18101r = true;
            try {
                super.close();
                m18357c(null);
            } catch (IOException e10) {
                throw m18357c(e10);
            }
        }
    }

    public C4472c(C4480k c4480k, InterfaceC4176g interfaceC4176g, AbstractC4197v abstractC4197v, C4473d c4473d, InterfaceC4554c interfaceC4554c) {
        this.f18087a = c4480k;
        this.f18088b = interfaceC4176g;
        this.f18089c = abstractC4197v;
        this.f18090d = c4473d;
        this.f18091e = interfaceC4554c;
    }

    /* renamed from: a */
    IOException m18340a(long j10, boolean z10, boolean z11, IOException iOException) {
        if (iOException != null) {
            m18354o(iOException);
        }
        if (z11) {
            if (iOException != null) {
                this.f18089c.m17530p(this.f18088b, iOException);
            } else {
                this.f18089c.mo17528n(this.f18088b, j10);
            }
        }
        if (z10) {
            if (iOException != null) {
                this.f18089c.m17535u(this.f18088b, iOException);
            } else {
                this.f18089c.mo17533s(this.f18088b, j10);
            }
        }
        return this.f18087a.m18420g(this, z11, z10, iOException);
    }

    /* renamed from: b */
    public void m18341b() {
        this.f18091e.cancel();
    }

    /* renamed from: c */
    public C4474e m18342c() {
        return this.f18091e.mo18602a();
    }

    /* renamed from: d */
    public InterfaceC0089s m18343d(C4177g0 c4177g0, boolean z10) throws IOException {
        this.f18092f = z10;
        long mo14714a = c4177g0.m17391a().mo14714a();
        this.f18089c.mo17529o(this.f18088b);
        return new a(this.f18091e.mo18607f(c4177g0, mo14714a), mo14714a);
    }

    /* renamed from: e */
    public void m18344e() {
        this.f18091e.cancel();
        this.f18087a.m18420g(this, true, true, null);
    }

    /* renamed from: f */
    public void m18345f() throws IOException {
        try {
            this.f18091e.mo18604c();
        } catch (IOException e10) {
            this.f18089c.m17530p(this.f18088b, e10);
            m18354o(e10);
            throw e10;
        }
    }

    /* renamed from: g */
    public void m18346g() throws IOException {
        try {
            this.f18091e.mo18605d();
        } catch (IOException e10) {
            this.f18089c.m17530p(this.f18088b, e10);
            m18354o(e10);
            throw e10;
        }
    }

    /* renamed from: h */
    public boolean m18347h() {
        return this.f18092f;
    }

    /* renamed from: i */
    public void m18348i() {
        this.f18091e.mo18602a().m18383q();
    }

    /* renamed from: j */
    public void m18349j() {
        this.f18087a.m18420g(this, true, false, null);
    }

    /* renamed from: k */
    public AbstractC4183j0 m18350k(C4181i0 c4181i0) throws IOException {
        try {
            this.f18089c.mo17534t(this.f18088b);
            String m17437l = c4181i0.m17437l("Content-Type");
            long mo18606e = this.f18091e.mo18606e(c4181i0);
            return new C4559h(m17437l, mo18606e, C0082l.m425d(new b(this.f18091e.mo18608g(c4181i0), mo18606e)));
        } catch (IOException e10) {
            this.f18089c.m17535u(this.f18088b, e10);
            m18354o(e10);
            throw e10;
        }
    }

    /* renamed from: l */
    public C4181i0.a m18351l(boolean z10) throws IOException {
        try {
            C4181i0.a mo18609h = this.f18091e.mo18609h(z10);
            if (mo18609h != null) {
                AbstractC4282a.f17486a.mo17325g(mo18609h, this);
            }
            return mo18609h;
        } catch (IOException e10) {
            this.f18089c.m17535u(this.f18088b, e10);
            m18354o(e10);
            throw e10;
        }
    }

    /* renamed from: m */
    public void m18352m(C4181i0 c4181i0) {
        this.f18089c.mo17536v(this.f18088b, c4181i0);
    }

    /* renamed from: n */
    public void m18353n() {
        this.f18089c.mo17537w(this.f18088b);
    }

    /* renamed from: o */
    void m18354o(IOException iOException) {
        this.f18090d.m18365h();
        this.f18091e.mo18602a().m18387w(iOException);
    }

    /* renamed from: p */
    public void m18355p(C4177g0 c4177g0) throws IOException {
        try {
            this.f18089c.mo17532r(this.f18088b);
            this.f18091e.mo18603b(c4177g0);
            this.f18089c.mo17531q(this.f18088b, c4177g0);
        } catch (IOException e10) {
            this.f18089c.m17530p(this.f18088b, e10);
            m18354o(e10);
            throw e10;
        }
    }
}
