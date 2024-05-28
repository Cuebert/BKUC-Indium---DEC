package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.k0 */
/* loaded from: classes.dex */
public final class C1644k0 extends AbstractC1851x {
    /* JADX INFO: Access modifiers changed from: protected */
    public C1644k0() {
        this.f7285a.add(EnumC1692n0.ADD);
        this.f7285a.add(EnumC1692n0.DIVIDE);
        this.f7285a.add(EnumC1692n0.MODULUS);
        this.f7285a.add(EnumC1692n0.MULTIPLY);
        this.f7285a.add(EnumC1692n0.NEGATE);
        this.f7285a.add(EnumC1692n0.POST_DECREMENT);
        this.f7285a.add(EnumC1692n0.POST_INCREMENT);
        this.f7285a.add(EnumC1692n0.PRE_DECREMENT);
        this.f7285a.add(EnumC1692n0.PRE_INCREMENT);
        this.f7285a.add(EnumC1692n0.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1851x
    /* renamed from: a */
    public final InterfaceC1739q mo7877a(String str, C1728p4 c1728p4, List<InterfaceC1739q> list) {
        EnumC1692n0 enumC1692n0 = EnumC1692n0.ADD;
        int ordinal = C1745q5.m8719e(str).ordinal();
        if (ordinal == 0) {
            C1745q5.m8722h(enumC1692n0.name(), 2, list);
            InterfaceC1739q m8655b = c1728p4.m8655b(list.get(0));
            InterfaceC1739q m8655b2 = c1728p4.m8655b(list.get(1));
            if (!(m8655b instanceof InterfaceC1675m) && !(m8655b instanceof C1803u) && !(m8655b2 instanceof InterfaceC1675m) && !(m8655b2 instanceof C1803u)) {
                return new C1611i(Double.valueOf(m8655b.mo8131d().doubleValue() + m8655b2.mo8131d().doubleValue()));
            }
            String valueOf = String.valueOf(m8655b.mo8132e());
            String valueOf2 = String.valueOf(m8655b2.mo8132e());
            return new C1803u(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        }
        if (ordinal == 21) {
            C1745q5.m8722h(EnumC1692n0.DIVIDE.name(), 2, list);
            return new C1611i(Double.valueOf(c1728p4.m8655b(list.get(0)).mo8131d().doubleValue() / c1728p4.m8655b(list.get(1)).mo8131d().doubleValue()));
        }
        if (ordinal == 59) {
            C1745q5.m8722h(EnumC1692n0.SUBTRACT.name(), 2, list);
            return new C1611i(Double.valueOf(c1728p4.m8655b(list.get(0)).mo8131d().doubleValue() + new C1611i(Double.valueOf(-c1728p4.m8655b(list.get(1)).mo8131d().doubleValue())).mo8131d().doubleValue()));
        }
        if (ordinal == 52 || ordinal == 53) {
            C1745q5.m8722h(str, 2, list);
            InterfaceC1739q m8655b3 = c1728p4.m8655b(list.get(0));
            c1728p4.m8655b(list.get(1));
            return m8655b3;
        }
        if (ordinal != 55 && ordinal != 56) {
            switch (ordinal) {
                case 44:
                    C1745q5.m8722h(EnumC1692n0.MODULUS.name(), 2, list);
                    return new C1611i(Double.valueOf(c1728p4.m8655b(list.get(0)).mo8131d().doubleValue() % c1728p4.m8655b(list.get(1)).mo8131d().doubleValue()));
                case 45:
                    C1745q5.m8722h(EnumC1692n0.MULTIPLY.name(), 2, list);
                    return new C1611i(Double.valueOf(c1728p4.m8655b(list.get(0)).mo8131d().doubleValue() * c1728p4.m8655b(list.get(1)).mo8131d().doubleValue()));
                case 46:
                    C1745q5.m8722h(EnumC1692n0.NEGATE.name(), 1, list);
                    return new C1611i(Double.valueOf(-c1728p4.m8655b(list.get(0)).mo8131d().doubleValue()));
                default:
                    return super.m8953b(str);
            }
        }
        C1745q5.m8722h(str, 1, list);
        return c1728p4.m8655b(list.get(0));
    }
}
