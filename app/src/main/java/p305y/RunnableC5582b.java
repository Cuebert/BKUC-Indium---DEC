package p305y;

import androidx.core.util.C0654h;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p292x.C5493a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y.b */
/* loaded from: classes.dex */
public class RunnableC5582b<I, O> extends C5584d<O> implements Runnable {

    /* renamed from: p */
    private InterfaceC5581a<? super I, ? extends O> f20690p;

    /* renamed from: q */
    private final BlockingQueue<Boolean> f20691q = new LinkedBlockingQueue(1);

    /* renamed from: r */
    private final CountDownLatch f20692r = new CountDownLatch(1);

    /* renamed from: s */
    private InterfaceFutureC2565m<? extends I> f20693s;

    /* renamed from: t */
    volatile InterfaceFutureC2565m<? extends O> f20694t;

    /* renamed from: y.b$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: n */
        final /* synthetic */ InterfaceFutureC2565m f20695n;

        a(InterfaceFutureC2565m interfaceFutureC2565m) {
            this.f20695n = interfaceFutureC2565m;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    RunnableC5582b.this.m20497c(C5586f.m20505e(this.f20695n));
                } catch (CancellationException unused) {
                    RunnableC5582b.this.cancel(false);
                    RunnableC5582b.this.f20694t = null;
                    return;
                } catch (ExecutionException e10) {
                    RunnableC5582b.this.m20498d(e10.getCause());
                }
                RunnableC5582b.this.f20694t = null;
            } catch (Throwable th) {
                RunnableC5582b.this.f20694t = null;
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5582b(InterfaceC5581a<? super I, ? extends O> interfaceC5581a, InterfaceFutureC2565m<? extends I> interfaceFutureC2565m) {
        this.f20690p = (InterfaceC5581a) C0654h.m3467f(interfaceC5581a);
        this.f20693s = (InterfaceFutureC2565m) C0654h.m3467f(interfaceFutureC2565m);
    }

    /* renamed from: g */
    private void m20493g(Future<?> future, boolean z10) {
        if (future != null) {
            future.cancel(z10);
        }
    }

    /* renamed from: h */
    private <E> void m20494h(BlockingQueue<E> blockingQueue, E e10) {
        boolean z10 = false;
        while (true) {
            try {
                blockingQueue.put(e10);
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: i */
    private <E> E m20495i(BlockingQueue<E> blockingQueue) {
        E take;
        boolean z10 = false;
        while (true) {
            try {
                take = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    @Override // p305y.C5584d, java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        if (!super.cancel(z10)) {
            return false;
        }
        m20494h(this.f20691q, Boolean.valueOf(z10));
        m20493g(this.f20693s, z10);
        m20493g(this.f20694t, z10);
        return true;
    }

    @Override // p305y.C5584d, java.util.concurrent.Future
    public O get() throws InterruptedException, ExecutionException {
        if (!isDone()) {
            InterfaceFutureC2565m<? extends I> interfaceFutureC2565m = this.f20693s;
            if (interfaceFutureC2565m != null) {
                interfaceFutureC2565m.get();
            }
            this.f20692r.await();
            InterfaceFutureC2565m<? extends O> interfaceFutureC2565m2 = this.f20694t;
            if (interfaceFutureC2565m2 != null) {
                interfaceFutureC2565m2.get();
            }
        }
        return (O) super.get();
    }

    @Override // java.lang.Runnable
    public void run() {
        InterfaceFutureC2565m<? extends O> mo1404a;
        try {
        } catch (Exception e10) {
            m20498d(e10);
        }
        try {
            try {
                try {
                    mo1404a = this.f20690p.mo1404a(C5586f.m20505e(this.f20693s));
                    this.f20694t = mo1404a;
                } catch (Error e11) {
                    m20498d(e11);
                } catch (UndeclaredThrowableException e12) {
                    m20498d(e12.getCause());
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e13) {
                m20498d(e13.getCause());
            }
            if (isCancelled()) {
                mo1404a.cancel(((Boolean) m20495i(this.f20691q)).booleanValue());
                this.f20694t = null;
                this.f20690p = null;
                this.f20693s = null;
                this.f20692r.countDown();
                return;
            }
            mo1404a.mo2501b(new a(mo1404a), C5493a.m20219a());
            this.f20690p = null;
            this.f20693s = null;
            this.f20692r.countDown();
        } catch (Throwable th) {
            this.f20690p = null;
            this.f20693s = null;
            this.f20692r.countDown();
            throw th;
        }
    }

    @Override // p305y.C5584d, java.util.concurrent.Future
    public O get(long j10, TimeUnit timeUnit) throws TimeoutException, ExecutionException, InterruptedException {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j10 = timeUnit2.convert(j10, timeUnit);
                timeUnit = timeUnit2;
            }
            InterfaceFutureC2565m<? extends I> interfaceFutureC2565m = this.f20693s;
            if (interfaceFutureC2565m != null) {
                long nanoTime = System.nanoTime();
                interfaceFutureC2565m.get(j10, timeUnit);
                j10 -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.f20692r.await(j10, timeUnit)) {
                j10 -= Math.max(0L, System.nanoTime() - nanoTime2);
                InterfaceFutureC2565m<? extends O> interfaceFutureC2565m2 = this.f20694t;
                if (interfaceFutureC2565m2 != null) {
                    interfaceFutureC2565m2.get(j10, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return (O) super.get(j10, timeUnit);
    }
}
