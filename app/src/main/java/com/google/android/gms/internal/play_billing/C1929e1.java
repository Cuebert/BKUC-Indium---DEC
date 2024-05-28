package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.play_billing.e1 */
/* loaded from: classes.dex */
final class C1929e1 extends AbstractC1983m implements RandomAccess, InterfaceC1993n2 {

    /* renamed from: q */
    private static final C1929e1 f7651q = new C1929e1(new int[0], 0, false);

    /* renamed from: o */
    private int[] f7652o;

    /* renamed from: p */
    private int f7653p;

    C1929e1() {
        this(new int[10], 0, true);
    }

    /* renamed from: k */
    private final String m9321k(int i10) {
        return "Index:" + i10 + ", Size:" + this.f7653p;
    }

    /* renamed from: l */
    private final void m9322l(int i10) {
        if (i10 < 0 || i10 >= this.f7653p) {
            throw new IndexOutOfBoundsException(m9321k(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        m9499c();
        if (i10 >= 0 && i10 <= (i11 = this.f7653p)) {
            int[] iArr = this.f7652o;
            if (i11 < iArr.length) {
                System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
            } else {
                int[] iArr2 = new int[((i11 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i10);
                System.arraycopy(this.f7652o, i10, iArr2, i10 + 1, this.f7653p - i10);
                this.f7652o = iArr2;
            }
            this.f7652o[i10] = intValue;
            this.f7653p++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m9321k(i10));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1983m, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m9499c();
        byte[] bArr = C1950h1.f7678d;
        Objects.requireNonNull(collection);
        if (!(collection instanceof C1929e1)) {
            return super.addAll(collection);
        }
        C1929e1 c1929e1 = (C1929e1) collection;
        int i10 = c1929e1.f7653p;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f7653p;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f7652o;
            if (i12 > iArr.length) {
                this.f7652o = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(c1929e1.f7652o, 0, this.f7652o, this.f7653p, c1929e1.f7653p);
            this.f7653p = i12;
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
    public final int m9323e(int i10) {
        m9322l(i10);
        return this.f7652o[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1983m, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1929e1)) {
            return super.equals(obj);
        }
        C1929e1 c1929e1 = (C1929e1) obj;
        if (this.f7653p != c1929e1.f7653p) {
            return false;
        }
        int[] iArr = c1929e1.f7652o;
        for (int i10 = 0; i10 < this.f7653p; i10++) {
            if (this.f7652o[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1943g1
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ InterfaceC1943g1 mo9324g(int i10) {
        if (i10 >= this.f7653p) {
            return new C1929e1(Arrays.copyOf(this.f7652o, i10), this.f7653p, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m9322l(i10);
        return Integer.valueOf(this.f7652o[i10]);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1983m, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f7653p; i11++) {
            i10 = (i10 * 31) + this.f7652o[i11];
        }
        return i10;
    }

    /* renamed from: i */
    public final void m9325i(int i10) {
        m9499c();
        int i11 = this.f7653p;
        int[] iArr = this.f7652o;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f7652o = iArr2;
        }
        int[] iArr3 = this.f7652o;
        int i12 = this.f7653p;
        this.f7653p = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i10 = this.f7653p;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f7652o[i11] == intValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1983m, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m9499c();
        m9322l(i10);
        int[] iArr = this.f7652o;
        int i11 = iArr[i10];
        if (i10 < this.f7653p - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f7653p--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        m9499c();
        if (i11 >= i10) {
            int[] iArr = this.f7652o;
            System.arraycopy(iArr, i11, iArr, i10, this.f7653p - i11);
            this.f7653p -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m9499c();
        m9322l(i10);
        int[] iArr = this.f7652o;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7653p;
    }

    private C1929e1(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f7652o = iArr;
        this.f7653p = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1983m, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m9325i(((Integer) obj).intValue());
        return true;
    }
}
