package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.HandlerC1477a1;

/* renamed from: com.google.android.gms.measurement.internal.n8 */
/* loaded from: classes.dex */
public final class C2234n8 extends AbstractC2316v3 {

    /* renamed from: c */
    private Handler f8372c;

    /* renamed from: d */
    protected final C2223m8 f8373d;

    /* renamed from: e */
    protected final C2212l8 f8374e;

    /* renamed from: f */
    protected final C2179i8 f8375f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2234n8(C2219m4 c2219m4) {
        super(c2219m4);
        this.f8373d = new C2223m8(this);
        this.f8374e = new C2212l8(this);
        this.f8375f = new C2179i8(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static /* bridge */ /* synthetic */ void m10188q(C2234n8 c2234n8, long j10) {
        c2234n8.mo9917h();
        c2234n8.m10190s();
        c2234n8.f8118a.mo9765d().m10052v().m9894b("Activity paused, time", Long.valueOf(j10));
        c2234n8.f8375f.m10056a(j10);
        if (c2234n8.f8118a.m10134z().m9863D()) {
            c2234n8.f8374e.m10088b(j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static /* bridge */ /* synthetic */ void m10189r(C2234n8 c2234n8, long j10) {
        c2234n8.mo9917h();
        c2234n8.m10190s();
        c2234n8.f8118a.mo9765d().m10052v().m9894b("Activity resumed, time", Long.valueOf(j10));
        if (c2234n8.f8118a.m10134z().m9863D() || c2234n8.f8118a.m10107F().f8644q.m10213b()) {
            c2234n8.f8374e.m10089c(j10);
        }
        c2234n8.f8375f.m10057b();
        C2223m8 c2223m8 = c2234n8.f8373d;
        c2223m8.f8347a.mo9917h();
        if (c2223m8.f8347a.f8118a.m10127o()) {
            c2223m8.m10182b(c2223m8.f8347a.f8118a.mo9767e().mo13781a(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final void m10190s() {
        mo9917h();
        if (this.f8372c == null) {
            this.f8372c = new HandlerC1477a1(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2316v3
    /* renamed from: n */
    protected final boolean mo9718n() {
        return false;
    }
}
