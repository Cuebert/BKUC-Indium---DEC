package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.k */
/* loaded from: classes.dex */
public final /* synthetic */ class C1643k {
    /* renamed from: a */
    public static InterfaceC1739q m8345a(InterfaceC1675m interfaceC1675m, InterfaceC1739q interfaceC1739q, C1728p4 c1728p4, List<InterfaceC1739q> list) {
        if (interfaceC1675m.mo8134k(interfaceC1739q.mo8132e())) {
            InterfaceC1739q mo8135l = interfaceC1675m.mo8135l(interfaceC1739q.mo8132e());
            if (mo8135l instanceof AbstractC1627j) {
                return ((AbstractC1627j) mo8135l).mo7931a(c1728p4, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", interfaceC1739q.mo8132e()));
        }
        if ("hasOwnProperty".equals(interfaceC1739q.mo8132e())) {
            C1745q5.m8722h("hasOwnProperty", 1, list);
            return interfaceC1675m.mo8134k(c1728p4.m8655b(list.get(0)).mo8132e()) ? InterfaceC1739q.f7170g : InterfaceC1739q.f7171h;
        }
        throw new IllegalArgumentException(String.format("Object has no function %s", interfaceC1739q.mo8132e()));
    }

    /* renamed from: b */
    public static Iterator<InterfaceC1739q> m8346b(Map<String, InterfaceC1739q> map) {
        return new C1659l(map.keySet().iterator());
    }
}
