package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import backtraceio.library.services.BacktraceMetrics;
import com.appsflyer.oaid.BuildConfig;
import p018b4.C0987a;
import p172n2.C4051a;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.internal.w3 */
/* loaded from: classes.dex */
public final class C2326w3 extends AbstractC2165h5 {

    /* renamed from: x */
    static final Pair<String, Long> f8629x = new Pair<>(BuildConfig.FLAVOR, 0L);

    /* renamed from: c */
    private SharedPreferences f8630c;

    /* renamed from: d */
    public C2295t3 f8631d;

    /* renamed from: e */
    public final C2284s3 f8632e;

    /* renamed from: f */
    public final C2284s3 f8633f;

    /* renamed from: g */
    public final C2306u3 f8634g;

    /* renamed from: h */
    private String f8635h;

    /* renamed from: i */
    private boolean f8636i;

    /* renamed from: j */
    private long f8637j;

    /* renamed from: k */
    public final C2284s3 f8638k;

    /* renamed from: l */
    public final C2262q3 f8639l;

    /* renamed from: m */
    public final C2306u3 f8640m;

    /* renamed from: n */
    public final C2262q3 f8641n;

    /* renamed from: o */
    public final C2284s3 f8642o;

    /* renamed from: p */
    public boolean f8643p;

    /* renamed from: q */
    public final C2262q3 f8644q;

    /* renamed from: r */
    public final C2262q3 f8645r;

    /* renamed from: s */
    public final C2284s3 f8646s;

    /* renamed from: t */
    public final C2306u3 f8647t;

    /* renamed from: u */
    public final C2306u3 f8648u;

    /* renamed from: v */
    public final C2284s3 f8649v;

    /* renamed from: w */
    public final C2273r3 f8650w;

    public C2326w3(C2219m4 c2219m4) {
        super(c2219m4);
        this.f8638k = new C2284s3(this, "session_timeout", BacktraceMetrics.defaultTimeIntervalMs);
        this.f8639l = new C2262q3(this, "start_new_session", true);
        this.f8642o = new C2284s3(this, "last_pause_time", 0L);
        this.f8640m = new C2306u3(this, "non_personalized_ads", null);
        this.f8641n = new C2262q3(this, "allow_remote_dynamite", false);
        this.f8632e = new C2284s3(this, "first_open_time", 0L);
        this.f8633f = new C2284s3(this, "app_install_time", 0L);
        this.f8634g = new C2306u3(this, "app_instance_id", null);
        this.f8644q = new C2262q3(this, "app_backgrounded", false);
        this.f8645r = new C2262q3(this, "deep_link_retrieval_complete", false);
        this.f8646s = new C2284s3(this, "deep_link_retrieval_attempts", 0L);
        this.f8647t = new C2306u3(this, "firebase_feature_rollouts", null);
        this.f8648u = new C2306u3(this, "deferred_attribution_cache", null);
        this.f8649v = new C2284s3(this, "deferred_attribution_cache_timestamp", 0L);
        this.f8650w = new C2273r3(this, "default_event_parameters", null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2165h5
    /* renamed from: i */
    protected final void mo9919i() {
        SharedPreferences sharedPreferences = this.f8118a.mo9763c().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f8630c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f8643p = z10;
        if (!z10) {
            SharedPreferences.Editor edit = this.f8630c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f8118a.m10134z();
        this.f8631d = new C2295t3(this, "health_monitor", Math.max(0L, C2335x2.f8702d.m10317a(null).longValue()), null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2165h5
    /* renamed from: j */
    protected final boolean mo9920j() {
        return true;
    }

    /* renamed from: o */
    public final SharedPreferences m10319o() {
        mo9917h();
        m9921k();
        C5984j.m21286j(this.f8630c);
        return this.f8630c;
    }

    /* renamed from: p */
    public final Pair<String, Boolean> m10320p(String str) {
        mo9917h();
        long mo13782b = this.f8118a.mo9767e().mo13782b();
        String str2 = this.f8635h;
        if (str2 != null && mo13782b < this.f8637j) {
            return new Pair<>(str2, Boolean.valueOf(this.f8636i));
        }
        this.f8637j = mo13782b + this.f8118a.m10134z().m9875r(str, C2335x2.f8700c);
        C4051a.m16840d(true);
        try {
            C4051a.a m16839b = C4051a.m16839b(this.f8118a.mo9763c());
            this.f8635h = BuildConfig.FLAVOR;
            String m16848a = m16839b.m16848a();
            if (m16848a != null) {
                this.f8635h = m16848a;
            }
            this.f8636i = m16839b.m16849b();
        } catch (Exception e10) {
            this.f8118a.mo9765d().m10047q().m9894b("Unable to get advertising id", e10);
            this.f8635h = BuildConfig.FLAVOR;
        }
        C4051a.m16840d(false);
        return new Pair<>(this.f8635h, Boolean.valueOf(this.f8636i));
    }

    /* renamed from: q */
    public final C0987a m10321q() {
        mo9917h();
        return C0987a.m6189b(m10319o().getString("consent_settings", "G1"));
    }

    /* renamed from: r */
    public final Boolean m10322r() {
        mo9917h();
        if (m10319o().contains("measurement_enabled")) {
            return Boolean.valueOf(m10319o().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* renamed from: s */
    public final void m10323s(Boolean bool) {
        mo9917h();
        SharedPreferences.Editor edit = m10319o().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* renamed from: t */
    public final void m10324t(boolean z10) {
        mo9917h();
        this.f8118a.mo9765d().m10052v().m9894b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor edit = m10319o().edit();
        edit.putBoolean("deferred_analytics_collection", z10);
        edit.apply();
    }

    /* renamed from: u */
    public final boolean m10325u() {
        SharedPreferences sharedPreferences = this.f8630c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* renamed from: v */
    public final boolean m10326v(long j10) {
        return j10 - this.f8638k.m10298a() > this.f8642o.m10298a();
    }

    /* renamed from: w */
    public final boolean m10327w(int i10) {
        return C0987a.m6192l(i10, m10319o().getInt("consent_source", 100));
    }
}
