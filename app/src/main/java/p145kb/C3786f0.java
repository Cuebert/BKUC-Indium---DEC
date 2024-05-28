package p145kb;

import kotlin.jvm.internal.C3844i;
import p168mb.C3979e0;
import p168mb.C3982g;
import p253ta.C4751h;
import p253ta.C4752i;
import p253ta.C4755l;
import va.InterfaceC4999c;
import va.InterfaceC5001e;

/* renamed from: kb.f0 */
/* loaded from: classes.dex */
public final class C3786f0 {
    /* renamed from: a */
    public static final <T> void m16130a(AbstractC3783e0<? super T> abstractC3783e0, int i10) {
        InterfaceC4999c<? super T> mo16125c = abstractC3783e0.mo16125c();
        boolean z10 = i10 == 4;
        if (!z10 && (mo16125c instanceof C3982g) && m16131b(i10) == m16131b(abstractC3783e0.f15835p)) {
            AbstractC3826v abstractC3826v = ((C3982g) mo16125c).f16372q;
            InterfaceC5001e context = mo16125c.getContext();
            if (abstractC3826v.mo16205k0(context)) {
                abstractC3826v.mo16197j0(context, abstractC3783e0);
                return;
            } else {
                m16134e(abstractC3783e0);
                return;
            }
        }
        m16133d(abstractC3783e0, mo16125c, z10);
    }

    /* renamed from: b */
    public static final boolean m16131b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    /* renamed from: c */
    public static final boolean m16132c(int i10) {
        return i10 == 2;
    }

    /* renamed from: d */
    public static final <T> void m16133d(AbstractC3783e0<? super T> abstractC3783e0, InterfaceC4999c<? super T> interfaceC4999c, boolean z10) {
        Object mo16127g;
        boolean m16207p0;
        Object mo16129i = abstractC3783e0.mo16129i();
        Throwable mo16126e = abstractC3783e0.mo16126e(mo16129i);
        if (mo16126e != null) {
            C4751h.a aVar = C4751h.f18580n;
            mo16127g = C4752i.m18908a(mo16126e);
        } else {
            C4751h.a aVar2 = C4751h.f18580n;
            mo16127g = abstractC3783e0.mo16127g(mo16129i);
        }
        Object m18904a = C4751h.m18904a(mo16127g);
        if (z10) {
            C3844i.m16251d(interfaceC4999c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            C3982g c3982g = (C3982g) interfaceC4999c;
            InterfaceC4999c<T> interfaceC4999c2 = c3982g.f16373r;
            Object obj = c3982g.f16375t;
            InterfaceC5001e context = interfaceC4999c2.getContext();
            Object m16724c = C3979e0.m16724c(context, obj);
            C3805l1<?> m16225c = m16724c != C3979e0.f16363a ? C3824u.m16225c(interfaceC4999c2, context, m16724c) : null;
            try {
                c3982g.f16373r.mo16028d(m18904a);
                C4755l c4755l = C4755l.f18582a;
                if (m16225c != null) {
                    if (!m16207p0) {
                        return;
                    }
                }
                return;
            } finally {
                if (m16225c == null || m16225c.m16207p0()) {
                    C3979e0.m16722a(context, m16724c);
                }
            }
        }
        interfaceC4999c.mo16028d(m18904a);
    }

    /* renamed from: e */
    private static final void m16134e(AbstractC3783e0<?> abstractC3783e0) {
        AbstractC3798j0 m16181a = C3799j1.f15851a.m16181a();
        if (m16181a.m16178s0()) {
            m16181a.m16175o0(abstractC3783e0);
            return;
        }
        m16181a.m16177q0(true);
        try {
            m16133d(abstractC3783e0, abstractC3783e0.mo16125c(), true);
            do {
            } while (m16181a.m16180u0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
