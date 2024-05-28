package p145kb;

import va.InterfaceC5001e;

/* renamed from: kb.k1 */
/* loaded from: classes.dex */
public final class C3802k1 extends AbstractC3826v {

    /* renamed from: p */
    public static final C3802k1 f15860p = new C3802k1();

    private C3802k1() {
    }

    @Override // p145kb.AbstractC3826v
    /* renamed from: j0 */
    public void mo16197j0(InterfaceC5001e interfaceC5001e, Runnable runnable) {
        C3811n1 c3811n1 = (C3811n1) interfaceC5001e.mo16094i(C3811n1.f15866p);
        if (c3811n1 != null) {
            c3811n1.f15867o = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // p145kb.AbstractC3826v
    /* renamed from: k0 */
    public boolean mo16205k0(InterfaceC5001e interfaceC5001e) {
        return false;
    }

    @Override // p145kb.AbstractC3826v
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
