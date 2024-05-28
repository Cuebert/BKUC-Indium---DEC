package com.google.android.gms.internal.measurement;

import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.f */
/* loaded from: classes.dex */
public final class C1560f implements Iterable<InterfaceC1739q>, InterfaceC1739q, InterfaceC1675m {

    /* renamed from: n */
    final SortedMap<Integer, InterfaceC1739q> f6785n;

    /* renamed from: o */
    final Map<String, InterfaceC1739q> f6786o;

    public C1560f() {
        this.f6785n = new TreeMap();
        this.f6786o = new TreeMap();
    }

    /* renamed from: A */
    public final void m8128A(int i10, InterfaceC1739q interfaceC1739q) {
        if (i10 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Out of bounds index: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (interfaceC1739q == null) {
            this.f6785n.remove(Integer.valueOf(i10));
        } else {
            this.f6785n.put(Integer.valueOf(i10), interfaceC1739q);
        }
    }

    /* renamed from: B */
    public final boolean m8129B(int i10) {
        if (i10 >= 0 && i10 <= this.f6785n.lastKey().intValue()) {
            return this.f6785n.containsKey(Integer.valueOf(i10));
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Out of bounds index: ");
        sb2.append(i10);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: c */
    public final InterfaceC1739q mo8130c() {
        C1560f c1560f = new C1560f();
        for (Map.Entry<Integer, InterfaceC1739q> entry : this.f6785n.entrySet()) {
            if (entry.getValue() instanceof InterfaceC1675m) {
                c1560f.f6785n.put(entry.getKey(), entry.getValue());
            } else {
                c1560f.f6785n.put(entry.getKey(), entry.getValue().mo8130c());
            }
        }
        return c1560f;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: d */
    public final Double mo8131d() {
        if (this.f6785n.size() == 1) {
            return m8141s(0).mo8131d();
        }
        if (this.f6785n.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: e */
    public final String mo8132e() {
        return m8142u(",");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1560f)) {
            return false;
        }
        C1560f c1560f = (C1560f) obj;
        if (m8140r() != c1560f.m8140r()) {
            return false;
        }
        if (this.f6785n.isEmpty()) {
            return c1560f.f6785n.isEmpty();
        }
        for (int intValue = this.f6785n.firstKey().intValue(); intValue <= this.f6785n.lastKey().intValue(); intValue++) {
            if (!m8141s(intValue).equals(c1560f.m8141s(intValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f6785n.hashCode() * 31;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: i */
    public final Iterator<InterfaceC1739q> mo8133i() {
        return new C1526d(this, this.f6785n.keySet().iterator(), this.f6786o.keySet().iterator());
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC1739q> iterator() {
        return new C1543e(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1675m
    /* renamed from: k */
    public final boolean mo8134k(String str) {
        return "length".equals(str) || this.f6786o.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1675m
    /* renamed from: l */
    public final InterfaceC1739q mo8135l(String str) {
        InterfaceC1739q interfaceC1739q;
        if ("length".equals(str)) {
            return new C1611i(Double.valueOf(m8140r()));
        }
        return (!mo8134k(str) || (interfaceC1739q = this.f6786o.get(str)) == null) ? InterfaceC1739q.f7165b : interfaceC1739q;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: m */
    public final Boolean mo8136m() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1675m
    /* renamed from: o */
    public final void mo8137o(String str, InterfaceC1739q interfaceC1739q) {
        if (interfaceC1739q == null) {
            this.f6786o.remove(str);
        } else {
            this.f6786o.put(str, interfaceC1739q);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: p */
    public final InterfaceC1739q mo8138p(String str, C1728p4 c1728p4, List<InterfaceC1739q> list) {
        if (!"concat".equals(str) && !"every".equals(str) && !"filter".equals(str) && !"forEach".equals(str) && !"indexOf".equals(str) && !"join".equals(str) && !"lastIndexOf".equals(str) && !"map".equals(str) && !"pop".equals(str) && !"push".equals(str) && !"reduce".equals(str) && !"reduceRight".equals(str) && !"reverse".equals(str) && !"shift".equals(str) && !"slice".equals(str) && !"some".equals(str) && !"sort".equals(str) && !"splice".equals(str) && !"toString".equals(str) && !"unshift".equals(str)) {
            return C1643k.m8345a(this, new C1803u(str), c1728p4, list);
        }
        return C1527d0.m8015a(str, this, c1728p4, list);
    }

    /* renamed from: q */
    public final int m8139q() {
        return this.f6785n.size();
    }

    /* renamed from: r */
    public final int m8140r() {
        if (this.f6785n.isEmpty()) {
            return 0;
        }
        return this.f6785n.lastKey().intValue() + 1;
    }

    /* renamed from: s */
    public final InterfaceC1739q m8141s(int i10) {
        InterfaceC1739q interfaceC1739q;
        if (i10 < m8140r()) {
            return (!m8129B(i10) || (interfaceC1739q = this.f6785n.get(Integer.valueOf(i10))) == null) ? InterfaceC1739q.f7165b : interfaceC1739q;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final String toString() {
        return m8142u(",");
    }

    /* renamed from: u */
    public final String m8142u(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        StringBuilder sb2 = new StringBuilder();
        if (!this.f6785n.isEmpty()) {
            for (int i10 = 0; i10 < m8140r(); i10++) {
                InterfaceC1739q m8141s = m8141s(i10);
                sb2.append(str);
                if (!(m8141s instanceof C1819v) && !(m8141s instanceof C1707o)) {
                    sb2.append(m8141s.mo8132e());
                }
            }
            sb2.delete(0, str.length());
        }
        return sb2.toString();
    }

    /* renamed from: v */
    public final Iterator<Integer> m8143v() {
        return this.f6785n.keySet().iterator();
    }

    /* renamed from: w */
    public final List<InterfaceC1739q> m8144w() {
        ArrayList arrayList = new ArrayList(m8140r());
        for (int i10 = 0; i10 < m8140r(); i10++) {
            arrayList.add(m8141s(i10));
        }
        return arrayList;
    }

    /* renamed from: x */
    public final void m8145x() {
        this.f6785n.clear();
    }

    /* renamed from: y */
    public final void m8146y(int i10, InterfaceC1739q interfaceC1739q) {
        if (i10 >= 0) {
            if (i10 >= m8140r()) {
                m8128A(i10, interfaceC1739q);
                return;
            }
            for (int intValue = this.f6785n.lastKey().intValue(); intValue >= i10; intValue--) {
                SortedMap<Integer, InterfaceC1739q> sortedMap = this.f6785n;
                Integer valueOf = Integer.valueOf(intValue);
                InterfaceC1739q interfaceC1739q2 = sortedMap.get(valueOf);
                if (interfaceC1739q2 != null) {
                    m8128A(intValue + 1, interfaceC1739q2);
                    this.f6785n.remove(valueOf);
                }
            }
            m8128A(i10, interfaceC1739q);
            return;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Invalid value index: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: z */
    public final void m8147z(int i10) {
        int intValue = this.f6785n.lastKey().intValue();
        if (i10 > intValue || i10 < 0) {
            return;
        }
        this.f6785n.remove(Integer.valueOf(i10));
        if (i10 == intValue) {
            SortedMap<Integer, InterfaceC1739q> sortedMap = this.f6785n;
            int i11 = i10 - 1;
            Integer valueOf = Integer.valueOf(i11);
            if (sortedMap.containsKey(valueOf) || i11 < 0) {
                return;
            }
            this.f6785n.put(valueOf, InterfaceC1739q.f7165b);
            return;
        }
        while (true) {
            i10++;
            if (i10 > this.f6785n.lastKey().intValue()) {
                return;
            }
            SortedMap<Integer, InterfaceC1739q> sortedMap2 = this.f6785n;
            Integer valueOf2 = Integer.valueOf(i10);
            InterfaceC1739q interfaceC1739q = sortedMap2.get(valueOf2);
            if (interfaceC1739q != null) {
                this.f6785n.put(Integer.valueOf(i10 - 1), interfaceC1739q);
                this.f6785n.remove(valueOf2);
            }
        }
    }

    public C1560f(List<InterfaceC1739q> list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                m8128A(i10, list.get(i10));
            }
        }
    }
}
