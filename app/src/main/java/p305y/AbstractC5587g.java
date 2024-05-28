package p305y;

import androidx.camera.core.C0463q1;
import androidx.core.util.C0654h;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: y.g */
/* loaded from: classes.dex */
abstract class AbstractC5587g<V> implements InterfaceFutureC2565m<V> {

    /* renamed from: y.g$a */
    /* loaded from: classes.dex */
    static class a<V> extends AbstractC5587g<V> {

        /* renamed from: n */
        private final Throwable f20708n;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Throwable th) {
            this.f20708n = th;
        }

        @Override // p305y.AbstractC5587g, java.util.concurrent.Future
        public V get() throws ExecutionException {
            throw new ExecutionException(this.f20708n);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f20708n + "]]";
        }
    }

    /* renamed from: y.g$b */
    /* loaded from: classes.dex */
    static final class b<V> extends a<V> implements ScheduledFuture<V> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public b(Throwable th) {
            super(th);
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return 0L;
        }
    }

    /* renamed from: y.g$c */
    /* loaded from: classes.dex */
    static final class c<V> extends AbstractC5587g<V> {

        /* renamed from: o */
        static final AbstractC5587g<Object> f20709o = new c(null);

        /* renamed from: n */
        private final V f20710n;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(V v10) {
            this.f20710n = v10;
        }

        @Override // p305y.AbstractC5587g, java.util.concurrent.Future
        public V get() {
            return this.f20710n;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f20710n + "]]";
        }
    }

    AbstractC5587g() {
    }

    /* renamed from: c */
    public static <V> InterfaceFutureC2565m<V> m20517c() {
        return c.f20709o;
    }

    @Override // com.google.common.util.concurrent.InterfaceFutureC2565m
    /* renamed from: b */
    public void mo2501b(Runnable runnable, Executor executor) {
        C0654h.m3467f(runnable);
        C0654h.m3467f(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            C0463q1.m2205d("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e10);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract V get() throws ExecutionException;

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) throws ExecutionException {
        C0654h.m3467f(timeUnit);
        return get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }
}
