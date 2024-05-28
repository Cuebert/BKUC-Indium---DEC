package com.google.android.gms.measurement.internal;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.internal.k4 */
/* loaded from: classes.dex */
public final class C2197k4 extends AbstractC2165h5 {

    /* renamed from: l */
    private static final AtomicLong f8228l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c */
    private C2186j4 f8229c;

    /* renamed from: d */
    private C2186j4 f8230d;

    /* renamed from: e */
    private final PriorityBlockingQueue<C2175i4<?>> f8231e;

    /* renamed from: f */
    private final BlockingQueue<C2175i4<?>> f8232f;

    /* renamed from: g */
    private final Thread.UncaughtExceptionHandler f8233g;

    /* renamed from: h */
    private final Thread.UncaughtExceptionHandler f8234h;

    /* renamed from: i */
    private final Object f8235i;

    /* renamed from: j */
    private final Semaphore f8236j;

    /* renamed from: k */
    private volatile boolean f8237k;

    public C2197k4(C2219m4 c2219m4) {
        super(c2219m4);
        this.f8235i = new Object();
        this.f8236j = new Semaphore(2);
        this.f8231e = new PriorityBlockingQueue<>();
        this.f8232f = new LinkedBlockingQueue();
        this.f8233g = new C2164h4(this, "Thread death: Uncaught exception on worker thread");
        this.f8234h = new C2164h4(this, "Thread death: Uncaught exception on network thread");
    }

    /* renamed from: B */
    public static /* bridge */ /* synthetic */ boolean m10066B(C2197k4 c2197k4) {
        boolean z10 = c2197k4.f8237k;
        return false;
    }

    /* renamed from: D */
    private final void m10067D(C2175i4<?> c2175i4) {
        synchronized (this.f8235i) {
            this.f8231e.add(c2175i4);
            C2186j4 c2186j4 = this.f8229c;
            if (c2186j4 == null) {
                C2186j4 c2186j42 = new C2186j4(this, "Measurement Worker", this.f8231e);
                this.f8229c = c2186j42;
                c2186j42.setUncaughtExceptionHandler(this.f8233g);
                this.f8229c.start();
            } else {
                c2186j4.m10064a();
            }
        }
    }

    /* renamed from: A */
    public final void m10075A(Runnable runnable) throws IllegalStateException {
        m9921k();
        C5984j.m21286j(runnable);
        m10067D(new C2175i4<>(this, runnable, true, "Task exception on worker thread"));
    }

    /* renamed from: C */
    public final boolean m10076C() {
        return Thread.currentThread() == this.f8229c;
    }

    @Override // com.google.android.gms.measurement.internal.C2154g5
    /* renamed from: g */
    public final void mo9916g() {
        if (Thread.currentThread() != this.f8230d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.C2154g5
    /* renamed from: h */
    public final void mo9917h() {
        if (Thread.currentThread() != this.f8229c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2165h5
    /* renamed from: j */
    protected final boolean mo9920j() {
        return false;
    }

    /* renamed from: r */
    public final <T> T m10077r(AtomicReference<T> atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f8118a.mo9761b().m10081z(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                this.f8118a.mo9765d().m10053w().m9893a(str.length() != 0 ? "Interrupted waiting for ".concat(str) : new String("Interrupted waiting for "));
                return null;
            }
        }
        T t10 = atomicReference.get();
        if (t10 == null) {
            this.f8118a.mo9765d().m10053w().m9893a(str.length() != 0 ? "Timed out waiting for ".concat(str) : new String("Timed out waiting for "));
        }
        return t10;
    }

    /* renamed from: s */
    public final <V> Future<V> m10078s(Callable<V> callable) throws IllegalStateException {
        m9921k();
        C5984j.m21286j(callable);
        C2175i4<?> c2175i4 = new C2175i4<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f8229c) {
            if (!this.f8231e.isEmpty()) {
                this.f8118a.mo9765d().m10053w().m9893a("Callable skipped the worker queue.");
            }
            c2175i4.run();
        } else {
            m10067D(c2175i4);
        }
        return c2175i4;
    }

    /* renamed from: t */
    public final <V> Future<V> m10079t(Callable<V> callable) throws IllegalStateException {
        m9921k();
        C5984j.m21286j(callable);
        C2175i4<?> c2175i4 = new C2175i4<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f8229c) {
            c2175i4.run();
        } else {
            m10067D(c2175i4);
        }
        return c2175i4;
    }

    /* renamed from: y */
    public final void m10080y(Runnable runnable) throws IllegalStateException {
        m9921k();
        C5984j.m21286j(runnable);
        C2175i4<?> c2175i4 = new C2175i4<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.f8235i) {
            this.f8232f.add(c2175i4);
            C2186j4 c2186j4 = this.f8230d;
            if (c2186j4 == null) {
                C2186j4 c2186j42 = new C2186j4(this, "Measurement Network", this.f8232f);
                this.f8230d = c2186j42;
                c2186j42.setUncaughtExceptionHandler(this.f8234h);
                this.f8230d.start();
            } else {
                c2186j4.m10064a();
            }
        }
    }

    /* renamed from: z */
    public final void m10081z(Runnable runnable) throws IllegalStateException {
        m9921k();
        C5984j.m21286j(runnable);
        m10067D(new C2175i4<>(this, runnable, false, "Task exception on worker thread"));
    }
}
