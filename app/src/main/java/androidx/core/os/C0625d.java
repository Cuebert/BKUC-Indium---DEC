package androidx.core.os;

import android.os.Handler;
import androidx.core.util.C0654h;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: androidx.core.os.d */
/* loaded from: classes.dex */
public final class C0625d {

    /* renamed from: androidx.core.os.d$a */
    /* loaded from: classes.dex */
    private static class a implements Executor {

        /* renamed from: n */
        private final Handler f3387n;

        a(Handler handler) {
            this.f3387n = (Handler) C0654h.m3467f(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f3387n.post((Runnable) C0654h.m3467f(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f3387n + " is shutting down");
        }
    }

    /* renamed from: a */
    public static Executor m3345a(Handler handler) {
        return new a(handler);
    }
}
