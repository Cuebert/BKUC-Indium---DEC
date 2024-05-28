package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.play_billing.q */
/* loaded from: classes.dex */
final class C2011q extends AbstractC1983m implements RandomAccess, InterfaceC1993n2 {

    /* renamed from: q */
    private static final C2011q f7771q = new C2011q(new boolean[0], 0, false);

    /* renamed from: o */
    private boolean[] f7772o;

    /* renamed from: p */
    private int f7773p;

    C2011q() {
        this(new boolean[10], 0, true);
    }

    /* renamed from: i */
    private final String m9550i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f7773p;
    }

    /* renamed from: k */
    private final void m9551k(int i10) {
        if (i10 < 0 || i10 >= this.f7773p) {
            throw new IndexOutOfBoundsException(m9550i(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m9499c();
        if (i10 >= 0 && i10 <= (i11 = this.f7773p)) {
            boolean[] zArr = this.f7772o;
            if (i11 < zArr.length) {
                System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
            } else {
                boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i10);
                System.arraycopy(this.f7772o, i10, zArr2, i10 + 1, this.f7773p - i10);
                this.f7772o = zArr2;
            }
            this.f7772o[i10] = booleanValue;
            this.f7773p++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m9550i(i10));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1983m, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m9499c();
        byte[] bArr = C1950h1.f7678d;
        Objects.requireNonNull(collection);
        if (!(collection instanceof C2011q)) {
            return super.addAll(collection);
        }
        C2011q c2011q = (C2011q) collection;
        int i10 = c2011q.f7773p;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f7773p;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f7772o;
            if (i12 > zArr.length) {
                this.f7772o = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(c2011q.f7772o, 0, this.f7772o, this.f7773p, c2011q.f7773p);
            this.f7773p = i12;
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
    public final void m9552e(boolean z10) {
        m9499c();
        int i10 = this.f7773p;
        boolean[] zArr = this.f7772o;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f7772o = zArr2;
        }
        boolean[] zArr3 = this.f7772o;
        int i11 = this.f7773p;
        this.f7773p = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1983m, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2011q)) {
            return super.equals(obj);
        }
        C2011q c2011q = (C2011q) obj;
        if (this.f7773p != c2011q.f7773p) {
            return false;
        }
        boolean[] zArr = c2011q.f7772o;
        for (int i10 = 0; i10 < this.f7773p; i10++) {
            if (this.f7772o[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1943g1
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ InterfaceC1943g1 mo9324g(int i10) {
        if (i10 >= this.f7773p) {
            return new C2011q(Arrays.copyOf(this.f7772o, i10), this.f7773p, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m9551k(i10);
        return Boolean.valueOf(this.f7772o[i10]);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1983m, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f7773p; i11++) {
            i10 = (i10 * 31) + C1950h1.m9377a(this.f7772o[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f7773p;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f7772o[i11] == booleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1983m, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m9499c();
        m9551k(i10);
        boolean[] zArr = this.f7772o;
        boolean z10 = zArr[i10];
        if (i10 < this.f7773p - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f7773p--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        m9499c();
        if (i11 >= i10) {
            boolean[] zArr = this.f7772o;
            System.arraycopy(zArr, i11, zArr, i10, this.f7773p - i11);
            this.f7773p -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m9499c();
        m9551k(i10);
        boolean[] zArr = this.f7772o;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7773p;
    }

    private C2011q(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.f7772o = zArr;
        this.f7773p = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1983m, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m9552e(((Boolean) obj).booleanValue());
        return true;
    }
}
