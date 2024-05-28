package p087g6;

import androidx.annotation.RecentlyNonNull;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p271v3.AbstractExecutorServiceC4965m;
import p321z2.C5984j;

/* renamed from: g6.j */
/* loaded from: classes.dex */
public class C3299j extends AbstractExecutorServiceC4965m {

    /* renamed from: o */
    private static final ThreadLocal<Deque<Runnable>> f13756o = new ThreadLocal<>();

    /* renamed from: n */
    private final ThreadPoolExecutor f13757n;

    public C3299j() {
        final ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: g6.x
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return defaultThreadFactory.newThread(new Runnable() { // from class: g6.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3299j.m14564d(runnable);
                    }
                });
            }
        });
        this.f13757n = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* synthetic */ void m14564d(Runnable runnable) {
        f13756o.set(new ArrayDeque());
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static void m14565e(Deque<Runnable> deque, Runnable runnable) {
        C5984j.m21286j(deque);
        deque.add(runnable);
        if (deque.size() > 1) {
            return;
        }
        do {
            runnable.run();
            deque.removeFirst();
            runnable = deque.peekFirst();
        } while (runnable != null);
    }

    @Override // p271v3.AbstractC4947d
    @RecentlyNonNull
    /* renamed from: a */
    protected final /* bridge */ /* synthetic */ Object mo14566a() {
        return this.f13757n;
    }

    @Override // p271v3.AbstractExecutorServiceC4965m
    @RecentlyNonNull
    /* renamed from: b */
    protected final ExecutorService mo14567b() {
        return this.f13757n;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@RecentlyNonNull final Runnable runnable) {
        Deque<Runnable> deque = f13756o.get();
        if (deque != null && deque.size() <= 1) {
            m14565e(deque, runnable);
        } else {
            this.f13757n.execute(new Runnable() { // from class: g6.v
                @Override // java.lang.Runnable
                public final void run() {
                    C3299j.m14565e(C3299j.f13756o.get(), runnable);
                }
            });
        }
    }
}
