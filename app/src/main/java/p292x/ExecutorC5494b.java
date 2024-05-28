package p292x;

import java.util.concurrent.Executor;

/* renamed from: x.b */
/* loaded from: classes.dex */
final class ExecutorC5494b implements Executor {

    /* renamed from: n */
    private static volatile ExecutorC5494b f20484n;

    ExecutorC5494b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Executor m20225a() {
        if (f20484n != null) {
            return f20484n;
        }
        synchronized (ExecutorC5494b.class) {
            if (f20484n == null) {
                f20484n = new ExecutorC5494b();
            }
        }
        return f20484n;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
