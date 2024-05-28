package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.AbstractC2024r5;
import java.util.concurrent.Callable;
import p171n1.C4016d0;
import p171n1.InterfaceC4025i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.m0 */
/* loaded from: classes.dex */
public final class CallableC1194m0 implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f5671a;

    /* renamed from: b */
    final /* synthetic */ InterfaceC4025i f5672b;

    /* renamed from: c */
    final /* synthetic */ C1175d f5673c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC1194m0(C1175d c1175d, String str, InterfaceC4025i interfaceC4025i) {
        this.f5673c = c1175d;
        this.f5671a = str;
        this.f5672b = interfaceC4025i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        C4016d0 m6853x = C1175d.m6853x(this.f5673c, this.f5671a, 9);
        if (m6853x.m16820b() != null) {
            this.f5672b.mo14190a(m6853x.m16819a(), m6853x.m16820b());
            return null;
        }
        this.f5672b.mo14190a(m6853x.m16819a(), AbstractC2024r5.m9560s());
        return null;
    }
}
