package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.t7 */
/* loaded from: classes.dex */
final class RunnableC2299t7 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ ComponentName f8579n;

    /* renamed from: o */
    final /* synthetic */ ServiceConnectionC2340x7 f8580o;

    public RunnableC2299t7(ServiceConnectionC2340x7 serviceConnectionC2340x7, ComponentName componentName) {
        this.f8580o = serviceConnectionC2340x7;
        this.f8579n = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2350y7.m10365M(this.f8580o.f8758c, this.f8579n);
    }
}
