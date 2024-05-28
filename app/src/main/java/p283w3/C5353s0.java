package p283w3;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: w3.s0 */
/* loaded from: classes.dex */
final class C5353s0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m19959a(int i10) {
        return (i10 < 32 ? 4 : 2) * (i10 + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m19960b(@NullableDecl Object obj, @NullableDecl Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, @NullableDecl Object[] objArr2) {
        int i11;
        int i12;
        int m19978a = C5366t0.m19978a(obj);
        int i13 = m19978a & i10;
        int m19961c = m19961c(obj3, i13);
        if (m19961c != 0) {
            int i14 = ~i10;
            int i15 = m19978a & i14;
            int i16 = -1;
            while (true) {
                i11 = m19961c - 1;
                i12 = iArr[i11];
                if ((i12 & i14) != i15 || !C5261l.m19848a(obj, objArr[i11]) || (objArr2 != null && !C5261l.m19848a(obj2, objArr2[i11]))) {
                    int i17 = i12 & i10;
                    if (i17 == 0) {
                        break;
                    }
                    i16 = i11;
                    m19961c = i17;
                }
            }
            int i18 = i12 & i10;
            if (i16 == -1) {
                m19963e(obj3, i13, i18);
            } else {
                iArr[i16] = (i18 & i10) | (iArr[i16] & i14);
            }
            return i11;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m19961c(Object obj, int i10) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i10] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i10];
        }
        return ((int[]) obj)[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static Object m19962d(int i10) {
        if (i10 >= 2 && i10 <= 1073741824 && Integer.highestOneBit(i10) == i10) {
            if (i10 <= 256) {
                return new byte[i10];
            }
            return i10 <= 65536 ? new short[i10] : new int[i10];
        }
        StringBuilder sb2 = new StringBuilder(52);
        sb2.append("must be power of 2 between 2^1 and 2^30: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m19963e(Object obj, int i10, int i11) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }
}
