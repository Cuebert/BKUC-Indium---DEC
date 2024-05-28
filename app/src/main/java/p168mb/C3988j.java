package p168mb;

import p253ta.C4751h;
import p253ta.C4752i;

/* renamed from: mb.j */
/* loaded from: classes.dex */
public final class C3988j {

    /* renamed from: a */
    private static final boolean f16385a;

    static {
        Object m18904a;
        try {
            C4751h.a aVar = C4751h.f18580n;
            m18904a = C4751h.m18904a(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            C4751h.a aVar2 = C4751h.f18580n;
            m18904a = C4751h.m18904a(C4752i.m18908a(th));
        }
        f16385a = C4751h.m18907d(m18904a);
    }

    /* renamed from: a */
    public static final boolean m16759a() {
        return f16385a;
    }
}
