package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.b6 */
/* loaded from: classes.dex */
public final class RunnableC2100b6 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ AtomicReference f7985n;

    /* renamed from: o */
    final /* synthetic */ C2221m6 f7986o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2100b6(C2221m6 c2221m6, AtomicReference atomicReference) {
        this.f7986o = c2221m6;
        this.f7985n = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f7985n) {
            try {
                this.f7985n.set(this.f7986o.f8118a.m10134z().m9881x(this.f7986o.f8118a.m10103B().m9723s(), C2335x2.f8682M));
            } finally {
                this.f7985n.notify();
            }
        }
    }
}
