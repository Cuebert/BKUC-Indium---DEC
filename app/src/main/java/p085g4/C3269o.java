package p085g4;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p321z2.C5984j;

/* renamed from: g4.o */
/* loaded from: classes.dex */
public final class C3269o {
    /* renamed from: a */
    public static <TResult> TResult m14526a(AbstractC3263l<TResult> abstractC3263l) throws ExecutionException, InterruptedException {
        C5984j.m21284h();
        C5984j.m21287k(abstractC3263l, "Task must not be null");
        if (abstractC3263l.mo14507n()) {
            return (TResult) m14532g(abstractC3263l);
        }
        C3273r c3273r = new C3273r(null);
        m14533h(abstractC3263l, c3273r);
        c3273r.m14534b();
        return (TResult) m14532g(abstractC3263l);
    }

    /* renamed from: b */
    public static <TResult> TResult m14527b(AbstractC3263l<TResult> abstractC3263l, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C5984j.m21284h();
        C5984j.m21287k(abstractC3263l, "Task must not be null");
        C5984j.m21287k(timeUnit, "TimeUnit must not be null");
        if (abstractC3263l.mo14507n()) {
            return (TResult) m14532g(abstractC3263l);
        }
        C3273r c3273r = new C3273r(null);
        m14533h(abstractC3263l, c3273r);
        if (c3273r.m14535c(j10, timeUnit)) {
            return (TResult) m14532g(abstractC3263l);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    /* renamed from: c */
    public static <TResult> AbstractC3263l<TResult> m14528c(Executor executor, Callable<TResult> callable) {
        C5984j.m21287k(executor, "Executor must not be null");
        C5984j.m21287k(callable, "Callback must not be null");
        C3268n0 c3268n0 = new C3268n0();
        executor.execute(new RunnableC3270o0(c3268n0, callable));
        return c3268n0;
    }

    /* renamed from: d */
    public static <TResult> AbstractC3263l<TResult> m14529d() {
        C3268n0 c3268n0 = new C3268n0();
        c3268n0.m14523t();
        return c3268n0;
    }

    /* renamed from: e */
    public static <TResult> AbstractC3263l<TResult> m14530e(Exception exc) {
        C3268n0 c3268n0 = new C3268n0();
        c3268n0.m14521r(exc);
        return c3268n0;
    }

    /* renamed from: f */
    public static <TResult> AbstractC3263l<TResult> m14531f(TResult tresult) {
        C3268n0 c3268n0 = new C3268n0();
        c3268n0.m14522s(tresult);
        return c3268n0;
    }

    /* renamed from: g */
    private static Object m14532g(AbstractC3263l abstractC3263l) throws ExecutionException {
        if (abstractC3263l.mo14508o()) {
            return abstractC3263l.mo14504k();
        }
        if (abstractC3263l.mo14506m()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(abstractC3263l.mo14503j());
    }

    /* renamed from: h */
    private static void m14533h(AbstractC3263l abstractC3263l, InterfaceC3274s interfaceC3274s) {
        Executor executor = C3267n.f13709b;
        abstractC3263l.mo14500g(executor, interfaceC3274s);
        abstractC3263l.mo14498e(executor, interfaceC3274s);
        abstractC3263l.mo14494a(executor, interfaceC3274s);
    }
}
