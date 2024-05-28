package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.play_billing.m0 */
/* loaded from: classes.dex */
final class C1984m0 extends AbstractC1983m implements RandomAccess, InterfaceC1993n2 {

    /* renamed from: q */
    private static final C1984m0 f7739q = new C1984m0(new double[0], 0, false);

    /* renamed from: o */
    private double[] f7740o;

    /* renamed from: p */
    private int f7741p;

    C1984m0() {
        this(new double[10], 0, true);
    }

    /* renamed from: i */
    private final String m9500i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f7741p;
    }

    /* renamed from: k */
    private final void m9501k(int i10) {
        if (i10 < 0 || i10 >= this.f7741p) {
            throw new IndexOutOfBoundsException(m9500i(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        m9499c();
        if (i10 >= 0 && i10 <= (i11 = this.f7741p)) {
            double[] dArr = this.f7740o;
            if (i11 < dArr.length) {
                System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
            } else {
                double[] dArr2 = new double[((i11 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i10);
                System.arraycopy(this.f7740o, i10, dArr2, i10 + 1, this.f7741p - i10);
                this.f7740o = dArr2;
            }
            this.f7740o[i10] = doubleValue;
            this.f7741p++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m9500i(i10));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1983m, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m9499c();
        byte[] bArr = C1950h1.f7678d;
        Objects.requireNonNull(collection);
        if (!(collection instanceof C1984m0)) {
            return super.addAll(collection);
        }
        C1984m0 c1984m0 = (C1984m0) collection;
        int i10 = c1984m0.f7741p;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f7741p;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f7740o;
            if (i12 > dArr.length) {
                this.f7740o = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(c1984m0.f7740o, 0, this.f7740o, this.f7741p, c1984m0.f7741p);
            this.f7741p = i12;
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
    public final void m9502e(double d10) {
        m9499c();
        int i10 = this.f7741p;
        double[] dArr = this.f7740o;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f7740o = dArr2;
        }
        double[] dArr3 = this.f7740o;
        int i11 = this.f7741p;
        this.f7741p = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1983m, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1984m0)) {
            return super.equals(obj);
        }
        C1984m0 c1984m0 = (C1984m0) obj;
        if (this.f7741p != c1984m0.f7741p) {
            return false;
        }
        double[] dArr = c1984m0.f7740o;
        for (int i10 = 0; i10 < this.f7741p; i10++) {
            if (Double.doubleToLongBits(this.f7740o[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1943g1
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ InterfaceC1943g1 mo9324g(int i10) {
        if (i10 >= this.f7741p) {
            return new C1984m0(Arrays.copyOf(this.f7740o, i10), this.f7741p, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m9501k(i10);
        return Double.valueOf(this.f7740o[i10]);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1983m, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f7741p; i11++) {
            long doubleToLongBits = Double.doubleToLongBits(this.f7740o[i11]);
            byte[] bArr = C1950h1.f7678d;
            i10 = (i10 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i10 = this.f7741p;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f7740o[i11] == doubleValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1983m, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m9499c();
        m9501k(i10);
        double[] dArr = this.f7740o;
        double d10 = dArr[i10];
        if (i10 < this.f7741p - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f7741p--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        m9499c();
        if (i11 >= i10) {
            double[] dArr = this.f7740o;
            System.arraycopy(dArr, i11, dArr, i10, this.f7741p - i11);
            this.f7741p -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        m9499c();
        m9501k(i10);
        double[] dArr = this.f7740o;
        double d10 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7741p;
    }

    private C1984m0(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f7740o = dArr;
        this.f7741p = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1983m, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m9502e(((Double) obj).doubleValue());
        return true;
    }
}
