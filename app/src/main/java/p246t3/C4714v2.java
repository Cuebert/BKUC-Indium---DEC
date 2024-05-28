package p246t3;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* renamed from: t3.v2 */
/* loaded from: classes.dex */
public final class C4714v2 implements Closeable {

    /* renamed from: n */
    private final InputStream f18515n;

    /* renamed from: o */
    private C4710u2 f18516o;

    /* renamed from: p */
    private final byte[] f18517p = new byte[8];

    /* renamed from: q */
    private final C4718w2 f18518q = C4718w2.m18850a();

    public C4714v2(InputStream inputStream) {
        this.f18515n = inputStream;
    }

    /* renamed from: Q */
    private final long m18838Q() throws IOException {
        if (this.f18516o.m18834a() < 24) {
            long m18834a = this.f18516o.m18834a();
            this.f18516o = null;
            return m18834a;
        }
        if (this.f18516o.m18834a() == 24) {
            int read = this.f18515n.read();
            if (read == -1) {
                throw new EOFException();
            }
            this.f18516o = null;
            return read & 255;
        }
        if (this.f18516o.m18834a() == 25) {
            m18841X(this.f18517p, 2);
            byte[] bArr = this.f18517p;
            return ((bArr[0] & 255) << 8) | (bArr[1] & 255);
        }
        if (this.f18516o.m18834a() == 26) {
            m18841X(this.f18517p, 4);
            byte[] bArr2 = this.f18517p;
            long j10 = bArr2[0];
            return (bArr2[3] & 255) | ((bArr2[1] & 255) << 16) | ((j10 & 255) << 24) | ((bArr2[2] & 255) << 8);
        }
        if (this.f18516o.m18834a() == 27) {
            m18841X(this.f18517p, 8);
            byte[] bArr3 = this.f18517p;
            long j11 = bArr3[0];
            long j12 = bArr3[1];
            long j13 = bArr3[2];
            return (bArr3[7] & 255) | ((bArr3[6] & 255) << 8) | ((j13 & 255) << 40) | ((j11 & 255) << 56) | ((j12 & 255) << 48) | ((bArr3[3] & 255) << 32) | ((bArr3[4] & 255) << 24) | ((bArr3[5] & 255) << 16);
        }
        throw new IOException(String.format("invalid additional information %s for major type %s", Byte.valueOf(this.f18516o.m18834a()), Integer.valueOf(this.f18516o.m18836c())));
    }

    /* renamed from: T */
    private final void m18839T() throws IOException {
        m18847i();
        if (this.f18516o.m18834a() == 31) {
            throw new IllegalStateException(String.format("expected definite length but found %s", Byte.valueOf(this.f18516o.m18834a())));
        }
    }

    /* renamed from: W */
    private final void m18840W(byte b10) throws IOException {
        m18847i();
        if (this.f18516o.m18835b() != b10) {
            throw new IllegalStateException(String.format("expected major type %s but found %s", Integer.valueOf((b10 >> 5) & 7), Integer.valueOf(this.f18516o.m18836c())));
        }
    }

    /* renamed from: X */
    private final void m18841X(byte[] bArr, int i10) throws IOException {
        int i11 = 0;
        while (i11 != i10) {
            int read = this.f18515n.read(bArr, i11, i10 - i11);
            if (read == -1) {
                throw new EOFException();
            }
            i11 += read;
        }
        this.f18516o = null;
    }

    /* renamed from: Y */
    private final byte[] m18842Y() throws IOException {
        m18839T();
        long m18838Q = m18838Q();
        if (m18838Q < 0 || m18838Q > 2147483647L) {
            throw new UnsupportedOperationException(String.format("the maximum supported byte/text string length is %s bytes", Integer.MAX_VALUE));
        }
        if (this.f18515n.available() >= m18838Q) {
            int i10 = (int) m18838Q;
            byte[] bArr = new byte[i10];
            m18841X(bArr, i10);
            return bArr;
        }
        throw new EOFException();
    }

    /* renamed from: O */
    public final byte[] m18843O() throws IOException {
        m18840W((byte) 64);
        return m18842Y();
    }

    /* renamed from: b */
    public final long m18844b() throws IOException {
        m18840W(Byte.MIN_VALUE);
        m18839T();
        long m18838Q = m18838Q();
        if (m18838Q < 0) {
            throw new UnsupportedOperationException(String.format("the maximum supported array length is %s", Long.MAX_VALUE));
        }
        if (m18838Q > 0) {
            this.f18518q.m18858g(m18838Q);
        }
        return m18838Q;
    }

    /* renamed from: c */
    public final long m18845c() throws IOException {
        boolean z10;
        m18847i();
        if (this.f18516o.m18835b() == 0) {
            z10 = true;
        } else {
            if (this.f18516o.m18835b() != 32) {
                throw new IllegalStateException(String.format("expected major type 0 or 1 but found %s", Integer.valueOf(this.f18516o.m18836c())));
            }
            z10 = false;
        }
        long m18838Q = m18838Q();
        if (m18838Q >= 0) {
            return z10 ? m18838Q : ~m18838Q;
        }
        throw new UnsupportedOperationException(String.format("the maximum supported unsigned/negative integer is %s", Long.MAX_VALUE));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f18515n.close();
        this.f18518q.m18853b();
    }

    /* renamed from: e */
    public final long m18846e() throws IOException {
        m18840W((byte) -96);
        m18839T();
        long m18838Q = m18838Q();
        if (m18838Q < 0 || m18838Q > 4611686018427387903L) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (m18838Q > 0) {
            this.f18518q.m18858g(m18838Q + m18838Q);
        }
        return m18838Q;
    }

    /* renamed from: i */
    public final C4710u2 m18847i() throws IOException {
        if (this.f18516o == null) {
            int read = this.f18515n.read();
            if (read == -1) {
                this.f18518q.m18853b();
                return null;
            }
            C4710u2 c4710u2 = new C4710u2(read);
            this.f18516o = c4710u2;
            byte m18835b = c4710u2.m18835b();
            if (m18835b != Byte.MIN_VALUE && m18835b != -96 && m18835b != -64) {
                if (m18835b != -32) {
                    if (m18835b != 0 && m18835b != 32) {
                        if (m18835b == 64) {
                            this.f18518q.m18856e(-1L);
                        } else if (m18835b == 96) {
                            this.f18518q.m18856e(-2L);
                        } else {
                            throw new IllegalStateException(String.format("invalid major type: %s", Integer.valueOf(this.f18516o.m18836c())));
                        }
                        this.f18518q.m18857f();
                    }
                } else if (this.f18516o.m18834a() == 31) {
                    this.f18518q.m18854c();
                }
            }
            this.f18518q.m18855d();
            this.f18518q.m18857f();
        }
        return this.f18516o;
    }

    /* renamed from: l */
    public final String m18848l() throws IOException {
        m18840W((byte) 96);
        return new String(m18842Y(), StandardCharsets.UTF_8);
    }

    /* renamed from: z */
    public final boolean m18849z() throws IOException {
        m18840W((byte) -32);
        if (this.f18516o.m18834a() <= 24) {
            int m18838Q = (int) m18838Q();
            if (m18838Q == 20) {
                return false;
            }
            if (m18838Q == 21) {
                return true;
            }
            throw new IllegalStateException(String.format("expected FALSE or TRUE", new Object[0]));
        }
        throw new IllegalStateException("expected simple value");
    }
}
