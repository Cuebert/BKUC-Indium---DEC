package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.l4 */
/* loaded from: classes.dex */
public final class RunnableC2208l4 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ C2198k5 f8266n;

    /* renamed from: o */
    final /* synthetic */ C2219m4 f8267o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2208l4(C2219m4 c2219m4, C2198k5 c2198k5) {
        this.f8267o = c2219m4;
        this.f8266n = c2198k5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2219m4.m10097a(this.f8267o, this.f8266n);
        this.f8267o.m10125m(this.f8266n.f8244g);
    }
}
