package okhttp3.internal.publicsuffix;

import ac.C0080j;
import ac.C0082l;
import ac.InterfaceC0075e;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import p291wb.C5492f;

/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e */
    private static final byte[] f17384e = {42};

    /* renamed from: f */
    private static final String[] f17385f = new String[0];

    /* renamed from: g */
    private static final String[] f17386g = {"*"};

    /* renamed from: h */
    private static final PublicSuffixDatabase f17387h = new PublicSuffixDatabase();

    /* renamed from: a */
    private final AtomicBoolean f17388a = new AtomicBoolean(false);

    /* renamed from: b */
    private final CountDownLatch f17389b = new CountDownLatch(1);

    /* renamed from: c */
    private byte[] f17390c;

    /* renamed from: d */
    private byte[] f17391d;

    /* renamed from: a */
    private static String m17622a(byte[] bArr, byte[][] bArr2, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        int length = bArr.length;
        int i14 = 0;
        while (i14 < length) {
            int i15 = (i14 + length) / 2;
            while (i15 > -1 && bArr[i15] != 10) {
                i15--;
            }
            int i16 = i15 + 1;
            int i17 = 1;
            while (true) {
                i11 = i16 + i17;
                if (bArr[i11] == 10) {
                    break;
                }
                i17++;
            }
            int i18 = i11 - i16;
            int i19 = i10;
            boolean z11 = false;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                if (z11) {
                    i12 = 46;
                    z10 = false;
                } else {
                    z10 = z11;
                    i12 = bArr2[i19][i20] & 255;
                }
                i13 = i12 - (bArr[i16 + i21] & 255);
                if (i13 == 0) {
                    i21++;
                    i20++;
                    if (i21 == i18) {
                        break;
                    }
                    if (bArr2[i19].length != i20) {
                        z11 = z10;
                    } else {
                        if (i19 == bArr2.length - 1) {
                            break;
                        }
                        i19++;
                        z11 = true;
                        i20 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i13 >= 0) {
                if (i13 <= 0) {
                    int i22 = i18 - i21;
                    int length2 = bArr2[i19].length - i20;
                    while (true) {
                        i19++;
                        if (i19 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i19].length;
                    }
                    if (length2 >= i22) {
                        if (length2 <= i22) {
                            return new String(bArr, i16, i18, StandardCharsets.UTF_8);
                        }
                    }
                }
                i14 = i11 + 1;
            }
            length = i16 - 1;
        }
        return null;
    }

    /* renamed from: b */
    private String[] m17623b(String[] strArr) {
        String str;
        String str2;
        String str3;
        String[] strArr2;
        String[] strArr3;
        int i10 = 0;
        if (!this.f17388a.get() && this.f17388a.compareAndSet(false, true)) {
            m17626f();
        } else {
            try {
                this.f17389b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        synchronized (this) {
            if (this.f17390c == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length];
        for (int i11 = 0; i11 < strArr.length; i11++) {
            bArr[i11] = strArr[i11].getBytes(StandardCharsets.UTF_8);
        }
        int i12 = 0;
        while (true) {
            str = null;
            if (i12 >= length) {
                str2 = null;
                break;
            }
            str2 = m17622a(this.f17390c, bArr, i12);
            if (str2 != null) {
                break;
            }
            i12++;
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            for (int i13 = 0; i13 < bArr2.length - 1; i13++) {
                bArr2[i13] = f17384e;
                str3 = m17622a(this.f17390c, bArr2, i13);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            while (true) {
                if (i10 >= length - 1) {
                    break;
                }
                String m17622a = m17622a(this.f17391d, bArr, i10);
                if (m17622a != null) {
                    str = m17622a;
                    break;
                }
                i10++;
            }
        }
        if (str != null) {
            return ("!" + str).split("\\.");
        }
        if (str2 == null && str3 == null) {
            return f17386g;
        }
        if (str2 != null) {
            strArr2 = str2.split("\\.");
        } else {
            strArr2 = f17385f;
        }
        if (str3 != null) {
            strArr3 = str3.split("\\.");
        } else {
            strArr3 = f17385f;
        }
        return strArr2.length > strArr3.length ? strArr2 : strArr3;
    }

    /* renamed from: c */
    public static PublicSuffixDatabase m17624c() {
        return f17387h;
    }

    /* renamed from: e */
    private void m17625e() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        InterfaceC0075e m425d = C0082l.m425d(new C0080j(C0082l.m432k(resourceAsStream)));
        try {
            byte[] bArr = new byte[m425d.readInt()];
            m425d.readFully(bArr);
            byte[] bArr2 = new byte[m425d.readInt()];
            m425d.readFully(bArr2);
            m425d.close();
            synchronized (this) {
                this.f17390c = bArr;
                this.f17391d = bArr2;
            }
            this.f17389b.countDown();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (m425d != null) {
                    try {
                        m425d.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    /* renamed from: f */
    private void m17626f() {
        boolean z10 = false;
        while (true) {
            try {
                try {
                    m17625e();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z10 = true;
                } catch (IOException e10) {
                    C5492f.m20215l().mo20197t(5, "Failed to read public suffix list", e10);
                    if (z10) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: d */
    public String m17627d(String str) {
        int length;
        int length2;
        Objects.requireNonNull(str, "domain == null");
        String[] split = IDN.toUnicode(str).split("\\.");
        String[] m17623b = m17623b(split);
        if (split.length == m17623b.length && m17623b[0].charAt(0) != '!') {
            return null;
        }
        if (m17623b[0].charAt(0) == '!') {
            length = split.length;
            length2 = m17623b.length;
        } else {
            length = split.length;
            length2 = m17623b.length + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        String[] split2 = str.split("\\.");
        for (int i10 = length - length2; i10 < split2.length; i10++) {
            sb2.append(split2[i10]);
            sb2.append('.');
        }
        sb2.deleteCharAt(sb2.length() - 1);
        return sb2.toString();
    }
}
