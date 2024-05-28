package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.i8 */
/* loaded from: classes.dex */
public final class C2179i8 {

    /* renamed from: a */
    private RunnableC2168h8 f8191a;

    /* renamed from: b */
    final /* synthetic */ C2234n8 f8192b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2179i8(C2234n8 c2234n8) {
        this.f8192b = c2234n8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m10056a(long j10) {
        Handler handler;
        this.f8191a = new RunnableC2168h8(this, this.f8192b.f8118a.mo9767e().mo13781a(), j10);
        handler = this.f8192b.f8372c;
        handler.postDelayed(this.f8191a, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m10057b() {
        Handler handler;
        this.f8192b.mo9917h();
        if (this.f8191a != null) {
            handler = this.f8192b.f8372c;
            handler.removeCallbacks(this.f8191a);
        }
        this.f8192b.f8118a.m10107F().f8644q.m10212a(false);
    }
}
