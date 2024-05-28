package ac;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: ac.o */
/* loaded from: classes.dex */
public final class C0085o implements InterfaceC0075e {

    /* renamed from: n */
    public final C0073c f301n = new C0073c();

    /* renamed from: o */
    public final InterfaceC0090t f302o;

    /* renamed from: p */
    boolean f303p;

    public C0085o(InterfaceC0090t interfaceC0090t) {
        Objects.requireNonNull(interfaceC0090t, "source == null");
        this.f302o = interfaceC0090t;
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: B */
    public String mo321B() throws IOException {
        return mo346U(Long.MAX_VALUE);
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: D */
    public int mo324D() throws IOException {
        mo349a0(4L);
        return this.f301n.mo324D();
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: F */
    public boolean mo328F() throws IOException {
        if (this.f303p) {
            throw new IllegalStateException("closed");
        }
        return this.f301n.mo328F() && this.f302o.mo315V(this.f301n, 8192L) == -1;
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: I */
    public byte[] mo333I(long j10) throws IOException {
        mo349a0(j10);
        return this.f301n.mo333I(j10);
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: K */
    public int mo336K(C0083m c0083m) throws IOException {
        if (this.f303p) {
            throw new IllegalStateException("closed");
        }
        do {
            int m380x0 = this.f301n.m380x0(c0083m, true);
            if (m380x0 == -1) {
                return -1;
            }
            if (m380x0 != -2) {
                this.f301n.mo369r(c0083m.f296n[m380x0].mo399r());
                return m380x0;
            }
        } while (this.f302o.mo315V(this.f301n, 8192L) != -1);
        return -1;
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: P */
    public short mo343P() throws IOException {
        mo349a0(2L);
        return this.f301n.mo343P();
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: S */
    public long mo345S() throws IOException {
        byte m362m0;
        mo349a0(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!mo375u(i11)) {
                break;
            }
            m362m0 = this.f301n.m362m0(i10);
            if ((m362m0 < 48 || m362m0 > 57) && !(i10 == 0 && m362m0 == 45)) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(m362m0)));
        }
        return this.f301n.mo345S();
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: U */
    public String mo346U(long j10) throws IOException {
        if (j10 >= 0) {
            long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
            long m440b = m440b((byte) 10, 0L, j11);
            if (m440b != -1) {
                return this.f301n.m378w0(m440b);
            }
            if (j11 < Long.MAX_VALUE && mo375u(j11) && this.f301n.m362m0(j11 - 1) == 13 && mo375u(1 + j11) && this.f301n.m362m0(j11) == 10) {
                return this.f301n.m378w0(j11);
            }
            C0073c c0073c = new C0073c();
            C0073c c0073c2 = this.f301n;
            c0073c2.m360k0(c0073c, 0L, Math.min(32L, c0073c2.m381y0()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f301n.m381y0(), j10) + " content=" + c0073c.m370r0().mo393k() + (char) 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j10);
    }

    @Override // ac.InterfaceC0090t
    /* renamed from: V */
    public long mo315V(C0073c c0073c, long j10) throws IOException {
        if (c0073c == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j10 >= 0) {
            if (!this.f303p) {
                C0073c c0073c2 = this.f301n;
                if (c0073c2.f270o == 0 && this.f302o.mo315V(c0073c2, 8192L) == -1) {
                    return -1L;
                }
                return this.f301n.mo315V(c0073c, Math.min(j10, this.f301n.f270o));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException("byteCount < 0: " + j10);
    }

    @Override // ac.InterfaceC0075e, ac.InterfaceC0074d
    /* renamed from: a */
    public C0073c mo348a() {
        return this.f301n;
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: a0 */
    public void mo349a0(long j10) throws IOException {
        if (!mo375u(j10)) {
            throw new EOFException();
        }
    }

    /* renamed from: b */
    public long m440b(byte b10, long j10, long j11) throws IOException {
        if (this.f303p) {
            throw new IllegalStateException("closed");
        }
        if (j10 < 0 || j11 < j10) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j10), Long.valueOf(j11)));
        }
        while (j10 < j11) {
            long m364n0 = this.f301n.m364n0(b10, j10, j11);
            if (m364n0 == -1) {
                C0073c c0073c = this.f301n;
                long j12 = c0073c.f270o;
                if (j12 >= j11 || this.f302o.mo315V(c0073c, 8192L) == -1) {
                    break;
                }
                j10 = Math.max(j10, j12);
            } else {
                return m364n0;
            }
        }
        return -1L;
    }

    @Override // ac.InterfaceC0090t, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f303p) {
            return;
        }
        this.f303p = true;
        this.f302o.close();
        this.f301n.m347Y();
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: d */
    public C0073c mo352d() {
        return this.f301n;
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: d0 */
    public long mo353d0(byte b10) throws IOException {
        return m440b(b10, 0L, Long.MAX_VALUE);
    }

    @Override // ac.InterfaceC0090t
    /* renamed from: f */
    public C0091u mo316f() {
        return this.f302o.mo316f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r1 == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r3)));
     */
    @Override // ac.InterfaceC0075e
    /* renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo355f0() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 1
            r6.mo349a0(r0)
            r0 = 0
            r1 = 0
        L7:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.mo375u(r3)
            if (r3 == 0) goto L4a
            ac.c r3 = r6.f301n
            long r4 = (long) r1
            byte r3 = r3.m362m0(r4)
            r4 = 48
            if (r3 < r4) goto L1f
            r4 = 57
            if (r3 <= r4) goto L30
        L1f:
            r4 = 97
            if (r3 < r4) goto L27
            r4 = 102(0x66, float:1.43E-43)
            if (r3 <= r4) goto L30
        L27:
            r4 = 65
            if (r3 < r4) goto L32
            r4 = 70
            if (r3 <= r4) goto L30
            goto L32
        L30:
            r1 = r2
            goto L7
        L32:
            if (r1 == 0) goto L35
            goto L4a
        L35:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L4a:
            ac.c r0 = r6.f301n
            long r0 = r0.mo355f0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.C0085o.mo355f0():long");
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: g0 */
    public String mo356g0(Charset charset) throws IOException {
        if (charset != null) {
            this.f301n.m329F0(this.f302o);
            return this.f301n.mo356g0(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: i0 */
    public InputStream mo358i0() {
        return new a();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f303p;
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: p */
    public C0076f mo366p(long j10) throws IOException {
        mo349a0(j10);
        return this.f301n.mo366p(j10);
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: r */
    public void mo369r(long j10) throws IOException {
        if (this.f303p) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            C0073c c0073c = this.f301n;
            if (c0073c.f270o == 0 && this.f302o.mo315V(c0073c, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j10, this.f301n.m381y0());
            this.f301n.mo369r(min);
            j10 -= min;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        C0073c c0073c = this.f301n;
        if (c0073c.f270o == 0 && this.f302o.mo315V(c0073c, 8192L) == -1) {
            return -1;
        }
        return this.f301n.read(byteBuffer);
    }

    @Override // ac.InterfaceC0075e
    public byte readByte() throws IOException {
        mo349a0(1L);
        return this.f301n.readByte();
    }

    @Override // ac.InterfaceC0075e
    public void readFully(byte[] bArr) throws IOException {
        try {
            mo349a0(bArr.length);
            this.f301n.readFully(bArr);
        } catch (EOFException e10) {
            int i10 = 0;
            while (true) {
                C0073c c0073c = this.f301n;
                long j10 = c0073c.f270o;
                if (j10 > 0) {
                    int m367p0 = c0073c.m367p0(bArr, i10, (int) j10);
                    if (m367p0 == -1) {
                        throw new AssertionError();
                    }
                    i10 += m367p0;
                } else {
                    throw e10;
                }
            }
        }
    }

    @Override // ac.InterfaceC0075e
    public int readInt() throws IOException {
        mo349a0(4L);
        return this.f301n.readInt();
    }

    @Override // ac.InterfaceC0075e
    public short readShort() throws IOException {
        mo349a0(2L);
        return this.f301n.readShort();
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: s */
    public long mo371s(InterfaceC0089s interfaceC0089s) throws IOException {
        if (interfaceC0089s == null) {
            throw new IllegalArgumentException("sink == null");
        }
        long j10 = 0;
        while (this.f302o.mo315V(this.f301n, 8192L) != -1) {
            long m359j0 = this.f301n.m359j0();
            if (m359j0 > 0) {
                j10 += m359j0;
                interfaceC0089s.mo313C(this.f301n, m359j0);
            }
        }
        if (this.f301n.m381y0() <= 0) {
            return j10;
        }
        long m381y0 = j10 + this.f301n.m381y0();
        C0073c c0073c = this.f301n;
        interfaceC0089s.mo313C(c0073c, c0073c.m381y0());
        return m381y0;
    }

    public String toString() {
        return "buffer(" + this.f302o + ")";
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: u */
    public boolean mo375u(long j10) throws IOException {
        C0073c c0073c;
        if (j10 >= 0) {
            if (this.f303p) {
                throw new IllegalStateException("closed");
            }
            do {
                c0073c = this.f301n;
                if (c0073c.f270o >= j10) {
                    return true;
                }
            } while (this.f302o.mo315V(c0073c, 8192L) != -1);
            return false;
        }
        throw new IllegalArgumentException("byteCount < 0: " + j10);
    }

    /* renamed from: ac.o$a */
    /* loaded from: classes.dex */
    class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            C0085o c0085o = C0085o.this;
            if (!c0085o.f303p) {
                return (int) Math.min(c0085o.f301n.f270o, 2147483647L);
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C0085o.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            C0085o c0085o = C0085o.this;
            if (!c0085o.f303p) {
                C0073c c0073c = c0085o.f301n;
                if (c0073c.f270o == 0 && c0085o.f302o.mo315V(c0073c, 8192L) == -1) {
                    return -1;
                }
                return C0085o.this.f301n.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return C0085o.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            if (!C0085o.this.f303p) {
                C0092v.m453b(bArr.length, i10, i11);
                C0085o c0085o = C0085o.this;
                C0073c c0073c = c0085o.f301n;
                if (c0073c.f270o == 0 && c0085o.f302o.mo315V(c0073c, 8192L) == -1) {
                    return -1;
                }
                return C0085o.this.f301n.m367p0(bArr, i10, i11);
            }
            throw new IOException("closed");
        }
    }
}
