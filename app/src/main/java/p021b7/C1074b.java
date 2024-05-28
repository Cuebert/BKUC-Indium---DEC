package p021b7;

import android.content.Context;
import com.roblox.client.C2748c0;

/* renamed from: b7.b */
/* loaded from: classes.dex */
public class C1074b {
    /* renamed from: a */
    public static String m6367a(Context context, String str) {
        if (context == null) {
            return null;
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1442032290:
                if (str.equals("SETTINGS_TAG")) {
                    c10 = 0;
                    break;
                }
                break;
            case -734952016:
                if (str.equals("FRIENDS_TAG")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1050009095:
                if (str.equals("MESSAGES_TAG")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1147058740:
                if (str.equals("CATALOG_TAG")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return context.getString(C2748c0.f10620a3);
            case 1:
                return context.getString(C2748c0.f10569Q2);
            case 2:
                return context.getString(C2748c0.f10584T2);
            case 3:
                return context.getString(C2748c0.f10559O2);
            default:
                return null;
        }
    }
}
