package p176n6;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: n6.e */
/* loaded from: classes.dex */
public class C4071e {

    /* renamed from: a */
    private static final int f16527a;

    /* renamed from: b */
    private static final int f16528b;

    /* renamed from: c */
    private static final ThreadFactory f16529c;

    /* renamed from: d */
    private static final BlockingQueue<Runnable> f16530d;

    /* renamed from: e */
    private static Executor f16531e;

    /* renamed from: n6.e$a */
    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f16532a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ReportingThread #" + this.f16532a.getAndIncrement());
        }
    }

    /* renamed from: n6.e$b */
    /* loaded from: classes.dex */
    static class b implements RejectedExecutionHandler {
        b() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f16527a = availableProcessors;
        f16528b = (availableProcessors * 2) + 1;
        f16529c = new a();
        f16530d = new LinkedBlockingQueue(128);
    }

    /* renamed from: a */
    public static synchronized Executor m16935a() {
        Executor executor;
        synchronized (C4071e.class) {
            if (f16531e == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, f16528b, 30L, TimeUnit.SECONDS, f16530d, f16529c);
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                threadPoolExecutor.setRejectedExecutionHandler(new b());
                f16531e = threadPoolExecutor;
            }
            executor = f16531e;
        }
        return executor;
    }
}
