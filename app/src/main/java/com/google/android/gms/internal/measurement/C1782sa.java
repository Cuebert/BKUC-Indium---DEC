package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.sa */
/* loaded from: classes.dex */
public final class C1782sa extends AbstractC1627j {

    /* renamed from: p */
    final /* synthetic */ InterfaceC1816uc f7232p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1782sa(C1799tb c1799tb, String str, InterfaceC1816uc interfaceC1816uc) {
        super("getValue");
        this.f7232p = interfaceC1816uc;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1627j
    /* renamed from: a */
    public final InterfaceC1739q mo7931a(C1728p4 c1728p4, List<InterfaceC1739q> list) {
        C1745q5.m8722h("getValue", 2, list);
        InterfaceC1739q m8655b = c1728p4.m8655b(list.get(0));
        InterfaceC1739q m8655b2 = c1728p4.m8655b(list.get(1));
        String mo8874h = this.f7232p.mo8874h(m8655b.mo8132e());
        return mo8874h != null ? new C1803u(mo8874h) : m8655b2;
    }
}
