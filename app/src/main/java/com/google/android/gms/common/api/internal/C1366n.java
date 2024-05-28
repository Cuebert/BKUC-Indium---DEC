package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.AbstractC1388b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.n */
/* loaded from: classes.dex */
public final class C1366n implements AbstractC1388b.e {

    /* renamed from: a */
    final /* synthetic */ C1367o f6216a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1366n(C1367o c1367o) {
        this.f6216a = c1367o;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b.e
    /* renamed from: a */
    public final void mo7531a() {
        Handler handler;
        handler = this.f6216a.f6229o.f6183p;
        handler.post(new RunnableC1365m(this));
    }
}
