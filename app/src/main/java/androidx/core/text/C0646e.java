package androidx.core.text;

import android.text.TextUtils;
import com.appsflyer.oaid.BuildConfig;
import java.util.Locale;

/* renamed from: androidx.core.text.e */
/* loaded from: classes.dex */
public final class C0646e {

    /* renamed from: a */
    private static final Locale f3492a = new Locale(BuildConfig.FLAVOR, BuildConfig.FLAVOR);

    /* renamed from: androidx.core.text.e$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static int m3450a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    /* renamed from: a */
    public static int m3449a(Locale locale) {
        return a.m3450a(locale);
    }
}
