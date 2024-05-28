package p168mb;

import androidx.concurrent.futures.C0540b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C3844i;
import p145kb.AbstractC3783e0;
import p145kb.AbstractC3798j0;
import p145kb.AbstractC3826v;
import p145kb.C3794i;
import p145kb.C3799j1;
import p145kb.C3816q;
import p145kb.C3822t;
import p145kb.C3834z;
import p145kb.InterfaceC3791h;
import p253ta.C4755l;
import p303xa.InterfaceC5575d;
import va.InterfaceC4999c;
import va.InterfaceC5001e;

/* renamed from: mb.g */
/* loaded from: classes.dex */
public final class C3982g<T> extends AbstractC3783e0<T> implements InterfaceC5575d, InterfaceC4999c<T> {

    /* renamed from: u */
    private static final AtomicReferenceFieldUpdater f16371u = AtomicReferenceFieldUpdater.newUpdater(C3982g.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: q */
    public final AbstractC3826v f16372q;

    /* renamed from: r */
    public final InterfaceC4999c<T> f16373r;

    /* renamed from: s */
    public Object f16374s;

    /* renamed from: t */
    public final Object f16375t;

    /* JADX WARN: Multi-variable type inference failed */
    public C3982g(AbstractC3826v abstractC3826v, InterfaceC4999c<? super T> interfaceC4999c) {
        super(-1);
        C3971a0 c3971a0;
        this.f16372q = abstractC3826v;
        this.f16373r = interfaceC4999c;
        c3971a0 = C3984h.f16378a;
        this.f16374s = c3971a0;
        this.f16375t = C3979e0.m16723b(getContext());
    }

    /* renamed from: k */
    private final C3794i<?> m16729k() {
        Object obj = f16371u.get(this);
        if (obj instanceof C3794i) {
            return (C3794i) obj;
        }
        return null;
    }

    @Override // p303xa.InterfaceC5575d
    /* renamed from: a */
    public InterfaceC5575d mo16161a() {
        InterfaceC4999c<T> interfaceC4999c = this.f16373r;
        if (interfaceC4999c instanceof InterfaceC5575d) {
            return (InterfaceC5575d) interfaceC4999c;
        }
        return null;
    }

    @Override // p145kb.AbstractC3783e0
    /* renamed from: b */
    public void mo16124b(Object obj, Throwable th) {
        if (obj instanceof C3816q) {
            ((C3816q) obj).f15879b.invoke(th);
        }
    }

    @Override // p145kb.AbstractC3783e0
    /* renamed from: c */
    public InterfaceC4999c<T> mo16125c() {
        return this;
    }

    @Override // va.InterfaceC4999c
    /* renamed from: d */
    public void mo16028d(Object obj) {
        InterfaceC5001e context = this.f16373r.getContext();
        Object m16222d = C3822t.m16222d(obj, null, 1, null);
        if (this.f16372q.mo16205k0(context)) {
            this.f16374s = m16222d;
            this.f15835p = 0;
            this.f16372q.mo16197j0(context, this);
            return;
        }
        AbstractC3798j0 m16181a = C3799j1.f15851a.m16181a();
        if (m16181a.m16178s0()) {
            this.f16374s = m16222d;
            this.f15835p = 0;
            m16181a.m16175o0(this);
            return;
        }
        m16181a.m16177q0(true);
        try {
            InterfaceC5001e context2 = getContext();
            Object m16724c = C3979e0.m16724c(context2, this.f16375t);
            try {
                this.f16373r.mo16028d(obj);
                C4755l c4755l = C4755l.f18582a;
                do {
                } while (m16181a.m16180u0());
            } finally {
                C3979e0.m16722a(context2, m16724c);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // va.InterfaceC4999c
    public InterfaceC5001e getContext() {
        return this.f16373r.getContext();
    }

    @Override // p145kb.AbstractC3783e0
    /* renamed from: i */
    public Object mo16129i() {
        C3971a0 c3971a0;
        Object obj = this.f16374s;
        c3971a0 = C3984h.f16378a;
        this.f16374s = c3971a0;
        return obj;
    }

    /* renamed from: j */
    public final void m16730j() {
        do {
        } while (f16371u.get(this) == C3984h.f16379b);
    }

    /* renamed from: l */
    public final boolean m16731l() {
        return f16371u.get(this) != null;
    }

    /* renamed from: m */
    public final boolean m16732m(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16371u;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            C3971a0 c3971a0 = C3984h.f16379b;
            if (C3844i.m16248a(obj, c3971a0)) {
                if (C0540b.m2514a(f16371u, this, c3971a0, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (C0540b.m2514a(f16371u, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    /* renamed from: n */
    public final void m16733n() {
        m16730j();
        C3794i<?> m16729k = m16729k();
        if (m16729k != null) {
            m16729k.m16165p();
        }
    }

    /* renamed from: o */
    public final Throwable m16734o(InterfaceC3791h<?> interfaceC3791h) {
        C3971a0 c3971a0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16371u;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            c3971a0 = C3984h.f16379b;
            if (obj != c3971a0) {
                if (obj instanceof Throwable) {
                    if (C0540b.m2514a(f16371u, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!C0540b.m2514a(f16371u, this, c3971a0, interfaceC3791h));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f16372q + ", " + C3834z.m16241c(this.f16373r) + ']';
    }
}
