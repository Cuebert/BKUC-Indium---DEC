package androidx.camera.core.impl.utils;

import android.os.Looper;
import androidx.core.util.C0654h;

/* renamed from: androidx.camera.core.impl.utils.l */
/* loaded from: classes.dex */
public final class C0432l {
    /* renamed from: a */
    public static void m2119a() {
        C0654h.m3470i(m2120b(), "Not in application's main thread");
    }

    /* renamed from: b */
    public static boolean m2120b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
