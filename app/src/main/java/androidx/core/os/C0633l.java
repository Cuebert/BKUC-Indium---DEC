package androidx.core.os;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: androidx.core.os.l */
/* loaded from: classes.dex */
public class C0633l {

    /* renamed from: androidx.core.os.l$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static boolean m3365a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    /* renamed from: a */
    public static boolean m3364a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.m3365a(context);
        }
        return true;
    }
}
