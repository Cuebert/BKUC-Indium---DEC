package p145kb;

import p051db.InterfaceC3041l;
import p253ta.C4751h;
import p253ta.C4752i;
import p253ta.C4755l;
import va.InterfaceC4999c;

/* renamed from: kb.t */
/* loaded from: classes.dex */
public final class C3822t {
    /* renamed from: a */
    public static final <T> Object m16219a(Object obj, InterfaceC4999c<? super T> interfaceC4999c) {
        if (obj instanceof C3814p) {
            C4751h.a aVar = C4751h.f18580n;
            return C4751h.m18904a(C4752i.m18908a(((C3814p) obj).f15876a));
        }
        C4751h.a aVar2 = C4751h.f18580n;
        return C4751h.m18904a(obj);
    }

    /* renamed from: b */
    public static final <T> Object m16220b(Object obj, InterfaceC3041l<? super Throwable, C4755l> interfaceC3041l) {
        Throwable m18905b = C4751h.m18905b(obj);
        if (m18905b == null) {
            return interfaceC3041l != null ? new C3816q(obj, interfaceC3041l) : obj;
        }
        return new C3814p(m18905b, false, 2, null);
    }

    /* renamed from: c */
    public static final <T> Object m16221c(Object obj, InterfaceC3791h<?> interfaceC3791h) {
        Throwable m18905b = C4751h.m18905b(obj);
        return m18905b == null ? obj : new C3814p(m18905b, false, 2, null);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m16222d(Object obj, InterfaceC3041l interfaceC3041l, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            interfaceC3041l = null;
        }
        return m16220b(obj, interfaceC3041l);
    }
}
