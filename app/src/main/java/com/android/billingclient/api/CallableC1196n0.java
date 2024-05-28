package com.android.billingclient.api;

import java.util.concurrent.Callable;
import p171n1.InterfaceC4023h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.n0 */
/* loaded from: classes.dex */
public final class CallableC1196n0 implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f5674a;

    /* renamed from: b */
    final /* synthetic */ InterfaceC4023h f5675b;

    /* renamed from: c */
    final /* synthetic */ C1175d f5676c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC1196n0(C1175d c1175d, String str, InterfaceC4023h interfaceC4023h) {
        this.f5676c = c1175d;
        this.f5674a = str;
        this.f5675b = interfaceC4023h;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        C1193m m6830L = C1175d.m6830L(this.f5676c, this.f5674a);
        this.f5675b.mo14189a(m6830L.m6950a(), m6830L.m6951b());
        return null;
    }
}
