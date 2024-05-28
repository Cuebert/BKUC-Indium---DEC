package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import p308y2.AbstractC5630t;

/* renamed from: com.google.android.gms.common.api.internal.c0 */
/* loaded from: classes.dex */
final class C1351c0 extends AbstractC5630t {

    /* renamed from: a */
    final /* synthetic */ Dialog f6185a;

    /* renamed from: b */
    final /* synthetic */ RunnableC1353d0 f6186b;

    public C1351c0(RunnableC1353d0 runnableC1353d0, Dialog dialog) {
        this.f6186b = runnableC1353d0;
        this.f6185a = dialog;
    }

    @Override // p308y2.AbstractC5630t
    /* renamed from: a */
    public final void mo7496a() {
        this.f6186b.f6195o.m7510o();
        if (this.f6185a.isShowing()) {
            this.f6185a.dismiss();
        }
    }
}
