package androidx.camera.core.impl.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.core.os.C0626e;

/* renamed from: androidx.camera.core.impl.utils.k */
/* loaded from: classes.dex */
public final class C0431k {

    /* renamed from: a */
    private static volatile Handler f1982a;

    private C0431k() {
    }

    /* renamed from: a */
    public static Handler m2118a() {
        if (f1982a != null) {
            return f1982a;
        }
        synchronized (C0431k.class) {
            if (f1982a == null) {
                f1982a = C0626e.m3346a(Looper.getMainLooper());
            }
        }
        return f1982a;
    }
}
