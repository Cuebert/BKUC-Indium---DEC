package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.common.util.concurrent.l */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC2564l<T> extends AtomicReference<Runnable> implements Runnable {

    /* renamed from: n */
    private static final Runnable f10132n;

    /* renamed from: o */
    private static final Runnable f10133o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.util.concurrent.l$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractOwnableSynchronizer implements Runnable {

        /* renamed from: n */
        private final AbstractRunnableC2564l<?> f10134n;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m11858b(Thread thread) {
            super.setExclusiveOwnerThread(thread);
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return this.f10134n.toString();
        }

        private b(AbstractRunnableC2564l<?> abstractRunnableC2564l) {
            this.f10134n = abstractRunnableC2564l;
        }
    }

    /* renamed from: com.google.common.util.concurrent.l$c */
    /* loaded from: classes.dex */
    private static final class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    static {
        f10132n = new c();
        f10133o = new c();
    }

    /* renamed from: g */
    private void m11855g(Thread thread) {
        Runnable runnable = get();
        b bVar = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            boolean z11 = runnable instanceof b;
            if (!z11 && runnable != f10133o) {
                break;
            }
            if (z11) {
                bVar = (b) runnable;
            }
            i10++;
            if (i10 > 1000) {
                Runnable runnable2 = f10133o;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z10 = Thread.interrupted() || z10;
                    LockSupport.park(bVar);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    /* renamed from: a */
    abstract void mo11847a(Throwable th);

    /* renamed from: b */
    abstract void mo11848b(T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m11856c() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            b bVar = new b();
            bVar.m11858b(Thread.currentThread());
            if (compareAndSet(runnable, bVar)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (getAndSet(f10132n) == f10133o) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    abstract boolean mo11849d();

    /* renamed from: e */
    abstract T mo11844e() throws Exception;

    /* renamed from: f */
    abstract String mo11845f();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean z10 = !mo11849d();
            if (z10) {
                try {
                    obj = mo11844e();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, f10132n)) {
                        m11855g(currentThread);
                    }
                    if (z10) {
                        mo11847a(th);
                        return;
                    }
                    return;
                }
            }
            if (!compareAndSet(currentThread, f10132n)) {
                m11855g(currentThread);
            }
            if (z10) {
                mo11848b(C2567o.m11860a(obj));
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == f10132n) {
            str = "running=[DONE]";
        } else if (runnable instanceof b) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 21);
            sb2.append("running=[RUNNING ON ");
            sb2.append(name);
            sb2.append("]");
            str = sb2.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String mo11845f = mo11845f();
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(mo11845f).length());
        sb3.append(str);
        sb3.append(", ");
        sb3.append(mo11845f);
        return sb3.toString();
    }
}
