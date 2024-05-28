package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.d6 */
/* loaded from: classes.dex */
public final class RunnableC2122d6 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ AtomicReference f8049n;

    /* renamed from: o */
    final /* synthetic */ C2221m6 f8050o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2122d6(C2221m6 c2221m6, AtomicReference atomicReference) {
        this.f8050o = c2221m6;
        this.f8049n = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8049n) {
            try {
                this.f8049n.set(Integer.valueOf(this.f8050o.f8118a.m10134z().m9872o(this.f8050o.f8118a.m10103B().m9723s(), C2335x2.f8684O)));
            } finally {
                this.f8049n.notify();
            }
        }
    }
}
