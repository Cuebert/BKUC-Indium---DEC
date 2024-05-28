package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.q8 */
/* loaded from: classes.dex */
final class C1748q8 extends AbstractC1483a7<Integer> implements RandomAccess, InterfaceC1812u8, InterfaceC1503ba {

    /* renamed from: q */
    private static final C1748q8 f7181q;

    /* renamed from: o */
    private int[] f7182o;

    /* renamed from: p */
    private int f7183p;

    static {
        C1748q8 c1748q8 = new C1748q8(new int[0], 0);
        f7181q = c1748q8;
        c1748q8.zzb();
    }

    C1748q8() {
        this(new int[10], 0);
    }

    /* renamed from: i */
    public static C1748q8 m8729i() {
        return f7181q;
    }

    /* renamed from: l */
    private final String m8730l(int i10) {
        int i11 = this.f7183p;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    /* renamed from: m */
    private final void m8731m(int i10) {
        if (i10 < 0 || i10 >= this.f7183p) {
            throw new IndexOutOfBoundsException(m8730l(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        m7889c();
        if (i10 >= 0 && i10 <= (i11 = this.f7183p)) {
            int[] iArr = this.f7182o;
            if (i11 < iArr.length) {
                System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
            } else {
                int[] iArr2 = new int[((i11 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i10);
                System.arraycopy(this.f7182o, i10, iArr2, i10 + 1, this.f7183p - i10);
                this.f7182o = iArr2;
            }
            this.f7182o[i10] = intValue;
            this.f7183p++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m8730l(i10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        m7889c();
        C1860x8.m9009e(collection);
        if (!(collection instanceof C1748q8)) {
            return super.addAll(collection);
        }
        C1748q8 c1748q8 = (C1748q8) collection;
        int i10 = c1748q8.f7183p;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f7183p;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f7182o;
            if (i12 > iArr.length) {
                this.f7182o = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(c1748q8.f7182o, 0, this.f7182o, this.f7183p, c1748q8.f7183p);
            this.f7183p = i12;
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
    public final int m8732e(int i10) {
        m8731m(i10);
        return this.f7182o[i10];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1748q8)) {
            return super.equals(obj);
        }
        C1748q8 c1748q8 = (C1748q8) obj;
        if (this.f7183p != c1748q8.f7183p) {
            return false;
        }
        int[] iArr = c1748q8.f7182o;
        for (int i10 = 0; i10 < this.f7183p; i10++) {
            if (this.f7182o[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m8731m(i10);
        return Integer.valueOf(this.f7182o[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f7183p; i11++) {
            i10 = (i10 * 31) + this.f7182o[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i10 = this.f7183p;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f7182o[i11] == intValue) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void m8733k(int i10) {
        m7889c();
        int i11 = this.f7183p;
        int[] iArr = this.f7182o;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f7182o = iArr2;
        }
        int[] iArr3 = this.f7182o;
        int i12 = this.f7183p;
        this.f7183p = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m7889c();
        m8731m(i10);
        int[] iArr = this.f7182o;
        int i11 = iArr[i10];
        if (i10 < this.f7183p - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f7183p--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        m7889c();
        if (i11 >= i10) {
            int[] iArr = this.f7182o;
            System.arraycopy(iArr, i11, iArr, i10, this.f7183p - i11);
            this.f7183p -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m7889c();
        m8731m(i10);
        int[] iArr = this.f7182o;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7183p;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1844w8
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final InterfaceC1812u8 mo8008g(int i10) {
        if (i10 >= this.f7183p) {
            return new C1748q8(Arrays.copyOf(this.f7182o, i10), this.f7183p);
        }
        throw new IllegalArgumentException();
    }

    private C1748q8(int[] iArr, int i10) {
        this.f7182o = iArr;
        this.f7183p = i10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m8733k(((Integer) obj).intValue());
        return true;
    }
}
