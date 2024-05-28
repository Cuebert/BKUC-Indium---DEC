package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.va */
/* loaded from: classes.dex */
public final class C1830va {

    /* renamed from: f */
    private static final C1830va f7266f = new C1830va(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f7267a;

    /* renamed from: b */
    private int[] f7268b;

    /* renamed from: c */
    private Object[] f7269c;

    /* renamed from: d */
    private int f7270d;

    /* renamed from: e */
    private boolean f7271e;

    private C1830va() {
        this(0, new int[8], new Object[8], true);
    }

    private C1830va(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f7270d = -1;
        this.f7267a = i10;
        this.f7268b = iArr;
        this.f7269c = objArr;
        this.f7271e = z10;
    }

    /* renamed from: c */
    public static C1830va m8915c() {
        return f7266f;
    }

    /* renamed from: d */
    public static C1830va m8916d(C1830va c1830va, C1830va c1830va2) {
        int i10 = c1830va.f7267a + c1830va2.f7267a;
        int[] copyOf = Arrays.copyOf(c1830va.f7268b, i10);
        System.arraycopy(c1830va2.f7268b, 0, copyOf, c1830va.f7267a, c1830va2.f7267a);
        Object[] copyOf2 = Arrays.copyOf(c1830va.f7269c, i10);
        System.arraycopy(c1830va2.f7269c, 0, copyOf2, c1830va.f7267a, c1830va2.f7267a);
        return new C1830va(i10, copyOf, copyOf2, true);
    }

    /* renamed from: e */
    public static C1830va m8917e() {
        return new C1830va(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int m8918a() {
        int m8996a;
        int m8997b;
        int i10;
        int i11 = this.f7270d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f7267a; i13++) {
            int i14 = this.f7268b[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 != 0) {
                if (i16 == 1) {
                    ((Long) this.f7269c[i13]).longValue();
                    i10 = AbstractC1859x7.m8996a(i15 << 3) + 8;
                } else if (i16 == 2) {
                    AbstractC1731p7 abstractC1731p7 = (AbstractC1731p7) this.f7269c[i13];
                    int m8996a2 = AbstractC1859x7.m8996a(i15 << 3);
                    int mo8352i = abstractC1731p7.mo8352i();
                    i12 += m8996a2 + AbstractC1859x7.m8996a(mo8352i) + mo8352i;
                } else if (i16 == 3) {
                    int m8995D = AbstractC1859x7.m8995D(i15);
                    m8996a = m8995D + m8995D;
                    m8997b = ((C1830va) this.f7269c[i13]).m8918a();
                } else if (i16 == 5) {
                    ((Integer) this.f7269c[i13]).intValue();
                    i10 = AbstractC1859x7.m8996a(i15 << 3) + 4;
                } else {
                    throw new IllegalStateException(C1892z8.m9147a());
                }
                i12 += i10;
            } else {
                long longValue = ((Long) this.f7269c[i13]).longValue();
                m8996a = AbstractC1859x7.m8996a(i15 << 3);
                m8997b = AbstractC1859x7.m8997b(longValue);
            }
            i10 = m8996a + m8997b;
            i12 += i10;
        }
        this.f7270d = i12;
        return i12;
    }

    /* renamed from: b */
    public final int m8919b() {
        int i10 = this.f7270d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f7267a; i12++) {
            int i13 = this.f7268b[i12];
            AbstractC1731p7 abstractC1731p7 = (AbstractC1731p7) this.f7269c[i12];
            int m8996a = AbstractC1859x7.m8996a(8);
            int mo8352i = abstractC1731p7.mo8352i();
            i11 += m8996a + m8996a + AbstractC1859x7.m8996a(16) + AbstractC1859x7.m8996a(i13 >>> 3) + AbstractC1859x7.m8996a(24) + AbstractC1859x7.m8996a(mo8352i) + mo8352i;
        }
        this.f7270d = i11;
        return i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1830va)) {
            return false;
        }
        C1830va c1830va = (C1830va) obj;
        int i10 = this.f7267a;
        if (i10 == c1830va.f7267a) {
            int[] iArr = this.f7268b;
            int[] iArr2 = c1830va.f7268b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f7269c;
                    Object[] objArr2 = c1830va.f7269c;
                    int i12 = this.f7267a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void m8920f() {
        this.f7271e = false;
    }

    /* renamed from: g */
    public final void m8921g(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f7267a; i11++) {
            C1845w9.m8946b(sb2, i10, String.valueOf(this.f7268b[i11] >>> 3), this.f7269c[i11]);
        }
    }

    /* renamed from: h */
    public final void m8922h(int i10, Object obj) {
        if (this.f7271e) {
            int i11 = this.f7267a;
            int[] iArr = this.f7268b;
            if (i11 == iArr.length) {
                int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
                this.f7268b = Arrays.copyOf(iArr, i12);
                this.f7269c = Arrays.copyOf(this.f7269c, i12);
            }
            int[] iArr2 = this.f7268b;
            int i13 = this.f7267a;
            iArr2[i13] = i10;
            this.f7269c[i13] = obj;
            this.f7267a = i13 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i10 = this.f7267a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f7268b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f7269c;
        int i16 = this.f7267a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    /* renamed from: i */
    public final void m8923i(C1875y7 c1875y7) throws IOException {
        if (this.f7267a != 0) {
            for (int i10 = 0; i10 < this.f7267a; i10++) {
                int i11 = this.f7268b[i10];
                Object obj = this.f7269c[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 == 0) {
                    c1875y7.m9074E(i12, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    c1875y7.m9103x(i12, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    c1875y7.m9094o(i12, (AbstractC1731p7) obj);
                } else if (i13 == 3) {
                    c1875y7.m9085e(i12);
                    ((C1830va) obj).m8923i(c1875y7);
                    c1875y7.m9098s(i12);
                } else if (i13 == 5) {
                    c1875y7.m9101v(i12, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(C1892z8.m9147a());
                }
            }
        }
    }
}
