package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.h8 */
/* loaded from: classes.dex */
public final class RunnableC2168h8 implements Runnable {

    /* renamed from: n */
    final long f8143n;

    /* renamed from: o */
    final long f8144o;

    /* renamed from: p */
    final /* synthetic */ C2179i8 f8145p;

    public RunnableC2168h8(C2179i8 c2179i8, long j10, long j11) {
        this.f8145p = c2179i8;
        this.f8143n = j10;
        this.f8144o = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8145p.f8192b.f8118a.mo9761b().m10081z(new Runnable() { // from class: com.google.android.gms.measurement.internal.g8
            public /* synthetic */ RunnableC2157g8() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                RunnableC2168h8 runnableC2168h8 = RunnableC2168h8.this;
                C2179i8 c2179i8 = runnableC2168h8.f8145p;
                long j10 = runnableC2168h8.f8143n;
                long j11 = runnableC2168h8.f8144o;
                c2179i8.f8192b.mo9917h();
                c2179i8.f8192b.f8118a.mo9765d().m10047q().m9893a("Application going to the background");
                boolean z10 = true;
                c2179i8.f8192b.f8118a.m10107F().f8644q.m10212a(true);
                Bundle bundle = new Bundle();
                if (!c2179i8.f8192b.f8118a.m10134z().m9863D()) {
                    c2179i8.f8192b.f8374e.m10088b(j11);
                    if (c2179i8.f8192b.f8118a.m10134z().m9861B(null, C2335x2.f8711h0)) {
                        C2212l8 c2212l8 = c2179i8.f8192b.f8374e;
                        long j12 = c2212l8.f8276b;
                        c2212l8.f8276b = j11;
                        bundle.putLong("_et", j11 - j12);
                        C2169h9.m9941x(c2179i8.f8192b.f8118a.m10111K().m10353t(true), bundle, true);
                    } else {
                        z10 = false;
                    }
                    c2179i8.f8192b.f8374e.m10090d(false, z10, j11);
                }
                c2179i8.f8192b.f8118a.m10109I().m10176v("auto", "_ab", j10, bundle);
            }
        });
    }
}
