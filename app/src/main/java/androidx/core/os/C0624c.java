package androidx.core.os;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

/* renamed from: androidx.core.os.c */
/* loaded from: classes.dex */
public final class C0624c {

    /* renamed from: androidx.core.os.c$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static LocaleList m3344a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    /* renamed from: a */
    public static C0627f m3343a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? C0627f.m3352e(a.m3344a(configuration)) : C0627f.m3350a(configuration.locale);
    }
}
