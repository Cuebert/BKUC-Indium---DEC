package p216q9;

import java.io.IOException;
import p035c9.C1151k;
import p193ob.C4177g0;
import p193ob.C4181i0;
import p193ob.InterfaceC4165a0;

/* renamed from: q9.b */
/* loaded from: classes.dex */
public class C4332b implements InterfaceC4165a0 {

    /* renamed from: b */
    private static String f17589b;

    /* renamed from: a */
    private final String f17590a = "rbx.platform";

    /* renamed from: b */
    public static String m17861b() {
        return f17589b;
    }

    /* renamed from: c */
    private C4177g0 m17862c(C4177g0 c4177g0, String str) {
        if (str == null || !c4177g0.m17397g().equals("POST")) {
            return c4177g0;
        }
        C1151k.m6707a("rbx.platform", "XSRFTokenInterceptor.putXSRFTokenInRequest() token:" + m17861b());
        return c4177g0.m17398h().m17402b("X-CSRF-TOKEN", str).m17401a();
    }

    /* renamed from: d */
    public static void m17863d(String str) {
        f17589b = str;
    }

    @Override // p193ob.InterfaceC4165a0
    /* renamed from: a */
    public C4181i0 mo17270a(InterfaceC4165a0.a aVar) throws IOException {
        String m17437l;
        C4181i0 mo17272b = aVar.mo17272b(m17862c(aVar.mo17275e(), m17861b()));
        if (mo17272b.m17432e() == 403 && (m17437l = mo17272b.m17437l("X-CSRF-TOKEN")) != null) {
            C1151k.m6707a("rbx.platform", "XSRFTokenInterceptor.intercept() new token:" + m17437l);
            m17863d(m17437l);
        }
        return mo17272b;
    }
}
