package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.play_billing.j3 */
/* loaded from: classes.dex */
public final class C1966j3 {

    /* renamed from: f */
    private static final C1966j3 f7700f = new C1966j3(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f7701a;

    /* renamed from: b */
    private int[] f7702b;

    /* renamed from: c */
    private Object[] f7703c;

    /* renamed from: d */
    private int f7704d;

    /* renamed from: e */
    private boolean f7705e;

    private C1966j3() {
        this(0, new int[8], new Object[8], true);
    }

    private C1966j3(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f7704d = -1;
        this.f7701a = i10;
        this.f7702b = iArr;
        this.f7703c = objArr;
        this.f7705e = z10;
    }

    /* renamed from: c */
    public static C1966j3 m9455c() {
        return f7700f;
    }

    /* renamed from: e */
    public static C1966j3 m9456e(C1966j3 c1966j3, C1966j3 c1966j32) {
        int i10 = c1966j3.f7701a + c1966j32.f7701a;
        int[] copyOf = Arrays.copyOf(c1966j3.f7702b, i10);
        System.arraycopy(c1966j32.f7702b, 0, copyOf, c1966j3.f7701a, c1966j32.f7701a);
        Object[] copyOf2 = Arrays.copyOf(c1966j3.f7703c, i10);
        System.arraycopy(c1966j32.f7703c, 0, copyOf2, c1966j3.f7701a, c1966j32.f7701a);
        return new C1966j3(i10, copyOf, copyOf2, true);
    }

    /* renamed from: f */
    public static C1966j3 m9457f() {
        return new C1966j3(0, new int[8], new Object[8], true);
    }

    /* renamed from: l */
    private final void m9458l(int i10) {
        int[] iArr = this.f7702b;
        if (i10 > iArr.length) {
            int i11 = this.f7701a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f7702b = Arrays.copyOf(iArr, i10);
            this.f7703c = Arrays.copyOf(this.f7703c, i10);
        }
    }

    /* renamed from: a */
    public final int m9459a() {
        int m9482z;
        int m9481y;
        int i10;
        int i11 = this.f7704d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f7701a; i13++) {
            int i14 = this.f7702b[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 != 0) {
                if (i16 == 1) {
                    ((Long) this.f7703c[i13]).longValue();
                    i10 = AbstractC1970k0.m9481y(i15 << 3) + 8;
                } else if (i16 == 2) {
                    AbstractC1914c0 abstractC1914c0 = (AbstractC1914c0) this.f7703c[i13];
                    int i17 = AbstractC1970k0.f7708d;
                    int mo9271i = abstractC1914c0.mo9271i();
                    i10 = AbstractC1970k0.m9481y(i15 << 3) + AbstractC1970k0.m9481y(mo9271i) + mo9271i;
                } else if (i16 == 3) {
                    int i18 = i15 << 3;
                    int i19 = AbstractC1970k0.f7708d;
                    m9482z = ((C1966j3) this.f7703c[i13]).m9459a();
                    int m9481y2 = AbstractC1970k0.m9481y(i18);
                    m9481y = m9481y2 + m9481y2;
                } else if (i16 == 5) {
                    ((Integer) this.f7703c[i13]).intValue();
                    i10 = AbstractC1970k0.m9481y(i15 << 3) + 4;
                } else {
                    throw new IllegalStateException(C1964j1.m9400a());
                }
                i12 += i10;
            } else {
                int i20 = i15 << 3;
                m9482z = AbstractC1970k0.m9482z(((Long) this.f7703c[i13]).longValue());
                m9481y = AbstractC1970k0.m9481y(i20);
            }
            i10 = m9481y + m9482z;
            i12 += i10;
        }
        this.f7704d = i12;
        return i12;
    }

    /* renamed from: b */
    public final int m9460b() {
        int i10 = this.f7704d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f7701a; i12++) {
            int i13 = this.f7702b[i12] >>> 3;
            AbstractC1914c0 abstractC1914c0 = (AbstractC1914c0) this.f7703c[i12];
            int i14 = AbstractC1970k0.f7708d;
            int mo9271i = abstractC1914c0.mo9271i();
            int m9481y = AbstractC1970k0.m9481y(mo9271i) + mo9271i;
            int m9481y2 = AbstractC1970k0.m9481y(16);
            int m9481y3 = AbstractC1970k0.m9481y(i13);
            int m9481y4 = AbstractC1970k0.m9481y(8);
            i11 += m9481y4 + m9481y4 + m9481y2 + m9481y3 + AbstractC1970k0.m9481y(24) + m9481y;
        }
        this.f7704d = i11;
        return i11;
    }

    /* renamed from: d */
    public final C1966j3 m9461d(C1966j3 c1966j3) {
        if (c1966j3.equals(f7700f)) {
            return this;
        }
        m9462g();
        int i10 = this.f7701a + c1966j3.f7701a;
        m9458l(i10);
        System.arraycopy(c1966j3.f7702b, 0, this.f7702b, this.f7701a, c1966j3.f7701a);
        System.arraycopy(c1966j3.f7703c, 0, this.f7703c, this.f7701a, c1966j3.f7701a);
        this.f7701a = i10;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1966j3)) {
            return false;
        }
        C1966j3 c1966j3 = (C1966j3) obj;
        int i10 = this.f7701a;
        if (i10 == c1966j3.f7701a) {
            int[] iArr = this.f7702b;
            int[] iArr2 = c1966j3.f7702b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f7703c;
                    Object[] objArr2 = c1966j3.f7703c;
                    int i12 = this.f7701a;
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

    /* renamed from: g */
    final void m9462g() {
        if (!this.f7705e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: h */
    public final void m9463h() {
        if (this.f7705e) {
            this.f7705e = false;
        }
    }

    public final int hashCode() {
        int i10 = this.f7701a;
        int i11 = i10 + 527;
        int[] iArr = this.f7702b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 * 31) + i13;
        Object[] objArr = this.f7703c;
        int i16 = this.f7701a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return (i15 * 31) + i12;
    }

    /* renamed from: i */
    public final void m9464i(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f7701a; i11++) {
            C1958i2.m9387b(sb2, i10, String.valueOf(this.f7702b[i11] >>> 3), this.f7703c[i11]);
        }
    }

    /* renamed from: j */
    public final void m9465j(int i10, Object obj) {
        m9462g();
        m9458l(this.f7701a + 1);
        int[] iArr = this.f7702b;
        int i11 = this.f7701a;
        iArr[i11] = i10;
        this.f7703c[i11] = obj;
        this.f7701a = i11 + 1;
    }

    /* renamed from: k */
    public final void m9466k(InterfaceC1904a4 interfaceC1904a4) throws IOException {
        if (this.f7701a != 0) {
            for (int i10 = 0; i10 < this.f7701a; i10++) {
                int i11 = this.f7702b[i10];
                Object obj = this.f7703c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    interfaceC1904a4.mo9228r(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    interfaceC1904a4.mo9204D(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    interfaceC1904a4.mo9236z(i13, (AbstractC1914c0) obj);
                } else if (i12 == 3) {
                    interfaceC1904a4.mo9201A(i13);
                    ((C1966j3) obj).m9466k(interfaceC1904a4);
                    interfaceC1904a4.mo9209I(i13);
                } else if (i12 == 5) {
                    interfaceC1904a4.mo9222l(i13, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(C1964j1.m9400a());
                }
            }
        }
    }
}
