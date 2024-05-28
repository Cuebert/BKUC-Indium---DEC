package com.appsflyer.internal;

/* renamed from: com.appsflyer.internal.by */
/* loaded from: classes.dex */
public final class C1265by {
    public static void AFInAppEventParameterName(char[] cArr, char c10, char c11, char c12, char c13) {
        char c14 = 58224;
        for (int i10 = 0; i10 < 16; i10++) {
            cArr[1] = (char) (cArr[1] - (((cArr[0] + c14) ^ ((cArr[0] << 4) + c12)) ^ ((cArr[0] >>> 5) + c13)));
            cArr[0] = (char) (cArr[0] - (((cArr[1] >>> 5) + c11) ^ ((cArr[1] + c14) ^ ((cArr[1] << 4) + c10))));
            c14 = (char) (c14 - 40503);
        }
    }
}
