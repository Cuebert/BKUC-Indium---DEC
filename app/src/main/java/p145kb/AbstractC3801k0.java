package p145kb;

import androidx.concurrent.futures.C0540b;
import gb.C3328f;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C3844i;
import p168mb.C3971a0;
import p168mb.C3983g0;
import p168mb.C3995q;
import p168mb.InterfaceC3985h0;
import p253ta.C4755l;
import va.InterfaceC5001e;

/* renamed from: kb.k0 */
/* loaded from: classes.dex */
public abstract class AbstractC3801k0 extends AbstractC3804l0 implements InterfaceC3777c0 {

    /* renamed from: s */
    private static final AtomicReferenceFieldUpdater f15854s = AtomicReferenceFieldUpdater.newUpdater(AbstractC3801k0.class, Object.class, "_queue");

    /* renamed from: t */
    private static final AtomicReferenceFieldUpdater f15855t = AtomicReferenceFieldUpdater.newUpdater(AbstractC3801k0.class, Object.class, "_delayed");

    /* renamed from: u */
    private static final AtomicIntegerFieldUpdater f15856u = AtomicIntegerFieldUpdater.newUpdater(AbstractC3801k0.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    /* renamed from: kb.k0$a */
    /* loaded from: classes.dex */
    public static abstract class a implements Runnable, Comparable<a>, InterfaceC3792h0, InterfaceC3985h0 {
        private volatile Object _heap;

        /* renamed from: n */
        public long f15857n;

        /* renamed from: o */
        private int f15858o;

        @Override // p145kb.InterfaceC3792h0
        /* renamed from: b */
        public final void mo16042b() {
            C3971a0 c3971a0;
            C3971a0 c3971a02;
            synchronized (this) {
                Object obj = this._heap;
                c3971a0 = C3810n0.f15864a;
                if (obj == c3971a0) {
                    return;
                }
                b bVar = obj instanceof b ? (b) obj : null;
                if (bVar != null) {
                    bVar.m16745g(this);
                }
                c3971a02 = C3810n0.f15864a;
                this._heap = c3971a02;
                C4755l c4755l = C4755l.f18582a;
            }
        }

        @Override // p168mb.InterfaceC3985h0
        /* renamed from: c */
        public void mo16198c(int i10) {
            this.f15858o = i10;
        }

        @Override // p168mb.InterfaceC3985h0
        /* renamed from: d */
        public int mo16199d() {
            return this.f15858o;
        }

        @Override // p168mb.InterfaceC3985h0
        /* renamed from: f */
        public C3983g0<?> mo16200f() {
            Object obj = this._heap;
            if (obj instanceof C3983g0) {
                return (C3983g0) obj;
            }
            return null;
        }

        @Override // p168mb.InterfaceC3985h0
        /* renamed from: g */
        public void mo16201g(C3983g0<?> c3983g0) {
            C3971a0 c3971a0;
            Object obj = this._heap;
            c3971a0 = C3810n0.f15864a;
            if (obj != c3971a0) {
                this._heap = c3983g0;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // java.lang.Comparable
        /* renamed from: h */
        public int compareTo(a aVar) {
            long j10 = this.f15857n - aVar.f15857n;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        /* renamed from: i */
        public final int m16203i(long j10, b bVar, AbstractC3801k0 abstractC3801k0) {
            C3971a0 c3971a0;
            synchronized (this) {
                Object obj = this._heap;
                c3971a0 = C3810n0.f15864a;
                if (obj == c3971a0) {
                    return 2;
                }
                synchronized (bVar) {
                    a m16741b = bVar.m16741b();
                    if (abstractC3801k0.m16186D0()) {
                        return 1;
                    }
                    if (m16741b == null) {
                        bVar.f15859c = j10;
                    } else {
                        long j11 = m16741b.f15857n;
                        if (j11 - j10 < 0) {
                            j10 = j11;
                        }
                        if (j10 - bVar.f15859c > 0) {
                            bVar.f15859c = j10;
                        }
                    }
                    long j12 = this.f15857n;
                    long j13 = bVar.f15859c;
                    if (j12 - j13 < 0) {
                        this.f15857n = j13;
                    }
                    bVar.m16740a(this);
                    return 0;
                }
            }
        }

        /* renamed from: j */
        public final boolean m16204j(long j10) {
            return j10 - this.f15857n >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f15857n + ']';
        }
    }

    /* renamed from: kb.k0$b */
    /* loaded from: classes.dex */
    public static final class b extends C3983g0<a> {

        /* renamed from: c */
        public long f15859c;

        public b(long j10) {
            this.f15859c = j10;
        }
    }

    /* renamed from: A0 */
    private final Runnable m16184A0() {
        C3971a0 c3971a0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15854s;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof C3995q) {
                C3844i.m16251d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                C3995q c3995q = (C3995q) obj;
                Object m16796j = c3995q.m16796j();
                if (m16796j != C3995q.f16404h) {
                    return (Runnable) m16796j;
                }
                C0540b.m2514a(f15854s, this, obj, c3995q.m16795i());
            } else {
                c3971a0 = C3810n0.f15865b;
                if (obj == c3971a0) {
                    return null;
                }
                if (C0540b.m2514a(f15854s, this, obj, null)) {
                    C3844i.m16251d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    /* renamed from: C0 */
    private final boolean m16185C0(Runnable runnable) {
        C3971a0 c3971a0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15854s;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (m16186D0()) {
                return false;
            }
            if (obj == null) {
                if (C0540b.m2514a(f15854s, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C3995q) {
                C3844i.m16251d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                C3995q c3995q = (C3995q) obj;
                int m16791a = c3995q.m16791a(runnable);
                if (m16791a == 0) {
                    return true;
                }
                if (m16791a == 1) {
                    C0540b.m2514a(f15854s, this, obj, c3995q.m16795i());
                } else if (m16791a == 2) {
                    return false;
                }
            } else {
                c3971a0 = C3810n0.f15865b;
                if (obj == c3971a0) {
                    return false;
                }
                C3995q c3995q2 = new C3995q(8, true);
                C3844i.m16251d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                c3995q2.m16791a((Runnable) obj);
                c3995q2.m16791a(runnable);
                if (C0540b.m2514a(f15854s, this, obj, c3995q2)) {
                    return true;
                }
            }
        }
    }

    /* renamed from: D0 */
    public final boolean m16186D0() {
        return f15856u.get(this) != 0;
    }

    /* renamed from: G0 */
    private final void m16187G0() {
        a m16747i;
        C3776c.m16114a();
        long nanoTime = System.nanoTime();
        while (true) {
            b bVar = (b) f15855t.get(this);
            if (bVar == null || (m16747i = bVar.m16747i()) == null) {
                return;
            } else {
                mo16041w0(nanoTime, m16747i);
            }
        }
    }

    /* renamed from: J0 */
    private final int m16188J0(long j10, a aVar) {
        if (m16186D0()) {
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15855t;
        b bVar = (b) atomicReferenceFieldUpdater.get(this);
        if (bVar == null) {
            C0540b.m2514a(atomicReferenceFieldUpdater, this, null, new b(j10));
            Object obj = atomicReferenceFieldUpdater.get(this);
            C3844i.m16250c(obj);
            bVar = (b) obj;
        }
        return aVar.m16203i(j10, bVar, this);
    }

    /* renamed from: K0 */
    private final void m16189K0(boolean z10) {
        f15856u.set(this, z10 ? 1 : 0);
    }

    /* renamed from: L0 */
    private final boolean m16190L0(a aVar) {
        b bVar = (b) f15855t.get(this);
        return (bVar != null ? bVar.m16744e() : null) == aVar;
    }

    /* renamed from: z0 */
    private final void m16192z0() {
        C3971a0 c3971a0;
        C3971a0 c3971a02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15854s;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f15854s;
                c3971a0 = C3810n0.f15865b;
                if (C0540b.m2514a(atomicReferenceFieldUpdater2, this, null, c3971a0)) {
                    return;
                }
            } else {
                if (obj instanceof C3995q) {
                    ((C3995q) obj).m16792d();
                    return;
                }
                c3971a02 = C3810n0.f15865b;
                if (obj == c3971a02) {
                    return;
                }
                C3995q c3995q = new C3995q(8, true);
                C3844i.m16251d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                c3995q.m16791a((Runnable) obj);
                if (C0540b.m2514a(f15854s, this, obj, c3995q)) {
                    return;
                }
            }
        }
    }

    /* renamed from: B0 */
    public void mo16039B0(Runnable runnable) {
        if (m16185C0(runnable)) {
            m16206x0();
        } else {
            RunnableC3771a0.f15808v.mo16039B0(runnable);
        }
    }

    /* renamed from: E0 */
    public boolean m16193E0() {
        C3971a0 c3971a0;
        if (!m16179t0()) {
            return false;
        }
        b bVar = (b) f15855t.get(this);
        if (bVar != null && !bVar.m16743d()) {
            return false;
        }
        Object obj = f15854s.get(this);
        if (obj != null) {
            if (obj instanceof C3995q) {
                return ((C3995q) obj).m16794g();
            }
            c3971a0 = C3810n0.f15865b;
            if (obj != c3971a0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: F0 */
    public long m16194F0() {
        a aVar;
        if (m16180u0()) {
            return 0L;
        }
        b bVar = (b) f15855t.get(this);
        if (bVar != null && !bVar.m16743d()) {
            C3776c.m16114a();
            long nanoTime = System.nanoTime();
            do {
                synchronized (bVar) {
                    a m16741b = bVar.m16741b();
                    if (m16741b != null) {
                        a aVar2 = m16741b;
                        aVar = aVar2.m16204j(nanoTime) ? m16185C0(aVar2) : false ? bVar.m16746h(0) : null;
                    }
                }
            } while (aVar != null);
        }
        Runnable m16184A0 = m16184A0();
        if (m16184A0 != null) {
            m16184A0.run();
            return 0L;
        }
        return mo16176p0();
    }

    /* renamed from: H0 */
    public final void m16195H0() {
        f15854s.set(this, null);
        f15855t.set(this, null);
    }

    /* renamed from: I0 */
    public final void m16196I0(long j10, a aVar) {
        int m16188J0 = m16188J0(j10, aVar);
        if (m16188J0 == 0) {
            if (m16190L0(aVar)) {
                m16206x0();
            }
        } else if (m16188J0 == 1) {
            mo16041w0(j10, aVar);
        } else if (m16188J0 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    @Override // p145kb.AbstractC3826v
    /* renamed from: j0 */
    public final void mo16197j0(InterfaceC5001e interfaceC5001e, Runnable runnable) {
        mo16039B0(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p145kb.AbstractC3798j0
    /* renamed from: p0 */
    public long mo16176p0() {
        a m16744e;
        long m14623b;
        C3971a0 c3971a0;
        if (super.mo16176p0() == 0) {
            return 0L;
        }
        Object obj = f15854s.get(this);
        if (obj != null) {
            if (!(obj instanceof C3995q)) {
                c3971a0 = C3810n0.f15865b;
                return obj == c3971a0 ? Long.MAX_VALUE : 0L;
            }
            if (!((C3995q) obj).m16794g()) {
                return 0L;
            }
        }
        b bVar = (b) f15855t.get(this);
        if (bVar == null || (m16744e = bVar.m16744e()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = m16744e.f15857n;
        C3776c.m16114a();
        m14623b = C3328f.m14623b(j10 - System.nanoTime(), 0L);
        return m14623b;
    }

    @Override // p145kb.AbstractC3798j0
    public void shutdown() {
        C3799j1.f15851a.m16182b();
        m16189K0(true);
        m16192z0();
        do {
        } while (m16194F0() <= 0);
        m16187G0();
    }
}
