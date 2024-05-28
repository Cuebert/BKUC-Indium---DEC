package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.core.util.InterfaceC0647a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: androidx.core.provider.h */
/* loaded from: classes.dex */
class C0641h {

    /* renamed from: androidx.core.provider.h$a */
    /* loaded from: classes.dex */
    private static class a implements ThreadFactory {

        /* renamed from: a */
        private String f3441a;

        /* renamed from: b */
        private int f3442b;

        /* renamed from: androidx.core.provider.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C6038a extends Thread {

            /* renamed from: n */
            private final int f3443n;

            C6038a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f3443n = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f3443n);
                super.run();
            }
        }

        a(String str, int i10) {
            this.f3441a = str;
            this.f3442b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C6038a(runnable, this.f3441a, this.f3442b);
        }
    }

    /* renamed from: androidx.core.provider.h$b */
    /* loaded from: classes.dex */
    private static class b<T> implements Runnable {

        /* renamed from: n */
        private Callable<T> f3444n;

        /* renamed from: o */
        private InterfaceC0647a<T> f3445o;

        /* renamed from: p */
        private Handler f3446p;

        /* renamed from: androidx.core.provider.h$b$a */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: n */
            final /* synthetic */ InterfaceC0647a f3447n;

            /* renamed from: o */
            final /* synthetic */ Object f3448o;

            a(InterfaceC0647a interfaceC0647a, Object obj) {
                this.f3447n = interfaceC0647a;
                this.f3448o = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f3447n.mo2469a(this.f3448o);
            }
        }

        b(Handler handler, Callable<T> callable, InterfaceC0647a<T> interfaceC0647a) {
            this.f3444n = callable;
            this.f3445o = interfaceC0647a;
            this.f3446p = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t10;
            try {
                t10 = this.f3444n.call();
            } catch (Exception unused) {
                t10 = null;
            }
            this.f3446p.post(new a(this.f3445o, t10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ThreadPoolExecutor m3406a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <T> void m3407b(Executor executor, Callable<T> callable, InterfaceC0647a<T> interfaceC0647a) {
        executor.execute(new b(C0635b.m3369a(), callable, interfaceC0647a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static <T> T m3408c(ExecutorService executorService, Callable<T> callable, int i10) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
