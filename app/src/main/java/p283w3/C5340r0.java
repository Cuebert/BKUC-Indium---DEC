package p283w3;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w3.r0 */
/* loaded from: classes.dex */
public final class C5340r0<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: w */
    private static final Object f20075w = new Object();

    /* renamed from: n */
    @NullableDecl
    private transient Object f20076n;

    /* renamed from: o */
    @NullableDecl
    transient int[] f20077o;

    /* renamed from: p */
    @NullableDecl
    transient Object[] f20078p;

    /* renamed from: q */
    @NullableDecl
    transient Object[] f20079q;

    /* renamed from: r */
    private transient int f20080r;

    /* renamed from: s */
    private transient int f20081s;

    /* renamed from: t */
    @NullableDecl
    private transient Set<K> f20082t;

    /* renamed from: u */
    @NullableDecl
    private transient Set<Map.Entry<K, V>> f20083u;

    /* renamed from: v */
    @NullableDecl
    private transient Collection<V> f20084v;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5340r0(int i10) {
        m19939l(12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* synthetic */ int m19926d(C5340r0 c5340r0) {
        int i10 = c5340r0.f20081s;
        c5340r0.f20081s = i10 - 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final int m19930o() {
        return (1 << (this.f20080r & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public final int m19931p(@NullableDecl Object obj) {
        if (m19941n()) {
            return -1;
        }
        int m19978a = C5366t0.m19978a(obj);
        int m19930o = m19930o();
        int m19961c = C5353s0.m19961c(this.f20076n, m19978a & m19930o);
        if (m19961c != 0) {
            int i10 = ~m19930o;
            int i11 = m19978a & i10;
            do {
                int i12 = m19961c - 1;
                int i13 = this.f20077o[i12];
                if ((i13 & i10) == i11 && C5261l.m19848a(obj, this.f20078p[i12])) {
                    return i12;
                }
                m19961c = i13 & m19930o;
            } while (m19961c != 0);
        }
        return -1;
    }

    /* renamed from: q */
    private final int m19932q(int i10, int i11, int i12, int i13) {
        Object m19962d = C5353s0.m19962d(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            C5353s0.m19963e(m19962d, i12 & i14, i13 + 1);
        }
        Object obj = this.f20076n;
        int[] iArr = this.f20077o;
        for (int i15 = 0; i15 <= i10; i15++) {
            int m19961c = C5353s0.m19961c(obj, i15);
            while (m19961c != 0) {
                int i16 = m19961c - 1;
                int i17 = iArr[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int m19961c2 = C5353s0.m19961c(m19962d, i19);
                C5353s0.m19963e(m19962d, i19, m19961c);
                iArr[i16] = ((~i14) & i18) | (m19961c2 & i14);
                m19961c = i17 & i10;
            }
        }
        this.f20076n = m19962d;
        m19934s(i14);
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NullableDecl
    /* renamed from: r */
    public final Object m19933r(@NullableDecl Object obj) {
        if (m19941n()) {
            return f20075w;
        }
        int m19930o = m19930o();
        int m19960b = C5353s0.m19960b(obj, null, m19930o, this.f20076n, this.f20077o, this.f20078p, null);
        if (m19960b == -1) {
            return f20075w;
        }
        Object obj2 = this.f20079q[m19960b];
        m19940m(m19960b, m19930o);
        this.f20081s--;
        m19938k();
        return obj2;
    }

    /* renamed from: s */
    private final void m19934s(int i10) {
        this.f20080r = ((32 - Integer.numberOfLeadingZeros(i10)) & 31) | (this.f20080r & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m19941n()) {
            return;
        }
        m19938k();
        Map<K, V> m19937j = m19937j();
        if (m19937j != null) {
            this.f20080r = C5367t1.m19979a(size(), 3, 1073741823);
            m19937j.clear();
            this.f20076n = null;
            this.f20081s = 0;
            return;
        }
        Arrays.fill(this.f20078p, 0, this.f20081s, (Object) null);
        Arrays.fill(this.f20079q, 0, this.f20081s, (Object) null);
        Object obj = this.f20076n;
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(this.f20077o, 0, this.f20081s, 0);
        this.f20081s = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@NullableDecl Object obj) {
        Map<K, V> m19937j = m19937j();
        if (m19937j != null) {
            return m19937j.containsKey(obj);
        }
        return m19931p(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@NullableDecl Object obj) {
        Map<K, V> m19937j = m19937j();
        if (m19937j != null) {
            return m19937j.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f20081s; i10++) {
            if (C5261l.m19848a(obj, this.f20079q[i10])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final int m19935e() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f20083u;
        if (set != null) {
            return set;
        }
        C5275m0 c5275m0 = new C5275m0(this);
        this.f20083u = c5275m0;
        return c5275m0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final int m19936f(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f20081s) {
            return i11;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(@NullableDecl Object obj) {
        Map<K, V> m19937j = m19937j();
        if (m19937j != null) {
            return m19937j.get(obj);
        }
        int m19931p = m19931p(obj);
        if (m19931p == -1) {
            return null;
        }
        return (V) this.f20079q[m19931p];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NullableDecl
    /* renamed from: j */
    public final Map<K, V> m19937j() {
        Object obj = this.f20076n;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final void m19938k() {
        this.f20080r += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.f20082t;
        if (set != null) {
            return set;
        }
        C5301o0 c5301o0 = new C5301o0(this);
        this.f20082t = c5301o0;
        return c5301o0;
    }

    /* renamed from: l */
    final void m19939l(int i10) {
        this.f20080r = C5367t1.m19979a(12, 1, 1073741823);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final void m19940m(int i10, int i11) {
        int size = size() - 1;
        if (i10 < size) {
            Object[] objArr = this.f20078p;
            Object obj = objArr[size];
            objArr[i10] = obj;
            Object[] objArr2 = this.f20079q;
            objArr2[i10] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            int[] iArr = this.f20077o;
            iArr[i10] = iArr[size];
            iArr[size] = 0;
            int m19978a = C5366t0.m19978a(obj) & i11;
            int m19961c = C5353s0.m19961c(this.f20076n, m19978a);
            int i12 = size + 1;
            if (m19961c == i12) {
                C5353s0.m19963e(this.f20076n, m19978a, i10 + 1);
                return;
            }
            while (true) {
                int i13 = m19961c - 1;
                int[] iArr2 = this.f20077o;
                int i14 = iArr2[i13];
                int i15 = i14 & i11;
                if (i15 == i12) {
                    iArr2[i13] = ((i10 + 1) & i11) | ((~i11) & i14);
                    return;
                }
                m19961c = i15;
            }
        } else {
            this.f20078p[i10] = null;
            this.f20079q[i10] = null;
            this.f20077o[i10] = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean m19941n() {
        return this.f20076n == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public final V put(@NullableDecl K k10, @NullableDecl V v10) {
        int min;
        if (m19941n()) {
            C5313p.m19885d(m19941n(), "Arrays already allocated");
            int i10 = this.f20080r;
            int max = Math.max(i10 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f20076n = C5353s0.m19962d(max2);
            m19934s(max2 - 1);
            this.f20077o = new int[i10];
            this.f20078p = new Object[i10];
            this.f20079q = new Object[i10];
        }
        Map<K, V> m19937j = m19937j();
        if (m19937j != null) {
            return m19937j.put(k10, v10);
        }
        int[] iArr = this.f20077o;
        Object[] objArr = this.f20078p;
        Object[] objArr2 = this.f20079q;
        int i11 = this.f20081s;
        int i12 = i11 + 1;
        int m19978a = C5366t0.m19978a(k10);
        int m19930o = m19930o();
        int i13 = m19978a & m19930o;
        int m19961c = C5353s0.m19961c(this.f20076n, i13);
        if (m19961c != 0) {
            int i14 = ~m19930o;
            int i15 = m19978a & i14;
            int i16 = 0;
            while (true) {
                int i17 = m19961c - 1;
                int i18 = iArr[i17];
                int i19 = i18 & i14;
                if (i19 == i15 && C5261l.m19848a(k10, objArr[i17])) {
                    V v11 = (V) objArr2[i17];
                    objArr2[i17] = v10;
                    return v11;
                }
                int i20 = i18 & m19930o;
                i16++;
                if (i20 != 0) {
                    m19961c = i20;
                } else {
                    if (i16 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(m19930o() + 1, 1.0f);
                        int m19935e = m19935e();
                        while (m19935e >= 0) {
                            linkedHashMap.put(this.f20078p[m19935e], this.f20079q[m19935e]);
                            m19935e = m19936f(m19935e);
                        }
                        this.f20076n = linkedHashMap;
                        this.f20077o = null;
                        this.f20078p = null;
                        this.f20079q = null;
                        m19938k();
                        return (V) linkedHashMap.put(k10, v10);
                    }
                    if (i12 > m19930o) {
                        m19930o = m19932q(m19930o, C5353s0.m19959a(m19930o), m19978a, i11);
                    } else {
                        iArr[i17] = (i12 & m19930o) | i19;
                    }
                }
            }
        } else if (i12 > m19930o) {
            m19930o = m19932q(m19930o, C5353s0.m19959a(m19930o), m19978a, i11);
        } else {
            C5353s0.m19963e(this.f20076n, i13, i12);
        }
        int length = this.f20077o.length;
        if (i12 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f20077o = Arrays.copyOf(this.f20077o, min);
            this.f20078p = Arrays.copyOf(this.f20078p, min);
            this.f20079q = Arrays.copyOf(this.f20079q, min);
        }
        this.f20077o[i11] = (~m19930o) & m19978a;
        this.f20078p[i11] = k10;
        this.f20079q[i11] = v10;
        this.f20081s = i12;
        m19938k();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public final V remove(@NullableDecl Object obj) {
        Map<K, V> m19937j = m19937j();
        if (m19937j != null) {
            return m19937j.remove(obj);
        }
        V v10 = (V) m19933r(obj);
        if (v10 == f20075w) {
            return null;
        }
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map<K, V> m19937j = m19937j();
        return m19937j != null ? m19937j.size() : this.f20081s;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.f20084v;
        if (collection != null) {
            return collection;
        }
        C5327q0 c5327q0 = new C5327q0(this);
        this.f20084v = c5327q0;
        return c5327q0;
    }
}
