package p246t3;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: t3.f2 */
/* loaded from: classes.dex */
public final class C4650f2 {

    /* renamed from: a */
    static final Charset f18442a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f18443b = Charset.forName("UTF-8");

    /* renamed from: c */
    static final Charset f18444c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f18445d;

    /* renamed from: e */
    public static final ByteBuffer f18446e;

    /* renamed from: f */
    public static final C4646e2 f18447f;

    static {
        byte[] bArr = new byte[0];
        f18445d = bArr;
        f18446e = ByteBuffer.wrap(bArr);
        int i10 = C4646e2.f18439a;
        C4636c2 c4636c2 = new C4636c2(bArr, 0, 0, false, null);
        c4636c2.m18744a(0);
        f18447f = c4636c2;
    }
}
