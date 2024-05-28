package p101h8;

import android.content.Context;
import org.json.JSONException;
import p129j8.C3665h;
import p129j8.C3666i;

/* renamed from: h8.d */
/* loaded from: classes.dex */
public class C3430d {
    /* renamed from: d */
    private InterfaceC3435i m15092d(String str) {
        return C3442p.m15144c().m15147d(str);
    }

    /* renamed from: e */
    private String m15093e(C3665h c3665h) {
        if (c3665h != null) {
            return c3665h.m15602d();
        }
        return null;
    }

    /* renamed from: f */
    private String m15094f(C3665h c3665h) {
        if (c3665h != null) {
            return c3665h.m15603e();
        }
        return null;
    }

    /* renamed from: a */
    void m15095a(Context context, InterfaceC3435i interfaceC3435i, String str) {
        if (interfaceC3435i != null) {
            interfaceC3435i.mo15052b(context, str);
        }
    }

    /* renamed from: b */
    public void m15096b(C3666i c3666i, Context context) {
        C3665h m15097c = m15097c(c3666i);
        if (m15097c != null) {
            String m15094f = m15094f(m15097c);
            String m15093e = m15093e(m15097c);
            if (m15094f == null || m15093e == null) {
                return;
            }
            m15095a(context, m15092d(m15094f), m15093e);
        }
    }

    /* renamed from: c */
    C3665h m15097c(C3666i c3666i) {
        try {
            return new C3665h(c3666i);
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
