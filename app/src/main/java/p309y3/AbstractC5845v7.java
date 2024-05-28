package p309y3;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* renamed from: y3.v7 */
/* loaded from: classes.dex */
public abstract class AbstractC5845v7<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: n */
    private static final Object[] f21402n = new Object[0];

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
    abstract int mo20660c(Object[] objArr, int i10);

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    abstract int mo20661e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract int mo20662i();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract Object[] mo20663k();

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
        return toArray(f21402n);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        Objects.requireNonNull(tArr);
        int size = size();
        int length = tArr.length;
        if (length < size) {
            Object[] mo20663k = mo20663k();
            if (mo20663k == null) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            } else {
                return (T[]) Arrays.copyOfRange(mo20663k, mo20662i(), mo20661e(), tArr.getClass());
            }
        } else if (length > size) {
            tArr[size] = null;
        }
        mo20660c(tArr, 0);
        return tArr;
    }
}
