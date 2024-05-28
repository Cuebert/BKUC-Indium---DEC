package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.f6 */
/* loaded from: classes.dex */
public final class RunnableC2144f6 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ Boolean f8087n;

    /* renamed from: o */
    final /* synthetic */ C2221m6 f8088o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2144f6(C2221m6 c2221m6, Boolean bool) {
        this.f8088o = c2221m6;
        this.f8087n = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8088o.m10136Q(this.f8087n, true);
    }
}
