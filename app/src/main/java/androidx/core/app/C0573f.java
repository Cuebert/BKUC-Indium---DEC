package androidx.core.app;

import android.os.Bundle;
import android.os.IBinder;

/* renamed from: androidx.core.app.f */
/* loaded from: classes.dex */
public final class C0573f {

    /* renamed from: androidx.core.app.f$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static IBinder m2764a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        /* renamed from: b */
        static void m2765b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    /* renamed from: a */
    public static IBinder m2763a(Bundle bundle, String str) {
        return a.m2764a(bundle, str);
    }
}
