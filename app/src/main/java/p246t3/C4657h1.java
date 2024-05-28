package p246t3;

import java.io.IOException;
import java.math.RoundingMode;

/* renamed from: t3.h1 */
/* loaded from: classes.dex */
class C4657h1 extends AbstractC4661i1 {

    /* renamed from: f */
    final C4645e1 f18451f;

    /* renamed from: g */
    final Character f18452g;

    /* renamed from: h */
    private volatile AbstractC4661i1 f18453h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C4657h1(p246t3.C4645e1 r4, java.lang.Character r5) {
        /*
            r3 = this;
            r3.<init>()
            r3.f18451f = r4
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L17
            r5.charValue()
            r2 = 61
            boolean r4 = r4.m18757c(r2)
            if (r4 != 0) goto L15
            goto L17
        L15:
            r4 = 0
            goto L18
        L17:
            r4 = 1
        L18:
            if (r4 == 0) goto L1d
            r3.f18452g = r5
            return
        L1d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.String r5 = "Padding character %s was already in alphabet"
            java.lang.String r5 = p246t3.C4695r.m18811a(r5, r1)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p246t3.C4657h1.<init>(t3.e1, java.lang.Character):void");
    }

    @Override // p246t3.AbstractC4661i1
    /* renamed from: a */
    void mo18758a(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        C4691q.m18807e(0, i11, bArr.length);
        while (i12 < i11) {
            m18767g(appendable, bArr, i12, Math.min(this.f18451f.f18436f, i11 - i12));
            i12 += this.f18451f.f18436f;
        }
    }

    @Override // p246t3.AbstractC4661i1
    /* renamed from: b */
    final int mo18765b(int i10) {
        C4645e1 c4645e1 = this.f18451f;
        return c4645e1.f18435e * C4669k1.m18787a(i10, c4645e1.f18436f, RoundingMode.CEILING);
    }

    @Override // p246t3.AbstractC4661i1
    /* renamed from: c */
    public final AbstractC4661i1 mo18766c() {
        AbstractC4661i1 abstractC4661i1 = this.f18453h;
        if (abstractC4661i1 == null) {
            C4645e1 m18756b = this.f18451f.m18756b();
            abstractC4661i1 = m18756b == this.f18451f ? this : mo18759f(m18756b, this.f18452g);
            this.f18453h = abstractC4661i1;
        }
        return abstractC4661i1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4657h1) {
            C4657h1 c4657h1 = (C4657h1) obj;
            if (this.f18451f.equals(c4657h1.f18451f)) {
                Character ch = this.f18452g;
                Character ch2 = c4657h1.f18452g;
                if (ch == ch2) {
                    return true;
                }
                if (ch != null && ch.equals(ch2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    AbstractC4661i1 mo18759f(C4645e1 c4645e1, Character ch) {
        return new C4657h1(c4645e1, ch);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m18767g(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        C4691q.m18807e(i10, i10 + i11, bArr.length);
        int i12 = 0;
        C4691q.m18805c(i11 <= this.f18451f.f18436f);
        long j10 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            j10 = (j10 | (bArr[i10 + i13] & 255)) << 8;
        }
        int i14 = ((i11 + 1) * 8) - this.f18451f.f18434d;
        while (i12 < i11 * 8) {
            C4645e1 c4645e1 = this.f18451f;
            appendable.append(c4645e1.m18755a(c4645e1.f18433c & ((int) (j10 >>> (i14 - i12)))));
            i12 += this.f18451f.f18434d;
        }
        if (this.f18452g != null) {
            while (i12 < this.f18451f.f18436f * 8) {
                this.f18452g.charValue();
                appendable.append('=');
                i12 += this.f18451f.f18434d;
            }
        }
    }

    public final int hashCode() {
        int hashCode = this.f18451f.hashCode();
        Character ch = this.f18452g;
        return hashCode ^ (ch == null ? 0 : ch.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.f18451f);
        if (8 % this.f18451f.f18434d != 0) {
            if (this.f18452g == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.f18452g);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4657h1(String str, String str2, Character ch) {
        this(new C4645e1(str, str2.toCharArray()), ch);
    }
}
