package p018b4;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import p321z2.C5984j;

/* renamed from: b4.u */
/* loaded from: classes.dex */
public final class C1007u {
    /* renamed from: a */
    public static String m6246a(String str, String[] strArr, String[] strArr2) {
        C5984j.m21286j(strArr);
        C5984j.m21286j(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i10 = 0; i10 < min; i10++) {
            String str2 = strArr[i10];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i10];
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m6247b(Context context, String str, String str2) {
        C5984j.m21286j(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = C0997k.m6226a(context);
        }
        return C0997k.m6227b("google_app_id", resources, str2);
    }
}
