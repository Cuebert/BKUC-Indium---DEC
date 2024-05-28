package p070f3;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.C1382e;
import p096h3.C3393c;

/* renamed from: f3.n */
/* loaded from: classes.dex */
public final class C3140n {
    /* renamed from: a */
    public static boolean m13811a(Context context, int i10) {
        if (!m13812b(context, i10, "com.google.android.gms")) {
            return false;
        }
        try {
            return C1382e.m7607a(context).m7611b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @TargetApi(19)
    /* renamed from: b */
    public static boolean m13812b(Context context, int i10, String str) {
        return C3393c.m14952a(context).m14951f(i10, str);
    }
}
