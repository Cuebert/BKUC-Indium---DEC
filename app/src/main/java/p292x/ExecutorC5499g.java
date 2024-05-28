package p292x;

import androidx.core.util.C0654h;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: x.g */
/* loaded from: classes.dex */
public final class ExecutorC5499g implements Executor {

    /* renamed from: o */
    private final Executor f20506o;

    /* renamed from: n */
    final Deque<Runnable> f20505n = new ArrayDeque();

    /* renamed from: p */
    private final b f20507p = new b();

    /* renamed from: q */
    c f20508q = c.IDLE;

    /* renamed from: r */
    long f20509r = 0;

    /* renamed from: x.g$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: n */
        final /* synthetic */ Runnable f20510n;

        a(Runnable runnable) {
            this.f20510n = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20510n.run();
        }
    }

    /* renamed from: x.g$b */
    /* loaded from: classes.dex */
    final class b implements Runnable {
        b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
        
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        
            androidx.camera.core.C0463q1.m2205d("SequentialExecutor", "Exception while executing runnable " + r3, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
        
            return;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m20233a() {
            /*
                r9 = this;
                r0 = 0
                r1 = 0
            L2:
                x.g r2 = p292x.ExecutorC5499g.this     // Catch: java.lang.Throwable -> L68
                java.util.Deque<java.lang.Runnable> r2 = r2.f20505n     // Catch: java.lang.Throwable -> L68
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L68
                if (r0 != 0) goto L26
                x.g r0 = p292x.ExecutorC5499g.this     // Catch: java.lang.Throwable -> L65
                x.g$c r3 = r0.f20508q     // Catch: java.lang.Throwable -> L65
                x.g$c r4 = p292x.ExecutorC5499g.c.RUNNING     // Catch: java.lang.Throwable -> L65
                if (r3 != r4) goto L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L65
                if (r1 == 0) goto L1b
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1b:
                return
            L1c:
                long r5 = r0.f20509r     // Catch: java.lang.Throwable -> L65
                r7 = 1
                long r5 = r5 + r7
                r0.f20509r = r5     // Catch: java.lang.Throwable -> L65
                r0.f20508q = r4     // Catch: java.lang.Throwable -> L65
                r0 = 1
            L26:
                x.g r3 = p292x.ExecutorC5499g.this     // Catch: java.lang.Throwable -> L65
                java.util.Deque<java.lang.Runnable> r3 = r3.f20505n     // Catch: java.lang.Throwable -> L65
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L65
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L65
                if (r3 != 0) goto L43
                x.g r0 = p292x.ExecutorC5499g.this     // Catch: java.lang.Throwable -> L65
                x.g$c r3 = p292x.ExecutorC5499g.c.IDLE     // Catch: java.lang.Throwable -> L65
                r0.f20508q = r3     // Catch: java.lang.Throwable -> L65
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L65
                if (r1 == 0) goto L42
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L42:
                return
            L43:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L65
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L68
                r1 = r1 | r2
                r3.run()     // Catch: java.lang.RuntimeException -> L4d java.lang.Throwable -> L68
                goto L2
            L4d:
                r2 = move-exception
                java.lang.String r4 = "SequentialExecutor"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
                r5.<init>()     // Catch: java.lang.Throwable -> L68
                java.lang.String r6 = "Exception while executing runnable "
                r5.append(r6)     // Catch: java.lang.Throwable -> L68
                r5.append(r3)     // Catch: java.lang.Throwable -> L68
                java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L68
                androidx.camera.core.C0463q1.m2205d(r4, r3, r2)     // Catch: java.lang.Throwable -> L68
                goto L2
            L65:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L65
                throw r0     // Catch: java.lang.Throwable -> L68
            L68:
                r0 = move-exception
                if (r1 == 0) goto L72
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L72:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p292x.ExecutorC5499g.b.m20233a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m20233a();
            } catch (Error e10) {
                synchronized (ExecutorC5499g.this.f20505n) {
                    ExecutorC5499g.this.f20508q = c.IDLE;
                    throw e10;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x.g$c */
    /* loaded from: classes.dex */
    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExecutorC5499g(Executor executor) {
        this.f20506o = (Executor) C0654h.m3467f(executor);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c cVar;
        C0654h.m3467f(runnable);
        synchronized (this.f20505n) {
            c cVar2 = this.f20508q;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j10 = this.f20509r;
                a aVar = new a(runnable);
                this.f20505n.add(aVar);
                c cVar3 = c.QUEUING;
                this.f20508q = cVar3;
                try {
                    this.f20506o.execute(this.f20507p);
                    if (this.f20508q != cVar3) {
                        return;
                    }
                    synchronized (this.f20505n) {
                        if (this.f20509r == j10 && this.f20508q == cVar3) {
                            this.f20508q = cVar;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f20505n) {
                        c cVar4 = this.f20508q;
                        if ((cVar4 != c.IDLE && cVar4 != c.QUEUING) || !this.f20505n.removeLastOccurrence(aVar)) {
                            r0 = false;
                        }
                        if (!(e10 instanceof RejectedExecutionException) || r0) {
                            throw e10;
                        }
                    }
                    return;
                }
            }
            this.f20505n.add(runnable);
        }
    }
}
