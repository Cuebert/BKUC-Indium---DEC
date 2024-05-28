package ac;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: ac.f */
/* loaded from: classes.dex */
public class C0076f implements Serializable, Comparable<C0076f> {

    /* renamed from: q */
    static final char[] f273q = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: r */
    public static final C0076f f274r = m389m(new byte[0]);

    /* renamed from: n */
    final byte[] f275n;

    /* renamed from: o */
    transient int f276o;

    /* renamed from: p */
    transient String f277p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0076f(byte[] bArr) {
        this.f275n = bArr;
    }

    /* renamed from: c */
    static int m383c(String str, int i10) {
        int length = str.length();
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            if (i12 == i10) {
                return i11;
            }
            int codePointAt = str.codePointAt(i11);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i12++;
            i11 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    /* renamed from: e */
    public static C0076f m384e(String str) {
        if (str != null) {
            byte[] m317a = C0072b.m317a(str);
            if (m317a != null) {
                return new C0076f(m317a);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    /* renamed from: f */
    public static C0076f m385f(String str) {
        if (str != null) {
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 * 2;
                    bArr[i10] = (byte) ((m386g(str.charAt(i11)) << 4) + m386g(str.charAt(i11 + 1)));
                }
                return m389m(bArr);
            }
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        }
        throw new IllegalArgumentException("hex == null");
    }

    /* renamed from: g */
    private static int m386g(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (c10 < 'a' || c10 > 'f') {
            c11 = 'A';
            if (c10 < 'A' || c10 > 'F') {
                throw new IllegalArgumentException("Unexpected hex digit: " + c10);
            }
        }
        return (c10 - c11) + 10;
    }

    /* renamed from: h */
    private C0076f m387h(String str) {
        try {
            return m389m(MessageDigest.getInstance(str).digest(this.f275n));
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    /* renamed from: i */
    public static C0076f m388i(String str) {
        if (str != null) {
            C0076f c0076f = new C0076f(str.getBytes(C0092v.f320a));
            c0076f.f277p = str;
            return c0076f;
        }
        throw new IllegalArgumentException("s == null");
    }

    /* renamed from: m */
    public static C0076f m389m(byte... bArr) {
        if (bArr != null) {
            return new C0076f((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* renamed from: b */
    public String mo390b() {
        return C0072b.m318b(this.f275n);
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(C0076f c0076f) {
        int mo399r = mo399r();
        int mo399r2 = c0076f.mo399r();
        int min = Math.min(mo399r, mo399r2);
        for (int i10 = 0; i10 < min; i10++) {
            int mo392j = mo392j(i10) & 255;
            int mo392j2 = c0076f.mo392j(i10) & 255;
            if (mo392j != mo392j2) {
                return mo392j < mo392j2 ? -1 : 1;
            }
        }
        if (mo399r == mo399r2) {
            return 0;
        }
        return mo399r < mo399r2 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0076f) {
            C0076f c0076f = (C0076f) obj;
            int mo399r = c0076f.mo399r();
            byte[] bArr = this.f275n;
            if (mo399r == bArr.length && c0076f.mo396o(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f276o;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = Arrays.hashCode(this.f275n);
        this.f276o = hashCode;
        return hashCode;
    }

    /* renamed from: j */
    public byte mo392j(int i10) {
        return this.f275n[i10];
    }

    /* renamed from: k */
    public String mo393k() {
        byte[] bArr = this.f275n;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = f273q;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: l */
    public C0076f mo394l() {
        return m387h("MD5");
    }

    /* renamed from: n */
    public boolean mo395n(int i10, C0076f c0076f, int i11, int i12) {
        return c0076f.mo396o(i11, this.f275n, i10, i12);
    }

    /* renamed from: o */
    public boolean mo396o(int i10, byte[] bArr, int i11, int i12) {
        if (i10 >= 0) {
            byte[] bArr2 = this.f275n;
            if (i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && C0092v.m452a(bArr2, i10, bArr, i11, i12)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public C0076f mo397p() {
        return m387h("SHA-1");
    }

    /* renamed from: q */
    public C0076f mo398q() {
        return m387h("SHA-256");
    }

    /* renamed from: r */
    public int mo399r() {
        return this.f275n.length;
    }

    /* renamed from: s */
    public final boolean m400s(C0076f c0076f) {
        return mo395n(0, c0076f, 0, c0076f.mo399r());
    }

    /* renamed from: t */
    public C0076f mo401t(int i10, int i11) {
        if (i10 >= 0) {
            byte[] bArr = this.f275n;
            if (i11 > bArr.length) {
                throw new IllegalArgumentException("endIndex > length(" + this.f275n.length + ")");
            }
            int i12 = i11 - i10;
            if (i12 >= 0) {
                if (i10 == 0 && i11 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, i10, bArr2, 0, i12);
                return new C0076f(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public String toString() {
        if (this.f275n.length == 0) {
            return "[size=0]";
        }
        String mo404w = mo404w();
        int m383c = m383c(mo404w, 64);
        if (m383c == -1) {
            if (this.f275n.length <= 64) {
                return "[hex=" + mo393k() + "]";
            }
            return "[size=" + this.f275n.length + " hex=" + mo401t(0, 64).mo393k() + "…]";
        }
        String replace = mo404w.substring(0, m383c).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (m383c < mo404w.length()) {
            return "[size=" + this.f275n.length + " text=" + replace + "…]";
        }
        return "[text=" + replace + "]";
    }

    /* renamed from: u */
    public C0076f mo402u() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f275n;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b10 = bArr[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArr2.length; i11++) {
                    byte b11 = bArr2[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArr2[i11] = (byte) (b11 + 32);
                    }
                }
                return new C0076f(bArr2);
            }
            i10++;
        }
    }

    /* renamed from: v */
    public byte[] mo403v() {
        return (byte[]) this.f275n.clone();
    }

    /* renamed from: w */
    public String mo404w() {
        String str = this.f277p;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f275n, C0092v.f320a);
        this.f277p = str2;
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo405x(C0073c c0073c) {
        byte[] bArr = this.f275n;
        c0073c.mo357h(bArr, 0, bArr.length);
    }
}
