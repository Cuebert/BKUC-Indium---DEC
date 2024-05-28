package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.x5 */
/* loaded from: classes.dex */
public final class RunnableC2338x5 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ AtomicReference f8753n;

    /* renamed from: o */
    final /* synthetic */ C2221m6 f8754o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2338x5(C2221m6 c2221m6, AtomicReference atomicReference) {
        this.f8754o = c2221m6;
        this.f8753n = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8753n) {
            try {
                this.f8753n.set(Boolean.valueOf(this.f8754o.f8118a.m10134z().m9861B(this.f8754o.f8118a.m10103B().m9723s(), C2335x2.f8681L)));
            } finally {
                this.f8753n.notify();
            }
        }
    }
}
