package p072f5;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import p059e5.C3075g;

/* renamed from: f5.b */
/* loaded from: classes.dex */
public abstract class AbstractC3148b<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: n */
    private static final Object[] f13180n = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    int mo13829c(Object[] objArr, int i10) {
        AbstractC3156j<E> it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Object[] mo13830e() {
        return null;
    }

    /* renamed from: i */
    int mo13831i() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo13832k() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC3156j<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f13180n);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        C3075g.m13551f(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] mo13830e = mo13830e();
            if (mo13830e != null) {
                return (T[]) C3153g.m13853a(mo13830e, mo13832k(), mo13831i(), tArr);
            }
            tArr = (T[]) C3152f.m13852d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo13829c(tArr, 0);
        return tArr;
    }
}
