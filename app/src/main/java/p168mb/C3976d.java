package p168mb;

import java.util.Collection;
import java.util.List;
import java.util.ServiceLoader;
import p118ib.C3554f;
import p118ib.C3556h;
import p118ib.InterfaceC3550b;
import p145kb.InterfaceC3828w;

/* renamed from: mb.d */
/* loaded from: classes.dex */
public final class C3976d {

    /* renamed from: a */
    private static final Collection<InterfaceC3828w> f16362a;

    static {
        InterfaceC3550b m15363a;
        List m15366d;
        m15363a = C3554f.m15363a(ServiceLoader.load(InterfaceC3828w.class, InterfaceC3828w.class.getClassLoader()).iterator());
        m15366d = C3556h.m15366d(m15363a);
        f16362a = m15366d;
    }

    /* renamed from: a */
    public static final Collection<InterfaceC3828w> m16713a() {
        return f16362a;
    }

    /* renamed from: b */
    public static final void m16714b(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
