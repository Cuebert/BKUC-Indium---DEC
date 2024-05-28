package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.x7 */
/* loaded from: classes.dex */
public abstract class AbstractC1859x7 extends C1568f7 {

    /* renamed from: b */
    private static final Logger f7288b = Logger.getLogger(AbstractC1859x7.class.getName());

    /* renamed from: c */
    private static final boolean f7289c = C1555eb.m8097C();

    /* renamed from: a */
    C1875y7 f7290a;

    private AbstractC1859x7() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ AbstractC1859x7(C1811u7 c1811u7) {
    }

    /* renamed from: A */
    public static int m8992A(C1502b9 c1502b9) {
        int m7953a = c1502b9.m7953a();
        return m8996a(m7953a) + m7953a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static int m8993B(InterfaceC1813u9 interfaceC1813u9, InterfaceC1571fa interfaceC1571fa) {
        AbstractC1890z6 abstractC1890z6 = (AbstractC1890z6) interfaceC1813u9;
        int mo8677b = abstractC1890z6.mo8677b();
        if (mo8677b == -1) {
            mo8677b = interfaceC1571fa.mo8160c(abstractC1890z6);
            abstractC1890z6.mo8679e(mo8677b);
        }
        return m8996a(mo8677b) + mo8677b;
    }

    /* renamed from: C */
    public static int m8994C(String str) {
        int length;
        try {
            length = C1639jb.m8338c(str);
        } catch (C1623ib unused) {
            length = str.getBytes(C1860x8.f7292b).length;
        }
        return m8996a(length) + length;
    }

    /* renamed from: D */
    public static int m8995D(int i10) {
        return m8996a(i10 << 3);
    }

    /* renamed from: a */
    public static int m8996a(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: b */
    public static int m8997b(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    /* renamed from: c */
    public static AbstractC1859x7 m8998c(byte[] bArr) {
        return new C1827v7(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static /* synthetic */ boolean m8999f() {
        return f7289c;
    }

    /* renamed from: x */
    public static int m9000x(AbstractC1731p7 abstractC1731p7) {
        int mo8352i = abstractC1731p7.mo8352i();
        return m8996a(mo8352i) + mo8352i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: y */
    public static int m9001y(int i10, InterfaceC1813u9 interfaceC1813u9, InterfaceC1571fa interfaceC1571fa) {
        int m8996a = m8996a(i10 << 3);
        int i11 = m8996a + m8996a;
        AbstractC1890z6 abstractC1890z6 = (AbstractC1890z6) interfaceC1813u9;
        int mo8677b = abstractC1890z6.mo8677b();
        if (mo8677b == -1) {
            mo8677b = interfaceC1571fa.mo8160c(abstractC1890z6);
            abstractC1890z6.mo8679e(mo8677b);
        }
        return i11 + mo8677b;
    }

    /* renamed from: z */
    public static int m9002z(int i10) {
        if (i10 >= 0) {
            return m8996a(i10);
        }
        return 10;
    }

    /* renamed from: d */
    public final void m9003d() {
        if (mo8898g() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m9004e(String str, C1623ib c1623ib) throws IOException {
        f7288b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c1623ib);
        byte[] bytes = str.getBytes(C1860x8.f7292b);
        try {
            int length = bytes.length;
            mo8912u(length);
            mo8908q(bytes, 0, length);
        } catch (C1843w7 e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new C1843w7(e11);
        }
    }

    /* renamed from: g */
    public abstract int mo8898g();

    /* renamed from: h */
    public abstract void mo8899h(byte b10) throws IOException;

    /* renamed from: i */
    public abstract void mo8900i(int i10, boolean z10) throws IOException;

    /* renamed from: j */
    public abstract void mo8901j(int i10, AbstractC1731p7 abstractC1731p7) throws IOException;

    /* renamed from: k */
    public abstract void mo8902k(int i10, int i11) throws IOException;

    /* renamed from: l */
    public abstract void mo8903l(int i10) throws IOException;

    /* renamed from: m */
    public abstract void mo8904m(int i10, long j10) throws IOException;

    /* renamed from: n */
    public abstract void mo8905n(long j10) throws IOException;

    /* renamed from: o */
    public abstract void mo8906o(int i10, int i11) throws IOException;

    /* renamed from: p */
    public abstract void mo8907p(int i10) throws IOException;

    /* renamed from: q */
    public abstract void mo8908q(byte[] bArr, int i10, int i11) throws IOException;

    /* renamed from: r */
    public abstract void mo8909r(int i10, String str) throws IOException;

    /* renamed from: s */
    public abstract void mo8910s(int i10, int i11) throws IOException;

    /* renamed from: t */
    public abstract void mo8911t(int i10, int i11) throws IOException;

    /* renamed from: u */
    public abstract void mo8912u(int i10) throws IOException;

    /* renamed from: v */
    public abstract void mo8913v(int i10, long j10) throws IOException;

    /* renamed from: w */
    public abstract void mo8914w(long j10) throws IOException;
}
