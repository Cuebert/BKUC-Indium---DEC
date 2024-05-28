package com.google.android.gms.common;

/* renamed from: com.google.android.gms.common.x */
/* loaded from: classes.dex */
final class C1425x {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m7749a(int i10) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i11 = 0; i11 < 6; i11++) {
            int i12 = iArr[i11];
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            }
            if (i13 == i10) {
                return i12;
            }
        }
        return 1;
    }
}
