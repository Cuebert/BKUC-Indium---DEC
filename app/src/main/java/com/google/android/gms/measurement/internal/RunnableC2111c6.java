package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.c6 */
/* loaded from: classes.dex */
public final class RunnableC2111c6 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ AtomicReference f8030n;

    /* renamed from: o */
    final /* synthetic */ C2221m6 f8031o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2111c6(C2221m6 c2221m6, AtomicReference atomicReference) {
        this.f8031o = c2221m6;
        this.f8030n = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8030n) {
            try {
                this.f8030n.set(Long.valueOf(this.f8031o.f8118a.m10134z().m9875r(this.f8031o.f8118a.m10103B().m9723s(), C2335x2.f8683N)));
            } finally {
                this.f8030n.notify();
            }
        }
    }
}
