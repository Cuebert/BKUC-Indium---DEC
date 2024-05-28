package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.e6 */
/* loaded from: classes.dex */
public final class RunnableC2133e6 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ AtomicReference f8064n;

    /* renamed from: o */
    final /* synthetic */ C2221m6 f8065o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2133e6(C2221m6 c2221m6, AtomicReference atomicReference) {
        this.f8065o = c2221m6;
        this.f8064n = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8064n) {
            try {
                this.f8064n.set(Double.valueOf(this.f8065o.f8118a.m10134z().m9868k(this.f8065o.f8118a.m10103B().m9723s(), C2335x2.f8685P)));
            } finally {
                this.f8064n.notify();
            }
        }
    }
}
