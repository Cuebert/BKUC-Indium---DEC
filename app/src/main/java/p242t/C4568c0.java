package p242t;

import android.os.Build;
import p014b0.InterfaceC0963d;
import p218r.C4414z;

/* renamed from: t.c0 */
/* loaded from: classes.dex */
public final class C4568c0 implements InterfaceC0963d {
    /* renamed from: a */
    private static boolean m18653a() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "MotoG3".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: b */
    private static boolean m18654b() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && "SM-G532F".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: c */
    private static boolean m18655c() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && "SM-J700F".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static boolean m18656d(C4414z c4414z) {
        return m18653a() || m18654b() || m18655c();
    }
}
