package p145kb;

import p168mb.C3971a0;
import p168mb.C3981f0;

/* renamed from: kb.j1 */
/* loaded from: classes.dex */
public final class C3799j1 {

    /* renamed from: a */
    public static final C3799j1 f15851a = new C3799j1();

    /* renamed from: b */
    private static final ThreadLocal<AbstractC3798j0> f15852b = C3981f0.m16728a(new C3971a0("ThreadLocalEventLoop"));

    private C3799j1() {
    }

    /* renamed from: a */
    public final AbstractC3798j0 m16181a() {
        ThreadLocal<AbstractC3798j0> threadLocal = f15852b;
        AbstractC3798j0 abstractC3798j0 = threadLocal.get();
        if (abstractC3798j0 != null) {
            return abstractC3798j0;
        }
        AbstractC3798j0 m16209a = C3807m0.m16209a();
        threadLocal.set(m16209a);
        return m16209a;
    }

    /* renamed from: b */
    public final void m16182b() {
        f15852b.set(null);
    }

    /* renamed from: c */
    public final void m16183c(AbstractC3798j0 abstractC3798j0) {
        f15852b.set(abstractC3798j0);
    }
}
