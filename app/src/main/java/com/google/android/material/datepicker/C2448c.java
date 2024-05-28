package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.google.android.material.datepicker.c */
/* loaded from: classes.dex */
class C2448c {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m11045a(long j10) {
        return m11046b(j10, Locale.getDefault());
    }

    /* renamed from: b */
    static String m11046b(long j10, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C2460o.m11123b(locale).format(new Date(j10));
        }
        return C2460o.m11127f(locale).format(new Date(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m11047c(Context context, long j10) {
        return DateUtils.formatDateTime(context, j10 - TimeZone.getDefault().getOffset(j10), 36);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static String m11048d(long j10) {
        return m11049e(j10, Locale.getDefault());
    }

    /* renamed from: e */
    static String m11049e(long j10, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C2460o.m11134m(locale).format(new Date(j10));
        }
        return C2460o.m11127f(locale).format(new Date(j10));
    }
}
