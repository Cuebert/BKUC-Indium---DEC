package p145kb;

import p303xa.InterfaceC5575d;
import va.InterfaceC4999c;
import va.InterfaceC5001e;

/* renamed from: kb.u */
/* loaded from: classes.dex */
public final class C3824u {
    /* renamed from: a */
    public static final String m16223a(InterfaceC5001e interfaceC5001e) {
        return null;
    }

    /* renamed from: b */
    public static final C3805l1<?> m16224b(InterfaceC5575d interfaceC5575d) {
        while (!(interfaceC5575d instanceof C3780d0) && (interfaceC5575d = interfaceC5575d.mo16161a()) != null) {
            if (interfaceC5575d instanceof C3805l1) {
                return (C3805l1) interfaceC5575d;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static final C3805l1<?> m16225c(InterfaceC4999c<?> interfaceC4999c, InterfaceC5001e interfaceC5001e, Object obj) {
        if (!(interfaceC4999c instanceof InterfaceC5575d)) {
            return null;
        }
        if (!(interfaceC5001e.mo16094i(C3808m1.f15863n) != null)) {
            return null;
        }
        C3805l1<?> m16224b = m16224b((InterfaceC5575d) interfaceC4999c);
        if (m16224b != null) {
            m16224b.m16208q0(interfaceC5001e, obj);
        }
        return m16224b;
    }
}
