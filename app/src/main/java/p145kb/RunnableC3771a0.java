package p145kb;

import gb.C3328f;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.C3844i;
import p145kb.AbstractC3801k0;

/* renamed from: kb.a0 */
/* loaded from: classes.dex */
public final class RunnableC3771a0 extends AbstractC3801k0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: v */
    public static final RunnableC3771a0 f15808v;

    /* renamed from: w */
    private static final long f15809w;

    static {
        Long l10;
        RunnableC3771a0 runnableC3771a0 = new RunnableC3771a0();
        f15808v = runnableC3771a0;
        AbstractC3798j0.m16173r0(runnableC3771a0, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f15809w = timeUnit.toNanos(l10.longValue());
    }

    private RunnableC3771a0() {
    }

    /* renamed from: M0 */
    private final synchronized void m16033M0() {
        if (m16036P0()) {
            debugStatus = 3;
            m16195H0();
            C3844i.m16251d(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    /* renamed from: N0 */
    private final synchronized Thread m16034N0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: O0 */
    private final boolean m16035O0() {
        return debugStatus == 4;
    }

    /* renamed from: P0 */
    private final boolean m16036P0() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    /* renamed from: Q0 */
    private final synchronized boolean m16037Q0() {
        if (m16036P0()) {
            return false;
        }
        debugStatus = 1;
        C3844i.m16251d(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    /* renamed from: R0 */
    private final void m16038R0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p145kb.AbstractC3801k0
    /* renamed from: B0 */
    public void mo16039B0(Runnable runnable) {
        if (m16035O0()) {
            m16038R0();
        }
        super.mo16039B0(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean m16193E0;
        C3799j1.f15851a.m16183c(this);
        C3776c.m16114a();
        try {
            if (!m16037Q0()) {
                if (m16193E0) {
                    return;
                } else {
                    return;
                }
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long m16194F0 = m16194F0();
                if (m16194F0 == Long.MAX_VALUE) {
                    C3776c.m16114a();
                    long nanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f15809w + nanoTime;
                    }
                    long j11 = j10 - nanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        m16033M0();
                        C3776c.m16114a();
                        if (m16193E0()) {
                            return;
                        }
                        mo16040v0();
                        return;
                    }
                    m16194F0 = C3328f.m14625d(m16194F0, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (m16194F0 > 0) {
                    if (m16036P0()) {
                        _thread = null;
                        m16033M0();
                        C3776c.m16114a();
                        if (m16193E0()) {
                            return;
                        }
                        mo16040v0();
                        return;
                    }
                    C3776c.m16114a();
                    LockSupport.parkNanos(this, m16194F0);
                }
            }
        } finally {
            _thread = null;
            m16033M0();
            C3776c.m16114a();
            if (!m16193E0()) {
                mo16040v0();
            }
        }
    }

    @Override // p145kb.AbstractC3801k0, p145kb.AbstractC3798j0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // p145kb.AbstractC3804l0
    /* renamed from: v0 */
    protected Thread mo16040v0() {
        Thread thread = _thread;
        return thread == null ? m16034N0() : thread;
    }

    @Override // p145kb.AbstractC3804l0
    /* renamed from: w0 */
    protected void mo16041w0(long j10, AbstractC3801k0.a aVar) {
        m16038R0();
    }
}
