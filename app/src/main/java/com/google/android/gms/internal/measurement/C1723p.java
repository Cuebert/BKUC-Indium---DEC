package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.p */
/* loaded from: classes.dex */
public final class C1723p extends AbstractC1627j {

    /* renamed from: p */
    protected final List<String> f7129p;

    /* renamed from: q */
    protected final List<InterfaceC1739q> f7130q;

    /* renamed from: r */
    protected C1728p4 f7131r;

    private C1723p(C1723p c1723p) {
        super(c1723p.f6915n);
        ArrayList arrayList = new ArrayList(c1723p.f7129p.size());
        this.f7129p = arrayList;
        arrayList.addAll(c1723p.f7129p);
        ArrayList arrayList2 = new ArrayList(c1723p.f7130q.size());
        this.f7130q = arrayList2;
        arrayList2.addAll(c1723p.f7130q);
        this.f7131r = c1723p.f7131r;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1627j
    /* renamed from: a */
    public final InterfaceC1739q mo7931a(C1728p4 c1728p4, List<InterfaceC1739q> list) {
        C1728p4 m8654a = this.f7131r.m8654a();
        for (int i10 = 0; i10 < this.f7129p.size(); i10++) {
            if (i10 < list.size()) {
                m8654a.m8658e(this.f7129p.get(i10), c1728p4.m8655b(list.get(i10)));
            } else {
                m8654a.m8658e(this.f7129p.get(i10), InterfaceC1739q.f7165b);
            }
        }
        for (InterfaceC1739q interfaceC1739q : this.f7130q) {
            InterfaceC1739q m8655b = m8654a.m8655b(interfaceC1739q);
            if (m8655b instanceof C1755r) {
                m8655b = m8654a.m8655b(interfaceC1739q);
            }
            if (m8655b instanceof C1594h) {
                return ((C1594h) m8655b).m8203a();
            }
        }
        return InterfaceC1739q.f7165b;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1627j, com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: c */
    public final InterfaceC1739q mo8130c() {
        return new C1723p(this);
    }

    public C1723p(String str, List<InterfaceC1739q> list, List<InterfaceC1739q> list2, C1728p4 c1728p4) {
        super(str);
        this.f7129p = new ArrayList();
        this.f7131r = c1728p4;
        if (!list.isEmpty()) {
            Iterator<InterfaceC1739q> it = list.iterator();
            while (it.hasNext()) {
                this.f7129p.add(it.next().mo8132e());
            }
        }
        this.f7130q = new ArrayList(list2);
    }
}
