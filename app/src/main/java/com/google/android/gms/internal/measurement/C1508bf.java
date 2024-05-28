package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.bf */
/* loaded from: classes.dex */
public final class C1508bf extends AbstractC1627j {

    /* renamed from: p */
    private final InterfaceC1898ze f6707p;

    public C1508bf(InterfaceC1898ze interfaceC1898ze) {
        super("internal.logger");
        this.f6707p = interfaceC1898ze;
        this.f6916o.put("log", new C1491af(this, false, true));
        this.f6916o.put("silent", new C1833vd(this, "silent"));
        ((AbstractC1627j) this.f6916o.get("silent")).mo8137o("log", new C1491af(this, true, true));
        this.f6916o.put("unmonitored", new C1850we(this, "unmonitored"));
        ((AbstractC1627j) this.f6916o.get("unmonitored")).mo8137o("log", new C1491af(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1627j
    /* renamed from: a */
    public final InterfaceC1739q mo7931a(C1728p4 c1728p4, List<InterfaceC1739q> list) {
        return InterfaceC1739q.f7165b;
    }
}
