package p246t3;

import java.io.IOException;

/* renamed from: t3.f1 */
/* loaded from: classes.dex */
final class C4649f1 extends C4657h1 {

    /* renamed from: i */
    final char[] f18441i;

    private C4649f1(C4645e1 c4645e1) {
        super(c4645e1, null);
        char[] cArr;
        this.f18441i = new char[512];
        cArr = c4645e1.f18432b;
        C4691q.m18805c(cArr.length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            this.f18441i[i10] = c4645e1.m18755a(i10 >>> 4);
            this.f18441i[i10 | 256] = c4645e1.m18755a(i10 & 15);
        }
    }

    @Override // p246t3.C4657h1, p246t3.AbstractC4661i1
    /* renamed from: a */
    final void mo18758a(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        C4691q.m18807e(0, i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = bArr[i12] & 255;
            appendable.append(this.f18441i[i13]);
            appendable.append(this.f18441i[i13 | 256]);
        }
    }

    @Override // p246t3.C4657h1
    /* renamed from: f */
    final AbstractC4661i1 mo18759f(C4645e1 c4645e1, Character ch) {
        return new C4649f1(c4645e1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4649f1(String str, String str2) {
        this(new C4645e1("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
