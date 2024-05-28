package p271v3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: v3.h */
/* loaded from: classes.dex */
public abstract class AbstractC4955h<E> extends AbstractC4949e<E> implements List<E>, RandomAccess {

    /* renamed from: o */
    private static final AbstractC4963l<Object> f19021o = new C4951f(C4959j.f19028r, 0);

    /* renamed from: m */
    static <E> AbstractC4955h<E> m19377m(Object[] objArr, int i10) {
        if (i10 == 0) {
            return (AbstractC4955h<E>) C4959j.f19028r;
        }
        return new C4959j(objArr, i10);
    }

    /* renamed from: o */
    public static <E> AbstractC4955h<E> m19378o(E e10) {
        Object[] objArr = {e10};
        C4957i.m19381a(objArr, 1);
        return m19377m(objArr, 1);
    }

    /* renamed from: p */
    public static <E> AbstractC4955h<E> m19379p(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18) {
        Object[] objArr = {e10, e11, e12, e13, e14, e15, e16, e17, e18};
        C4957i.m19381a(objArr, 9);
        return m19377m(objArr, 9);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p271v3.AbstractC4949e
    /* renamed from: c */
    int mo19370c(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = get(i11);
        }
        return size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (C4962k0.m19385a(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !C4962k0.m19385a(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    @Override // java.util.List
    public final int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC4955h<E> subList(int i10, int i11) {
        C4964l0.m19388c(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return (AbstractC4955h<E>) C4959j.f19028r;
        }
        return new C4953g(this, i10, i12);
    }

    @Override // java.util.List
    public final int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final AbstractC4963l<E> listIterator(int i10) {
        C4964l0.m19387b(i10, size(), "index");
        return isEmpty() ? (AbstractC4963l<E>) f19021o : new C4951f(this, i10);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }
}
