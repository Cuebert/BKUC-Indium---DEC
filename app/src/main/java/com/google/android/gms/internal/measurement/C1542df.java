package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.df */
/* loaded from: classes.dex */
public final class C1542df extends AbstractC1627j {

    /* renamed from: p */
    private final C1610hf f6755p;

    public C1542df(C1610hf c1610hf) {
        super("internal.registerCallback");
        this.f6755p = c1610hf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1627j
    /* renamed from: a */
    public final InterfaceC1739q mo7931a(C1728p4 c1728p4, List<InterfaceC1739q> list) {
        C1745q5.m8722h(this.f6915n, 3, list);
        String mo8132e = c1728p4.m8655b(list.get(0)).mo8132e();
        InterfaceC1739q m8655b = c1728p4.m8655b(list.get(1));
        if (m8655b instanceof C1723p) {
            InterfaceC1739q m8655b2 = c1728p4.m8655b(list.get(2));
            if (m8655b2 instanceof C1691n) {
                C1691n c1691n = (C1691n) m8655b2;
                if (c1691n.mo8134k("type")) {
                    this.f6755p.m8295a(mo8132e, c1691n.mo8134k("priority") ? C1745q5.m8716b(c1691n.mo8135l("priority").mo8131d().doubleValue()) : 1000, (C1723p) m8655b, c1691n.mo8135l("type").mo8132e());
                    return InterfaceC1739q.f7165b;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
