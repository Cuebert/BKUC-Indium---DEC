package p093h0;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: h0.b */
/* loaded from: classes.dex */
public final class C3357b<E> implements Collection<E>, Set<E> {

    /* renamed from: r */
    private static final int[] f14059r = new int[0];

    /* renamed from: s */
    private static final Object[] f14060s = new Object[0];

    /* renamed from: t */
    private static Object[] f14061t;

    /* renamed from: u */
    private static int f14062u;

    /* renamed from: v */
    private static Object[] f14063v;

    /* renamed from: w */
    private static int f14064w;

    /* renamed from: n */
    private int[] f14065n;

    /* renamed from: o */
    Object[] f14066o;

    /* renamed from: p */
    int f14067p;

    /* renamed from: q */
    private AbstractC3361f<E, E> f14068q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h0.b$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC3361f<E, E> {
        a() {
        }

        @Override // p093h0.AbstractC3361f
        /* renamed from: a */
        protected void mo14778a() {
            C3357b.this.clear();
        }

        @Override // p093h0.AbstractC3361f
        /* renamed from: b */
        protected Object mo14779b(int i10, int i11) {
            return C3357b.this.f14066o[i10];
        }

        @Override // p093h0.AbstractC3361f
        /* renamed from: c */
        protected Map<E, E> mo14780c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // p093h0.AbstractC3361f
        /* renamed from: d */
        protected int mo14781d() {
            return C3357b.this.f14067p;
        }

        @Override // p093h0.AbstractC3361f
        /* renamed from: e */
        protected int mo14782e(Object obj) {
            return C3357b.this.indexOf(obj);
        }

        @Override // p093h0.AbstractC3361f
        /* renamed from: f */
        protected int mo14783f(Object obj) {
            return C3357b.this.indexOf(obj);
        }

        @Override // p093h0.AbstractC3361f
        /* renamed from: g */
        protected void mo14784g(E e10, E e11) {
            C3357b.this.add(e10);
        }

        @Override // p093h0.AbstractC3361f
        /* renamed from: h */
        protected void mo14785h(int i10) {
            C3357b.this.m14793o(i10);
        }

        @Override // p093h0.AbstractC3361f
        /* renamed from: i */
        protected E mo14786i(int i10, E e10) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public C3357b() {
        this(0);
    }

    /* renamed from: c */
    private void m14787c(int i10) {
        if (i10 == 8) {
            synchronized (C3357b.class) {
                Object[] objArr = f14063v;
                if (objArr != null) {
                    this.f14066o = objArr;
                    f14063v = (Object[]) objArr[0];
                    this.f14065n = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f14064w--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (C3357b.class) {
                Object[] objArr2 = f14061t;
                if (objArr2 != null) {
                    this.f14066o = objArr2;
                    f14061t = (Object[]) objArr2[0];
                    this.f14065n = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f14062u--;
                    return;
                }
            }
        }
        this.f14065n = new int[i10];
        this.f14066o = new Object[i10];
    }

    /* renamed from: i */
    private static void m14788i(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (C3357b.class) {
                if (f14064w < 10) {
                    objArr[0] = f14063v;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f14063v = objArr;
                    f14064w++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C3357b.class) {
                if (f14062u < 10) {
                    objArr[0] = f14061t;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f14061t = objArr;
                    f14062u++;
                }
            }
        }
    }

    /* renamed from: k */
    private AbstractC3361f<E, E> m14789k() {
        if (this.f14068q == null) {
            this.f14068q = new a();
        }
        return this.f14068q;
    }

    /* renamed from: l */
    private int m14790l(Object obj, int i10) {
        int i11 = this.f14067p;
        if (i11 == 0) {
            return -1;
        }
        int m14795a = C3358c.m14795a(this.f14065n, i11, i10);
        if (m14795a < 0 || obj.equals(this.f14066o[m14795a])) {
            return m14795a;
        }
        int i12 = m14795a + 1;
        while (i12 < i11 && this.f14065n[i12] == i10) {
            if (obj.equals(this.f14066o[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = m14795a - 1; i13 >= 0 && this.f14065n[i13] == i10; i13--) {
            if (obj.equals(this.f14066o[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    /* renamed from: m */
    private int m14791m() {
        int i10 = this.f14067p;
        if (i10 == 0) {
            return -1;
        }
        int m14795a = C3358c.m14795a(this.f14065n, i10, 0);
        if (m14795a < 0 || this.f14066o[m14795a] == null) {
            return m14795a;
        }
        int i11 = m14795a + 1;
        while (i11 < i10 && this.f14065n[i11] == 0) {
            if (this.f14066o[i11] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = m14795a - 1; i12 >= 0 && this.f14065n[i12] == 0; i12--) {
            if (this.f14066o[i12] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int i10;
        int m14790l;
        if (e10 == null) {
            m14790l = m14791m();
            i10 = 0;
        } else {
            int hashCode = e10.hashCode();
            i10 = hashCode;
            m14790l = m14790l(e10, hashCode);
        }
        if (m14790l >= 0) {
            return false;
        }
        int i11 = ~m14790l;
        int i12 = this.f14067p;
        int[] iArr = this.f14065n;
        if (i12 >= iArr.length) {
            int i13 = 4;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 >= 4) {
                i13 = 8;
            }
            Object[] objArr = this.f14066o;
            m14787c(i13);
            int[] iArr2 = this.f14065n;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f14066o, 0, objArr.length);
            }
            m14788i(iArr, objArr, this.f14067p);
        }
        int i14 = this.f14067p;
        if (i11 < i14) {
            int[] iArr3 = this.f14065n;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.f14066o;
            System.arraycopy(objArr2, i11, objArr2, i15, this.f14067p - i11);
        }
        this.f14065n[i11] = i10;
        this.f14066o[i11] = e10;
        this.f14067p++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        m14792e(this.f14067p + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= add(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i10 = this.f14067p;
        if (i10 != 0) {
            m14788i(this.f14065n, this.f14066o, i10);
            this.f14065n = f14059r;
            this.f14066o = f14060s;
            this.f14067p = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public void m14792e(int i10) {
        int[] iArr = this.f14065n;
        if (iArr.length < i10) {
            Object[] objArr = this.f14066o;
            m14787c(i10);
            int i11 = this.f14067p;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.f14065n, 0, i11);
                System.arraycopy(objArr, 0, this.f14066o, 0, this.f14067p);
            }
            m14788i(iArr, objArr, this.f14067p);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f14067p; i10++) {
                try {
                    if (!set.contains(m14794p(i10))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f14065n;
        int i10 = this.f14067p;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public int indexOf(Object obj) {
        return obj == null ? m14791m() : m14790l(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f14067p <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return m14789k().m14826m().iterator();
    }

    /* renamed from: o */
    public E m14793o(int i10) {
        Object[] objArr = this.f14066o;
        E e10 = (E) objArr[i10];
        int i11 = this.f14067p;
        if (i11 <= 1) {
            m14788i(this.f14065n, objArr, i11);
            this.f14065n = f14059r;
            this.f14066o = f14060s;
            this.f14067p = 0;
        } else {
            int[] iArr = this.f14065n;
            if (iArr.length > 8 && i11 < iArr.length / 3) {
                m14787c(i11 > 8 ? i11 + (i11 >> 1) : 8);
                this.f14067p--;
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f14065n, 0, i10);
                    System.arraycopy(objArr, 0, this.f14066o, 0, i10);
                }
                int i12 = this.f14067p;
                if (i10 < i12) {
                    int i13 = i10 + 1;
                    System.arraycopy(iArr, i13, this.f14065n, i10, i12 - i10);
                    System.arraycopy(objArr, i13, this.f14066o, i10, this.f14067p - i10);
                }
            } else {
                int i14 = i11 - 1;
                this.f14067p = i14;
                if (i10 < i14) {
                    int i15 = i10 + 1;
                    System.arraycopy(iArr, i15, iArr, i10, i14 - i10);
                    Object[] objArr2 = this.f14066o;
                    System.arraycopy(objArr2, i15, objArr2, i10, this.f14067p - i10);
                }
                this.f14066o[this.f14067p] = null;
            }
        }
        return e10;
    }

    /* renamed from: p */
    public E m14794p(int i10) {
        return (E) this.f14066o[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        m14793o(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.f14067p - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f14066o[i10])) {
                m14793o(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f14067p;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i10 = this.f14067p;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f14066o, 0, objArr, 0, i10);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f14067p * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f14067p; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            E m14794p = m14794p(i10);
            if (m14794p != this) {
                sb2.append(m14794p);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public C3357b(int i10) {
        if (i10 == 0) {
            this.f14065n = f14059r;
            this.f14066o = f14060s;
        } else {
            m14787c(i10);
        }
        this.f14067p = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f14067p) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f14067p));
        }
        System.arraycopy(this.f14066o, 0, tArr, 0, this.f14067p);
        int length = tArr.length;
        int i10 = this.f14067p;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }
}
