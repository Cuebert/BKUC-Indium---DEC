package p193ob;

import com.appsflyer.oaid.BuildConfig;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import p205pb.AbstractRunnableC4283b;
import p230rb.C4480k;
import p291wb.C5492f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ob.f0 */
/* loaded from: classes.dex */
public final class C4175f0 implements InterfaceC4176g {

    /* renamed from: n */
    final C4171d0 f17113n;

    /* renamed from: o */
    private C4480k f17114o;

    /* renamed from: p */
    final C4177g0 f17115p;

    /* renamed from: q */
    final boolean f17116q;

    /* renamed from: r */
    private boolean f17117r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ob.f0$a */
    /* loaded from: classes.dex */
    public final class a extends AbstractRunnableC4283b {

        /* renamed from: o */
        private final InterfaceC4178h f17118o;

        /* renamed from: p */
        private volatile AtomicInteger f17119p;

        a(InterfaceC4178h interfaceC4178h) {
            super("OkHttp %s", C4175f0.this.m17381h());
            this.f17119p = new AtomicInteger(0);
            this.f17118o = interfaceC4178h;
        }

        @Override // p205pb.AbstractRunnableC4283b
        /* renamed from: k */
        protected void mo17385k() {
            Throwable th;
            boolean z10;
            IOException e10;
            C4175f0.this.f17114o.m18428p();
            try {
                try {
                    z10 = true;
                } catch (IOException e11) {
                    e10 = e11;
                    z10 = false;
                } catch (Throwable th2) {
                    th = th2;
                    z10 = false;
                }
                try {
                    this.f17118o.mo14676a(C4175f0.this, C4175f0.this.m17380f());
                } catch (IOException e12) {
                    e10 = e12;
                    if (z10) {
                        C5492f.m20215l().mo20197t(4, "Callback failure for " + C4175f0.this.m17383j(), e10);
                    } else {
                        this.f17118o.mo14677b(C4175f0.this, e10);
                    }
                    C4175f0.this.f17113n.m17308n().m17509f(this);
                } catch (Throwable th3) {
                    th = th3;
                    C4175f0.this.cancel();
                    if (!z10) {
                        IOException iOException = new IOException("canceled due to " + th);
                        iOException.addSuppressed(th);
                        this.f17118o.mo14677b(C4175f0.this, iOException);
                    }
                    throw th;
                }
                C4175f0.this.f17113n.m17308n().m17509f(this);
            } catch (Throwable th4) {
                C4175f0.this.f17113n.m17308n().m17509f(this);
                throw th4;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: l */
        public AtomicInteger m17386l() {
            return this.f17119p;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: m */
        public void m17387m(ExecutorService executorService) {
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    C4175f0.this.f17114o.m18424l(interruptedIOException);
                    this.f17118o.mo14677b(C4175f0.this, interruptedIOException);
                    C4175f0.this.f17113n.m17308n().m17509f(this);
                }
            } catch (Throwable th) {
                C4175f0.this.f17113n.m17308n().m17509f(this);
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: n */
        public C4175f0 m17388n() {
            return C4175f0.this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o */
        public String m17389o() {
            return C4175f0.this.f17115p.m17400j().m17593m();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: p */
        public void m17390p(a aVar) {
            this.f17119p = aVar.f17119p;
        }
    }

    private C4175f0(C4171d0 c4171d0, C4177g0 c4177g0, boolean z10) {
        this.f17113n = c4171d0;
        this.f17115p = c4177g0;
        this.f17116q = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C4175f0 m17376g(C4171d0 c4171d0, C4177g0 c4177g0, boolean z10) {
        C4175f0 c4175f0 = new C4175f0(c4171d0, c4177g0, z10);
        c4175f0.f17114o = new C4480k(c4171d0, c4175f0);
        return c4175f0;
    }

    @Override // p193ob.InterfaceC4176g
    /* renamed from: c */
    public C4181i0 mo17377c() throws IOException {
        synchronized (this) {
            if (!this.f17117r) {
                this.f17117r = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.f17114o.m18428p();
        this.f17114o.m18416b();
        try {
            this.f17113n.m17308n().m17507b(this);
            return m17380f();
        } finally {
            this.f17113n.m17308n().m17510g(this);
        }
    }

    @Override // p193ob.InterfaceC4176g
    public void cancel() {
        this.f17114o.m18418d();
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C4175f0 clone() {
        return m17376g(this.f17113n, this.f17115p, this.f17116q);
    }

    @Override // p193ob.InterfaceC4176g
    /* renamed from: e */
    public C4177g0 mo17379e() {
        return this.f17115p;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    p193ob.C4181i0 m17380f() throws java.io.IOException {
        /*
            r11 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            ob.d0 r0 = r11.f17113n
            java.util.List r0 = r0.m17314t()
            r1.addAll(r0)
            sb.j r0 = new sb.j
            ob.d0 r2 = r11.f17113n
            r0.<init>(r2)
            r1.add(r0)
            sb.a r0 = new sb.a
            ob.d0 r2 = r11.f17113n
            ob.p r2 = r2.m17307m()
            r0.<init>(r2)
            r1.add(r0)
            qb.a r0 = new qb.a
            ob.d0 r2 = r11.f17113n
            qb.f r2 = r2.m17315u()
            r0.<init>(r2)
            r1.add(r0)
            rb.a r0 = new rb.a
            ob.d0 r2 = r11.f17113n
            r0.<init>(r2)
            r1.add(r0)
            boolean r0 = r11.f17116q
            if (r0 != 0) goto L4b
            ob.d0 r0 = r11.f17113n
            java.util.List r0 = r0.m17316v()
            r1.addAll(r0)
        L4b:
            sb.b r0 = new sb.b
            boolean r2 = r11.f17116q
            r0.<init>(r2)
            r1.add(r0)
            sb.g r10 = new sb.g
            rb.k r2 = r11.f17114o
            r3 = 0
            r4 = 0
            ob.g0 r5 = r11.f17115p
            ob.d0 r0 = r11.f17113n
            int r7 = r0.m17304h()
            ob.d0 r0 = r11.f17113n
            int r8 = r0.m17295E()
            ob.d0 r0 = r11.f17113n
            int r9 = r0.m17299I()
            r0 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            r1 = 0
            ob.g0 r2 = r11.f17115p     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            ob.i0 r2 = r10.mo17272b(r2)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            rb.k r3 = r11.f17114o     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            boolean r3 = r3.m18422i()     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            if (r3 != 0) goto L8a
            rb.k r0 = r11.f17114o
            r0.m18424l(r1)
            return r2
        L8a:
            p205pb.C4286e.m17743g(r2)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            throw r2     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
        L95:
            r2 = move-exception
            goto La3
        L97:
            r0 = move-exception
            r2 = 1
            rb.k r3 = r11.f17114o     // Catch: java.lang.Throwable -> La0
            java.io.IOException r0 = r3.m18424l(r0)     // Catch: java.lang.Throwable -> La0
            throw r0     // Catch: java.lang.Throwable -> La0
        La0:
            r0 = move-exception
            r2 = r0
            r0 = 1
        La3:
            if (r0 != 0) goto Laa
            rb.k r0 = r11.f17114o
            r0.m18424l(r1)
        Laa:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p193ob.C4175f0.m17380f():ob.i0");
    }

    /* renamed from: h */
    String m17381h() {
        return this.f17115p.m17400j().m17583B();
    }

    @Override // p193ob.InterfaceC4176g
    /* renamed from: i */
    public boolean mo17382i() {
        return this.f17114o.m18422i();
    }

    /* renamed from: j */
    String m17383j() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mo17382i() ? "canceled " : BuildConfig.FLAVOR);
        sb2.append(this.f17116q ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(m17381h());
        return sb2.toString();
    }

    @Override // p193ob.InterfaceC4176g
    /* renamed from: z */
    public void mo17384z(InterfaceC4178h interfaceC4178h) {
        synchronized (this) {
            if (!this.f17117r) {
                this.f17117r = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.f17114o.m18416b();
        this.f17113n.m17308n().m17506a(new a(interfaceC4178h));
    }
}
