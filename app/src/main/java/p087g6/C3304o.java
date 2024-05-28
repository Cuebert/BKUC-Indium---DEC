package p087g6;

import androidx.annotation.RecentlyNonNull;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: g6.o */
/* loaded from: classes.dex */
public class C3304o {

    /* renamed from: b */
    private boolean f13771b;

    /* renamed from: a */
    private final Object f13770a = new Object();

    /* renamed from: c */
    private final Queue<C3293e0> f13772c = new ArrayDeque();

    /* renamed from: d */
    private final AtomicReference<Thread> f13773d = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final void m14581d() {
        synchronized (this.f13770a) {
            if (this.f13772c.isEmpty()) {
                this.f13771b = false;
            } else {
                C3293e0 remove = this.f13772c.remove();
                m14582e(remove.f13748a, remove.f13749b);
            }
        }
    }

    /* renamed from: e */
    private final void m14582e(Executor executor, final Runnable runnable) {
        try {
            executor.execute(new Runnable() { // from class: g6.c0
                @Override // java.lang.Runnable
                public final void run() {
                    C3304o c3304o = C3304o.this;
                    Runnable runnable2 = runnable;
                    C3295f0 c3295f0 = new C3295f0(c3304o, null);
                    try {
                        runnable2.run();
                        c3295f0.close();
                    } catch (Throwable th) {
                        try {
                            c3295f0.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            m14581d();
        }
    }

    /* renamed from: a */
    public void m14583a(@RecentlyNonNull Executor executor, @RecentlyNonNull Runnable runnable) {
        synchronized (this.f13770a) {
            if (this.f13771b) {
                this.f13772c.add(new C3293e0(executor, runnable, null));
            } else {
                this.f13771b = true;
                m14582e(executor, runnable);
            }
        }
    }
}
