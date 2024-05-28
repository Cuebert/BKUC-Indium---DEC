package p084g3;

import android.os.Process;

/* renamed from: g3.b */
/* loaded from: classes.dex */
final class RunnableC3240b implements Runnable {

    /* renamed from: n */
    private final Runnable f13680n;

    public RunnableC3240b(Runnable runnable, int i10) {
        this.f13680n = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f13680n.run();
    }
}
