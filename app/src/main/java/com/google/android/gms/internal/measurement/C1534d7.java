package com.google.android.gms.internal.measurement;

import com.appsflyer.oaid.BuildConfig;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.d7 */
/* loaded from: classes.dex */
public final class C1534d7 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m8040a(byte[] bArr, int i10, C1517c7 c1517c7) throws C1892z8 {
        int m8049j = m8049j(bArr, i10, c1517c7);
        int i11 = c1517c7.f6722a;
        if (i11 >= 0) {
            if (i11 > bArr.length - m8049j) {
                throw C1892z8.m9152f();
            }
            if (i11 == 0) {
                c1517c7.f6724c = AbstractC1731p7.f7144o;
                return m8049j;
            }
            c1517c7.f6724c = AbstractC1731p7.m8663s(bArr, m8049j, i11);
            return m8049j + i11;
        }
        throw C1892z8.m9150d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m8041b(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m8042c(InterfaceC1571fa interfaceC1571fa, byte[] bArr, int i10, int i11, int i12, C1517c7 c1517c7) throws IOException {
        C1861x9 c1861x9 = (C1861x9) interfaceC1571fa;
        Object mo8159b = c1861x9.mo8159b();
        int m9050D = c1861x9.m9050D(mo8159b, bArr, i10, i11, i12, c1517c7);
        c1861x9.mo8158a(mo8159b);
        c1517c7.f6724c = mo8159b;
        return m9050D;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m8043d(InterfaceC1571fa interfaceC1571fa, byte[] bArr, int i10, int i11, C1517c7 c1517c7) throws IOException {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = m8050k(i13, bArr, i12, c1517c7);
            i13 = c1517c7.f6722a;
        }
        int i14 = i12;
        if (i13 >= 0 && i13 <= i11 - i14) {
            Object mo8159b = interfaceC1571fa.mo8159b();
            int i15 = i13 + i14;
            interfaceC1571fa.mo8164g(mo8159b, bArr, i14, i15, c1517c7);
            interfaceC1571fa.mo8158a(mo8159b);
            c1517c7.f6724c = mo8159b;
            return i15;
        }
        throw C1892z8.m9152f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m8044e(InterfaceC1571fa<?> interfaceC1571fa, int i10, byte[] bArr, int i11, int i12, InterfaceC1844w8<?> interfaceC1844w8, C1517c7 c1517c7) throws IOException {
        int m8043d = m8043d(interfaceC1571fa, bArr, i11, i12, c1517c7);
        interfaceC1844w8.add(c1517c7.f6724c);
        while (m8043d < i12) {
            int m8049j = m8049j(bArr, m8043d, c1517c7);
            if (i10 != c1517c7.f6722a) {
                break;
            }
            m8043d = m8043d(interfaceC1571fa, bArr, m8049j, i12, c1517c7);
            interfaceC1844w8.add(c1517c7.f6724c);
        }
        return m8043d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static int m8045f(byte[] bArr, int i10, InterfaceC1844w8<?> interfaceC1844w8, C1517c7 c1517c7) throws IOException {
        C1748q8 c1748q8 = (C1748q8) interfaceC1844w8;
        int m8049j = m8049j(bArr, i10, c1517c7);
        int i11 = c1517c7.f6722a + m8049j;
        while (m8049j < i11) {
            m8049j = m8049j(bArr, m8049j, c1517c7);
            c1748q8.m8733k(c1517c7.f6722a);
        }
        if (m8049j == i11) {
            return m8049j;
        }
        throw C1892z8.m9152f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m8046g(byte[] bArr, int i10, C1517c7 c1517c7) throws C1892z8 {
        int m8049j = m8049j(bArr, i10, c1517c7);
        int i11 = c1517c7.f6722a;
        if (i11 < 0) {
            throw C1892z8.m9150d();
        }
        if (i11 == 0) {
            c1517c7.f6724c = BuildConfig.FLAVOR;
            return m8049j;
        }
        c1517c7.f6724c = new String(bArr, m8049j, i11, C1860x8.f7292b);
        return m8049j + i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m8047h(byte[] bArr, int i10, C1517c7 c1517c7) throws C1892z8 {
        int m8049j = m8049j(bArr, i10, c1517c7);
        int i11 = c1517c7.f6722a;
        if (i11 < 0) {
            throw C1892z8.m9150d();
        }
        if (i11 == 0) {
            c1517c7.f6724c = BuildConfig.FLAVOR;
            return m8049j;
        }
        c1517c7.f6724c = C1639jb.m8339d(bArr, m8049j, i11);
        return m8049j + i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static int m8048i(int i10, byte[] bArr, int i11, int i12, C1830va c1830va, C1517c7 c1517c7) throws C1892z8 {
        if ((i10 >>> 3) == 0) {
            throw C1892z8.m9148b();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int m8052m = m8052m(bArr, i11, c1517c7);
            c1830va.m8922h(i10, Long.valueOf(c1517c7.f6723b));
            return m8052m;
        }
        if (i13 == 1) {
            c1830va.m8922h(i10, Long.valueOf(m8053n(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int m8049j = m8049j(bArr, i11, c1517c7);
            int i14 = c1517c7.f6722a;
            if (i14 >= 0) {
                if (i14 > bArr.length - m8049j) {
                    throw C1892z8.m9152f();
                }
                if (i14 == 0) {
                    c1830va.m8922h(i10, AbstractC1731p7.f7144o);
                } else {
                    c1830va.m8922h(i10, AbstractC1731p7.m8663s(bArr, m8049j, i14));
                }
                return m8049j + i14;
            }
            throw C1892z8.m9150d();
        }
        if (i13 != 3) {
            if (i13 == 5) {
                c1830va.m8922h(i10, Integer.valueOf(m8041b(bArr, i11)));
                return i11 + 4;
            }
            throw C1892z8.m9148b();
        }
        int i15 = (i10 & (-8)) | 4;
        C1830va m8917e = C1830va.m8917e();
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int m8049j2 = m8049j(bArr, i11, c1517c7);
            int i17 = c1517c7.f6722a;
            if (i17 == i15) {
                i16 = i17;
                i11 = m8049j2;
                break;
            }
            i16 = i17;
            i11 = m8048i(i17, bArr, m8049j2, i12, m8917e, c1517c7);
        }
        if (i11 <= i12 && i16 == i15) {
            c1830va.m8922h(i10, m8917e);
            return i11;
        }
        throw C1892z8.m9151e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static int m8049j(byte[] bArr, int i10, C1517c7 c1517c7) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return m8050k(b10, bArr, i11, c1517c7);
        }
        c1517c7.f6722a = b10;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static int m8050k(int i10, byte[] bArr, int i11, C1517c7 c1517c7) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            c1517c7.f6722a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i13 + 1;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            c1517c7.f6722a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            c1517c7.f6722a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            c1517c7.f6722a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                c1517c7.f6722a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static int m8051l(int i10, byte[] bArr, int i11, int i12, InterfaceC1844w8<?> interfaceC1844w8, C1517c7 c1517c7) {
        C1748q8 c1748q8 = (C1748q8) interfaceC1844w8;
        int m8049j = m8049j(bArr, i11, c1517c7);
        c1748q8.m8733k(c1517c7.f6722a);
        while (m8049j < i12) {
            int m8049j2 = m8049j(bArr, m8049j, c1517c7);
            if (i10 != c1517c7.f6722a) {
                break;
            }
            m8049j = m8049j(bArr, m8049j2, c1517c7);
            c1748q8.m8733k(c1517c7.f6722a);
        }
        return m8049j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static int m8052m(byte[] bArr, int i10, C1517c7 c1517c7) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            c1517c7.f6723b = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j11 |= (r10 & Byte.MAX_VALUE) << i13;
            b10 = bArr[i12];
            i12 = i14;
        }
        c1517c7.f6723b = j11;
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static long m8053n(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }
}
