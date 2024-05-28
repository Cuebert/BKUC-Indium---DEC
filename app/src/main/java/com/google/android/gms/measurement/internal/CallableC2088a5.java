package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C1514c4;
import com.google.android.gms.internal.measurement.C1531d4;
import com.google.android.gms.internal.measurement.C1548e4;
import com.google.android.gms.internal.measurement.C1565f4;
import com.google.android.gms.internal.measurement.C1582g4;
import com.google.android.gms.internal.measurement.C1599h4;
import com.google.android.gms.internal.measurement.C1608hd;
import com.google.android.gms.internal.measurement.C1648k4;
import com.google.android.gms.internal.measurement.C1664l4;
import com.google.android.gms.internal.measurement.C1680m4;
import com.google.android.gms.internal.measurement.C1696n4;
import com.google.android.gms.internal.measurement.C1712o4;
import com.google.android.gms.internal.measurement.C1760r4;
import com.google.android.gms.internal.measurement.C1840w4;
import com.google.android.gms.internal.measurement.C1856x4;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p018b4.C0987a;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.internal.a5 */
/* loaded from: classes.dex */
final class CallableC2088a5 implements Callable<byte[]> {

    /* renamed from: a */
    final /* synthetic */ zzat f7959a;

    /* renamed from: b */
    final /* synthetic */ String f7960b;

    /* renamed from: c */
    final /* synthetic */ BinderC2143f5 f7961c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2088a5(BinderC2143f5 binderC2143f5, zzat zzatVar, String str) {
        this.f7961c = binderC2143f5;
        this.f7959a = zzatVar;
        this.f7960b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ byte[] call() throws Exception {
        C2103b9 c2103b9;
        C2103b9 c2103b92;
        byte[] bArr;
        C2103b9 c2103b93;
        C2147f9 c2147f9;
        C2274r4 c2274r4;
        C1648k4 c1648k4;
        String str;
        Bundle bundle;
        C1680m4 c1680m4;
        byte[] bArr2;
        C2236o m10198c;
        long j10;
        c2103b9 = this.f7961c.f8084c;
        c2103b9.m9760a();
        c2103b92 = this.f7961c.f8084c;
        C2265q6 m9764c0 = c2103b92.m9764c0();
        zzat zzatVar = this.f7959a;
        String str2 = this.f7960b;
        m9764c0.mo9917h();
        C2219m4.m10098t();
        C5984j.m21286j(zzatVar);
        C5984j.m21282f(str2);
        if (!m9764c0.f8118a.m10134z().m9861B(str2, C2335x2.f8692W)) {
            m9764c0.f8118a.mo9765d().m10047q().m9894b("Generating ScionPayload disabled. packageName", str2);
            return new byte[0];
        }
        if (!"_iap".equals(zzatVar.f8838n) && !"_iapx".equals(zzatVar.f8838n)) {
            m9764c0.f8118a.mo9765d().m10047q().m9895c("Generating a payload for this event is not available. package_name, event_name", str2, zzatVar.f8838n);
            return null;
        }
        C1648k4 m8371w = C1664l4.m8371w();
        m9764c0.f8517b.m9755V().m10019g0();
        try {
            C2274r4 m10007T = m9764c0.f8517b.m9755V().m10007T(str2);
            if (m10007T == null) {
                m9764c0.f8118a.mo9765d().m10047q().m9894b("Log and bundle not available. package_name", str2);
                bArr = new byte[0];
                c2103b93 = m9764c0.f8517b;
            } else if (!m10007T.m10238K()) {
                m9764c0.f8118a.mo9765d().m10047q().m9894b("Log and bundle disabled. package_name", str2);
                bArr = new byte[0];
                c2103b93 = m9764c0.f8517b;
            } else {
                C1680m4 m8503J1 = C1696n4.m8503J1();
                m8503J1.m8428c0(1);
                m8503J1.m8423V("android");
                if (!TextUtils.isEmpty(m10007T.m10263e0())) {
                    m8503J1.m8447v(m10007T.m10263e0());
                }
                if (!TextUtils.isEmpty(m10007T.m10267g0())) {
                    m8503J1.m8451x((String) C5984j.m21286j(m10007T.m10267g0()));
                }
                if (!TextUtils.isEmpty(m10007T.m10269h0())) {
                    m8503J1.m8453y((String) C5984j.m21286j(m10007T.m10269h0()));
                }
                if (m10007T.m10240M() != -2147483648L) {
                    m8503J1.m8388A((int) m10007T.m10240M());
                }
                m8503J1.m8417P(m10007T.m10251X());
                m8503J1.m8404I(m10007T.m10249V());
                String m10275k0 = m10007T.m10275k0();
                String m10259c0 = m10007T.m10259c0();
                C1608hd.m8291b();
                if (m9764c0.f8118a.m10134z().m9861B(m10007T.m10263e0(), C2335x2.f8705e0)) {
                    String m10273j0 = m10007T.m10273j0();
                    if (!TextUtils.isEmpty(m10275k0)) {
                        m8503J1.m8414N(m10275k0);
                    } else if (!TextUtils.isEmpty(m10273j0)) {
                        m8503J1.m8412M(m10273j0);
                    } else if (!TextUtils.isEmpty(m10259c0)) {
                        m8503J1.m8418P0(m10259c0);
                    }
                } else if (!TextUtils.isEmpty(m10275k0)) {
                    m8503J1.m8414N(m10275k0);
                } else if (!TextUtils.isEmpty(m10259c0)) {
                    m8503J1.m8418P0(m10259c0);
                }
                C0987a m9754U = m9764c0.f8517b.m9754U(str2);
                m8503J1.m8398F(m10007T.m10248U());
                if (m9764c0.f8118a.m10127o() && m9764c0.f8118a.m10134z().m9862C(m8503J1.m8439n0()) && m9754U.m6202j() && !TextUtils.isEmpty(null)) {
                    m8503J1.m8402H(null);
                }
                m8503J1.m8396E(m9754U.m6201i());
                if (m9754U.m6202j()) {
                    Pair<String, Boolean> m10402n = m9764c0.f8517b.m9766d0().m10402n(m10007T.m10263e0(), m9754U);
                    if (m10007T.m10237J() && !TextUtils.isEmpty((CharSequence) m10402n.first)) {
                        try {
                            m8503J1.m8429d0(C2265q6.m10214a((String) m10402n.first, Long.toString(zzatVar.f8841q)));
                            Object obj = m10402n.second;
                            if (obj != null) {
                                m8503J1.m8421S(((Boolean) obj).booleanValue());
                            }
                        } catch (SecurityException e10) {
                            m9764c0.f8118a.mo9765d().m10047q().m9894b("Resettable device id encryption failed", e10.getMessage());
                            bArr = new byte[0];
                            c2103b93 = m9764c0.f8517b;
                        }
                    }
                }
                m9764c0.f8118a.m10102A().m9921k();
                m8503J1.m8400G(Build.MODEL);
                m9764c0.f8118a.m10102A().m9921k();
                m8503J1.m8422U(Build.VERSION.RELEASE);
                m8503J1.m8433h0((int) m9764c0.f8118a.m10102A().m10092p());
                m8503J1.m8437l0(m9764c0.f8118a.m10102A().m10093q());
                try {
                    if (m9754U.m6203k() && m10007T.m10265f0() != null) {
                        m8503J1.m8449w(C2265q6.m10214a((String) C5984j.m21286j(m10007T.m10265f0()), Long.toString(zzatVar.f8841q)));
                    }
                    if (!TextUtils.isEmpty(m10007T.m10271i0())) {
                        m8503J1.m8410L((String) C5984j.m21286j(m10007T.m10271i0()));
                    }
                    String m10263e0 = m10007T.m10263e0();
                    List<C2147f9> m10017e0 = m9764c0.f8517b.m9755V().m10017e0(m10263e0);
                    Iterator<C2147f9> it = m10017e0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            c2147f9 = null;
                            break;
                        }
                        c2147f9 = it.next();
                        if ("_lte".equals(c2147f9.f8095c)) {
                            break;
                        }
                    }
                    if (c2147f9 == null || c2147f9.f8097e == null) {
                        C2147f9 c2147f92 = new C2147f9(m10263e0, "auto", "_lte", m9764c0.f8118a.mo9767e().mo13781a(), 0L);
                        m10017e0.add(c2147f92);
                        m9764c0.f8517b.m9755V().m10036z(c2147f92);
                    }
                    C2125d9 m9769f0 = m9764c0.f8517b.m9769f0();
                    m9769f0.f8118a.mo9765d().m10052v().m9893a("Checking account type status for ad personalization signals");
                    if (m9769f0.f8118a.m10102A().m10095s()) {
                        String m10263e02 = m10007T.m10263e0();
                        C5984j.m21286j(m10263e02);
                        if (m10007T.m10237J() && m9769f0.f8517b.m9759Z().m9909t(m10263e02)) {
                            m9769f0.f8118a.mo9765d().m10047q().m9893a("Turning off ad personalization due to account type");
                            Iterator<C2147f9> it2 = m10017e0.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if ("_npa".equals(it2.next().f8095c)) {
                                    it2.remove();
                                    break;
                                }
                            }
                            m10017e0.add(new C2147f9(m10263e02, "auto", "_npa", m9769f0.f8118a.mo9767e().mo13781a(), 1L));
                        }
                    }
                    C1856x4[] c1856x4Arr = new C1856x4[m10017e0.size()];
                    for (int i10 = 0; i10 < m10017e0.size(); i10++) {
                        C1840w4 m8980z = C1856x4.m8980z();
                        m8980z.m8938B(m10017e0.get(i10).f8095c);
                        m8980z.m8939C(m10017e0.get(i10).f8096d);
                        m9764c0.f8517b.m9769f0().m9850M(m8980z, m10017e0.get(i10).f8097e);
                        c1856x4Arr[i10] = m8980z.m8466p();
                    }
                    m8503J1.m8455z0(Arrays.asList(c1856x4Arr));
                    C2185j3 m10060b = C2185j3.m10060b(zzatVar);
                    m9764c0.f8118a.m10114N().m9985y(m10060b.f8203d, m9764c0.f8517b.m9755V().m10006S(str2));
                    m9764c0.f8118a.m10114N().m9986z(m10060b, m9764c0.f8118a.m10134z().m9871n(str2));
                    Bundle bundle2 = m10060b.f8203d;
                    bundle2.putLong("_c", 1L);
                    m9764c0.f8118a.mo9765d().m10047q().m9893a("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1L);
                    bundle2.putString("_o", zzatVar.f8840p);
                    if (m9764c0.f8118a.m10114N().m9960S(m8503J1.m8439n0())) {
                        m9764c0.f8118a.m10114N().m9943B(bundle2, "_dbg", 1L);
                        m9764c0.f8118a.m10114N().m9943B(bundle2, "_r", 1L);
                    }
                    C2236o m10011X = m9764c0.f8517b.m9755V().m10011X(str2, zzatVar.f8838n);
                    if (m10011X == null) {
                        c1680m4 = m8503J1;
                        c2274r4 = m10007T;
                        c1648k4 = m8371w;
                        str = str2;
                        bundle = bundle2;
                        bArr2 = null;
                        m10198c = new C2236o(str2, zzatVar.f8838n, 0L, 0L, 0L, zzatVar.f8841q, 0L, null, null, null, null);
                        j10 = 0;
                    } else {
                        c2274r4 = m10007T;
                        c1648k4 = m8371w;
                        str = str2;
                        bundle = bundle2;
                        c1680m4 = m8503J1;
                        bArr2 = null;
                        long j11 = m10011X.f8382f;
                        m10198c = m10011X.m10198c(zzatVar.f8841q);
                        j10 = j11;
                    }
                    m9764c0.f8517b.m9755V().m10028r(m10198c);
                    C2225n c2225n = new C2225n(m9764c0.f8118a, zzatVar.f8840p, str, zzatVar.f8838n, zzatVar.f8841q, j10, bundle);
                    C1514c4 m8019A = C1531d4.m8019A();
                    m8019A.m7989I(c2225n.f8351d);
                    m8019A.m7985E(c2225n.f8349b);
                    m8019A.m7988H(c2225n.f8352e);
                    C2247p c2247p = new C2247p(c2225n.f8353f);
                    while (c2247p.hasNext()) {
                        String next = c2247p.next();
                        C1582g4 m8205A = C1599h4.m8205A();
                        m8205A.m8191F(next);
                        Object m10407C = c2225n.f8353f.m10407C(next);
                        if (m10407C != null) {
                            m9764c0.f8517b.m9769f0().m9849L(m8205A, m10407C);
                            m8019A.m7981A(m8205A);
                        }
                    }
                    C1680m4 c1680m42 = c1680m4;
                    c1680m42.m8389A0(m8019A);
                    C1712o4 m8756w = C1760r4.m8756w();
                    C1548e4 m8150w = C1565f4.m8150w();
                    m8150w.m8083v(m10198c.f8379c);
                    m8150w.m8084w(zzatVar.f8838n);
                    m8756w.m8637v(m8150w);
                    c1680m42.m8424Y(m8756w);
                    c1680m42.m8450w0(m9764c0.f8517b.m9752S().m10310m(c2274r4.m10263e0(), Collections.emptyList(), c1680m42.m8443r0(), Long.valueOf(m8019A.m7996x()), Long.valueOf(m8019A.m7996x())));
                    if (m8019A.m7993M()) {
                        c1680m42.m8432g0(m8019A.m7996x());
                        c1680m42.m8406J(m8019A.m7996x());
                    }
                    long m10252Y = c2274r4.m10252Y();
                    if (m10252Y != 0) {
                        c1680m42.m8425Z(m10252Y);
                    }
                    long m10255a0 = c2274r4.m10255a0();
                    if (m10255a0 != 0) {
                        c1680m42.m8426a0(m10255a0);
                    } else if (m10252Y != 0) {
                        c1680m42.m8426a0(m10252Y);
                    }
                    c2274r4.m10262e();
                    c1680m42.m8390B((int) c2274r4.m10253Z());
                    m9764c0.f8118a.m10134z().m9874q();
                    c1680m42.m8435j0(46000L);
                    c1680m42.m8434i0(m9764c0.f8118a.mo9767e().mo13781a());
                    c1680m42.m8431f0(true);
                    C1648k4 c1648k42 = c1648k4;
                    c1648k42.m8348v(c1680m42);
                    C2274r4 c2274r42 = c2274r4;
                    c2274r42.m10232E(c1680m42.m8446u0());
                    c2274r42.m10230C(c1680m42.m8445t0());
                    m9764c0.f8517b.m9755V().m10027q(c2274r42);
                    m9764c0.f8517b.m9755V().m10026p();
                    try {
                        return m9764c0.f8517b.m9769f0().m9852Q(c1648k42.m8466p().m9143i());
                    } catch (IOException e11) {
                        m9764c0.f8118a.mo9765d().m10048r().m9895c("Data loss. Failed to bundle and serialize. appId", C2174i3.m10044z(str), e11);
                        return bArr2;
                    }
                } catch (SecurityException e12) {
                    m9764c0.f8118a.mo9765d().m10047q().m9894b("app instance id encryption failed", e12.getMessage());
                    bArr = new byte[0];
                    c2103b93 = m9764c0.f8517b;
                }
            }
            c2103b93.m9755V().m10021i0();
            return bArr;
        } finally {
            m9764c0.f8517b.m9755V().m10021i0();
        }
    }
}
