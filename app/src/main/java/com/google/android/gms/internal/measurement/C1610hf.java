package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.hf */
/* loaded from: classes.dex */
public final class C1610hf {

    /* renamed from: a */
    final TreeMap<Integer, C1723p> f6834a = new TreeMap<>();

    /* renamed from: b */
    final TreeMap<Integer, C1723p> f6835b = new TreeMap<>();

    /* renamed from: c */
    private static final int m8294c(C1728p4 c1728p4, C1723p c1723p, InterfaceC1739q interfaceC1739q) {
        InterfaceC1739q mo7931a = c1723p.mo7931a(c1728p4, Collections.singletonList(interfaceC1739q));
        if (mo7931a instanceof C1611i) {
            return C1745q5.m8716b(mo7931a.mo8131d().doubleValue());
        }
        return -1;
    }

    /* renamed from: a */
    public final void m8295a(String str, int i10, C1723p c1723p, String str2) {
        TreeMap<Integer, C1723p> treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f6835b;
        } else {
            if (!"edit".equals(str2)) {
                String valueOf = String.valueOf(str2);
                throw new IllegalStateException(valueOf.length() != 0 ? "Unknown callback type: ".concat(valueOf) : new String("Unknown callback type: "));
            }
            treeMap = this.f6834a;
        }
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            i10 = treeMap.lastKey().intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i10), c1723p);
    }

    /* renamed from: b */
    public final void m8296b(C1728p4 c1728p4, C1509c c1509c) {
        C1765r9 c1765r9 = new C1765r9(c1509c);
        for (Integer num : this.f6834a.keySet()) {
            C1492b clone = c1509c.m7968b().clone();
            int m8294c = m8294c(c1728p4, this.f6834a.get(num), c1765r9);
            if (m8294c == 2 || m8294c == -1) {
                c1509c.m7972f(clone);
            }
        }
        Iterator<Integer> it = this.f6835b.keySet().iterator();
        while (it.hasNext()) {
            m8294c(c1728p4, this.f6835b.get(it.next()), c1765r9);
        }
    }
}
