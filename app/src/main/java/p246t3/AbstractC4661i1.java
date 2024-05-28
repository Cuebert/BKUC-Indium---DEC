package p246t3;

import java.io.IOException;

/* renamed from: t3.i1 */
/* loaded from: classes.dex */
public abstract class AbstractC4661i1 {

    /* renamed from: a */
    private static final AbstractC4661i1 f18460a = new C4653g1("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: b */
    private static final AbstractC4661i1 f18461b = new C4653g1("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* renamed from: c */
    private static final AbstractC4661i1 f18462c = new C4657h1("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* renamed from: d */
    private static final AbstractC4661i1 f18463d = new C4657h1("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* renamed from: e */
    private static final AbstractC4661i1 f18464e = new C4649f1("base16()", "0123456789ABCDEF");

    /* renamed from: d */
    public static AbstractC4661i1 m18777d() {
        return f18464e;
    }

    /* renamed from: a */
    abstract void mo18758a(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException;

    /* renamed from: b */
    abstract int mo18765b(int i10);

    /* renamed from: c */
    public abstract AbstractC4661i1 mo18766c();

    /* renamed from: e */
    public final String m18778e(byte[] bArr, int i10, int i11) {
        C4691q.m18807e(0, i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(mo18765b(i11));
        try {
            mo18758a(sb2, bArr, 0, i11);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
