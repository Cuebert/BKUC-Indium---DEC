package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: com.google.android.material.datepicker.n */
/* loaded from: classes.dex */
class C2459n {

    /* renamed from: c */
    private static final C2459n f9424c = new C2459n(null, null);

    /* renamed from: a */
    private final Long f9425a;

    /* renamed from: b */
    private final TimeZone f9426b;

    private C2459n(Long l10, TimeZone timeZone) {
        this.f9425a = l10;
        this.f9426b = timeZone;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C2459n m11119c() {
        return f9424c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Calendar m11120a() {
        return m11121b(this.f9426b);
    }

    /* renamed from: b */
    Calendar m11121b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = this.f9425a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        return calendar;
    }
}
