package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.x8 */
/* loaded from: classes.dex */
public final class C1860x8 {

    /* renamed from: a */
    static final Charset f7291a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f7292b = Charset.forName("UTF-8");

    /* renamed from: c */
    static final Charset f7293c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f7294d;

    /* renamed from: e */
    public static final ByteBuffer f7295e;

    /* renamed from: f */
    public static final C1795t7 f7296f;

    static {
        byte[] bArr = new byte[0];
        f7294d = bArr;
        f7295e = ByteBuffer.wrap(bArr);
        int i10 = C1795t7.f7243a;
        C1763r7 c1763r7 = new C1763r7(bArr, 0, 0, false, null);
        try {
            c1763r7.m8766c(0);
            f7296f = c1763r7;
        } catch (C1892z8 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* renamed from: a */
    public static int m9005a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m9006b(byte[] bArr) {
        int length = bArr.length;
        int m9008d = m9008d(length, bArr, 0, length);
        if (m9008d == 0) {
            return 1;
        }
        return m9008d;
    }

    /* renamed from: c */
    public static int m9007c(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* renamed from: d */
    public static int m9008d(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    /* renamed from: e */
    public static <T> T m9009e(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    /* renamed from: f */
    public static <T> T m9010f(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    /* renamed from: g */
    public static Object m9011g(Object obj, Object obj2) {
        return ((InterfaceC1813u9) obj).mo8676a().mo8850X((InterfaceC1813u9) obj2).mo8461T();
    }

    /* renamed from: h */
    public static String m9012h(byte[] bArr) {
        return new String(bArr, f7292b);
    }

    /* renamed from: i */
    public static boolean m9013i(byte[] bArr) {
        return C1639jb.m8340e(bArr);
    }
}
