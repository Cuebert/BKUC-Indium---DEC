package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.appsflyer.oaid.BuildConfig;
import p018b4.C0993g;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.internal.t3 */
/* loaded from: classes.dex */
public final class C2295t3 {

    /* renamed from: a */
    final String f8560a;

    /* renamed from: b */
    private final String f8561b;

    /* renamed from: c */
    private final String f8562c;

    /* renamed from: d */
    private final long f8563d;

    /* renamed from: e */
    final /* synthetic */ C2326w3 f8564e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2295t3(C2326w3 c2326w3, String str, long j10, C0993g c0993g) {
        this.f8564e = c2326w3;
        C5984j.m21282f("health_monitor");
        C5984j.m21277a(j10 > 0);
        this.f8560a = "health_monitor:start";
        this.f8561b = "health_monitor:count";
        this.f8562c = "health_monitor:value";
        this.f8563d = j10;
    }

    /* renamed from: c */
    private final long m10304c() {
        return this.f8564e.m10319o().getLong(this.f8560a, 0L);
    }

    /* renamed from: d */
    private final void m10305d() {
        this.f8564e.mo9917h();
        long mo13781a = this.f8564e.f8118a.mo9767e().mo13781a();
        SharedPreferences.Editor edit = this.f8564e.m10319o().edit();
        edit.remove(this.f8561b);
        edit.remove(this.f8562c);
        edit.putLong(this.f8560a, mo13781a);
        edit.apply();
    }

    /* renamed from: a */
    public final Pair<String, Long> m10306a() {
        long abs;
        this.f8564e.mo9917h();
        this.f8564e.mo9917h();
        long m10304c = m10304c();
        if (m10304c == 0) {
            m10305d();
            abs = 0;
        } else {
            abs = Math.abs(m10304c - this.f8564e.f8118a.mo9767e().mo13781a());
        }
        long j10 = this.f8563d;
        if (abs < j10) {
            return null;
        }
        if (abs > j10 + j10) {
            m10305d();
            return null;
        }
        String string = this.f8564e.m10319o().getString(this.f8562c, null);
        long j11 = this.f8564e.m10319o().getLong(this.f8561b, 0L);
        m10305d();
        if (string != null && j11 > 0) {
            return new Pair<>(string, Long.valueOf(j11));
        }
        return C2326w3.f8629x;
    }

    /* renamed from: b */
    public final void m10307b(String str, long j10) {
        this.f8564e.mo9917h();
        if (m10304c() == 0) {
            m10305d();
        }
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        long j11 = this.f8564e.m10319o().getLong(this.f8561b, 0L);
        if (j11 <= 0) {
            SharedPreferences.Editor edit = this.f8564e.m10319o().edit();
            edit.putString(this.f8562c, str);
            edit.putLong(this.f8561b, 1L);
            edit.apply();
            return;
        }
        long nextLong = this.f8564e.f8118a.m10114N().m9978t().nextLong();
        long j12 = j11 + 1;
        long j13 = Long.MAX_VALUE / j12;
        SharedPreferences.Editor edit2 = this.f8564e.m10319o().edit();
        if ((nextLong & Long.MAX_VALUE) < j13) {
            edit2.putString(this.f8562c, str);
        }
        edit2.putLong(this.f8561b, j12);
        edit2.apply();
    }
}
