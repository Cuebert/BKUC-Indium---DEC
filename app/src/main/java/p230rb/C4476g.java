package p230rb;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p193ob.C4164a;
import p193ob.C4185k0;
import p205pb.C4286e;
import p230rb.C4480k;
import p291wb.C5492f;

/* renamed from: rb.g */
/* loaded from: classes.dex */
public final class C4476g {

    /* renamed from: g */
    private static final Executor f18130g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C4286e.m17732I("OkHttp ConnectionPool", true));

    /* renamed from: a */
    private final int f18131a;

    /* renamed from: b */
    private final long f18132b;

    /* renamed from: c */
    private final Runnable f18133c = new Runnable() { // from class: rb.f
        @Override // java.lang.Runnable
        public final void run() {
            C4476g.this.m18389e();
        }
    };

    /* renamed from: d */
    private final Deque<C4474e> f18134d = new ArrayDeque();

    /* renamed from: e */
    final C4477h f18135e = new C4477h();

    /* renamed from: f */
    boolean f18136f;

    public C4476g(int i10, long j10, TimeUnit timeUnit) {
        this.f18131a = i10;
        this.f18132b = timeUnit.toNanos(j10);
        if (j10 > 0) {
            return;
        }
        throw new IllegalArgumentException("keepAliveDuration <= 0: " + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m18389e() {
        while (true) {
            long m18391b = m18391b(System.nanoTime());
            if (m18391b == -1) {
                return;
            }
            if (m18391b > 0) {
                long j10 = m18391b / 1000000;
                long j11 = m18391b - (1000000 * j10);
                synchronized (this) {
                    try {
                        wait(j10, (int) j11);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    /* renamed from: f */
    private int m18390f(C4474e c4474e, long j10) {
        List<Reference<C4480k>> list = c4474e.f18127p;
        int i10 = 0;
        while (i10 < list.size()) {
            Reference<C4480k> reference = list.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                C5492f.m20215l().mo20198u("A connection to " + c4474e.m18384r().m17471a().m17269l() + " was leaked. Did you forget to close a response body?", ((C4480k.b) reference).f18166a);
                list.remove(i10);
                c4474e.f18122k = true;
                if (list.isEmpty()) {
                    c4474e.f18128q = j10 - this.f18132b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    /* renamed from: b */
    long m18391b(long j10) {
        synchronized (this) {
            C4474e c4474e = null;
            long j11 = Long.MIN_VALUE;
            int i10 = 0;
            int i11 = 0;
            for (C4474e c4474e2 : this.f18134d) {
                if (m18390f(c4474e2, j10) > 0) {
                    i11++;
                } else {
                    i10++;
                    long j12 = j10 - c4474e2.f18128q;
                    if (j12 > j11) {
                        c4474e = c4474e2;
                        j11 = j12;
                    }
                }
            }
            long j13 = this.f18132b;
            if (j11 < j13 && i10 <= this.f18131a) {
                if (i10 > 0) {
                    return j13 - j11;
                }
                if (i11 > 0) {
                    return j13;
                }
                this.f18136f = false;
                return -1L;
            }
            this.f18134d.remove(c4474e);
            C4286e.m17744h(c4474e.m18385t());
            return 0L;
        }
    }

    /* renamed from: c */
    public void m18392c(C4185k0 c4185k0, IOException iOException) {
        if (c4185k0.m17472b().type() != Proxy.Type.DIRECT) {
            C4164a m17471a = c4185k0.m17471a();
            m17471a.m17266i().connectFailed(m17471a.m17269l().m17586E(), c4185k0.m17472b().address(), iOException);
        }
        this.f18135e.m18397b(c4185k0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m18393d(C4474e c4474e) {
        if (!c4474e.f18122k && this.f18131a != 0) {
            notifyAll();
            return false;
        }
        this.f18134d.remove(c4474e);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m18394g(C4474e c4474e) {
        if (!this.f18136f) {
            this.f18136f = true;
            f18130g.execute(this.f18133c);
        }
        this.f18134d.add(c4474e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m18395h(C4164a c4164a, C4480k c4480k, List<C4185k0> list, boolean z10) {
        for (C4474e c4474e : this.f18134d) {
            if (!z10 || c4474e.m18381o()) {
                if (c4474e.m18379m(c4164a, list)) {
                    c4480k.m18415a(c4474e);
                    return true;
                }
            }
        }
        return false;
    }
}
