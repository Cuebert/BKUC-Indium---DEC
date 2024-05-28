package com.google.android.gms.internal.play_billing;

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
/* renamed from: com.google.android.gms.internal.play_billing.e3 */
/* loaded from: classes.dex */
public class C1931e3 extends AbstractMap {

    /* renamed from: n */
    private final int f7654n;

    /* renamed from: q */
    private boolean f7657q;

    /* renamed from: r */
    private volatile C1917c3 f7658r;

    /* renamed from: o */
    private List f7655o = Collections.emptyList();

    /* renamed from: p */
    private Map f7656p = Collections.emptyMap();

    /* renamed from: s */
    private Map f7659s = Collections.emptyMap();

    /* renamed from: k */
    private final int m9332k(Comparable comparable) {
        int size = this.f7655o.size() - 1;
        int i10 = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((C2063x2) this.f7655o.get(size)).m9682b());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = comparable.compareTo(((C2063x2) this.f7655o.get(i11)).m9682b());
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
    public final Object m9333l(int i10) {
        m9335n();
        Object value = ((C2063x2) this.f7655o.remove(i10)).getValue();
        if (!this.f7656p.isEmpty()) {
            Iterator it = m9334m().entrySet().iterator();
            List list = this.f7655o;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C2063x2(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: m */
    private final SortedMap m9334m() {
        m9335n();
        if (this.f7656p.isEmpty() && !(this.f7656p instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f7656p = treeMap;
            this.f7659s = treeMap.descendingMap();
        }
        return (SortedMap) this.f7656p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final void m9335n() {
        if (this.f7657q) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public void mo9336a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.f7657q) {
            return;
        }
        if (this.f7656p.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.f7656p);
        }
        this.f7656p = unmodifiableMap;
        if (this.f7659s.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.f7659s);
        }
        this.f7659s = unmodifiableMap2;
        this.f7657q = true;
    }

    /* renamed from: b */
    public final int m9337b() {
        return this.f7655o.size();
    }

    /* renamed from: c */
    public final Iterable m9338c() {
        return this.f7656p.isEmpty() ? C2056w2.m9672a() : this.f7656p.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m9335n();
        if (!this.f7655o.isEmpty()) {
            this.f7655o.clear();
        }
        if (this.f7656p.isEmpty()) {
            return;
        }
        this.f7656p.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m9332k(comparable) >= 0 || this.f7656p.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m9335n();
        int m9332k = m9332k(comparable);
        if (m9332k >= 0) {
            return ((C2063x2) this.f7655o.get(m9332k)).setValue(obj);
        }
        m9335n();
        if (this.f7655o.isEmpty() && !(this.f7655o instanceof ArrayList)) {
            this.f7655o = new ArrayList(this.f7654n);
        }
        int i10 = -(m9332k + 1);
        if (i10 >= this.f7654n) {
            return m9334m().put(comparable, obj);
        }
        int size = this.f7655o.size();
        int i11 = this.f7654n;
        if (size == i11) {
            C2063x2 c2063x2 = (C2063x2) this.f7655o.remove(i11 - 1);
            m9334m().put(c2063x2.m9682b(), c2063x2.getValue());
        }
        this.f7655o.add(i10, new C2063x2(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f7658r == null) {
            this.f7658r = new C1917c3(this, null);
        }
        return this.f7658r;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1931e3)) {
            return super.equals(obj);
        }
        C1931e3 c1931e3 = (C1931e3) obj;
        int size = size();
        if (size != c1931e3.size()) {
            return false;
        }
        int m9337b = m9337b();
        if (m9337b != c1931e3.m9337b()) {
            return entrySet().equals(c1931e3.entrySet());
        }
        for (int i10 = 0; i10 < m9337b; i10++) {
            if (!m9340g(i10).equals(c1931e3.m9340g(i10))) {
                return false;
            }
        }
        if (m9337b != size) {
            return this.f7656p.equals(c1931e3.f7656p);
        }
        return true;
    }

    /* renamed from: g */
    public final Map.Entry m9340g(int i10) {
        return (Map.Entry) this.f7655o.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m9332k = m9332k(comparable);
        if (m9332k >= 0) {
            return ((C2063x2) this.f7655o.get(m9332k)).getValue();
        }
        return this.f7656p.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int m9337b = m9337b();
        int i10 = 0;
        for (int i11 = 0; i11 < m9337b; i11++) {
            i10 += ((C2063x2) this.f7655o.get(i11)).hashCode();
        }
        return this.f7656p.size() > 0 ? i10 + this.f7656p.hashCode() : i10;
    }

    /* renamed from: j */
    public final boolean m9341j() {
        return this.f7657q;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m9335n();
        Comparable comparable = (Comparable) obj;
        int m9332k = m9332k(comparable);
        if (m9332k >= 0) {
            return m9333l(m9332k);
        }
        if (this.f7656p.isEmpty()) {
            return null;
        }
        return this.f7656p.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f7655o.size() + this.f7656p.size();
    }
}
