package ua;

import gb.C3328f;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;

/* renamed from: ua.d */
/* loaded from: classes.dex */
public final class C4879d<E> extends AbstractC4877c<E> {

    /* renamed from: q */
    public static final a f18772q = new a(null);

    /* renamed from: r */
    private static final Object[] f18773r = new Object[0];

    /* renamed from: n */
    private int f18774n;

    /* renamed from: o */
    private Object[] f18775o = f18773r;

    /* renamed from: p */
    private int f18776p;

    /* renamed from: ua.d$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }

        /* renamed from: a */
        public final int m19103a(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            return i12 - 2147483639 > 0 ? i11 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i12;
        }
    }

    /* renamed from: l */
    private final void m19091l(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f18775o.length;
        while (i10 < length && it.hasNext()) {
            this.f18775o[i10] = it.next();
            i10++;
        }
        int i11 = this.f18774n;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f18775o[i12] = it.next();
        }
        this.f18776p = size() + collection.size();
    }

    /* renamed from: m */
    private final void m19092m(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f18775o;
        C4887h.m19118c(objArr2, objArr, 0, this.f18774n, objArr2.length);
        Object[] objArr3 = this.f18775o;
        int length = objArr3.length;
        int i11 = this.f18774n;
        C4887h.m19118c(objArr3, objArr, length - i11, 0, i11);
        this.f18774n = 0;
        this.f18775o = objArr;
    }

    /* renamed from: o */
    private final int m19093o(int i10) {
        return i10 == 0 ? C4889i.m19122f(this.f18775o) : i10 - 1;
    }

    /* renamed from: p */
    private final void m19094p(int i10) {
        int m14622a;
        if (i10 >= 0) {
            Object[] objArr = this.f18775o;
            if (i10 <= objArr.length) {
                return;
            }
            if (objArr == f18773r) {
                m14622a = C3328f.m14622a(i10, 10);
                this.f18775o = new Object[m14622a];
                return;
            } else {
                m19092m(f18772q.m19103a(objArr.length, i10));
                return;
            }
        }
        throw new IllegalStateException("Deque is too big.");
    }

    /* renamed from: q */
    private final int m19095q(int i10) {
        if (i10 == C4889i.m19122f(this.f18775o)) {
            return 0;
        }
        return i10 + 1;
    }

    /* renamed from: r */
    private final int m19096r(int i10) {
        return i10 < 0 ? i10 + this.f18775o.length : i10;
    }

    /* renamed from: s */
    private final int m19097s(int i10) {
        Object[] objArr = this.f18775o;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        m19099k(e10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        C3844i.m16253f(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        m19094p(size() + elements.size());
        m19091l(m19097s(this.f18774n + size()), elements);
        return true;
    }

    @Override // ua.AbstractC4877c
    /* renamed from: c */
    public int mo19086c() {
        return this.f18776p;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int m19097s = m19097s(this.f18774n + size());
        int i10 = this.f18774n;
        if (i10 < m19097s) {
            C4887h.m19120e(this.f18775o, null, i10, m19097s);
        } else if (!isEmpty()) {
            Object[] objArr = this.f18775o;
            C4887h.m19120e(objArr, null, this.f18774n, objArr.length);
            C4887h.m19120e(this.f18775o, null, 0, m19097s);
        }
        this.f18774n = 0;
        this.f18776p = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // ua.AbstractC4877c
    /* renamed from: e */
    public E mo19087e(int i10) {
        AbstractC4875b.f18771n.m19084a(i10, size());
        if (i10 == C4895m.m19140c(this)) {
            return m19102w();
        }
        if (i10 == 0) {
            return m19100u();
        }
        int m19097s = m19097s(this.f18774n + i10);
        E e10 = (E) this.f18775o[m19097s];
        if (i10 < (size() >> 1)) {
            int i11 = this.f18774n;
            if (m19097s >= i11) {
                Object[] objArr = this.f18775o;
                C4887h.m19118c(objArr, objArr, i11 + 1, i11, m19097s);
            } else {
                Object[] objArr2 = this.f18775o;
                C4887h.m19118c(objArr2, objArr2, 1, 0, m19097s);
                Object[] objArr3 = this.f18775o;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f18774n;
                C4887h.m19118c(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f18775o;
            int i13 = this.f18774n;
            objArr4[i13] = null;
            this.f18774n = m19095q(i13);
        } else {
            int m19097s2 = m19097s(this.f18774n + C4895m.m19140c(this));
            if (m19097s <= m19097s2) {
                Object[] objArr5 = this.f18775o;
                C4887h.m19118c(objArr5, objArr5, m19097s, m19097s + 1, m19097s2 + 1);
            } else {
                Object[] objArr6 = this.f18775o;
                C4887h.m19118c(objArr6, objArr6, m19097s, m19097s + 1, objArr6.length);
                Object[] objArr7 = this.f18775o;
                objArr7[objArr7.length - 1] = objArr7[0];
                C4887h.m19118c(objArr7, objArr7, 0, 1, m19097s2 + 1);
            }
            this.f18775o[m19097s2] = null;
        }
        this.f18776p = size() - 1;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        AbstractC4875b.f18771n.m19084a(i10, size());
        return (E) this.f18775o[m19097s(this.f18774n + i10)];
    }

    /* renamed from: i */
    public final void m19098i(E e10) {
        m19094p(size() + 1);
        int m19093o = m19093o(this.f18774n);
        this.f18774n = m19093o;
        this.f18775o[m19093o] = e10;
        this.f18776p = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i10;
        int m19097s = m19097s(this.f18774n + size());
        int i11 = this.f18774n;
        if (i11 < m19097s) {
            while (i11 < m19097s) {
                if (C3844i.m16248a(obj, this.f18775o[i11])) {
                    i10 = this.f18774n;
                } else {
                    i11++;
                }
            }
            return -1;
        }
        if (i11 < m19097s) {
            return -1;
        }
        int length = this.f18775o.length;
        while (true) {
            if (i11 >= length) {
                for (int i12 = 0; i12 < m19097s; i12++) {
                    if (C3844i.m16248a(obj, this.f18775o[i12])) {
                        i11 = i12 + this.f18775o.length;
                        i10 = this.f18774n;
                    }
                }
                return -1;
            }
            if (C3844i.m16248a(obj, this.f18775o[i11])) {
                i10 = this.f18774n;
                break;
            }
            i11++;
        }
        return i11 - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: k */
    public final void m19099k(E e10) {
        m19094p(size() + 1);
        this.f18775o[m19097s(this.f18774n + size())] = e10;
        this.f18776p = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int m19122f;
        int i10;
        int m19097s = m19097s(this.f18774n + size());
        int i11 = this.f18774n;
        if (i11 < m19097s) {
            m19122f = m19097s - 1;
            if (i11 <= m19122f) {
                while (!C3844i.m16248a(obj, this.f18775o[m19122f])) {
                    if (m19122f != i11) {
                        m19122f--;
                    }
                }
                i10 = this.f18774n;
                return m19122f - i10;
            }
            return -1;
        }
        if (i11 > m19097s) {
            int i12 = m19097s - 1;
            while (true) {
                if (-1 < i12) {
                    if (C3844i.m16248a(obj, this.f18775o[i12])) {
                        m19122f = i12 + this.f18775o.length;
                        i10 = this.f18774n;
                        break;
                    }
                    i12--;
                } else {
                    m19122f = C4889i.m19122f(this.f18775o);
                    int i13 = this.f18774n;
                    if (i13 <= m19122f) {
                        while (!C3844i.m16248a(obj, this.f18775o[m19122f])) {
                            if (m19122f != i13) {
                                m19122f--;
                            }
                        }
                        i10 = this.f18774n;
                    }
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        int m19097s;
        C3844i.m16253f(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if (!(this.f18775o.length == 0)) {
                int m19097s2 = m19097s(this.f18774n + size());
                int i10 = this.f18774n;
                if (i10 < m19097s2) {
                    m19097s = i10;
                    while (i10 < m19097s2) {
                        Object obj = this.f18775o[i10];
                        if (!elements.contains(obj)) {
                            this.f18775o[m19097s] = obj;
                            m19097s++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    C4887h.m19120e(this.f18775o, null, m19097s, m19097s2);
                } else {
                    int length = this.f18775o.length;
                    int i11 = i10;
                    boolean z11 = false;
                    while (i10 < length) {
                        Object[] objArr = this.f18775o;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (!elements.contains(obj2)) {
                            this.f18775o[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    m19097s = m19097s(i11);
                    for (int i12 = 0; i12 < m19097s2; i12++) {
                        Object[] objArr2 = this.f18775o;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (!elements.contains(obj3)) {
                            this.f18775o[m19097s] = obj3;
                            m19097s = m19095q(m19097s);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    this.f18776p = m19096r(m19097s - this.f18774n);
                }
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        int m19097s;
        C3844i.m16253f(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if (!(this.f18775o.length == 0)) {
                int m19097s2 = m19097s(this.f18774n + size());
                int i10 = this.f18774n;
                if (i10 < m19097s2) {
                    m19097s = i10;
                    while (i10 < m19097s2) {
                        Object obj = this.f18775o[i10];
                        if (elements.contains(obj)) {
                            this.f18775o[m19097s] = obj;
                            m19097s++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    C4887h.m19120e(this.f18775o, null, m19097s, m19097s2);
                } else {
                    int length = this.f18775o.length;
                    int i11 = i10;
                    boolean z11 = false;
                    while (i10 < length) {
                        Object[] objArr = this.f18775o;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (elements.contains(obj2)) {
                            this.f18775o[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    m19097s = m19097s(i11);
                    for (int i12 = 0; i12 < m19097s2; i12++) {
                        Object[] objArr2 = this.f18775o;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (elements.contains(obj3)) {
                            this.f18775o[m19097s] = obj3;
                            m19097s = m19095q(m19097s);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    this.f18776p = m19096r(m19097s - this.f18774n);
                }
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        AbstractC4875b.f18771n.m19084a(i10, size());
        int m19097s = m19097s(this.f18774n + i10);
        Object[] objArr = this.f18775o;
        E e11 = (E) objArr[m19097s];
        objArr[m19097s] = e10;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        C3844i.m16253f(array, "array");
        if (array.length < size()) {
            array = (T[]) C4883f.m19114a(array, size());
        }
        int m19097s = m19097s(this.f18774n + size());
        int i10 = this.f18774n;
        if (i10 < m19097s) {
            C4887h.m19119d(this.f18775o, array, 0, i10, m19097s, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f18775o;
            C4887h.m19118c(objArr, array, 0, this.f18774n, objArr.length);
            Object[] objArr2 = this.f18775o;
            C4887h.m19118c(objArr2, array, objArr2.length - this.f18774n, 0, m19097s);
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        return array;
    }

    /* renamed from: u */
    public final E m19100u() {
        if (!isEmpty()) {
            Object[] objArr = this.f18775o;
            int i10 = this.f18774n;
            E e10 = (E) objArr[i10];
            objArr[i10] = null;
            this.f18774n = m19095q(i10);
            this.f18776p = size() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    /* renamed from: v */
    public final E m19101v() {
        if (isEmpty()) {
            return null;
        }
        return m19100u();
    }

    /* renamed from: w */
    public final E m19102w() {
        if (!isEmpty()) {
            int m19097s = m19097s(this.f18774n + C4895m.m19140c(this));
            Object[] objArr = this.f18775o;
            E e10 = (E) objArr[m19097s];
            objArr[m19097s] = null;
            this.f18776p = size() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        AbstractC4875b.f18771n.m19085b(i10, size());
        if (i10 == size()) {
            m19099k(e10);
            return;
        }
        if (i10 == 0) {
            m19098i(e10);
            return;
        }
        m19094p(size() + 1);
        int m19097s = m19097s(this.f18774n + i10);
        if (i10 < ((size() + 1) >> 1)) {
            int m19093o = m19093o(m19097s);
            int m19093o2 = m19093o(this.f18774n);
            int i11 = this.f18774n;
            if (m19093o >= i11) {
                Object[] objArr = this.f18775o;
                objArr[m19093o2] = objArr[i11];
                C4887h.m19118c(objArr, objArr, i11, i11 + 1, m19093o + 1);
            } else {
                Object[] objArr2 = this.f18775o;
                C4887h.m19118c(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                Object[] objArr3 = this.f18775o;
                objArr3[objArr3.length - 1] = objArr3[0];
                C4887h.m19118c(objArr3, objArr3, 0, 1, m19093o + 1);
            }
            this.f18775o[m19093o] = e10;
            this.f18774n = m19093o2;
        } else {
            int m19097s2 = m19097s(this.f18774n + size());
            if (m19097s < m19097s2) {
                Object[] objArr4 = this.f18775o;
                C4887h.m19118c(objArr4, objArr4, m19097s + 1, m19097s, m19097s2);
            } else {
                Object[] objArr5 = this.f18775o;
                C4887h.m19118c(objArr5, objArr5, 1, 0, m19097s2);
                Object[] objArr6 = this.f18775o;
                objArr6[0] = objArr6[objArr6.length - 1];
                C4887h.m19118c(objArr6, objArr6, m19097s + 1, m19097s, objArr6.length - 1);
            }
            this.f18775o[m19097s] = e10;
        }
        this.f18776p = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> elements) {
        C3844i.m16253f(elements, "elements");
        AbstractC4875b.f18771n.m19085b(i10, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(elements);
        }
        m19094p(size() + elements.size());
        int m19097s = m19097s(this.f18774n + size());
        int m19097s2 = m19097s(this.f18774n + i10);
        int size = elements.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f18774n;
            int i12 = i11 - size;
            if (m19097s2 < i11) {
                Object[] objArr = this.f18775o;
                C4887h.m19118c(objArr, objArr, i12, i11, objArr.length);
                if (size >= m19097s2) {
                    Object[] objArr2 = this.f18775o;
                    C4887h.m19118c(objArr2, objArr2, objArr2.length - size, 0, m19097s2);
                } else {
                    Object[] objArr3 = this.f18775o;
                    C4887h.m19118c(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f18775o;
                    C4887h.m19118c(objArr4, objArr4, 0, size, m19097s2);
                }
            } else if (i12 >= 0) {
                Object[] objArr5 = this.f18775o;
                C4887h.m19118c(objArr5, objArr5, i12, i11, m19097s2);
            } else {
                Object[] objArr6 = this.f18775o;
                i12 += objArr6.length;
                int i13 = m19097s2 - i11;
                int length = objArr6.length - i12;
                if (length >= i13) {
                    C4887h.m19118c(objArr6, objArr6, i12, i11, m19097s2);
                } else {
                    C4887h.m19118c(objArr6, objArr6, i12, i11, i11 + length);
                    Object[] objArr7 = this.f18775o;
                    C4887h.m19118c(objArr7, objArr7, 0, this.f18774n + length, m19097s2);
                }
            }
            this.f18774n = i12;
            m19091l(m19096r(m19097s2 - size), elements);
        } else {
            int i14 = m19097s2 + size;
            if (m19097s2 < m19097s) {
                int i15 = size + m19097s;
                Object[] objArr8 = this.f18775o;
                if (i15 <= objArr8.length) {
                    C4887h.m19118c(objArr8, objArr8, i14, m19097s2, m19097s);
                } else if (i14 >= objArr8.length) {
                    C4887h.m19118c(objArr8, objArr8, i14 - objArr8.length, m19097s2, m19097s);
                } else {
                    int length2 = m19097s - (i15 - objArr8.length);
                    C4887h.m19118c(objArr8, objArr8, 0, length2, m19097s);
                    Object[] objArr9 = this.f18775o;
                    C4887h.m19118c(objArr9, objArr9, i14, m19097s2, length2);
                }
            } else {
                Object[] objArr10 = this.f18775o;
                C4887h.m19118c(objArr10, objArr10, size, 0, m19097s);
                Object[] objArr11 = this.f18775o;
                if (i14 >= objArr11.length) {
                    C4887h.m19118c(objArr11, objArr11, i14 - objArr11.length, m19097s2, objArr11.length);
                } else {
                    C4887h.m19118c(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f18775o;
                    C4887h.m19118c(objArr12, objArr12, i14, m19097s2, objArr12.length - size);
                }
            }
            m19091l(m19097s2, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
