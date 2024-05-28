package com.google.android.gms.common.api.internal;

import java.util.Map;
import p085g4.AbstractC3263l;
import p085g4.C3265m;
import p085g4.InterfaceC3251f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.f */
/* loaded from: classes.dex */
public final class C1356f implements InterfaceC3251f {

    /* renamed from: a */
    final /* synthetic */ C3265m f6202a;

    /* renamed from: b */
    final /* synthetic */ C1358g f6203b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1356f(C1358g c1358g, C3265m c3265m) {
        this.f6203b = c1358g;
        this.f6202a = c3265m;
    }

    @Override // p085g4.InterfaceC3251f
    /* renamed from: a */
    public final void mo7517a(AbstractC3263l abstractC3263l) {
        Map map;
        map = this.f6203b.f6205b;
        map.remove(this.f6202a);
    }
}
