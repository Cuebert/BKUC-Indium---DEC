package p085g4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p322z3.HandlerC6010a;

/* renamed from: g4.m0 */
/* loaded from: classes.dex */
final class ExecutorC3266m0 implements Executor {

    /* renamed from: n */
    private final Handler f13707n = new HandlerC6010a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f13707n.post(runnable);
    }
}
