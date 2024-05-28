package p145kb;

import p168mb.C3973b0;
import p168mb.C3998t;

/* renamed from: kb.b0 */
/* loaded from: classes.dex */
public final class C3774b0 {

    /* renamed from: a */
    private static final boolean f15811a = C3973b0.m16708f("kotlinx.coroutines.main.delay", false);

    /* renamed from: b */
    private static final InterfaceC3777c0 f15812b = m16048b();

    /* renamed from: a */
    public static final InterfaceC3777c0 m16047a() {
        return f15812b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private static final InterfaceC3777c0 m16048b() {
        if (!f15811a) {
            return RunnableC3771a0.f15808v;
        }
        AbstractC3781d1 m16139c = C3789g0.m16139c();
        return (C3998t.m16804c(m16139c) || !(m16139c instanceof InterfaceC3777c0)) ? RunnableC3771a0.f15808v : (InterfaceC3777c0) m16139c;
    }
}
