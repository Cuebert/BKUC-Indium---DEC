package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.w */
/* loaded from: classes.dex */
public final class C1835w extends AbstractC1851x {
    public C1835w() {
        this.f7285a.add(EnumC1692n0.BITWISE_AND);
        this.f7285a.add(EnumC1692n0.BITWISE_LEFT_SHIFT);
        this.f7285a.add(EnumC1692n0.BITWISE_NOT);
        this.f7285a.add(EnumC1692n0.BITWISE_OR);
        this.f7285a.add(EnumC1692n0.BITWISE_RIGHT_SHIFT);
        this.f7285a.add(EnumC1692n0.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f7285a.add(EnumC1692n0.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1851x
    /* renamed from: a */
    public final InterfaceC1739q mo7877a(String str, C1728p4 c1728p4, List<InterfaceC1739q> list) {
        EnumC1692n0 enumC1692n0 = EnumC1692n0.ADD;
        switch (C1745q5.m8719e(str).ordinal()) {
            case 4:
                C1745q5.m8722h(EnumC1692n0.BITWISE_AND.name(), 2, list);
                return new C1611i(Double.valueOf(C1745q5.m8716b(c1728p4.m8655b(list.get(0)).mo8131d().doubleValue()) & C1745q5.m8716b(c1728p4.m8655b(list.get(1)).mo8131d().doubleValue())));
            case 5:
                C1745q5.m8722h(EnumC1692n0.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new C1611i(Double.valueOf(C1745q5.m8716b(c1728p4.m8655b(list.get(0)).mo8131d().doubleValue()) << ((int) (C1745q5.m8718d(c1728p4.m8655b(list.get(1)).mo8131d().doubleValue()) & 31))));
            case 6:
                C1745q5.m8722h(EnumC1692n0.BITWISE_NOT.name(), 1, list);
                return new C1611i(Double.valueOf(~C1745q5.m8716b(c1728p4.m8655b(list.get(0)).mo8131d().doubleValue())));
            case 7:
                C1745q5.m8722h(EnumC1692n0.BITWISE_OR.name(), 2, list);
                return new C1611i(Double.valueOf(C1745q5.m8716b(c1728p4.m8655b(list.get(0)).mo8131d().doubleValue()) | C1745q5.m8716b(c1728p4.m8655b(list.get(1)).mo8131d().doubleValue())));
            case 8:
                C1745q5.m8722h(EnumC1692n0.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new C1611i(Double.valueOf(C1745q5.m8716b(c1728p4.m8655b(list.get(0)).mo8131d().doubleValue()) >> ((int) (C1745q5.m8718d(c1728p4.m8655b(list.get(1)).mo8131d().doubleValue()) & 31))));
            case 9:
                C1745q5.m8722h(EnumC1692n0.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new C1611i(Double.valueOf(C1745q5.m8718d(c1728p4.m8655b(list.get(0)).mo8131d().doubleValue()) >>> ((int) (C1745q5.m8718d(c1728p4.m8655b(list.get(1)).mo8131d().doubleValue()) & 31))));
            case 10:
                C1745q5.m8722h(EnumC1692n0.BITWISE_XOR.name(), 2, list);
                return new C1611i(Double.valueOf(C1745q5.m8716b(c1728p4.m8655b(list.get(0)).mo8131d().doubleValue()) ^ C1745q5.m8716b(c1728p4.m8655b(list.get(1)).mo8131d().doubleValue())));
            default:
                return super.m8953b(str);
        }
    }
}
