package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.y */
/* loaded from: classes.dex */
public final class C1867y {

    /* renamed from: a */
    final Map<String, AbstractC1851x> f7323a = new HashMap();

    /* renamed from: b */
    final C1660l0 f7324b = new C1660l0();

    public C1867y() {
        m9058b(new C1835w());
        m9058b(new C1883z());
        m9058b(new C1476a0());
        m9058b(new C1544e0());
        m9058b(new C1628j0());
        m9058b(new C1644k0());
        m9058b(new C1676m0());
    }

    /* renamed from: a */
    public final InterfaceC1739q m9057a(C1728p4 c1728p4, InterfaceC1739q interfaceC1739q) {
        AbstractC1851x abstractC1851x;
        C1745q5.m8717c(c1728p4);
        if (!(interfaceC1739q instanceof C1755r)) {
            return interfaceC1739q;
        }
        C1755r c1755r = (C1755r) interfaceC1739q;
        ArrayList<InterfaceC1739q> m8738b = c1755r.m8738b();
        String m8737a = c1755r.m8737a();
        if (this.f7323a.containsKey(m8737a)) {
            abstractC1851x = this.f7323a.get(m8737a);
        } else {
            abstractC1851x = this.f7324b;
        }
        return abstractC1851x.mo7877a(m8737a, c1728p4, m8738b);
    }

    /* renamed from: b */
    final void m9058b(AbstractC1851x abstractC1851x) {
        Iterator<EnumC1692n0> it = abstractC1851x.f7285a.iterator();
        while (it.hasNext()) {
            this.f7323a.put(it.next().m8485c().toString(), abstractC1851x);
        }
    }
}
