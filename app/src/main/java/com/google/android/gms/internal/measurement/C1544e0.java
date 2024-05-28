package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.e0 */
/* loaded from: classes.dex */
public final class C1544e0 extends AbstractC1851x {
    /* JADX INFO: Access modifiers changed from: protected */
    public C1544e0() {
        this.f7285a.add(EnumC1692n0.AND);
        this.f7285a.add(EnumC1692n0.NOT);
        this.f7285a.add(EnumC1692n0.OR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1851x
    /* renamed from: a */
    public final InterfaceC1739q mo7877a(String str, C1728p4 c1728p4, List<InterfaceC1739q> list) {
        EnumC1692n0 enumC1692n0 = EnumC1692n0.ADD;
        int ordinal = C1745q5.m8719e(str).ordinal();
        if (ordinal == 1) {
            C1745q5.m8722h(EnumC1692n0.AND.name(), 2, list);
            InterfaceC1739q m8655b = c1728p4.m8655b(list.get(0));
            return !m8655b.mo8136m().booleanValue() ? m8655b : c1728p4.m8655b(list.get(1));
        }
        if (ordinal == 47) {
            C1745q5.m8722h(EnumC1692n0.NOT.name(), 1, list);
            return new C1577g(Boolean.valueOf(!c1728p4.m8655b(list.get(0)).mo8136m().booleanValue()));
        }
        if (ordinal != 50) {
            return super.m8953b(str);
        }
        C1745q5.m8722h(EnumC1692n0.OR.name(), 2, list);
        InterfaceC1739q m8655b2 = c1728p4.m8655b(list.get(0));
        return m8655b2.mo8136m().booleanValue() ? m8655b2 : c1728p4.m8655b(list.get(1));
    }
}
