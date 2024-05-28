package ac;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: ac.a */
/* loaded from: classes.dex */
public class C0071a extends C0091u {

    /* renamed from: h */
    private static final long f256h;

    /* renamed from: i */
    private static final long f257i;

    /* renamed from: j */
    static C0071a f258j;

    /* renamed from: e */
    private boolean f259e;

    /* renamed from: f */
    private C0071a f260f;

    /* renamed from: g */
    private long f261g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ac.a$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC0089s {

        /* renamed from: n */
        final /* synthetic */ InterfaceC0089s f262n;

        a(InterfaceC0089s interfaceC0089s) {
            this.f262n = interfaceC0089s;
        }

        @Override // ac.InterfaceC0089s
        /* renamed from: C */
        public void mo313C(C0073c c0073c, long j10) throws IOException {
            C0092v.m453b(c0073c.f270o, 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                C0086p c0086p = c0073c.f269n;
                while (true) {
                    if (j11 >= 65536) {
                        break;
                    }
                    j11 += c0086p.f307c - c0086p.f306b;
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    }
                    c0086p = c0086p.f310f;
                }
                C0071a.this.m305k();
                try {
                    try {
                        this.f262n.mo313C(c0073c, j11);
                        j10 -= j11;
                        C0071a.this.m307m(true);
                    } catch (IOException e10) {
                        throw C0071a.this.m306l(e10);
                    }
                } catch (Throwable th) {
                    C0071a.this.m307m(false);
                    throw th;
                }
            }
        }

        @Override // ac.InterfaceC0089s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C0071a.this.m305k();
            try {
                try {
                    this.f262n.close();
                    C0071a.this.m307m(true);
                } catch (IOException e10) {
                    throw C0071a.this.m306l(e10);
                }
            } catch (Throwable th) {
                C0071a.this.m307m(false);
                throw th;
            }
        }

        @Override // ac.InterfaceC0089s
        /* renamed from: f */
        public C0091u mo314f() {
            return C0071a.this;
        }

        @Override // ac.InterfaceC0089s, java.io.Flushable
        public void flush() throws IOException {
            C0071a.this.m305k();
            try {
                try {
                    this.f262n.flush();
                    C0071a.this.m307m(true);
                } catch (IOException e10) {
                    throw C0071a.this.m306l(e10);
                }
            } catch (Throwable th) {
                C0071a.this.m307m(false);
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f262n + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ac.a$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC0090t {

        /* renamed from: n */
        final /* synthetic */ InterfaceC0090t f264n;

        b(InterfaceC0090t interfaceC0090t) {
            this.f264n = interfaceC0090t;
        }

        @Override // ac.InterfaceC0090t
        /* renamed from: V */
        public long mo315V(C0073c c0073c, long j10) throws IOException {
            C0071a.this.m305k();
            try {
                try {
                    long mo315V = this.f264n.mo315V(c0073c, j10);
                    C0071a.this.m307m(true);
                    return mo315V;
                } catch (IOException e10) {
                    throw C0071a.this.m306l(e10);
                }
            } catch (Throwable th) {
                C0071a.this.m307m(false);
                throw th;
            }
        }

        @Override // ac.InterfaceC0090t, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C0071a.this.m305k();
            try {
                try {
                    this.f264n.close();
                    C0071a.this.m307m(true);
                } catch (IOException e10) {
                    throw C0071a.this.m306l(e10);
                }
            } catch (Throwable th) {
                C0071a.this.m307m(false);
                throw th;
            }
        }

        @Override // ac.InterfaceC0090t
        /* renamed from: f */
        public C0091u mo316f() {
            return C0071a.this;
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f264n + ")";
        }
    }

    /* renamed from: ac.a$c */
    /* loaded from: classes.dex */
    public static final class c extends Thread {
        c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0015, code lost:
        
            r1.mo312t();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<ac.a> r0 = ac.C0071a.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                ac.a r1 = ac.C0071a.m301i()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                ac.a r2 = ac.C0071a.f258j     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r1 = 0
                ac.C0071a.f258j = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                r1.mo312t()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: ac.C0071a.c.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f256h = millis;
        f257i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* renamed from: i */
    static C0071a m301i() throws InterruptedException {
        C0071a c0071a = f258j.f260f;
        if (c0071a == null) {
            long nanoTime = System.nanoTime();
            C0071a.class.wait(f256h);
            if (f258j.f260f != null || System.nanoTime() - nanoTime < f257i) {
                return null;
            }
            return f258j;
        }
        long m303p = c0071a.m303p(System.nanoTime());
        if (m303p > 0) {
            long j10 = m303p / 1000000;
            C0071a.class.wait(j10, (int) (m303p - (1000000 * j10)));
            return null;
        }
        f258j.f260f = c0071a.f260f;
        c0071a.f260f = null;
        return c0071a;
    }

    /* renamed from: j */
    private static synchronized boolean m302j(C0071a c0071a) {
        synchronized (C0071a.class) {
            C0071a c0071a2 = f258j;
            while (c0071a2 != null) {
                C0071a c0071a3 = c0071a2.f260f;
                if (c0071a3 == c0071a) {
                    c0071a2.f260f = c0071a.f260f;
                    c0071a.f260f = null;
                    return false;
                }
                c0071a2 = c0071a3;
            }
            return true;
        }
    }

    /* renamed from: p */
    private long m303p(long j10) {
        return this.f261g - j10;
    }

    /* renamed from: q */
    private static synchronized void m304q(C0071a c0071a, long j10, boolean z10) {
        synchronized (C0071a.class) {
            if (f258j == null) {
                f258j = new C0071a();
                new c().start();
            }
            long nanoTime = System.nanoTime();
            if (j10 != 0 && z10) {
                c0071a.f261g = Math.min(j10, c0071a.mo409c() - nanoTime) + nanoTime;
            } else if (j10 != 0) {
                c0071a.f261g = j10 + nanoTime;
            } else if (z10) {
                c0071a.f261g = c0071a.mo409c();
            } else {
                throw new AssertionError();
            }
            long m303p = c0071a.m303p(nanoTime);
            C0071a c0071a2 = f258j;
            while (true) {
                C0071a c0071a3 = c0071a2.f260f;
                if (c0071a3 == null || m303p < c0071a3.m303p(nanoTime)) {
                    break;
                } else {
                    c0071a2 = c0071a2.f260f;
                }
            }
            c0071a.f260f = c0071a2.f260f;
            c0071a2.f260f = c0071a;
            if (c0071a2 == f258j) {
                C0071a.class.notify();
            }
        }
    }

    /* renamed from: k */
    public final void m305k() {
        if (!this.f259e) {
            long m451h = m451h();
            boolean mo411e = mo411e();
            if (m451h != 0 || mo411e) {
                this.f259e = true;
                m304q(this, m451h, mo411e);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    /* renamed from: l */
    final IOException m306l(IOException iOException) throws IOException {
        return !m308n() ? iOException : mo309o(iOException);
    }

    /* renamed from: m */
    final void m307m(boolean z10) throws IOException {
        if (m308n() && z10) {
            throw mo309o(null);
        }
    }

    /* renamed from: n */
    public final boolean m308n() {
        if (!this.f259e) {
            return false;
        }
        this.f259e = false;
        return m302j(this);
    }

    /* renamed from: o */
    protected IOException mo309o(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: r */
    public final InterfaceC0089s m310r(InterfaceC0089s interfaceC0089s) {
        return new a(interfaceC0089s);
    }

    /* renamed from: s */
    public final InterfaceC0090t m311s(InterfaceC0090t interfaceC0090t) {
        return new b(interfaceC0090t);
    }

    /* renamed from: t */
    protected void mo312t() {
    }
}
