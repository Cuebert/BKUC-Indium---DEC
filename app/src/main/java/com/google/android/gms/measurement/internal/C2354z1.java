package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import p093h0.C3356a;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.internal.z1 */
/* loaded from: classes.dex */
public final class C2354z1 extends C2355z2 {

    /* renamed from: b */
    private final Map<String, Long> f8799b;

    /* renamed from: c */
    private final Map<String, Integer> f8800c;

    /* renamed from: d */
    private long f8801d;

    public C2354z1(C2219m4 c2219m4) {
        super(c2219m4);
        this.f8800c = new C3356a();
        this.f8799b = new C3356a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static /* synthetic */ void m10391i(C2354z1 c2354z1, String str, long j10) {
        c2354z1.mo9917h();
        C5984j.m21282f(str);
        if (c2354z1.f8800c.isEmpty()) {
            c2354z1.f8801d = j10;
        }
        Integer num = c2354z1.f8800c.get(str);
        if (num != null) {
            c2354z1.f8800c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (c2354z1.f8800c.size() >= 100) {
            c2354z1.f8118a.mo9765d().m10053w().m9893a("Too many ads visible");
        } else {
            c2354z1.f8800c.put(str, 1);
            c2354z1.f8799b.put(str, Long.valueOf(j10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static /* synthetic */ void m10392j(C2354z1 c2354z1, String str, long j10) {
        c2354z1.mo9917h();
        C5984j.m21282f(str);
        Integer num = c2354z1.f8800c.get(str);
        if (num != null) {
            C2276r6 m10353t = c2354z1.f8118a.m10111K().m10353t(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                c2354z1.f8800c.remove(str);
                Long l10 = c2354z1.f8799b.get(str);
                if (l10 == null) {
                    c2354z1.f8118a.mo9765d().m10048r().m9893a("First ad unit exposure time was never set");
                } else {
                    long longValue = l10.longValue();
                    c2354z1.f8799b.remove(str);
                    c2354z1.m10395p(str, j10 - longValue, m10353t);
                }
                if (c2354z1.f8800c.isEmpty()) {
                    long j11 = c2354z1.f8801d;
                    if (j11 == 0) {
                        c2354z1.f8118a.mo9765d().m10048r().m9893a("First ad exposure time was never set");
                        return;
                    } else {
                        c2354z1.m10394o(j10 - j11, m10353t);
                        c2354z1.f8801d = 0L;
                        return;
                    }
                }
                return;
            }
            c2354z1.f8800c.put(str, Integer.valueOf(intValue));
            return;
        }
        c2354z1.f8118a.mo9765d().m10048r().m9894b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    /* renamed from: o */
    private final void m10394o(long j10, C2276r6 c2276r6) {
        if (c2276r6 == null) {
            this.f8118a.mo9765d().m10052v().m9893a("Not logging ad exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.f8118a.mo9765d().m10052v().m9894b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j10);
        C2169h9.m9941x(c2276r6, bundle, true);
        this.f8118a.m10109I().m10175u("am", "_xa", bundle);
    }

    /* renamed from: p */
    private final void m10395p(String str, long j10, C2276r6 c2276r6) {
        if (c2276r6 == null) {
            this.f8118a.mo9765d().m10052v().m9893a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.f8118a.mo9765d().m10052v().m9894b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j10);
        C2169h9.m9941x(c2276r6, bundle, true);
        this.f8118a.m10109I().m10175u("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final void m10396q(long j10) {
        Iterator<String> it = this.f8799b.keySet().iterator();
        while (it.hasNext()) {
            this.f8799b.put(it.next(), Long.valueOf(j10));
        }
        if (this.f8799b.isEmpty()) {
            return;
        }
        this.f8801d = j10;
    }

    /* renamed from: l */
    public final void m10397l(String str, long j10) {
        if (str != null && str.length() != 0) {
            this.f8118a.mo9761b().m10081z(new RunnableC2082a(this, str, j10));
        } else {
            this.f8118a.mo9765d().m10048r().m9893a("Ad unit id must be a non-empty string");
        }
    }

    /* renamed from: m */
    public final void m10398m(String str, long j10) {
        if (str != null && str.length() != 0) {
            this.f8118a.mo9761b().m10081z(new RunnableC2332x(this, str, j10));
        } else {
            this.f8118a.mo9765d().m10048r().m9893a("Ad unit id must be a non-empty string");
        }
    }

    /* renamed from: n */
    public final void m10399n(long j10) {
        C2276r6 m10353t = this.f8118a.m10111K().m10353t(false);
        for (String str : this.f8799b.keySet()) {
            m10395p(str, j10 - this.f8799b.get(str).longValue(), m10353t);
        }
        if (!this.f8799b.isEmpty()) {
            m10394o(j10 - this.f8801d, m10353t);
        }
        m10396q(j10);
    }
}
