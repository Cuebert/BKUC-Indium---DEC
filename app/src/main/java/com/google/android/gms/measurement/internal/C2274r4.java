package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.r4 */
/* loaded from: classes.dex */
public final class C2274r4 {

    /* renamed from: A */
    private long f8471A;

    /* renamed from: B */
    private long f8472B;

    /* renamed from: C */
    private String f8473C;

    /* renamed from: D */
    private boolean f8474D;

    /* renamed from: E */
    private long f8475E;

    /* renamed from: F */
    private long f8476F;

    /* renamed from: a */
    private final C2219m4 f8477a;

    /* renamed from: b */
    private final String f8478b;

    /* renamed from: c */
    private String f8479c;

    /* renamed from: d */
    private String f8480d;

    /* renamed from: e */
    private String f8481e;

    /* renamed from: f */
    private String f8482f;

    /* renamed from: g */
    private long f8483g;

    /* renamed from: h */
    private long f8484h;

    /* renamed from: i */
    private long f8485i;

    /* renamed from: j */
    private String f8486j;

    /* renamed from: k */
    private long f8487k;

    /* renamed from: l */
    private String f8488l;

    /* renamed from: m */
    private long f8489m;

    /* renamed from: n */
    private long f8490n;

    /* renamed from: o */
    private boolean f8491o;

    /* renamed from: p */
    private long f8492p;

    /* renamed from: q */
    private boolean f8493q;

    /* renamed from: r */
    private String f8494r;

    /* renamed from: s */
    private Boolean f8495s;

    /* renamed from: t */
    private long f8496t;

    /* renamed from: u */
    private List<String> f8497u;

    /* renamed from: v */
    private String f8498v;

    /* renamed from: w */
    private long f8499w;

    /* renamed from: x */
    private long f8500x;

    /* renamed from: y */
    private long f8501y;

    /* renamed from: z */
    private long f8502z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2274r4(C2219m4 c2219m4, String str) {
        C5984j.m21286j(c2219m4);
        C5984j.m21282f(str);
        this.f8477a = c2219m4;
        this.f8478b = str;
        c2219m4.mo9761b().mo9917h();
    }

    /* renamed from: A */
    public final long m10228A() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8492p;
    }

    /* renamed from: B */
    public final void m10229B(String str) {
        this.f8477a.mo9761b().mo9917h();
        this.f8474D |= !C2169h9.m9930Z(this.f8473C, str);
        this.f8473C = str;
    }

    /* renamed from: C */
    public final void m10230C(long j10) {
        this.f8477a.mo9761b().mo9917h();
        this.f8474D |= this.f8485i != j10;
        this.f8485i = j10;
    }

    /* renamed from: D */
    public final void m10231D(long j10) {
        C5984j.m21277a(j10 >= 0);
        this.f8477a.mo9761b().mo9917h();
        this.f8474D = (this.f8483g != j10) | this.f8474D;
        this.f8483g = j10;
    }

    /* renamed from: E */
    public final void m10232E(long j10) {
        this.f8477a.mo9761b().mo9917h();
        this.f8474D |= this.f8484h != j10;
        this.f8484h = j10;
    }

    /* renamed from: F */
    public final void m10233F(boolean z10) {
        this.f8477a.mo9761b().mo9917h();
        this.f8474D |= this.f8491o != z10;
        this.f8491o = z10;
    }

    /* renamed from: G */
    public final void m10234G(Boolean bool) {
        boolean equals;
        this.f8477a.mo9761b().mo9917h();
        boolean z10 = this.f8474D;
        Boolean bool2 = this.f8495s;
        int i10 = C2169h9.f8148i;
        if (bool2 == null && bool == null) {
            equals = true;
        } else {
            equals = bool2 == null ? false : bool2.equals(bool);
        }
        this.f8474D = z10 | (!equals);
        this.f8495s = bool;
    }

    /* renamed from: H */
    public final void m10235H(String str) {
        this.f8477a.mo9761b().mo9917h();
        this.f8474D |= !C2169h9.m9930Z(this.f8481e, str);
        this.f8481e = str;
    }

    /* renamed from: I */
    public final void m10236I(List<String> list) {
        this.f8477a.mo9761b().mo9917h();
        List<String> list2 = this.f8497u;
        int i10 = C2169h9.f8148i;
        if (list2 == null && list == null) {
            return;
        }
        if (list2 != null && list2.equals(list)) {
            return;
        }
        this.f8474D = true;
        this.f8497u = list != null ? new ArrayList(list) : null;
    }

    /* renamed from: J */
    public final boolean m10237J() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8493q;
    }

    /* renamed from: K */
    public final boolean m10238K() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8491o;
    }

    /* renamed from: L */
    public final boolean m10239L() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8474D;
    }

    /* renamed from: M */
    public final long m10240M() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8487k;
    }

    /* renamed from: N */
    public final long m10241N() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8475E;
    }

    /* renamed from: O */
    public final long m10242O() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8502z;
    }

    /* renamed from: P */
    public final long m10243P() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8471A;
    }

    /* renamed from: Q */
    public final long m10244Q() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8501y;
    }

    /* renamed from: R */
    public final long m10245R() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8500x;
    }

    /* renamed from: S */
    public final long m10246S() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8472B;
    }

    /* renamed from: T */
    public final long m10247T() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8499w;
    }

    /* renamed from: U */
    public final long m10248U() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8490n;
    }

    /* renamed from: V */
    public final long m10249V() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8496t;
    }

    /* renamed from: W */
    public final long m10250W() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8476F;
    }

    /* renamed from: X */
    public final long m10251X() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8489m;
    }

    /* renamed from: Y */
    public final long m10252Y() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8485i;
    }

    /* renamed from: Z */
    public final long m10253Z() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8483g;
    }

    /* renamed from: a */
    public final String m10254a() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8473C;
    }

    /* renamed from: a0 */
    public final long m10255a0() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8484h;
    }

    /* renamed from: b */
    public final String m10256b() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8481e;
    }

    /* renamed from: b0 */
    public final Boolean m10257b0() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8495s;
    }

    /* renamed from: c */
    public final List<String> m10258c() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8497u;
    }

    /* renamed from: c0 */
    public final String m10259c0() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8494r;
    }

    /* renamed from: d */
    public final void m10260d() {
        this.f8477a.mo9761b().mo9917h();
        this.f8474D = false;
    }

    /* renamed from: d0 */
    public final String m10261d0() {
        this.f8477a.mo9761b().mo9917h();
        String str = this.f8473C;
        m10229B(null);
        return str;
    }

    /* renamed from: e */
    public final void m10262e() {
        this.f8477a.mo9761b().mo9917h();
        long j10 = this.f8483g + 1;
        if (j10 > 2147483647L) {
            this.f8477a.mo9765d().m10053w().m9894b("Bundle index overflow. appId", C2174i3.m10044z(this.f8478b));
            j10 = 0;
        }
        this.f8474D = true;
        this.f8483g = j10;
    }

    /* renamed from: e0 */
    public final String m10263e0() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8478b;
    }

    /* renamed from: f */
    public final void m10264f(String str) {
        this.f8477a.mo9761b().mo9917h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f8474D |= true ^ C2169h9.m9930Z(this.f8494r, str);
        this.f8494r = str;
    }

    /* renamed from: f0 */
    public final String m10265f0() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8479c;
    }

    /* renamed from: g */
    public final void m10266g(boolean z10) {
        this.f8477a.mo9761b().mo9917h();
        this.f8474D |= this.f8493q != z10;
        this.f8493q = z10;
    }

    /* renamed from: g0 */
    public final String m10267g0() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8488l;
    }

    /* renamed from: h */
    public final void m10268h(long j10) {
        this.f8477a.mo9761b().mo9917h();
        this.f8474D |= this.f8492p != j10;
        this.f8492p = j10;
    }

    /* renamed from: h0 */
    public final String m10269h0() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8486j;
    }

    /* renamed from: i */
    public final void m10270i(String str) {
        this.f8477a.mo9761b().mo9917h();
        this.f8474D |= !C2169h9.m9930Z(this.f8479c, str);
        this.f8479c = str;
    }

    /* renamed from: i0 */
    public final String m10271i0() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8482f;
    }

    /* renamed from: j */
    public final void m10272j(String str) {
        this.f8477a.mo9761b().mo9917h();
        this.f8474D |= !C2169h9.m9930Z(this.f8488l, str);
        this.f8488l = str;
    }

    /* renamed from: j0 */
    public final String m10273j0() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8498v;
    }

    /* renamed from: k */
    public final void m10274k(String str) {
        this.f8477a.mo9761b().mo9917h();
        this.f8474D |= !C2169h9.m9930Z(this.f8486j, str);
        this.f8486j = str;
    }

    /* renamed from: k0 */
    public final String m10275k0() {
        this.f8477a.mo9761b().mo9917h();
        return this.f8480d;
    }

    /* renamed from: l */
    public final void m10276l(long j10) {
        this.f8477a.mo9761b().mo9917h();
        this.f8474D |= this.f8487k != j10;
        this.f8487k = j10;
    }

    /* renamed from: m */
    public final void m10277m(long j10) {
        this.f8477a.mo9761b().mo9917h();
        this.f8474D |= this.f8475E != j10;
        this.f8475E = j10;
    }

    /* renamed from: n */
    public final void m10278n(long j10) {
        this.f8477a.mo9761b().mo9917h();
        this.f8474D |= this.f8502z != j10;
        this.f8502z = j10;
    }

    /* renamed from: o */
    public final void m10279o(long j10) {
        this.f8477a.mo9761b().mo9917h();
        this.f8474D |= this.f8471A != j10;
        this.f8471A = j10;
    }

    /* renamed from: p */
    public final void m10280p(long j10) {
        this.f8477a.mo9761b().mo9917h();
        this.f8474D |= this.f8501y != j10;
        this.f8501y = j10;
    }

    /* renamed from: q */
    public final void m10281q(long j10) {
        this.f8477a.mo9761b().mo9917h();
        this.f8474D |= this.f8500x != j10;
        this.f8500x = j10;
    }

    /* renamed from: r */
    public final void m10282r(long j10) {
        this.f8477a.mo9761b().mo9917h();
        this.f8474D |= this.f8472B != j10;
        this.f8472B = j10;
    }

    /* renamed from: s */
    public final void m10283s(long j10) {
        this.f8477a.mo9761b().mo9917h();
        this.f8474D |= this.f8499w != j10;
        this.f8499w = j10;
    }

    /* renamed from: t */
    public final void m10284t(long j10) {
        this.f8477a.mo9761b().mo9917h();
        this.f8474D |= this.f8490n != j10;
        this.f8490n = j10;
    }

    /* renamed from: u */
    public final void m10285u(long j10) {
        this.f8477a.mo9761b().mo9917h();
        this.f8474D |= this.f8496t != j10;
        this.f8496t = j10;
    }

    /* renamed from: v */
    public final void m10286v(long j10) {
        this.f8477a.mo9761b().mo9917h();
        this.f8474D |= this.f8476F != j10;
        this.f8476F = j10;
    }

    /* renamed from: w */
    public final void m10287w(String str) {
        this.f8477a.mo9761b().mo9917h();
        this.f8474D |= !C2169h9.m9930Z(this.f8482f, str);
        this.f8482f = str;
    }

    /* renamed from: x */
    public final void m10288x(String str) {
        this.f8477a.mo9761b().mo9917h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f8474D |= true ^ C2169h9.m9930Z(this.f8498v, str);
        this.f8498v = str;
    }

    /* renamed from: y */
    public final void m10289y(String str) {
        this.f8477a.mo9761b().mo9917h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f8474D |= true ^ C2169h9.m9930Z(this.f8480d, str);
        this.f8480d = str;
    }

    /* renamed from: z */
    public final void m10290z(long j10) {
        this.f8477a.mo9761b().mo9917h();
        this.f8474D |= this.f8489m != j10;
        this.f8489m = j10;
    }
}
