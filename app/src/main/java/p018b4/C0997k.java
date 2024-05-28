package p018b4;

import android.content.Context;
import android.content.res.Resources;
import p282w2.C5107e;

/* renamed from: b4.k */
/* loaded from: classes.dex */
public final class C0997k {
    /* renamed from: a */
    public static String m6226a(Context context) {
        try {
            return context.getResources().getResourcePackageName(C5107e.f19372a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* renamed from: b */
    public static final String m6227b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier != 0) {
            try {
            } catch (Resources.NotFoundException unused) {
                return null;
            }
        }
        return resources.getString(identifier);
    }
}
