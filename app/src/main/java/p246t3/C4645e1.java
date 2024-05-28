package p246t3;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: t3.e1 */
/* loaded from: classes.dex */
final class C4645e1 {

    /* renamed from: a */
    private final String f18431a;

    /* renamed from: b */
    private final char[] f18432b;

    /* renamed from: c */
    final int f18433c;

    /* renamed from: d */
    final int f18434d;

    /* renamed from: e */
    final int f18435e;

    /* renamed from: f */
    final int f18436f;

    /* renamed from: g */
    private final byte[] f18437g;

    /* renamed from: h */
    private final boolean f18438h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C4645e1(java.lang.String r10, char[] r11) {
        /*
            r9 = this;
            r0 = 128(0x80, float:1.794E-43)
            byte[] r1 = new byte[r0]
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r3 = 0
            r4 = 0
        La:
            int r5 = r11.length
            if (r4 >= r5) goto L2b
            char r5 = r11[r4]
            r6 = 1
            if (r5 >= r0) goto L14
            r7 = 1
            goto L15
        L14:
            r7 = 0
        L15:
            java.lang.String r8 = "Non-ASCII character: %s"
            p246t3.C4691q.m18806d(r7, r8, r5)
            r7 = r1[r5]
            if (r7 != r2) goto L1f
            goto L20
        L1f:
            r6 = 0
        L20:
            java.lang.String r7 = "Duplicate character: %s"
            p246t3.C4691q.m18806d(r6, r7, r5)
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto La
        L2b:
            r9.<init>(r10, r11, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p246t3.C4645e1.<init>(java.lang.String, char[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final char m18755a(int i10) {
        return this.f18432b[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* renamed from: b */
    public final C4645e1 m18756b() {
        int i10;
        boolean z10;
        for (char c10 : this.f18432b) {
            if (C4643e.m18748a(c10)) {
                char[] cArr = this.f18432b;
                int length = cArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        z10 = false;
                        break;
                    }
                    char c11 = cArr[i11];
                    if (c11 >= 'A' && c11 <= 'Z') {
                        z10 = true;
                        break;
                    }
                    i11++;
                }
                if (!z10) {
                    char[] cArr2 = new char[this.f18432b.length];
                    int i12 = 0;
                    while (true) {
                        char[] cArr3 = this.f18432b;
                        if (i12 >= cArr3.length) {
                            break;
                        }
                        char c12 = cArr3[i12];
                        if (C4643e.m18748a(c12)) {
                            c12 ^= 32;
                        }
                        cArr2[i12] = (char) c12;
                        i12++;
                    }
                    C4645e1 c4645e1 = new C4645e1(this.f18431a.concat(".upperCase()"), cArr2);
                    if (!this.f18438h || c4645e1.f18438h) {
                        return c4645e1;
                    }
                    byte[] bArr = c4645e1.f18437g;
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    for (i10 = 65; i10 <= 90; i10++) {
                        int i13 = i10 | 32;
                        byte[] bArr2 = c4645e1.f18437g;
                        byte b10 = bArr2[i10];
                        byte b11 = bArr2[i13];
                        if (b10 == -1) {
                            copyOf[i10] = b11;
                        } else {
                            char c13 = (char) i10;
                            char c14 = (char) i13;
                            if (b11 == -1) {
                                copyOf[i13] = b10;
                            } else {
                                throw new IllegalStateException(C4695r.m18811a("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c13), Character.valueOf(c14)));
                            }
                        }
                    }
                    return new C4645e1(c4645e1.f18431a.concat(".ignoreCase()"), c4645e1.f18432b, copyOf, true);
                }
                throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
            }
        }
        return this;
    }

    /* renamed from: c */
    public final boolean m18757c(char c10) {
        byte[] bArr = this.f18437g;
        return bArr.length > 61 && bArr[61] != -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4645e1) {
            C4645e1 c4645e1 = (C4645e1) obj;
            if (this.f18438h == c4645e1.f18438h && Arrays.equals(this.f18432b, c4645e1.f18432b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f18432b) + (true != this.f18438h ? 1237 : 1231);
    }

    public final String toString() {
        return this.f18431a;
    }

    private C4645e1(String str, char[] cArr, byte[] bArr, boolean z10) {
        this.f18431a = str;
        Objects.requireNonNull(cArr);
        this.f18432b = cArr;
        try {
            int length = cArr.length;
            int m18788b = C4669k1.m18788b(length, RoundingMode.UNNECESSARY);
            this.f18434d = m18788b;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(m18788b);
            int i10 = 1 << (3 - numberOfTrailingZeros);
            this.f18435e = i10;
            this.f18436f = m18788b >> numberOfTrailingZeros;
            this.f18433c = length - 1;
            this.f18437g = bArr;
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 < this.f18436f; i11++) {
                zArr[C4669k1.m18787a(i11 * 8, this.f18434d, RoundingMode.CEILING)] = true;
            }
            this.f18438h = z10;
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e10);
        }
    }
}
