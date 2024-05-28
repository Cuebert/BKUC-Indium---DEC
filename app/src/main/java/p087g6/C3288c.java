package p087g6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.appsflyer.oaid.BuildConfig;
import java.util.Locale;
import p070f3.C3137k;
import p321z2.C5970c;

/* renamed from: g6.c */
/* loaded from: classes.dex */
public class C3288c {

    /* renamed from: a */
    private static final C5970c f13743a = new C5970c("CommonUtils", BuildConfig.FLAVOR);

    @RecentlyNonNull
    /* renamed from: a */
    public static String m14547a(@RecentlyNonNull Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e10) {
            C5970c c5970c = f13743a;
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 48);
            sb2.append("Exception thrown when trying to get app version ");
            sb2.append(valueOf);
            c5970c.m21258c("CommonUtils", sb2.toString());
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: b */
    public static String m14548b(@RecentlyNonNull Locale locale) {
        if (C3137k.m13802f()) {
            return locale.toLanguageTag();
        }
        StringBuilder sb2 = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb2.append("-");
            sb2.append(locale.getCountry());
        }
        if (!TextUtils.isEmpty(locale.getVariant())) {
            sb2.append("-");
            sb2.append(locale.getVariant());
        }
        return sb2.toString();
    }
}
