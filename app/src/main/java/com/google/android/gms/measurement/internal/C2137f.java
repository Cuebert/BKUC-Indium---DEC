package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.oaid.BuildConfig;
import java.lang.reflect.InvocationTargetException;
import p070f3.C3138l;
import p096h3.C3393c;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.internal.f */
/* loaded from: classes.dex */
public final class C2137f extends C2154g5 {

    /* renamed from: b */
    private Boolean f8070b;

    /* renamed from: c */
    private InterfaceC2126e f8071c;

    /* renamed from: d */
    private Boolean f8072d;

    public C2137f(C2219m4 c2219m4) {
        super(c2219m4);
        this.f8071c = C2115d.f8038a;
    }

    /* renamed from: I */
    public static final long m9857I() {
        return C2335x2.f8704e.m10317a(null).longValue();
    }

    /* renamed from: i */
    public static final long m9858i() {
        return C2335x2.f8673E.m10317a(null).longValue();
    }

    /* renamed from: j */
    private final String m9859j(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, BuildConfig.FLAVOR);
            C5984j.m21286j(str3);
            return str3;
        } catch (ClassNotFoundException e10) {
            this.f8118a.mo9765d().m10048r().m9894b("Could not find SystemProperties class", e10);
            return BuildConfig.FLAVOR;
        } catch (IllegalAccessException e11) {
            this.f8118a.mo9765d().m10048r().m9894b("Could not access SystemProperties.get()", e11);
            return BuildConfig.FLAVOR;
        } catch (NoSuchMethodException e12) {
            this.f8118a.mo9765d().m10048r().m9894b("Could not find SystemProperties.get() method", e12);
            return BuildConfig.FLAVOR;
        } catch (InvocationTargetException e13) {
            this.f8118a.mo9765d().m10048r().m9894b("SystemProperties.get() threw an exception", e13);
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: A */
    public final boolean m9860A() {
        Boolean m9877t = m9877t("google_analytics_adid_collection_enabled");
        return m9877t == null || m9877t.booleanValue();
    }

    /* renamed from: B */
    public final boolean m9861B(String str, C2325w2<Boolean> c2325w2) {
        boolean parseBoolean;
        if (str == null) {
            return c2325w2.m10317a(null).booleanValue();
        }
        String mo9804a = this.f8071c.mo9804a(str, c2325w2.m10318b());
        if (!TextUtils.isEmpty(mo9804a)) {
            if (this.f8118a.m10134z().m9861B(null, C2335x2.f8672D0)) {
                parseBoolean = "1".equals(mo9804a);
            } else {
                parseBoolean = Boolean.parseBoolean(mo9804a);
            }
            return c2325w2.m10317a(Boolean.valueOf(parseBoolean)).booleanValue();
        }
        return c2325w2.m10317a(null).booleanValue();
    }

    /* renamed from: C */
    public final boolean m9862C(String str) {
        return "1".equals(this.f8071c.mo9804a(str, "gaia_collection_enabled"));
    }

    /* renamed from: D */
    public final boolean m9863D() {
        Boolean m9877t = m9877t("google_analytics_automatic_screen_reporting_enabled");
        return m9877t == null || m9877t.booleanValue();
    }

    /* renamed from: E */
    public final boolean m9864E() {
        this.f8118a.mo9768f();
        Boolean m9877t = m9877t("firebase_analytics_collection_deactivated");
        return m9877t != null && m9877t.booleanValue();
    }

    /* renamed from: F */
    public final boolean m9865F(String str) {
        return "1".equals(this.f8071c.mo9804a(str, "measurement.event_sampling_enabled"));
    }

    /* renamed from: G */
    public final boolean m9866G() {
        if (this.f8070b == null) {
            Boolean m9877t = m9877t("app_measurement_lite");
            this.f8070b = m9877t;
            if (m9877t == null) {
                this.f8070b = Boolean.FALSE;
            }
        }
        return this.f8070b.booleanValue() || !this.f8118a.m10131s();
    }

    /* renamed from: H */
    public final boolean m9867H() {
        if (this.f8072d == null) {
            synchronized (this) {
                if (this.f8072d == null) {
                    ApplicationInfo applicationInfo = this.f8118a.mo9763c().getApplicationInfo();
                    String m13809a = C3138l.m13809a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z10 = false;
                        if (str != null && str.equals(m13809a)) {
                            z10 = true;
                        }
                        this.f8072d = Boolean.valueOf(z10);
                    }
                    if (this.f8072d == null) {
                        this.f8072d = Boolean.TRUE;
                        this.f8118a.mo9765d().m10048r().m9893a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f8072d.booleanValue();
    }

    /* renamed from: k */
    public final double m9868k(String str, C2325w2<Double> c2325w2) {
        if (str == null) {
            return c2325w2.m10317a(null).doubleValue();
        }
        String mo9804a = this.f8071c.mo9804a(str, c2325w2.m10318b());
        if (TextUtils.isEmpty(mo9804a)) {
            return c2325w2.m10317a(null).doubleValue();
        }
        try {
            return c2325w2.m10317a(Double.valueOf(Double.parseDouble(mo9804a))).doubleValue();
        } catch (NumberFormatException unused) {
            return c2325w2.m10317a(null).doubleValue();
        }
    }

    /* renamed from: l */
    public final int m9869l(String str) {
        return m9873p(str, C2335x2.f8678I, 500, 2000);
    }

    /* renamed from: m */
    public final int m9870m() {
        C2169h9 m10114N = this.f8118a.m10114N();
        Boolean m10369J = m10114N.f8118a.m10112L().m10369J();
        if (m10114N.m9971o0() < 201500) {
            return (m10369J == null || m10369J.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    /* renamed from: n */
    public final int m9871n(String str) {
        return m9873p(str, C2335x2.f8679J, 25, 100);
    }

    /* renamed from: o */
    public final int m9872o(String str, C2325w2<Integer> c2325w2) {
        if (str == null) {
            return c2325w2.m10317a(null).intValue();
        }
        String mo9804a = this.f8071c.mo9804a(str, c2325w2.m10318b());
        if (TextUtils.isEmpty(mo9804a)) {
            return c2325w2.m10317a(null).intValue();
        }
        try {
            return c2325w2.m10317a(Integer.valueOf(Integer.parseInt(mo9804a))).intValue();
        } catch (NumberFormatException unused) {
            return c2325w2.m10317a(null).intValue();
        }
    }

    /* renamed from: p */
    public final int m9873p(String str, C2325w2<Integer> c2325w2, int i10, int i11) {
        return Math.max(Math.min(m9872o(str, c2325w2), i11), i10);
    }

    /* renamed from: q */
    public final long m9874q() {
        this.f8118a.mo9768f();
        return 46000L;
    }

    /* renamed from: r */
    public final long m9875r(String str, C2325w2<Long> c2325w2) {
        if (str == null) {
            return c2325w2.m10317a(null).longValue();
        }
        String mo9804a = this.f8071c.mo9804a(str, c2325w2.m10318b());
        if (TextUtils.isEmpty(mo9804a)) {
            return c2325w2.m10317a(null).longValue();
        }
        try {
            return c2325w2.m10317a(Long.valueOf(Long.parseLong(mo9804a))).longValue();
        } catch (NumberFormatException unused) {
            return c2325w2.m10317a(null).longValue();
        }
    }

    /* renamed from: s */
    final Bundle m9876s() {
        try {
            if (this.f8118a.mo9763c().getPackageManager() == null) {
                this.f8118a.mo9765d().m10048r().m9893a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo m14947b = C3393c.m14952a(this.f8118a.mo9763c()).m14947b(this.f8118a.mo9763c().getPackageName(), 128);
            if (m14947b == null) {
                this.f8118a.mo9765d().m10048r().m9893a("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return m14947b.metaData;
        } catch (PackageManager.NameNotFoundException e10) {
            this.f8118a.mo9765d().m10048r().m9894b("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    /* renamed from: t */
    public final Boolean m9877t(String str) {
        C5984j.m21282f(str);
        Bundle m9876s = m9876s();
        if (m9876s == null) {
            this.f8118a.mo9765d().m10048r().m9893a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (m9876s.containsKey(str)) {
            return Boolean.valueOf(m9876s.getBoolean(str));
        }
        return null;
    }

    /* renamed from: u */
    public final String m9878u() {
        return m9859j("debug.firebase.analytics.app", BuildConfig.FLAVOR);
    }

    /* renamed from: v */
    public final String m9879v() {
        return m9859j("debug.deferred.deeplink", BuildConfig.FLAVOR);
    }

    /* renamed from: w */
    public final String m9880w() {
        this.f8118a.mo9768f();
        return "FA";
    }

    /* renamed from: x */
    public final String m9881x(String str, C2325w2<String> c2325w2) {
        if (str == null) {
            return c2325w2.m10317a(null);
        }
        return c2325w2.m10317a(this.f8071c.mo9804a(str, c2325w2.m10318b()));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> m9882y(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            p321z2.C5984j.m21282f(r4)
            android.os.Bundle r0 = r3.m9876s()
            r1 = 0
            if (r0 != 0) goto L1d
            com.google.android.gms.measurement.internal.m4 r4 = r3.f8118a
            com.google.android.gms.measurement.internal.i3 r4 = r4.mo9765d()
            com.google.android.gms.measurement.internal.g3 r4 = r4.m10048r()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.m9893a(r0)
        L1b:
            r4 = r1
            goto L2c
        L1d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L24
            goto L1b
        L24:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L2c:
            if (r4 == 0) goto L58
            com.google.android.gms.measurement.internal.m4 r0 = r3.f8118a     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.Context r0 = r0.mo9763c()     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L48
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L48
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            if (r4 != 0) goto L43
            return r1
        L43:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            return r4
        L48:
            r4 = move-exception
            com.google.android.gms.measurement.internal.m4 r0 = r3.f8118a
            com.google.android.gms.measurement.internal.i3 r0 = r0.mo9765d()
            com.google.android.gms.measurement.internal.g3 r0 = r0.m10048r()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.m9894b(r2, r4)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2137f.m9882y(java.lang.String):java.util.List");
    }

    /* renamed from: z */
    public final void m9883z(InterfaceC2126e interfaceC2126e) {
        this.f8071c = interfaceC2126e;
    }
}
