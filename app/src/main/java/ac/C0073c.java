package ac;

import com.appsflyer.oaid.BuildConfig;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: ac.c */
/* loaded from: classes.dex */
public final class C0073c implements InterfaceC0075e, InterfaceC0074d, Cloneable, ByteChannel {

    /* renamed from: p */
    private static final byte[] f268p = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: n */
    C0086p f269n;

    /* renamed from: o */
    long f270o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ac.c$a */
    /* loaded from: classes.dex */
    public class a extends OutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return C0073c.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            C0073c.this.mo330G((byte) i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            C0073c.this.mo357h(bArr, i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ac.c$b */
    /* loaded from: classes.dex */
    public class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C0073c.this.f270o, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            C0073c c0073c = C0073c.this;
            if (c0073c.f270o > 0) {
                return c0073c.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return C0073c.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            return C0073c.this.m367p0(bArr, i10, i11);
        }
    }

    /* renamed from: A0 */
    public final C0076f m320A0(int i10) {
        if (i10 == 0) {
            return C0076f.f274r;
        }
        return new C0088r(this, i10);
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: B */
    public String mo321B() throws EOFException {
        return mo346U(Long.MAX_VALUE);
    }

    /* renamed from: B0 */
    public C0086p m322B0(int i10) {
        if (i10 >= 1 && i10 <= 8192) {
            C0086p c0086p = this.f269n;
            if (c0086p == null) {
                C0086p m448b = C0087q.m448b();
                this.f269n = m448b;
                m448b.f311g = m448b;
                m448b.f310f = m448b;
                return m448b;
            }
            C0086p c0086p2 = c0086p.f311g;
            return (c0086p2.f307c + i10 > 8192 || !c0086p2.f309e) ? c0086p2.m443c(C0087q.m448b()) : c0086p2;
        }
        throw new IllegalArgumentException();
    }

    @Override // ac.InterfaceC0089s
    /* renamed from: C */
    public void mo313C(C0073c c0073c, long j10) {
        if (c0073c == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (c0073c != this) {
            C0092v.m453b(c0073c.f270o, 0L, j10);
            while (j10 > 0) {
                C0086p c0086p = c0073c.f269n;
                if (j10 < c0086p.f307c - c0086p.f306b) {
                    C0086p c0086p2 = this.f269n;
                    C0086p c0086p3 = c0086p2 != null ? c0086p2.f311g : null;
                    if (c0086p3 != null && c0086p3.f309e) {
                        if ((c0086p3.f307c + j10) - (c0086p3.f308d ? 0 : c0086p3.f306b) <= 8192) {
                            c0086p.m446f(c0086p3, (int) j10);
                            c0073c.f270o -= j10;
                            this.f270o += j10;
                            return;
                        }
                    }
                    c0073c.f269n = c0086p.m445e((int) j10);
                }
                C0086p c0086p4 = c0073c.f269n;
                long j11 = c0086p4.f307c - c0086p4.f306b;
                c0073c.f269n = c0086p4.m442b();
                C0086p c0086p5 = this.f269n;
                if (c0086p5 == null) {
                    this.f269n = c0086p4;
                    c0086p4.f311g = c0086p4;
                    c0086p4.f310f = c0086p4;
                } else {
                    c0086p5.f311g.m443c(c0086p4).m441a();
                }
                c0073c.f270o -= j11;
                this.f270o += j11;
                j10 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // ac.InterfaceC0074d
    /* renamed from: C0 */
    public C0073c mo326E(C0076f c0076f) {
        if (c0076f != null) {
            c0076f.mo405x(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: D */
    public int mo324D() {
        return C0092v.m454c(readInt());
    }

    @Override // ac.InterfaceC0074d
    /* renamed from: D0 */
    public C0073c mo339M(byte[] bArr) {
        if (bArr != null) {
            return mo357h(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // ac.InterfaceC0074d
    /* renamed from: E0 */
    public C0073c mo357h(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            long j10 = i11;
            C0092v.m453b(bArr.length, i10, j10);
            int i12 = i11 + i10;
            while (i10 < i12) {
                C0086p m322B0 = m322B0(1);
                int min = Math.min(i12 - i10, 8192 - m322B0.f307c);
                System.arraycopy(bArr, i10, m322B0.f305a, m322B0.f307c, min);
                i10 += min;
                m322B0.f307c += min;
            }
            this.f270o += j10;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: F */
    public boolean mo328F() {
        return this.f270o == 0;
    }

    /* renamed from: F0 */
    public long m329F0(InterfaceC0090t interfaceC0090t) throws IOException {
        if (interfaceC0090t == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j10 = 0;
        while (true) {
            long mo315V = interfaceC0090t.mo315V(this, 8192L);
            if (mo315V == -1) {
                return j10;
            }
            j10 += mo315V;
        }
    }

    @Override // ac.InterfaceC0074d
    /* renamed from: G0 */
    public C0073c mo330G(int i10) {
        C0086p m322B0 = m322B0(1);
        byte[] bArr = m322B0.f305a;
        int i11 = m322B0.f307c;
        m322B0.f307c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f270o++;
        return this;
    }

    @Override // ac.InterfaceC0074d
    /* renamed from: H0 */
    public C0073c mo351c0(long j10) {
        if (j10 == 0) {
            return mo330G(48);
        }
        boolean z10 = false;
        int i10 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return mo350b0("-9223372036854775808");
            }
            z10 = true;
        }
        if (j10 >= 100000000) {
            i10 = j10 < 1000000000000L ? j10 < 10000000000L ? j10 < 1000000000 ? 9 : 10 : j10 < 100000000000L ? 11 : 12 : j10 < 1000000000000000L ? j10 < 10000000000000L ? 13 : j10 < 100000000000000L ? 14 : 15 : j10 < 100000000000000000L ? j10 < 10000000000000000L ? 16 : 17 : j10 < 1000000000000000000L ? 18 : 19;
        } else if (j10 >= 10000) {
            i10 = j10 < 1000000 ? j10 < 100000 ? 5 : 6 : j10 < 10000000 ? 7 : 8;
        } else if (j10 >= 100) {
            i10 = j10 < 1000 ? 3 : 4;
        } else if (j10 >= 10) {
            i10 = 2;
        }
        if (z10) {
            i10++;
        }
        C0086p m322B0 = m322B0(i10);
        byte[] bArr = m322B0.f305a;
        int i11 = m322B0.f307c + i10;
        while (j10 != 0) {
            i11--;
            bArr[i11] = f268p[(int) (j10 % 10)];
            j10 /= 10;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        m322B0.f307c += i10;
        this.f270o += i10;
        return this;
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: I */
    public byte[] mo333I(long j10) throws EOFException {
        C0092v.m453b(this.f270o, 0L, j10);
        if (j10 <= 2147483647L) {
            byte[] bArr = new byte[(int) j10];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j10);
    }

    @Override // ac.InterfaceC0074d
    /* renamed from: I0 */
    public C0073c mo363n(long j10) {
        if (j10 == 0) {
            return mo330G(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + 1;
        C0086p m322B0 = m322B0(numberOfTrailingZeros);
        byte[] bArr = m322B0.f305a;
        int i10 = m322B0.f307c;
        for (int i11 = (i10 + numberOfTrailingZeros) - 1; i11 >= i10; i11--) {
            bArr[i11] = f268p[(int) (15 & j10)];
            j10 >>>= 4;
        }
        m322B0.f307c += numberOfTrailingZeros;
        this.f270o += numberOfTrailingZeros;
        return this;
    }

    @Override // ac.InterfaceC0074d
    /* renamed from: J0 */
    public C0073c mo379x(int i10) {
        C0086p m322B0 = m322B0(4);
        byte[] bArr = m322B0.f305a;
        int i11 = m322B0.f307c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        m322B0.f307c = i14 + 1;
        this.f270o += 4;
        return this;
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: K */
    public int mo336K(C0083m c0083m) {
        int m380x0 = m380x0(c0083m, false);
        if (m380x0 == -1) {
            return -1;
        }
        try {
            mo369r(c0083m.f296n[m380x0].mo399r());
            return m380x0;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    @Override // ac.InterfaceC0074d
    /* renamed from: K0 */
    public C0073c mo373t(int i10) {
        C0086p m322B0 = m322B0(2);
        byte[] bArr = m322B0.f305a;
        int i11 = m322B0.f307c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        m322B0.f307c = i12 + 1;
        this.f270o += 2;
        return this;
    }

    /* renamed from: L0 */
    public C0073c m338L0(String str, int i10, int i11, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i10);
        }
        if (i11 >= i10) {
            if (i11 <= str.length()) {
                if (charset != null) {
                    if (charset.equals(C0092v.f320a)) {
                        return m341N0(str, i10, i11);
                    }
                    byte[] bytes = str.substring(i10, i11).getBytes(charset);
                    return mo357h(bytes, 0, bytes.length);
                }
                throw new IllegalArgumentException("charset == null");
            }
            throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
        }
        throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
    }

    @Override // ac.InterfaceC0074d
    /* renamed from: M0 */
    public C0073c mo350b0(String str) {
        return m341N0(str, 0, str.length());
    }

    /* renamed from: N0 */
    public C0073c m341N0(String str, int i10, int i11) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i10);
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
            }
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt < 128) {
                    C0086p m322B0 = m322B0(1);
                    byte[] bArr = m322B0.f305a;
                    int i12 = m322B0.f307c - i10;
                    int min = Math.min(i11, 8192 - i12);
                    int i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) charAt;
                    while (i13 < min) {
                        char charAt2 = str.charAt(i13);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i13 + i12] = (byte) charAt2;
                        i13++;
                    }
                    int i14 = m322B0.f307c;
                    int i15 = (i12 + i13) - i14;
                    m322B0.f307c = i14 + i15;
                    this.f270o += i15;
                    i10 = i13;
                } else {
                    if (charAt < 2048) {
                        mo330G((charAt >> 6) | 192);
                        mo330G((charAt & '?') | 128);
                    } else if (charAt >= 55296 && charAt <= 57343) {
                        int i16 = i10 + 1;
                        char charAt3 = i16 < i11 ? str.charAt(i16) : (char) 0;
                        if (charAt <= 56319 && charAt3 >= 56320 && charAt3 <= 57343) {
                            int i17 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 65536;
                            mo330G((i17 >> 18) | 240);
                            mo330G(((i17 >> 12) & 63) | 128);
                            mo330G(((i17 >> 6) & 63) | 128);
                            mo330G((i17 & 63) | 128);
                            i10 += 2;
                        } else {
                            mo330G(63);
                            i10 = i16;
                        }
                    } else {
                        mo330G((charAt >> '\f') | 224);
                        mo330G(((charAt >> 6) & 63) | 128);
                        mo330G((charAt & '?') | 128);
                    }
                    i10++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
    }

    /* renamed from: O0 */
    public C0073c m342O0(int i10) {
        if (i10 < 128) {
            mo330G(i10);
        } else if (i10 < 2048) {
            mo330G((i10 >> 6) | 192);
            mo330G((i10 & 63) | 128);
        } else if (i10 < 65536) {
            if (i10 >= 55296 && i10 <= 57343) {
                mo330G(63);
            } else {
                mo330G((i10 >> 12) | 224);
                mo330G(((i10 >> 6) & 63) | 128);
                mo330G((i10 & 63) | 128);
            }
        } else if (i10 <= 1114111) {
            mo330G((i10 >> 18) | 240);
            mo330G(((i10 >> 12) & 63) | 128);
            mo330G(((i10 >> 6) & 63) | 128);
            mo330G((i10 & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i10));
        }
        return this;
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: P */
    public short mo343P() {
        return C0092v.m455d(readShort());
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        r1 = new ac.C0073c().mo351c0(r3).mo330G(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r8 != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: " + r1.m374t0());
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b9, code lost:
    
        r17.f270o -= r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bf, code lost:
    
        if (r8 == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c3, code lost:
    
        return -r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    @Override // ac.InterfaceC0075e
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo345S() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.f270o
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto Lc4
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            r5 = -7
            r7 = 0
            r8 = 0
            r9 = 0
        L14:
            ac.p r10 = r0.f269n
            byte[] r11 = r10.f305a
            int r12 = r10.f306b
            int r13 = r10.f307c
        L1c:
            if (r12 >= r13) goto L9d
            r15 = r11[r12]
            r14 = 48
            if (r15 < r14) goto L6a
            r14 = 57
            if (r15 > r14) goto L6a
            int r14 = 48 - r15
            int r16 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r16 < 0) goto L3d
            if (r16 != 0) goto L36
            long r1 = (long) r14
            int r16 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r16 >= 0) goto L36
            goto L3d
        L36:
            r1 = 10
            long r3 = r3 * r1
            long r1 = (long) r14
            long r3 = r3 + r1
            goto L74
        L3d:
            ac.c r1 = new ac.c
            r1.<init>()
            ac.c r1 = r1.mo351c0(r3)
            ac.c r1 = r1.mo330G(r15)
            if (r8 != 0) goto L4f
            r1.readByte()
        L4f:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number too large: "
            r3.append(r4)
            java.lang.String r1 = r1.m374t0()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L6a:
            r1 = 45
            if (r15 != r1) goto L7e
            if (r7 != 0) goto L7e
            r1 = 1
            long r5 = r5 - r1
            r8 = 1
        L74:
            int r12 = r12 + 1
            int r7 = r7 + 1
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            goto L1c
        L7e:
            if (r7 == 0) goto L82
            r9 = 1
            goto L9d
        L82:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected leading [0-9] or '-' character but was 0x"
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r15)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L9d:
            if (r12 != r13) goto La9
            ac.p r1 = r10.m442b()
            r0.f269n = r1
            ac.C0087q.m447a(r10)
            goto Lab
        La9:
            r10.f306b = r12
        Lab:
            if (r9 != 0) goto Lb9
            ac.p r1 = r0.f269n
            if (r1 != 0) goto Lb2
            goto Lb9
        Lb2:
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            goto L14
        Lb9:
            long r1 = r0.f270o
            long r5 = (long) r7
            long r1 = r1 - r5
            r0.f270o = r1
            if (r8 == 0) goto Lc2
            goto Lc3
        Lc2:
            long r3 = -r3
        Lc3:
            return r3
        Lc4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "size == 0"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.C0073c.mo345S():long");
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: U */
    public String mo346U(long j10) throws EOFException {
        if (j10 >= 0) {
            long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
            long m364n0 = m364n0((byte) 10, 0L, j11);
            if (m364n0 != -1) {
                return m378w0(m364n0);
            }
            if (j11 < m381y0() && m362m0(j11 - 1) == 13 && m362m0(j11) == 10) {
                return m378w0(j11);
            }
            C0073c c0073c = new C0073c();
            m360k0(c0073c, 0L, Math.min(32L, m381y0()));
            throw new EOFException("\\n not found: limit=" + Math.min(m381y0(), j10) + " content=" + c0073c.m370r0().mo393k() + (char) 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j10);
    }

    @Override // ac.InterfaceC0090t
    /* renamed from: V */
    public long mo315V(C0073c c0073c, long j10) {
        if (c0073c == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j10 >= 0) {
            long j11 = this.f270o;
            if (j11 == 0) {
                return -1L;
            }
            if (j10 > j11) {
                j10 = j11;
            }
            c0073c.mo313C(this, j10);
            return j10;
        }
        throw new IllegalArgumentException("byteCount < 0: " + j10);
    }

    /* renamed from: Y */
    public final void m347Y() {
        try {
            mo369r(this.f270o);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // ac.InterfaceC0075e, ac.InterfaceC0074d
    /* renamed from: a */
    public C0073c mo348a() {
        return this;
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: a0 */
    public void mo349a0(long j10) throws EOFException {
        if (this.f270o < j10) {
            throw new EOFException();
        }
    }

    @Override // ac.InterfaceC0090t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: d */
    public C0073c mo352d() {
        return this;
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: d0 */
    public long mo353d0(byte b10) {
        return m364n0(b10, 0L, Long.MAX_VALUE);
    }

    /* renamed from: e0 */
    public C0073c clone() {
        C0073c c0073c = new C0073c();
        if (this.f270o == 0) {
            return c0073c;
        }
        C0086p m444d = this.f269n.m444d();
        c0073c.f269n = m444d;
        m444d.f311g = m444d;
        m444d.f310f = m444d;
        C0086p c0086p = this.f269n;
        while (true) {
            c0086p = c0086p.f310f;
            if (c0086p != this.f269n) {
                c0073c.f269n.f311g.m443c(c0086p.m444d());
            } else {
                c0073c.f270o = this.f270o;
                return c0073c;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0073c)) {
            return false;
        }
        C0073c c0073c = (C0073c) obj;
        long j10 = this.f270o;
        if (j10 != c0073c.f270o) {
            return false;
        }
        long j11 = 0;
        if (j10 == 0) {
            return true;
        }
        C0086p c0086p = this.f269n;
        C0086p c0086p2 = c0073c.f269n;
        int i10 = c0086p.f306b;
        int i11 = c0086p2.f306b;
        while (j11 < this.f270o) {
            long min = Math.min(c0086p.f307c - i10, c0086p2.f307c - i11);
            int i12 = 0;
            while (i12 < min) {
                int i13 = i10 + 1;
                int i14 = i11 + 1;
                if (c0086p.f305a[i10] != c0086p2.f305a[i11]) {
                    return false;
                }
                i12++;
                i10 = i13;
                i11 = i14;
            }
            if (i10 == c0086p.f307c) {
                c0086p = c0086p.f310f;
                i10 = c0086p.f306b;
            }
            if (i11 == c0086p2.f307c) {
                c0086p2 = c0086p2.f310f;
                i11 = c0086p2.f306b;
            }
            j11 += min;
        }
        return true;
    }

    @Override // ac.InterfaceC0090t
    /* renamed from: f */
    public C0091u mo316f() {
        return C0091u.f316d;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5 A[EDGE_INSN: B:41:0x00a5->B:38:0x00a5 BREAK  A[LOOP:0: B:4:0x000b->B:40:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    @Override // ac.InterfaceC0075e
    /* renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo355f0() {
        /*
            r15 = this;
            long r0 = r15.f270o
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lac
            r0 = 0
            r4 = r2
            r1 = 0
        Lb:
            ac.p r6 = r15.f269n
            byte[] r7 = r6.f305a
            int r8 = r6.f306b
            int r9 = r6.f307c
        L13:
            if (r8 >= r9) goto L91
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L3a
        L22:
            r11 = 97
            if (r10 < r11) goto L2f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2f
            int r11 = r10 + (-97)
        L2c:
            int r11 = r11 + 10
            goto L3a
        L2f:
            r11 = 65
            if (r10 < r11) goto L72
            r11 = 70
            if (r10 > r11) goto L72
            int r11 = r10 + (-65)
            goto L2c
        L3a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L4a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L13
        L4a:
            ac.c r0 = new ac.c
            r0.<init>()
            ac.c r0 = r0.mo363n(r4)
            ac.c r0 = r0.mo330G(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.m374t0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L72:
            if (r0 == 0) goto L76
            r1 = 1
            goto L91
        L76:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L91:
            if (r8 != r9) goto L9d
            ac.p r7 = r6.m442b()
            r15.f269n = r7
            ac.C0087q.m447a(r6)
            goto L9f
        L9d:
            r6.f306b = r8
        L9f:
            if (r1 != 0) goto La5
            ac.p r6 = r15.f269n
            if (r6 != 0) goto Lb
        La5:
            long r1 = r15.f270o
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f270o = r1
            return r4
        Lac:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.C0073c.mo355f0():long");
    }

    @Override // ac.InterfaceC0074d, ac.InterfaceC0089s, java.io.Flushable
    public void flush() {
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: g0 */
    public String mo356g0(Charset charset) {
        try {
            return m372s0(this.f270o, charset);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public int hashCode() {
        C0086p c0086p = this.f269n;
        if (c0086p == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = c0086p.f307c;
            for (int i12 = c0086p.f306b; i12 < i11; i12++) {
                i10 = (i10 * 31) + c0086p.f305a[i12];
            }
            c0086p = c0086p.f310f;
        } while (c0086p != this.f269n);
        return i10;
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: i0 */
    public InputStream mo358i0() {
        return new b();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    /* renamed from: j0 */
    public final long m359j0() {
        long j10 = this.f270o;
        if (j10 == 0) {
            return 0L;
        }
        C0086p c0086p = this.f269n.f311g;
        return (c0086p.f307c >= 8192 || !c0086p.f309e) ? j10 : j10 - (r3 - c0086p.f306b);
    }

    /* renamed from: k0 */
    public final C0073c m360k0(C0073c c0073c, long j10, long j11) {
        if (c0073c != null) {
            C0092v.m453b(this.f270o, j10, j11);
            if (j11 == 0) {
                return this;
            }
            c0073c.f270o += j11;
            C0086p c0086p = this.f269n;
            while (true) {
                int i10 = c0086p.f307c;
                int i11 = c0086p.f306b;
                if (j10 < i10 - i11) {
                    break;
                }
                j10 -= i10 - i11;
                c0086p = c0086p.f310f;
            }
            while (j11 > 0) {
                C0086p m444d = c0086p.m444d();
                int i12 = (int) (m444d.f306b + j10);
                m444d.f306b = i12;
                m444d.f307c = Math.min(i12 + ((int) j11), m444d.f307c);
                C0086p c0086p2 = c0073c.f269n;
                if (c0086p2 == null) {
                    m444d.f311g = m444d;
                    m444d.f310f = m444d;
                    c0073c.f269n = m444d;
                } else {
                    c0086p2.f311g.m443c(m444d);
                }
                j11 -= m444d.f307c - m444d.f306b;
                c0086p = c0086p.f310f;
                j10 = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // ac.InterfaceC0074d
    /* renamed from: l0 */
    public C0073c mo344R() {
        return this;
    }

    /* renamed from: m0 */
    public final byte m362m0(long j10) {
        int i10;
        C0092v.m453b(this.f270o, j10, 1L);
        long j11 = this.f270o;
        if (j11 - j10 > j10) {
            C0086p c0086p = this.f269n;
            while (true) {
                int i11 = c0086p.f307c;
                int i12 = c0086p.f306b;
                long j12 = i11 - i12;
                if (j10 < j12) {
                    return c0086p.f305a[i12 + ((int) j10)];
                }
                j10 -= j12;
                c0086p = c0086p.f310f;
            }
        } else {
            long j13 = j10 - j11;
            C0086p c0086p2 = this.f269n;
            do {
                c0086p2 = c0086p2.f311g;
                int i13 = c0086p2.f307c;
                i10 = c0086p2.f306b;
                j13 += i13 - i10;
            } while (j13 < 0);
            return c0086p2.f305a[i10 + ((int) j13)];
        }
    }

    /* renamed from: n0 */
    public long m364n0(byte b10, long j10, long j11) {
        C0086p c0086p;
        long j12 = 0;
        if (j10 >= 0 && j11 >= j10) {
            long j13 = this.f270o;
            long j14 = j11 > j13 ? j13 : j11;
            if (j10 == j14 || (c0086p = this.f269n) == null) {
                return -1L;
            }
            if (j13 - j10 < j10) {
                while (j13 > j10) {
                    c0086p = c0086p.f311g;
                    j13 -= c0086p.f307c - c0086p.f306b;
                }
            } else {
                while (true) {
                    long j15 = (c0086p.f307c - c0086p.f306b) + j12;
                    if (j15 >= j10) {
                        break;
                    }
                    c0086p = c0086p.f310f;
                    j12 = j15;
                }
                j13 = j12;
            }
            long j16 = j10;
            while (j13 < j14) {
                byte[] bArr = c0086p.f305a;
                int min = (int) Math.min(c0086p.f307c, (c0086p.f306b + j14) - j13);
                for (int i10 = (int) ((c0086p.f306b + j16) - j13); i10 < min; i10++) {
                    if (bArr[i10] == b10) {
                        return (i10 - c0086p.f306b) + j13;
                    }
                }
                j13 += c0086p.f307c - c0086p.f306b;
                c0086p = c0086p.f310f;
                j16 = j13;
            }
            return -1L;
        }
        throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f270o), Long.valueOf(j10), Long.valueOf(j11)));
    }

    /* renamed from: o0 */
    public OutputStream m365o0() {
        return new a();
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: p */
    public C0076f mo366p(long j10) throws EOFException {
        return new C0076f(mo333I(j10));
    }

    /* renamed from: p0 */
    public int m367p0(byte[] bArr, int i10, int i11) {
        C0092v.m453b(bArr.length, i10, i11);
        C0086p c0086p = this.f269n;
        if (c0086p == null) {
            return -1;
        }
        int min = Math.min(i11, c0086p.f307c - c0086p.f306b);
        System.arraycopy(c0086p.f305a, c0086p.f306b, bArr, i10, min);
        int i12 = c0086p.f306b + min;
        c0086p.f306b = i12;
        this.f270o -= min;
        if (i12 == c0086p.f307c) {
            this.f269n = c0086p.m442b();
            C0087q.m447a(c0086p);
        }
        return min;
    }

    /* renamed from: q0 */
    public byte[] m368q0() {
        try {
            return mo333I(this.f270o);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: r */
    public void mo369r(long j10) throws EOFException {
        while (j10 > 0) {
            if (this.f269n != null) {
                int min = (int) Math.min(j10, r0.f307c - r0.f306b);
                long j11 = min;
                this.f270o -= j11;
                j10 -= j11;
                C0086p c0086p = this.f269n;
                int i10 = c0086p.f306b + min;
                c0086p.f306b = i10;
                if (i10 == c0086p.f307c) {
                    this.f269n = c0086p.m442b();
                    C0087q.m447a(c0086p);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: r0 */
    public C0076f m370r0() {
        return new C0076f(m368q0());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        C0086p c0086p = this.f269n;
        if (c0086p == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), c0086p.f307c - c0086p.f306b);
        byteBuffer.put(c0086p.f305a, c0086p.f306b, min);
        int i10 = c0086p.f306b + min;
        c0086p.f306b = i10;
        this.f270o -= min;
        if (i10 == c0086p.f307c) {
            this.f269n = c0086p.m442b();
            C0087q.m447a(c0086p);
        }
        return min;
    }

    @Override // ac.InterfaceC0075e
    public byte readByte() {
        long j10 = this.f270o;
        if (j10 != 0) {
            C0086p c0086p = this.f269n;
            int i10 = c0086p.f306b;
            int i11 = c0086p.f307c;
            int i12 = i10 + 1;
            byte b10 = c0086p.f305a[i10];
            this.f270o = j10 - 1;
            if (i12 == i11) {
                this.f269n = c0086p.m442b();
                C0087q.m447a(c0086p);
            } else {
                c0086p.f306b = i12;
            }
            return b10;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override // ac.InterfaceC0075e
    public void readFully(byte[] bArr) throws EOFException {
        int i10 = 0;
        while (i10 < bArr.length) {
            int m367p0 = m367p0(bArr, i10, bArr.length - i10);
            if (m367p0 == -1) {
                throw new EOFException();
            }
            i10 += m367p0;
        }
    }

    @Override // ac.InterfaceC0075e
    public int readInt() {
        long j10 = this.f270o;
        if (j10 >= 4) {
            C0086p c0086p = this.f269n;
            int i10 = c0086p.f306b;
            int i11 = c0086p.f307c;
            if (i11 - i10 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = c0086p.f305a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
            int i15 = i13 + 1;
            int i16 = i14 | ((bArr[i13] & 255) << 8);
            int i17 = i15 + 1;
            int i18 = i16 | (bArr[i15] & 255);
            this.f270o = j10 - 4;
            if (i17 == i11) {
                this.f269n = c0086p.m442b();
                C0087q.m447a(c0086p);
            } else {
                c0086p.f306b = i17;
            }
            return i18;
        }
        throw new IllegalStateException("size < 4: " + this.f270o);
    }

    @Override // ac.InterfaceC0075e
    public short readShort() {
        long j10 = this.f270o;
        if (j10 >= 2) {
            C0086p c0086p = this.f269n;
            int i10 = c0086p.f306b;
            int i11 = c0086p.f307c;
            if (i11 - i10 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = c0086p.f305a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & 255) << 8) | (bArr[i12] & 255);
            this.f270o = j10 - 2;
            if (i13 == i11) {
                this.f269n = c0086p.m442b();
                C0087q.m447a(c0086p);
            } else {
                c0086p.f306b = i13;
            }
            return (short) i14;
        }
        throw new IllegalStateException("size < 2: " + this.f270o);
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: s */
    public long mo371s(InterfaceC0089s interfaceC0089s) throws IOException {
        long j10 = this.f270o;
        if (j10 > 0) {
            interfaceC0089s.mo313C(this, j10);
        }
        return j10;
    }

    /* renamed from: s0 */
    public String m372s0(long j10, Charset charset) throws EOFException {
        C0092v.m453b(this.f270o, 0L, j10);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j10 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j10);
        }
        if (j10 == 0) {
            return BuildConfig.FLAVOR;
        }
        C0086p c0086p = this.f269n;
        int i10 = c0086p.f306b;
        if (i10 + j10 > c0086p.f307c) {
            return new String(mo333I(j10), charset);
        }
        String str = new String(c0086p.f305a, i10, (int) j10, charset);
        int i11 = (int) (c0086p.f306b + j10);
        c0086p.f306b = i11;
        this.f270o -= j10;
        if (i11 == c0086p.f307c) {
            this.f269n = c0086p.m442b();
            C0087q.m447a(c0086p);
        }
        return str;
    }

    /* renamed from: t0 */
    public String m374t0() {
        try {
            return m372s0(this.f270o, C0092v.f320a);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public String toString() {
        return m382z0().toString();
    }

    @Override // ac.InterfaceC0075e
    /* renamed from: u */
    public boolean mo375u(long j10) {
        return this.f270o >= j10;
    }

    /* renamed from: u0 */
    public String m376u0(long j10) throws EOFException {
        return m372s0(j10, C0092v.f320a);
    }

    /* renamed from: v0 */
    public int m377v0() throws EOFException {
        int i10;
        int i11;
        int i12;
        if (this.f270o != 0) {
            byte m362m0 = m362m0(0L);
            if ((m362m0 & 128) == 0) {
                i10 = m362m0 & Byte.MAX_VALUE;
                i11 = 1;
                i12 = 0;
            } else if ((m362m0 & 224) == 192) {
                i10 = m362m0 & 31;
                i11 = 2;
                i12 = 128;
            } else if ((m362m0 & 240) == 224) {
                i10 = m362m0 & 15;
                i11 = 3;
                i12 = 2048;
            } else {
                if ((m362m0 & 248) != 240) {
                    mo369r(1L);
                    return 65533;
                }
                i10 = m362m0 & 7;
                i11 = 4;
                i12 = 65536;
            }
            long j10 = i11;
            if (this.f270o >= j10) {
                for (int i13 = 1; i13 < i11; i13++) {
                    long j11 = i13;
                    byte m362m02 = m362m0(j11);
                    if ((m362m02 & 192) != 128) {
                        mo369r(j11);
                        return 65533;
                    }
                    i10 = (i10 << 6) | (m362m02 & 63);
                }
                mo369r(j10);
                if (i10 > 1114111) {
                    return 65533;
                }
                if ((i10 < 55296 || i10 > 57343) && i10 >= i12) {
                    return i10;
                }
                return 65533;
            }
            throw new EOFException("size < " + i11 + ": " + this.f270o + " (to read code point prefixed 0x" + Integer.toHexString(m362m0) + ")");
        }
        throw new EOFException();
    }

    /* renamed from: w0 */
    public String m378w0(long j10) throws EOFException {
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (m362m0(j11) == 13) {
                String m376u0 = m376u0(j11);
                mo369r(2L);
                return m376u0;
            }
        }
        String m376u02 = m376u0(j10);
        mo369r(1L);
        return m376u02;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i10 = remaining;
            while (i10 > 0) {
                C0086p m322B0 = m322B0(1);
                int min = Math.min(i10, 8192 - m322B0.f307c);
                byteBuffer.get(m322B0.f305a, m322B0.f307c, min);
                i10 -= min;
                m322B0.f307c += min;
            }
            this.f270o += remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0055, code lost:
    
        if (r19 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0058, code lost:
    
        return r11;
     */
    /* renamed from: x0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m380x0(ac.C0083m r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 161
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.C0073c.m380x0(ac.m, boolean):int");
    }

    /* renamed from: y0 */
    public final long m381y0() {
        return this.f270o;
    }

    /* renamed from: z0 */
    public final C0076f m382z0() {
        long j10 = this.f270o;
        if (j10 <= 2147483647L) {
            return m320A0((int) j10);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f270o);
    }
}
