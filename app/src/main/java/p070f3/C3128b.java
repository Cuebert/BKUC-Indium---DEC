package p070f3;

import java.lang.reflect.Array;
import java.util.Arrays;
import p321z2.C5980h;

/* renamed from: f3.b */
/* loaded from: classes.dex */
public final class C3128b {
    /* renamed from: a */
    public static <T> T[] m13777a(T[]... tArr) {
        if (tArr.length != 0) {
            int i10 = 0;
            for (T[] tArr2 : tArr) {
                i10 += tArr2.length;
            }
            T[] tArr3 = (T[]) Arrays.copyOf(tArr[0], i10);
            int length = tArr[0].length;
            for (int i11 = 1; i11 < tArr.length; i11++) {
                T[] tArr4 = tArr[i11];
                int length2 = tArr4.length;
                System.arraycopy(tArr4, 0, tArr3, length, length2);
                length += length2;
            }
            return tArr3;
        }
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass(), 0));
    }

    /* renamed from: b */
    public static boolean m13778b(int[] iArr, int i10) {
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public static <T> boolean m13779c(T[] tArr, T t10) {
        int length = tArr != null ? tArr.length : 0;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (!C5980h.m21269b(tArr[i10], t10)) {
                i10++;
            } else if (i10 >= 0) {
                return true;
            }
        }
        return false;
    }
}
