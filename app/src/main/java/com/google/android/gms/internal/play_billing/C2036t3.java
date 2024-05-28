package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.t3 */
/* loaded from: classes.dex */
final class C2036t3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ void m9648a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
        if (!m9652e(b11) && (((b10 << 28) + (b11 + 112)) >> 30) == 0 && !m9652e(b12) && !m9652e(b13)) {
            int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
            cArr[i10] = (char) ((i11 >>> 10) + 55232);
            cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
            return;
        }
        throw C1964j1.m9402c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m9649b(byte b10, byte b11, byte b12, char[] cArr, int i10) {
        if (!m9652e(b11)) {
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
            if (!m9652e(b12)) {
                cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                return;
            }
        }
        throw C1964j1.m9402c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* bridge */ /* synthetic */ void m9650c(byte b10, byte b11, char[] cArr, int i10) {
        if (b10 >= -62 && !m9652e(b11)) {
            cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
            return;
        }
        throw C1964j1.m9402c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* bridge */ /* synthetic */ boolean m9651d(byte b10) {
        return b10 >= 0;
    }

    /* renamed from: e */
    private static boolean m9652e(byte b10) {
        return b10 > -65;
    }
}
