package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.play_billing.w0 */
/* loaded from: classes.dex */
final class C2054w0 extends AbstractC1983m implements RandomAccess, InterfaceC1993n2 {

    /* renamed from: q */
    private static final C2054w0 f7874q = new C2054w0(new float[0], 0, false);

    /* renamed from: o */
    private float[] f7875o;

    /* renamed from: p */
    private int f7876p;

    C2054w0() {
        this(new float[10], 0, true);
    }

    /* renamed from: i */
    private final String m9669i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f7876p;
    }

    /* renamed from: k */
    private final void m9670k(int i10) {
        if (i10 < 0 || i10 >= this.f7876p) {
            throw new IndexOutOfBoundsException(m9669i(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float floatValue = ((Float) obj).floatValue();
        m9499c();
        if (i10 >= 0 && i10 <= (i11 = this.f7876p)) {
            float[] fArr = this.f7875o;
            if (i11 < fArr.length) {
                System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
            } else {
                float[] fArr2 = new float[((i11 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i10);
                System.arraycopy(this.f7875o, i10, fArr2, i10 + 1, this.f7876p - i10);
                this.f7875o = fArr2;
            }
            this.f7875o[i10] = floatValue;
            this.f7876p++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m9669i(i10));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1983m, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m9499c();
        byte[] bArr = C1950h1.f7678d;
        Objects.requireNonNull(collection);
        if (!(collection instanceof C2054w0)) {
            return super.addAll(collection);
        }
        C2054w0 c2054w0 = (C2054w0) collection;
        int i10 = c2054w0.f7876p;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f7876p;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f7875o;
            if (i12 > fArr.length) {
                this.f7875o = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(c2054w0.f7875o, 0, this.f7875o, this.f7876p, c2054w0.f7876p);
            this.f7876p = i12;
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
    public final void m9671e(float f10) {
        m9499c();
        int i10 = this.f7876p;
        float[] fArr = this.f7875o;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f7875o = fArr2;
        }
        float[] fArr3 = this.f7875o;
        int i11 = this.f7876p;
        this.f7876p = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1983m, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2054w0)) {
            return super.equals(obj);
        }
        C2054w0 c2054w0 = (C2054w0) obj;
        if (this.f7876p != c2054w0.f7876p) {
            return false;
        }
        float[] fArr = c2054w0.f7875o;
        for (int i10 = 0; i10 < this.f7876p; i10++) {
            if (Float.floatToIntBits(this.f7875o[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1943g1
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ InterfaceC1943g1 mo9324g(int i10) {
        if (i10 >= this.f7876p) {
            return new C2054w0(Arrays.copyOf(this.f7875o, i10), this.f7876p, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m9670k(i10);
        return Float.valueOf(this.f7875o[i10]);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1983m, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f7876p; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f7875o[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i10 = this.f7876p;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f7875o[i11] == floatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1983m, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m9499c();
        m9670k(i10);
        float[] fArr = this.f7875o;
        float f10 = fArr[i10];
        if (i10 < this.f7876p - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f7876p--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        m9499c();
        if (i11 >= i10) {
            float[] fArr = this.f7875o;
            System.arraycopy(fArr, i11, fArr, i10, this.f7876p - i11);
            this.f7876p -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        m9499c();
        m9670k(i10);
        float[] fArr = this.f7875o;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7876p;
    }

    private C2054w0(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f7875o = fArr;
        this.f7876p = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1983m, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m9671e(((Float) obj).floatValue());
        return true;
    }
}
