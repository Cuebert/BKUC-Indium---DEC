package com.google.android.gms.measurement.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.j4 */
/* loaded from: classes.dex */
public final class C2186j4 extends Thread {

    /* renamed from: n */
    private final Object f8204n;

    /* renamed from: o */
    private final BlockingQueue<C2175i4<?>> f8205o;

    /* renamed from: p */
    private boolean f8206p = false;

    /* renamed from: q */
    final /* synthetic */ C2197k4 f8207q;

    public C2186j4(C2197k4 c2197k4, String str, BlockingQueue<C2175i4<?>> blockingQueue) {
        this.f8207q = c2197k4;
        C5984j.m21286j(str);
        C5984j.m21286j(blockingQueue);
        this.f8204n = new Object();
        this.f8205o = blockingQueue;
        setName(str);
    }

    /* renamed from: b */
    private final void m10062b() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        C2186j4 c2186j4;
        C2186j4 c2186j42;
        obj = this.f8207q.f8235i;
        synchronized (obj) {
            if (!this.f8206p) {
                semaphore = this.f8207q.f8236j;
                semaphore.release();
                obj2 = this.f8207q.f8235i;
                obj2.notifyAll();
                c2186j4 = this.f8207q.f8229c;
                if (this == c2186j4) {
                    this.f8207q.f8229c = null;
                } else {
                    c2186j42 = this.f8207q.f8230d;
                    if (this == c2186j42) {
                        this.f8207q.f8230d = null;
                    } else {
                        this.f8207q.f8118a.mo9765d().m10048r().m9893a("Current scheduler thread is neither worker nor network");
                    }
                }
                this.f8206p = true;
            }
        }
    }

    /* renamed from: c */
    private final void m10063c(InterruptedException interruptedException) {
        this.f8207q.f8118a.mo9765d().m10053w().m9894b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* renamed from: a */
    public final void m10064a() {
        synchronized (this.f8204n) {
            this.f8204n.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        Object obj;
        boolean z10 = false;
        while (!z10) {
            try {
                semaphore = this.f8207q.f8236j;
                semaphore.acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                m10063c(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C2175i4<?> poll = this.f8205o.poll();
                if (poll != null) {
                    Process.setThreadPriority(true != poll.f8179o ? 10 : threadPriority);
                    poll.run();
                } else {
                    synchronized (this.f8204n) {
                        if (this.f8205o.peek() == null) {
                            C2197k4.m10066B(this.f8207q);
                            try {
                                this.f8204n.wait(30000L);
                            } catch (InterruptedException e11) {
                                m10063c(e11);
                            }
                        }
                    }
                    obj = this.f8207q.f8235i;
                    synchronized (obj) {
                        if (this.f8205o.peek() == null) {
                            break;
                        }
                    }
                }
            }
            if (this.f8207q.f8118a.m10134z().m9861B(null, C2335x2.f8719l0)) {
                m10062b();
            }
        } finally {
            m10062b();
        }
    }
}
