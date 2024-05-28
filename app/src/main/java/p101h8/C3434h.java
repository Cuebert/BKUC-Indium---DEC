package p101h8;

import android.content.Context;
import org.json.JSONException;
import p035c9.C1151k;
import p129j8.C3658a;
import p129j8.C3659b;
import p129j8.C3660c;
import p129j8.C3661d;
import p129j8.C3663f;
import p129j8.C3666i;
import p129j8.InterfaceC3670m;

/* renamed from: h8.h */
/* loaded from: classes.dex */
public class C3434h {
    /* renamed from: a */
    private C3659b m15107a(C3666i c3666i) {
        try {
            return new C3659b(c3666i);
        } catch (C3433g e10) {
            C1151k.m6708b(e10.getMessage());
            return null;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    private InterfaceC3435i m15108b(C3666i c3666i, InterfaceC3670m interfaceC3670m) {
        String m15607d;
        if (c3666i == null || (m15607d = c3666i.m15607d()) == null) {
            return null;
        }
        if (!"FriendRequestAccepted".equals(m15607d) && !"FriendRequestReceived".equals(m15607d) && !"PrivateMessageReceived".equals(m15607d)) {
            if (interfaceC3670m == null || !"ChatNewMessage".equals(m15607d)) {
                return null;
            }
            return m15109d((C3659b) interfaceC3670m);
        }
        return C3442p.m15144c().m15147d(m15607d);
    }

    /* renamed from: d */
    private InterfaceC3435i m15109d(C3659b c3659b) {
        return C3442p.m15144c().m15148e(c3659b.m15573e(), c3659b.m15574f());
    }

    /* renamed from: c */
    InterfaceC3670m m15110c(C3666i c3666i) {
        String m15607d;
        InterfaceC3670m c3663f;
        if (c3666i == null || (m15607d = c3666i.m15607d()) == null) {
            return null;
        }
        try {
            if ("FriendRequestAccepted".equals(m15607d)) {
                c3663f = new C3660c(c3666i);
            } else if ("FriendRequestReceived".equals(m15607d)) {
                c3663f = new C3661d(c3666i);
            } else if ("PrivateMessageReceived".equals(m15607d)) {
                c3663f = new C3663f(c3666i);
            } else {
                if ("ChatNewMessage".equals(m15607d)) {
                    return m15107a(c3666i);
                }
                return null;
            }
            return c3663f;
        } catch (C3433g e10) {
            C1151k.m6708b(e10.getMessage());
            return null;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public void m15111e(Context context, String str, long j10, String str2, boolean z10) {
        C3658a c3658a = new C3658a(str, j10, str2, z10);
        m15113g(c3658a, context, m15109d(c3658a));
    }

    /* renamed from: f */
    public void m15112f(C3666i c3666i, Context context) {
        InterfaceC3670m m15110c = m15110c(c3666i);
        m15113g(m15110c, context, m15108b(c3666i, m15110c));
    }

    /* renamed from: g */
    void m15113g(InterfaceC3670m interfaceC3670m, Context context, InterfaceC3435i interfaceC3435i) {
        if (interfaceC3670m == null || interfaceC3435i == null) {
            return;
        }
        interfaceC3435i.mo15053c(context, interfaceC3670m);
    }
}
