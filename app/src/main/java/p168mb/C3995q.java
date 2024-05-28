package p168mb;

import androidx.concurrent.futures.C0540b;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C3840e;

/* renamed from: mb.q */
/* loaded from: classes.dex */
public final class C3995q<E> {

    /* renamed from: e */
    public static final a f16401e = new a(null);

    /* renamed from: f */
    private static final AtomicReferenceFieldUpdater f16402f = AtomicReferenceFieldUpdater.newUpdater(C3995q.class, Object.class, "_next");

    /* renamed from: g */
    private static final AtomicLongFieldUpdater f16403g = AtomicLongFieldUpdater.newUpdater(C3995q.class, "_state");

    /* renamed from: h */
    public static final C3971a0 f16404h = new C3971a0("REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a */
    private final int f16405a;

    /* renamed from: b */
    private final boolean f16406b;

    /* renamed from: c */
    private final int f16407c;

    /* renamed from: d */
    private final AtomicReferenceArray f16408d;

    /* renamed from: mb.q$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }

        /* renamed from: a */
        public final int m16797a(long j10) {
            return (j10 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: b */
        public final long m16798b(long j10, int i10) {
            return m16800d(j10, 1073741823L) | (i10 << 0);
        }

        /* renamed from: c */
        public final long m16799c(long j10, int i10) {
            return m16800d(j10, 1152921503533105152L) | (i10 << 30);
        }

        /* renamed from: d */
        public final long m16800d(long j10, long j11) {
            return j10 & (~j11);
        }
    }

    /* renamed from: mb.q$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f16409a;

        public b(int i10) {
            this.f16409a = i10;
        }
    }

    public C3995q(int i10, boolean z10) {
        this.f16405a = i10;
        this.f16406b = z10;
        int i11 = i10 - 1;
        this.f16407c = i11;
        this.f16408d = new AtomicReferenceArray(i10);
        if (!(i11 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i10 & i11) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private final C3995q<E> m16786b(long j10) {
        C3995q<E> c3995q = new C3995q<>(this.f16405a * 2, this.f16406b);
        int i10 = (int) ((1073741823 & j10) >> 0);
        int i11 = (int) ((1152921503533105152L & j10) >> 30);
        while (true) {
            int i12 = this.f16407c;
            if ((i10 & i12) != (i11 & i12)) {
                Object obj = this.f16408d.get(i12 & i10);
                if (obj == null) {
                    obj = new b(i10);
                }
                c3995q.f16408d.set(c3995q.f16407c & i10, obj);
                i10++;
            } else {
                f16403g.set(c3995q, f16401e.m16800d(j10, 1152921504606846976L));
                return c3995q;
            }
        }
    }

    /* renamed from: c */
    private final C3995q<E> m16787c(long j10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16402f;
        while (true) {
            C3995q<E> c3995q = (C3995q) atomicReferenceFieldUpdater.get(this);
            if (c3995q != null) {
                return c3995q;
            }
            C0540b.m2514a(f16402f, this, null, m16786b(j10));
        }
    }

    /* renamed from: e */
    private final C3995q<E> m16788e(int i10, E e10) {
        Object obj = this.f16408d.get(this.f16407c & i10);
        if (!(obj instanceof b) || ((b) obj).f16409a != i10) {
            return null;
        }
        this.f16408d.set(i10 & this.f16407c, e10);
        return this;
    }

    /* renamed from: h */
    private final long m16789h() {
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16403g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                return j10;
            }
            j11 = j10 | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j11));
        return j11;
    }

    /* renamed from: k */
    private final C3995q<E> m16790k(int i10, int i11) {
        long j10;
        a aVar;
        int i12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16403g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            aVar = f16401e;
            i12 = (int) ((1073741823 & j10) >> 0);
            if ((1152921504606846976L & j10) != 0) {
                return m16795i();
            }
        } while (!f16403g.compareAndSet(this, j10, aVar.m16798b(j10, i11)));
        this.f16408d.set(this.f16407c & i12, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0052, code lost:
    
        return 1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m16791a(E r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p168mb.C3995q.f16403g
        L2:
            long r3 = r0.get(r14)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 == 0) goto L16
            mb.q$a r15 = p168mb.C3995q.f16401e
            int r15 = r15.m16797a(r3)
            return r15
        L16:
            mb.q$a r1 = p168mb.C3995q.f16401e
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            r9 = 0
            long r5 = r5 >> r9
            int r2 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r10 = 30
            long r5 = r5 >> r10
            int r10 = (int) r5
            int r11 = r14.f16407c
            int r5 = r10 + 2
            r5 = r5 & r11
            r6 = r2 & r11
            r12 = 1
            if (r5 != r6) goto L34
            return r12
        L34:
            boolean r5 = r14.f16406b
            r6 = 1073741823(0x3fffffff, float:1.9999999)
            if (r5 != 0) goto L53
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r14.f16408d
            r13 = r10 & r11
            java.lang.Object r5 = r5.get(r13)
            if (r5 == 0) goto L53
            int r1 = r14.f16405a
            r3 = 1024(0x400, float:1.435E-42)
            if (r1 < r3) goto L52
            int r10 = r10 - r2
            r2 = r10 & r6
            int r1 = r1 >> 1
            if (r2 <= r1) goto L2
        L52:
            return r12
        L53:
            int r2 = r10 + 1
            r2 = r2 & r6
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = p168mb.C3995q.f16403g
            long r12 = r1.m16799c(r3, r2)
            r1 = r5
            r2 = r14
            r5 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L2
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r14.f16408d
            r1 = r10 & r11
            r0.set(r1, r15)
            r0 = r14
        L6d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = p168mb.C3995q.f16403g
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L84
            mb.q r0 = r0.m16795i()
            mb.q r0 = r0.m16788e(r10, r15)
            if (r0 != 0) goto L6d
        L84:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p168mb.C3995q.m16791a(java.lang.Object):int");
    }

    /* renamed from: d */
    public final boolean m16792d() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16403g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j10 | 2305843009213693952L));
        return true;
    }

    /* renamed from: f */
    public final int m16793f() {
        long j10 = f16403g.get(this);
        return 1073741823 & (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j10) >> 0)));
    }

    /* renamed from: g */
    public final boolean m16794g() {
        long j10 = f16403g.get(this);
        return ((int) ((1073741823 & j10) >> 0)) == ((int) ((j10 & 1152921503533105152L) >> 30));
    }

    /* renamed from: i */
    public final C3995q<E> m16795i() {
        return m16787c(m16789h());
    }

    /* renamed from: j */
    public final Object m16796j() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16403g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j10) != 0) {
                return f16404h;
            }
            a aVar = f16401e;
            int i10 = (int) ((1073741823 & j10) >> 0);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.f16407c;
            if ((i11 & i12) == (i10 & i12)) {
                return null;
            }
            Object obj = this.f16408d.get(i12 & i10);
            if (obj == null) {
                if (this.f16406b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i13 = (i10 + 1) & 1073741823;
                if (f16403g.compareAndSet(this, j10, aVar.m16798b(j10, i13))) {
                    this.f16408d.set(this.f16407c & i10, null);
                    return obj;
                }
                if (this.f16406b) {
                    C3995q<E> c3995q = this;
                    do {
                        c3995q = c3995q.m16790k(i10, i13);
                    } while (c3995q != null);
                    return obj;
                }
            }
        }
    }
}
