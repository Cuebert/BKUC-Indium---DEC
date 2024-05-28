package p003a2;

import java.util.concurrent.Executor;
import p056e2.C3061a;

/* renamed from: a2.m */
/* loaded from: classes.dex */
class ExecutorC0018m implements Executor {

    /* renamed from: n */
    private final Executor f165n;

    /* renamed from: a2.m$a */
    /* loaded from: classes.dex */
    static class a implements Runnable {

        /* renamed from: n */
        private final Runnable f166n;

        a(Runnable runnable) {
            this.f166n = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f166n.run();
            } catch (Exception e10) {
                C3061a.m13518d("Executor", "Background execution failure.", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExecutorC0018m(Executor executor) {
        this.f165n = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f165n.execute(new a(runnable));
    }
}
