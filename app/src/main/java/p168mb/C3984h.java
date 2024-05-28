package p168mb;

import java.util.concurrent.CancellationException;
import p051db.InterfaceC3041l;
import p145kb.AbstractC3798j0;
import p145kb.C3799j1;
import p145kb.C3805l1;
import p145kb.C3822t;
import p145kb.C3824u;
import p145kb.InterfaceC3827v0;
import p253ta.C4751h;
import p253ta.C4752i;
import p253ta.C4755l;
import va.InterfaceC4999c;
import va.InterfaceC5001e;

/* renamed from: mb.h */
/* loaded from: classes.dex */
public final class C3984h {

    /* renamed from: a */
    private static final C3971a0 f16378a = new C3971a0("UNDEFINED");

    /* renamed from: b */
    public static final C3971a0 f16379b = new C3971a0("REUSABLE_CLAIMED");

    /* JADX WARN: Finally extract failed */
    /* renamed from: b */
    public static final <T> void m16749b(InterfaceC4999c<? super T> interfaceC4999c, Object obj, InterfaceC3041l<? super Throwable, C4755l> interfaceC3041l) {
        boolean z10;
        if (interfaceC4999c instanceof C3982g) {
            C3982g c3982g = (C3982g) interfaceC4999c;
            Object m16220b = C3822t.m16220b(obj, interfaceC3041l);
            if (c3982g.f16372q.mo16205k0(c3982g.getContext())) {
                c3982g.f16374s = m16220b;
                c3982g.f15835p = 1;
                c3982g.f16372q.mo16197j0(c3982g.getContext(), c3982g);
                return;
            }
            AbstractC3798j0 m16181a = C3799j1.f15851a.m16181a();
            if (m16181a.m16178s0()) {
                c3982g.f16374s = m16220b;
                c3982g.f15835p = 1;
                m16181a.m16175o0(c3982g);
                return;
            }
            m16181a.m16177q0(true);
            try {
                InterfaceC3827v0 interfaceC3827v0 = (InterfaceC3827v0) c3982g.getContext().mo16094i(InterfaceC3827v0.f15887k);
                if (interfaceC3827v0 == null || interfaceC3827v0.mo16027c()) {
                    z10 = false;
                } else {
                    CancellationException mo16086T = interfaceC3827v0.mo16086T();
                    c3982g.mo16124b(m16220b, mo16086T);
                    C4751h.a aVar = C4751h.f18580n;
                    c3982g.mo16028d(C4751h.m18904a(C4752i.m18908a(mo16086T)));
                    z10 = true;
                }
                if (!z10) {
                    InterfaceC4999c<T> interfaceC4999c2 = c3982g.f16373r;
                    Object obj2 = c3982g.f16375t;
                    InterfaceC5001e context = interfaceC4999c2.getContext();
                    Object m16724c = C3979e0.m16724c(context, obj2);
                    C3805l1<?> m16225c = m16724c != C3979e0.f16363a ? C3824u.m16225c(interfaceC4999c2, context, m16724c) : null;
                    try {
                        c3982g.f16373r.mo16028d(obj);
                        C4755l c4755l = C4755l.f18582a;
                        if (m16225c == null || m16225c.m16207p0()) {
                            C3979e0.m16722a(context, m16724c);
                        }
                    } catch (Throwable th) {
                        if (m16225c == null || m16225c.m16207p0()) {
                            C3979e0.m16722a(context, m16724c);
                        }
                        throw th;
                    }
                }
                do {
                } while (m16181a.m16180u0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        interfaceC4999c.mo16028d(obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m16750c(InterfaceC4999c interfaceC4999c, Object obj, InterfaceC3041l interfaceC3041l, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            interfaceC3041l = null;
        }
        m16749b(interfaceC4999c, obj, interfaceC3041l);
    }
}
