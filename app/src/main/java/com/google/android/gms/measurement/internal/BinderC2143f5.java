package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.common.C1381d;
import com.google.android.gms.common.C1382e;
import com.google.android.gms.internal.measurement.C1490ae;
import com.google.android.gms.internal.measurement.C1492b;
import com.google.android.gms.internal.measurement.C1511c1;
import com.google.android.gms.internal.measurement.C1821v1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p018b4.AbstractBinderC0989c;
import p018b4.C1000n;
import p070f3.C3140n;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.internal.f5 */
/* loaded from: classes.dex */
public final class BinderC2143f5 extends AbstractBinderC0989c {

    /* renamed from: c */
    private final C2103b9 f8084c;

    /* renamed from: d */
    private Boolean f8085d;

    /* renamed from: e */
    private String f8086e;

    public BinderC2143f5(C2103b9 c2103b9, String str) {
        C5984j.m21286j(c2103b9);
        this.f8084c = c2103b9;
        this.f8086e = null;
    }

    /* renamed from: P0 */
    private final void m9886P0(zzp zzpVar, boolean z10) {
        C5984j.m21286j(zzpVar);
        C5984j.m21282f(zzpVar.f8858n);
        m9887l(zzpVar.f8858n, false);
        this.f8084c.m9771g0().m9952K(zzpVar.f8859o, zzpVar.f8852D, zzpVar.f8856H);
    }

    /* renamed from: l */
    private final void m9887l(String str, boolean z10) {
        boolean z11;
        if (!TextUtils.isEmpty(str)) {
            if (z10) {
                try {
                    if (this.f8085d == null) {
                        if (!"com.google.android.gms".equals(this.f8086e) && !C3140n.m13811a(this.f8084c.mo9763c(), Binder.getCallingUid()) && !C1382e.m7607a(this.f8084c.mo9763c()).m7612c(Binder.getCallingUid())) {
                            z11 = false;
                            this.f8085d = Boolean.valueOf(z11);
                        }
                        z11 = true;
                        this.f8085d = Boolean.valueOf(z11);
                    }
                    if (this.f8085d.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e10) {
                    this.f8084c.mo9765d().m10048r().m9894b("Measurement Service called with invalid calling package. appId", C2174i3.m10044z(str));
                    throw e10;
                }
            }
            if (this.f8086e == null && C1381d.m7605k(this.f8084c.mo9763c(), Binder.getCallingUid(), str)) {
                this.f8086e = str;
            }
            if (str.equals(this.f8086e)) {
                return;
            } else {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
            }
        }
        this.f8084c.mo9765d().m10048r().m9893a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    /* renamed from: n */
    public final void m9888n(zzat zzatVar, zzp zzpVar) {
        this.f8084c.m9760a();
        this.f8084c.m9774i(zzatVar, zzpVar);
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: A */
    public final void mo6206A(zzab zzabVar, zzp zzpVar) {
        C5984j.m21286j(zzabVar);
        C5984j.m21286j(zzabVar.f8828p);
        m9886P0(zzpVar, false);
        zzab zzabVar2 = new zzab(zzabVar);
        zzabVar2.f8826n = zzpVar.f8858n;
        m9892O0(new RunnableC2241o4(this, zzabVar2, zzpVar));
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: E */
    public final List<zzkv> mo6207E(String str, String str2, String str3, boolean z10) {
        m9887l(str, true);
        try {
            List<C2147f9> list = (List) this.f8084c.mo9761b().m10078s(new CallableC2285s4(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C2147f9 c2147f9 : list) {
                if (z10 || !C2169h9.m9926V(c2147f9.f8095c)) {
                    arrayList.add(new zzkv(c2147f9));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f8084c.mo9765d().m10048r().m9895c("Failed to get user properties as. appId", C2174i3.m10044z(str), e10);
            return Collections.emptyList();
        }
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: H0 */
    public final void mo6208H0(zzat zzatVar, zzp zzpVar) {
        C5984j.m21286j(zzatVar);
        m9886P0(zzpVar, false);
        m9892O0(new RunnableC2347y4(this, zzatVar, zzpVar));
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: J */
    public final void mo6209J(zzp zzpVar) {
        C5984j.m21282f(zzpVar.f8858n);
        m9887l(zzpVar.f8858n, false);
        m9892O0(new RunnableC2317v4(this, zzpVar));
    }

    /* renamed from: J0 */
    public final zzat m9889J0(zzat zzatVar, zzp zzpVar) {
        zzar zzarVar;
        if ("_cmp".equals(zzatVar.f8838n) && (zzarVar = zzatVar.f8839o) != null && zzarVar.m10409x() != 0) {
            String m10408D = zzatVar.f8839o.m10408D("_cis");
            if ("referrer broadcast".equals(m10408D) || "referrer API".equals(m10408D)) {
                this.f8084c.mo9765d().m10051u().m9894b("Event has been filtered ", zzatVar.toString());
                return new zzat("_cmpx", zzatVar.f8839o, zzatVar.f8840p, zzatVar.f8841q);
            }
        }
        return zzatVar;
    }

    /* renamed from: M0 */
    public final void m9890M0(zzat zzatVar, zzp zzpVar) {
        if (!this.f8084c.m9759Z().m9910u(zzpVar.f8858n)) {
            m9888n(zzatVar, zzpVar);
            return;
        }
        this.f8084c.mo9765d().m10052v().m9894b("EES config found for", zzpVar.f8858n);
        C2153g4 m9759Z = this.f8084c.m9759Z();
        String str = zzpVar.f8858n;
        C1490ae.m7927b();
        C1511c1 c1511c1 = null;
        if (m9759Z.f8118a.m10134z().m9861B(null, C2335x2.f8739v0) && !TextUtils.isEmpty(str)) {
            c1511c1 = m9759Z.f8115i.m14815c(str);
        }
        if (c1511c1 != null) {
            try {
                Map<String, Object> m9848K = this.f8084c.m9769f0().m9848K(zzatVar.f8839o.m10410z(), true);
                String m6230a = C1000n.m6230a(zzatVar.f8838n);
                if (m6230a == null) {
                    m6230a = zzatVar.f8838n;
                }
                if (c1511c1.m7977e(new C1492b(m6230a, zzatVar.f8841q, m9848K))) {
                    if (c1511c1.m7979g()) {
                        this.f8084c.mo9765d().m10052v().m9894b("EES edited event", zzatVar.f8838n);
                        m9888n(this.f8084c.m9769f0().m9842B(c1511c1.m7973a().m7968b()), zzpVar);
                    } else {
                        m9888n(zzatVar, zzpVar);
                    }
                    if (c1511c1.m7978f()) {
                        for (C1492b c1492b : c1511c1.m7973a().m7969c()) {
                            this.f8084c.mo9765d().m10052v().m9894b("EES logging created event", c1492b.m7935d());
                            m9888n(this.f8084c.m9769f0().m9842B(c1492b), zzpVar);
                        }
                        return;
                    }
                    return;
                }
            } catch (C1821v1 unused) {
                this.f8084c.mo9765d().m10048r().m9895c("EES error. appId, eventName", zzpVar.f8859o, zzatVar.f8838n);
            }
            this.f8084c.mo9765d().m10052v().m9894b("EES was not applied to event", zzatVar.f8838n);
            m9888n(zzatVar, zzpVar);
            return;
        }
        this.f8084c.mo9765d().m10052v().m9894b("EES not loaded for", zzpVar.f8858n);
        m9888n(zzatVar, zzpVar);
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: N */
    public final String mo6210N(zzp zzpVar) {
        m9886P0(zzpVar, false);
        return this.f8084c.m9775i0(zzpVar);
    }

    /* renamed from: N0 */
    public final /* synthetic */ void m9891N0(String str, Bundle bundle) {
        C2170i m9755V = this.f8084c.m9755V();
        m9755V.mo9917h();
        m9755V.m10300i();
        byte[] m9143i = m9755V.f8517b.m9769f0().m9843C(new C2225n(m9755V.f8118a, BuildConfig.FLAVOR, str, "dep", 0L, 0L, bundle)).m9143i();
        m9755V.f8118a.mo9765d().m10052v().m9895c("Saving default event parameters, appId, data size", m9755V.f8118a.m10105D().m9809d(str), Integer.valueOf(m9143i.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", m9143i);
        try {
            if (m9755V.m10005R().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                m9755V.f8118a.mo9765d().m10048r().m9894b("Failed to insert default event parameters (got -1). appId", C2174i3.m10044z(str));
            }
        } catch (SQLiteException e10) {
            m9755V.f8118a.mo9765d().m10048r().m9895c("Error storing default event parameters. appId", C2174i3.m10044z(str), e10);
        }
    }

    /* renamed from: O0 */
    final void m9892O0(Runnable runnable) {
        C5984j.m21286j(runnable);
        if (this.f8084c.mo9761b().m10076C()) {
            runnable.run();
        } else {
            this.f8084c.mo9761b().m10081z(runnable);
        }
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: W */
    public final void mo6211W(zzab zzabVar) {
        C5984j.m21286j(zzabVar);
        C5984j.m21286j(zzabVar.f8828p);
        C5984j.m21282f(zzabVar.f8826n);
        m9887l(zzabVar.f8826n, true);
        m9892O0(new RunnableC2252p4(this, new zzab(zzabVar)));
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: Z */
    public final List<zzab> mo6212Z(String str, String str2, String str3) {
        m9887l(str, true);
        try {
            return (List) this.f8084c.mo9761b().m10078s(new CallableC2307u4(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f8084c.mo9765d().m10048r().m9894b("Failed to get conditional user properties as", e10);
            return Collections.emptyList();
        }
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: a0 */
    public final List<zzkv> mo6213a0(zzp zzpVar, boolean z10) {
        m9886P0(zzpVar, false);
        String str = zzpVar.f8858n;
        C5984j.m21286j(str);
        try {
            List<C2147f9> list = (List) this.f8084c.mo9761b().m10078s(new CallableC2110c5(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C2147f9 c2147f9 : list) {
                if (z10 || !C2169h9.m9926V(c2147f9.f8095c)) {
                    arrayList.add(new zzkv(c2147f9));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f8084c.mo9765d().m10048r().m9895c("Failed to get user properties. appId", C2174i3.m10044z(zzpVar.f8858n), e10);
            return null;
        }
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: f0 */
    public final byte[] mo6214f0(zzat zzatVar, String str) {
        C5984j.m21282f(str);
        C5984j.m21286j(zzatVar);
        m9887l(str, true);
        this.f8084c.mo9765d().m10047q().m9894b("Log and bundle. event", this.f8084c.m9756W().m9809d(zzatVar.f8838n));
        long nanoTime = this.f8084c.mo9767e().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f8084c.mo9761b().m10079t(new CallableC2088a5(this, zzatVar, str)).get();
            if (bArr == null) {
                this.f8084c.mo9765d().m10048r().m9894b("Log and bundle returned null. appId", C2174i3.m10044z(str));
                bArr = new byte[0];
            }
            this.f8084c.mo9765d().m10047q().m9896d("Log and bundle processed. event, size, time_ms", this.f8084c.m9756W().m9809d(zzatVar.f8838n), Integer.valueOf(bArr.length), Long.valueOf((this.f8084c.mo9767e().nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e10) {
            this.f8084c.mo9765d().m10048r().m9896d("Failed to log and bundle. appId, event, error", C2174i3.m10044z(str), this.f8084c.m9756W().m9809d(zzatVar.f8838n), e10);
            return null;
        }
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: g0 */
    public final void mo6215g0(zzkv zzkvVar, zzp zzpVar) {
        C5984j.m21286j(zzkvVar);
        m9886P0(zzpVar, false);
        m9892O0(new RunnableC2099b5(this, zzkvVar, zzpVar));
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: k0 */
    public final void mo6216k0(zzat zzatVar, String str, String str2) {
        C5984j.m21286j(zzatVar);
        C5984j.m21282f(str);
        m9887l(str, true);
        m9892O0(new RunnableC2357z4(this, zzatVar, str));
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: q */
    public final void mo6217q(zzp zzpVar) {
        C5984j.m21282f(zzpVar.f8858n);
        C5984j.m21286j(zzpVar.f8857I);
        RunnableC2337x4 runnableC2337x4 = new RunnableC2337x4(this, zzpVar);
        C5984j.m21286j(runnableC2337x4);
        if (this.f8084c.mo9761b().m10076C()) {
            runnableC2337x4.run();
        } else {
            this.f8084c.mo9761b().m10075A(runnableC2337x4);
        }
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: q0 */
    public final void mo6218q0(zzp zzpVar) {
        m9886P0(zzpVar, false);
        m9892O0(new RunnableC2121d5(this, zzpVar));
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: r */
    public final void mo6219r(long j10, String str, String str2, String str3) {
        m9892O0(new RunnableC2132e5(this, str2, str3, str, j10));
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: r0 */
    public final List<zzab> mo6220r0(String str, String str2, zzp zzpVar) {
        m9886P0(zzpVar, false);
        String str3 = zzpVar.f8858n;
        C5984j.m21286j(str3);
        try {
            return (List) this.f8084c.mo9761b().m10078s(new CallableC2296t4(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f8084c.mo9765d().m10048r().m9894b("Failed to get conditional user properties", e10);
            return Collections.emptyList();
        }
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: v */
    public final void mo6221v(Bundle bundle, zzp zzpVar) {
        m9886P0(zzpVar, false);
        String str = zzpVar.f8858n;
        C5984j.m21286j(str);
        m9892O0(new Runnable() { // from class: com.google.android.gms.measurement.internal.n4

            /* renamed from: o */
            public final /* synthetic */ String f8358o;

            /* renamed from: p */
            public final /* synthetic */ Bundle f8359p;

            public /* synthetic */ RunnableC2230n4(String str2, Bundle bundle2) {
                r2 = str2;
                r3 = bundle2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BinderC2143f5.this.m9891N0(r2, r3);
            }
        });
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: x */
    public final List<zzkv> mo6222x(String str, String str2, boolean z10, zzp zzpVar) {
        m9886P0(zzpVar, false);
        String str3 = zzpVar.f8858n;
        C5984j.m21286j(str3);
        try {
            List<C2147f9> list = (List) this.f8084c.mo9761b().m10078s(new CallableC2263q4(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C2147f9 c2147f9 : list) {
                if (z10 || !C2169h9.m9926V(c2147f9.f8095c)) {
                    arrayList.add(new zzkv(c2147f9));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f8084c.mo9765d().m10048r().m9895c("Failed to query user properties. appId", C2174i3.m10044z(zzpVar.f8858n), e10);
            return Collections.emptyList();
        }
    }

    @Override // p018b4.InterfaceC0990d
    /* renamed from: y0 */
    public final void mo6223y0(zzp zzpVar) {
        m9886P0(zzpVar, false);
        m9892O0(new RunnableC2327w4(this, zzpVar));
    }
}
