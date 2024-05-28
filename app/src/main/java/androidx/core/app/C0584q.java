package androidx.core.app;

import android.app.Service;
import android.os.Build;

/* renamed from: androidx.core.app.q */
/* loaded from: classes.dex */
public final class C0584q {

    /* renamed from: androidx.core.app.q$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static void m3020a(Service service, int i10) {
            service.stopForeground(i10);
        }
    }

    /* renamed from: a */
    public static void m3019a(Service service, int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            a.m3020a(service, i10);
        } else {
            service.stopForeground((i10 & 1) != 0);
        }
    }
}
