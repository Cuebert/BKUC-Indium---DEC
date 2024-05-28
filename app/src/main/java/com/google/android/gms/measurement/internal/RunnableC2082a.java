package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.a */
/* loaded from: classes.dex */
public final class RunnableC2082a implements Runnable {

    /* renamed from: n */
    final /* synthetic */ String f7940n;

    /* renamed from: o */
    final /* synthetic */ long f7941o;

    /* renamed from: p */
    final /* synthetic */ C2354z1 f7942p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2082a(C2354z1 c2354z1, String str, long j10) {
        this.f7942p = c2354z1;
        this.f7940n = str;
        this.f7941o = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2354z1.m10391i(this.f7942p, this.f7940n, this.f7941o);
    }
}
