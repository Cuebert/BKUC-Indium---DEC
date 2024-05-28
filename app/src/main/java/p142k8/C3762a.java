package p142k8;

import android.content.Context;
import com.roblox.client.C2822f0;
import java.util.Map;
import p033c7.C1134c;
import p035c9.C1153m;
import p100h7.C3409b;
import p101h8.C3439m;
import p101h8.C3441o;
import p101h8.C3444r;
import p155l8.InterfaceC3899c;
import p300x7.C5560b;

/* renamed from: k8.a */
/* loaded from: classes.dex */
public class C3762a {
    /* renamed from: b */
    private String m15989b(Context context) {
        return C1153m.m6738a(context);
    }

    /* renamed from: c */
    private C3444r m15990c() {
        return new C3444r();
    }

    /* renamed from: a */
    String m15991a(Context context, String str, C3444r c3444r) {
        return c3444r.m15156a(context, str);
    }

    /* renamed from: d */
    public void m15992d(Context context, Map<String, String> map) {
        if (context == null || map == null) {
            return;
        }
        if (C1134c.m6537a().mo6642r() && C3441o.m15141a().m15143c(context)) {
            return;
        }
        C5560b.m20357e().m20366k(context, C5560b.d.APP_INIT_TYPE_SHELL);
        C3409b.m15015e(context);
        String m15991a = m15991a(context, C3439m.m15122c().m15126e(context), m15990c());
        String m15989b = m15989b(context);
        InterfaceC3899c m16010a = new C3766e().m16010a(map);
        if (C1134c.m6537a().mo6603e() && m16010a.mo16526p() && m15989b.equals("foreground")) {
            return;
        }
        C2822f0.m12497s("v" + m16010a.mo16530t(), m15991a, m16010a.mo16515e(), m16010a.mo16512b(), m15989b, m16010a.mo16530t(), m16010a.mo16514d());
        InterfaceC3763b m16011a = new C3767f().m16011a(m16010a);
        if (m16011a != null) {
            m16011a.mo15993a(context, m16010a);
        }
    }
}
