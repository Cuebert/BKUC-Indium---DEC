package p101h8;

import android.content.Context;
import org.json.JSONException;
import p035c9.C1146f;
import p129j8.C3664g;
import p129j8.C3666i;

/* renamed from: h8.c */
/* loaded from: classes.dex */
public class C3429c {
    /* renamed from: a */
    private long m15084a(String str) {
        return C1146f.m6696a(str);
    }

    /* renamed from: d */
    private InterfaceC3435i m15085d(String str) {
        return C3442p.m15144c().m15146b(str);
    }

    /* renamed from: e */
    private InterfaceC3435i m15086e(String str) {
        return C3442p.m15144c().m15147d(str);
    }

    /* renamed from: f */
    private String m15087f(C3664g c3664g) {
        if (c3664g != null) {
            return c3664g.m15601f();
        }
        return null;
    }

    /* renamed from: g */
    private String m15088g(C3664g c3664g) {
        if (c3664g != null) {
            return c3664g.m15600e();
        }
        return null;
    }

    /* renamed from: b */
    public void m15089b(C3666i c3666i, Context context) {
        C3664g m15090c = m15090c(c3666i);
        if (m15090c != null) {
            String m15088g = m15088g(m15090c);
            String m15087f = m15087f(m15090c);
            if (m15087f == null || m15088g == null) {
                return;
            }
            long m15084a = m15084a(m15087f);
            char c10 = 65535;
            switch (m15088g.hashCode()) {
                case 624927928:
                    if (m15088g.equals("FriendRequestAccepted")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 929482719:
                    if (m15088g.equals("ChatNewMessage")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1050705701:
                    if (m15088g.equals("PrivateMessageReceived")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1962733298:
                    if (m15088g.equals("FriendRequestReceived")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 2:
                case 3:
                    m15091h(m15086e(m15088g), context, m15084a);
                    return;
                case 1:
                    m15091h(m15085d(m15090c.m15599d()), context, m15084a);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: c */
    C3664g m15090c(C3666i c3666i) {
        try {
            return new C3664g(c3666i);
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: h */
    void m15091h(InterfaceC3435i interfaceC3435i, Context context, long j10) {
        if (interfaceC3435i != null) {
            interfaceC3435i.mo15054d(context, j10);
        }
    }
}
