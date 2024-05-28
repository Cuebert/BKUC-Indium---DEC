package p191o9;

import java.io.IOException;
import java.util.Map;
import p035c9.C1151k;
import p193ob.AbstractC4179h0;
import p193ob.C4167b0;
import p193ob.C4171d0;
import p193ob.C4177g0;
import p193ob.C4181i0;
import p216q9.C4332b;

/* renamed from: o9.f */
/* loaded from: classes.dex */
public class C4158f {
    /* renamed from: a */
    public C4181i0 m17234a(C4171d0 c4171d0, String str, String str2, Map<String, String> map, String str3) throws IOException {
        return m17235b(c4171d0, str, str2, map, str3, false);
    }

    /* renamed from: b */
    public C4181i0 m17235b(C4171d0 c4171d0, String str, String str2, Map<String, String> map, String str3, boolean z10) throws IOException {
        return m17236c(c4171d0, new C4177g0.a(), str, str2, map, str3, false);
    }

    /* renamed from: c */
    public C4181i0 m17236c(C4171d0 c4171d0, C4177g0.a aVar, String str, String str2, Map<String, String> map, String str3, boolean z10) throws IOException {
        String str4;
        aVar.m17408h(str);
        if (map != null) {
            for (String str5 : map.keySet()) {
                String str6 = map.get(str5);
                if (str5 != null && str6 != null) {
                    aVar.m17402b(str5, str6);
                }
            }
        }
        if (str2 != null) {
            String str7 = str3 == null ? "application/x-www-form-urlencoded;charset=UTF-8" : str3;
            aVar.m17405e(AbstractC4179h0.m17411d(C4167b0.m17279d(str7), str2));
            String m17861b = C4332b.m17861b();
            if (m17861b != null) {
                aVar.m17402b("X-CSRF-TOKEN", m17861b);
            }
            str4 = str7;
        } else {
            str4 = str3;
        }
        C4181i0 mo17377c = c4171d0.mo17300a(aVar.m17401a()).mo17377c();
        if (mo17377c.m17432e() == 403) {
            String m17437l = mo17377c.m17437l("X-CSRF-TOKEN");
            if (!z10 && m17437l != null) {
                C1151k.m6707a("rbx.platform", "XSRF: got token. retrying");
                C4332b.m17863d(m17437l);
                return m17235b(c4171d0, str, str2, map, str4, true);
            }
            if (z10) {
                C1151k.m6707a("rbx.platform", "XSRF Error: retry already attempted. Will not retry");
            } else {
                C1151k.m6707a("rbx.platform", "XSRF Error: token not present in response. Will not retry");
            }
        }
        return mo17377c;
    }
}
