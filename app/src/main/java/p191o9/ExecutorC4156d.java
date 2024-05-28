package p191o9;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: o9.d */
/* loaded from: classes.dex */
public class ExecutorC4156d implements Executor {

    /* renamed from: n */
    private final Deque<Runnable> f16926n = new ArrayDeque();

    /* renamed from: o */
    private final ScheduledExecutorService f16927o;

    /* renamed from: p */
    private Runnable f16928p;

    /* renamed from: q */
    private final int f16929q;

    /* renamed from: o9.d$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: n */
        final /* synthetic */ Runnable f16930n;

        a(Runnable runnable) {
            this.f16930n = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f16930n.run();
            } finally {
                ExecutorC4156d.this.m17233b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExecutorC4156d(Executor executor, int i10) {
        this.f16927o = (ScheduledExecutorService) executor;
        this.f16929q = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public synchronized void m17233b() {
        Runnable poll = this.f16926n.poll();
        this.f16928p = poll;
        if (poll != null) {
            this.f16927o.schedule(poll, this.f16929q, TimeUnit.MILLISECONDS);
            this.f16926n.clear();
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f16926n.addFirst(new a(runnable));
        if (this.f16928p == null) {
            m17233b();
        }
    }
}
