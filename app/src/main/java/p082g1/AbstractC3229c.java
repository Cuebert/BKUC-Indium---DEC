package p082g1;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: g1.c */
/* loaded from: classes.dex */
abstract class AbstractC3229c<Params, Progress, Result> {

    /* renamed from: s */
    private static final ThreadFactory f13634s;

    /* renamed from: t */
    private static final BlockingQueue<Runnable> f13635t;

    /* renamed from: u */
    public static final Executor f13636u;

    /* renamed from: v */
    private static f f13637v;

    /* renamed from: w */
    private static volatile Executor f13638w;

    /* renamed from: n */
    private final h<Params, Result> f13639n;

    /* renamed from: o */
    private final FutureTask<Result> f13640o;

    /* renamed from: p */
    private volatile g f13641p = g.PENDING;

    /* renamed from: q */
    final AtomicBoolean f13642q = new AtomicBoolean();

    /* renamed from: r */
    final AtomicBoolean f13643r = new AtomicBoolean();

    /* renamed from: g1.c$a */
    /* loaded from: classes.dex */
    static class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f13644a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f13644a.getAndIncrement());
        }
    }

    /* renamed from: g1.c$b */
    /* loaded from: classes.dex */
    class b extends h<Params, Result> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            AbstractC3229c.this.f13643r.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) AbstractC3229c.this.mo14426b(this.f13654a);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* renamed from: g1.c$c */
    /* loaded from: classes.dex */
    class c extends FutureTask<Result> {
        c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                AbstractC3229c.this.m14459m(get());
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (CancellationException unused) {
                AbstractC3229c.this.m14459m(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* renamed from: g1.c$d */
    /* loaded from: classes.dex */
    static /* synthetic */ class d {

        /* renamed from: a */
        static final /* synthetic */ int[] f13647a;

        static {
            int[] iArr = new int[g.values().length];
            f13647a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13647a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g1.c$e */
    /* loaded from: classes.dex */
    public static class e<Data> {

        /* renamed from: a */
        final AbstractC3229c f13648a;

        /* renamed from: b */
        final Data[] f13649b;

        e(AbstractC3229c abstractC3229c, Data... dataArr) {
            this.f13648a = abstractC3229c;
            this.f13649b = dataArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g1.c$f */
    /* loaded from: classes.dex */
    public static class f extends Handler {
        f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i10 = message.what;
            if (i10 == 1) {
                eVar.f13648a.m14453d(eVar.f13649b[0]);
            } else {
                if (i10 != 2) {
                    return;
                }
                eVar.f13648a.m14457k(eVar.f13649b);
            }
        }
    }

    /* renamed from: g1.c$g */
    /* loaded from: classes.dex */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: g1.c$h */
    /* loaded from: classes.dex */
    private static abstract class h<Params, Result> implements Callable<Result> {

        /* renamed from: a */
        Params[] f13654a;

        h() {
        }
    }

    static {
        a aVar = new a();
        f13634s = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f13635t = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f13636u = threadPoolExecutor;
        f13638w = threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3229c() {
        b bVar = new b();
        this.f13639n = bVar;
        this.f13640o = new c(bVar);
    }

    /* renamed from: e */
    private static Handler m14450e() {
        f fVar;
        synchronized (AbstractC3229c.class) {
            if (f13637v == null) {
                f13637v = new f();
            }
            fVar = f13637v;
        }
        return fVar;
    }

    /* renamed from: a */
    public final boolean m14451a(boolean z10) {
        this.f13642q.set(true);
        return this.f13640o.cancel(z10);
    }

    /* renamed from: b */
    protected abstract Result mo14426b(Params... paramsArr);

    /* renamed from: c */
    public final AbstractC3229c<Params, Progress, Result> m14452c(Executor executor, Params... paramsArr) {
        if (this.f13641p != g.PENDING) {
            int i10 = d.f13647a[this.f13641p.ordinal()];
            if (i10 == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (i10 != 2) {
                throw new IllegalStateException("We should never reach this state");
            }
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        this.f13641p = g.RUNNING;
        m14456j();
        this.f13639n.f13654a = paramsArr;
        executor.execute(this.f13640o);
        return this;
    }

    /* renamed from: d */
    void m14453d(Result result) {
        if (m14454f()) {
            mo14427h(result);
        } else {
            mo14428i(result);
        }
        this.f13641p = g.FINISHED;
    }

    /* renamed from: f */
    public final boolean m14454f() {
        return this.f13642q.get();
    }

    /* renamed from: g */
    protected void m14455g() {
    }

    /* renamed from: h */
    protected void mo14427h(Result result) {
        m14455g();
    }

    /* renamed from: i */
    protected void mo14428i(Result result) {
    }

    /* renamed from: j */
    protected void m14456j() {
    }

    /* renamed from: k */
    protected void m14457k(Progress... progressArr) {
    }

    /* renamed from: l */
    Result m14458l(Result result) {
        m14450e().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    /* renamed from: m */
    void m14459m(Result result) {
        if (this.f13643r.get()) {
            return;
        }
        m14458l(result);
    }
}
