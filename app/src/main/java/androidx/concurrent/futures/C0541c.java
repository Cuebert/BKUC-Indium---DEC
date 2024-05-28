package androidx.concurrent.futures;

import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: androidx.concurrent.futures.c */
/* loaded from: classes.dex */
public final class C0541c {

    /* renamed from: androidx.concurrent.futures.c$a */
    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a */
        Object f2403a;

        /* renamed from: b */
        d<T> f2404b;

        /* renamed from: c */
        private C0542d<Void> f2405c = C0542d.m2525s();

        /* renamed from: d */
        private boolean f2406d;

        a() {
        }

        /* renamed from: e */
        private void m2516e() {
            this.f2403a = null;
            this.f2404b = null;
            this.f2405c = null;
        }

        /* renamed from: a */
        public void m2517a(Runnable runnable, Executor executor) {
            C0542d<Void> c0542d = this.f2405c;
            if (c0542d != null) {
                c0542d.mo2501b(runnable, executor);
            }
        }

        /* renamed from: b */
        void m2518b() {
            this.f2403a = null;
            this.f2404b = null;
            this.f2405c.mo2505p(null);
        }

        /* renamed from: c */
        public boolean m2519c(T t10) {
            this.f2406d = true;
            d<T> dVar = this.f2404b;
            boolean z10 = dVar != null && dVar.m2523c(t10);
            if (z10) {
                m2516e();
            }
            return z10;
        }

        /* renamed from: d */
        public boolean m2520d() {
            this.f2406d = true;
            d<T> dVar = this.f2404b;
            boolean z10 = dVar != null && dVar.m2522a(true);
            if (z10) {
                m2516e();
            }
            return z10;
        }

        /* renamed from: f */
        public boolean m2521f(Throwable th) {
            this.f2406d = true;
            d<T> dVar = this.f2404b;
            boolean z10 = dVar != null && dVar.m2524d(th);
            if (z10) {
                m2516e();
            }
            return z10;
        }

        protected void finalize() {
            C0542d<Void> c0542d;
            d<T> dVar = this.f2404b;
            if (dVar != null && !dVar.isDone()) {
                dVar.m2524d(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f2403a));
            }
            if (this.f2406d || (c0542d = this.f2405c) == null) {
                return;
            }
            c0542d.mo2505p(null);
        }
    }

    /* renamed from: androidx.concurrent.futures.c$b */
    /* loaded from: classes.dex */
    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: androidx.concurrent.futures.c$c */
    /* loaded from: classes.dex */
    public interface c<T> {
        /* renamed from: a */
        Object mo1498a(a<T> aVar) throws Exception;
    }

    /* renamed from: androidx.concurrent.futures.c$d */
    /* loaded from: classes.dex */
    public static final class d<T> implements InterfaceFutureC2565m<T> {

        /* renamed from: n */
        final WeakReference<a<T>> f2407n;

        /* renamed from: o */
        private final AbstractC0539a<T> f2408o = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.concurrent.futures.c$d$a */
        /* loaded from: classes.dex */
        public class a extends AbstractC0539a<T> {
            a() {
            }

            @Override // androidx.concurrent.futures.AbstractC0539a
            /* renamed from: m */
            protected String mo2504m() {
                a<T> aVar = d.this.f2407n.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f2403a + "]";
            }
        }

        d(a<T> aVar) {
            this.f2407n = new WeakReference<>(aVar);
        }

        /* renamed from: a */
        boolean m2522a(boolean z10) {
            return this.f2408o.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.InterfaceFutureC2565m
        /* renamed from: b */
        public void mo2501b(Runnable runnable, Executor executor) {
            this.f2408o.mo2501b(runnable, executor);
        }

        /* renamed from: c */
        boolean m2523c(T t10) {
            return this.f2408o.mo2505p(t10);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            a<T> aVar = this.f2407n.get();
            boolean cancel = this.f2408o.cancel(z10);
            if (cancel && aVar != null) {
                aVar.m2518b();
            }
            return cancel;
        }

        /* renamed from: d */
        boolean m2524d(Throwable th) {
            return this.f2408o.mo2506q(th);
        }

        @Override // java.util.concurrent.Future
        public T get() throws InterruptedException, ExecutionException {
            return this.f2408o.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f2408o.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f2408o.isDone();
        }

        public String toString() {
            return this.f2408o.toString();
        }

        @Override // java.util.concurrent.Future
        public T get(long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return this.f2408o.get(j10, timeUnit);
        }
    }

    /* renamed from: a */
    public static <T> InterfaceFutureC2565m<T> m2515a(c<T> cVar) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.f2404b = dVar;
        aVar.f2403a = cVar.getClass();
        try {
            Object mo1498a = cVar.mo1498a(aVar);
            if (mo1498a != null) {
                aVar.f2403a = mo1498a;
            }
        } catch (Exception e10) {
            dVar.m2524d(e10);
        }
        return dVar;
    }
}
