package p292x;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.concurrent.futures.C0541c;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p305y.C5586f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: x.c */
/* loaded from: classes.dex */
public final class ScheduledExecutorServiceC5495c extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: o */
    private static ThreadLocal<ScheduledExecutorService> f20485o = new a();

    /* renamed from: n */
    private final Handler f20486n;

    /* renamed from: x.c$a */
    /* loaded from: classes.dex */
    class a extends ThreadLocal<ScheduledExecutorService> {
        a() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return C5493a.m20222d();
            }
            if (Looper.myLooper() != null) {
                return new ScheduledExecutorServiceC5495c(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    /* renamed from: x.c$b */
    /* loaded from: classes.dex */
    class b implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ Runnable f20487a;

        b(Runnable runnable) {
            this.f20487a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            this.f20487a.run();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x.c$c */
    /* loaded from: classes.dex */
    public static class c<V> implements RunnableScheduledFuture<V> {

        /* renamed from: n */
        final AtomicReference<C0541c.a<V>> f20489n = new AtomicReference<>(null);

        /* renamed from: o */
        private final long f20490o;

        /* renamed from: p */
        private final Callable<V> f20491p;

        /* renamed from: q */
        private final InterfaceFutureC2565m<V> f20492q;

        /* renamed from: x.c$c$a */
        /* loaded from: classes.dex */
        class a implements C0541c.c<V> {

            /* renamed from: a */
            final /* synthetic */ Handler f20493a;

            /* renamed from: b */
            final /* synthetic */ Callable f20494b;

            /* renamed from: x.c$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class RunnableC6061a implements Runnable {
                RunnableC6061a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (c.this.f20489n.getAndSet(null) != null) {
                        a aVar = a.this;
                        aVar.f20493a.removeCallbacks(c.this);
                    }
                }
            }

            a(Handler handler, Callable callable) {
                this.f20493a = handler;
                this.f20494b = callable;
            }

            @Override // androidx.concurrent.futures.C0541c.c
            /* renamed from: a */
            public Object mo1498a(C0541c.a<V> aVar) throws RejectedExecutionException {
                aVar.m2517a(new RunnableC6061a(), C5493a.m20219a());
                c.this.f20489n.set(aVar);
                return "HandlerScheduledFuture-" + this.f20494b.toString();
            }
        }

        c(Handler handler, long j10, Callable<V> callable) {
            this.f20490o = j10;
            this.f20491p = callable;
            this.f20492q = C0541c.m2515a(new a(handler, callable));
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            return this.f20492q.cancel(z10);
        }

        @Override // java.util.concurrent.Future
        public V get() throws ExecutionException, InterruptedException {
            return this.f20492q.get();
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f20490o - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f20492q.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f20492q.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            C0541c.a andSet = this.f20489n.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.m2519c(this.f20491p.call());
                } catch (Exception e10) {
                    andSet.m2521f(e10);
                }
            }
        }

        @Override // java.util.concurrent.Future
        public V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.f20492q.get(j10, timeUnit);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ScheduledExecutorServiceC5495c(Handler handler) {
        this.f20486n = handler;
    }

    /* renamed from: a */
    private RejectedExecutionException m20226a() {
        return new RejectedExecutionException(this.f20486n + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC5495c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (!this.f20486n.post(runnable)) {
            throw m20226a();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return schedule(new b(runnable), j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC5495c.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC5495c.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC5495c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC5495c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
        long uptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j10, timeUnit);
        c cVar = new c(this.f20486n, uptimeMillis, callable);
        return this.f20486n.postAtTime(cVar, uptimeMillis) ? cVar : C5586f.m20507g(m20226a());
    }
}
