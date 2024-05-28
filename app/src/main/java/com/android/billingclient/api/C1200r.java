package com.android.billingclient.api;

import p171n1.C4012b0;

/* renamed from: com.android.billingclient.api.r */
/* loaded from: classes.dex */
public final class C1200r {

    /* renamed from: a */
    private boolean f5711a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1200r(C4012b0 c4012b0) {
    }

    /* renamed from: a */
    public final C1200r m6957a() {
        this.f5711a = true;
        return this;
    }

    /* renamed from: b */
    public final C1201s m6958b() {
        if (this.f5711a) {
            return new C1201s(true, false, null);
        }
        throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
    }
}
