package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.r8 */
/* loaded from: classes.dex */
public final class C1764r8 extends AbstractC1627j {

    /* renamed from: p */
    private final C1509c f7206p;

    public C1764r8(C1509c c1509c) {
        super("internal.eventLogger");
        this.f7206p = c1509c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1627j
    /* renamed from: a */
    public final InterfaceC1739q mo7931a(C1728p4 c1728p4, List<InterfaceC1739q> list) {
        Map<String, Object> hashMap;
        C1745q5.m8722h(this.f6915n, 3, list);
        String mo8132e = c1728p4.m8655b(list.get(0)).mo8132e();
        long m8715a = (long) C1745q5.m8715a(c1728p4.m8655b(list.get(1)).mo8131d().doubleValue());
        InterfaceC1739q m8655b = c1728p4.m8655b(list.get(2));
        if (m8655b instanceof C1691n) {
            hashMap = C1745q5.m8721g((C1691n) m8655b);
        } else {
            hashMap = new HashMap<>();
        }
        this.f7206p.m7971e(mo8132e, m8715a, hashMap);
        return InterfaceC1739q.f7165b;
    }
}
