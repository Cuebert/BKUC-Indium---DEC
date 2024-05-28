package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.i9 */
/* loaded from: classes.dex */
final class C1621i9 extends AbstractC1483a7<Long> implements RandomAccess, InterfaceC1828v8, InterfaceC1503ba {

    /* renamed from: q */
    private static final C1621i9 f6909q;

    /* renamed from: o */
    private long[] f6910o;

    /* renamed from: p */
    private int f6911p;

    static {
        C1621i9 c1621i9 = new C1621i9(new long[0], 0);
        f6909q = c1621i9;
        c1621i9.zzb();
    }

    C1621i9() {
        this(new long[10], 0);
    }

    /* renamed from: e */
    public static C1621i9 m8303e() {
        return f6909q;
    }

    /* renamed from: k */
    private final String m8304k(int i10) {
        int i11 = this.f6911p;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    /* renamed from: l */
    private final void m8305l(int i10) {
        if (i10 < 0 || i10 >= this.f6911p) {
            throw new IndexOutOfBoundsException(m8304k(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        m7889c();
        if (i10 >= 0 && i10 <= (i11 = this.f6911p)) {
            long[] jArr = this.f6910o;
            if (i11 < jArr.length) {
                System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
            } else {
                long[] jArr2 = new long[((i11 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i10);
                System.arraycopy(this.f6910o, i10, jArr2, i10 + 1, this.f6911p - i10);
                this.f6910o = jArr2;
            }
            this.f6910o[i10] = longValue;
            this.f6911p++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m8304k(i10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        m7889c();
        C1860x8.m9009e(collection);
        if (!(collection instanceof C1621i9)) {
            return super.addAll(collection);
        }
        C1621i9 c1621i9 = (C1621i9) collection;
        int i10 = c1621i9.f6911p;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f6911p;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f6910o;
            if (i12 > jArr.length) {
                this.f6910o = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(c1621i9.f6910o, 0, this.f6910o, this.f6911p, c1621i9.f6911p);
            this.f6911p = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1621i9)) {
            return super.equals(obj);
        }
        C1621i9 c1621i9 = (C1621i9) obj;
        if (this.f6911p != c1621i9.f6911p) {
            return false;
        }
        long[] jArr = c1621i9.f6910o;
        for (int i10 = 0; i10 < this.f6911p; i10++) {
            if (this.f6910o[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1828v8
    /* renamed from: f */
    public final long mo8306f(int i10) {
        m8305l(i10);
        return this.f6910o[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m8305l(i10);
        return Long.valueOf(this.f6910o[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f6911p; i11++) {
            i10 = (i10 * 31) + C1860x8.m9007c(this.f6910o[i11]);
        }
        return i10;
    }

    /* renamed from: i */
    public final void m8307i(long j10) {
        m7889c();
        int i10 = this.f6911p;
        long[] jArr = this.f6910o;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f6910o = jArr2;
        }
        long[] jArr3 = this.f6910o;
        int i11 = this.f6911p;
        this.f6911p = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i10 = this.f6911p;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f6910o[i11] == longValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1844w8
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final InterfaceC1828v8 mo8008g(int i10) {
        if (i10 >= this.f6911p) {
            return new C1621i9(Arrays.copyOf(this.f6910o, i10), this.f6911p);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m7889c();
        m8305l(i10);
        long[] jArr = this.f6910o;
        long j10 = jArr[i10];
        if (i10 < this.f6911p - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f6911p--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        m7889c();
        if (i11 >= i10) {
            long[] jArr = this.f6910o;
            System.arraycopy(jArr, i11, jArr, i10, this.f6911p - i11);
            this.f6911p -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        m7889c();
        m8305l(i10);
        long[] jArr = this.f6910o;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6911p;
    }

    private C1621i9(long[] jArr, int i10) {
        this.f6910o = jArr;
        this.f6911p = i10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m8307i(((Long) obj).longValue());
        return true;
    }
}
