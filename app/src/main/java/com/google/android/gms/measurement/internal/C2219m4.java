package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.internal.measurement.AbstractC1666l6;
import com.google.android.gms.internal.measurement.C1720oc;
import com.google.android.gms.internal.measurement.C1768rc;
import com.google.android.gms.internal.measurement.zzcl;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import p018b4.C0987a;
import p018b4.C0998l;
import p070f3.C3133g;
import p070f3.InterfaceC3130d;
import p096h3.C3393c;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.internal.m4 */
/* loaded from: classes.dex */
public final class C2219m4 implements InterfaceC2176i5 {

    /* renamed from: H */
    private static volatile C2219m4 f8295H;

    /* renamed from: A */
    private volatile Boolean f8296A;

    /* renamed from: B */
    protected Boolean f8297B;

    /* renamed from: C */
    protected Boolean f8298C;

    /* renamed from: D */
    private volatile boolean f8299D;

    /* renamed from: E */
    private int f8300E;

    /* renamed from: G */
    final long f8302G;

    /* renamed from: a */
    private final Context f8303a;

    /* renamed from: b */
    private final String f8304b;

    /* renamed from: c */
    private final String f8305c;

    /* renamed from: d */
    private final String f8306d;

    /* renamed from: e */
    private final boolean f8307e;

    /* renamed from: f */
    private final C2093b f8308f;

    /* renamed from: g */
    private final C2137f f8309g;

    /* renamed from: h */
    private final C2326w3 f8310h;

    /* renamed from: i */
    private final C2174i3 f8311i;

    /* renamed from: j */
    private final C2197k4 f8312j;

    /* renamed from: k */
    private final C2234n8 f8313k;

    /* renamed from: l */
    private final C2169h9 f8314l;

    /* renamed from: m */
    private final C2119d3 f8315m;

    /* renamed from: n */
    private final InterfaceC3130d f8316n;

    /* renamed from: o */
    private final C2349y6 f8317o;

    /* renamed from: p */
    private final C2221m6 f8318p;

    /* renamed from: q */
    private final C2354z1 f8319q;

    /* renamed from: r */
    private final C2254p6 f8320r;

    /* renamed from: s */
    private final String f8321s;

    /* renamed from: t */
    private C2108c3 f8322t;

    /* renamed from: u */
    private C2350y7 f8323u;

    /* renamed from: v */
    private C2214m f8324v;

    /* renamed from: w */
    private C2086a3 f8325w;

    /* renamed from: y */
    private Boolean f8327y;

    /* renamed from: z */
    private long f8328z;

    /* renamed from: x */
    private boolean f8326x = false;

    /* renamed from: F */
    private final AtomicInteger f8301F = new AtomicInteger(0);

    C2219m4(C2198k5 c2198k5) {
        long mo13781a;
        Bundle bundle;
        C5984j.m21286j(c2198k5);
        C2093b c2093b = new C2093b(c2198k5.f8238a);
        this.f8308f = c2093b;
        C2315v2.f8607a = c2093b;
        Context context = c2198k5.f8238a;
        this.f8303a = context;
        this.f8304b = c2198k5.f8239b;
        this.f8305c = c2198k5.f8240c;
        this.f8306d = c2198k5.f8241d;
        this.f8307e = c2198k5.f8245h;
        this.f8296A = c2198k5.f8242e;
        this.f8321s = c2198k5.f8247j;
        this.f8299D = true;
        zzcl zzclVar = c2198k5.f8244g;
        if (zzclVar != null && (bundle = zzclVar.f7363t) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f8297B = (Boolean) obj;
            }
            Object obj2 = zzclVar.f7363t.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f8298C = (Boolean) obj2;
            }
        }
        AbstractC1666l6.m8378d(context);
        InterfaceC3130d m13786c = C3133g.m13786c();
        this.f8316n = m13786c;
        Long l10 = c2198k5.f8246i;
        if (l10 != null) {
            mo13781a = l10.longValue();
        } else {
            mo13781a = m13786c.mo13781a();
        }
        this.f8302G = mo13781a;
        this.f8309g = new C2137f(this);
        C2326w3 c2326w3 = new C2326w3(this);
        c2326w3.m9922l();
        this.f8310h = c2326w3;
        C2174i3 c2174i3 = new C2174i3(this);
        c2174i3.m9922l();
        this.f8311i = c2174i3;
        C2169h9 c2169h9 = new C2169h9(this);
        c2169h9.m9922l();
        this.f8314l = c2169h9;
        this.f8315m = new C2119d3(new C2187j5(c2198k5, this));
        this.f8319q = new C2354z1(this);
        C2349y6 c2349y6 = new C2349y6(this);
        c2349y6.m10314j();
        this.f8317o = c2349y6;
        C2221m6 c2221m6 = new C2221m6(this);
        c2221m6.m10314j();
        this.f8318p = c2221m6;
        C2234n8 c2234n8 = new C2234n8(this);
        c2234n8.m10314j();
        this.f8313k = c2234n8;
        C2254p6 c2254p6 = new C2254p6(this);
        c2254p6.m9922l();
        this.f8320r = c2254p6;
        C2197k4 c2197k4 = new C2197k4(this);
        c2197k4.m9922l();
        this.f8312j = c2197k4;
        zzcl zzclVar2 = c2198k5.f8244g;
        boolean z10 = zzclVar2 == null || zzclVar2.f7358o == 0;
        if (context.getApplicationContext() instanceof Application) {
            C2221m6 m10109I = m10109I();
            if (m10109I.f8118a.f8303a.getApplicationContext() instanceof Application) {
                Application application = (Application) m10109I.f8118a.f8303a.getApplicationContext();
                if (m10109I.f8331c == null) {
                    m10109I.f8331c = new C2199k6(m10109I, null);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(m10109I.f8331c);
                    application.registerActivityLifecycleCallbacks(m10109I.f8331c);
                    m10109I.f8118a.mo9765d().m10052v().m9893a("Registered activity lifecycle callback");
                }
            }
        } else {
            mo9765d().m10053w().m9893a("Application context is not an Application");
        }
        c2197k4.m10081z(new RunnableC2208l4(this, c2198k5));
    }

    /* renamed from: H */
    public static C2219m4 m10096H(Context context, zzcl zzclVar, Long l10) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.f7361r == null || zzclVar.f7362s == null)) {
            zzclVar = new zzcl(zzclVar.f7357n, zzclVar.f7358o, zzclVar.f7359p, zzclVar.f7360q, null, null, zzclVar.f7363t, null);
        }
        C5984j.m21286j(context);
        C5984j.m21286j(context.getApplicationContext());
        if (f8295H == null) {
            synchronized (C2219m4.class) {
                if (f8295H == null) {
                    f8295H = new C2219m4(new C2198k5(context, zzclVar, l10));
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.f7363t) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            C5984j.m21286j(f8295H);
            f8295H.f8296A = Boolean.valueOf(zzclVar.f7363t.getBoolean("dataCollectionDefaultEnabled"));
        }
        C5984j.m21286j(f8295H);
        return f8295H;
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ void m10097a(C2219m4 c2219m4, C2198k5 c2198k5) {
        c2219m4.mo9761b().mo9917h();
        c2219m4.f8309g.m9880w();
        C2214m c2214m = new C2214m(c2219m4);
        c2214m.m9922l();
        c2219m4.f8324v = c2214m;
        C2086a3 c2086a3 = new C2086a3(c2219m4, c2198k5.f8243f);
        c2086a3.m10314j();
        c2219m4.f8325w = c2086a3;
        C2108c3 c2108c3 = new C2108c3(c2219m4);
        c2108c3.m10314j();
        c2219m4.f8322t = c2108c3;
        C2350y7 c2350y7 = new C2350y7(c2219m4);
        c2350y7.m10314j();
        c2219m4.f8323u = c2350y7;
        c2219m4.f8314l.m9923m();
        c2219m4.f8310h.m9923m();
        c2219m4.f8325w.m10315k();
        C2152g3 m10051u = c2219m4.mo9765d().m10051u();
        c2219m4.f8309g.m9874q();
        m10051u.m9894b("App measurement initialized, version", 46000L);
        c2219m4.mo9765d().m10051u().m9893a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String m9723s = c2086a3.m9723s();
        if (TextUtils.isEmpty(c2219m4.f8304b)) {
            if (c2219m4.m10114N().m9960S(m9723s)) {
                c2219m4.mo9765d().m10051u().m9893a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                C2152g3 m10051u2 = c2219m4.mo9765d().m10051u();
                String valueOf = String.valueOf(m9723s);
                m10051u2.m9893a(valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "));
            }
        }
        c2219m4.mo9765d().m10047q().m9893a("Debug-level message logging enabled");
        if (c2219m4.f8300E != c2219m4.f8301F.get()) {
            c2219m4.mo9765d().m10048r().m9895c("Not all components initialized", Integer.valueOf(c2219m4.f8300E), Integer.valueOf(c2219m4.f8301F.get()));
        }
        c2219m4.f8326x = true;
    }

    /* renamed from: t */
    public static final void m10098t() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* renamed from: u */
    private static final void m10099u(C2154g5 c2154g5) {
        if (c2154g5 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: v */
    private static final void m10100v(AbstractC2316v3 abstractC2316v3) {
        if (abstractC2316v3 != null) {
            if (!abstractC2316v3.m10316m()) {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC2316v3.getClass())));
            }
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: w */
    private static final void m10101w(AbstractC2165h5 abstractC2165h5) {
        if (abstractC2165h5 != null) {
            if (!abstractC2165h5.m9924n()) {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC2165h5.getClass())));
            }
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: A */
    public final C2214m m10102A() {
        m10101w(this.f8324v);
        return this.f8324v;
    }

    /* renamed from: B */
    public final C2086a3 m10103B() {
        m10100v(this.f8325w);
        return this.f8325w;
    }

    /* renamed from: C */
    public final C2108c3 m10104C() {
        m10100v(this.f8322t);
        return this.f8322t;
    }

    /* renamed from: D */
    public final C2119d3 m10105D() {
        return this.f8315m;
    }

    /* renamed from: E */
    public final C2174i3 m10106E() {
        C2174i3 c2174i3 = this.f8311i;
        if (c2174i3 == null || !c2174i3.m9924n()) {
            return null;
        }
        return this.f8311i;
    }

    /* renamed from: F */
    public final C2326w3 m10107F() {
        m10099u(this.f8310h);
        return this.f8310h;
    }

    /* renamed from: G */
    public final C2197k4 m10108G() {
        return this.f8312j;
    }

    /* renamed from: I */
    public final C2221m6 m10109I() {
        m10100v(this.f8318p);
        return this.f8318p;
    }

    /* renamed from: J */
    public final C2254p6 m10110J() {
        m10101w(this.f8320r);
        return this.f8320r;
    }

    /* renamed from: K */
    public final C2349y6 m10111K() {
        m10100v(this.f8317o);
        return this.f8317o;
    }

    /* renamed from: L */
    public final C2350y7 m10112L() {
        m10100v(this.f8323u);
        return this.f8323u;
    }

    /* renamed from: M */
    public final C2234n8 m10113M() {
        m10100v(this.f8313k);
        return this.f8313k;
    }

    /* renamed from: N */
    public final C2169h9 m10114N() {
        m10099u(this.f8314l);
        return this.f8314l;
    }

    /* renamed from: O */
    public final String m10115O() {
        return this.f8304b;
    }

    /* renamed from: P */
    public final String m10116P() {
        return this.f8305c;
    }

    /* renamed from: Q */
    public final String m10117Q() {
        return this.f8306d;
    }

    /* renamed from: R */
    public final String m10118R() {
        return this.f8321s;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2176i5
    /* renamed from: b */
    public final C2197k4 mo9761b() {
        m10101w(this.f8312j);
        return this.f8312j;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2176i5
    /* renamed from: c */
    public final Context mo9763c() {
        return this.f8303a;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2176i5
    /* renamed from: d */
    public final C2174i3 mo9765d() {
        m10101w(this.f8311i);
        return this.f8311i;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2176i5
    /* renamed from: e */
    public final InterfaceC3130d mo9767e() {
        return this.f8316n;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2176i5
    /* renamed from: f */
    public final C2093b mo9768f() {
        return this.f8308f;
    }

    /* renamed from: g */
    public final void m10119g() {
        this.f8301F.incrementAndGet();
    }

    /* renamed from: h */
    public final /* synthetic */ void m10120h(String str, int i10, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        if (i10 != 200 && i10 != 204) {
            if (i10 == 304) {
                i10 = 304;
            }
            mo9765d().m10053w().m9895c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th);
        }
        if (th == null) {
            m10107F().f8645r.m10212a(true);
            if (bArr != null && bArr.length != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String optString = jSONObject.optString("deeplink", BuildConfig.FLAVOR);
                    String optString2 = jSONObject.optString("gclid", BuildConfig.FLAVOR);
                    double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                    if (TextUtils.isEmpty(optString)) {
                        mo9765d().m10047q().m9893a("Deferred Deep Link is empty.");
                        return;
                    }
                    C2169h9 m10114N = m10114N();
                    C2219m4 c2219m4 = m10114N.f8118a;
                    if (!TextUtils.isEmpty(optString) && (queryIntentActivities = m10114N.f8118a.f8303a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.f8318p.m10175u("auto", "_cmp", bundle);
                        C2169h9 m10114N2 = m10114N();
                        if (TextUtils.isEmpty(optString)) {
                            return;
                        }
                        try {
                            SharedPreferences.Editor edit = m10114N2.f8118a.f8303a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            edit.putString("deeplink", optString);
                            edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                            if (edit.commit()) {
                                m10114N2.f8118a.f8303a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                return;
                            }
                            return;
                        } catch (RuntimeException e10) {
                            m10114N2.f8118a.mo9765d().m10048r().m9894b("Failed to persist Deferred Deep Link. exception", e10);
                            return;
                        }
                    }
                    mo9765d().m10053w().m9895c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                    return;
                } catch (JSONException e11) {
                    mo9765d().m10048r().m9894b("Failed to parse the Deferred Deep Link response. exception", e11);
                    return;
                }
            }
            mo9765d().m10047q().m9893a("Deferred Deep Link response empty.");
            return;
        }
        mo9765d().m10053w().m9895c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th);
    }

    /* renamed from: i */
    public final void m10121i() {
        this.f8300E++;
    }

    /* renamed from: j */
    public final void m10122j() {
        mo9761b().mo9917h();
        m10101w(m10110J());
        String m9723s = m10103B().m9723s();
        Pair<String, Boolean> m10320p = m10107F().m10320p(m9723s);
        if (this.f8309g.m9860A() && !((Boolean) m10320p.second).booleanValue() && !TextUtils.isEmpty((CharSequence) m10320p.first)) {
            C2254p6 m10110J = m10110J();
            m10110J.m9921k();
            ConnectivityManager connectivityManager = (ConnectivityManager) m10110J.f8118a.f8303a.getSystemService("connectivity");
            NetworkInfo networkInfo = null;
            if (connectivityManager != null) {
                try {
                    networkInfo = connectivityManager.getActiveNetworkInfo();
                } catch (SecurityException unused) {
                }
            }
            if (networkInfo != null && networkInfo.isConnected()) {
                C2169h9 m10114N = m10114N();
                m10103B().f8118a.f8309g.m9874q();
                URL m9975r = m10114N.m9975r(46000L, m9723s, (String) m10320p.first, m10107F().f8646s.m10298a() - 1);
                if (m9975r != null) {
                    C2254p6 m10110J2 = m10110J();
                    C0998l c0998l = new C0998l(this);
                    m10110J2.mo9917h();
                    m10110J2.m9921k();
                    C5984j.m21286j(m9975r);
                    C5984j.m21286j(c0998l);
                    m10110J2.f8118a.mo9761b().m10080y(new RunnableC2243o6(m10110J2, m9723s, m9975r, null, null, c0998l, null));
                    return;
                }
                return;
            }
            mo9765d().m10053w().m9893a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        mo9765d().m10047q().m9893a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
    }

    /* renamed from: k */
    public final void m10123k(boolean z10) {
        this.f8296A = Boolean.valueOf(z10);
    }

    /* renamed from: l */
    public final void m10124l(boolean z10) {
        mo9761b().mo9917h();
        this.f8299D = z10;
    }

    /* renamed from: m */
    public final void m10125m(zzcl zzclVar) {
        C0987a c0987a;
        mo9761b().mo9917h();
        C0987a m10321q = m10107F().m10321q();
        C2326w3 m10107F = m10107F();
        C2219m4 c2219m4 = m10107F.f8118a;
        m10107F.mo9917h();
        int i10 = 100;
        int i11 = m10107F.m10319o().getInt("consent_source", 100);
        C2137f c2137f = this.f8309g;
        C2219m4 c2219m42 = c2137f.f8118a;
        Boolean m9877t = c2137f.m9877t("google_analytics_default_allow_ad_storage");
        C2137f c2137f2 = this.f8309g;
        C2219m4 c2219m43 = c2137f2.f8118a;
        Boolean m9877t2 = c2137f2.m9877t("google_analytics_default_allow_analytics_storage");
        if ((m9877t != null || m9877t2 != null) && m10107F().m10327w(-10)) {
            c0987a = new C0987a(m9877t, m9877t2);
            i10 = -10;
        } else {
            if (!TextUtils.isEmpty(m10103B().m9725u()) && (i11 == 0 || i11 == 30 || i11 == 10 || i11 == 30 || i11 == 30 || i11 == 40)) {
                m10109I().m10147G(C0987a.f5174c, -10, this.f8302G);
            } else {
                C1768rc.m8768b();
                if ((!this.f8309g.m9861B(null, C2335x2.f8735t0) || TextUtils.isEmpty(m10103B().m9725u())) && zzclVar != null && zzclVar.f7363t != null && m10107F().m10327w(30)) {
                    c0987a = C0987a.m6188a(zzclVar.f7363t);
                    if (!c0987a.equals(C0987a.f5174c)) {
                        i10 = 30;
                    }
                }
            }
            c0987a = null;
        }
        if (c0987a != null) {
            m10109I().m10147G(c0987a, i10, this.f8302G);
            m10321q = c0987a;
        }
        m10109I().m10151K(m10321q);
        if (m10107F().f8632e.m10298a() == 0) {
            mo9765d().m10052v().m9894b("Persisting first open", Long.valueOf(this.f8302G));
            m10107F().f8632e.m10299b(this.f8302G);
        }
        m10109I().f8342n.m10193c();
        if (!m10130r()) {
            if (m10127o()) {
                if (!m10114N().m9959R("android.permission.INTERNET")) {
                    mo9765d().m10048r().m9893a("App is missing INTERNET permission");
                }
                if (!m10114N().m9959R("android.permission.ACCESS_NETWORK_STATE")) {
                    mo9765d().m10048r().m9893a("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!C3393c.m14952a(this.f8303a).m14950e() && !this.f8309g.m9866G()) {
                    if (!C2169h9.m9928X(this.f8303a)) {
                        mo9765d().m10048r().m9893a("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!C2169h9.m9929Y(this.f8303a, false)) {
                        mo9765d().m10048r().m9893a("AppMeasurementService not registered/enabled");
                    }
                }
                mo9765d().m10048r().m9893a("Uploading is not possible. App measurement disabled");
            }
        } else {
            if (!TextUtils.isEmpty(m10103B().m9725u()) || !TextUtils.isEmpty(m10103B().m9722r())) {
                C2169h9 m10114N = m10114N();
                String m9725u = m10103B().m9725u();
                C2326w3 m10107F2 = m10107F();
                m10107F2.mo9917h();
                String string = m10107F2.m10319o().getString("gmp_app_id", null);
                String m9722r = m10103B().m9722r();
                C2326w3 m10107F3 = m10107F();
                m10107F3.mo9917h();
                if (m10114N.m9963b0(m9725u, string, m9722r, m10107F3.m10319o().getString("admob_app_id", null))) {
                    mo9765d().m10051u().m9893a("Rechecking which service to use due to a GMP App Id change");
                    C2326w3 m10107F4 = m10107F();
                    m10107F4.mo9917h();
                    Boolean m10322r = m10107F4.m10322r();
                    SharedPreferences.Editor edit = m10107F4.m10319o().edit();
                    edit.clear();
                    edit.apply();
                    if (m10322r != null) {
                        m10107F4.m10323s(m10322r);
                    }
                    m10104C().m9797q();
                    this.f8323u.m10372Q();
                    this.f8323u.m10371P();
                    m10107F().f8632e.m10299b(this.f8302G);
                    m10107F().f8634g.m10312b(null);
                }
                C2326w3 m10107F5 = m10107F();
                String m9725u2 = m10103B().m9725u();
                m10107F5.mo9917h();
                SharedPreferences.Editor edit2 = m10107F5.m10319o().edit();
                edit2.putString("gmp_app_id", m9725u2);
                edit2.apply();
                C2326w3 m10107F6 = m10107F();
                String m9722r2 = m10103B().m9722r();
                m10107F6.mo9917h();
                SharedPreferences.Editor edit3 = m10107F6.m10319o().edit();
                edit3.putString("admob_app_id", m9722r2);
                edit3.apply();
            }
            if (!m10107F().m10321q().m6203k()) {
                m10107F().f8634g.m10312b(null);
            }
            m10109I().m10143C(m10107F().f8634g.m10311a());
            C1720oc.m8642b();
            if (this.f8309g.m9861B(null, C2335x2.f8715j0)) {
                try {
                    m10114N().f8118a.f8303a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(m10107F().f8647t.m10311a())) {
                        mo9765d().m10053w().m9893a("Remote config removed with active feature rollouts");
                        m10107F().f8647t.m10312b(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(m10103B().m9725u()) || !TextUtils.isEmpty(m10103B().m9722r())) {
                boolean m10127o = m10127o();
                if (!m10107F().m10325u() && !this.f8309g.m9864E()) {
                    m10107F().m10324t(!m10127o);
                }
                if (m10127o) {
                    m10109I().m10167g0();
                }
                m10113M().f8373d.m10181a();
                m10112L().m10374S(new AtomicReference<>());
                m10112L().m10386v(m10107F().f8650w.m10226a());
            }
        }
        m10107F().f8641n.m10212a(true);
    }

    /* renamed from: n */
    public final boolean m10126n() {
        return this.f8296A != null && this.f8296A.booleanValue();
    }

    /* renamed from: o */
    public final boolean m10127o() {
        return m10132x() == 0;
    }

    /* renamed from: p */
    public final boolean m10128p() {
        mo9761b().mo9917h();
        return this.f8299D;
    }

    /* renamed from: q */
    public final boolean m10129q() {
        return TextUtils.isEmpty(this.f8304b);
    }

    /* renamed from: r */
    public final boolean m10130r() {
        if (this.f8326x) {
            mo9761b().mo9917h();
            Boolean bool = this.f8327y;
            if (bool == null || this.f8328z == 0 || (!bool.booleanValue() && Math.abs(this.f8316n.mo13782b() - this.f8328z) > 1000)) {
                this.f8328z = this.f8316n.mo13782b();
                boolean z10 = true;
                Boolean valueOf = Boolean.valueOf(m10114N().m9959R("android.permission.INTERNET") && m10114N().m9959R("android.permission.ACCESS_NETWORK_STATE") && (C3393c.m14952a(this.f8303a).m14950e() || this.f8309g.m9866G() || (C2169h9.m9928X(this.f8303a) && C2169h9.m9929Y(this.f8303a, false))));
                this.f8327y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!m10114N().m9952K(m10103B().m9725u(), m10103B().m9722r(), m10103B().m9724t()) && TextUtils.isEmpty(m10103B().m9722r())) {
                        z10 = false;
                    }
                    this.f8327y = Boolean.valueOf(z10);
                }
            }
            return this.f8327y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    /* renamed from: s */
    public final boolean m10131s() {
        return this.f8307e;
    }

    /* renamed from: x */
    public final int m10132x() {
        mo9761b().mo9917h();
        if (this.f8309g.m9864E()) {
            return 1;
        }
        Boolean bool = this.f8298C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        mo9761b().mo9917h();
        if (!this.f8299D) {
            return 8;
        }
        Boolean m10322r = m10107F().m10322r();
        if (m10322r != null) {
            return m10322r.booleanValue() ? 0 : 3;
        }
        C2137f c2137f = this.f8309g;
        C2093b c2093b = c2137f.f8118a.f8308f;
        Boolean m9877t = c2137f.m9877t("firebase_analytics_collection_enabled");
        if (m9877t != null) {
            return m9877t.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f8297B;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (!this.f8309g.m9861B(null, C2335x2.f8690U) || this.f8296A == null || this.f8296A.booleanValue()) ? 0 : 7;
    }

    /* renamed from: y */
    public final C2354z1 m10133y() {
        C2354z1 c2354z1 = this.f8319q;
        if (c2354z1 != null) {
            return c2354z1;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: z */
    public final C2137f m10134z() {
        return this.f8309g;
    }
}
