package androidx.core.util;

import java.io.PrintWriter;

/* renamed from: androidx.core.util.i */
/* loaded from: classes.dex */
public final class C0655i {

    /* renamed from: a */
    private static final Object f3498a = new Object();

    /* renamed from: b */
    private static char[] f3499b = new char[24];

    /* renamed from: a */
    private static int m3471a(int i10, int i11, boolean z10, int i12) {
        if (i10 > 99 || (z10 && i12 >= 3)) {
            return i11 + 3;
        }
        if (i10 > 9 || (z10 && i12 >= 2)) {
            return i11 + 2;
        }
        if (z10 || i10 > 0) {
            return i11 + 1;
        }
        return 0;
    }

    /* renamed from: b */
    public static void m3472b(long j10, long j11, PrintWriter printWriter) {
        if (j10 == 0) {
            printWriter.print("--");
        } else {
            m3474d(j10 - j11, printWriter, 0);
        }
    }

    /* renamed from: c */
    public static void m3473c(long j10, PrintWriter printWriter) {
        m3474d(j10, printWriter, 0);
    }

    /* renamed from: d */
    public static void m3474d(long j10, PrintWriter printWriter, int i10) {
        synchronized (f3498a) {
            printWriter.print(new String(f3499b, 0, m3475e(j10, i10)));
        }
    }

    /* renamed from: e */
    private static int m3475e(long j10, int i10) {
        char c10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j11 = j10;
        if (f3499b.length < i10) {
            f3499b = new char[i10];
        }
        char[] cArr = f3499b;
        if (j11 == 0) {
            int i16 = i10 - 1;
            while (i16 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j11 > 0) {
            c10 = '+';
        } else {
            c10 = '-';
            j11 = -j11;
        }
        int i17 = (int) (j11 % 1000);
        int floor = (int) Math.floor(j11 / 1000);
        if (floor > 86400) {
            i11 = floor / 86400;
            floor -= 86400 * i11;
        } else {
            i11 = 0;
        }
        if (floor > 3600) {
            i12 = floor / 3600;
            floor -= i12 * 3600;
        } else {
            i12 = 0;
        }
        if (floor > 60) {
            int i18 = floor / 60;
            i13 = floor - (i18 * 60);
            i14 = i18;
        } else {
            i13 = floor;
            i14 = 0;
        }
        if (i10 != 0) {
            int m3471a = m3471a(i11, 1, false, 0);
            int m3471a2 = m3471a + m3471a(i12, 1, m3471a > 0, 2);
            int m3471a3 = m3471a2 + m3471a(i14, 1, m3471a2 > 0, 2);
            int m3471a4 = m3471a3 + m3471a(i13, 1, m3471a3 > 0, 2);
            i15 = 0;
            for (int m3471a5 = m3471a4 + m3471a(i17, 2, true, m3471a4 > 0 ? 3 : 0) + 1; m3471a5 < i10; m3471a5++) {
                cArr[i15] = ' ';
                i15++;
            }
        } else {
            i15 = 0;
        }
        cArr[i15] = c10;
        int i19 = i15 + 1;
        boolean z10 = i10 != 0;
        int m3476f = m3476f(cArr, i11, 'd', i19, false, 0);
        int m3476f2 = m3476f(cArr, i12, 'h', m3476f, m3476f != i19, z10 ? 2 : 0);
        int m3476f3 = m3476f(cArr, i14, 'm', m3476f2, m3476f2 != i19, z10 ? 2 : 0);
        int m3476f4 = m3476f(cArr, i13, 's', m3476f3, m3476f3 != i19, z10 ? 2 : 0);
        int m3476f5 = m3476f(cArr, i17, 'm', m3476f4, true, (!z10 || m3476f4 == i19) ? 0 : 3);
        cArr[m3476f5] = 's';
        return m3476f5 + 1;
    }

    /* renamed from: f */
    private static int m3476f(char[] cArr, int i10, char c10, int i11, boolean z10, int i12) {
        int i13;
        if (!z10 && i10 <= 0) {
            return i11;
        }
        if ((!z10 || i12 < 3) && i10 <= 99) {
            i13 = i11;
        } else {
            int i14 = i10 / 100;
            cArr[i11] = (char) (i14 + 48);
            i13 = i11 + 1;
            i10 -= i14 * 100;
        }
        if ((z10 && i12 >= 2) || i10 > 9 || i11 != i13) {
            int i15 = i10 / 10;
            cArr[i13] = (char) (i15 + 48);
            i13++;
            i10 -= i15 * 10;
        }
        cArr[i13] = (char) (i10 + 48);
        int i16 = i13 + 1;
        cArr[i16] = c10;
        return i16 + 1;
    }
}
