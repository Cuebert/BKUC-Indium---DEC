package p168mb;

import androidx.concurrent.futures.C0540b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: mb.p */
/* loaded from: classes.dex */
public class C3994p<E> {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f16400a = AtomicReferenceFieldUpdater.newUpdater(C3994p.class, Object.class, "_cur");
    private volatile Object _cur;

    public C3994p(boolean z10) {
        this._cur = new C3995q(8, z10);
    }

    /* renamed from: a */
    public final boolean m16782a(E e10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16400a;
        while (true) {
            C3995q c3995q = (C3995q) atomicReferenceFieldUpdater.get(this);
            int m16791a = c3995q.m16791a(e10);
            if (m16791a == 0) {
                return true;
            }
            if (m16791a == 1) {
                C0540b.m2514a(f16400a, this, c3995q, c3995q.m16795i());
            } else if (m16791a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void m16783b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16400a;
        while (true) {
            C3995q c3995q = (C3995q) atomicReferenceFieldUpdater.get(this);
            if (c3995q.m16792d()) {
                return;
            } else {
                C0540b.m2514a(f16400a, this, c3995q, c3995q.m16795i());
            }
        }
    }

    /* renamed from: c */
    public final int m16784c() {
        return ((C3995q) f16400a.get(this)).m16793f();
    }

    /* renamed from: d */
    public final E m16785d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16400a;
        while (true) {
            C3995q c3995q = (C3995q) atomicReferenceFieldUpdater.get(this);
            E e10 = (E) c3995q.m16796j();
            if (e10 != C3995q.f16404h) {
                return e10;
            }
            C0540b.m2514a(f16400a, this, c3995q, c3995q.m16795i());
        }
    }
}
