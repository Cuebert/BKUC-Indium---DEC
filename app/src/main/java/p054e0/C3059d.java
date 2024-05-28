package p054e0;

import android.os.Build;
import p279w.InterfaceC5092x1;

/* renamed from: e0.d */
/* loaded from: classes.dex */
public class C3059d implements InterfaceC5092x1 {
    /* renamed from: a */
    private static boolean m13512a() {
        return "OPPO".equalsIgnoreCase(Build.MANUFACTURER) && "OP4E75L1".equalsIgnoreCase(Build.DEVICE);
    }

    /* renamed from: b */
    private static boolean m13513b() {
        if ("SAMSUNG".equalsIgnoreCase(Build.MANUFACTURER)) {
            String str = Build.DEVICE;
            if ("F2Q".equalsIgnoreCase(str) || "Q2Q".equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m13514c() {
        return m13513b() || m13512a();
    }
}
