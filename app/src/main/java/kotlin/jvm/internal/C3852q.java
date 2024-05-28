package kotlin.jvm.internal;

import p104hb.InterfaceC3454c;
import p104hb.InterfaceC3455d;
import p104hb.InterfaceC3456e;
import p104hb.InterfaceC3457f;

/* renamed from: kotlin.jvm.internal.q */
/* loaded from: classes.dex */
public class C3852q {
    /* renamed from: a */
    public InterfaceC3456e m16272a(C3842g c3842g) {
        return c3842g;
    }

    /* renamed from: b */
    public InterfaceC3454c m16273b(Class cls) {
        return new C3838c(cls);
    }

    /* renamed from: c */
    public InterfaceC3455d m16274c(Class cls, String str) {
        return new C3846k(cls, str);
    }

    /* renamed from: d */
    public InterfaceC3457f m16275d(AbstractC3847l abstractC3847l) {
        return abstractC3847l;
    }

    /* renamed from: e */
    public String m16276e(InterfaceC3841f interfaceC3841f) {
        String obj = interfaceC3841f.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    /* renamed from: f */
    public String m16277f(AbstractC3845j abstractC3845j) {
        return m16276e(abstractC3845j);
    }
}
