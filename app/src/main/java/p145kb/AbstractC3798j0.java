package p145kb;

import ua.C4879d;

/* renamed from: kb.j0 */
/* loaded from: classes.dex */
public abstract class AbstractC3798j0 extends AbstractC3826v {

    /* renamed from: p */
    private long f15848p;

    /* renamed from: q */
    private boolean f15849q;

    /* renamed from: r */
    private C4879d<AbstractC3783e0<?>> f15850r;

    /* renamed from: n0 */
    private final long m16172n0(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    /* renamed from: r0 */
    public static /* synthetic */ void m16173r0(AbstractC3798j0 abstractC3798j0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC3798j0.m16177q0(z10);
    }

    /* renamed from: m0 */
    public final void m16174m0(boolean z10) {
        long m16172n0 = this.f15848p - m16172n0(z10);
        this.f15848p = m16172n0;
        if (m16172n0 <= 0 && this.f15849q) {
            shutdown();
        }
    }

    /* renamed from: o0 */
    public final void m16175o0(AbstractC3783e0<?> abstractC3783e0) {
        C4879d<AbstractC3783e0<?>> c4879d = this.f15850r;
        if (c4879d == null) {
            c4879d = new C4879d<>();
            this.f15850r = c4879d;
        }
        c4879d.m19099k(abstractC3783e0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p0 */
    public long mo16176p0() {
        C4879d<AbstractC3783e0<?>> c4879d = this.f15850r;
        return (c4879d == null || c4879d.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    /* renamed from: q0 */
    public final void m16177q0(boolean z10) {
        this.f15848p += m16172n0(z10);
        if (z10) {
            return;
        }
        this.f15849q = true;
    }

    /* renamed from: s0 */
    public final boolean m16178s0() {
        return this.f15848p >= m16172n0(true);
    }

    public void shutdown() {
    }

    /* renamed from: t0 */
    public final boolean m16179t0() {
        C4879d<AbstractC3783e0<?>> c4879d = this.f15850r;
        if (c4879d != null) {
            return c4879d.isEmpty();
        }
        return true;
    }

    /* renamed from: u0 */
    public final boolean m16180u0() {
        AbstractC3783e0<?> m19101v;
        C4879d<AbstractC3783e0<?>> c4879d = this.f15850r;
        if (c4879d == null || (m19101v = c4879d.m19101v()) == null) {
            return false;
        }
        m19101v.run();
        return true;
    }
}
