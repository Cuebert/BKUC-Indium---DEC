package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import com.appsflyer.oaid.BuildConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.internal.y6 */
/* loaded from: classes.dex */
public final class C2349y6 extends AbstractC2316v3 {

    /* renamed from: c */
    private volatile C2276r6 f8774c;

    /* renamed from: d */
    private volatile C2276r6 f8775d;

    /* renamed from: e */
    protected C2276r6 f8776e;

    /* renamed from: f */
    private final Map<Activity, C2276r6> f8777f;

    /* renamed from: g */
    private Activity f8778g;

    /* renamed from: h */
    private volatile boolean f8779h;

    /* renamed from: i */
    private volatile C2276r6 f8780i;

    /* renamed from: j */
    private C2276r6 f8781j;

    /* renamed from: k */
    private boolean f8782k;

    /* renamed from: l */
    private final Object f8783l;

    /* renamed from: m */
    private C2276r6 f8784m;

    /* renamed from: n */
    private String f8785n;

    public C2349y6(C2219m4 c2219m4) {
        super(c2219m4);
        this.f8783l = new Object();
        this.f8777f = new ConcurrentHashMap();
    }

    /* renamed from: H */
    private final C2276r6 m10336H(Activity activity) {
        C5984j.m21286j(activity);
        C2276r6 c2276r6 = this.f8777f.get(activity);
        if (c2276r6 == null) {
            C2276r6 c2276r62 = new C2276r6(null, m10354u(activity.getClass(), "Activity"), this.f8118a.m10114N().m9976r0());
            this.f8777f.put(activity, c2276r62);
            c2276r6 = c2276r62;
        }
        return this.f8780i != null ? this.f8780i : c2276r6;
    }

    /* renamed from: o */
    private final void m10337o(Activity activity, C2276r6 c2276r6, boolean z10) {
        C2276r6 c2276r62;
        C2276r6 c2276r63 = this.f8774c == null ? this.f8775d : this.f8774c;
        if (c2276r6.f8506b == null) {
            c2276r62 = new C2276r6(c2276r6.f8505a, activity != null ? m10354u(activity.getClass(), "Activity") : null, c2276r6.f8507c, c2276r6.f8509e, c2276r6.f8510f);
        } else {
            c2276r62 = c2276r6;
        }
        this.f8775d = this.f8774c;
        this.f8774c = c2276r62;
        this.f8118a.mo9761b().m10081z(new RunnableC2298t6(this, c2276r62, c2276r63, this.f8118a.mo9767e().mo13782b(), z10));
    }

    /* renamed from: p */
    public final void m10338p(C2276r6 c2276r6, C2276r6 c2276r62, long j10, boolean z10, Bundle bundle) {
        Bundle bundle2;
        long j11;
        long j12;
        mo9917h();
        boolean z11 = false;
        boolean z12 = (c2276r62 != null && c2276r62.f8507c == c2276r6.f8507c && C2169h9.m9930Z(c2276r62.f8506b, c2276r6.f8506b) && C2169h9.m9930Z(c2276r62.f8505a, c2276r6.f8505a)) ? false : true;
        if (z10 && this.f8776e != null) {
            z11 = true;
        }
        if (z12) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            C2169h9.m9941x(c2276r6, bundle3, true);
            if (c2276r62 != null) {
                String str = c2276r62.f8505a;
                if (str != null) {
                    bundle3.putString("_pn", str);
                }
                String str2 = c2276r62.f8506b;
                if (str2 != null) {
                    bundle3.putString("_pc", str2);
                }
                bundle3.putLong("_pi", c2276r62.f8507c);
            }
            if (z11) {
                C2212l8 c2212l8 = this.f8118a.m10113M().f8374e;
                long j13 = j10 - c2212l8.f8276b;
                c2212l8.f8276b = j10;
                if (j13 > 0) {
                    this.f8118a.m10114N().m9981v(bundle3, j13);
                }
            }
            if (!this.f8118a.m10134z().m9863D()) {
                bundle3.putLong("_mst", 1L);
            }
            String str3 = true != c2276r6.f8509e ? "auto" : "app";
            long mo13781a = this.f8118a.mo9767e().mo13781a();
            if (c2276r6.f8509e) {
                j11 = mo13781a;
                long j14 = c2276r6.f8510f;
                if (j14 != 0) {
                    j12 = j14;
                    this.f8118a.m10109I().m10176v(str3, "_vs", j12, bundle3);
                }
            } else {
                j11 = mo13781a;
            }
            j12 = j11;
            this.f8118a.m10109I().m10176v(str3, "_vs", j12, bundle3);
        }
        if (z11) {
            m10339q(this.f8776e, true, j10);
        }
        this.f8776e = c2276r6;
        if (c2276r6.f8509e) {
            this.f8781j = c2276r6;
        }
        this.f8118a.m10112L().m10385u(c2276r6);
    }

    /* renamed from: q */
    public final void m10339q(C2276r6 c2276r6, boolean z10, long j10) {
        this.f8118a.m10133y().m10399n(this.f8118a.mo9767e().mo13782b());
        if (!this.f8118a.m10113M().f8374e.m10090d(c2276r6 != null && c2276r6.f8508d, z10, j10) || c2276r6 == null) {
            return;
        }
        c2276r6.f8508d = false;
    }

    /* renamed from: x */
    public static /* bridge */ /* synthetic */ void m10343x(C2349y6 c2349y6, Bundle bundle, C2276r6 c2276r6, C2276r6 c2276r62, long j10) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        c2349y6.m10338p(c2276r6, c2276r62, j10, true, c2349y6.f8118a.m10114N().m9982v0(null, "screen_view", bundle, null, false));
    }

    /* renamed from: A */
    public final void m10345A(Activity activity) {
        synchronized (this.f8783l) {
            if (activity == this.f8778g) {
                this.f8778g = null;
            }
        }
        if (this.f8118a.m10134z().m9863D()) {
            this.f8777f.remove(activity);
        }
    }

    /* renamed from: B */
    public final void m10346B(Activity activity) {
        synchronized (this.f8783l) {
            this.f8782k = false;
            this.f8779h = true;
        }
        long mo13782b = this.f8118a.mo9767e().mo13782b();
        if (!this.f8118a.m10134z().m9863D()) {
            this.f8774c = null;
            this.f8118a.mo9761b().m10081z(new RunnableC2319v6(this, mo13782b));
        } else {
            C2276r6 m10336H = m10336H(activity);
            this.f8775d = this.f8774c;
            this.f8774c = null;
            this.f8118a.mo9761b().m10081z(new RunnableC2329w6(this, m10336H, mo13782b));
        }
    }

    /* renamed from: C */
    public final void m10347C(Activity activity) {
        synchronized (this.f8783l) {
            this.f8782k = true;
            if (activity != this.f8778g) {
                synchronized (this.f8783l) {
                    this.f8778g = activity;
                    this.f8779h = false;
                }
                if (this.f8118a.m10134z().m9863D()) {
                    this.f8780i = null;
                    this.f8118a.mo9761b().m10081z(new RunnableC2339x6(this));
                }
            }
        }
        if (!this.f8118a.m10134z().m9863D()) {
            this.f8774c = this.f8780i;
            this.f8118a.mo9761b().m10081z(new RunnableC2309u6(this));
        } else {
            m10337o(activity, m10336H(activity), false);
            C2354z1 m10133y = this.f8118a.m10133y();
            m10133y.f8118a.mo9761b().m10081z(new RunnableC2343y0(m10133y, m10133y.f8118a.mo9767e().mo13782b()));
        }
    }

    /* renamed from: D */
    public final void m10348D(Activity activity, Bundle bundle) {
        C2276r6 c2276r6;
        if (!this.f8118a.m10134z().m9863D() || bundle == null || (c2276r6 = this.f8777f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c2276r6.f8507c);
        bundle2.putString("name", c2276r6.f8505a);
        bundle2.putString("referrer_name", c2276r6.f8506b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r5.length() <= 100) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b4, code lost:
    
        if (r6.length() <= 100) goto L84;
     */
    @java.lang.Deprecated
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10349E(android.app.Activity r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.m4 r0 = r3.f8118a
            com.google.android.gms.measurement.internal.f r0 = r0.m10134z()
            boolean r0 = r0.m9863D()
            if (r0 != 0) goto L1c
            com.google.android.gms.measurement.internal.m4 r4 = r3.f8118a
            com.google.android.gms.measurement.internal.i3 r4 = r4.mo9765d()
            com.google.android.gms.measurement.internal.g3 r4 = r4.m10054x()
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.m9893a(r5)
            return
        L1c:
            com.google.android.gms.measurement.internal.r6 r0 = r3.f8774c
            if (r0 != 0) goto L30
            com.google.android.gms.measurement.internal.m4 r4 = r3.f8118a
            com.google.android.gms.measurement.internal.i3 r4 = r4.mo9765d()
            com.google.android.gms.measurement.internal.g3 r4 = r4.m10054x()
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.m9893a(r5)
            return
        L30:
            java.util.Map<android.app.Activity, com.google.android.gms.measurement.internal.r6> r1 = r3.f8777f
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L48
            com.google.android.gms.measurement.internal.m4 r4 = r3.f8118a
            com.google.android.gms.measurement.internal.i3 r4 = r4.mo9765d()
            com.google.android.gms.measurement.internal.g3 r4 = r4.m10054x()
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.m9893a(r5)
            return
        L48:
            if (r6 != 0) goto L54
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.m10354u(r6, r1)
        L54:
            java.lang.String r1 = r0.f8506b
            boolean r1 = com.google.android.gms.measurement.internal.C2169h9.m9930Z(r1, r6)
            java.lang.String r0 = r0.f8505a
            boolean r0 = com.google.android.gms.measurement.internal.C2169h9.m9930Z(r0, r5)
            if (r1 == 0) goto L75
            if (r0 != 0) goto L65
            goto L75
        L65:
            com.google.android.gms.measurement.internal.m4 r4 = r3.f8118a
            com.google.android.gms.measurement.internal.i3 r4 = r4.mo9765d()
            com.google.android.gms.measurement.internal.g3 r4 = r4.m10054x()
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.m9893a(r5)
            return
        L75:
            r0 = 100
            if (r5 == 0) goto La3
            int r1 = r5.length()
            if (r1 <= 0) goto L8b
            com.google.android.gms.measurement.internal.m4 r1 = r3.f8118a
            r1.m10134z()
            int r1 = r5.length()
            if (r1 > r0) goto L8b
            goto La3
        L8b:
            com.google.android.gms.measurement.internal.m4 r4 = r3.f8118a
            com.google.android.gms.measurement.internal.i3 r4 = r4.mo9765d()
            com.google.android.gms.measurement.internal.g3 r4 = r4.m10054x()
            int r5 = r5.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            r4.m9894b(r6, r5)
            return
        La3:
            if (r6 == 0) goto Lcf
            int r1 = r6.length()
            if (r1 <= 0) goto Lb7
            com.google.android.gms.measurement.internal.m4 r1 = r3.f8118a
            r1.m10134z()
            int r1 = r6.length()
            if (r1 > r0) goto Lb7
            goto Lcf
        Lb7:
            com.google.android.gms.measurement.internal.m4 r4 = r3.f8118a
            com.google.android.gms.measurement.internal.i3 r4 = r4.mo9765d()
            com.google.android.gms.measurement.internal.g3 r4 = r4.m10054x()
            int r5 = r6.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            r4.m9894b(r6, r5)
            return
        Lcf:
            com.google.android.gms.measurement.internal.m4 r0 = r3.f8118a
            com.google.android.gms.measurement.internal.i3 r0 = r0.mo9765d()
            com.google.android.gms.measurement.internal.g3 r0 = r0.m10052v()
            if (r5 != 0) goto Lde
            java.lang.String r1 = "null"
            goto Ldf
        Lde:
            r1 = r5
        Ldf:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.m9895c(r2, r1, r6)
            com.google.android.gms.measurement.internal.r6 r0 = new com.google.android.gms.measurement.internal.r6
            com.google.android.gms.measurement.internal.m4 r1 = r3.f8118a
            com.google.android.gms.measurement.internal.h9 r1 = r1.m10114N()
            long r1 = r1.m9976r0()
            r0.<init>(r5, r6, r1)
            java.util.Map<android.app.Activity, com.google.android.gms.measurement.internal.r6> r5 = r3.f8777f
            r5.put(r4, r0)
            r5 = 1
            r3.m10337o(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2349y6.m10349E(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r2 > 100) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r4 > 100) goto L85;
     */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10350F(android.os.Bundle r13, long r14) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2349y6.m10350F(android.os.Bundle, long):void");
    }

    /* renamed from: G */
    public final void m10351G(String str, C2276r6 c2276r6) {
        mo9917h();
        synchronized (this) {
            String str2 = this.f8785n;
            if (str2 == null || str2.equals(str) || c2276r6 != null) {
                this.f8785n = str;
                this.f8784m = c2276r6;
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2316v3
    /* renamed from: n */
    protected final boolean mo9718n() {
        return false;
    }

    /* renamed from: s */
    public final C2276r6 m10352s() {
        return this.f8774c;
    }

    /* renamed from: t */
    public final C2276r6 m10353t(boolean z10) {
        m10313i();
        mo9917h();
        if (!z10) {
            return this.f8776e;
        }
        C2276r6 c2276r6 = this.f8776e;
        return c2276r6 != null ? c2276r6 : this.f8781j;
    }

    /* renamed from: u */
    final String m10354u(Class<?> cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : BuildConfig.FLAVOR;
        int length2 = str2.length();
        this.f8118a.m10134z();
        if (length2 <= 100) {
            return str2;
        }
        this.f8118a.m10134z();
        return str2.substring(0, 100);
    }

    /* renamed from: z */
    public final void m10355z(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.f8118a.m10134z().m9863D() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f8777f.put(activity, new C2276r6(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }
}
