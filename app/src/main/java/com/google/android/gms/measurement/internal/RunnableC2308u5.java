package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.u5 */
/* loaded from: classes.dex */
public final class RunnableC2308u5 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ long f8597n;

    /* renamed from: o */
    final /* synthetic */ C2221m6 f8598o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2308u5(C2221m6 c2221m6, long j10) {
        this.f8598o = c2221m6;
        this.f8597n = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8598o.m10180z(this.f8597n, true);
        this.f8598o.f8118a.m10112L().m10374S(new AtomicReference<>());
    }
}
