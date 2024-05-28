package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.play_billing.r5 */
/* loaded from: classes.dex */
public abstract class AbstractC2024r5 extends AbstractC2003o5 implements List, RandomAccess {

    /* renamed from: o */
    private static final AbstractC1962j f7778o = new C2010p5(C1906b.f7629s, 0);

    /* renamed from: p */
    public static final /* synthetic */ int f7779p = 0;

    /* renamed from: q */
    public static AbstractC2024r5 m9558q(Object[] objArr, int i10) {
        if (i10 == 0) {
            return C1906b.f7629s;
        }
        return new C1906b(objArr, i10);
    }

    /* renamed from: r */
    public static AbstractC2024r5 m9559r(Collection collection) {
        if (collection instanceof AbstractC2003o5) {
            AbstractC2024r5 mo9319k = ((AbstractC2003o5) collection).mo9319k();
            if (!mo9319k.mo9240m()) {
                return mo9319k;
            }
            Object[] array = mo9319k.toArray();
            return m9558q(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (array2[i10] == null) {
                throw new NullPointerException("at index " + i10);
            }
        }
        return m9558q(array2, length);
    }

    /* renamed from: s */
    public static AbstractC2024r5 m9560s() {
        return C1906b.f7629s;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC2003o5
    /* renamed from: c */
    public int mo9237c(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = get(i11);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2003o5, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (C1961i5.m9399a(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !C1961i5.m9399a(it.next(), it2.next())) {
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
    public final int indexOf(Object obj) {
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

    @Override // com.google.android.gms.internal.play_billing.AbstractC2003o5, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2003o5
    @Deprecated
    /* renamed from: k */
    public final AbstractC2024r5 mo9319k() {
        return this;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2003o5
    /* renamed from: l */
    public final AbstractC1955i iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
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
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: p */
    public AbstractC2024r5 subList(int i10, int i11) {
        C1968j5.m9473d(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return C1906b.f7629s;
        }
        return new C2017q5(this, i10, i12);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: u */
    public final AbstractC1962j listIterator(int i10) {
        C1968j5.m9471b(i10, size(), "index");
        return isEmpty() ? f7778o : new C2010p5(this, i10);
    }
}
