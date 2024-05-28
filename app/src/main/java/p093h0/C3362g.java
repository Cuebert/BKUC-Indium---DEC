package p093h0;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: h0.g */
/* loaded from: classes.dex */
public class C3362g<K, V> {

    /* renamed from: q */
    static Object[] f14101q;

    /* renamed from: r */
    static int f14102r;

    /* renamed from: s */
    static Object[] f14103s;

    /* renamed from: t */
    static int f14104t;

    /* renamed from: n */
    int[] f14105n;

    /* renamed from: o */
    Object[] f14106o;

    /* renamed from: p */
    int f14107p;

    public C3362g() {
        this.f14105n = C3358c.f14070a;
        this.f14106o = C3358c.f14072c;
        this.f14107p = 0;
    }

    /* renamed from: a */
    private void m14832a(int i10) {
        if (i10 == 8) {
            synchronized (C3362g.class) {
                Object[] objArr = f14103s;
                if (objArr != null) {
                    this.f14106o = objArr;
                    f14103s = (Object[]) objArr[0];
                    this.f14105n = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f14104t--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (C3362g.class) {
                Object[] objArr2 = f14101q;
                if (objArr2 != null) {
                    this.f14106o = objArr2;
                    f14101q = (Object[]) objArr2[0];
                    this.f14105n = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f14102r--;
                    return;
                }
            }
        }
        this.f14105n = new int[i10];
        this.f14106o = new Object[i10 << 1];
    }

    /* renamed from: b */
    private static int m14833b(int[] iArr, int i10, int i11) {
        try {
            return C3358c.m14795a(iArr, i10, i11);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: d */
    private static void m14834d(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (C3362g.class) {
                if (f14104t < 10) {
                    objArr[0] = f14103s;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f14103s = objArr;
                    f14104t++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C3362g.class) {
                if (f14102r < 10) {
                    objArr[0] = f14101q;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f14101q = objArr;
                    f14102r++;
                }
            }
        }
    }

    /* renamed from: c */
    public void m14835c(int i10) {
        int i11 = this.f14107p;
        int[] iArr = this.f14105n;
        if (iArr.length < i10) {
            Object[] objArr = this.f14106o;
            m14832a(i10);
            if (this.f14107p > 0) {
                System.arraycopy(iArr, 0, this.f14105n, 0, i11);
                System.arraycopy(objArr, 0, this.f14106o, 0, i11 << 1);
            }
            m14834d(iArr, objArr, i11);
        }
        if (this.f14107p != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i10 = this.f14107p;
        if (i10 > 0) {
            int[] iArr = this.f14105n;
            Object[] objArr = this.f14106o;
            this.f14105n = C3358c.f14070a;
            this.f14106o = C3358c.f14072c;
            this.f14107p = 0;
            m14834d(iArr, objArr, i10);
        }
        if (this.f14107p > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m14837f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m14839h(obj) >= 0;
    }

    /* renamed from: e */
    int m14836e(Object obj, int i10) {
        int i11 = this.f14107p;
        if (i11 == 0) {
            return -1;
        }
        int m14833b = m14833b(this.f14105n, i11, i10);
        if (m14833b < 0 || obj.equals(this.f14106o[m14833b << 1])) {
            return m14833b;
        }
        int i12 = m14833b + 1;
        while (i12 < i11 && this.f14105n[i12] == i10) {
            if (obj.equals(this.f14106o[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = m14833b - 1; i13 >= 0 && this.f14105n[i13] == i10; i13--) {
            if (obj.equals(this.f14106o[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3362g) {
            C3362g c3362g = (C3362g) obj;
            if (size() != c3362g.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f14107p; i10++) {
                try {
                    K m14840i = m14840i(i10);
                    V m14844m = m14844m(i10);
                    Object obj2 = c3362g.get(m14840i);
                    if (m14844m == null) {
                        if (obj2 != null || !c3362g.containsKey(m14840i)) {
                            return false;
                        }
                    } else if (!m14844m.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i11 = 0; i11 < this.f14107p; i11++) {
                try {
                    K m14840i2 = m14840i(i11);
                    V m14844m2 = m14844m(i11);
                    Object obj3 = map.get(m14840i2);
                    if (m14844m2 == null) {
                        if (obj3 != null || !map.containsKey(m14840i2)) {
                            return false;
                        }
                    } else if (!m14844m2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m14837f(Object obj) {
        return obj == null ? m14838g() : m14836e(obj, obj.hashCode());
    }

    /* renamed from: g */
    int m14838g() {
        int i10 = this.f14107p;
        if (i10 == 0) {
            return -1;
        }
        int m14833b = m14833b(this.f14105n, i10, 0);
        if (m14833b < 0 || this.f14106o[m14833b << 1] == null) {
            return m14833b;
        }
        int i11 = m14833b + 1;
        while (i11 < i10 && this.f14105n[i11] == 0) {
            if (this.f14106o[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = m14833b - 1; i12 >= 0 && this.f14105n[i12] == 0; i12--) {
            if (this.f14106o[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v10) {
        int m14837f = m14837f(obj);
        return m14837f >= 0 ? (V) this.f14106o[(m14837f << 1) + 1] : v10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m14839h(Object obj) {
        int i10 = this.f14107p * 2;
        Object[] objArr = this.f14106o;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f14105n;
        Object[] objArr = this.f14106o;
        int i10 = this.f14107p;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            i13 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return i13;
    }

    /* renamed from: i */
    public K m14840i(int i10) {
        return (K) this.f14106o[i10 << 1];
    }

    public boolean isEmpty() {
        return this.f14107p <= 0;
    }

    /* renamed from: j */
    public void m14841j(C3362g<? extends K, ? extends V> c3362g) {
        int i10 = c3362g.f14107p;
        m14835c(this.f14107p + i10);
        if (this.f14107p != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(c3362g.m14840i(i11), c3362g.m14844m(i11));
            }
        } else if (i10 > 0) {
            System.arraycopy(c3362g.f14105n, 0, this.f14105n, 0, i10);
            System.arraycopy(c3362g.f14106o, 0, this.f14106o, 0, i10 << 1);
            this.f14107p = i10;
        }
    }

    /* renamed from: k */
    public V m14842k(int i10) {
        Object[] objArr = this.f14106o;
        int i11 = i10 << 1;
        V v10 = (V) objArr[i11 + 1];
        int i12 = this.f14107p;
        int i13 = 0;
        if (i12 <= 1) {
            m14834d(this.f14105n, objArr, i12);
            this.f14105n = C3358c.f14070a;
            this.f14106o = C3358c.f14072c;
        } else {
            int i14 = i12 - 1;
            int[] iArr = this.f14105n;
            if (iArr.length > 8 && i12 < iArr.length / 3) {
                m14832a(i12 > 8 ? i12 + (i12 >> 1) : 8);
                if (i12 != this.f14107p) {
                    throw new ConcurrentModificationException();
                }
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f14105n, 0, i10);
                    System.arraycopy(objArr, 0, this.f14106o, 0, i11);
                }
                if (i10 < i14) {
                    int i15 = i10 + 1;
                    int i16 = i14 - i10;
                    System.arraycopy(iArr, i15, this.f14105n, i10, i16);
                    System.arraycopy(objArr, i15 << 1, this.f14106o, i11, i16 << 1);
                }
            } else {
                if (i10 < i14) {
                    int i17 = i10 + 1;
                    int i18 = i14 - i10;
                    System.arraycopy(iArr, i17, iArr, i10, i18);
                    Object[] objArr2 = this.f14106o;
                    System.arraycopy(objArr2, i17 << 1, objArr2, i11, i18 << 1);
                }
                Object[] objArr3 = this.f14106o;
                int i19 = i14 << 1;
                objArr3[i19] = null;
                objArr3[i19 + 1] = null;
            }
            i13 = i14;
        }
        if (i12 == this.f14107p) {
            this.f14107p = i13;
            return v10;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: l */
    public V m14843l(int i10, V v10) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f14106o;
        V v11 = (V) objArr[i11];
        objArr[i11] = v10;
        return v11;
    }

    /* renamed from: m */
    public V m14844m(int i10) {
        return (V) this.f14106o[(i10 << 1) + 1];
    }

    public V put(K k10, V v10) {
        int i10;
        int m14836e;
        int i11 = this.f14107p;
        if (k10 == null) {
            m14836e = m14838g();
            i10 = 0;
        } else {
            int hashCode = k10.hashCode();
            i10 = hashCode;
            m14836e = m14836e(k10, hashCode);
        }
        if (m14836e >= 0) {
            int i12 = (m14836e << 1) + 1;
            Object[] objArr = this.f14106o;
            V v11 = (V) objArr[i12];
            objArr[i12] = v10;
            return v11;
        }
        int i13 = ~m14836e;
        int[] iArr = this.f14105n;
        if (i11 >= iArr.length) {
            int i14 = 4;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 >= 4) {
                i14 = 8;
            }
            Object[] objArr2 = this.f14106o;
            m14832a(i14);
            if (i11 == this.f14107p) {
                int[] iArr2 = this.f14105n;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f14106o, 0, objArr2.length);
                }
                m14834d(iArr, objArr2, i11);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i13 < i11) {
            int[] iArr3 = this.f14105n;
            int i15 = i13 + 1;
            System.arraycopy(iArr3, i13, iArr3, i15, i11 - i13);
            Object[] objArr3 = this.f14106o;
            System.arraycopy(objArr3, i13 << 1, objArr3, i15 << 1, (this.f14107p - i13) << 1);
        }
        int i16 = this.f14107p;
        if (i11 == i16) {
            int[] iArr4 = this.f14105n;
            if (i13 < iArr4.length) {
                iArr4[i13] = i10;
                Object[] objArr4 = this.f14106o;
                int i17 = i13 << 1;
                objArr4[i17] = k10;
                objArr4[i17 + 1] = v10;
                this.f14107p = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k10, V v10) {
        V v11 = get(k10);
        return v11 == null ? put(k10, v10) : v11;
    }

    public V remove(Object obj) {
        int m14837f = m14837f(obj);
        if (m14837f >= 0) {
            return m14842k(m14837f);
        }
        return null;
    }

    public V replace(K k10, V v10) {
        int m14837f = m14837f(k10);
        if (m14837f >= 0) {
            return m14843l(m14837f, v10);
        }
        return null;
    }

    public int size() {
        return this.f14107p;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f14107p * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f14107p; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            K m14840i = m14840i(i10);
            if (m14840i != this) {
                sb2.append(m14840i);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V m14844m = m14844m(i10);
            if (m14844m != this) {
                sb2.append(m14844m);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int m14837f = m14837f(obj);
        if (m14837f < 0) {
            return false;
        }
        V m14844m = m14844m(m14837f);
        if (obj2 != m14844m && (obj2 == null || !obj2.equals(m14844m))) {
            return false;
        }
        m14842k(m14837f);
        return true;
    }

    public boolean replace(K k10, V v10, V v11) {
        int m14837f = m14837f(k10);
        if (m14837f < 0) {
            return false;
        }
        V m14844m = m14844m(m14837f);
        if (m14844m != v10 && (v10 == null || !v10.equals(m14844m))) {
            return false;
        }
        m14843l(m14837f, v11);
        return true;
    }

    public C3362g(int i10) {
        if (i10 == 0) {
            this.f14105n = C3358c.f14070a;
            this.f14106o = C3358c.f14072c;
        } else {
            m14832a(i10);
        }
        this.f14107p = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3362g(C3362g<K, V> c3362g) {
        this();
        if (c3362g != 0) {
            m14841j(c3362g);
        }
    }
}
