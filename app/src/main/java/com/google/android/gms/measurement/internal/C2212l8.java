package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1880yc;

/* renamed from: com.google.android.gms.measurement.internal.l8 */
/* loaded from: classes.dex */
public final class C2212l8 {

    /* renamed from: a */
    protected long f8275a;

    /* renamed from: b */
    protected long f8276b;

    /* renamed from: c */
    private final AbstractC2203l f8277c;

    /* renamed from: d */
    final /* synthetic */ C2234n8 f8278d;

    public C2212l8(C2234n8 c2234n8) {
        this.f8278d = c2234n8;
        this.f8277c = new C2201k8(this, c2234n8.f8118a);
        long mo13782b = c2234n8.f8118a.mo9767e().mo13782b();
        this.f8275a = mo13782b;
        this.f8276b = mo13782b;
    }

    /* renamed from: a */
    public final void m10087a() {
        this.f8277c.m10084b();
        this.f8275a = 0L;
        this.f8276b = 0L;
    }

    /* renamed from: b */
    public final void m10088b(long j10) {
        this.f8277c.m10084b();
    }

    /* renamed from: c */
    public final void m10089c(long j10) {
        this.f8278d.mo9917h();
        this.f8277c.m10084b();
        this.f8275a = j10;
        this.f8276b = j10;
    }

    /* renamed from: d */
    public final boolean m10090d(boolean z10, boolean z11, long j10) {
        this.f8278d.mo9917h();
        this.f8278d.m10313i();
        C1880yc.m9107b();
        if (this.f8278d.f8118a.m10134z().m9861B(null, C2335x2.f8717k0)) {
            if (this.f8278d.f8118a.m10127o()) {
                this.f8278d.f8118a.m10107F().f8642o.m10299b(this.f8278d.f8118a.mo9767e().mo13781a());
            }
        } else {
            this.f8278d.f8118a.m10107F().f8642o.m10299b(this.f8278d.f8118a.mo9767e().mo13781a());
        }
        long j11 = j10 - this.f8275a;
        if (!z10 && j11 < 1000) {
            this.f8278d.f8118a.mo9765d().m10052v().m9894b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
            return false;
        }
        if (!z11) {
            j11 = j10 - this.f8276b;
            this.f8276b = j10;
        }
        this.f8278d.f8118a.mo9765d().m10052v().m9894b("Recording user engagement, ms", Long.valueOf(j11));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        C2169h9.m9941x(this.f8278d.f8118a.m10111K().m10353t(!this.f8278d.f8118a.m10134z().m9863D()), bundle, true);
        C2137f m10134z = this.f8278d.f8118a.m10134z();
        C2325w2<Boolean> c2325w2 = C2335x2.f8691V;
        if (!m10134z.m9861B(null, c2325w2) && z11) {
            bundle.putLong("_fr", 1L);
        }
        if (!this.f8278d.f8118a.m10134z().m9861B(null, c2325w2) || !z11) {
            this.f8278d.f8118a.m10109I().m10175u("auto", "_e", bundle);
        }
        this.f8275a = j10;
        this.f8277c.m10084b();
        this.f8277c.m10085d(3600000L);
        return true;
    }
}
