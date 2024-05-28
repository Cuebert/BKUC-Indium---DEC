package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C1346a;

/* renamed from: com.google.android.gms.common.api.internal.j */
/* loaded from: classes.dex */
final class C1362j implements ComponentCallbacks2C1346a.a {

    /* renamed from: a */
    final /* synthetic */ C1350c f6211a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1362j(C1350c c1350c) {
        this.f6211a = c1350c;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C1346a.a
    /* renamed from: a */
    public final void mo7446a(boolean z10) {
        Handler handler;
        Handler handler2;
        C1350c c1350c = this.f6211a;
        handler = c1350c.f6183p;
        handler2 = c1350c.f6183p;
        handler.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
