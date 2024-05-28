package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.z5 */
/* loaded from: classes.dex */
public final class RunnableC2358z5 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ AtomicReference f8806n;

    /* renamed from: o */
    final /* synthetic */ String f8807o;

    /* renamed from: p */
    final /* synthetic */ String f8808p;

    /* renamed from: q */
    final /* synthetic */ boolean f8809q;

    /* renamed from: r */
    final /* synthetic */ C2221m6 f8810r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2358z5(C2221m6 c2221m6, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.f8810r = c2221m6;
        this.f8806n = atomicReference;
        this.f8807o = str2;
        this.f8808p = str3;
        this.f8809q = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8810r.f8118a.m10112L().m10378W(this.f8806n, null, this.f8807o, this.f8808p, this.f8809q);
    }
}
