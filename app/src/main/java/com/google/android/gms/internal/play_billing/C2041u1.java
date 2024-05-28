package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.play_billing.u1 */
/* loaded from: classes.dex */
final class C2041u1 extends AbstractC1983m implements RandomAccess, InterfaceC1993n2 {

    /* renamed from: q */
    private static final C2041u1 f7809q = new C2041u1(new long[0], 0, false);

    /* renamed from: o */
    private long[] f7810o;

    /* renamed from: p */
    private int f7811p;

    C2041u1() {
        this(new long[10], 0, true);
    }

    /* renamed from: k */
    private final String m9659k(int i10) {
        return "Index:" + i10 + ", Size:" + this.f7811p;
    }

    /* renamed from: l */
    private final void m9660l(int i10) {
        if (i10 < 0 || i10 >= this.f7811p) {
            throw new IndexOutOfBoundsException(m9659k(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        m9499c();
        if (i10 >= 0 && i10 <= (i11 = this.f7811p)) {
            long[] jArr = this.f7810o;
            if (i11 < jArr.length) {
                System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
            } else {
                long[] jArr2 = new long[((i11 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i10);
                System.arraycopy(this.f7810o, i10, jArr2, i10 + 1, this.f7811p - i10);
                this.f7810o = jArr2;
            }
            this.f7810o[i10] = longValue;
            this.f7811p++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m9659k(i10));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1983m, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m9499c();
        byte[] bArr = C1950h1.f7678d;
        Objects.requireNonNull(collection);
        if (!(collection instanceof C2041u1)) {
            return super.addAll(collection);
        }
        C2041u1 c2041u1 = (C2041u1) collection;
        int i10 = c2041u1.f7811p;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f7811p;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f7810o;
            if (i12 > jArr.length) {
                this.f7810o = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(c2041u1.f7810o, 0, this.f7810o, this.f7811p, c2041u1.f7811p);
            this.f7811p = i12;
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
    public final long m9661e(int i10) {
        m9660l(i10);
        return this.f7810o[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1983m, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2041u1)) {
            return super.equals(obj);
        }
        C2041u1 c2041u1 = (C2041u1) obj;
        if (this.f7811p != c2041u1.f7811p) {
            return false;
        }
        long[] jArr = c2041u1.f7810o;
        for (int i10 = 0; i10 < this.f7811p; i10++) {
            if (this.f7810o[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1943g1
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ InterfaceC1943g1 mo9324g(int i10) {
        if (i10 >= this.f7811p) {
            return new C2041u1(Arrays.copyOf(this.f7810o, i10), this.f7811p, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m9660l(i10);
        return Long.valueOf(this.f7810o[i10]);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1983m, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f7811p; i11++) {
            long j10 = this.f7810o[i11];
            byte[] bArr = C1950h1.f7678d;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    /* renamed from: i */
    public final void m9662i(long j10) {
        m9499c();
        int i10 = this.f7811p;
        long[] jArr = this.f7810o;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f7810o = jArr2;
        }
        long[] jArr3 = this.f7810o;
        int i11 = this.f7811p;
        this.f7811p = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i10 = this.f7811p;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f7810o[i11] == longValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1983m, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m9499c();
        m9660l(i10);
        long[] jArr = this.f7810o;
        long j10 = jArr[i10];
        if (i10 < this.f7811p - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f7811p--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        m9499c();
        if (i11 >= i10) {
            long[] jArr = this.f7810o;
            System.arraycopy(jArr, i11, jArr, i10, this.f7811p - i11);
            this.f7811p -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        m9499c();
        m9660l(i10);
        long[] jArr = this.f7810o;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7811p;
    }

    private C2041u1(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f7810o = jArr;
        this.f7811p = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1983m, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m9662i(((Long) obj).longValue());
        return true;
    }
}
