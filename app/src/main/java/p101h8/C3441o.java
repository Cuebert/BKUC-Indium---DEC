package p101h8;

import android.content.Context;
import com.roblox.client.C2872n;
import com.roblox.client.C2877p0;
import com.roblox.client.fcm.C2825a;
import p035c9.C1152l;
import p164m6.C3958a;

/* renamed from: h8.o */
/* loaded from: classes.dex */
public class C3441o {

    /* renamed from: a */
    private static C3441o f14326a;

    /* renamed from: a */
    public static C3441o m15141a() {
        if (f14326a == null) {
            synchronized (InterfaceC3440n.class) {
                if (f14326a == null) {
                    f14326a = new C3441o();
                }
            }
        }
        return f14326a;
    }

    /* renamed from: b */
    public InterfaceC3440n m15142b(Context context) {
        if (m15143c(context)) {
            return null;
        }
        InterfaceC3440n m12843n = C2872n.m12830h().m12843n();
        if (m12843n != null) {
            return m12843n;
        }
        if (C1152l.m6733d()) {
            return new C3958a();
        }
        return new C2825a();
    }

    /* renamed from: c */
    public boolean m15143c(Context context) {
        return C2877p0.m12948t(context);
    }
}
