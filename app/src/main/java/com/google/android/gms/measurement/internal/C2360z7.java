package com.google.android.gms.measurement.internal;

import android.util.Pair;
import com.appsflyer.oaid.BuildConfig;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
import p018b4.C0987a;
import p172n2.C4051a;

/* renamed from: com.google.android.gms.measurement.internal.z7 */
/* loaded from: classes.dex */
public final class C2360z7 extends AbstractC2289s8 {

    /* renamed from: d */
    private String f8817d;

    /* renamed from: e */
    private boolean f8818e;

    /* renamed from: f */
    private long f8819f;

    /* renamed from: g */
    public final C2284s3 f8820g;

    /* renamed from: h */
    public final C2284s3 f8821h;

    /* renamed from: i */
    public final C2284s3 f8822i;

    /* renamed from: j */
    public final C2284s3 f8823j;

    /* renamed from: k */
    public final C2284s3 f8824k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2360z7(C2103b9 c2103b9) {
        super(c2103b9);
        C2326w3 m10107F = this.f8118a.m10107F();
        m10107F.getClass();
        this.f8820g = new C2284s3(m10107F, "last_delete_stale", 0L);
        C2326w3 m10107F2 = this.f8118a.m10107F();
        m10107F2.getClass();
        this.f8821h = new C2284s3(m10107F2, "backoff", 0L);
        C2326w3 m10107F3 = this.f8118a.m10107F();
        m10107F3.getClass();
        this.f8822i = new C2284s3(m10107F3, "last_upload", 0L);
        C2326w3 m10107F4 = this.f8118a.m10107F();
        m10107F4.getClass();
        this.f8823j = new C2284s3(m10107F4, "last_upload_attempt", 0L);
        C2326w3 m10107F5 = this.f8118a.m10107F();
        m10107F5.getClass();
        this.f8824k = new C2284s3(m10107F5, "midnight_offset", 0L);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2289s8
    /* renamed from: l */
    protected final boolean mo9853l() {
        return false;
    }

    @Deprecated
    /* renamed from: m */
    final Pair<String, Boolean> m10401m(String str) {
        mo9917h();
        long mo13782b = this.f8118a.mo9767e().mo13782b();
        String str2 = this.f8817d;
        if (str2 != null && mo13782b < this.f8819f) {
            return new Pair<>(str2, Boolean.valueOf(this.f8818e));
        }
        this.f8819f = mo13782b + this.f8118a.m10134z().m9875r(str, C2335x2.f8700c);
        C4051a.m16840d(true);
        try {
            C4051a.a m16839b = C4051a.m16839b(this.f8118a.mo9763c());
            this.f8817d = BuildConfig.FLAVOR;
            String m16848a = m16839b.m16848a();
            if (m16848a != null) {
                this.f8817d = m16848a;
            }
            this.f8818e = m16839b.m16849b();
        } catch (Exception e10) {
            this.f8118a.mo9765d().m10047q().m9894b("Unable to get advertising id", e10);
            this.f8817d = BuildConfig.FLAVOR;
        }
        C4051a.m16840d(false);
        return new Pair<>(this.f8817d, Boolean.valueOf(this.f8818e));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final Pair<String, Boolean> m10402n(String str, C0987a c0987a) {
        if (c0987a.m6202j()) {
            return m10401m(str);
        }
        return new Pair<>(BuildConfig.FLAVOR, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: o */
    public final String m10403o(String str) {
        mo9917h();
        String str2 = (String) m10401m(str).first;
        MessageDigest m9939s = C2169h9.m9939s();
        if (m9939s == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, m9939s.digest(str2.getBytes())));
    }
}
