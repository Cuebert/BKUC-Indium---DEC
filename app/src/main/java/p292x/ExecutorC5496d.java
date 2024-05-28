package p292x;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: x.d */
/* loaded from: classes.dex */
final class ExecutorC5496d implements Executor {

    /* renamed from: o */
    private static volatile Executor f20497o;

    /* renamed from: n */
    private final ExecutorService f20498n = Executors.newSingleThreadExecutor(new a());

    /* renamed from: x.d$a */
    /* loaded from: classes.dex */
    class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    ExecutorC5496d() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Executor m20230a() {
        if (f20497o != null) {
            return f20497o;
        }
        synchronized (ExecutorC5496d.class) {
            if (f20497o == null) {
                f20497o = new ExecutorC5496d();
            }
        }
        return f20497o;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f20498n.execute(runnable);
    }
}
