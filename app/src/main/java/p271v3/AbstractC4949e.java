package p271v3;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: v3.e */
/* loaded from: classes.dex */
public abstract class AbstractC4949e<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: n */
    private static final Object[] f19015n = new Object[0];

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
    abstract int mo19370c(Object[] objArr, int i10);

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    abstract int mo19371e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract int mo19372i();

    /* JADX INFO: Access modifiers changed from: package-private */
    @NullableDecl
    /* renamed from: k */
    public abstract Object[] mo19373k();

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
        return toArray(f19015n);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        Objects.requireNonNull(tArr);
        int size = size();
        int length = tArr.length;
        if (length < size) {
            Object[] mo19373k = mo19373k();
            if (mo19373k == null) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            } else {
                return (T[]) Arrays.copyOfRange(mo19373k, mo19372i(), mo19371e(), tArr.getClass());
            }
        } else if (length > size) {
            tArr[size] = null;
        }
        mo19370c(tArr, 0);
        return tArr;
    }
}
