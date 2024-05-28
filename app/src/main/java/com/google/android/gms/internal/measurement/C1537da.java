package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.da */
/* loaded from: classes.dex */
final class C1537da<E> extends AbstractC1483a7<E> implements RandomAccess {

    /* renamed from: q */
    private static final C1537da<Object> f6746q;

    /* renamed from: o */
    private E[] f6747o;

    /* renamed from: p */
    private int f6748p;

    static {
        C1537da<Object> c1537da = new C1537da<>(new Object[0], 0);
        f6746q = c1537da;
        c1537da.zzb();
    }

    private C1537da(E[] eArr, int i10) {
        this.f6747o = eArr;
        this.f6748p = i10;
    }

    /* renamed from: e */
    public static <E> C1537da<E> m8057e() {
        return (C1537da<E>) f6746q;
    }

    /* renamed from: i */
    private final String m8058i(int i10) {
        int i11 = this.f6748p;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    /* renamed from: k */
    private final void m8059k(int i10) {
        if (i10 < 0 || i10 >= this.f6748p) {
            throw new IndexOutOfBoundsException(m8058i(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        int i11;
        m7889c();
        if (i10 >= 0 && i10 <= (i11 = this.f6748p)) {
            E[] eArr = this.f6747o;
            if (i11 < eArr.length) {
                System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
            } else {
                E[] eArr2 = (E[]) new Object[((i11 * 3) / 2) + 1];
                System.arraycopy(eArr, 0, eArr2, 0, i10);
                System.arraycopy(this.f6747o, i10, eArr2, i10 + 1, this.f6748p - i10);
                this.f6747o = eArr2;
            }
            this.f6747o[i10] = e10;
            this.f6748p++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m8058i(i10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1844w8
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ InterfaceC1844w8 mo8008g(int i10) {
        if (i10 >= this.f6748p) {
            return new C1537da(Arrays.copyOf(this.f6747o, i10), this.f6748p);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        m8059k(i10);
        return this.f6747o[i10];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractList, java.util.List
    public final E remove(int i10) {
        m7889c();
        m8059k(i10);
        E[] eArr = this.f6747o;
        E e10 = eArr[i10];
        if (i10 < this.f6748p - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (r2 - i10) - 1);
        }
        this.f6748p--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        m7889c();
        m8059k(i10);
        E[] eArr = this.f6747o;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6748p;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1483a7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        m7889c();
        int i10 = this.f6748p;
        E[] eArr = this.f6747o;
        if (i10 == eArr.length) {
            this.f6747o = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f6747o;
        int i11 = this.f6748p;
        this.f6748p = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }
}
