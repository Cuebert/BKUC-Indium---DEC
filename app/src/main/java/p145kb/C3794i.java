package p145kb;

import androidx.concurrent.futures.C0540b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C3844i;
import p051db.InterfaceC3041l;
import p145kb.InterfaceC3827v0;
import p168mb.AbstractC4004z;
import p168mb.C3982g;
import p253ta.C4746c;
import p253ta.C4755l;
import p290wa.C5486d;
import p303xa.InterfaceC5575d;
import va.InterfaceC4999c;
import va.InterfaceC5001e;

/* renamed from: kb.i */
/* loaded from: classes.dex */
public class C3794i<T> extends AbstractC3783e0<T> implements InterfaceC3791h<T>, InterfaceC5575d {

    /* renamed from: s */
    private static final AtomicIntegerFieldUpdater f15841s = AtomicIntegerFieldUpdater.newUpdater(C3794i.class, "_decisionAndIndex");

    /* renamed from: t */
    private static final AtomicReferenceFieldUpdater f15842t = AtomicReferenceFieldUpdater.newUpdater(C3794i.class, Object.class, "_state");

    /* renamed from: u */
    private static final AtomicReferenceFieldUpdater f15843u = AtomicReferenceFieldUpdater.newUpdater(C3794i.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: q */
    private final InterfaceC4999c<T> f15844q;

    /* renamed from: r */
    private final InterfaceC5001e f15845r;

    /* JADX WARN: Multi-variable type inference failed */
    public C3794i(InterfaceC4999c<? super T> interfaceC4999c, int i10) {
        super(i10);
        this.f15844q = interfaceC4999c;
        this.f15845r = interfaceC4999c.getContext();
        this._decisionAndIndex = 536870911;
        this._state = C3779d.f15832n;
    }

    /* renamed from: A */
    private final AbstractC3785f m16141A(InterfaceC3041l<? super Throwable, C4755l> interfaceC3041l) {
        return interfaceC3041l instanceof AbstractC3785f ? (AbstractC3785f) interfaceC3041l : new C3821s0(interfaceC3041l);
    }

    /* renamed from: B */
    private final void m16142B(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* renamed from: F */
    private final void m16143F(Object obj, int i10, InterfaceC3041l<? super Throwable, C4755l> interfaceC3041l) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15842t;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC3790g1) {
            } else {
                if (obj2 instanceof C3797j) {
                    C3797j c3797j = (C3797j) obj2;
                    if (c3797j.m16171c()) {
                        if (interfaceC3041l != null) {
                            m16163l(interfaceC3041l, c3797j.f15876a);
                            return;
                        }
                        return;
                    }
                }
                m16148j(obj);
                throw new C4746c();
            }
        } while (!C0540b.m2514a(f15842t, this, obj2, m16145H((InterfaceC3790g1) obj2, obj, i10, interfaceC3041l, null)));
        m16151q();
        m16152r(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: G */
    static /* synthetic */ void m16144G(C3794i c3794i, Object obj, int i10, InterfaceC3041l interfaceC3041l, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            interfaceC3041l = null;
        }
        c3794i.m16143F(obj, i10, interfaceC3041l);
    }

    /* renamed from: H */
    private final Object m16145H(InterfaceC3790g1 interfaceC3790g1, Object obj, int i10, InterfaceC3041l<? super Throwable, C4755l> interfaceC3041l, Object obj2) {
        if (obj instanceof C3814p) {
            return obj;
        }
        if (!C3786f0.m16131b(i10) && obj2 == null) {
            return obj;
        }
        if (interfaceC3041l == null && !(interfaceC3790g1 instanceof AbstractC3785f) && obj2 == null) {
            return obj;
        }
        return new C3812o(obj, interfaceC3790g1 instanceof AbstractC3785f ? (AbstractC3785f) interfaceC3790g1 : null, interfaceC3041l, obj2, null, 16, null);
    }

    /* renamed from: I */
    private final boolean m16146I() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15841s;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f15841s.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    /* renamed from: J */
    private final boolean m16147J() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15841s;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f15841s.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    /* renamed from: j */
    private final Void m16148j(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    /* renamed from: m */
    private final void m16149m(AbstractC4004z<?> abstractC4004z, Throwable th) {
        int i10 = f15841s.get(this) & 536870911;
        if (i10 != 536870911) {
            try {
                abstractC4004z.m16812a(i10, th, getContext());
                return;
            } catch (Throwable th2) {
                C3830x.m16235a(getContext(), new C3820s("Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
    }

    /* renamed from: o */
    private final boolean m16150o(Throwable th) {
        if (!m16157z()) {
            return false;
        }
        InterfaceC4999c<T> interfaceC4999c = this.f15844q;
        C3844i.m16251d(interfaceC4999c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C3982g) interfaceC4999c).m16732m(th);
    }

    /* renamed from: q */
    private final void m16151q() {
        if (m16157z()) {
            return;
        }
        m16165p();
    }

    /* renamed from: r */
    private final void m16152r(int i10) {
        if (m16146I()) {
            return;
        }
        C3786f0.m16130a(this, i10);
    }

    /* renamed from: t */
    private final InterfaceC3792h0 m16153t() {
        return (InterfaceC3792h0) f15843u.get(this);
    }

    /* renamed from: w */
    private final String m16154w() {
        Object m16168v = m16168v();
        return m16168v instanceof InterfaceC3790g1 ? "Active" : m16168v instanceof C3797j ? "Cancelled" : "Completed";
    }

    /* renamed from: x */
    private final InterfaceC3792h0 m16155x() {
        InterfaceC3827v0 interfaceC3827v0 = (InterfaceC3827v0) getContext().mo16094i(InterfaceC3827v0.f15887k);
        if (interfaceC3827v0 == null) {
            return null;
        }
        InterfaceC3792h0 m16233d = InterfaceC3827v0.a.m16233d(interfaceC3827v0, true, false, new C3800k(this), 2, null);
        C0540b.m2514a(f15843u, this, null, m16233d);
        return m16233d;
    }

    /* renamed from: y */
    private final void m16156y(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15842t;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C3779d) {
                if (C0540b.m2514a(f15842t, this, obj2, obj)) {
                    return;
                }
            } else {
                if (obj2 instanceof AbstractC3785f ? true : obj2 instanceof AbstractC4004z) {
                    m16142B(obj, obj2);
                } else {
                    boolean z10 = obj2 instanceof C3814p;
                    if (z10) {
                        C3814p c3814p = (C3814p) obj2;
                        if (!c3814p.m16218b()) {
                            m16142B(obj, obj2);
                        }
                        if (obj2 instanceof C3797j) {
                            if (!z10) {
                                c3814p = null;
                            }
                            Throwable th = c3814p != null ? c3814p.f15876a : null;
                            if (obj instanceof AbstractC3785f) {
                                m16162k((AbstractC3785f) obj, th);
                                return;
                            } else {
                                C3844i.m16251d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                m16149m((AbstractC4004z) obj, th);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj2 instanceof C3812o) {
                        C3812o c3812o = (C3812o) obj2;
                        if (c3812o.f15869b != null) {
                            m16142B(obj, obj2);
                        }
                        if (obj instanceof AbstractC4004z) {
                            return;
                        }
                        C3844i.m16251d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        AbstractC3785f abstractC3785f = (AbstractC3785f) obj;
                        if (c3812o.m16214c()) {
                            m16162k(abstractC3785f, c3812o.f15872e);
                            return;
                        } else {
                            if (C0540b.m2514a(f15842t, this, obj2, C3812o.m16212b(c3812o, null, abstractC3785f, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else {
                        if (obj instanceof AbstractC4004z) {
                            return;
                        }
                        C3844i.m16251d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (C0540b.m2514a(f15842t, this, obj2, new C3812o(obj2, (AbstractC3785f) obj, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: z */
    private final boolean m16157z() {
        if (C3786f0.m16132c(this.f15835p)) {
            InterfaceC4999c<T> interfaceC4999c = this.f15844q;
            C3844i.m16251d(interfaceC4999c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((C3982g) interfaceC4999c).m16731l()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    protected String m16158C() {
        return "CancellableContinuation";
    }

    /* renamed from: D */
    public final void m16159D(Throwable th) {
        if (m16150o(th)) {
            return;
        }
        m16164n(th);
        m16151q();
    }

    /* renamed from: E */
    public final void m16160E() {
        Throwable m16734o;
        InterfaceC4999c<T> interfaceC4999c = this.f15844q;
        C3982g c3982g = interfaceC4999c instanceof C3982g ? (C3982g) interfaceC4999c : null;
        if (c3982g == null || (m16734o = c3982g.m16734o(this)) == null) {
            return;
        }
        m16165p();
        m16164n(m16734o);
    }

    @Override // p303xa.InterfaceC5575d
    /* renamed from: a */
    public InterfaceC5575d mo16161a() {
        InterfaceC4999c<T> interfaceC4999c = this.f15844q;
        if (interfaceC4999c instanceof InterfaceC5575d) {
            return (InterfaceC5575d) interfaceC4999c;
        }
        return null;
    }

    @Override // p145kb.AbstractC3783e0
    /* renamed from: b */
    public void mo16124b(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15842t;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof InterfaceC3790g1)) {
                if (obj2 instanceof C3814p) {
                    return;
                }
                if (obj2 instanceof C3812o) {
                    C3812o c3812o = (C3812o) obj2;
                    if (!c3812o.m16214c()) {
                        if (C0540b.m2514a(f15842t, this, obj2, C3812o.m16212b(c3812o, null, null, null, null, th, 15, null))) {
                            c3812o.m16215d(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (C0540b.m2514a(f15842t, this, obj2, new C3812o(obj2, null, null, null, th, 14, null))) {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // p145kb.AbstractC3783e0
    /* renamed from: c */
    public final InterfaceC4999c<T> mo16125c() {
        return this.f15844q;
    }

    @Override // va.InterfaceC4999c
    /* renamed from: d */
    public void mo16028d(Object obj) {
        m16144G(this, C3822t.m16221c(obj, this), this.f15835p, null, 4, null);
    }

    @Override // p145kb.AbstractC3783e0
    /* renamed from: e */
    public Throwable mo16126e(Object obj) {
        Throwable mo16126e = super.mo16126e(obj);
        if (mo16126e != null) {
            return mo16126e;
        }
        return null;
    }

    @Override // p145kb.InterfaceC3791h
    /* renamed from: f */
    public void mo16140f(InterfaceC3041l<? super Throwable, C4755l> interfaceC3041l) {
        m16156y(m16141A(interfaceC3041l));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p145kb.AbstractC3783e0
    /* renamed from: g */
    public <T> T mo16127g(Object obj) {
        return obj instanceof C3812o ? (T) ((C3812o) obj).f15868a : obj;
    }

    @Override // va.InterfaceC4999c
    public InterfaceC5001e getContext() {
        return this.f15845r;
    }

    @Override // p145kb.AbstractC3783e0
    /* renamed from: i */
    public Object mo16129i() {
        return m16168v();
    }

    /* renamed from: k */
    public final void m16162k(AbstractC3785f abstractC3785f, Throwable th) {
        try {
            abstractC3785f.mo16136a(th);
        } catch (Throwable th2) {
            C3830x.m16235a(getContext(), new C3820s("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: l */
    public final void m16163l(InterfaceC3041l<? super Throwable, C4755l> interfaceC3041l, Throwable th) {
        try {
            interfaceC3041l.invoke(th);
        } catch (Throwable th2) {
            C3830x.m16235a(getContext(), new C3820s("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* renamed from: n */
    public boolean m16164n(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15842t;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC3790g1)) {
                return false;
            }
        } while (!C0540b.m2514a(f15842t, this, obj, new C3797j(this, th, (obj instanceof AbstractC3785f) || (obj instanceof AbstractC4004z))));
        InterfaceC3790g1 interfaceC3790g1 = (InterfaceC3790g1) obj;
        if (interfaceC3790g1 instanceof AbstractC3785f) {
            m16162k((AbstractC3785f) obj, th);
        } else if (interfaceC3790g1 instanceof AbstractC4004z) {
            m16149m((AbstractC4004z) obj, th);
        }
        m16151q();
        m16152r(this.f15835p);
        return true;
    }

    /* renamed from: p */
    public final void m16165p() {
        InterfaceC3792h0 m16153t = m16153t();
        if (m16153t == null) {
            return;
        }
        m16153t.mo16042b();
        f15843u.set(this, C3787f1.f15836n);
    }

    /* renamed from: s */
    public Throwable m16166s(InterfaceC3827v0 interfaceC3827v0) {
        return interfaceC3827v0.mo16086T();
    }

    public String toString() {
        return m16158C() + '(' + C3834z.m16241c(this.f15844q) + "){" + m16154w() + "}@" + C3834z.m16240b(this);
    }

    /* renamed from: u */
    public final Object m16167u() {
        InterfaceC3827v0 interfaceC3827v0;
        Object m20182b;
        boolean m16157z = m16157z();
        if (m16147J()) {
            if (m16153t() == null) {
                m16155x();
            }
            if (m16157z) {
                m16160E();
            }
            m20182b = C5486d.m20182b();
            return m20182b;
        }
        if (m16157z) {
            m16160E();
        }
        Object m16168v = m16168v();
        if (!(m16168v instanceof C3814p)) {
            if (C3786f0.m16131b(this.f15835p) && (interfaceC3827v0 = (InterfaceC3827v0) getContext().mo16094i(InterfaceC3827v0.f15887k)) != null && !interfaceC3827v0.mo16027c()) {
                CancellationException mo16086T = interfaceC3827v0.mo16086T();
                mo16124b(m16168v, mo16086T);
                throw mo16086T;
            }
            return mo16127g(m16168v);
        }
        throw ((C3814p) m16168v).f15876a;
    }

    /* renamed from: v */
    public final Object m16168v() {
        return f15842t.get(this);
    }
}
