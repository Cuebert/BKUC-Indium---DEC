package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.fb */
/* loaded from: classes.dex */
final class C1572fb {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m8167a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws C1892z8 {
        if (!m8171e(b11) && (((b10 << 28) + (b11 + 112)) >> 30) == 0 && !m8171e(b12) && !m8171e(b13)) {
            int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
            cArr[i10] = (char) ((i11 >>> 10) + 55232);
            cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
            return;
        }
        throw C1892z8.m9149c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ void m8168b(byte b10, byte b11, char[] cArr, int i10) throws C1892z8 {
        if (b10 >= -62 && !m8171e(b11)) {
            cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
            return;
        }
        throw C1892z8.m9149c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ void m8169c(byte b10, byte b11, byte b12, char[] cArr, int i10) throws C1892z8 {
        if (!m8171e(b11)) {
            if (b10 == -32) {
                if (b11 >= -96) {
                    b10 = -32;
                }
            }
            if (b10 == -19) {
                if (b11 < -96) {
                    b10 = -19;
                }
            }
            if (!m8171e(b12)) {
                cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                return;
            }
        }
        throw C1892z8.m9149c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* synthetic */ boolean m8170d(byte b10) {
        return b10 >= 0;
    }

    /* renamed from: e */
    private static boolean m8171e(byte b10) {
        return b10 > -65;
    }
}
