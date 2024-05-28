package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.play_billing.k0 */
/* loaded from: classes.dex */
public abstract class AbstractC1970k0 extends C2018r {

    /* renamed from: b */
    private static final Logger f7706b = Logger.getLogger(AbstractC1970k0.class.getName());

    /* renamed from: c */
    private static final boolean f7707c = C2029s3.m9614C();

    /* renamed from: d */
    public static final /* synthetic */ int f7708d = 0;

    /* renamed from: a */
    C1977l0 f7709a;

    private AbstractC1970k0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ AbstractC1970k0(C1963j0 c1963j0) {
    }

    /* renamed from: A */
    public static AbstractC1970k0 m9475A(byte[] bArr, int i10, int i11) {
        return new C1949h0(bArr, 0, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: u */
    public static int m9477u(int i10, InterfaceC1944g2 interfaceC1944g2, InterfaceC2014q2 interfaceC2014q2) {
        int mo9298c = ((AbstractC1976l) interfaceC1944g2).mo9298c(interfaceC2014q2);
        int m9481y = m9481y(i10 << 3);
        return m9481y + m9481y + mo9298c;
    }

    /* renamed from: v */
    public static int m9478v(int i10) {
        if (i10 >= 0) {
            return m9481y(i10);
        }
        return 10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static int m9479w(InterfaceC1944g2 interfaceC1944g2, InterfaceC2014q2 interfaceC2014q2) {
        int mo9298c = ((AbstractC1976l) interfaceC1944g2).mo9298c(interfaceC2014q2);
        return m9481y(mo9298c) + mo9298c;
    }

    /* renamed from: x */
    public static int m9480x(String str) {
        int length;
        try {
            length = C2064x3.m9685c(str);
        } catch (C2057w3 unused) {
            length = str.getBytes(C1950h1.f7676b).length;
        }
        return m9481y(length) + length;
    }

    /* renamed from: y */
    public static int m9481y(int i10) {
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

    /* renamed from: z */
    public static int m9482z(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            i10 = 6;
            j10 >>>= 28;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            j10 >>>= 14;
            i10 += 2;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    /* renamed from: a */
    public final void m9483a() {
        if (mo9360d() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m9484b(String str, C2057w3 c2057w3) throws IOException {
        f7706b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c2057w3);
        byte[] bytes = str.getBytes(C1950h1.f7676b);
        try {
            int length = bytes.length;
            mo9374r(length);
            mo9370n(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new C1956i0(e10);
        }
    }

    /* renamed from: d */
    public abstract int mo9360d();

    /* renamed from: e */
    public abstract void mo9361e(byte b10) throws IOException;

    /* renamed from: f */
    public abstract void mo9362f(int i10, boolean z10) throws IOException;

    /* renamed from: g */
    public abstract void mo9363g(int i10, AbstractC1914c0 abstractC1914c0) throws IOException;

    /* renamed from: h */
    public abstract void mo9364h(int i10, int i11) throws IOException;

    /* renamed from: i */
    public abstract void mo9365i(int i10) throws IOException;

    /* renamed from: j */
    public abstract void mo9366j(int i10, long j10) throws IOException;

    /* renamed from: k */
    public abstract void mo9367k(long j10) throws IOException;

    /* renamed from: l */
    public abstract void mo9368l(int i10, int i11) throws IOException;

    /* renamed from: m */
    public abstract void mo9369m(int i10) throws IOException;

    /* renamed from: n */
    public abstract void mo9370n(byte[] bArr, int i10, int i11) throws IOException;

    /* renamed from: o */
    public abstract void mo9371o(int i10, String str) throws IOException;

    /* renamed from: p */
    public abstract void mo9372p(int i10, int i11) throws IOException;

    /* renamed from: q */
    public abstract void mo9373q(int i10, int i11) throws IOException;

    /* renamed from: r */
    public abstract void mo9374r(int i10) throws IOException;

    /* renamed from: s */
    public abstract void mo9375s(int i10, long j10) throws IOException;

    /* renamed from: t */
    public abstract void mo9376t(long j10) throws IOException;
}
