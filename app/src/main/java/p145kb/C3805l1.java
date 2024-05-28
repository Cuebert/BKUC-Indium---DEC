package p145kb;

import p168mb.C3979e0;
import p168mb.C4003y;
import p253ta.C4750g;
import p253ta.C4753j;
import p253ta.C4755l;
import va.InterfaceC4999c;
import va.InterfaceC5001e;

/* renamed from: kb.l1 */
/* loaded from: classes.dex */
public final class C3805l1<T> extends C4003y<T> {

    /* renamed from: r */
    private final ThreadLocal<C4750g<InterfaceC5001e, Object>> f15861r;
    private volatile boolean threadLocalIsSet;

    @Override // p168mb.C4003y, p145kb.AbstractC3770a
    /* renamed from: m0 */
    protected void mo16029m0(Object obj) {
        if (this.threadLocalIsSet) {
            C4750g<InterfaceC5001e, Object> c4750g = this.f15861r.get();
            if (c4750g != null) {
                C3979e0.m16722a(c4750g.m18900a(), c4750g.m18901b());
            }
            this.f15861r.remove();
        }
        Object m16219a = C3822t.m16219a(obj, this.f16417q);
        InterfaceC4999c<T> interfaceC4999c = this.f16417q;
        InterfaceC5001e context = interfaceC4999c.getContext();
        Object m16724c = C3979e0.m16724c(context, null);
        C3805l1<?> m16225c = m16724c != C3979e0.f16363a ? C3824u.m16225c(interfaceC4999c, context, m16724c) : null;
        try {
            this.f16417q.mo16028d(m16219a);
            C4755l c4755l = C4755l.f18582a;
        } finally {
            if (m16225c == null || m16225c.m16207p0()) {
                C3979e0.m16722a(context, m16724c);
            }
        }
    }

    /* renamed from: p0 */
    public final boolean m16207p0() {
        boolean z10 = this.threadLocalIsSet && this.f15861r.get() == null;
        this.f15861r.remove();
        return !z10;
    }

    /* renamed from: q0 */
    public final void m16208q0(InterfaceC5001e interfaceC5001e, Object obj) {
        this.threadLocalIsSet = true;
        this.f15861r.set(C4753j.m18910a(interfaceC5001e, obj));
    }
}
