package lb;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.jvm.internal.C3844i;
import p253ta.C4751h;
import p253ta.C4752i;

/* renamed from: lb.e */
/* loaded from: classes.dex */
public final class C3910e {

    /* renamed from: a */
    public static final AbstractC3909d f16205a;
    private static volatile Choreographer choreographer;

    static {
        Object m18904a;
        try {
            C4751h.a aVar = C4751h.f18580n;
            m18904a = C4751h.m18904a(new C3908c(m16578a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            C4751h.a aVar2 = C4751h.f18580n;
            m18904a = C4751h.m18904a(C4752i.m18908a(th));
        }
        f16205a = (AbstractC3909d) (C4751h.m18906c(m18904a) ? null : m18904a);
    }

    /* renamed from: a */
    public static final Handler m16578a(Looper looper, boolean z10) {
        if (z10) {
            if (Build.VERSION.SDK_INT >= 28) {
                Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
                C3844i.m16251d(invoke, "null cannot be cast to non-null type android.os.Handler");
                return (Handler) invoke;
            }
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }
}
