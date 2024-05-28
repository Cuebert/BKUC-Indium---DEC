package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C1642je;
import com.google.android.gms.internal.measurement.C1720oc;
import com.google.android.gms.internal.measurement.C1768rc;
import com.google.android.gms.internal.measurement.C1880yc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p018b4.C0987a;
import p018b4.C0999m;
import p018b4.C1000n;
import p018b4.C1002p;
import p018b4.InterfaceC1003q;
import p018b4.InterfaceC1004r;
import p070f3.C3131e;
import p070f3.C3139m;
import p093h0.C3356a;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.internal.m6 */
/* loaded from: classes.dex */
public final class C2221m6 extends AbstractC2316v3 {

    /* renamed from: c */
    protected C2199k6 f8331c;

    /* renamed from: d */
    private InterfaceC1003q f8332d;

    /* renamed from: e */
    private final Set<InterfaceC1004r> f8333e;

    /* renamed from: f */
    private boolean f8334f;

    /* renamed from: g */
    private final AtomicReference<String> f8335g;

    /* renamed from: h */
    private final Object f8336h;

    /* renamed from: i */
    private C0987a f8337i;

    /* renamed from: j */
    private int f8338j;

    /* renamed from: k */
    private final AtomicLong f8339k;

    /* renamed from: l */
    private long f8340l;

    /* renamed from: m */
    private int f8341m;

    /* renamed from: n */
    final C2235n9 f8342n;

    /* renamed from: o */
    protected boolean f8343o;

    /* renamed from: p */
    private final InterfaceC2158g9 f8344p;

    public C2221m6(C2219m4 c2219m4) {
        super(c2219m4);
        this.f8333e = new CopyOnWriteArraySet();
        this.f8336h = new Object();
        this.f8343o = true;
        this.f8344p = new C2089a6(this);
        this.f8335g = new AtomicReference<>();
        this.f8337i = new C0987a(null, null);
        this.f8338j = 100;
        this.f8340l = -1L;
        this.f8341m = 100;
        this.f8339k = new AtomicLong(0L);
        this.f8342n = new C2235n9(c2219m4);
    }

    /* renamed from: P */
    public final void m10170p(Bundle bundle, long j10) {
        C1768rc.m8768b();
        if (this.f8118a.m10134z().m9861B(null, C2335x2.f8735t0) && !TextUtils.isEmpty(this.f8118a.m10103B().m9725u())) {
            this.f8118a.mo9765d().m10054x().m9893a("Using developer consent only; google app id found");
        } else {
            m10146F(bundle, 0, j10);
        }
    }

    /* renamed from: Q */
    public final void m10136Q(Boolean bool, boolean z10) {
        mo9917h();
        m10313i();
        this.f8118a.mo9765d().m10047q().m9894b("Setting app measurement enabled (FE)", bool);
        this.f8118a.m10107F().m10323s(bool);
        if (z10) {
            C2326w3 m10107F = this.f8118a.m10107F();
            C2219m4 c2219m4 = m10107F.f8118a;
            m10107F.mo9917h();
            SharedPreferences.Editor edit = m10107F.m10319o().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.f8118a.m10128p() || !(bool == null || bool.booleanValue())) {
            m10137R();
        }
    }

    /* renamed from: R */
    public final void m10137R() {
        mo9917h();
        String m10311a = this.f8118a.m10107F().f8640m.m10311a();
        if (m10311a != null) {
            if ("unset".equals(m10311a)) {
                m10154N("app", "_npa", null, this.f8118a.mo9767e().mo13781a());
            } else {
                m10154N("app", "_npa", Long.valueOf(true != "true".equals(m10311a) ? 0L : 1L), this.f8118a.mo9767e().mo13781a());
            }
        }
        if (this.f8118a.m10127o() && this.f8343o) {
            this.f8118a.mo9765d().m10047q().m9893a("Recording app launch after enabling measurement for the first time (FE)");
            m10167g0();
            C1880yc.m9107b();
            if (this.f8118a.m10134z().m9861B(null, C2335x2.f8717k0)) {
                this.f8118a.m10113M().f8373d.m10181a();
            }
            this.f8118a.mo9761b().m10081z(new RunnableC2264q5(this));
            return;
        }
        this.f8118a.mo9765d().m10047q().m9893a("Updating Scion state (FE)");
        this.f8118a.m10112L().m10387w();
    }

    /* renamed from: d0 */
    public static /* synthetic */ void m10138d0(C2221m6 c2221m6, C0987a c0987a, int i10, long j10, boolean z10, boolean z11) {
        c2221m6.mo9917h();
        c2221m6.m10313i();
        if (j10 <= c2221m6.f8340l && C0987a.m6192l(c2221m6.f8341m, i10)) {
            c2221m6.f8118a.mo9765d().m10051u().m9894b("Dropped out-of-date consent setting, proposed settings", c0987a);
            return;
        }
        C2326w3 m10107F = c2221m6.f8118a.m10107F();
        C2219m4 c2219m4 = m10107F.f8118a;
        m10107F.mo9917h();
        if (m10107F.m10327w(i10)) {
            SharedPreferences.Editor edit = m10107F.m10319o().edit();
            edit.putString("consent_settings", c0987a.m6201i());
            edit.putInt("consent_source", i10);
            edit.apply();
            c2221m6.f8340l = j10;
            c2221m6.f8341m = i10;
            c2221m6.f8118a.m10112L().m10384t(z10);
            if (z11) {
                c2221m6.f8118a.m10112L().m10374S(new AtomicReference<>());
                return;
            }
            return;
        }
        c2221m6.f8118a.mo9765d().m10051u().m9894b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i10));
    }

    /* renamed from: A */
    protected final void m10141A(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i10 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i10 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i10];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelable);
                        }
                        i10++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i10 < list.size()) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                        i10++;
                    }
                }
            }
        }
        this.f8118a.mo9761b().m10081z(new RunnableC2286s5(this, str, str2, j10, bundle2, z10, z11, z12, str3));
    }

    /* renamed from: B */
    final void m10142B(String str, String str2, long j10, Object obj) {
        this.f8118a.mo9761b().m10081z(new RunnableC2297t5(this, str, str2, obj, j10));
    }

    /* renamed from: C */
    public final void m10143C(String str) {
        this.f8335g.set(str);
    }

    /* renamed from: D */
    public final void m10144D(Bundle bundle) {
        m10145E(bundle, this.f8118a.mo9767e().mo13781a());
    }

    /* renamed from: E */
    public final void m10145E(Bundle bundle, long j10) {
        C5984j.m21286j(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f8118a.mo9765d().m10053w().m9893a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        C5984j.m21286j(bundle2);
        C0999m.m6228a(bundle2, "app_id", String.class, null);
        C0999m.m6228a(bundle2, "origin", String.class, null);
        C0999m.m6228a(bundle2, "name", String.class, null);
        C0999m.m6228a(bundle2, "value", Object.class, null);
        C0999m.m6228a(bundle2, "trigger_event_name", String.class, null);
        C0999m.m6228a(bundle2, "trigger_timeout", Long.class, 0L);
        C0999m.m6228a(bundle2, "timed_out_event_name", String.class, null);
        C0999m.m6228a(bundle2, "timed_out_event_params", Bundle.class, null);
        C0999m.m6228a(bundle2, "triggered_event_name", String.class, null);
        C0999m.m6228a(bundle2, "triggered_event_params", Bundle.class, null);
        C0999m.m6228a(bundle2, "time_to_live", Long.class, 0L);
        C0999m.m6228a(bundle2, "expired_event_name", String.class, null);
        C0999m.m6228a(bundle2, "expired_event_params", Bundle.class, null);
        C5984j.m21282f(bundle2.getString("name"));
        C5984j.m21282f(bundle2.getString("origin"));
        C5984j.m21286j(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.f8118a.m10114N().m9969n0(string) == 0) {
            if (this.f8118a.m10114N().m9965j0(string, obj) == 0) {
                Object m9972p = this.f8118a.m10114N().m9972p(string, obj);
                if (m9972p == null) {
                    this.f8118a.mo9765d().m10048r().m9895c("Unable to normalize conditional user property value", this.f8118a.m10105D().m9811f(string), obj);
                    return;
                }
                C0999m.m6229b(bundle2, m9972p);
                long j11 = bundle2.getLong("trigger_timeout");
                if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                    this.f8118a.m10134z();
                    if (j11 > 15552000000L || j11 < 1) {
                        this.f8118a.mo9765d().m10048r().m9895c("Invalid conditional user property timeout", this.f8118a.m10105D().m9811f(string), Long.valueOf(j11));
                        return;
                    }
                }
                long j12 = bundle2.getLong("time_to_live");
                this.f8118a.m10134z();
                if (j12 <= 15552000000L && j12 >= 1) {
                    this.f8118a.mo9761b().m10081z(new RunnableC2318v5(this, bundle2));
                    return;
                } else {
                    this.f8118a.mo9765d().m10048r().m9895c("Invalid conditional user property time to live", this.f8118a.m10105D().m9811f(string), Long.valueOf(j12));
                    return;
                }
            }
            this.f8118a.mo9765d().m10048r().m9895c("Invalid conditional user property value", this.f8118a.m10105D().m9811f(string), obj);
            return;
        }
        this.f8118a.mo9765d().m10048r().m9894b("Invalid conditional user property name", this.f8118a.m10105D().m9811f(string));
    }

    /* renamed from: F */
    public final void m10146F(Bundle bundle, int i10, long j10) {
        m10313i();
        String m6191h = C0987a.m6191h(bundle);
        if (m6191h != null) {
            this.f8118a.mo9765d().m10054x().m9894b("Ignoring invalid consent setting", m6191h);
            this.f8118a.mo9765d().m10054x().m9893a("Valid consent values are 'granted', 'denied'");
        }
        m10147G(C0987a.m6188a(bundle), i10, j10);
    }

    /* renamed from: G */
    public final void m10147G(C0987a c0987a, int i10, long j10) {
        boolean z10;
        boolean z11;
        C0987a c0987a2;
        boolean z12;
        m10313i();
        if (i10 != -10 && c0987a.m6199e() == null && c0987a.m6200f() == null) {
            this.f8118a.mo9765d().m10054x().m9893a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f8336h) {
            z10 = true;
            z11 = false;
            if (C0987a.m6192l(i10, this.f8338j)) {
                boolean m6204m = c0987a.m6204m(this.f8337i);
                if (c0987a.m6203k() && !this.f8337i.m6203k()) {
                    z11 = true;
                }
                C0987a m6198d = c0987a.m6198d(this.f8337i);
                this.f8337i = m6198d;
                this.f8338j = i10;
                c0987a2 = m6198d;
                z12 = z11;
                z11 = m6204m;
            } else {
                c0987a2 = c0987a;
                z12 = false;
                z10 = false;
            }
        }
        if (!z10) {
            this.f8118a.mo9765d().m10051u().m9894b("Ignoring lower-priority consent settings, proposed settings", c0987a2);
            return;
        }
        long andIncrement = this.f8339k.getAndIncrement();
        if (z11) {
            this.f8335g.set(null);
            this.f8118a.mo9761b().m10075A(new RunnableC2155g6(this, c0987a2, j10, i10, andIncrement, z12));
        } else if (i10 != 30 && i10 != -10) {
            this.f8118a.mo9761b().m10081z(new RunnableC2177i6(this, c0987a2, i10, andIncrement, z12));
        } else {
            this.f8118a.mo9761b().m10075A(new RunnableC2166h6(this, c0987a2, i10, andIncrement, z12));
        }
    }

    /* renamed from: H */
    public final void m10148H(Bundle bundle, long j10) {
        C1768rc.m8768b();
        if (this.f8118a.m10134z().m9861B(null, C2335x2.f8737u0)) {
            this.f8118a.mo9761b().m10075A(new Runnable() { // from class: com.google.android.gms.measurement.internal.o5

                /* renamed from: o */
                public final /* synthetic */ Bundle f8397o;

                /* renamed from: p */
                public final /* synthetic */ long f8398p;

                public /* synthetic */ RunnableC2242o5(Bundle bundle2, long j102) {
                    r2 = bundle2;
                    r3 = j102;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C2221m6.this.m10170p(r2, r3);
                }
            });
        } else {
            m10170p(bundle2, j102);
        }
    }

    /* renamed from: I */
    public final void m10149I(InterfaceC1003q interfaceC1003q) {
        InterfaceC1003q interfaceC1003q2;
        mo9917h();
        m10313i();
        if (interfaceC1003q != null && interfaceC1003q != (interfaceC1003q2 = this.f8332d)) {
            C5984j.m21290n(interfaceC1003q2 == null, "EventInterceptor already set.");
        }
        this.f8332d = interfaceC1003q;
    }

    /* renamed from: J */
    public final void m10150J(Boolean bool) {
        m10313i();
        this.f8118a.mo9761b().m10081z(new RunnableC2144f6(this, bool));
    }

    /* renamed from: K */
    public final void m10151K(C0987a c0987a) {
        mo9917h();
        boolean z10 = (c0987a.m6203k() && c0987a.m6202j()) || this.f8118a.m10112L().m10367A();
        if (z10 != this.f8118a.m10128p()) {
            this.f8118a.m10124l(z10);
            C2326w3 m10107F = this.f8118a.m10107F();
            C2219m4 c2219m4 = m10107F.f8118a;
            m10107F.mo9917h();
            Boolean valueOf = m10107F.m10319o().contains("measurement_enabled_from_api") ? Boolean.valueOf(m10107F.m10319o().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || valueOf == null || valueOf.booleanValue()) {
                m10136Q(Boolean.valueOf(z10), false);
            }
        }
    }

    /* renamed from: L */
    public final void m10152L(String str, String str2, Object obj, boolean z10) {
        m10153M("auto", "_ldl", obj, true, this.f8118a.mo9767e().mo13781a());
    }

    /* renamed from: M */
    public final void m10153M(String str, String str2, Object obj, boolean z10, long j10) {
        int i10;
        String str3 = str == null ? "app" : str;
        if (z10) {
            i10 = this.f8118a.m10114N().m9969n0(str2);
        } else {
            C2169h9 m10114N = this.f8118a.m10114N();
            if (m10114N.m9958Q("user property", str2)) {
                if (m10114N.m9954M("user property", C1002p.f5189a, null, str2)) {
                    m10114N.f8118a.m10134z();
                    if (m10114N.m9953L("user property", 24, str2)) {
                        i10 = 0;
                    }
                } else {
                    i10 = 15;
                }
            }
            i10 = 6;
        }
        if (i10 != 0) {
            C2169h9 m10114N2 = this.f8118a.m10114N();
            this.f8118a.m10134z();
            this.f8118a.m10114N().m9942A(this.f8344p, null, i10, "_ev", m10114N2.m9974q(str2, 24, true), str2 != null ? str2.length() : 0);
        } else {
            if (obj != null) {
                int m9965j0 = this.f8118a.m10114N().m9965j0(str2, obj);
                if (m9965j0 != 0) {
                    C2169h9 m10114N3 = this.f8118a.m10114N();
                    this.f8118a.m10134z();
                    this.f8118a.m10114N().m9942A(this.f8344p, null, m9965j0, "_ev", m10114N3.m9974q(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
                    return;
                } else {
                    Object m9972p = this.f8118a.m10114N().m9972p(str2, obj);
                    if (m9972p != null) {
                        m10142B(str3, str2, j10, m9972p);
                        return;
                    }
                    return;
                }
            }
            m10142B(str3, str2, j10, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10154N(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            p321z2.C5984j.m21282f(r9)
            p321z2.C5984j.m21282f(r10)
            r8.mo9917h()
            r8.m10313i()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L64
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L52
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L52
            r10 = 1
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r10 == r11) goto L37
            r10 = 0
            goto L38
        L37:
            r10 = r2
        L38:
            java.lang.Long r11 = java.lang.Long.valueOf(r10)
            com.google.android.gms.measurement.internal.m4 r10 = r8.f8118a
            com.google.android.gms.measurement.internal.w3 r10 = r10.m10107F()
            com.google.android.gms.measurement.internal.u3 r10 = r10.f8640m
            long r4 = r11.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L4e
            java.lang.String r0 = "true"
        L4e:
            r10.m10312b(r0)
            goto L61
        L52:
            if (r11 != 0) goto L64
            com.google.android.gms.measurement.internal.m4 r10 = r8.f8118a
            com.google.android.gms.measurement.internal.w3 r10 = r10.m10107F()
            com.google.android.gms.measurement.internal.u3 r10 = r10.f8640m
            java.lang.String r0 = "unset"
            r10.m10312b(r0)
        L61:
            r6 = r11
            r3 = r1
            goto L66
        L64:
            r3 = r10
            r6 = r11
        L66:
            com.google.android.gms.measurement.internal.m4 r10 = r8.f8118a
            boolean r10 = r10.m10127o()
            if (r10 != 0) goto L7e
            com.google.android.gms.measurement.internal.m4 r9 = r8.f8118a
            com.google.android.gms.measurement.internal.i3 r9 = r9.mo9765d()
            com.google.android.gms.measurement.internal.g3 r9 = r9.m10052v()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.m9893a(r10)
            return
        L7e:
            com.google.android.gms.measurement.internal.m4 r10 = r8.f8118a
            boolean r10 = r10.m10130r()
            if (r10 != 0) goto L87
            return
        L87:
            com.google.android.gms.measurement.internal.zzkv r10 = new com.google.android.gms.measurement.internal.zzkv
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.m4 r9 = r8.f8118a
            com.google.android.gms.measurement.internal.y7 r9 = r9.m10112L()
            r9.m10389y(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2221m6.m10154N(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* renamed from: O */
    public final void m10155O(InterfaceC1004r interfaceC1004r) {
        m10313i();
        C5984j.m21286j(interfaceC1004r);
        if (this.f8333e.remove(interfaceC1004r)) {
            return;
        }
        this.f8118a.mo9765d().m10053w().m9893a("OnEventListener had not been registered");
    }

    /* renamed from: S */
    public final int m10156S(String str) {
        C5984j.m21282f(str);
        this.f8118a.m10134z();
        return 25;
    }

    /* renamed from: T */
    public final Boolean m10157T() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f8118a.mo9761b().m10077r(atomicReference, 15000L, "boolean test flag value", new RunnableC2338x5(this, atomicReference));
    }

    /* renamed from: U */
    public final Double m10158U() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f8118a.mo9761b().m10077r(atomicReference, 15000L, "double test flag value", new RunnableC2133e6(this, atomicReference));
    }

    /* renamed from: V */
    public final Integer m10159V() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f8118a.mo9761b().m10077r(atomicReference, 15000L, "int test flag value", new RunnableC2122d6(this, atomicReference));
    }

    /* renamed from: W */
    public final Long m10160W() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f8118a.mo9761b().m10077r(atomicReference, 15000L, "long test flag value", new RunnableC2111c6(this, atomicReference));
    }

    /* renamed from: X */
    public final String m10161X() {
        return this.f8335g.get();
    }

    /* renamed from: Y */
    public final String m10162Y() {
        C2276r6 m10352s = this.f8118a.m10111K().m10352s();
        if (m10352s != null) {
            return m10352s.f8506b;
        }
        return null;
    }

    /* renamed from: Z */
    public final String m10163Z() {
        C2276r6 m10352s = this.f8118a.m10111K().m10352s();
        if (m10352s != null) {
            return m10352s.f8505a;
        }
        return null;
    }

    /* renamed from: a0 */
    public final String m10164a0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f8118a.mo9761b().m10077r(atomicReference, 15000L, "String test flag value", new RunnableC2100b6(this, atomicReference));
    }

    /* renamed from: b0 */
    public final ArrayList<Bundle> m10165b0(String str, String str2) {
        if (this.f8118a.mo9761b().m10076C()) {
            this.f8118a.mo9765d().m10048r().m9893a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        this.f8118a.mo9768f();
        if (C2093b.m9730a()) {
            this.f8118a.mo9765d().m10048r().m9893a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f8118a.mo9761b().m10077r(atomicReference, 5000L, "get conditional user properties", new RunnableC2348y5(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            this.f8118a.mo9765d().m10048r().m9894b("Timed out waiting for get conditional user properties", null);
            return new ArrayList<>();
        }
        return C2169h9.m9940u(list);
    }

    /* renamed from: c0 */
    public final Map<String, Object> m10166c0(String str, String str2, boolean z10) {
        if (this.f8118a.mo9761b().m10076C()) {
            this.f8118a.mo9765d().m10048r().m9893a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.f8118a.mo9768f();
        if (C2093b.m9730a()) {
            this.f8118a.mo9765d().m10048r().m9893a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f8118a.mo9761b().m10077r(atomicReference, 5000L, "get user properties", new RunnableC2358z5(this, atomicReference, null, str, str2, z10));
        List<zzkv> list = (List) atomicReference.get();
        if (list == null) {
            this.f8118a.mo9765d().m10048r().m9894b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
            return Collections.emptyMap();
        }
        C3356a c3356a = new C3356a(list.size());
        for (zzkv zzkvVar : list) {
            Object m10411x = zzkvVar.m10411x();
            if (m10411x != null) {
                c3356a.put(zzkvVar.f8843o, m10411x);
            }
        }
        return c3356a;
    }

    /* renamed from: g0 */
    public final void m10167g0() {
        mo9917h();
        m10313i();
        if (this.f8118a.m10130r()) {
            if (this.f8118a.m10134z().m9861B(null, C2335x2.f8699b0)) {
                C2137f m10134z = this.f8118a.m10134z();
                m10134z.f8118a.mo9768f();
                Boolean m9877t = m10134z.m9877t("google_analytics_deferred_deep_link_enabled");
                if (m9877t != null && m9877t.booleanValue()) {
                    this.f8118a.mo9765d().m10047q().m9893a("Deferred Deep Link feature enabled.");
                    this.f8118a.mo9761b().m10081z(new Runnable() { // from class: com.google.android.gms.measurement.internal.l5
                        public /* synthetic */ RunnableC2209l5() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C2221m6 c2221m6 = C2221m6.this;
                            c2221m6.mo9917h();
                            if (!c2221m6.f8118a.m10107F().f8645r.m10213b()) {
                                long m10298a = c2221m6.f8118a.m10107F().f8646s.m10298a();
                                c2221m6.f8118a.m10107F().f8646s.m10299b(1 + m10298a);
                                c2221m6.f8118a.m10134z();
                                if (m10298a >= 5) {
                                    c2221m6.f8118a.mo9765d().m10053w().m9893a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                    c2221m6.f8118a.m10107F().f8645r.m10212a(true);
                                    return;
                                } else {
                                    c2221m6.f8118a.m10122j();
                                    return;
                                }
                            }
                            c2221m6.f8118a.mo9765d().m10047q().m9893a("Deferred Deep Link already retrieved. Not fetching again.");
                        }
                    });
                }
            }
            this.f8118a.m10112L().m10370O();
            this.f8343o = false;
            C2326w3 m10107F = this.f8118a.m10107F();
            m10107F.mo9917h();
            String string = m10107F.m10319o().getString("previous_os_version", null);
            m10107F.f8118a.m10102A().m9921k();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = m10107F.m10319o().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.f8118a.m10102A().m9921k();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            m10175u("auto", "_ou", bundle);
        }
    }

    /* renamed from: h0 */
    public final void m10168h0(String str, String str2, Bundle bundle) {
        long mo13781a = this.f8118a.mo9767e().mo13781a();
        C5984j.m21282f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", mo13781a);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.f8118a.mo9761b().m10081z(new RunnableC2328w5(this, bundle2));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2316v3
    /* renamed from: n */
    protected final boolean mo9718n() {
        return false;
    }

    /* renamed from: o */
    public final void m10169o() {
        if (!(this.f8118a.mo9763c().getApplicationContext() instanceof Application) || this.f8331c == null) {
            return;
        }
        ((Application) this.f8118a.mo9763c().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f8331c);
    }

    /* renamed from: q */
    public final /* synthetic */ void m10171q(Bundle bundle) {
        if (bundle == null) {
            this.f8118a.m10107F().f8650w.m10227b(new Bundle());
            return;
        }
        Bundle m10226a = this.f8118a.m10107F().f8650w.m10226a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.f8118a.m10114N().m9961T(obj)) {
                    this.f8118a.m10114N().m9942A(this.f8344p, null, 27, null, null, 0);
                }
                this.f8118a.mo9765d().m10054x().m9895c("Invalid default event parameter type. Name, value", str, obj);
            } else if (C2169h9.m9926V(str)) {
                this.f8118a.mo9765d().m10054x().m9894b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                m10226a.remove(str);
            } else {
                C2169h9 m10114N = this.f8118a.m10114N();
                this.f8118a.m10134z();
                if (m10114N.m9955N("param", str, 100, obj)) {
                    this.f8118a.m10114N().m9943B(m10226a, str, obj);
                }
            }
        }
        this.f8118a.m10114N();
        int m9870m = this.f8118a.m10134z().m9870m();
        if (m10226a.size() > m9870m) {
            int i10 = 0;
            for (String str2 : new TreeSet(m10226a.keySet())) {
                i10++;
                if (i10 > m9870m) {
                    m10226a.remove(str2);
                }
            }
            this.f8118a.m10114N().m9942A(this.f8344p, null, 26, null, null, 0);
            this.f8118a.mo9765d().m10054x().m9893a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.f8118a.m10107F().f8650w.m10227b(m10226a);
        this.f8118a.m10112L().m10386v(m10226a);
    }

    /* renamed from: r */
    public final void m10172r(String str, String str2, Bundle bundle) {
        m10173s(str, str2, bundle, true, true, this.f8118a.mo9767e().mo13781a());
    }

    /* renamed from: s */
    public final void m10173s(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (C2169h9.m9930Z(str2, "screen_view")) {
            this.f8118a.m10111K().m10350F(bundle2, j10);
        } else {
            m10141A(str3, str2, j10, bundle2, z11, !z11 || this.f8332d == null || C2169h9.m9926V(str2), z10, null);
        }
    }

    /* renamed from: t */
    public final void m10174t(String str, String str2, Bundle bundle, String str3) {
        C2219m4.m10098t();
        m10141A("auto", str2, this.f8118a.mo9767e().mo13781a(), bundle, false, true, true, str3);
    }

    /* renamed from: u */
    public final void m10175u(String str, String str2, Bundle bundle) {
        mo9917h();
        m10176v(str, str2, this.f8118a.mo9767e().mo13781a(), bundle);
    }

    /* renamed from: v */
    public final void m10176v(String str, String str2, long j10, Bundle bundle) {
        mo9917h();
        m10177w(str, str2, j10, bundle, true, this.f8332d == null || C2169h9.m9926V(str2), true, null);
    }

    /* renamed from: w */
    public final void m10177w(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        boolean z13;
        String str4;
        long j11;
        String str5;
        String str6;
        Bundle[] bundleArr;
        Class<?> cls;
        C5984j.m21282f(str);
        C5984j.m21286j(bundle);
        mo9917h();
        m10313i();
        if (this.f8118a.m10127o()) {
            List<String> m9726v = this.f8118a.m10103B().m9726v();
            if (m9726v != null && !m9726v.contains(str2)) {
                this.f8118a.mo9765d().m10047q().m9895c("Dropping non-safelisted event. event name, origin", str2, str);
                return;
            }
            if (!this.f8334f) {
                this.f8334f = true;
                try {
                    if (!this.f8118a.m10131s()) {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.f8118a.mo9763c().getClassLoader());
                    } else {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                    }
                    try {
                        cls.getDeclaredMethod("initialize", Context.class).invoke(null, this.f8118a.mo9763c());
                    } catch (Exception e10) {
                        this.f8118a.mo9765d().m10053w().m9894b("Failed to invoke Tag Manager's initialize() method", e10);
                    }
                } catch (ClassNotFoundException unused) {
                    this.f8118a.mo9765d().m10051u().m9893a("Tag Manager is not found and thus will not be used");
                }
            }
            if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
                this.f8118a.mo9768f();
                m10154N("auto", "_lgclid", bundle.getString("gclid"), this.f8118a.mo9767e().mo13781a());
            }
            this.f8118a.mo9768f();
            if (z10 && C2169h9.m9931a0(str2)) {
                this.f8118a.m10114N().m9985y(bundle, this.f8118a.m10107F().f8650w.m10226a());
            }
            if (!z12) {
                this.f8118a.mo9768f();
                if (!"_iap".equals(str2)) {
                    C2169h9 m10114N = this.f8118a.m10114N();
                    int i10 = 2;
                    if (m10114N.m9958Q("event", str2)) {
                        if (m10114N.m9954M("event", C1000n.f5181a, C1000n.f5182b, str2)) {
                            m10114N.f8118a.m10134z();
                            if (m10114N.m9953L("event", 40, str2)) {
                                i10 = 0;
                            }
                        } else {
                            i10 = 13;
                        }
                    }
                    if (i10 != 0) {
                        this.f8118a.mo9765d().m10049s().m9894b("Invalid public event name. Event will not be logged (FE)", this.f8118a.m10105D().m9809d(str2));
                        C2169h9 m10114N2 = this.f8118a.m10114N();
                        this.f8118a.m10134z();
                        this.f8118a.m10114N().m9942A(this.f8344p, null, i10, "_ev", m10114N2.m9974q(str2, 40, true), str2 != null ? str2.length() : 0);
                        return;
                    }
                }
            }
            C1642je.m8342b();
            if (this.f8118a.m10134z().m9861B(null, C2335x2.f8670C0)) {
                this.f8118a.mo9768f();
                C2276r6 m10353t = this.f8118a.m10111K().m10353t(false);
                if (m10353t != null && !bundle.containsKey("_sc")) {
                    m10353t.f8508d = true;
                }
                C2169h9.m9941x(m10353t, bundle, z10 && !z12);
            } else {
                this.f8118a.mo9768f();
                C2276r6 m10353t2 = this.f8118a.m10111K().m10353t(false);
                if (m10353t2 != null && !bundle.containsKey("_sc")) {
                    m10353t2.f8508d = true;
                }
                C2169h9.m9941x(m10353t2, bundle, z10 && !z12);
            }
            boolean equals = "am".equals(str);
            boolean m9926V = C2169h9.m9926V(str2);
            if (!z10 || this.f8332d == null || m9926V) {
                z13 = equals;
            } else {
                if (!equals) {
                    this.f8118a.mo9765d().m10047q().m9895c("Passing event to registered event handler (FE)", this.f8118a.m10105D().m9809d(str2), this.f8118a.m10105D().m9807b(bundle));
                    C5984j.m21286j(this.f8332d);
                    this.f8332d.mo6232a(str, str2, bundle, j10);
                    return;
                }
                z13 = true;
            }
            if (this.f8118a.m10130r()) {
                int m9966k0 = this.f8118a.m10114N().m9966k0(str2);
                if (m9966k0 != 0) {
                    this.f8118a.mo9765d().m10049s().m9894b("Invalid event name. Event will not be logged (FE)", this.f8118a.m10105D().m9809d(str2));
                    C2169h9 m10114N3 = this.f8118a.m10114N();
                    this.f8118a.m10134z();
                    this.f8118a.m10114N().m9942A(this.f8344p, str3, m9966k0, "_ev", m10114N3.m9974q(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
                Bundle m9982v0 = this.f8118a.m10114N().m9982v0(str3, str2, bundle, C3131e.m13784b("_o", "_sn", "_sc", "_si"), z12);
                C5984j.m21286j(m9982v0);
                this.f8118a.mo9768f();
                if (this.f8118a.m10111K().m10353t(false) != null && "_ae".equals(str2)) {
                    C2212l8 c2212l8 = this.f8118a.m10113M().f8374e;
                    long mo13782b = c2212l8.f8278d.f8118a.mo9767e().mo13782b();
                    long j12 = mo13782b - c2212l8.f8276b;
                    c2212l8.f8276b = mo13782b;
                    if (j12 > 0) {
                        this.f8118a.m10114N().m9981v(m9982v0, j12);
                    }
                }
                C1720oc.m8642b();
                if (this.f8118a.m10134z().m9861B(null, C2335x2.f8715j0)) {
                    if (!"auto".equals(str) && "_ssr".equals(str2)) {
                        C2169h9 m10114N4 = this.f8118a.m10114N();
                        String string = m9982v0.getString("_ffr");
                        if (C3139m.m13810a(string)) {
                            string = null;
                        } else if (string != null) {
                            string = string.trim();
                        }
                        if (!C2169h9.m9930Z(string, m10114N4.f8118a.m10107F().f8647t.m10311a())) {
                            m10114N4.f8118a.m10107F().f8647t.m10312b(string);
                        } else {
                            m10114N4.f8118a.mo9765d().m10047q().m9893a("Not logging duplicate session_start_with_rollout event");
                            return;
                        }
                    } else if ("_ae".equals(str2)) {
                        String m10311a = this.f8118a.m10114N().f8118a.m10107F().f8647t.m10311a();
                        if (!TextUtils.isEmpty(m10311a)) {
                            m9982v0.putString("_ffr", m10311a);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(m9982v0);
                if (this.f8118a.m10107F().f8642o.m10298a() > 0 && this.f8118a.m10107F().m10326v(j10) && this.f8118a.m10107F().f8644q.m10213b()) {
                    this.f8118a.mo9765d().m10052v().m9893a("Current session is expired, remove the session number, ID, and engagement time");
                    str4 = "_ae";
                    j11 = 0;
                    m10154N("auto", "_sid", null, this.f8118a.mo9767e().mo13781a());
                    m10154N("auto", "_sno", null, this.f8118a.mo9767e().mo13781a());
                    m10154N("auto", "_se", null, this.f8118a.mo9767e().mo13781a());
                } else {
                    str4 = "_ae";
                    j11 = 0;
                }
                if (m9982v0.getLong("extend_session", j11) == 1) {
                    this.f8118a.mo9765d().m10052v().m9893a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    this.f8118a.m10113M().f8373d.m10182b(j10, true);
                }
                ArrayList arrayList2 = new ArrayList(m9982v0.keySet());
                Collections.sort(arrayList2);
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    String str7 = (String) arrayList2.get(i11);
                    if (str7 != null) {
                        this.f8118a.m10114N();
                        Object obj = m9982v0.get(str7);
                        if (obj instanceof Bundle) {
                            bundleArr = new Bundle[]{(Bundle) obj};
                        } else if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList3 = (ArrayList) obj;
                            bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                        } else {
                            bundleArr = null;
                        }
                        if (bundleArr != null) {
                            m9982v0.putParcelableArray(str7, bundleArr);
                        }
                    }
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    Bundle bundle2 = (Bundle) arrayList.get(i12);
                    if (i12 != 0) {
                        str6 = "_ep";
                        str5 = str;
                    } else {
                        str5 = str;
                        str6 = str2;
                    }
                    bundle2.putString("_o", str5);
                    if (z11) {
                        bundle2 = this.f8118a.m10114N().m9980u0(bundle2);
                    }
                    Bundle bundle3 = bundle2;
                    this.f8118a.m10112L().m10379o(new zzat(str6, new zzar(bundle3), str, j10), str3);
                    if (!z13) {
                        Iterator<InterfaceC1004r> it = this.f8333e.iterator();
                        while (it.hasNext()) {
                            it.next().mo6233a(str, str2, new Bundle(bundle3), j10);
                        }
                    }
                }
                this.f8118a.mo9768f();
                if (this.f8118a.m10111K().m10353t(false) == null || !str4.equals(str2)) {
                    return;
                }
                this.f8118a.m10113M().f8374e.m10090d(true, true, this.f8118a.mo9767e().mo13782b());
                return;
            }
            return;
        }
        this.f8118a.mo9765d().m10047q().m9893a("Event not sent since app measurement is disabled");
    }

    /* renamed from: x */
    public final void m10178x(InterfaceC1004r interfaceC1004r) {
        m10313i();
        C5984j.m21286j(interfaceC1004r);
        if (this.f8333e.add(interfaceC1004r)) {
            return;
        }
        this.f8118a.mo9765d().m10053w().m9893a("OnEventListener already registered");
    }

    /* renamed from: y */
    public final void m10179y(long j10) {
        this.f8335g.set(null);
        this.f8118a.mo9761b().m10081z(new RunnableC2308u5(this, j10));
    }

    /* renamed from: z */
    public final void m10180z(long j10, boolean z10) {
        mo9917h();
        m10313i();
        this.f8118a.mo9765d().m10047q().m9893a("Resetting analytics data (FE)");
        C2234n8 m10113M = this.f8118a.m10113M();
        m10113M.mo9917h();
        m10113M.f8374e.m10087a();
        boolean m10127o = this.f8118a.m10127o();
        C2326w3 m10107F = this.f8118a.m10107F();
        m10107F.f8632e.m10299b(j10);
        if (!TextUtils.isEmpty(m10107F.f8118a.m10107F().f8647t.m10311a())) {
            m10107F.f8647t.m10312b(null);
        }
        C1880yc.m9107b();
        C2137f m10134z = m10107F.f8118a.m10134z();
        C2325w2<Boolean> c2325w2 = C2335x2.f8717k0;
        if (m10134z.m9861B(null, c2325w2)) {
            m10107F.f8642o.m10299b(0L);
        }
        if (!m10107F.f8118a.m10134z().m9864E()) {
            m10107F.m10324t(!m10127o);
        }
        m10107F.f8648u.m10312b(null);
        m10107F.f8649v.m10299b(0L);
        m10107F.f8650w.m10227b(null);
        if (z10) {
            this.f8118a.m10112L().m10381q();
        }
        C1880yc.m9107b();
        if (this.f8118a.m10134z().m9861B(null, c2325w2)) {
            this.f8118a.m10113M().f8373d.m10181a();
        }
        this.f8343o = !m10127o;
    }
}
