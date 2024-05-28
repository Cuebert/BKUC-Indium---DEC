package p292x;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: x.e */
/* loaded from: classes.dex */
final class ExecutorC5497e implements Executor {

    /* renamed from: o */
    private static volatile Executor f20500o;

    /* renamed from: n */
    private final ExecutorService f20501n = Executors.newFixedThreadPool(2, new a());

    /* renamed from: x.e$a */
    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f20502a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", Integer.valueOf(this.f20502a.getAndIncrement())));
            return thread;
        }
    }

    ExecutorC5497e() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Executor m20231a() {
        if (f20500o != null) {
            return f20500o;
        }
        synchronized (ExecutorC5497e.class) {
            if (f20500o == null) {
                f20500o = new ExecutorC5497e();
            }
        }
        return f20500o;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f20501n.execute(runnable);
    }
}
