package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.y5 */
/* loaded from: classes.dex */
public final class RunnableC2348y5 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ AtomicReference f8770n;

    /* renamed from: o */
    final /* synthetic */ String f8771o;

    /* renamed from: p */
    final /* synthetic */ String f8772p;

    /* renamed from: q */
    final /* synthetic */ C2221m6 f8773q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2348y5(C2221m6 c2221m6, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f8773q = c2221m6;
        this.f8770n = atomicReference;
        this.f8771o = str2;
        this.f8772p = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8773q.f8118a.m10112L().m10376U(this.f8770n, null, this.f8771o, this.f8772p);
    }
}
