package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.e7 */
/* loaded from: classes.dex */
final class C1551e7 extends AbstractC1483a7<Boolean> implements RandomAccess, InterfaceC1503ba {

    /* renamed from: q */
    private static final C1551e7 f6761q;

    /* renamed from: o */
    private boolean[] f6762o;

    /* renamed from: p */
    private int f6763p;

    static {
        C1551e7 c1551e7 = new C1551e7(new boolean[0], 0);
        f6761q = c1551e7;
        c1551e7.zzb();
    }

    C1551e7() {
        this(new boolean[10], 0);
    }

    /* renamed from: i */
    private final String m8089i(int i10) {
        int i11 = this.f6763p;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    /* renamed from: k */
    private final void m8090k(int i10) {
        if (i10 < 0 || i10 >= this.f6763p) {
            throw new IndexOutOfBoundsException(m8089i(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m7889c();
        if (i10 >= 0 && i10 <= (i11 = this.f6763p)) {
            boolean[] zArr = this.f6762o;
            if (i11 < zArr.length) {
                System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
            } else {
                boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i10);
                System.arraycopy(this.f6762o, i10, zArr2, i10 + 1, this.f6763p - i10);
                this.f6762o = zArr2;
            }
            this.f6762o[i10] = booleanValue;
            this.f6763p++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m8089i(i10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        m7889c();
        C1860x8.m9009e(collection);
        if (!(collection instanceof C1551e7)) {
            return super.addAll(collection);
        }
        C1551e7 c1551e7 = (C1551e7) collection;
        int i10 = c1551e7.f6763p;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f6763p;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f6762o;
            if (i12 > zArr.length) {
                this.f6762o = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(c1551e7.f6762o, 0, this.f6762o, this.f6763p, c1551e7.f6763p);
            this.f6763p = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void m8091e(boolean z10) {
        m7889c();
        int i10 = this.f6763p;
        boolean[] zArr = this.f6762o;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f6762o = zArr2;
        }
        boolean[] zArr3 = this.f6762o;
        int i11 = this.f6763p;
        this.f6763p = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1551e7)) {
            return super.equals(obj);
        }
        C1551e7 c1551e7 = (C1551e7) obj;
        if (this.f6763p != c1551e7.f6763p) {
            return false;
        }
        boolean[] zArr = c1551e7.f6762o;
        for (int i10 = 0; i10 < this.f6763p; i10++) {
            if (this.f6762o[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1844w8
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ InterfaceC1844w8 mo8008g(int i10) {
        if (i10 >= this.f6763p) {
            return new C1551e7(Arrays.copyOf(this.f6762o, i10), this.f6763p);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m8090k(i10);
        return Boolean.valueOf(this.f6762o[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f6763p; i11++) {
            i10 = (i10 * 31) + C1860x8.m9005a(this.f6762o[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f6763p;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f6762o[i11] == booleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m7889c();
        m8090k(i10);
        boolean[] zArr = this.f6762o;
        boolean z10 = zArr[i10];
        if (i10 < this.f6763p - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f6763p--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        m7889c();
        if (i11 >= i10) {
            boolean[] zArr = this.f6762o;
            System.arraycopy(zArr, i11, zArr, i10, this.f6763p - i11);
            this.f6763p -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m7889c();
        m8090k(i10);
        boolean[] zArr = this.f6762o;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6763p;
    }

    private C1551e7(boolean[] zArr, int i10) {
        this.f6762o = zArr;
        this.f6763p = i10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m8091e(((Boolean) obj).booleanValue());
        return true;
    }
}
