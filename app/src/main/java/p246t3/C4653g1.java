package p246t3;

import java.io.IOException;

/* renamed from: t3.g1 */
/* loaded from: classes.dex */
final class C4653g1 extends C4657h1 {
    private C4653g1(C4645e1 c4645e1, Character ch) {
        super(c4645e1, ch);
        char[] cArr;
        cArr = c4645e1.f18432b;
        C4691q.m18805c(cArr.length == 64);
    }

    @Override // p246t3.C4657h1, p246t3.AbstractC4661i1
    /* renamed from: a */
    final void mo18758a(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        C4691q.m18807e(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = i12 + 1;
            int i15 = bArr[i12] & 255;
            int i16 = bArr[i14] & 255;
            int i17 = i14 + 1;
            int i18 = (i15 << 16) | (i16 << 8) | (bArr[i17] & 255);
            appendable.append(this.f18451f.m18755a(i18 >>> 18));
            appendable.append(this.f18451f.m18755a((i18 >>> 12) & 63));
            appendable.append(this.f18451f.m18755a((i18 >>> 6) & 63));
            appendable.append(this.f18451f.m18755a(i18 & 63));
            i12 = i17 + 1;
        }
        if (i12 < i11) {
            m18767g(appendable, bArr, i12, i11 - i12);
        }
    }

    @Override // p246t3.C4657h1
    /* renamed from: f */
    final AbstractC4661i1 mo18759f(C4645e1 c4645e1, Character ch) {
        return new C4653g1(c4645e1, ch);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4653g1(String str, String str2, Character ch) {
        this(new C4645e1(str, str2.toCharArray()), ch);
    }
}
