package p246t3;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* renamed from: t3.w */
/* loaded from: classes.dex */
public abstract class AbstractC4715w extends AbstractCollection implements Serializable {

    /* renamed from: n */
    private static final Object[] f18519n = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo18719c(Object[] objArr, int i10) {
        AbstractC4635c1 mo18720k = mo18720k();
        int i11 = 0;
        while (mo18720k.hasNext()) {
            objArr[i11] = mo18720k.next();
            i11++;
        }
        return i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public abstract boolean contains(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo18813e() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo18814i() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: k */
    public abstract AbstractC4635c1 mo18720k();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public Object[] mo18815l() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f18519n);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Objects.requireNonNull(objArr);
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] mo18815l = mo18815l();
            if (mo18815l == null) {
                if (length != 0) {
                    objArr = Arrays.copyOf(objArr, 0);
                }
                objArr = Arrays.copyOf(objArr, size);
            } else {
                return Arrays.copyOfRange(mo18815l, mo18814i(), mo18813e(), objArr.getClass());
            }
        } else if (length > size) {
            objArr[size] = null;
        }
        mo18719c(objArr, 0);
        return objArr;
    }
}
