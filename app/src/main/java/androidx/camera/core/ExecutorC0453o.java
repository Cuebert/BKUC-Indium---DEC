package androidx.camera.core;

import androidx.core.util.C0654h;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p279w.InterfaceC5005a0;

/* renamed from: androidx.camera.core.o */
/* loaded from: classes.dex */
class ExecutorC0453o implements Executor {

    /* renamed from: p */
    private static final ThreadFactory f2029p = new a();

    /* renamed from: n */
    private final Object f2030n = new Object();

    /* renamed from: o */
    private ThreadPoolExecutor f2031o = m2170b();

    /* renamed from: androidx.camera.core.o$a */
    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f2032a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", Integer.valueOf(this.f2032a.getAndIncrement())));
            return thread;
        }
    }

    /* renamed from: b */
    private static ThreadPoolExecutor m2170b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f2029p);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: androidx.camera.core.n
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                C0463q1.m2204c("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
            }
        });
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m2172c(InterfaceC5005a0 interfaceC5005a0) {
        ThreadPoolExecutor threadPoolExecutor;
        C0654h.m3467f(interfaceC5005a0);
        synchronized (this.f2030n) {
            if (this.f2031o.isShutdown()) {
                this.f2031o = m2170b();
            }
            threadPoolExecutor = this.f2031o;
        }
        int max = Math.max(1, interfaceC5005a0.mo1785c().size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        C0654h.m3467f(runnable);
        synchronized (this.f2030n) {
            this.f2031o.execute(runnable);
        }
    }
}
