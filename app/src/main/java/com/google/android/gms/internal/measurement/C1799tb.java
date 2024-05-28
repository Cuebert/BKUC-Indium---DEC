package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.tb */
/* loaded from: classes.dex */
public final class C1799tb extends AbstractC1627j {

    /* renamed from: p */
    private final InterfaceC1816uc f7244p;

    public C1799tb(String str, InterfaceC1816uc interfaceC1816uc) {
        super("internal.remoteConfig");
        this.f7244p = interfaceC1816uc;
        this.f6916o.put("getValue", new C1782sa(this, "getValue", interfaceC1816uc));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1627j
    /* renamed from: a */
    public final InterfaceC1739q mo7931a(C1728p4 c1728p4, List<InterfaceC1739q> list) {
        return InterfaceC1739q.f7165b;
    }
}
