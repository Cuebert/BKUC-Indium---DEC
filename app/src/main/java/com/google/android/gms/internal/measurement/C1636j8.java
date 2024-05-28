package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.j8 */
/* loaded from: classes.dex */
final class C1636j8 extends AbstractC1483a7<Float> implements RandomAccess, InterfaceC1503ba {

    /* renamed from: q */
    private static final C1636j8 f6921q;

    /* renamed from: o */
    private float[] f6922o;

    /* renamed from: p */
    private int f6923p;

    static {
        C1636j8 c1636j8 = new C1636j8(new float[0], 0);
        f6921q = c1636j8;
        c1636j8.zzb();
    }

    C1636j8() {
        this(new float[10], 0);
    }

    /* renamed from: i */
    private final String m8331i(int i10) {
        int i11 = this.f6923p;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    /* renamed from: k */
    private final void m8332k(int i10) {
        if (i10 < 0 || i10 >= this.f6923p) {
            throw new IndexOutOfBoundsException(m8331i(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float floatValue = ((Float) obj).floatValue();
        m7889c();
        if (i10 >= 0 && i10 <= (i11 = this.f6923p)) {
            float[] fArr = this.f6922o;
            if (i11 < fArr.length) {
                System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
            } else {
                float[] fArr2 = new float[((i11 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i10);
                System.arraycopy(this.f6922o, i10, fArr2, i10 + 1, this.f6923p - i10);
                this.f6922o = fArr2;
            }
            this.f6922o[i10] = floatValue;
            this.f6923p++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m8331i(i10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        m7889c();
        C1860x8.m9009e(collection);
        if (!(collection instanceof C1636j8)) {
            return super.addAll(collection);
        }
        C1636j8 c1636j8 = (C1636j8) collection;
        int i10 = c1636j8.f6923p;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f6923p;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f6922o;
            if (i12 > fArr.length) {
                this.f6922o = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(c1636j8.f6922o, 0, this.f6922o, this.f6923p, c1636j8.f6923p);
            this.f6923p = i12;
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
    public final void m8333e(float f10) {
        m7889c();
        int i10 = this.f6923p;
        float[] fArr = this.f6922o;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f6922o = fArr2;
        }
        float[] fArr3 = this.f6922o;
        int i11 = this.f6923p;
        this.f6923p = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1636j8)) {
            return super.equals(obj);
        }
        C1636j8 c1636j8 = (C1636j8) obj;
        if (this.f6923p != c1636j8.f6923p) {
            return false;
        }
        float[] fArr = c1636j8.f6922o;
        for (int i10 = 0; i10 < this.f6923p; i10++) {
            if (Float.floatToIntBits(this.f6922o[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1844w8
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ InterfaceC1844w8 mo8008g(int i10) {
        if (i10 >= this.f6923p) {
            return new C1636j8(Arrays.copyOf(this.f6922o, i10), this.f6923p);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m8332k(i10);
        return Float.valueOf(this.f6922o[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f6923p; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f6922o[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i10 = this.f6923p;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f6922o[i11] == floatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m7889c();
        m8332k(i10);
        float[] fArr = this.f6922o;
        float f10 = fArr[i10];
        if (i10 < this.f6923p - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f6923p--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        m7889c();
        if (i11 >= i10) {
            float[] fArr = this.f6922o;
            System.arraycopy(fArr, i11, fArr, i10, this.f6923p - i11);
            this.f6923p -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        m7889c();
        m8332k(i10);
        float[] fArr = this.f6922o;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6923p;
    }

    private C1636j8(float[] fArr, int i10) {
        this.f6922o = fArr;
        this.f6923p = i10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m8333e(((Float) obj).floatValue());
        return true;
    }
}
