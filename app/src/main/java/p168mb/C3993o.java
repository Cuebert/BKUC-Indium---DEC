package p168mb;

import androidx.concurrent.futures.C0540b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C3844i;
import kotlin.jvm.internal.C3848m;
import p145kb.C3834z;

/* renamed from: mb.o */
/* loaded from: classes.dex */
public class C3993o {

    /* renamed from: n */
    private static final AtomicReferenceFieldUpdater f16395n = AtomicReferenceFieldUpdater.newUpdater(C3993o.class, Object.class, "_next");

    /* renamed from: o */
    private static final AtomicReferenceFieldUpdater f16396o = AtomicReferenceFieldUpdater.newUpdater(C3993o.class, Object.class, "_prev");

    /* renamed from: p */
    private static final AtomicReferenceFieldUpdater f16397p = AtomicReferenceFieldUpdater.newUpdater(C3993o.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* renamed from: mb.o$a */
    /* loaded from: classes.dex */
    public static abstract class a extends AbstractC3972b<C3993o> {

        /* renamed from: b */
        public final C3993o f16398b;

        /* renamed from: c */
        public C3993o f16399c;

        public a(C3993o c3993o) {
            this.f16398b = c3993o;
        }

        @Override // p168mb.AbstractC3972b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo16702b(C3993o c3993o, Object obj) {
            boolean z10 = obj == null;
            C3993o c3993o2 = z10 ? this.f16398b : this.f16399c;
            if (c3993o2 != null && C0540b.m2514a(C3993o.f16395n, c3993o, this, c3993o2) && z10) {
                C3993o c3993o3 = this.f16398b;
                C3993o c3993o4 = this.f16399c;
                C3844i.m16250c(c3993o4);
                c3993o3.m16772j(c3993o4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (androidx.concurrent.futures.C0540b.m2514a(r4, r3, r2, ((p168mb.C4001w) r5).f16416a) != false) goto L26;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p168mb.C3993o m16770h(p168mb.AbstractC4000v r9) {
        /*
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p168mb.C3993o.f16396o
            java.lang.Object r0 = r0.get(r8)
            mb.o r0 = (p168mb.C3993o) r0
            r1 = 0
            r2 = r0
        La:
            r3 = r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = p168mb.C3993o.f16395n
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L20
            if (r0 != r2) goto L16
            return r2
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p168mb.C3993o.f16396o
            boolean r0 = androidx.concurrent.futures.C0540b.m2514a(r1, r8, r0, r2)
            if (r0 != 0) goto L1f
            goto L0
        L1f:
            return r2
        L20:
            boolean r6 = r8.mo16765n()
            if (r6 == 0) goto L27
            return r1
        L27:
            if (r5 != r9) goto L2a
            return r2
        L2a:
            boolean r6 = r5 instanceof p168mb.AbstractC4000v
            if (r6 == 0) goto L34
            mb.v r5 = (p168mb.AbstractC4000v) r5
            r5.mo16701a(r2)
            goto L0
        L34:
            boolean r6 = r5 instanceof p168mb.C4001w
            if (r6 == 0) goto L50
            if (r3 == 0) goto L47
            mb.w r5 = (p168mb.C4001w) r5
            mb.o r5 = r5.f16416a
            boolean r2 = androidx.concurrent.futures.C0540b.m2514a(r4, r3, r2, r5)
            if (r2 != 0) goto L45
            goto L0
        L45:
            r2 = r3
            goto La
        L47:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = p168mb.C3993o.f16396o
            java.lang.Object r2 = r4.get(r2)
            mb.o r2 = (p168mb.C3993o) r2
            goto Lb
        L50:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.C3844i.m16251d(r5, r3)
            r3 = r5
            mb.o r3 = (p168mb.C3993o) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: p168mb.C3993o.m16770h(mb.v):mb.o");
    }

    /* renamed from: i */
    private final C3993o m16771i(C3993o c3993o) {
        while (c3993o.mo16765n()) {
            c3993o = (C3993o) f16396o.get(c3993o);
        }
        return c3993o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final void m16772j(C3993o c3993o) {
        C3993o c3993o2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16396o;
        do {
            c3993o2 = (C3993o) atomicReferenceFieldUpdater.get(c3993o);
            if (m16775k() != c3993o) {
                return;
            }
        } while (!C0540b.m2514a(f16396o, c3993o, c3993o2, this));
        if (mo16765n()) {
            c3993o.m16770h(null);
        }
    }

    /* renamed from: q */
    private final C4001w m16773q() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16397p;
        C4001w c4001w = (C4001w) atomicReferenceFieldUpdater.get(this);
        if (c4001w != null) {
            return c4001w;
        }
        C4001w c4001w2 = new C4001w(this);
        atomicReferenceFieldUpdater.lazySet(this, c4001w2);
        return c4001w2;
    }

    /* renamed from: g */
    public final boolean m16774g(C3993o c3993o) {
        f16396o.lazySet(c3993o, this);
        f16395n.lazySet(c3993o, this);
        while (m16775k() == this) {
            if (C0540b.m2514a(f16395n, this, this, c3993o)) {
                c3993o.m16772j(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public final Object m16775k() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16395n;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof AbstractC4000v)) {
                return obj;
            }
            ((AbstractC4000v) obj).mo16701a(this);
        }
    }

    /* renamed from: l */
    public final C3993o m16776l() {
        return C3992n.m16767b(m16775k());
    }

    /* renamed from: m */
    public final C3993o m16777m() {
        C3993o m16770h = m16770h(null);
        return m16770h == null ? m16771i((C3993o) f16396o.get(this)) : m16770h;
    }

    /* renamed from: n */
    public boolean mo16765n() {
        return m16775k() instanceof C4001w;
    }

    /* renamed from: o */
    public boolean m16778o() {
        return m16779p() == null;
    }

    /* renamed from: p */
    public final C3993o m16779p() {
        Object m16775k;
        C3993o c3993o;
        do {
            m16775k = m16775k();
            if (m16775k instanceof C4001w) {
                return ((C4001w) m16775k).f16416a;
            }
            if (m16775k == this) {
                return (C3993o) m16775k;
            }
            C3844i.m16251d(m16775k, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            c3993o = (C3993o) m16775k;
        } while (!C0540b.m2514a(f16395n, this, m16775k, c3993o.m16773q()));
        c3993o.m16770h(null);
        return null;
    }

    /* renamed from: r */
    public final int m16780r(C3993o c3993o, C3993o c3993o2, a aVar) {
        f16396o.lazySet(c3993o, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16395n;
        atomicReferenceFieldUpdater.lazySet(c3993o, c3993o2);
        aVar.f16399c = c3993o2;
        if (C0540b.m2514a(atomicReferenceFieldUpdater, this, c3993o2, aVar)) {
            return aVar.mo16701a(this) == null ? 1 : 2;
        }
        return 0;
    }

    public String toString() {
        return new C3848m(this) { // from class: mb.o.b
            @Override // p104hb.InterfaceC3457f
            public Object get() {
                return C3834z.m16239a(this.receiver);
            }
        } + '@' + C3834z.m16240b(this);
    }
}
