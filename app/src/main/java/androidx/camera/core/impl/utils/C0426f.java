package androidx.camera.core.impl.utils;

import com.appsflyer.oaid.BuildConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: androidx.camera.core.impl.utils.f */
/* loaded from: classes.dex */
final class C0426f {

    /* renamed from: e */
    static final Charset f1935e = StandardCharsets.US_ASCII;

    /* renamed from: f */
    static final String[] f1936f = {BuildConfig.FLAVOR, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: g */
    static final int[] f1937g = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: h */
    static final byte[] f1938h = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: a */
    public final int f1939a;

    /* renamed from: b */
    public final int f1940b;

    /* renamed from: c */
    public final long f1941c;

    /* renamed from: d */
    public final byte[] f1942d;

    C0426f(int i10, int i11, byte[] bArr) {
        this(i10, i11, -1L, bArr);
    }

    /* renamed from: a */
    public static C0426f m2083a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new C0426f(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(f1935e);
        return new C0426f(1, bytes.length, bytes);
    }

    /* renamed from: b */
    public static C0426f m2084b(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f1937g[12] * dArr.length]);
        wrap.order(byteOrder);
        for (double d10 : dArr) {
            wrap.putDouble(d10);
        }
        return new C0426f(12, dArr.length, wrap.array());
    }

    /* renamed from: c */
    public static C0426f m2085c(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f1937g[9] * iArr.length]);
        wrap.order(byteOrder);
        for (int i10 : iArr) {
            wrap.putInt(i10);
        }
        return new C0426f(9, iArr.length, wrap.array());
    }

    /* renamed from: d */
    public static C0426f m2086d(C0430j[] c0430jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f1937g[10] * c0430jArr.length]);
        wrap.order(byteOrder);
        for (C0430j c0430j : c0430jArr) {
            wrap.putInt((int) c0430j.m2117b());
            wrap.putInt((int) c0430j.m2116a());
        }
        return new C0426f(10, c0430jArr.length, wrap.array());
    }

    /* renamed from: e */
    public static C0426f m2087e(String str) {
        byte[] bytes = (str + (char) 0).getBytes(f1935e);
        return new C0426f(2, bytes.length, bytes);
    }

    /* renamed from: f */
    public static C0426f m2088f(long j10, ByteOrder byteOrder) {
        return m2089g(new long[]{j10}, byteOrder);
    }

    /* renamed from: g */
    public static C0426f m2089g(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f1937g[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j10 : jArr) {
            wrap.putInt((int) j10);
        }
        return new C0426f(4, jArr.length, wrap.array());
    }

    /* renamed from: h */
    public static C0426f m2090h(C0430j[] c0430jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f1937g[5] * c0430jArr.length]);
        wrap.order(byteOrder);
        for (C0430j c0430j : c0430jArr) {
            wrap.putInt((int) c0430j.m2117b());
            wrap.putInt((int) c0430j.m2116a());
        }
        return new C0426f(5, c0430jArr.length, wrap.array());
    }

    /* renamed from: i */
    public static C0426f m2091i(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f1937g[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i10 : iArr) {
            wrap.putShort((short) i10);
        }
        return new C0426f(3, iArr.length, wrap.array());
    }

    /* renamed from: j */
    public int m2092j() {
        return f1937g[this.f1939a] * this.f1940b;
    }

    public String toString() {
        return "(" + f1936f[this.f1939a] + ", data length:" + this.f1942d.length + ")";
    }

    C0426f(int i10, int i11, long j10, byte[] bArr) {
        this.f1939a = i10;
        this.f1940b = i11;
        this.f1941c = j10;
        this.f1942d = bArr;
    }
}
