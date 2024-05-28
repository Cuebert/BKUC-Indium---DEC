package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Map;
import p295x2.AbstractC5513h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.e */
/* loaded from: classes.dex */
public final class C1354e implements AbstractC5513h.a {

    /* renamed from: a */
    final /* synthetic */ BasePendingResult f6196a;

    /* renamed from: b */
    final /* synthetic */ C1358g f6197b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1354e(C1358g c1358g, BasePendingResult basePendingResult) {
        this.f6197b = c1358g;
        this.f6196a = basePendingResult;
    }

    @Override // p295x2.AbstractC5513h.a
    /* renamed from: a */
    public final void mo7508a(Status status) {
        Map map;
        map = this.f6197b.f6204a;
        map.remove(this.f6196a);
    }
}
