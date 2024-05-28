package p145kb;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p168mb.C3984h;
import p168mb.C4003y;
import p290wa.C5485c;
import va.InterfaceC4999c;

/* renamed from: kb.d0 */
/* loaded from: classes.dex */
public final class C3780d0<T> extends C4003y<T> {

    /* renamed from: r */
    private static final AtomicIntegerFieldUpdater f15833r = AtomicIntegerFieldUpdater.newUpdater(C3780d0.class, "_decision");
    private volatile int _decision;

    /* renamed from: p0 */
    private final boolean m16121p0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15833r;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f15833r.compareAndSet(this, 0, 2));
        return true;
    }

    @Override // p168mb.C4003y, p145kb.C3775b1
    /* renamed from: m */
    protected void mo16096m(Object obj) {
        mo16029m0(obj);
    }

    @Override // p168mb.C4003y, p145kb.AbstractC3770a
    /* renamed from: m0 */
    protected void mo16029m0(Object obj) {
        InterfaceC4999c m20181a;
        if (m16121p0()) {
            return;
        }
        m20181a = C5485c.m20181a(this.f16417q);
        C3984h.m16750c(m20181a, C3822t.m16219a(obj, this.f16417q), null, 2, null);
    }
}
