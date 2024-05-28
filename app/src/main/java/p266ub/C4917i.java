package p266ub;

import ac.C0071a;
import ac.C0073c;
import ac.C0091u;
import ac.InterfaceC0075e;
import ac.InterfaceC0089s;
import ac.InterfaceC0090t;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import p193ob.C4200y;
import p205pb.C4286e;

/* renamed from: ub.i */
/* loaded from: classes.dex */
public final class C4917i {

    /* renamed from: a */
    long f18916a = 0;

    /* renamed from: b */
    long f18917b;

    /* renamed from: c */
    final int f18918c;

    /* renamed from: d */
    final C4914f f18919d;

    /* renamed from: e */
    private final Deque<C4200y> f18920e;

    /* renamed from: f */
    private boolean f18921f;

    /* renamed from: g */
    private final b f18922g;

    /* renamed from: h */
    final a f18923h;

    /* renamed from: i */
    final c f18924i;

    /* renamed from: j */
    final c f18925j;

    /* renamed from: k */
    EnumC4910b f18926k;

    /* renamed from: l */
    IOException f18927l;

    /* renamed from: ub.i$a */
    /* loaded from: classes.dex */
    public final class a implements InterfaceC0089s {

        /* renamed from: n */
        private final C0073c f18928n = new C0073c();

        /* renamed from: o */
        private C4200y f18929o;

        /* renamed from: p */
        boolean f18930p;

        /* renamed from: q */
        boolean f18931q;

        a() {
        }

        /* renamed from: b */
        private void m19286b(boolean z10) throws IOException {
            C4917i c4917i;
            long min;
            C4917i c4917i2;
            boolean z11;
            synchronized (C4917i.this) {
                C4917i.this.f18925j.m305k();
                while (true) {
                    try {
                        c4917i = C4917i.this;
                        if (c4917i.f18917b > 0 || this.f18931q || this.f18930p || c4917i.f18926k != null) {
                            break;
                        } else {
                            c4917i.m19284q();
                        }
                    } finally {
                        C4917i.this.f18925j.m19290u();
                    }
                }
                c4917i.f18925j.m19290u();
                C4917i.this.m19271c();
                min = Math.min(C4917i.this.f18917b, this.f18928n.m381y0());
                c4917i2 = C4917i.this;
                c4917i2.f18917b -= min;
            }
            c4917i2.f18925j.m305k();
            if (z10) {
                try {
                    if (min == this.f18928n.m381y0()) {
                        z11 = true;
                        C4917i c4917i3 = C4917i.this;
                        c4917i3.f18919d.m19213A0(c4917i3.f18918c, z11, this.f18928n, min);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z11 = false;
            C4917i c4917i32 = C4917i.this;
            c4917i32.f18919d.m19213A0(c4917i32.f18918c, z11, this.f18928n, min);
        }

        @Override // ac.InterfaceC0089s
        /* renamed from: C */
        public void mo313C(C0073c c0073c, long j10) throws IOException {
            this.f18928n.mo313C(c0073c, j10);
            while (this.f18928n.m381y0() >= 16384) {
                m19286b(false);
            }
        }

        @Override // ac.InterfaceC0089s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (C4917i.this) {
                if (this.f18930p) {
                    return;
                }
                if (!C4917i.this.f18923h.f18931q) {
                    boolean z10 = this.f18928n.m381y0() > 0;
                    if (this.f18929o != null) {
                        while (this.f18928n.m381y0() > 0) {
                            m19286b(false);
                        }
                        C4917i c4917i = C4917i.this;
                        c4917i.f18919d.m19214B0(c4917i.f18918c, true, C4286e.m17733J(this.f18929o));
                    } else if (z10) {
                        while (this.f18928n.m381y0() > 0) {
                            m19286b(true);
                        }
                    } else {
                        C4917i c4917i2 = C4917i.this;
                        c4917i2.f18919d.m19213A0(c4917i2.f18918c, true, null, 0L);
                    }
                }
                synchronized (C4917i.this) {
                    this.f18930p = true;
                }
                C4917i.this.f18919d.flush();
                C4917i.this.m19270b();
            }
        }

        @Override // ac.InterfaceC0089s
        /* renamed from: f */
        public C0091u mo314f() {
            return C4917i.this.f18925j;
        }

        @Override // ac.InterfaceC0089s, java.io.Flushable
        public void flush() throws IOException {
            synchronized (C4917i.this) {
                C4917i.this.m19271c();
            }
            while (this.f18928n.m381y0() > 0) {
                m19286b(false);
                C4917i.this.f18919d.flush();
            }
        }
    }

    /* renamed from: ub.i$b */
    /* loaded from: classes.dex */
    public final class b implements InterfaceC0090t {

        /* renamed from: n */
        private final C0073c f18933n = new C0073c();

        /* renamed from: o */
        private final C0073c f18934o = new C0073c();

        /* renamed from: p */
        private final long f18935p;

        /* renamed from: q */
        private C4200y f18936q;

        /* renamed from: r */
        boolean f18937r;

        /* renamed from: s */
        boolean f18938s;

        b(long j10) {
            this.f18935p = j10;
        }

        /* renamed from: e */
        private void m19288e(long j10) {
            C4917i.this.f18919d.m19234z0(j10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
        
            r11 = -1;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
        @Override // ac.InterfaceC0090t
        /* renamed from: V */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long mo315V(ac.C0073c r11, long r12) throws java.io.IOException {
            /*
                r10 = this;
                r0 = 0
                int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
                if (r2 < 0) goto La8
            L6:
                r2 = 0
                ub.i r3 = p266ub.C4917i.this
                monitor-enter(r3)
                ub.i r4 = p266ub.C4917i.this     // Catch: java.lang.Throwable -> La5
                ub.i$c r4 = r4.f18924i     // Catch: java.lang.Throwable -> La5
                r4.m305k()     // Catch: java.lang.Throwable -> La5
                ub.i r4 = p266ub.C4917i.this     // Catch: java.lang.Throwable -> L9c
                ub.b r5 = r4.f18926k     // Catch: java.lang.Throwable -> L9c
                if (r5 == 0) goto L25
                java.io.IOException r2 = r4.f18927l     // Catch: java.lang.Throwable -> L9c
                if (r2 == 0) goto L1c
                goto L25
            L1c:
                ub.n r2 = new ub.n     // Catch: java.lang.Throwable -> L9c
                ub.i r4 = p266ub.C4917i.this     // Catch: java.lang.Throwable -> L9c
                ub.b r4 = r4.f18926k     // Catch: java.lang.Throwable -> L9c
                r2.<init>(r4)     // Catch: java.lang.Throwable -> L9c
            L25:
                boolean r4 = r10.f18937r     // Catch: java.lang.Throwable -> L9c
                if (r4 != 0) goto L94
                ac.c r4 = r10.f18934o     // Catch: java.lang.Throwable -> L9c
                long r4 = r4.m381y0()     // Catch: java.lang.Throwable -> L9c
                r6 = -1
                int r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r8 <= 0) goto L6b
                ac.c r4 = r10.f18934o     // Catch: java.lang.Throwable -> L9c
                long r8 = r4.m381y0()     // Catch: java.lang.Throwable -> L9c
                long r12 = java.lang.Math.min(r12, r8)     // Catch: java.lang.Throwable -> L9c
                long r11 = r4.mo315V(r11, r12)     // Catch: java.lang.Throwable -> L9c
                ub.i r13 = p266ub.C4917i.this     // Catch: java.lang.Throwable -> L9c
                long r4 = r13.f18916a     // Catch: java.lang.Throwable -> L9c
                long r4 = r4 + r11
                r13.f18916a = r4     // Catch: java.lang.Throwable -> L9c
                if (r2 != 0) goto L80
                ub.f r13 = r13.f18919d     // Catch: java.lang.Throwable -> L9c
                ub.m r13 = r13.f18834G     // Catch: java.lang.Throwable -> L9c
                int r13 = r13.m19319d()     // Catch: java.lang.Throwable -> L9c
                int r13 = r13 / 2
                long r8 = (long) r13     // Catch: java.lang.Throwable -> L9c
                int r13 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r13 < 0) goto L80
                ub.i r13 = p266ub.C4917i.this     // Catch: java.lang.Throwable -> L9c
                ub.f r4 = r13.f18919d     // Catch: java.lang.Throwable -> L9c
                int r5 = r13.f18918c     // Catch: java.lang.Throwable -> L9c
                long r8 = r13.f18916a     // Catch: java.lang.Throwable -> L9c
                r4.m19218F0(r5, r8)     // Catch: java.lang.Throwable -> L9c
                ub.i r13 = p266ub.C4917i.this     // Catch: java.lang.Throwable -> L9c
                r13.f18916a = r0     // Catch: java.lang.Throwable -> L9c
                goto L80
            L6b:
                boolean r4 = r10.f18938s     // Catch: java.lang.Throwable -> L9c
                if (r4 != 0) goto L7f
                if (r2 != 0) goto L7f
                ub.i r2 = p266ub.C4917i.this     // Catch: java.lang.Throwable -> L9c
                r2.m19284q()     // Catch: java.lang.Throwable -> L9c
                ub.i r2 = p266ub.C4917i.this     // Catch: java.lang.Throwable -> La5
                ub.i$c r2 = r2.f18924i     // Catch: java.lang.Throwable -> La5
                r2.m19290u()     // Catch: java.lang.Throwable -> La5
                monitor-exit(r3)     // Catch: java.lang.Throwable -> La5
                goto L6
            L7f:
                r11 = r6
            L80:
                ub.i r13 = p266ub.C4917i.this     // Catch: java.lang.Throwable -> La5
                ub.i$c r13 = r13.f18924i     // Catch: java.lang.Throwable -> La5
                r13.m19290u()     // Catch: java.lang.Throwable -> La5
                monitor-exit(r3)     // Catch: java.lang.Throwable -> La5
                int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r13 == 0) goto L90
                r10.m19288e(r11)
                return r11
            L90:
                if (r2 != 0) goto L93
                return r6
            L93:
                throw r2
            L94:
                java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L9c
                java.lang.String r12 = "stream closed"
                r11.<init>(r12)     // Catch: java.lang.Throwable -> L9c
                throw r11     // Catch: java.lang.Throwable -> L9c
            L9c:
                r11 = move-exception
                ub.i r12 = p266ub.C4917i.this     // Catch: java.lang.Throwable -> La5
                ub.i$c r12 = r12.f18924i     // Catch: java.lang.Throwable -> La5
                r12.m19290u()     // Catch: java.lang.Throwable -> La5
                throw r11     // Catch: java.lang.Throwable -> La5
            La5:
                r11 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> La5
                throw r11
            La8:
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "byteCount < 0: "
                r0.append(r1)
                r0.append(r12)
                java.lang.String r12 = r0.toString()
                r11.<init>(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p266ub.C4917i.b.mo315V(ac.c, long):long");
        }

        /* renamed from: c */
        void m19289c(InterfaceC0075e interfaceC0075e, long j10) throws IOException {
            boolean z10;
            boolean z11;
            boolean z12;
            long j11;
            while (j10 > 0) {
                synchronized (C4917i.this) {
                    z10 = this.f18938s;
                    z11 = true;
                    z12 = this.f18934o.m381y0() + j10 > this.f18935p;
                }
                if (z12) {
                    interfaceC0075e.mo369r(j10);
                    C4917i.this.m19273f(EnumC4910b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z10) {
                    interfaceC0075e.mo369r(j10);
                    return;
                }
                long mo315V = interfaceC0075e.mo315V(this.f18933n, j10);
                if (mo315V != -1) {
                    j10 -= mo315V;
                    synchronized (C4917i.this) {
                        if (this.f18937r) {
                            j11 = this.f18933n.m381y0();
                            this.f18933n.m347Y();
                        } else {
                            if (this.f18934o.m381y0() != 0) {
                                z11 = false;
                            }
                            this.f18934o.m329F0(this.f18933n);
                            if (z11) {
                                C4917i.this.notifyAll();
                            }
                            j11 = 0;
                        }
                    }
                    if (j11 > 0) {
                        m19288e(j11);
                    }
                } else {
                    throw new EOFException();
                }
            }
        }

        @Override // ac.InterfaceC0090t, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long m381y0;
            synchronized (C4917i.this) {
                this.f18937r = true;
                m381y0 = this.f18934o.m381y0();
                this.f18934o.m347Y();
                C4917i.this.notifyAll();
            }
            if (m381y0 > 0) {
                m19288e(m381y0);
            }
            C4917i.this.m19270b();
        }

        @Override // ac.InterfaceC0090t
        /* renamed from: f */
        public C0091u mo316f() {
            return C4917i.this.f18924i;
        }
    }

    /* renamed from: ub.i$c */
    /* loaded from: classes.dex */
    public class c extends C0071a {
        c() {
        }

        @Override // ac.C0071a
        /* renamed from: o */
        protected IOException mo309o(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // ac.C0071a
        /* renamed from: t */
        protected void mo312t() {
            C4917i.this.m19273f(EnumC4910b.CANCEL);
            C4917i.this.f18919d.m19230v0();
        }

        /* renamed from: u */
        public void m19290u() throws IOException {
            if (m308n()) {
                throw mo309o(null);
            }
        }
    }

    public C4917i(int i10, C4914f c4914f, boolean z10, boolean z11, C4200y c4200y) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f18920e = arrayDeque;
        this.f18924i = new c();
        this.f18925j = new c();
        Objects.requireNonNull(c4914f, "connection == null");
        this.f18918c = i10;
        this.f18919d = c4914f;
        this.f18917b = c4914f.f18835H.m19319d();
        b bVar = new b(c4914f.f18834G.m19319d());
        this.f18922g = bVar;
        a aVar = new a();
        this.f18923h = aVar;
        bVar.f18938s = z11;
        aVar.f18931q = z10;
        if (c4200y != null) {
            arrayDeque.add(c4200y);
        }
        if (m19277j() && c4200y != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!m19277j() && c4200y == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    /* renamed from: e */
    private boolean m19268e(EnumC4910b enumC4910b, IOException iOException) {
        synchronized (this) {
            if (this.f18926k != null) {
                return false;
            }
            if (this.f18922g.f18938s && this.f18923h.f18931q) {
                return false;
            }
            this.f18926k = enumC4910b;
            this.f18927l = iOException;
            notifyAll();
            this.f18919d.m19229u0(this.f18918c);
            return true;
        }
    }

    /* renamed from: a */
    public void m19269a(long j10) {
        this.f18917b += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }

    /* renamed from: b */
    void m19270b() throws IOException {
        boolean z10;
        boolean m19278k;
        synchronized (this) {
            b bVar = this.f18922g;
            if (!bVar.f18938s && bVar.f18937r) {
                a aVar = this.f18923h;
                if (aVar.f18931q || aVar.f18930p) {
                    z10 = true;
                    m19278k = m19278k();
                }
            }
            z10 = false;
            m19278k = m19278k();
        }
        if (z10) {
            m19272d(EnumC4910b.CANCEL, null);
        } else {
            if (m19278k) {
                return;
            }
            this.f18919d.m19229u0(this.f18918c);
        }
    }

    /* renamed from: c */
    void m19271c() throws IOException {
        a aVar = this.f18923h;
        if (!aVar.f18930p) {
            if (!aVar.f18931q) {
                if (this.f18926k != null) {
                    IOException iOException = this.f18927l;
                    if (iOException == null) {
                        throw new C4922n(this.f18926k);
                    }
                    throw iOException;
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    /* renamed from: d */
    public void m19272d(EnumC4910b enumC4910b, IOException iOException) throws IOException {
        if (m19268e(enumC4910b, iOException)) {
            this.f18919d.m19216D0(this.f18918c, enumC4910b);
        }
    }

    /* renamed from: f */
    public void m19273f(EnumC4910b enumC4910b) {
        if (m19268e(enumC4910b, null)) {
            this.f18919d.m19217E0(this.f18918c, enumC4910b);
        }
    }

    /* renamed from: g */
    public int m19274g() {
        return this.f18918c;
    }

    /* renamed from: h */
    public InterfaceC0089s m19275h() {
        synchronized (this) {
            if (!this.f18921f && !m19277j()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f18923h;
    }

    /* renamed from: i */
    public InterfaceC0090t m19276i() {
        return this.f18922g;
    }

    /* renamed from: j */
    public boolean m19277j() {
        return this.f18919d.f18840n == ((this.f18918c & 1) == 1);
    }

    /* renamed from: k */
    public synchronized boolean m19278k() {
        if (this.f18926k != null) {
            return false;
        }
        b bVar = this.f18922g;
        if (bVar.f18938s || bVar.f18937r) {
            a aVar = this.f18923h;
            if (aVar.f18931q || aVar.f18930p) {
                if (this.f18921f) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: l */
    public C0091u m19279l() {
        return this.f18924i;
    }

    /* renamed from: m */
    public void m19280m(InterfaceC0075e interfaceC0075e, int i10) throws IOException {
        this.f18922g.m19289c(interfaceC0075e, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018 A[Catch: all -> 0x002e, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0009, B:9:0x0018, B:10:0x001c, B:11:0x0023, B:18:0x000f), top: B:2:0x0001 }] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m19281n(p193ob.C4200y r3, boolean r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f18921f     // Catch: java.lang.Throwable -> L2e
            r1 = 1
            if (r0 == 0) goto Lf
            if (r4 != 0) goto L9
            goto Lf
        L9:
            ub.i$b r0 = r2.f18922g     // Catch: java.lang.Throwable -> L2e
            p266ub.C4917i.b.m19287b(r0, r3)     // Catch: java.lang.Throwable -> L2e
            goto L16
        Lf:
            r2.f18921f = r1     // Catch: java.lang.Throwable -> L2e
            java.util.Deque<ob.y> r0 = r2.f18920e     // Catch: java.lang.Throwable -> L2e
            r0.add(r3)     // Catch: java.lang.Throwable -> L2e
        L16:
            if (r4 == 0) goto L1c
            ub.i$b r3 = r2.f18922g     // Catch: java.lang.Throwable -> L2e
            r3.f18938s = r1     // Catch: java.lang.Throwable -> L2e
        L1c:
            boolean r3 = r2.m19278k()     // Catch: java.lang.Throwable -> L2e
            r2.notifyAll()     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            if (r3 != 0) goto L2d
            ub.f r3 = r2.f18919d
            int r4 = r2.f18918c
            r3.m19229u0(r4)
        L2d:
            return
        L2e:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p266ub.C4917i.m19281n(ob.y, boolean):void");
    }

    /* renamed from: o */
    public synchronized void m19282o(EnumC4910b enumC4910b) {
        if (this.f18926k == null) {
            this.f18926k = enumC4910b;
            notifyAll();
        }
    }

    /* renamed from: p */
    public synchronized C4200y m19283p() throws IOException {
        this.f18924i.m305k();
        while (this.f18920e.isEmpty() && this.f18926k == null) {
            try {
                m19284q();
            } catch (Throwable th) {
                this.f18924i.m19290u();
                throw th;
            }
        }
        this.f18924i.m19290u();
        if (!this.f18920e.isEmpty()) {
        } else {
            IOException iOException = this.f18927l;
            if (iOException != null) {
                throw iOException;
            }
            throw new C4922n(this.f18926k);
        }
        return this.f18920e.removeFirst();
    }

    /* renamed from: q */
    void m19284q() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: r */
    public C0091u m19285r() {
        return this.f18925j;
    }
}
