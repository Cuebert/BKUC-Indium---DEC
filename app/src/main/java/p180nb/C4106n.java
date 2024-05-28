package p180nb;

import androidx.concurrent.futures.C0540b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C3850o;

/* renamed from: nb.n */
/* loaded from: classes.dex */
public final class C4106n {

    /* renamed from: b */
    private static final AtomicReferenceFieldUpdater f16668b = AtomicReferenceFieldUpdater.newUpdater(C4106n.class, Object.class, "lastScheduledTask");

    /* renamed from: c */
    private static final AtomicIntegerFieldUpdater f16669c = AtomicIntegerFieldUpdater.newUpdater(C4106n.class, "producerIndex");

    /* renamed from: d */
    private static final AtomicIntegerFieldUpdater f16670d = AtomicIntegerFieldUpdater.newUpdater(C4106n.class, "consumerIndex");

    /* renamed from: e */
    private static final AtomicIntegerFieldUpdater f16671e = AtomicIntegerFieldUpdater.newUpdater(C4106n.class, "blockingTasksInBuffer");

    /* renamed from: a */
    private final AtomicReferenceArray<AbstractRunnableC4100h> f16672a = new AtomicReferenceArray<>(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    /* renamed from: b */
    private final AbstractRunnableC4100h m17082b(AbstractRunnableC4100h abstractRunnableC4100h) {
        if (m17084d() == 127) {
            return abstractRunnableC4100h;
        }
        if (abstractRunnableC4100h.f16656o.mo17081b() == 1) {
            f16671e.incrementAndGet(this);
        }
        int i10 = f16669c.get(this) & 127;
        while (this.f16672a.get(i10) != null) {
            Thread.yield();
        }
        this.f16672a.lazySet(i10, abstractRunnableC4100h);
        f16669c.incrementAndGet(this);
        return null;
    }

    /* renamed from: c */
    private final void m17083c(AbstractRunnableC4100h abstractRunnableC4100h) {
        if (abstractRunnableC4100h != null) {
            if (abstractRunnableC4100h.f16656o.mo17081b() == 1) {
                f16671e.decrementAndGet(this);
            }
        }
    }

    /* renamed from: d */
    private final int m17084d() {
        return f16669c.get(this) - f16670d.get(this);
    }

    /* renamed from: i */
    private final AbstractRunnableC4100h m17085i() {
        AbstractRunnableC4100h andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f16670d;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - f16669c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (andSet = this.f16672a.getAndSet(i11, null)) != null) {
                m17083c(andSet);
                return andSet;
            }
        }
    }

    /* renamed from: j */
    private final boolean m17086j(C4096d c4096d) {
        AbstractRunnableC4100h m17085i = m17085i();
        if (m17085i == null) {
            return false;
        }
        c4096d.m16782a(m17085i);
        return true;
    }

    /* renamed from: k */
    private final AbstractRunnableC4100h m17087k(boolean z10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AbstractRunnableC4100h abstractRunnableC4100h;
        do {
            atomicReferenceFieldUpdater = f16668b;
            abstractRunnableC4100h = (AbstractRunnableC4100h) atomicReferenceFieldUpdater.get(this);
            if (abstractRunnableC4100h != null) {
                if ((abstractRunnableC4100h.f16656o.mo17081b() == 1) == z10) {
                }
            }
            int i10 = f16670d.get(this);
            int i11 = f16669c.get(this);
            while (i10 != i11) {
                if (z10 && f16671e.get(this) == 0) {
                    return null;
                }
                i11--;
                AbstractRunnableC4100h m17089m = m17089m(i11, z10);
                if (m17089m != null) {
                    return m17089m;
                }
            }
            return null;
        } while (!C0540b.m2514a(atomicReferenceFieldUpdater, this, abstractRunnableC4100h, null));
        return abstractRunnableC4100h;
    }

    /* renamed from: l */
    private final AbstractRunnableC4100h m17088l(int i10) {
        int i11 = f16670d.get(this);
        int i12 = f16669c.get(this);
        boolean z10 = i10 == 1;
        while (i11 != i12) {
            if (z10 && f16671e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            AbstractRunnableC4100h m17089m = m17089m(i11, z10);
            if (m17089m != null) {
                return m17089m;
            }
            i11 = i13;
        }
        return null;
    }

    /* renamed from: m */
    private final AbstractRunnableC4100h m17089m(int i10, boolean z10) {
        int i11 = i10 & 127;
        AbstractRunnableC4100h abstractRunnableC4100h = this.f16672a.get(i11);
        if (abstractRunnableC4100h != null) {
            if ((abstractRunnableC4100h.f16656o.mo17081b() == 1) == z10 && this.f16672a.compareAndSet(i11, abstractRunnableC4100h, null)) {
                if (z10) {
                    f16671e.decrementAndGet(this);
                }
                return abstractRunnableC4100h;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object, nb.h] */
    /* renamed from: o */
    private final long m17090o(int i10, C3850o<AbstractRunnableC4100h> c3850o) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? r12;
        do {
            atomicReferenceFieldUpdater = f16668b;
            r12 = (AbstractRunnableC4100h) atomicReferenceFieldUpdater.get(this);
            if (r12 == 0) {
                return -2L;
            }
            if (((r12.f16656o.mo17081b() == 1 ? 1 : 2) & i10) == 0) {
                return -2L;
            }
            long mo17077a = C4104l.f16664f.mo17077a() - r12.f16655n;
            long j10 = C4104l.f16660b;
            if (mo17077a < j10) {
                return j10 - mo17077a;
            }
        } while (!C0540b.m2514a(atomicReferenceFieldUpdater, this, r12, null));
        c3850o.f15904n = r12;
        return -1L;
    }

    /* renamed from: a */
    public final AbstractRunnableC4100h m17091a(AbstractRunnableC4100h abstractRunnableC4100h, boolean z10) {
        if (z10) {
            return m17082b(abstractRunnableC4100h);
        }
        AbstractRunnableC4100h abstractRunnableC4100h2 = (AbstractRunnableC4100h) f16668b.getAndSet(this, abstractRunnableC4100h);
        if (abstractRunnableC4100h2 == null) {
            return null;
        }
        return m17082b(abstractRunnableC4100h2);
    }

    /* renamed from: e */
    public final int m17092e() {
        return f16668b.get(this) != null ? m17084d() + 1 : m17084d();
    }

    /* renamed from: f */
    public final void m17093f(C4096d c4096d) {
        AbstractRunnableC4100h abstractRunnableC4100h = (AbstractRunnableC4100h) f16668b.getAndSet(this, null);
        if (abstractRunnableC4100h != null) {
            c4096d.m16782a(abstractRunnableC4100h);
        }
        do {
        } while (m17086j(c4096d));
    }

    /* renamed from: g */
    public final AbstractRunnableC4100h m17094g() {
        AbstractRunnableC4100h abstractRunnableC4100h = (AbstractRunnableC4100h) f16668b.getAndSet(this, null);
        return abstractRunnableC4100h == null ? m17085i() : abstractRunnableC4100h;
    }

    /* renamed from: h */
    public final AbstractRunnableC4100h m17095h() {
        return m17087k(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public final long m17096n(int i10, C3850o<AbstractRunnableC4100h> c3850o) {
        T t10;
        if (i10 == 3) {
            t10 = m17085i();
        } else {
            t10 = m17088l(i10);
        }
        if (t10 != 0) {
            c3850o.f15904n = t10;
            return -1L;
        }
        return m17090o(i10, c3850o);
    }
}
