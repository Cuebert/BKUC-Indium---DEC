package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1480a4;
import com.google.android.gms.internal.measurement.C1497b4;
import com.google.android.gms.internal.measurement.C1776s4;
import com.google.android.gms.internal.measurement.C1792t4;
import com.google.android.gms.internal.measurement.C1808u4;
import com.google.android.gms.internal.measurement.C1824v4;
import com.google.android.gms.internal.measurement.C1832vc;
import com.google.android.gms.internal.measurement.C1871y3;
import com.google.android.gms.internal.measurement.C1887z3;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p018b4.C1010x;
import p093h0.C3356a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.o9 */
/* loaded from: classes.dex */
public final class C2246o9 {

    /* renamed from: a */
    private String f8410a;

    /* renamed from: b */
    private boolean f8411b;

    /* renamed from: c */
    private C1792t4 f8412c;

    /* renamed from: d */
    private BitSet f8413d;

    /* renamed from: e */
    private BitSet f8414e;

    /* renamed from: f */
    private Map<Integer, Long> f8415f;

    /* renamed from: g */
    private Map<Integer, List<Long>> f8416g;

    /* renamed from: h */
    final /* synthetic */ C2301t9 f8417h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2246o9(C2301t9 c2301t9, String str, C1010x c1010x) {
        this.f8417h = c2301t9;
        this.f8410a = str;
        this.f8411b = true;
        this.f8413d = new BitSet();
        this.f8414e = new BitSet();
        this.f8415f = new C3356a();
        this.f8416g = new C3356a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C1887z3 m10205a(int i10) {
        ArrayList arrayList;
        List list;
        C1871y3 m9132x = C1887z3.m9132x();
        m9132x.m9061v(i10);
        m9132x.m9063x(this.f8411b);
        C1792t4 c1792t4 = this.f8412c;
        if (c1792t4 != null) {
            m9132x.m9064y(c1792t4);
        }
        C1776s4 m8822B = C1792t4.m8822B();
        m8822B.m8810w(C2125d9.m9826J(this.f8413d));
        m8822B.m8812y(C2125d9.m9826J(this.f8414e));
        Map<Integer, Long> map = this.f8415f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            Iterator<Integer> it = this.f8415f.keySet().iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                Long l10 = this.f8415f.get(Integer.valueOf(intValue));
                if (l10 != null) {
                    C1480a4 m7945y = C1497b4.m7945y();
                    m7945y.m7881w(intValue);
                    m7945y.m7880v(l10.longValue());
                    arrayList2.add(m7945y.m8466p());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            m8822B.m8809v(arrayList);
        }
        Map<Integer, List<Long>> map2 = this.f8416g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num : this.f8416g.keySet()) {
                C1808u4 m8890z = C1824v4.m8890z();
                m8890z.m8863w(num.intValue());
                List<Long> list2 = this.f8416g.get(num);
                if (list2 != null) {
                    Collections.sort(list2);
                    m8890z.m8862v(list2);
                }
                arrayList3.add((C1824v4) m8890z.m8466p());
            }
            list = arrayList3;
        }
        m8822B.m8811x(list);
        m9132x.m9062w(m8822B);
        return m9132x.m8466p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m10206c(AbstractC2279r9 abstractC2279r9) {
        int mo10221a = abstractC2279r9.mo10221a();
        Boolean bool = abstractC2279r9.f8520c;
        if (bool != null) {
            this.f8414e.set(mo10221a, bool.booleanValue());
        }
        Boolean bool2 = abstractC2279r9.f8521d;
        if (bool2 != null) {
            this.f8413d.set(mo10221a, bool2.booleanValue());
        }
        if (abstractC2279r9.f8522e != null) {
            Map<Integer, Long> map = this.f8415f;
            Integer valueOf = Integer.valueOf(mo10221a);
            Long l10 = map.get(valueOf);
            long longValue = abstractC2279r9.f8522e.longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                this.f8415f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (abstractC2279r9.f8523f != null) {
            Map<Integer, List<Long>> map2 = this.f8416g;
            Integer valueOf2 = Integer.valueOf(mo10221a);
            List<Long> list = map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList<>();
                this.f8416g.put(valueOf2, list);
            }
            if (abstractC2279r9.mo10223c()) {
                list.clear();
            }
            C1832vc.m8924b();
            C2137f m10134z = this.f8417h.f8118a.m10134z();
            String str = this.f8410a;
            C2325w2<Boolean> c2325w2 = C2335x2.f8697a0;
            if (m10134z.m9861B(str, c2325w2) && abstractC2279r9.mo10222b()) {
                list.clear();
            }
            C1832vc.m8924b();
            if (this.f8417h.f8118a.m10134z().m9861B(this.f8410a, c2325w2)) {
                Long valueOf3 = Long.valueOf(abstractC2279r9.f8523f.longValue() / 1000);
                if (list.contains(valueOf3)) {
                    return;
                }
                list.add(valueOf3);
                return;
            }
            list.add(Long.valueOf(abstractC2279r9.f8523f.longValue() / 1000));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2246o9(C2301t9 c2301t9, String str, C1792t4 c1792t4, BitSet bitSet, BitSet bitSet2, Map map, Map map2, C1010x c1010x) {
        this.f8417h = c2301t9;
        this.f8410a = str;
        this.f8413d = bitSet;
        this.f8414e = bitSet2;
        this.f8415f = map;
        this.f8416g = new C3356a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f8416g.put(num, arrayList);
        }
        this.f8411b = false;
        this.f8412c = c1792t4;
    }
}
