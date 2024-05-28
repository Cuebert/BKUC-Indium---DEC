package p254tb;

import ac.C0073c;
import ac.C0079i;
import ac.C0091u;
import ac.InterfaceC0074d;
import ac.InterfaceC0075e;
import ac.InterfaceC0089s;
import ac.InterfaceC0090t;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p193ob.C4171d0;
import p193ob.C4177g0;
import p193ob.C4181i0;
import p193ob.C4200y;
import p193ob.C4201z;
import p205pb.AbstractC4282a;
import p205pb.C4286e;
import p230rb.C4474e;
import sb.C4556e;
import sb.C4560i;
import sb.C4562k;
import sb.InterfaceC4554c;

/* renamed from: tb.a */
/* loaded from: classes.dex */
public final class C4756a implements InterfaceC4554c {

    /* renamed from: a */
    private final C4171d0 f18583a;

    /* renamed from: b */
    private final C4474e f18584b;

    /* renamed from: c */
    private final InterfaceC0075e f18585c;

    /* renamed from: d */
    private final InterfaceC0074d f18586d;

    /* renamed from: e */
    private int f18587e = 0;

    /* renamed from: f */
    private long f18588f = 262144;

    /* renamed from: g */
    private C4200y f18589g;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tb.a$b */
    /* loaded from: classes.dex */
    public abstract class b implements InterfaceC0090t {

        /* renamed from: n */
        protected final C0079i f18590n;

        /* renamed from: o */
        protected boolean f18591o;

        private b() {
            this.f18590n = new C0079i(C4756a.this.f18585c.mo316f());
        }

        @Override // ac.InterfaceC0090t
        /* renamed from: V */
        public long mo315V(C0073c c0073c, long j10) throws IOException {
            try {
                return C4756a.this.f18585c.mo315V(c0073c, j10);
            } catch (IOException e10) {
                C4756a.this.f18584b.m18383q();
                m18931b();
                throw e10;
            }
        }

        /* renamed from: b */
        final void m18931b() {
            if (C4756a.this.f18587e == 6) {
                return;
            }
            if (C4756a.this.f18587e == 5) {
                C4756a.this.m18921s(this.f18590n);
                C4756a.this.f18587e = 6;
            } else {
                throw new IllegalStateException("state: " + C4756a.this.f18587e);
            }
        }

        @Override // ac.InterfaceC0090t
        /* renamed from: f */
        public C0091u mo316f() {
            return this.f18590n;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tb.a$c */
    /* loaded from: classes.dex */
    public final class c implements InterfaceC0089s {

        /* renamed from: n */
        private final C0079i f18593n;

        /* renamed from: o */
        private boolean f18594o;

        c() {
            this.f18593n = new C0079i(C4756a.this.f18586d.mo314f());
        }

        @Override // ac.InterfaceC0089s
        /* renamed from: C */
        public void mo313C(C0073c c0073c, long j10) throws IOException {
            if (this.f18594o) {
                throw new IllegalStateException("closed");
            }
            if (j10 == 0) {
                return;
            }
            C4756a.this.f18586d.mo363n(j10);
            C4756a.this.f18586d.mo350b0("\r\n");
            C4756a.this.f18586d.mo313C(c0073c, j10);
            C4756a.this.f18586d.mo350b0("\r\n");
        }

        @Override // ac.InterfaceC0089s, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            if (this.f18594o) {
                return;
            }
            this.f18594o = true;
            C4756a.this.f18586d.mo350b0("0\r\n\r\n");
            C4756a.this.m18921s(this.f18593n);
            C4756a.this.f18587e = 3;
        }

        @Override // ac.InterfaceC0089s
        /* renamed from: f */
        public C0091u mo314f() {
            return this.f18593n;
        }

        @Override // ac.InterfaceC0089s, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (this.f18594o) {
                return;
            }
            C4756a.this.f18586d.flush();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tb.a$d */
    /* loaded from: classes.dex */
    public class d extends b {

        /* renamed from: q */
        private final C4201z f18596q;

        /* renamed from: r */
        private long f18597r;

        /* renamed from: s */
        private boolean f18598s;

        d(C4201z c4201z) {
            super();
            this.f18597r = -1L;
            this.f18598s = true;
            this.f18596q = c4201z;
        }

        /* renamed from: c */
        private void m18932c() throws IOException {
            if (this.f18597r != -1) {
                C4756a.this.f18585c.mo321B();
            }
            try {
                this.f18597r = C4756a.this.f18585c.mo355f0();
                String trim = C4756a.this.f18585c.mo321B().trim();
                if (this.f18597r < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f18597r + trim + "\"");
                }
                if (this.f18597r == 0) {
                    this.f18598s = false;
                    C4756a c4756a = C4756a.this;
                    c4756a.f18589g = c4756a.m18928z();
                    C4556e.m18619g(C4756a.this.f18583a.m17307m(), this.f18596q, C4756a.this.f18589g);
                    m18931b();
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // p254tb.C4756a.b, ac.InterfaceC0090t
        /* renamed from: V */
        public long mo315V(C0073c c0073c, long j10) throws IOException {
            if (j10 >= 0) {
                if (!this.f18591o) {
                    if (!this.f18598s) {
                        return -1L;
                    }
                    long j11 = this.f18597r;
                    if (j11 == 0 || j11 == -1) {
                        m18932c();
                        if (!this.f18598s) {
                            return -1L;
                        }
                    }
                    long mo315V = super.mo315V(c0073c, Math.min(j10, this.f18597r));
                    if (mo315V != -1) {
                        this.f18597r -= mo315V;
                        return mo315V;
                    }
                    C4756a.this.f18584b.m18383q();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    m18931b();
                    throw protocolException;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        }

        @Override // ac.InterfaceC0090t, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f18591o) {
                return;
            }
            if (this.f18598s && !C4286e.m17752p(this, 100, TimeUnit.MILLISECONDS)) {
                C4756a.this.f18584b.m18383q();
                m18931b();
            }
            this.f18591o = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tb.a$e */
    /* loaded from: classes.dex */
    public class e extends b {

        /* renamed from: q */
        private long f18600q;

        e(long j10) {
            super();
            this.f18600q = j10;
            if (j10 == 0) {
                m18931b();
            }
        }

        @Override // p254tb.C4756a.b, ac.InterfaceC0090t
        /* renamed from: V */
        public long mo315V(C0073c c0073c, long j10) throws IOException {
            if (j10 >= 0) {
                if (!this.f18591o) {
                    long j11 = this.f18600q;
                    if (j11 == 0) {
                        return -1L;
                    }
                    long mo315V = super.mo315V(c0073c, Math.min(j11, j10));
                    if (mo315V != -1) {
                        long j12 = this.f18600q - mo315V;
                        this.f18600q = j12;
                        if (j12 == 0) {
                            m18931b();
                        }
                        return mo315V;
                    }
                    C4756a.this.f18584b.m18383q();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    m18931b();
                    throw protocolException;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        }

        @Override // ac.InterfaceC0090t, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f18591o) {
                return;
            }
            if (this.f18600q != 0 && !C4286e.m17752p(this, 100, TimeUnit.MILLISECONDS)) {
                C4756a.this.f18584b.m18383q();
                m18931b();
            }
            this.f18591o = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tb.a$f */
    /* loaded from: classes.dex */
    public final class f implements InterfaceC0089s {

        /* renamed from: n */
        private final C0079i f18602n;

        /* renamed from: o */
        private boolean f18603o;

        private f() {
            this.f18602n = new C0079i(C4756a.this.f18586d.mo314f());
        }

        @Override // ac.InterfaceC0089s
        /* renamed from: C */
        public void mo313C(C0073c c0073c, long j10) throws IOException {
            if (!this.f18603o) {
                C4286e.m17742f(c0073c.m381y0(), 0L, j10);
                C4756a.this.f18586d.mo313C(c0073c, j10);
                return;
            }
            throw new IllegalStateException("closed");
        }

        @Override // ac.InterfaceC0089s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f18603o) {
                return;
            }
            this.f18603o = true;
            C4756a.this.m18921s(this.f18602n);
            C4756a.this.f18587e = 3;
        }

        @Override // ac.InterfaceC0089s
        /* renamed from: f */
        public C0091u mo314f() {
            return this.f18602n;
        }

        @Override // ac.InterfaceC0089s, java.io.Flushable
        public void flush() throws IOException {
            if (this.f18603o) {
                return;
            }
            C4756a.this.f18586d.flush();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tb.a$g */
    /* loaded from: classes.dex */
    public class g extends b {

        /* renamed from: q */
        private boolean f18605q;

        private g() {
            super();
        }

        @Override // p254tb.C4756a.b, ac.InterfaceC0090t
        /* renamed from: V */
        public long mo315V(C0073c c0073c, long j10) throws IOException {
            if (j10 >= 0) {
                if (!this.f18591o) {
                    if (this.f18605q) {
                        return -1L;
                    }
                    long mo315V = super.mo315V(c0073c, j10);
                    if (mo315V != -1) {
                        return mo315V;
                    }
                    this.f18605q = true;
                    m18931b();
                    return -1L;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        }

        @Override // ac.InterfaceC0090t, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f18591o) {
                return;
            }
            if (!this.f18605q) {
                m18931b();
            }
            this.f18591o = true;
        }
    }

    public C4756a(C4171d0 c4171d0, C4474e c4474e, InterfaceC0075e interfaceC0075e, InterfaceC0074d interfaceC0074d) {
        this.f18583a = c4171d0;
        this.f18584b = c4474e;
        this.f18585c = interfaceC0075e;
        this.f18586d = interfaceC0074d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m18921s(C0079i c0079i) {
        C0091u m414i = c0079i.m414i();
        c0079i.m415j(C0091u.f316d);
        m414i.mo407a();
        m414i.mo408b();
    }

    /* renamed from: t */
    private InterfaceC0089s m18922t() {
        if (this.f18587e == 1) {
            this.f18587e = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f18587e);
    }

    /* renamed from: u */
    private InterfaceC0090t m18923u(C4201z c4201z) {
        if (this.f18587e == 4) {
            this.f18587e = 5;
            return new d(c4201z);
        }
        throw new IllegalStateException("state: " + this.f18587e);
    }

    /* renamed from: v */
    private InterfaceC0090t m18924v(long j10) {
        if (this.f18587e == 4) {
            this.f18587e = 5;
            return new e(j10);
        }
        throw new IllegalStateException("state: " + this.f18587e);
    }

    /* renamed from: w */
    private InterfaceC0089s m18925w() {
        if (this.f18587e == 1) {
            this.f18587e = 2;
            return new f();
        }
        throw new IllegalStateException("state: " + this.f18587e);
    }

    /* renamed from: x */
    private InterfaceC0090t m18926x() {
        if (this.f18587e == 4) {
            this.f18587e = 5;
            this.f18584b.m18383q();
            return new g();
        }
        throw new IllegalStateException("state: " + this.f18587e);
    }

    /* renamed from: y */
    private String m18927y() throws IOException {
        String mo346U = this.f18585c.mo346U(this.f18588f);
        this.f18588f -= mo346U.length();
        return mo346U;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public C4200y m18928z() throws IOException {
        C4200y.a aVar = new C4200y.a();
        while (true) {
            String m18927y = m18927y();
            if (m18927y.length() != 0) {
                AbstractC4282a.f17486a.mo17319a(aVar, m18927y);
            } else {
                return aVar.m17565e();
            }
        }
    }

    /* renamed from: A */
    public void m18929A(C4181i0 c4181i0) throws IOException {
        long m18614b = C4556e.m18614b(c4181i0);
        if (m18614b == -1) {
            return;
        }
        InterfaceC0090t m18924v = m18924v(m18614b);
        C4286e.m17729F(m18924v, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        m18924v.close();
    }

    /* renamed from: B */
    public void m18930B(C4200y c4200y, String str) throws IOException {
        if (this.f18587e == 0) {
            this.f18586d.mo350b0(str).mo350b0("\r\n");
            int m17558h = c4200y.m17558h();
            for (int i10 = 0; i10 < m17558h; i10++) {
                this.f18586d.mo350b0(c4200y.m17556e(i10)).mo350b0(": ").mo350b0(c4200y.m17559i(i10)).mo350b0("\r\n");
            }
            this.f18586d.mo350b0("\r\n");
            this.f18587e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f18587e);
    }

    @Override // sb.InterfaceC4554c
    /* renamed from: a */
    public C4474e mo18602a() {
        return this.f18584b;
    }

    @Override // sb.InterfaceC4554c
    /* renamed from: b */
    public void mo18603b(C4177g0 c4177g0) throws IOException {
        m18930B(c4177g0.m17395e(), C4560i.m18636a(c4177g0, this.f18584b.m18384r().m17472b().type()));
    }

    @Override // sb.InterfaceC4554c
    /* renamed from: c */
    public void mo18604c() throws IOException {
        this.f18586d.flush();
    }

    @Override // sb.InterfaceC4554c
    public void cancel() {
        C4474e c4474e = this.f18584b;
        if (c4474e != null) {
            c4474e.m18376d();
        }
    }

    @Override // sb.InterfaceC4554c
    /* renamed from: d */
    public void mo18605d() throws IOException {
        this.f18586d.flush();
    }

    @Override // sb.InterfaceC4554c
    /* renamed from: e */
    public long mo18606e(C4181i0 c4181i0) {
        if (!C4556e.m18615c(c4181i0)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(c4181i0.m17437l("Transfer-Encoding"))) {
            return -1L;
        }
        return C4556e.m18614b(c4181i0);
    }

    @Override // sb.InterfaceC4554c
    /* renamed from: f */
    public InterfaceC0089s mo18607f(C4177g0 c4177g0, long j10) throws IOException {
        if (c4177g0.m17391a() != null && c4177g0.m17391a().m17414g()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(c4177g0.m17393c("Transfer-Encoding"))) {
            return m18922t();
        }
        if (j10 != -1) {
            return m18925w();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // sb.InterfaceC4554c
    /* renamed from: g */
    public InterfaceC0090t mo18608g(C4181i0 c4181i0) {
        if (!C4556e.m18615c(c4181i0)) {
            return m18924v(0L);
        }
        if ("chunked".equalsIgnoreCase(c4181i0.m17437l("Transfer-Encoding"))) {
            return m18923u(c4181i0.m17436k0().m17400j());
        }
        long m18614b = C4556e.m18614b(c4181i0);
        if (m18614b != -1) {
            return m18924v(m18614b);
        }
        return m18926x();
    }

    @Override // sb.InterfaceC4554c
    /* renamed from: h */
    public C4181i0.a mo18609h(boolean z10) throws IOException {
        int i10 = this.f18587e;
        if (i10 != 1 && i10 != 3) {
            throw new IllegalStateException("state: " + this.f18587e);
        }
        try {
            C4562k m18644a = C4562k.m18644a(m18927y());
            C4181i0.a m17449j = new C4181i0.a().m17454o(m18644a.f18329a).m17446g(m18644a.f18330b).m17451l(m18644a.f18331c).m17449j(m18928z());
            if (z10 && m18644a.f18330b == 100) {
                return null;
            }
            if (m18644a.f18330b == 100) {
                this.f18587e = 3;
                return m17449j;
            }
            this.f18587e = 4;
            return m17449j;
        } catch (EOFException e10) {
            C4474e c4474e = this.f18584b;
            throw new IOException("unexpected end of stream on " + (c4474e != null ? c4474e.m18384r().m17471a().m17269l().m17583B() : "unknown"), e10);
        }
    }
}
