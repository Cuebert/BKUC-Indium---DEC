package p145kb;

import p168mb.C3982g;
import p253ta.C4751h;
import p253ta.C4752i;
import va.InterfaceC4999c;

/* renamed from: kb.z */
/* loaded from: classes.dex */
public final class C3834z {
    /* renamed from: a */
    public static final String m16239a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* renamed from: b */
    public static final String m16240b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: c */
    public static final String m16241c(InterfaceC4999c<?> interfaceC4999c) {
        Object m18904a;
        if (interfaceC4999c instanceof C3982g) {
            return interfaceC4999c.toString();
        }
        try {
            C4751h.a aVar = C4751h.f18580n;
            m18904a = C4751h.m18904a(interfaceC4999c + '@' + m16240b(interfaceC4999c));
        } catch (Throwable th) {
            C4751h.a aVar2 = C4751h.f18580n;
            m18904a = C4751h.m18904a(C4752i.m18908a(th));
        }
        if (C4751h.m18905b(m18904a) != null) {
            m18904a = interfaceC4999c.getClass().getName() + '@' + m16240b(interfaceC4999c);
        }
        return (String) m18904a;
    }
}
