package com.google.android.gms.internal.play_billing;

import com.appsflyer.oaid.BuildConfig;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.play_billing.p */
/* loaded from: classes.dex */
public final class C2004p {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m9521a(byte[] bArr, int i10, C1997o c1997o) throws C1964j1 {
        int m9530j = m9530j(bArr, i10, c1997o);
        int i11 = c1997o.f7751a;
        if (i11 >= 0) {
            if (i11 > bArr.length - m9530j) {
                throw C1964j1.m9405g();
            }
            if (i11 == 0) {
                c1997o.f7753c = AbstractC1914c0.f7634o;
                return m9530j;
            }
            c1997o.f7753c = AbstractC1914c0.m9268s(bArr, m9530j, i11);
            return m9530j + i11;
        }
        throw C1964j1.m9403d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m9522b(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m9523c(InterfaceC2014q2 interfaceC2014q2, byte[] bArr, int i10, int i11, int i12, C1997o c1997o) throws IOException {
        Object mo9447b = interfaceC2014q2.mo9447b();
        int m9534n = m9534n(mo9447b, interfaceC2014q2, bArr, i10, i11, i12, c1997o);
        interfaceC2014q2.mo9446a(mo9447b);
        c1997o.f7753c = mo9447b;
        return m9534n;
    }

    /* renamed from: d */
    static int m9524d(InterfaceC2014q2 interfaceC2014q2, byte[] bArr, int i10, int i11, C1997o c1997o) throws IOException {
        Object mo9447b = interfaceC2014q2.mo9447b();
        int m9535o = m9535o(mo9447b, interfaceC2014q2, bArr, i10, i11, c1997o);
        interfaceC2014q2.mo9446a(mo9447b);
        c1997o.f7753c = mo9447b;
        return m9535o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m9525e(InterfaceC2014q2 interfaceC2014q2, int i10, byte[] bArr, int i11, int i12, InterfaceC1943g1 interfaceC1943g1, C1997o c1997o) throws IOException {
        int m9524d = m9524d(interfaceC2014q2, bArr, i11, i12, c1997o);
        interfaceC1943g1.add(c1997o.f7753c);
        while (m9524d < i12) {
            int m9530j = m9530j(bArr, m9524d, c1997o);
            if (i10 != c1997o.f7751a) {
                break;
            }
            m9524d = m9524d(interfaceC2014q2, bArr, m9530j, i12, c1997o);
            interfaceC1943g1.add(c1997o.f7753c);
        }
        return m9524d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static int m9526f(byte[] bArr, int i10, InterfaceC1943g1 interfaceC1943g1, C1997o c1997o) throws IOException {
        C1929e1 c1929e1 = (C1929e1) interfaceC1943g1;
        int m9530j = m9530j(bArr, i10, c1997o);
        int i11 = c1997o.f7751a + m9530j;
        while (m9530j < i11) {
            m9530j = m9530j(bArr, m9530j, c1997o);
            c1929e1.m9325i(c1997o.f7751a);
        }
        if (m9530j == i11) {
            return m9530j;
        }
        throw C1964j1.m9405g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m9527g(byte[] bArr, int i10, C1997o c1997o) throws C1964j1 {
        int m9530j = m9530j(bArr, i10, c1997o);
        int i11 = c1997o.f7751a;
        if (i11 < 0) {
            throw C1964j1.m9403d();
        }
        if (i11 == 0) {
            c1997o.f7753c = BuildConfig.FLAVOR;
            return m9530j;
        }
        c1997o.f7753c = new String(bArr, m9530j, i11, C1950h1.f7676b);
        return m9530j + i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m9528h(byte[] bArr, int i10, C1997o c1997o) throws C1964j1 {
        int m9530j = m9530j(bArr, i10, c1997o);
        int i11 = c1997o.f7751a;
        if (i11 < 0) {
            throw C1964j1.m9403d();
        }
        if (i11 == 0) {
            c1997o.f7753c = BuildConfig.FLAVOR;
            return m9530j;
        }
        int i12 = C2064x3.f7888b;
        int length = bArr.length;
        if ((((length - m9530j) - i11) | m9530j | i11) >= 0) {
            int i13 = m9530j + i11;
            char[] cArr = new char[i11];
            int i14 = 0;
            while (m9530j < i13) {
                byte b10 = bArr[m9530j];
                if (!C2036t3.m9651d(b10)) {
                    break;
                }
                m9530j++;
                cArr[i14] = (char) b10;
                i14++;
            }
            while (m9530j < i13) {
                int i15 = m9530j + 1;
                byte b11 = bArr[m9530j];
                if (C2036t3.m9651d(b11)) {
                    int i16 = i14 + 1;
                    cArr[i14] = (char) b11;
                    m9530j = i15;
                    while (true) {
                        i14 = i16;
                        if (m9530j < i13) {
                            byte b12 = bArr[m9530j];
                            if (C2036t3.m9651d(b12)) {
                                m9530j++;
                                i16 = i14 + 1;
                                cArr[i14] = (char) b12;
                            }
                        }
                    }
                } else if (b11 < -32) {
                    if (i15 < i13) {
                        C2036t3.m9650c(b11, bArr[i15], cArr, i14);
                        m9530j = i15 + 1;
                        i14++;
                    } else {
                        throw C1964j1.m9402c();
                    }
                } else if (b11 < -16) {
                    if (i15 < i13 - 1) {
                        int i17 = i15 + 1;
                        C2036t3.m9649b(b11, bArr[i15], bArr[i17], cArr, i14);
                        m9530j = i17 + 1;
                        i14++;
                    } else {
                        throw C1964j1.m9402c();
                    }
                } else if (i15 < i13 - 2) {
                    int i18 = i15 + 1;
                    byte b13 = bArr[i15];
                    int i19 = i18 + 1;
                    C2036t3.m9648a(b11, b13, bArr[i18], bArr[i19], cArr, i14);
                    i14 += 2;
                    m9530j = i19 + 1;
                } else {
                    throw C1964j1.m9402c();
                }
            }
            c1997o.f7753c = new String(cArr, 0, i14);
            return i13;
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(m9530j), Integer.valueOf(i11)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static int m9529i(int i10, byte[] bArr, int i11, int i12, C1966j3 c1966j3, C1997o c1997o) throws C1964j1 {
        if ((i10 >>> 3) == 0) {
            throw C1964j1.m9401b();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int m9533m = m9533m(bArr, i11, c1997o);
            c1966j3.m9465j(i10, Long.valueOf(c1997o.f7752b));
            return m9533m;
        }
        if (i13 == 1) {
            c1966j3.m9465j(i10, Long.valueOf(m9536p(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int m9530j = m9530j(bArr, i11, c1997o);
            int i14 = c1997o.f7751a;
            if (i14 >= 0) {
                if (i14 > bArr.length - m9530j) {
                    throw C1964j1.m9405g();
                }
                if (i14 == 0) {
                    c1966j3.m9465j(i10, AbstractC1914c0.f7634o);
                } else {
                    c1966j3.m9465j(i10, AbstractC1914c0.m9268s(bArr, m9530j, i14));
                }
                return m9530j + i14;
            }
            throw C1964j1.m9403d();
        }
        if (i13 != 3) {
            if (i13 == 5) {
                c1966j3.m9465j(i10, Integer.valueOf(m9522b(bArr, i11)));
                return i11 + 4;
            }
            throw C1964j1.m9401b();
        }
        int i15 = (i10 & (-8)) | 4;
        C1966j3 m9457f = C1966j3.m9457f();
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int m9530j2 = m9530j(bArr, i11, c1997o);
            int i17 = c1997o.f7751a;
            i16 = i17;
            if (i17 == i15) {
                i11 = m9530j2;
                break;
            }
            int m9529i = m9529i(i16, bArr, m9530j2, i12, m9457f, c1997o);
            i16 = i17;
            i11 = m9529i;
        }
        if (i11 <= i12 && i16 == i15) {
            c1966j3.m9465j(i10, m9457f);
            return i11;
        }
        throw C1964j1.m9404e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static int m9530j(byte[] bArr, int i10, C1997o c1997o) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return m9531k(b10, bArr, i11, c1997o);
        }
        c1997o.f7751a = b10;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static int m9531k(int i10, byte[] bArr, int i11, C1997o c1997o) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            c1997o.f7751a = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            c1997o.f7751a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            c1997o.f7751a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            c1997o.f7751a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                c1997o.f7751a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static int m9532l(int i10, byte[] bArr, int i11, int i12, InterfaceC1943g1 interfaceC1943g1, C1997o c1997o) {
        C1929e1 c1929e1 = (C1929e1) interfaceC1943g1;
        int m9530j = m9530j(bArr, i11, c1997o);
        c1929e1.m9325i(c1997o.f7751a);
        while (m9530j < i12) {
            int m9530j2 = m9530j(bArr, m9530j, c1997o);
            if (i10 != c1997o.f7751a) {
                break;
            }
            m9530j = m9530j(bArr, m9530j2, c1997o);
            c1929e1.m9325i(c1997o.f7751a);
        }
        return m9530j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static int m9533m(byte[] bArr, int i10, C1997o c1997o) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            c1997o.f7752b = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= (b11 & Byte.MAX_VALUE) << i13;
            i12 = i14;
            b10 = b11;
        }
        c1997o.f7752b = j11;
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static int m9534n(Object obj, InterfaceC2014q2 interfaceC2014q2, byte[] bArr, int i10, int i11, int i12, C1997o c1997o) throws IOException {
        int m9445F = ((C1965j2) interfaceC2014q2).m9445F(obj, bArr, i10, i11, i12, c1997o);
        c1997o.f7753c = obj;
        return m9445F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static int m9535o(Object obj, InterfaceC2014q2 interfaceC2014q2, byte[] bArr, int i10, int i11, C1997o c1997o) throws IOException {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = m9531k(i13, bArr, i12, c1997o);
            i13 = c1997o.f7751a;
        }
        int i14 = i12;
        if (i13 >= 0 && i13 <= i11 - i14) {
            int i15 = i13 + i14;
            interfaceC2014q2.mo9454i(obj, bArr, i14, i15, c1997o);
            c1997o.f7753c = obj;
            return i15;
        }
        throw C1964j1.m9405g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static long m9536p(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }
}
