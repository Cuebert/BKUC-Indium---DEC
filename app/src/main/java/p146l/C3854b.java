package p146l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: l.b */
/* loaded from: classes.dex */
public class C3854b extends AbstractC3855c {

    /* renamed from: a */
    private final Object f15912a = new Object();

    /* renamed from: b */
    private final ExecutorService f15913b = Executors.newFixedThreadPool(4, new a());

    /* renamed from: c */
    private volatile Handler f15914c;

    /* renamed from: l.b$a */
    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f15915a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f15915a.getAndIncrement())));
            return thread;
        }
    }

    /* renamed from: d */
    private static Handler m16282d(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // p146l.AbstractC3855c
    /* renamed from: a */
    public void mo16279a(Runnable runnable) {
        this.f15913b.execute(runnable);
    }

    @Override // p146l.AbstractC3855c
    /* renamed from: b */
    public boolean mo16280b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // p146l.AbstractC3855c
    /* renamed from: c */
    public void mo16281c(Runnable runnable) {
        if (this.f15914c == null) {
            synchronized (this.f15912a) {
                if (this.f15914c == null) {
                    this.f15914c = m16282d(Looper.getMainLooper());
                }
            }
        }
        this.f15914c.post(runnable);
    }
}
