package p145kb;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C3844i;
import p168mb.C3979e0;
import p168mb.C3982g;
import p180nb.AbstractRunnableC4100h;
import p180nb.InterfaceC4101i;
import p253ta.C4745b;
import p253ta.C4751h;
import p253ta.C4752i;
import p253ta.C4755l;
import va.InterfaceC4999c;
import va.InterfaceC5001e;

/* renamed from: kb.e0 */
/* loaded from: classes.dex */
public abstract class AbstractC3783e0<T> extends AbstractRunnableC4100h {

    /* renamed from: p */
    public int f15835p;

    public AbstractC3783e0(int i10) {
        this.f15835p = i10;
    }

    /* renamed from: b */
    public void mo16124b(Object obj, Throwable th) {
    }

    /* renamed from: c */
    public abstract InterfaceC4999c<T> mo16125c();

    /* renamed from: e */
    public Throwable mo16126e(Object obj) {
        C3814p c3814p = obj instanceof C3814p ? (C3814p) obj : null;
        if (c3814p != null) {
            return c3814p.f15876a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public <T> T mo16127g(Object obj) {
        return obj;
    }

    /* renamed from: h */
    public final void m16128h(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            C4745b.m18896a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        C3844i.m16250c(th);
        C3830x.m16235a(mo16125c().getContext(), new C3832y("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* renamed from: i */
    public abstract Object mo16129i();

    @Override // java.lang.Runnable
    public final void run() {
        Object m18904a;
        Object m18904a2;
        InterfaceC4101i interfaceC4101i = this.f16656o;
        try {
            InterfaceC4999c<T> mo16125c = mo16125c();
            C3844i.m16251d(mo16125c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C3982g c3982g = (C3982g) mo16125c;
            InterfaceC4999c<T> interfaceC4999c = c3982g.f16373r;
            Object obj = c3982g.f16375t;
            InterfaceC5001e context = interfaceC4999c.getContext();
            Object m16724c = C3979e0.m16724c(context, obj);
            C3805l1<?> m16225c = m16724c != C3979e0.f16363a ? C3824u.m16225c(interfaceC4999c, context, m16724c) : null;
            try {
                InterfaceC5001e context2 = interfaceC4999c.getContext();
                Object mo16129i = mo16129i();
                Throwable mo16126e = mo16126e(mo16129i);
                InterfaceC3827v0 interfaceC3827v0 = (mo16126e == null && C3786f0.m16131b(this.f15835p)) ? (InterfaceC3827v0) context2.mo16094i(InterfaceC3827v0.f15887k) : null;
                if (interfaceC3827v0 != null && !interfaceC3827v0.mo16027c()) {
                    CancellationException mo16086T = interfaceC3827v0.mo16086T();
                    mo16124b(mo16129i, mo16086T);
                    C4751h.a aVar = C4751h.f18580n;
                    interfaceC4999c.mo16028d(C4751h.m18904a(C4752i.m18908a(mo16086T)));
                } else if (mo16126e != null) {
                    C4751h.a aVar2 = C4751h.f18580n;
                    interfaceC4999c.mo16028d(C4751h.m18904a(C4752i.m18908a(mo16126e)));
                } else {
                    C4751h.a aVar3 = C4751h.f18580n;
                    interfaceC4999c.mo16028d(C4751h.m18904a(mo16127g(mo16129i)));
                }
                C4755l c4755l = C4755l.f18582a;
                try {
                    C4751h.a aVar4 = C4751h.f18580n;
                    interfaceC4101i.mo17080a();
                    m18904a2 = C4751h.m18904a(c4755l);
                } catch (Throwable th) {
                    C4751h.a aVar5 = C4751h.f18580n;
                    m18904a2 = C4751h.m18904a(C4752i.m18908a(th));
                }
                m16128h(null, C4751h.m18905b(m18904a2));
            } finally {
                if (m16225c == null || m16225c.m16207p0()) {
                    C3979e0.m16722a(context, m16724c);
                }
            }
        } catch (Throwable th2) {
            try {
                C4751h.a aVar6 = C4751h.f18580n;
                interfaceC4101i.mo17080a();
                m18904a = C4751h.m18904a(C4755l.f18582a);
            } catch (Throwable th3) {
                C4751h.a aVar7 = C4751h.f18580n;
                m18904a = C4751h.m18904a(C4752i.m18908a(th3));
            }
            m16128h(th2, C4751h.m18905b(m18904a));
        }
    }
}
