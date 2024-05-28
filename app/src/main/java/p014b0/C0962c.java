package p014b0;

import android.os.Build;
import p279w.C5045k0;
import p279w.InterfaceC5061o0;
import p279w.InterfaceC5092x1;

/* renamed from: b0.c */
/* loaded from: classes.dex */
public final class C0962c implements InterfaceC5092x1 {
    /* renamed from: a */
    private static boolean m6141a() {
        return "HONOR".equalsIgnoreCase(Build.BRAND) && "STK-LX1".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: b */
    private static boolean m6142b() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "SNE-LX1".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: d */
    public static boolean m6143d() {
        return m6142b() || m6141a();
    }

    /* renamed from: c */
    public boolean m6144c(InterfaceC5061o0.a<?> aVar) {
        return aVar != C5045k0.f19211h;
    }
}
