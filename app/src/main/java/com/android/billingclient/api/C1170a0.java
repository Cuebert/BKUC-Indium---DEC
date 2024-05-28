package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;
import p171n1.InterfaceC4013c;
import p171n1.InterfaceC4027j;
import p171n1.InterfaceC4050z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.a0 */
/* loaded from: classes.dex */
public final class C1170a0 {

    /* renamed from: a */
    private final Context f5520a;

    /* renamed from: b */
    private final C1208z f5521b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1170a0(Context context, InterfaceC4050z interfaceC4050z, InterfaceC1195n interfaceC1195n) {
        this.f5520a = context;
        this.f5521b = new C1208z(this, null, interfaceC1195n, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final InterfaceC4050z m6802b() {
        C1208z.m6962a(this.f5521b);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final InterfaceC4027j m6803c() {
        return C1208z.m6963b(this.f5521b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m6804d() {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        intentFilter.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f5521b.m6965c(this.f5520a, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1170a0(Context context, InterfaceC4027j interfaceC4027j, InterfaceC4013c interfaceC4013c, InterfaceC1195n interfaceC1195n) {
        this.f5520a = context;
        this.f5521b = new C1208z(this, interfaceC4027j, interfaceC4013c, interfaceC1195n, null);
    }
}
