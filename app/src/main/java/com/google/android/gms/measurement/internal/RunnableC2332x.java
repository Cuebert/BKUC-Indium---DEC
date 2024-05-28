package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.x */
/* loaded from: classes.dex */
public final class RunnableC2332x implements Runnable {

    /* renamed from: n */
    final /* synthetic */ String f8660n;

    /* renamed from: o */
    final /* synthetic */ long f8661o;

    /* renamed from: p */
    final /* synthetic */ C2354z1 f8662p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2332x(C2354z1 c2354z1, String str, long j10) {
        this.f8662p = c2354z1;
        this.f8660n = str;
        this.f8661o = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2354z1.m10392j(this.f8662p, this.f8660n, this.f8661o);
    }
}
