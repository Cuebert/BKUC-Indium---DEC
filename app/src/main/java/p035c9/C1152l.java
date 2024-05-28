package p035c9;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;
import p063e9.C3100a;

/* renamed from: c9.l */
/* loaded from: classes.dex */
public class C1152l {
    /* renamed from: a */
    public static boolean m6730a(Context context, Intent intent) {
        List<ResolveInfo> m6732c = m6732c(context, intent);
        return m6732c != null && m6732c.size() > 0;
    }

    /* renamed from: b */
    public static boolean m6731b(Context context) {
        return C3100a.m13625a(context);
    }

    /* renamed from: c */
    private static List<ResolveInfo> m6732c(Context context, Intent intent) {
        return context.getPackageManager().queryIntentActivities(intent, 65536);
    }

    /* renamed from: d */
    public static boolean m6733d() {
        return false;
    }

    /* renamed from: e */
    public static boolean m6734e() {
        return true;
    }

    /* renamed from: f */
    public static boolean m6735f(Context context) {
        try {
            context.getPackageManager().getApplicationInfo("com.android.vending", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: g */
    public static boolean m6736g() {
        return false;
    }

    /* renamed from: h */
    public static void m6737h(Activity activity, String str) {
        String str2;
        String str3;
        if (m6733d()) {
            str2 = "amzn://apps/android?p=" + str;
        } else {
            str2 = "market://details?id=" + str;
        }
        try {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
        } catch (ActivityNotFoundException unused) {
            if (m6733d()) {
                str3 = "https://www.amazon.com/gp/mas/dl/android?p=" + str;
            } else {
                str3 = "https://play.google.com/store/apps/details?id=" + str;
            }
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str3)));
        }
    }
}
