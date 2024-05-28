package p246t3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: t3.i0 */
/* loaded from: classes.dex */
public final class C4660i0 extends AbstractC4664j0 implements NavigableMap {

    /* renamed from: s */
    private static final Comparator f18454s;

    /* renamed from: t */
    private static final C4660i0 f18455t;

    /* renamed from: u */
    public static final /* synthetic */ int f18456u = 0;

    /* renamed from: p */
    private final transient C4708u0 f18457p;

    /* renamed from: q */
    private final transient AbstractC4624a0 f18458q;

    /* renamed from: r */
    private final transient C4660i0 f18459r;

    static {
        C4688p0 c4688p0 = C4688p0.f18487n;
        f18454s = c4688p0;
        C4708u0 m18780A = AbstractC4668k0.m18780A(c4688p0);
        int i10 = AbstractC4624a0.f18417p;
        f18455t = new C4660i0(m18780A, C4700s0.f18497s, null);
    }

    C4660i0(C4708u0 c4708u0, AbstractC4624a0 abstractC4624a0, C4660i0 c4660i0) {
        this.f18457p = c4708u0;
        this.f18458q = abstractC4624a0;
        this.f18459r = c4660i0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static C4660i0 m18770e(Map map) {
        Comparator comparator = f18454s;
        Comparator comparator2 = map.comparator();
        int i10 = 1;
        boolean equals = comparator2 == null ? true : comparator.equals(comparator2);
        Collection entrySet = map.entrySet();
        Map.Entry[] entryArr = AbstractC4634c0.f18424o;
        if (!(entrySet instanceof Collection)) {
            Iterator it = entrySet.iterator();
            Collection arrayList = new ArrayList();
            Objects.requireNonNull(it);
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            entrySet = arrayList;
        }
        Map.Entry[] entryArr2 = (Map.Entry[]) entrySet.toArray(entryArr);
        int length = entryArr2.length;
        if (length == 0) {
            return m18771f(comparator);
        }
        if (length != 1) {
            Object[] objArr = new Object[length];
            Object[] objArr2 = new Object[length];
            if (equals) {
                for (int i11 = 0; i11 < length; i11++) {
                    Map.Entry entry = entryArr2[i11];
                    entry.getClass();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    C4703t.m18825a(key, value);
                    objArr[i11] = key;
                    objArr2[i11] = value;
                }
            } else {
                Arrays.sort(entryArr2, 0, length, new Comparator() { // from class: t3.f0

                    /* renamed from: n */
                    public final /* synthetic */ Comparator f18440n;

                    public /* synthetic */ C4648f0(Comparator comparator3) {
                        r1 = comparator3;
                    }

                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        Comparator comparator3 = r1;
                        Map.Entry entry2 = (Map.Entry) obj;
                        Map.Entry entry3 = (Map.Entry) obj2;
                        int i12 = C4660i0.f18456u;
                        entry2.getClass();
                        entry3.getClass();
                        return comparator3.compare(entry2.getKey(), entry3.getKey());
                    }
                });
                Map.Entry entry2 = entryArr2[0];
                entry2.getClass();
                Object key2 = entry2.getKey();
                objArr[0] = key2;
                Object value2 = entry2.getValue();
                objArr2[0] = value2;
                C4703t.m18825a(objArr[0], value2);
                while (i10 < length) {
                    Map.Entry entry3 = entryArr2[i10 - 1];
                    entry3.getClass();
                    Map.Entry entry4 = entryArr2[i10];
                    entry4.getClass();
                    Object key3 = entry4.getKey();
                    Object value3 = entry4.getValue();
                    C4703t.m18825a(key3, value3);
                    objArr[i10] = key3;
                    objArr2[i10] = value3;
                    if (comparator3.compare(key2, key3) == 0) {
                        throw new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(entry3) + " and " + String.valueOf(entry4));
                    }
                    i10++;
                    key2 = key3;
                }
            }
            return new C4660i0(new C4708u0(AbstractC4624a0.m18716p(objArr, length), comparator3), AbstractC4624a0.m18716p(objArr2, length), null);
        }
        Map.Entry entry5 = entryArr2[0];
        entry5.getClass();
        return new C4660i0(new C4708u0(AbstractC4624a0.m18718r(entry5.getKey()), comparator3), AbstractC4624a0.m18718r(entry5.getValue()), null);
    }

    /* renamed from: f */
    static C4660i0 m18771f(Comparator comparator) {
        if (C4688p0.f18487n.equals(comparator)) {
            return f18455t;
        }
        C4708u0 m18780A = AbstractC4668k0.m18780A(comparator);
        int i10 = AbstractC4624a0.f18417p;
        return new C4660i0(m18780A, C4700s0.f18497s, null);
    }

    /* renamed from: k */
    private final C4660i0 m18773k(int i10, int i11) {
        if (i10 == 0) {
            if (i11 == this.f18458q.size()) {
                return this;
            }
            i10 = 0;
        }
        if (i10 == i11) {
            return m18771f(this.f18457p.f18468p);
        }
        return new C4660i0(this.f18457p.m18832E(i10, i11), this.f18458q.subList(i10, i11), null);
    }

    @Override // p246t3.AbstractC4634c0
    /* renamed from: a */
    public final AbstractC4715w mo18741a() {
        return this.f18458q;
    }

    @Override // p246t3.AbstractC4634c0
    /* renamed from: b */
    final AbstractC4644e0 mo18742b() {
        if (isEmpty()) {
            return C4704t0.f18501v;
        }
        return new C4656h0(this);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return C4680n0.m18794a(ceilingEntry(obj));
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.f18457p.f18468p;
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.f18457p.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        AbstractC4696r0 c4707u;
        C4660i0 c4660i0 = this.f18459r;
        if (c4660i0 != null) {
            return c4660i0;
        }
        if (isEmpty()) {
            Comparator comparator = this.f18457p.f18468p;
            if (comparator instanceof AbstractC4696r0) {
                c4707u = (AbstractC4696r0) comparator;
            } else {
                c4707u = new C4707u(comparator);
            }
            return m18771f(c4707u.mo18800a());
        }
        return new C4660i0((C4708u0) this.f18457p.descendingSet(), this.f18458q.mo18721m(), this);
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return m18743c();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) m18743c().mo18752q().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.f18457p.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return C4680n0.m18794a(floorEntry(obj));
    }

    @Override // java.util.NavigableMap
    /* renamed from: g */
    public final C4660i0 headMap(Object obj, boolean z10) {
        C4708u0 c4708u0 = this.f18457p;
        Objects.requireNonNull(obj);
        return m18773k(0, c4708u0.m18830C(obj, z10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000f, code lost:
    
        if (r4 < 0) goto L20;
     */
    @Override // p246t3.AbstractC4634c0, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            t3.u0 r0 = r3.f18457p
            r1 = -1
            if (r4 != 0) goto L7
        L5:
            r4 = -1
            goto L12
        L7:
            t3.a0 r2 = r0.f18509r     // Catch: java.lang.ClassCastException -> L5
            java.util.Comparator r0 = r0.f18468p     // Catch: java.lang.ClassCastException -> L5
            int r4 = java.util.Collections.binarySearch(r2, r4, r0)     // Catch: java.lang.ClassCastException -> L5
            if (r4 >= 0) goto L12
            goto L5
        L12:
            if (r4 != r1) goto L16
            r4 = 0
            return r4
        L16:
            t3.a0 r0 = r3.f18458q
            java.lang.Object r4 = r0.get(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p246t3.C4660i0.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.NavigableMap
    /* renamed from: h */
    public final C4660i0 subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj2);
        if (this.f18457p.f18468p.compare(obj, obj2) <= 0) {
            return headMap(obj2, z11).tailMap(obj, z10);
        }
        throw new IllegalArgumentException(C4695r.m18811a("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return C4680n0.m18794a(higherEntry(obj));
    }

    @Override // java.util.NavigableMap
    /* renamed from: i */
    public final C4660i0 tailMap(Object obj, boolean z10) {
        C4708u0 c4708u0 = this.f18457p;
        Objects.requireNonNull(obj);
        return m18773k(c4708u0.m18831D(obj, z10), this.f18458q.size());
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Set keySet() {
        return this.f18457p;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) m18743c().mo18752q().get(this.f18458q.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.f18457p.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return C4680n0.m18794a(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.f18457p;
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f18458q.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Collection values() {
        return this.f18458q;
    }
}
