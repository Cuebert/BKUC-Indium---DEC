package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.pa */
/* loaded from: classes.dex */
public class C1734pa<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: n */
    private final int f7150n;

    /* renamed from: q */
    private boolean f7153q;

    /* renamed from: r */
    private volatile C1718oa f7154r;

    /* renamed from: o */
    private List<C1686ma> f7151o = Collections.emptyList();

    /* renamed from: p */
    private Map<K, V> f7152p = Collections.emptyMap();

    /* renamed from: s */
    private Map<K, V> f7155s = Collections.emptyMap();

    /* renamed from: k */
    private final int m8690k(K k10) {
        int size = this.f7151o.size() - 1;
        int i10 = 0;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f7151o.get(size).m8473b());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = k10.compareTo(this.f7151o.get(i11).m8473b());
            if (compareTo2 < 0) {
                size = i11 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i11;
                }
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final V m8691l(int i10) {
        m8693n();
        V v10 = (V) this.f7151o.remove(i10).getValue();
        if (!this.f7152p.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m8692m().entrySet().iterator();
            List<C1686ma> list = this.f7151o;
            Map.Entry<K, V> next = it.next();
            list.add(new C1686ma(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v10;
    }

    /* renamed from: m */
    private final SortedMap<K, V> m8692m() {
        m8693n();
        if (this.f7152p.isEmpty() && !(this.f7152p instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f7152p = treeMap;
            this.f7155s = treeMap.descendingMap();
        }
        return (SortedMap) this.f7152p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final void m8693n() {
        if (this.f7153q) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public void mo8309a() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.f7153q) {
            return;
        }
        if (this.f7152p.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.f7152p);
        }
        this.f7152p = unmodifiableMap;
        if (this.f7155s.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.f7155s);
        }
        this.f7155s = unmodifiableMap2;
        this.f7153q = true;
    }

    /* renamed from: b */
    public final int m8694b() {
        return this.f7151o.size();
    }

    /* renamed from: c */
    public final Iterable<Map.Entry<K, V>> m8695c() {
        return this.f7152p.isEmpty() ? C1670la.m8384a() : this.f7152p.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m8693n();
        if (!this.f7151o.isEmpty()) {
            this.f7151o.clear();
        }
        if (this.f7152p.isEmpty()) {
            return;
        }
        this.f7152p.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m8690k(comparable) >= 0 || this.f7152p.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final V put(K k10, V v10) {
        m8693n();
        int m8690k = m8690k(k10);
        if (m8690k >= 0) {
            return (V) this.f7151o.get(m8690k).setValue(v10);
        }
        m8693n();
        if (this.f7151o.isEmpty() && !(this.f7151o instanceof ArrayList)) {
            this.f7151o = new ArrayList(this.f7150n);
        }
        int i10 = -(m8690k + 1);
        if (i10 >= this.f7150n) {
            return m8692m().put(k10, v10);
        }
        int size = this.f7151o.size();
        int i11 = this.f7150n;
        if (size == i11) {
            C1686ma remove = this.f7151o.remove(i11 - 1);
            m8692m().put(remove.m8473b(), remove.getValue());
        }
        this.f7151o.add(i10, new C1686ma(this, k10, v10));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f7154r == null) {
            this.f7154r = new C1718oa(this, null);
        }
        return this.f7154r;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1734pa)) {
            return super.equals(obj);
        }
        C1734pa c1734pa = (C1734pa) obj;
        int size = size();
        if (size != c1734pa.size()) {
            return false;
        }
        int m8694b = m8694b();
        if (m8694b != c1734pa.m8694b()) {
            return entrySet().equals(c1734pa.entrySet());
        }
        for (int i10 = 0; i10 < m8694b; i10++) {
            if (!m8697g(i10).equals(c1734pa.m8697g(i10))) {
                return false;
            }
        }
        if (m8694b != size) {
            return this.f7152p.equals(c1734pa.f7152p);
        }
        return true;
    }

    /* renamed from: g */
    public final Map.Entry<K, V> m8697g(int i10) {
        return this.f7151o.get(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m8690k = m8690k(comparable);
        if (m8690k >= 0) {
            return (V) this.f7151o.get(m8690k).getValue();
        }
        return this.f7152p.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int m8694b = m8694b();
        int i10 = 0;
        for (int i11 = 0; i11 < m8694b; i11++) {
            i10 += this.f7151o.get(i11).hashCode();
        }
        return this.f7152p.size() > 0 ? i10 + this.f7152p.hashCode() : i10;
    }

    /* renamed from: j */
    public final boolean m8698j() {
        return this.f7153q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m8693n();
        Comparable comparable = (Comparable) obj;
        int m8690k = m8690k(comparable);
        if (m8690k >= 0) {
            return (V) m8691l(m8690k);
        }
        if (this.f7152p.isEmpty()) {
            return null;
        }
        return this.f7152p.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f7151o.size() + this.f7152p.size();
    }
}
