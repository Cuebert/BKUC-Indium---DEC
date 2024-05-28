package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C1490ae;
import com.google.android.gms.internal.measurement.C1508bf;
import com.google.android.gms.internal.measurement.C1511c1;
import com.google.android.gms.internal.measurement.C1515c5;
import com.google.android.gms.internal.measurement.C1525cf;
import com.google.android.gms.internal.measurement.C1549e5;
import com.google.android.gms.internal.measurement.C1573fc;
import com.google.android.gms.internal.measurement.C1695n3;
import com.google.android.gms.internal.measurement.C1743q3;
import com.google.android.gms.internal.measurement.C1759r3;
import com.google.android.gms.internal.measurement.C1791t3;
import com.google.android.gms.internal.measurement.C1799tb;
import com.google.android.gms.internal.measurement.C1801td;
import com.google.android.gms.internal.measurement.C1821v1;
import com.google.android.gms.internal.measurement.C1892z8;
import com.google.android.gms.internal.measurement.InterfaceC1898ze;
import com.google.android.gms.measurement.internal.C2153g4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import p018b4.C1000n;
import p093h0.C3356a;
import p093h0.C3360e;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.internal.g4 */
/* loaded from: classes.dex */
public final class C2153g4 extends AbstractC2289s8 implements InterfaceC2126e {

    /* renamed from: d */
    private final Map<String, Map<String, String>> f8110d;

    /* renamed from: e */
    final Map<String, Map<String, Boolean>> f8111e;

    /* renamed from: f */
    final Map<String, Map<String, Boolean>> f8112f;

    /* renamed from: g */
    private final Map<String, C1759r3> f8113g;

    /* renamed from: h */
    private final Map<String, Map<String, Integer>> f8114h;

    /* renamed from: i */
    final C3360e<String, C1511c1> f8115i;

    /* renamed from: j */
    final InterfaceC1898ze f8116j;

    /* renamed from: k */
    private final Map<String, String> f8117k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2153g4(C2103b9 c2103b9) {
        super(c2103b9);
        this.f8110d = new C3356a();
        this.f8111e = new C3356a();
        this.f8112f = new C3356a();
        this.f8113g = new C3356a();
        this.f8117k = new C3356a();
        this.f8114h = new C3356a();
        this.f8115i = new C2120d4(this, 20);
        this.f8116j = new C2131e4(this);
    }

    /* renamed from: A */
    private final C1759r3 m9897A(String str, byte[] bArr) {
        if (bArr == null) {
            return C1759r3.m8742C();
        }
        try {
            C1759r3 m8466p = ((C1743q3) C2125d9.m9824D(C1759r3.m8740A(), bArr)).m8466p();
            this.f8118a.mo9765d().m10052v().m9895c("Parsed config. version, gmp_app_id", m8466p.m8751L() ? Long.valueOf(m8466p.m8754y()) : null, m8466p.m8750K() ? m8466p.m8745D() : null);
            return m8466p;
        } catch (C1892z8 e10) {
            this.f8118a.mo9765d().m10053w().m9895c("Unable to merge remote config. appId", C2174i3.m10044z(str), e10);
            return C1759r3.m8742C();
        } catch (RuntimeException e11) {
            this.f8118a.mo9765d().m10053w().m9895c("Unable to merge remote config. appId", C2174i3.m10044z(str), e11);
            return C1759r3.m8742C();
        }
    }

    /* renamed from: B */
    private final void m9898B(String str, C1743q3 c1743q3) {
        C3356a c3356a = new C3356a();
        C3356a c3356a2 = new C3356a();
        C3356a c3356a3 = new C3356a();
        if (c1743q3 != null) {
            for (int i10 = 0; i10 < c1743q3.m8711v(); i10++) {
                C1695n3 m8683q = c1743q3.m8712w(i10).m8683q();
                if (TextUtils.isEmpty(m8683q.m8492x())) {
                    this.f8118a.mo9765d().m10053w().m9893a("EventConfig contained null event name");
                } else {
                    String m8492x = m8683q.m8492x();
                    String m6231b = C1000n.m6231b(m8683q.m8492x());
                    if (!TextUtils.isEmpty(m6231b)) {
                        m8683q.m8491w(m6231b);
                        c1743q3.m8714y(i10, m8683q);
                    }
                    C1573fc.m8172b();
                    C2137f m10134z = this.f8118a.m10134z();
                    C2325w2<Boolean> c2325w2 = C2335x2.f8674E0;
                    if (!m10134z.m9861B(null, c2325w2)) {
                        c3356a.put(m8492x, Boolean.valueOf(m8683q.m8493y()));
                    } else if (m8683q.m8487B() && m8683q.m8493y()) {
                        c3356a.put(m8492x, Boolean.TRUE);
                    }
                    C1573fc.m8172b();
                    if (!this.f8118a.m10134z().m9861B(null, c2325w2)) {
                        c3356a2.put(m8683q.m8492x(), Boolean.valueOf(m8683q.m8486A()));
                    } else if (m8683q.m8488C() && m8683q.m8486A()) {
                        c3356a2.put(m8683q.m8492x(), Boolean.TRUE);
                    }
                    if (m8683q.m8489D()) {
                        if (m8683q.m8490v() >= 2 && m8683q.m8490v() <= 65535) {
                            c3356a3.put(m8683q.m8492x(), Integer.valueOf(m8683q.m8490v()));
                        } else {
                            this.f8118a.mo9765d().m10053w().m9895c("Invalid sampling rate. Event name, sample rate", m8683q.m8492x(), Integer.valueOf(m8683q.m8490v()));
                        }
                    }
                }
            }
        }
        this.f8111e.put(str, c3356a);
        this.f8112f.put(str, c3356a2);
        this.f8114h.put(str, c3356a3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
    
        if (r2 == null) goto L25;
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x011b: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:38:0x011b */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011e  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m9899C(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2153g4.m9899C(java.lang.String):void");
    }

    /* renamed from: D */
    private final void m9900D(final String str, C1759r3 c1759r3) {
        if (c1759r3.m8752w() != 0) {
            this.f8118a.mo9765d().m10052v().m9894b("EES programs found", Integer.valueOf(c1759r3.m8752w()));
            C1549e5 c1549e5 = c1759r3.m8747F().get(0);
            try {
                C1511c1 c1511c1 = new C1511c1();
                c1511c1.m7976d("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.b4
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new C1799tb("internal.remoteConfig", new C2142f4(C2153g4.this, str));
                    }
                });
                c1511c1.m7976d("internal.appMetadata", new Callable() { // from class: b4.j
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final C2153g4 c2153g4 = C2153g4.this;
                        final String str2 = str;
                        return new C1525cf("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.c4
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                C2153g4 c2153g42 = C2153g4.this;
                                String str3 = str2;
                                C2274r4 m10007T = c2153g42.f8517b.m9755V().m10007T(str3);
                                HashMap hashMap = new HashMap();
                                hashMap.put("platform", "android");
                                hashMap.put("package_name", str3);
                                c2153g42.f8118a.m10134z().m9874q();
                                hashMap.put("gmp_version", 46000L);
                                if (m10007T != null) {
                                    String m10269h0 = m10007T.m10269h0();
                                    if (m10269h0 != null) {
                                        hashMap.put("app_version", m10269h0);
                                    }
                                    hashMap.put("app_version_int", Long.valueOf(m10007T.m10240M()));
                                    hashMap.put("dynamite_version", Long.valueOf(m10007T.m10249V()));
                                }
                                return hashMap;
                            }
                        });
                    }
                });
                c1511c1.m7976d("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.a4
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new C1508bf(C2153g4.this.f8116j);
                    }
                });
                c1511c1.m7975c(c1549e5);
                this.f8115i.m14816d(str, c1511c1);
                this.f8118a.mo9765d().m10052v().m9895c("EES program loaded for appId, activities", str, Integer.valueOf(c1549e5.m8086w().m7885w()));
                Iterator<C1515c5> it = c1549e5.m8086w().m7886z().iterator();
                while (it.hasNext()) {
                    this.f8118a.mo9765d().m10052v().m9894b("EES program activity", it.next().m7999x());
                }
                return;
            } catch (C1821v1 unused) {
                this.f8118a.mo9765d().m10048r().m9894b("Failed to load EES program. appId", str);
                return;
            }
        }
        this.f8115i.m14817e(str);
    }

    /* renamed from: E */
    private static final Map<String, String> m9901E(C1759r3 c1759r3) {
        C3356a c3356a = new C3356a();
        if (c1759r3 != null) {
            for (C1791t3 c1791t3 : c1759r3.m8748G()) {
                c3356a.put(c1791t3.m8820x(), c1791t3.m8821y());
            }
        }
        return c3356a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static /* bridge */ /* synthetic */ C1511c1 m9902n(C2153g4 c2153g4, String str) {
        c2153g4.m10300i();
        C5984j.m21282f(str);
        C1490ae.m7927b();
        if (!c2153g4.f8118a.m10134z().m9861B(null, C2335x2.f8739v0) || !c2153g4.m9910u(str)) {
            return null;
        }
        if (c2153g4.f8113g.containsKey(str) && c2153g4.f8113g.get(str) != null) {
            c2153g4.m9900D(str, c2153g4.f8113g.get(str));
        } else {
            c2153g4.m9899C(str);
        }
        return c2153g4.f8115i.m14819h().get(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2126e
    /* renamed from: a */
    public final String mo9804a(String str, String str2) {
        mo9917h();
        m9899C(str);
        Map<String, String> map = this.f8110d.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2289s8
    /* renamed from: l */
    protected final boolean mo9853l() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final int m9904m(String str, String str2) {
        Integer num;
        mo9917h();
        m9899C(str);
        Map<String, Integer> map = this.f8114h.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public final C1759r3 m9905o(String str) {
        m10300i();
        mo9917h();
        C5984j.m21282f(str);
        m9899C(str);
        return this.f8113g.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public final String m9906p(String str) {
        mo9917h();
        return this.f8117k.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final void m9907r(String str) {
        mo9917h();
        this.f8117k.put(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public final void m9908s(String str) {
        mo9917h();
        this.f8113g.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean m9909t(String str) {
        mo9917h();
        C1759r3 m9905o = m9905o(str);
        if (m9905o == null) {
            return false;
        }
        return m9905o.m8749J();
    }

    /* renamed from: u */
    public final boolean m9910u(String str) {
        C1759r3 c1759r3;
        C1490ae.m7927b();
        return (!this.f8118a.m10134z().m9861B(null, C2335x2.f8739v0) || TextUtils.isEmpty(str) || (c1759r3 = this.f8113g.get(str)) == null || c1759r3.m8752w() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean m9911v(String str) {
        return "1".equals(mo9804a(str, "measurement.upload.blacklist_internal"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public final boolean m9912w(String str, String str2) {
        Boolean bool;
        mo9917h();
        m9899C(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f8112f.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public final boolean m9913x(String str, String str2) {
        Boolean bool;
        mo9917h();
        m9899C(str);
        if (m9911v(str) && C2169h9.m9926V(str2)) {
            return true;
        }
        if (m9914y(str) && C2169h9.m9927W(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f8111e.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public final boolean m9914y(String str) {
        return "1".equals(mo9804a(str, "measurement.upload.blacklist_public"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean m9915z(String str, byte[] bArr, String str2) {
        m10300i();
        mo9917h();
        C5984j.m21282f(str);
        C1743q3 m8683q = m9897A(str, bArr).m8683q();
        if (m8683q == null) {
            return false;
        }
        m9898B(str, m8683q);
        C1490ae.m7927b();
        if (this.f8118a.m10134z().m9861B(null, C2335x2.f8739v0)) {
            m9900D(str, m8683q.m8466p());
        }
        this.f8113g.put(str, m8683q.m8466p());
        this.f8117k.put(str, str2);
        this.f8110d.put(str, m9901E(m8683q.m8466p()));
        this.f8517b.m9755V().m10025o(str, new ArrayList(m8683q.m8710A()));
        try {
            m8683q.m8713x();
            bArr = m8683q.m8466p().m9143i();
        } catch (RuntimeException e10) {
            this.f8118a.mo9765d().m10053w().m9895c("Unable to serialize reduced-size config. Storing full config instead. appId", C2174i3.m10044z(str), e10);
        }
        C1801td.m8851b();
        if (this.f8118a.m10134z().m9861B(null, C2335x2.f8733s0)) {
            this.f8517b.m9755V().m10029s(str, bArr, str2);
        } else {
            this.f8517b.m9755V().m10029s(str, bArr, null);
        }
        this.f8113g.put(str, m8683q.m8466p());
        return true;
    }
}
