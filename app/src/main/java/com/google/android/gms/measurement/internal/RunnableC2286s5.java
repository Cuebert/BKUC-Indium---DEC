package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.s5 */
/* loaded from: classes.dex */
public final class RunnableC2286s5 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ String f8537n;

    /* renamed from: o */
    final /* synthetic */ String f8538o;

    /* renamed from: p */
    final /* synthetic */ long f8539p;

    /* renamed from: q */
    final /* synthetic */ Bundle f8540q;

    /* renamed from: r */
    final /* synthetic */ boolean f8541r;

    /* renamed from: s */
    final /* synthetic */ boolean f8542s;

    /* renamed from: t */
    final /* synthetic */ boolean f8543t;

    /* renamed from: u */
    final /* synthetic */ String f8544u;

    /* renamed from: v */
    final /* synthetic */ C2221m6 f8545v;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2286s5(C2221m6 c2221m6, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.f8545v = c2221m6;
        this.f8537n = str;
        this.f8538o = str2;
        this.f8539p = j10;
        this.f8540q = bundle;
        this.f8541r = z10;
        this.f8542s = z11;
        this.f8543t = z12;
        this.f8544u = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8545v.m10177w(this.f8537n, this.f8538o, this.f8539p, this.f8540q, this.f8541r, this.f8542s, this.f8543t, this.f8544u);
    }
}
