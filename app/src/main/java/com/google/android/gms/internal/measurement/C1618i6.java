package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import com.appsflyer.oaid.BuildConfig;

/* renamed from: com.google.android.gms.internal.measurement.i6 */
/* loaded from: classes.dex */
public final class C1618i6 {

    /* renamed from: a */
    final String f6844a;

    /* renamed from: b */
    final Uri f6845b;

    /* renamed from: c */
    final String f6846c;

    /* renamed from: d */
    final String f6847d;

    /* renamed from: e */
    final boolean f6848e;

    /* renamed from: f */
    final boolean f6849f;

    /* renamed from: g */
    final boolean f6850g;

    /* renamed from: h */
    final boolean f6851h;

    /* renamed from: i */
    final InterfaceC1730p6<Context, Boolean> f6852i;

    public C1618i6(Uri uri) {
        this(null, uri, BuildConfig.FLAVOR, BuildConfig.FLAVOR, false, false, false, false, null);
    }

    private C1618i6(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, InterfaceC1730p6<Context, Boolean> interfaceC1730p6) {
        this.f6844a = null;
        this.f6845b = uri;
        this.f6846c = BuildConfig.FLAVOR;
        this.f6847d = BuildConfig.FLAVOR;
        this.f6848e = z10;
        this.f6849f = false;
        this.f6850g = false;
        this.f6851h = false;
        this.f6852i = null;
    }

    /* renamed from: a */
    public final C1618i6 m8298a() {
        if (this.f6846c.isEmpty()) {
            return new C1618i6(null, this.f6845b, this.f6846c, this.f6847d, true, false, false, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    /* renamed from: b */
    public final AbstractC1666l6<Double> m8299b(String str, double d10) {
        return new C1584g6(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    /* renamed from: c */
    public final AbstractC1666l6<Long> m8300c(String str, long j10) {
        return new C1550e6(this, str, Long.valueOf(j10), true);
    }

    /* renamed from: d */
    public final AbstractC1666l6<String> m8301d(String str, String str2) {
        return new C1601h6(this, str, str2, true);
    }

    /* renamed from: e */
    public final AbstractC1666l6<Boolean> m8302e(String str, boolean z10) {
        return new C1567f6(this, str, Boolean.valueOf(z10), true);
    }
}
