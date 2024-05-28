package p087g6;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p032c6.C1131a;
import p085g4.AbstractC3263l;
import p085g4.C3265m;
import p271v3.HandlerC4941a;

/* renamed from: g6.g */
/* loaded from: classes.dex */
public class C3296g {

    /* renamed from: b */
    private static final Object f13751b = new Object();

    /* renamed from: c */
    private static C3296g f13752c;

    /* renamed from: a */
    private Handler f13753a;

    private C3296g(Looper looper) {
        this.f13753a = new HandlerC4941a(looper);
    }

    @RecentlyNonNull
    /* renamed from: a */
    public static C3296g m14553a() {
        C3296g c3296g;
        synchronized (f13751b) {
            if (f13752c == null) {
                HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                handlerThread.start();
                f13752c = new C3296g(handlerThread.getLooper());
            }
            c3296g = f13752c;
        }
        return c3296g;
    }

    @RecentlyNonNull
    /* renamed from: d */
    public static Executor m14554d() {
        return EnumC3310u.f13781n;
    }

    @RecentlyNonNull
    /* renamed from: b */
    public <ResultT> AbstractC3263l<ResultT> m14556b(@RecentlyNonNull final Callable<ResultT> callable) {
        final C3265m c3265m = new C3265m();
        m14557c(new Runnable() { // from class: g6.t
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                C3265m c3265m2 = c3265m;
                try {
                    c3265m2.m14514c(callable2.call());
                } catch (C1131a e10) {
                    c3265m2.m14513b(e10);
                } catch (Exception e11) {
                    c3265m2.m14513b(new C1131a("Internal error has occurred when executing ML Kit tasks", 13, e11));
                }
            }
        });
        return c3265m.m14512a();
    }

    /* renamed from: c */
    public void m14557c(@RecentlyNonNull Runnable runnable) {
        m14554d().execute(runnable);
    }
}
