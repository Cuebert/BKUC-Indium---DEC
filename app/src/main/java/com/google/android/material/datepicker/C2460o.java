package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.material.datepicker.o */
/* loaded from: classes.dex */
class C2460o {

    /* renamed from: a */
    static AtomicReference<C2459n> f9427a = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static long m11122a(long j10) {
        Calendar m11132k = m11132k();
        m11132k.setTimeInMillis(j10);
        return m11125d(m11132k).getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(24)
    /* renamed from: b */
    public static DateFormat m11123b(Locale locale) {
        return m11124c("MMMEd", locale);
    }

    @TargetApi(24)
    /* renamed from: c */
    private static DateFormat m11124c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m11131j());
        return instanceForSkeleton;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static Calendar m11125d(Calendar calendar) {
        Calendar m11133l = m11133l(calendar);
        Calendar m11132k = m11132k();
        m11132k.set(m11133l.get(1), m11133l.get(2), m11133l.get(5));
        return m11132k;
    }

    /* renamed from: e */
    private static java.text.DateFormat m11126e(int i10, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i10, locale);
        dateInstance.setTimeZone(m11129h());
        return dateInstance;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static java.text.DateFormat m11127f(Locale locale) {
        return m11126e(0, locale);
    }

    /* renamed from: g */
    static C2459n m11128g() {
        C2459n c2459n = f9427a.get();
        return c2459n == null ? C2459n.m11119c() : c2459n;
    }

    /* renamed from: h */
    private static TimeZone m11129h() {
        return TimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static Calendar m11130i() {
        Calendar m11120a = m11128g().m11120a();
        m11120a.set(11, 0);
        m11120a.set(12, 0);
        m11120a.set(13, 0);
        m11120a.set(14, 0);
        m11120a.setTimeZone(m11129h());
        return m11120a;
    }

    @TargetApi(24)
    /* renamed from: j */
    private static android.icu.util.TimeZone m11131j() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static Calendar m11132k() {
        return m11133l(null);
    }

    /* renamed from: l */
    static Calendar m11133l(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(m11129h());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(24)
    /* renamed from: m */
    public static DateFormat m11134m(Locale locale) {
        return m11124c("yMMMEd", locale);
    }
}
