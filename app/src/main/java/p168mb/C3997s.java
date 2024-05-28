package p168mb;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import p118ib.C3554f;
import p118ib.C3556h;
import p118ib.InterfaceC3550b;
import p145kb.AbstractC3781d1;

/* renamed from: mb.s */
/* loaded from: classes.dex */
public final class C3997s {

    /* renamed from: a */
    public static final C3997s f16410a;

    /* renamed from: b */
    private static final boolean f16411b;

    /* renamed from: c */
    public static final AbstractC3781d1 f16412c;

    static {
        C3997s c3997s = new C3997s();
        f16410a = c3997s;
        f16411b = C3973b0.m16708f("kotlinx.coroutines.fast.service.loader", true);
        f16412c = c3997s.m16801a();
    }

    private C3997s() {
    }

    /* renamed from: a */
    private final AbstractC3781d1 m16801a() {
        InterfaceC3550b m15363a;
        List<InterfaceC3996r> m15366d;
        Object next;
        AbstractC3781d1 m16806e;
        try {
            if (f16411b) {
                m15366d = C3986i.f16380a.m16755c();
            } else {
                m15363a = C3554f.m15363a(ServiceLoader.load(InterfaceC3996r.class, InterfaceC3996r.class.getClassLoader()).iterator());
                m15366d = C3556h.m15366d(m15363a);
            }
            Iterator<T> it = m15366d.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int mo16574c = ((InterfaceC3996r) next).mo16574c();
                    do {
                        Object next2 = it.next();
                        int mo16574c2 = ((InterfaceC3996r) next2).mo16574c();
                        if (mo16574c < mo16574c2) {
                            next = next2;
                            mo16574c = mo16574c2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            InterfaceC3996r interfaceC3996r = (InterfaceC3996r) next;
            return (interfaceC3996r == null || (m16806e = C3998t.m16806e(interfaceC3996r, m15366d)) == null) ? C3998t.m16803b(null, null, 3, null) : m16806e;
        } catch (Throwable th) {
            return C3998t.m16803b(th, null, 2, null);
        }
    }
}
