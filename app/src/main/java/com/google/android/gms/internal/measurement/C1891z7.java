package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.z7 */
/* loaded from: classes.dex */
final class C1891z7 extends AbstractC1483a7<Double> implements RandomAccess, InterfaceC1503ba {

    /* renamed from: q */
    private static final C1891z7 f7346q;

    /* renamed from: o */
    private double[] f7347o;

    /* renamed from: p */
    private int f7348p;

    static {
        C1891z7 c1891z7 = new C1891z7(new double[0], 0);
        f7346q = c1891z7;
        c1891z7.zzb();
    }

    C1891z7() {
        this(new double[10], 0);
    }

    /* renamed from: i */
    private final String m9144i(int i10) {
        int i11 = this.f7348p;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    /* renamed from: k */
    private final void m9145k(int i10) {
        if (i10 < 0 || i10 >= this.f7348p) {
            throw new IndexOutOfBoundsException(m9144i(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        m7889c();
        if (i10 >= 0 && i10 <= (i11 = this.f7348p)) {
            double[] dArr = this.f7347o;
            if (i11 < dArr.length) {
                System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
            } else {
                double[] dArr2 = new double[((i11 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i10);
                System.arraycopy(this.f7347o, i10, dArr2, i10 + 1, this.f7348p - i10);
                this.f7347o = dArr2;
            }
            this.f7347o[i10] = doubleValue;
            this.f7348p++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m9144i(i10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        m7889c();
        C1860x8.m9009e(collection);
        if (!(collection instanceof C1891z7)) {
            return super.addAll(collection);
        }
        C1891z7 c1891z7 = (C1891z7) collection;
        int i10 = c1891z7.f7348p;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f7348p;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f7347o;
            if (i12 > dArr.length) {
                this.f7347o = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(c1891z7.f7347o, 0, this.f7347o, this.f7348p, c1891z7.f7348p);
            this.f7348p = i12;
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
    public final void m9146e(double d10) {
        m7889c();
        int i10 = this.f7348p;
        double[] dArr = this.f7347o;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f7347o = dArr2;
        }
        double[] dArr3 = this.f7347o;
        int i11 = this.f7348p;
        this.f7348p = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1891z7)) {
            return super.equals(obj);
        }
        C1891z7 c1891z7 = (C1891z7) obj;
        if (this.f7348p != c1891z7.f7348p) {
            return false;
        }
        double[] dArr = c1891z7.f7347o;
        for (int i10 = 0; i10 < this.f7348p; i10++) {
            if (Double.doubleToLongBits(this.f7347o[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1844w8
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ InterfaceC1844w8 mo8008g(int i10) {
        if (i10 >= this.f7348p) {
            return new C1891z7(Arrays.copyOf(this.f7347o, i10), this.f7348p);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m9145k(i10);
        return Double.valueOf(this.f7347o[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f7348p; i11++) {
            i10 = (i10 * 31) + C1860x8.m9007c(Double.doubleToLongBits(this.f7347o[i11]));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i10 = this.f7348p;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f7347o[i11] == doubleValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m7889c();
        m9145k(i10);
        double[] dArr = this.f7347o;
        double d10 = dArr[i10];
        if (i10 < this.f7348p - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f7348p--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        m7889c();
        if (i11 >= i10) {
            double[] dArr = this.f7347o;
            System.arraycopy(dArr, i11, dArr, i10, this.f7348p - i11);
            this.f7348p -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        m7889c();
        m9145k(i10);
        double[] dArr = this.f7347o;
        double d10 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7348p;
    }

    private C1891z7(double[] dArr, int i10) {
        this.f7347o = dArr;
        this.f7348p = i10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m9146e(((Double) obj).doubleValue());
        return true;
    }
}
