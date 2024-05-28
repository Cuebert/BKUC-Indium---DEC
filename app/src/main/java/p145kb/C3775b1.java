package p145kb;

import androidx.concurrent.futures.C0540b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C3844i;
import kotlin.jvm.internal.C3850o;
import p051db.InterfaceC3041l;
import p051db.InterfaceC3045p;
import p145kb.InterfaceC3827v0;
import p168mb.AbstractC4000v;
import p168mb.C3971a0;
import p168mb.C3992n;
import p168mb.C3993o;
import p253ta.C4745b;
import p253ta.C4755l;
import va.InterfaceC5001e;

/* renamed from: kb.b1 */
/* loaded from: classes.dex */
public class C3775b1 implements InterfaceC3827v0, InterfaceC3809n, InterfaceC3793h1 {

    /* renamed from: n */
    private static final AtomicReferenceFieldUpdater f15813n = AtomicReferenceFieldUpdater.newUpdater(C3775b1.class, Object.class, "_state");

    /* renamed from: o */
    private static final AtomicReferenceFieldUpdater f15814o = AtomicReferenceFieldUpdater.newUpdater(C3775b1.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: kb.b1$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC3772a1 {

        /* renamed from: r */
        private final C3775b1 f15815r;

        /* renamed from: s */
        private final b f15816s;

        /* renamed from: t */
        private final C3806m f15817t;

        /* renamed from: u */
        private final Object f15818u;

        public a(C3775b1 c3775b1, b bVar, C3806m c3806m, Object obj) {
            this.f15815r = c3775b1;
            this.f15816s = bVar;
            this.f15817t = c3806m;
            this.f15818u = obj;
        }

        @Override // p051db.InterfaceC3041l
        public /* bridge */ /* synthetic */ C4755l invoke(Throwable th) {
            mo16100s(th);
            return C4755l.f18582a;
        }

        @Override // p145kb.AbstractC3818r
        /* renamed from: s */
        public void mo16100s(Throwable th) {
            this.f15815r.m16072u(this.f15816s, this.f15817t, this.f15818u);
        }
    }

    /* renamed from: kb.b1$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC3817q0 {

        /* renamed from: o */
        private static final AtomicIntegerFieldUpdater f15819o = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isCompleting");

        /* renamed from: p */
        private static final AtomicReferenceFieldUpdater f15820p = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_rootCause");

        /* renamed from: q */
        private static final AtomicReferenceFieldUpdater f15821q = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_exceptionsHolder");
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* renamed from: n */
        private final C3784e1 f15822n;

        public b(C3784e1 c3784e1, boolean z10, Throwable th) {
            this.f15822n = c3784e1;
            this._isCompleting = z10 ? 1 : 0;
            this._rootCause = th;
        }

        /* renamed from: b */
        private final ArrayList<Throwable> m16101b() {
            return new ArrayList<>(4);
        }

        /* renamed from: e */
        private final Object m16102e() {
            return f15821q.get(this);
        }

        /* renamed from: l */
        private final void m16103l(Object obj) {
            f15821q.set(this, obj);
        }

        /* renamed from: a */
        public final void m16104a(Throwable th) {
            Throwable m16105f = m16105f();
            if (m16105f == null) {
                m16111m(th);
                return;
            }
            if (th == m16105f) {
                return;
            }
            Object m16102e = m16102e();
            if (m16102e == null) {
                m16103l(th);
                return;
            }
            if (m16102e instanceof Throwable) {
                if (th == m16102e) {
                    return;
                }
                ArrayList<Throwable> m16101b = m16101b();
                m16101b.add(m16102e);
                m16101b.add(th);
                m16103l(m16101b);
                return;
            }
            if (m16102e instanceof ArrayList) {
                ((ArrayList) m16102e).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + m16102e).toString());
        }

        @Override // p145kb.InterfaceC3817q0
        /* renamed from: c */
        public boolean mo16043c() {
            return m16105f() == null;
        }

        @Override // p145kb.InterfaceC3817q0
        /* renamed from: d */
        public C3784e1 mo16044d() {
            return this.f15822n;
        }

        /* renamed from: f */
        public final Throwable m16105f() {
            return (Throwable) f15820p.get(this);
        }

        /* renamed from: g */
        public final boolean m16106g() {
            return m16105f() != null;
        }

        /* renamed from: h */
        public final boolean m16107h() {
            return f15819o.get(this) != 0;
        }

        /* renamed from: i */
        public final boolean m16108i() {
            C3971a0 c3971a0;
            Object m16102e = m16102e();
            c3971a0 = C3778c1.f15829e;
            return m16102e == c3971a0;
        }

        /* renamed from: j */
        public final List<Throwable> m16109j(Throwable th) {
            ArrayList<Throwable> arrayList;
            C3971a0 c3971a0;
            Object m16102e = m16102e();
            if (m16102e == null) {
                arrayList = m16101b();
            } else if (m16102e instanceof Throwable) {
                ArrayList<Throwable> m16101b = m16101b();
                m16101b.add(m16102e);
                arrayList = m16101b;
            } else {
                if (!(m16102e instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + m16102e).toString());
                }
                arrayList = (ArrayList) m16102e;
            }
            Throwable m16105f = m16105f();
            if (m16105f != null) {
                arrayList.add(0, m16105f);
            }
            if (th != null && !C3844i.m16248a(th, m16105f)) {
                arrayList.add(th);
            }
            c3971a0 = C3778c1.f15829e;
            m16103l(c3971a0);
            return arrayList;
        }

        /* renamed from: k */
        public final void m16110k(boolean z10) {
            f15819o.set(this, z10 ? 1 : 0);
        }

        /* renamed from: m */
        public final void m16111m(Throwable th) {
            f15820p.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + m16106g() + ", completing=" + m16107h() + ", rootCause=" + m16105f() + ", exceptions=" + m16102e() + ", list=" + mo16044d() + ']';
        }
    }

    /* renamed from: kb.b1$c */
    /* loaded from: classes.dex */
    public static final class c extends C3993o.a {

        /* renamed from: d */
        final /* synthetic */ C3775b1 f15823d;

        /* renamed from: e */
        final /* synthetic */ Object f15824e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C3993o c3993o, C3775b1 c3775b1, Object obj) {
            super(c3993o);
            this.f15823d = c3775b1;
            this.f15824e = obj;
        }

        @Override // p168mb.AbstractC3972b
        /* renamed from: f */
        public Object mo16112d(C3993o c3993o) {
            if (this.f15823d.m16080F() == this.f15824e) {
                return null;
            }
            return C3992n.m16766a();
        }
    }

    /* renamed from: A */
    private final Throwable m16049A(b bVar, List<? extends Throwable> list) {
        Object obj = null;
        if (list.isEmpty()) {
            if (bVar.m16106g()) {
                return new C3829w0(mo16032r(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                obj = next;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        return th != null ? th : list.get(0);
    }

    /* renamed from: D */
    private final C3784e1 m16050D(InterfaceC3817q0 interfaceC3817q0) {
        C3784e1 mo16044d = interfaceC3817q0.mo16044d();
        if (mo16044d != null) {
            return mo16044d;
        }
        if (interfaceC3817q0 instanceof C3795i0) {
            return new C3784e1();
        }
        if (interfaceC3817q0 instanceof AbstractC3772a1) {
            m16057Z((AbstractC3772a1) interfaceC3817q0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC3817q0).toString());
    }

    /* renamed from: J */
    private final Object m16051J(Object obj) {
        C3971a0 c3971a0;
        C3971a0 c3971a02;
        C3971a0 c3971a03;
        C3971a0 c3971a04;
        C3971a0 c3971a05;
        C3971a0 c3971a06;
        Throwable th = null;
        while (true) {
            Object m16080F = m16080F();
            if (m16080F instanceof b) {
                synchronized (m16080F) {
                    if (((b) m16080F).m16108i()) {
                        c3971a02 = C3778c1.f15828d;
                        return c3971a02;
                    }
                    boolean m16106g = ((b) m16080F).m16106g();
                    if (obj != null || !m16106g) {
                        if (th == null) {
                            th = m16073v(obj);
                        }
                        ((b) m16080F).m16104a(th);
                    }
                    Throwable m16105f = m16106g ^ true ? ((b) m16080F).m16105f() : null;
                    if (m16105f != null) {
                        m16054P(((b) m16080F).mo16044d(), m16105f);
                    }
                    c3971a0 = C3778c1.f15825a;
                    return c3971a0;
                }
            }
            if (m16080F instanceof InterfaceC3817q0) {
                if (th == null) {
                    th = m16073v(obj);
                }
                InterfaceC3817q0 interfaceC3817q0 = (InterfaceC3817q0) m16080F;
                if (interfaceC3817q0.mo16043c()) {
                    if (m16063i0(interfaceC3817q0, th)) {
                        c3971a04 = C3778c1.f15825a;
                        return c3971a04;
                    }
                } else {
                    Object m16065j0 = m16065j0(m16080F, new C3814p(th, false, 2, null));
                    c3971a05 = C3778c1.f15825a;
                    if (m16065j0 != c3971a05) {
                        c3971a06 = C3778c1.f15827c;
                        if (m16065j0 != c3971a06) {
                            return m16065j0;
                        }
                    } else {
                        throw new IllegalStateException(("Cannot happen in " + m16080F).toString());
                    }
                }
            } else {
                c3971a03 = C3778c1.f15828d;
                return c3971a03;
            }
        }
    }

    /* renamed from: L */
    private final AbstractC3772a1 m16052L(InterfaceC3041l<? super Throwable, C4755l> interfaceC3041l, boolean z10) {
        AbstractC3772a1 abstractC3772a1;
        if (z10) {
            abstractC3772a1 = interfaceC3041l instanceof AbstractC3831x0 ? (AbstractC3831x0) interfaceC3041l : null;
            if (abstractC3772a1 == null) {
                abstractC3772a1 = new C3823t0(interfaceC3041l);
            }
        } else {
            abstractC3772a1 = interfaceC3041l instanceof AbstractC3772a1 ? (AbstractC3772a1) interfaceC3041l : null;
            if (abstractC3772a1 == null) {
                abstractC3772a1 = new C3825u0(interfaceC3041l);
            }
        }
        abstractC3772a1.m16046u(this);
        return abstractC3772a1;
    }

    /* renamed from: N */
    private final C3806m m16053N(C3993o c3993o) {
        while (c3993o.mo16765n()) {
            c3993o = c3993o.m16777m();
        }
        while (true) {
            c3993o = c3993o.m16776l();
            if (!c3993o.mo16765n()) {
                if (c3993o instanceof C3806m) {
                    return (C3806m) c3993o;
                }
                if (c3993o instanceof C3784e1) {
                    return null;
                }
            }
        }
    }

    /* renamed from: P */
    private final void m16054P(C3784e1 c3784e1, Throwable th) {
        m16085S(th);
        Object m16775k = c3784e1.m16775k();
        C3844i.m16251d(m16775k, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C3820s c3820s = null;
        for (C3993o c3993o = (C3993o) m16775k; !C3844i.m16248a(c3993o, c3784e1); c3993o = c3993o.m16776l()) {
            if (c3993o instanceof AbstractC3831x0) {
                AbstractC3772a1 abstractC3772a1 = (AbstractC3772a1) c3993o;
                try {
                    abstractC3772a1.mo16100s(th);
                } catch (Throwable th2) {
                    if (c3820s != null) {
                        C4745b.m18896a(c3820s, th2);
                    } else {
                        c3820s = new C3820s("Exception in completion handler " + abstractC3772a1 + " for " + this, th2);
                        C4755l c4755l = C4755l.f18582a;
                    }
                }
            }
        }
        if (c3820s != null) {
            mo16024H(c3820s);
        }
        m16070q(th);
    }

    /* renamed from: R */
    private final void m16055R(C3784e1 c3784e1, Throwable th) {
        Object m16775k = c3784e1.m16775k();
        C3844i.m16251d(m16775k, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C3820s c3820s = null;
        for (C3993o c3993o = (C3993o) m16775k; !C3844i.m16248a(c3993o, c3784e1); c3993o = c3993o.m16776l()) {
            if (c3993o instanceof AbstractC3772a1) {
                AbstractC3772a1 abstractC3772a1 = (AbstractC3772a1) c3993o;
                try {
                    abstractC3772a1.mo16100s(th);
                } catch (Throwable th2) {
                    if (c3820s != null) {
                        C4745b.m18896a(c3820s, th2);
                    } else {
                        c3820s = new C3820s("Exception in completion handler " + abstractC3772a1 + " for " + this, th2);
                        C4755l c4755l = C4755l.f18582a;
                    }
                }
            }
        }
        if (c3820s != null) {
            mo16024H(c3820s);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kb.p0] */
    /* renamed from: V */
    private final void m16056V(C3795i0 c3795i0) {
        C3784e1 c3784e1 = new C3784e1();
        if (!c3795i0.mo16043c()) {
            c3784e1 = new C3815p0(c3784e1);
        }
        C0540b.m2514a(f15813n, this, c3795i0, c3784e1);
    }

    /* renamed from: Z */
    private final void m16057Z(AbstractC3772a1 abstractC3772a1) {
        abstractC3772a1.m16774g(new C3784e1());
        C0540b.m2514a(f15813n, this, abstractC3772a1, abstractC3772a1.m16776l());
    }

    /* renamed from: c0 */
    private final String m16058c0(Object obj) {
        if (!(obj instanceof b)) {
            return obj instanceof InterfaceC3817q0 ? ((InterfaceC3817q0) obj).mo16043c() ? "Active" : "New" : obj instanceof C3814p ? "Cancelled" : "Completed";
        }
        b bVar = (b) obj;
        return bVar.m16106g() ? "Cancelling" : bVar.m16107h() ? "Completing" : "Active";
    }

    /* renamed from: f0 */
    public static /* synthetic */ CancellationException m16059f0(C3775b1 c3775b1, Throwable th, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return c3775b1.m16091d0(th, str);
    }

    /* renamed from: h0 */
    private final boolean m16062h0(InterfaceC3817q0 interfaceC3817q0, Object obj) {
        if (!C0540b.m2514a(f15813n, this, interfaceC3817q0, C3778c1.m16120f(obj))) {
            return false;
        }
        m16085S(null);
        mo16026U(obj);
        m16071t(interfaceC3817q0, obj);
        return true;
    }

    /* renamed from: i0 */
    private final boolean m16063i0(InterfaceC3817q0 interfaceC3817q0, Throwable th) {
        C3784e1 m16050D = m16050D(interfaceC3817q0);
        if (m16050D == null) {
            return false;
        }
        if (!C0540b.m2514a(f15813n, this, interfaceC3817q0, new b(m16050D, false, th))) {
            return false;
        }
        m16054P(m16050D, th);
        return true;
    }

    /* renamed from: j */
    private final boolean m16064j(Object obj, C3784e1 c3784e1, AbstractC3772a1 abstractC3772a1) {
        int m16780r;
        c cVar = new c(abstractC3772a1, this, obj);
        do {
            m16780r = c3784e1.m16777m().m16780r(abstractC3772a1, c3784e1, cVar);
            if (m16780r == 1) {
                return true;
            }
        } while (m16780r != 2);
        return false;
    }

    /* renamed from: j0 */
    private final Object m16065j0(Object obj, Object obj2) {
        C3971a0 c3971a0;
        C3971a0 c3971a02;
        if (!(obj instanceof InterfaceC3817q0)) {
            c3971a02 = C3778c1.f15825a;
            return c3971a02;
        }
        if (((obj instanceof C3795i0) || (obj instanceof AbstractC3772a1)) && !(obj instanceof C3806m) && !(obj2 instanceof C3814p)) {
            if (m16062h0((InterfaceC3817q0) obj, obj2)) {
                return obj2;
            }
            c3971a0 = C3778c1.f15827c;
            return c3971a0;
        }
        return m16067k0((InterfaceC3817q0) obj, obj2);
    }

    /* renamed from: k */
    private final void m16066k(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th2 : list) {
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                C4745b.m18896a(th, th2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable, T] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* renamed from: k0 */
    private final Object m16067k0(InterfaceC3817q0 interfaceC3817q0, Object obj) {
        C3971a0 c3971a0;
        C3971a0 c3971a02;
        C3971a0 c3971a03;
        C3784e1 m16050D = m16050D(interfaceC3817q0);
        if (m16050D == null) {
            c3971a03 = C3778c1.f15827c;
            return c3971a03;
        }
        b bVar = interfaceC3817q0 instanceof b ? (b) interfaceC3817q0 : null;
        if (bVar == null) {
            bVar = new b(m16050D, false, null);
        }
        C3850o c3850o = new C3850o();
        synchronized (bVar) {
            if (bVar.m16107h()) {
                c3971a02 = C3778c1.f15825a;
                return c3971a02;
            }
            bVar.m16110k(true);
            if (bVar != interfaceC3817q0 && !C0540b.m2514a(f15813n, this, interfaceC3817q0, bVar)) {
                c3971a0 = C3778c1.f15827c;
                return c3971a0;
            }
            boolean m16106g = bVar.m16106g();
            C3814p c3814p = obj instanceof C3814p ? (C3814p) obj : null;
            if (c3814p != null) {
                bVar.m16104a(c3814p.f15876a);
            }
            ?? m16105f = Boolean.valueOf(m16106g ? false : true).booleanValue() ? bVar.m16105f() : 0;
            c3850o.f15904n = m16105f;
            C4755l c4755l = C4755l.f18582a;
            if (m16105f != 0) {
                m16054P(m16050D, m16105f);
            }
            C3806m m16075x = m16075x(interfaceC3817q0);
            if (m16075x != null && m16068l0(bVar, m16075x, obj)) {
                return C3778c1.f15826b;
            }
            return m16074w(bVar, obj);
        }
    }

    /* renamed from: l0 */
    private final boolean m16068l0(b bVar, C3806m c3806m, Object obj) {
        while (InterfaceC3827v0.a.m16233d(c3806m.f15862r, false, false, new a(this, bVar, c3806m, obj), 1, null) == C3787f1.f15836n) {
            c3806m = m16053N(c3806m);
            if (c3806m == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    private final Object m16069p(Object obj) {
        C3971a0 c3971a0;
        Object m16065j0;
        C3971a0 c3971a02;
        do {
            Object m16080F = m16080F();
            if ((m16080F instanceof InterfaceC3817q0) && (!(m16080F instanceof b) || !((b) m16080F).m16107h())) {
                m16065j0 = m16065j0(m16080F, new C3814p(m16073v(obj), false, 2, null));
                c3971a02 = C3778c1.f15827c;
            } else {
                c3971a0 = C3778c1.f15825a;
                return c3971a0;
            }
        } while (m16065j0 == c3971a02);
        return m16065j0;
    }

    /* renamed from: q */
    private final boolean m16070q(Throwable th) {
        if (mo16082I()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        InterfaceC3803l m16079E = m16079E();
        return (m16079E == null || m16079E == C3787f1.f15836n) ? z10 : m16079E.mo16135e(th) || z10;
    }

    /* renamed from: t */
    private final void m16071t(InterfaceC3817q0 interfaceC3817q0, Object obj) {
        InterfaceC3803l m16079E = m16079E();
        if (m16079E != null) {
            m16079E.mo16042b();
            m16090b0(C3787f1.f15836n);
        }
        C3814p c3814p = obj instanceof C3814p ? (C3814p) obj : null;
        Throwable th = c3814p != null ? c3814p.f15876a : null;
        if (interfaceC3817q0 instanceof AbstractC3772a1) {
            try {
                ((AbstractC3772a1) interfaceC3817q0).mo16100s(th);
                return;
            } catch (Throwable th2) {
                mo16024H(new C3820s("Exception in completion handler " + interfaceC3817q0 + " for " + this, th2));
                return;
            }
        }
        C3784e1 mo16044d = interfaceC3817q0.mo16044d();
        if (mo16044d != null) {
            m16055R(mo16044d, th);
        }
    }

    /* renamed from: u */
    public final void m16072u(b bVar, C3806m c3806m, Object obj) {
        C3806m m16053N = m16053N(c3806m);
        if (m16053N == null || !m16068l0(bVar, m16053N, obj)) {
            mo16096m(m16074w(bVar, obj));
        }
    }

    /* renamed from: v */
    private final Throwable m16073v(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C3829w0(mo16032r(), null, this) : th;
        }
        C3844i.m16251d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((InterfaceC3793h1) obj).mo16084O();
    }

    /* renamed from: w */
    private final Object m16074w(b bVar, Object obj) {
        boolean m16106g;
        Throwable m16049A;
        C3814p c3814p = obj instanceof C3814p ? (C3814p) obj : null;
        Throwable th = c3814p != null ? c3814p.f15876a : null;
        synchronized (bVar) {
            m16106g = bVar.m16106g();
            List<Throwable> m16109j = bVar.m16109j(th);
            m16049A = m16049A(bVar, m16109j);
            if (m16049A != null) {
                m16066k(m16049A, m16109j);
            }
        }
        if (m16049A != null && m16049A != th) {
            obj = new C3814p(m16049A, false, 2, null);
        }
        if (m16049A != null) {
            if (m16070q(m16049A) || m16081G(m16049A)) {
                C3844i.m16251d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((C3814p) obj).m16218b();
            }
        }
        if (!m16106g) {
            m16085S(m16049A);
        }
        mo16026U(obj);
        C0540b.m2514a(f15813n, this, bVar, C3778c1.m16120f(obj));
        m16071t(bVar, obj);
        return obj;
    }

    /* renamed from: x */
    private final C3806m m16075x(InterfaceC3817q0 interfaceC3817q0) {
        C3806m c3806m = interfaceC3817q0 instanceof C3806m ? (C3806m) interfaceC3817q0 : null;
        if (c3806m != null) {
            return c3806m;
        }
        C3784e1 mo16044d = interfaceC3817q0.mo16044d();
        if (mo16044d != null) {
            return m16053N(mo16044d);
        }
        return null;
    }

    /* renamed from: y */
    private final Throwable m16076y(Object obj) {
        C3814p c3814p = obj instanceof C3814p ? (C3814p) obj : null;
        if (c3814p != null) {
            return c3814p.f15876a;
        }
        return null;
    }

    /* renamed from: B */
    public boolean m16077B() {
        return true;
    }

    /* renamed from: C */
    public boolean m16078C() {
        return false;
    }

    /* renamed from: E */
    public final InterfaceC3803l m16079E() {
        return (InterfaceC3803l) f15814o.get(this);
    }

    /* renamed from: F */
    public final Object m16080F() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15813n;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof AbstractC4000v)) {
                return obj;
            }
            ((AbstractC4000v) obj).mo16701a(this);
        }
    }

    /* renamed from: G */
    protected boolean m16081G(Throwable th) {
        return false;
    }

    /* renamed from: H */
    public void mo16024H(Throwable th) {
        throw th;
    }

    /* renamed from: I */
    protected boolean mo16082I() {
        return false;
    }

    /* renamed from: K */
    public final Object m16083K(Object obj) {
        Object m16065j0;
        C3971a0 c3971a0;
        C3971a0 c3971a02;
        do {
            m16065j0 = m16065j0(m16080F(), obj);
            c3971a0 = C3778c1.f15825a;
            if (m16065j0 != c3971a0) {
                c3971a02 = C3778c1.f15827c;
            } else {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m16076y(obj));
            }
        } while (m16065j0 == c3971a02);
        return m16065j0;
    }

    /* renamed from: M */
    public String mo16025M() {
        return C3834z.m16239a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // p145kb.InterfaceC3793h1
    /* renamed from: O */
    public CancellationException mo16084O() {
        CancellationException cancellationException;
        Object m16080F = m16080F();
        if (m16080F instanceof b) {
            cancellationException = ((b) m16080F).m16105f();
        } else if (m16080F instanceof C3814p) {
            cancellationException = ((C3814p) m16080F).f15876a;
        } else {
            if (m16080F instanceof InterfaceC3817q0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + m16080F).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        return new C3829w0("Parent job is " + m16058c0(m16080F), cancellationException, this);
    }

    /* renamed from: S */
    protected void m16085S(Throwable th) {
    }

    @Override // p145kb.InterfaceC3827v0
    /* renamed from: T */
    public final CancellationException mo16086T() {
        Object m16080F = m16080F();
        if (m16080F instanceof b) {
            Throwable m16105f = ((b) m16080F).m16105f();
            if (m16105f != null) {
                CancellationException m16091d0 = m16091d0(m16105f, C3834z.m16239a(this) + " is cancelling");
                if (m16091d0 != null) {
                    return m16091d0;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(m16080F instanceof InterfaceC3817q0)) {
            if (m16080F instanceof C3814p) {
                return m16059f0(this, ((C3814p) m16080F).f15876a, null, 1, null);
            }
            return new C3829w0(C3834z.m16239a(this) + " has completed normally", null, this);
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    /* renamed from: U */
    protected void mo16026U(Object obj) {
    }

    @Override // p145kb.InterfaceC3827v0
    /* renamed from: X */
    public void mo16087X(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C3829w0(mo16032r(), null, this);
        }
        m16098o(cancellationException);
    }

    /* renamed from: a0 */
    public final void m16088a0(AbstractC3772a1 abstractC3772a1) {
        Object m16080F;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C3795i0 c3795i0;
        do {
            m16080F = m16080F();
            if (!(m16080F instanceof AbstractC3772a1)) {
                if (!(m16080F instanceof InterfaceC3817q0) || ((InterfaceC3817q0) m16080F).mo16044d() == null) {
                    return;
                }
                abstractC3772a1.m16778o();
                return;
            }
            if (m16080F != abstractC3772a1) {
                return;
            }
            atomicReferenceFieldUpdater = f15813n;
            c3795i0 = C3778c1.f15831g;
        } while (!C0540b.m2514a(atomicReferenceFieldUpdater, this, m16080F, c3795i0));
    }

    @Override // va.InterfaceC5001e
    /* renamed from: b */
    public <R> R mo16089b(R r10, InterfaceC3045p<? super R, ? super InterfaceC5001e.a, ? extends R> interfaceC3045p) {
        return (R) InterfaceC3827v0.a.m16231b(this, r10, interfaceC3045p);
    }

    /* renamed from: b0 */
    public final void m16090b0(InterfaceC3803l interfaceC3803l) {
        f15814o.set(this, interfaceC3803l);
    }

    @Override // p145kb.InterfaceC3827v0
    /* renamed from: c */
    public boolean mo16027c() {
        Object m16080F = m16080F();
        return (m16080F instanceof InterfaceC3817q0) && ((InterfaceC3817q0) m16080F).mo16043c();
    }

    /* renamed from: d0 */
    protected final CancellationException m16091d0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = mo16032r();
            }
            cancellationException = new C3829w0(str, th, this);
        }
        return cancellationException;
    }

    @Override // p145kb.InterfaceC3809n
    /* renamed from: e */
    public final void mo16092e(InterfaceC3793h1 interfaceC3793h1) {
        m16097n(interfaceC3793h1);
    }

    /* renamed from: g0 */
    public final String m16093g0() {
        return mo16025M() + '{' + m16058c0(m16080F()) + '}';
    }

    @Override // va.InterfaceC5001e.a
    public final InterfaceC5001e.b<?> getKey() {
        return InterfaceC3827v0.f15887k;
    }

    @Override // va.InterfaceC5001e
    /* renamed from: i */
    public <E extends InterfaceC5001e.a> E mo16094i(InterfaceC5001e.b<E> bVar) {
        return (E) InterfaceC3827v0.a.m16232c(this, bVar);
    }

    @Override // p145kb.InterfaceC3827v0
    /* renamed from: l */
    public final InterfaceC3792h0 mo16095l(boolean z10, boolean z11, InterfaceC3041l<? super Throwable, C4755l> interfaceC3041l) {
        AbstractC3772a1 m16052L = m16052L(interfaceC3041l, z10);
        while (true) {
            Object m16080F = m16080F();
            if (m16080F instanceof C3795i0) {
                C3795i0 c3795i0 = (C3795i0) m16080F;
                if (c3795i0.mo16043c()) {
                    if (C0540b.m2514a(f15813n, this, m16080F, m16052L)) {
                        return m16052L;
                    }
                } else {
                    m16056V(c3795i0);
                }
            } else {
                if (m16080F instanceof InterfaceC3817q0) {
                    C3784e1 mo16044d = ((InterfaceC3817q0) m16080F).mo16044d();
                    if (mo16044d == null) {
                        C3844i.m16251d(m16080F, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        m16057Z((AbstractC3772a1) m16080F);
                    } else {
                        InterfaceC3792h0 interfaceC3792h0 = C3787f1.f15836n;
                        if (z10 && (m16080F instanceof b)) {
                            synchronized (m16080F) {
                                r3 = ((b) m16080F).m16105f();
                                if (r3 == null || ((interfaceC3041l instanceof C3806m) && !((b) m16080F).m16107h())) {
                                    if (m16064j(m16080F, mo16044d, m16052L)) {
                                        if (r3 == null) {
                                            return m16052L;
                                        }
                                        interfaceC3792h0 = m16052L;
                                    }
                                }
                                C4755l c4755l = C4755l.f18582a;
                            }
                        }
                        if (r3 != null) {
                            if (z11) {
                                interfaceC3041l.invoke(r3);
                            }
                            return interfaceC3792h0;
                        }
                        if (m16064j(m16080F, mo16044d, m16052L)) {
                            return m16052L;
                        }
                    }
                } else {
                    if (z11) {
                        C3814p c3814p = m16080F instanceof C3814p ? (C3814p) m16080F : null;
                        interfaceC3041l.invoke(c3814p != null ? c3814p.f15876a : null);
                    }
                    return C3787f1.f15836n;
                }
            }
        }
    }

    /* renamed from: m */
    public void mo16096m(Object obj) {
    }

    /* renamed from: n */
    public final boolean m16097n(Object obj) {
        Object obj2;
        C3971a0 c3971a0;
        C3971a0 c3971a02;
        C3971a0 c3971a03;
        obj2 = C3778c1.f15825a;
        if (m16078C() && (obj2 = m16069p(obj)) == C3778c1.f15826b) {
            return true;
        }
        c3971a0 = C3778c1.f15825a;
        if (obj2 == c3971a0) {
            obj2 = m16051J(obj);
        }
        c3971a02 = C3778c1.f15825a;
        if (obj2 == c3971a02 || obj2 == C3778c1.f15826b) {
            return true;
        }
        c3971a03 = C3778c1.f15828d;
        if (obj2 == c3971a03) {
            return false;
        }
        mo16096m(obj2);
        return true;
    }

    /* renamed from: o */
    public void m16098o(Throwable th) {
        m16097n(th);
    }

    /* renamed from: r */
    public String mo16032r() {
        return "Job was cancelled";
    }

    /* renamed from: s */
    public boolean m16099s(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m16097n(th) && m16077B();
    }

    public String toString() {
        return m16093g0() + '@' + C3834z.m16240b(this);
    }
}
