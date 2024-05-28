package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.play_billing.h1 */
/* loaded from: classes.dex */
public final class C1950h1 {

    /* renamed from: a */
    static final Charset f7675a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f7676b = Charset.forName("UTF-8");

    /* renamed from: c */
    static final Charset f7677c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f7678d;

    /* renamed from: e */
    public static final ByteBuffer f7679e;

    /* renamed from: f */
    public static final C1942g0 f7680f;

    static {
        byte[] bArr = new byte[0];
        f7678d = bArr;
        f7679e = ByteBuffer.wrap(bArr);
        int i10 = C1942g0.f7670a;
        C1928e0 c1928e0 = new C1928e0(bArr, 0, 0, false, null);
        try {
            c1928e0.m9320c(0);
            f7680f = c1928e0;
        } catch (C1964j1 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* renamed from: a */
    public static int m9377a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m9378b(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    /* renamed from: c */
    public static Object m9379c(Object obj, String str) {
        Objects.requireNonNull(obj, "messageType");
        return obj;
    }

    /* renamed from: d */
    public static String m9380d(byte[] bArr) {
        return new String(bArr, f7676b);
    }
}
