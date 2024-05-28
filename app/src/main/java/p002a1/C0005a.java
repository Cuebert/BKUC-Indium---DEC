package p002a1;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* renamed from: a1.a */
/* loaded from: classes.dex */
public class C0005a {

    /* renamed from: T */
    private static SimpleDateFormat f22T;

    /* renamed from: U */
    private static SimpleDateFormat f23U;

    /* renamed from: Y */
    private static final d[] f27Y;

    /* renamed from: Z */
    private static final d[] f28Z;

    /* renamed from: a0 */
    private static final d[] f29a0;

    /* renamed from: b0 */
    private static final d[] f30b0;

    /* renamed from: c0 */
    private static final d[] f31c0;

    /* renamed from: d0 */
    private static final d f32d0;

    /* renamed from: e0 */
    private static final d[] f33e0;

    /* renamed from: f0 */
    private static final d[] f34f0;

    /* renamed from: g0 */
    private static final d[] f35g0;

    /* renamed from: h0 */
    private static final d[] f36h0;

    /* renamed from: i0 */
    static final d[][] f37i0;

    /* renamed from: j0 */
    private static final d[] f38j0;

    /* renamed from: k0 */
    private static final d f39k0;

    /* renamed from: l0 */
    private static final d f40l0;

    /* renamed from: m0 */
    private static final HashMap<Integer, d>[] f41m0;

    /* renamed from: n0 */
    private static final HashMap<String, d>[] f42n0;

    /* renamed from: o0 */
    private static final HashSet<String> f43o0;

    /* renamed from: p0 */
    private static final HashMap<Integer, Integer> f44p0;

    /* renamed from: q0 */
    static final Charset f45q0;

    /* renamed from: r0 */
    static final byte[] f46r0;

    /* renamed from: s0 */
    private static final byte[] f47s0;

    /* renamed from: t0 */
    private static final Pattern f48t0;

    /* renamed from: u0 */
    private static final Pattern f50u0;

    /* renamed from: v0 */
    private static final Pattern f52v0;

    /* renamed from: w0 */
    private static final Pattern f54w0;

    /* renamed from: a */
    private String f58a;

    /* renamed from: b */
    private FileDescriptor f59b;

    /* renamed from: c */
    private AssetManager.AssetInputStream f60c;

    /* renamed from: d */
    private int f61d;

    /* renamed from: e */
    private boolean f62e;

    /* renamed from: f */
    private final HashMap<String, c>[] f63f;

    /* renamed from: g */
    private Set<Integer> f64g;

    /* renamed from: h */
    private ByteOrder f65h;

    /* renamed from: i */
    private boolean f66i;

    /* renamed from: j */
    private boolean f67j;

    /* renamed from: k */
    private boolean f68k;

    /* renamed from: l */
    private int f69l;

    /* renamed from: m */
    private int f70m;

    /* renamed from: n */
    private byte[] f71n;

    /* renamed from: o */
    private int f72o;

    /* renamed from: p */
    private int f73p;

    /* renamed from: q */
    private int f74q;

    /* renamed from: r */
    private int f75r;

    /* renamed from: s */
    private int f76s;

    /* renamed from: t */
    private boolean f77t;

    /* renamed from: u */
    private static final boolean f49u = Log.isLoggable("ExifInterface", 3);

    /* renamed from: v */
    private static final List<Integer> f51v = Arrays.asList(1, 6, 3, 8);

    /* renamed from: w */
    private static final List<Integer> f53w = Arrays.asList(2, 7, 4, 5);

    /* renamed from: x */
    public static final int[] f55x = {8, 8, 8};

    /* renamed from: y */
    public static final int[] f56y = {4};

    /* renamed from: z */
    public static final int[] f57z = {8};

    /* renamed from: A */
    static final byte[] f3A = {-1, -40, -1};

    /* renamed from: B */
    private static final byte[] f4B = {102, 116, 121, 112};

    /* renamed from: C */
    private static final byte[] f5C = {109, 105, 102, 49};

    /* renamed from: D */
    private static final byte[] f6D = {104, 101, 105, 99};

    /* renamed from: E */
    private static final byte[] f7E = {79, 76, 89, 77, 80, 0};

    /* renamed from: F */
    private static final byte[] f8F = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: G */
    private static final byte[] f9G = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: H */
    private static final byte[] f10H = {101, 88, 73, 102};

    /* renamed from: I */
    private static final byte[] f11I = {73, 72, 68, 82};

    /* renamed from: J */
    private static final byte[] f12J = {73, 69, 78, 68};

    /* renamed from: K */
    private static final byte[] f13K = {82, 73, 70, 70};

    /* renamed from: L */
    private static final byte[] f14L = {87, 69, 66, 80};

    /* renamed from: M */
    private static final byte[] f15M = {69, 88, 73, 70};

    /* renamed from: N */
    private static final byte[] f16N = {-99, 1, 42};

    /* renamed from: O */
    private static final byte[] f17O = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: P */
    private static final byte[] f18P = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: Q */
    private static final byte[] f19Q = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: R */
    private static final byte[] f20R = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: S */
    private static final byte[] f21S = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: V */
    static final String[] f24V = {BuildConfig.FLAVOR, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: W */
    static final int[] f25W = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: X */
    static final byte[] f26X = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a1.a$a */
    /* loaded from: classes.dex */
    public class a extends MediaDataSource {

        /* renamed from: n */
        long f78n;

        /* renamed from: o */
        final /* synthetic */ b f79o;

        a(b bVar) {
            this.f79o = bVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j10, byte[] bArr, int i10, int i11) throws IOException {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f78n;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + this.f79o.available()) {
                        return -1;
                    }
                    this.f79o.m63i(j10);
                    this.f78n = j10;
                }
                if (i11 > this.f79o.available()) {
                    i11 = this.f79o.available();
                }
                int read = this.f79o.read(bArr, i10, i11);
                if (read >= 0) {
                    this.f78n += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f78n = -1L;
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a1.a$b */
    /* loaded from: classes.dex */
    public static class b extends InputStream implements DataInput {

        /* renamed from: r */
        private static final ByteOrder f81r = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: s */
        private static final ByteOrder f82s = ByteOrder.BIG_ENDIAN;

        /* renamed from: n */
        private DataInputStream f83n;

        /* renamed from: o */
        private ByteOrder f84o;

        /* renamed from: p */
        final int f85p;

        /* renamed from: q */
        int f86q;

        public b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f83n.available();
        }

        /* renamed from: b */
        public int m60b() {
            return this.f85p;
        }

        /* renamed from: c */
        public int m61c() {
            return this.f86q;
        }

        /* renamed from: e */
        public long m62e() throws IOException {
            return readInt() & 4294967295L;
        }

        /* renamed from: i */
        public void m63i(long j10) throws IOException {
            int i10 = this.f86q;
            if (i10 > j10) {
                this.f86q = 0;
                this.f83n.reset();
                this.f83n.mark(this.f85p);
            } else {
                j10 -= i10;
            }
            int i11 = (int) j10;
            if (skipBytes(i11) != i11) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        /* renamed from: l */
        public void m64l(ByteOrder byteOrder) {
            this.f84o = byteOrder;
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i10) {
            this.f83n.mark(i10);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.f86q++;
            return this.f83n.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.f86q++;
            return this.f83n.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            int i10 = this.f86q + 1;
            this.f86q = i10;
            if (i10 <= this.f85p) {
                int read = this.f83n.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.f86q += 2;
            return this.f83n.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f86q + i11;
            this.f86q = i12;
            if (i12 <= this.f85p) {
                if (this.f83n.read(bArr, i10, i11) != i11) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            int i10 = this.f86q + 4;
            this.f86q = i10;
            if (i10 <= this.f85p) {
                int read = this.f83n.read();
                int read2 = this.f83n.read();
                int read3 = this.f83n.read();
                int read4 = this.f83n.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f84o;
                    if (byteOrder == f81r) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f82s) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException("Invalid byte order: " + this.f84o);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            int i10 = this.f86q + 8;
            this.f86q = i10;
            if (i10 <= this.f85p) {
                int read = this.f83n.read();
                int read2 = this.f83n.read();
                int read3 = this.f83n.read();
                int read4 = this.f83n.read();
                int read5 = this.f83n.read();
                int read6 = this.f83n.read();
                int read7 = this.f83n.read();
                int read8 = this.f83n.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f84o;
                    if (byteOrder == f81r) {
                        return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f82s) {
                        return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                    }
                    throw new IOException("Invalid byte order: " + this.f84o);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            int i10 = this.f86q + 2;
            this.f86q = i10;
            if (i10 <= this.f85p) {
                int read = this.f83n.read();
                int read2 = this.f83n.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f84o;
                    if (byteOrder == f81r) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f82s) {
                        return (short) ((read << 8) + read2);
                    }
                    throw new IOException("Invalid byte order: " + this.f84o);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.f86q += 2;
            return this.f83n.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.f86q++;
            return this.f83n.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            int i10 = this.f86q + 2;
            this.f86q = i10;
            if (i10 <= this.f85p) {
                int read = this.f83n.read();
                int read2 = this.f83n.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f84o;
                    if (byteOrder == f81r) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f82s) {
                        return (read << 8) + read2;
                    }
                    throw new IOException("Invalid byte order: " + this.f84o);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int skipBytes(int i10) throws IOException {
            int min = Math.min(i10, this.f85p - this.f86q);
            int i11 = 0;
            while (i11 < min) {
                i11 += this.f83n.skipBytes(min - i11);
            }
            this.f86q += i11;
            return i11;
        }

        b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f84o = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f83n = dataInputStream;
            int available = dataInputStream.available();
            this.f85p = available;
            this.f86q = 0;
            this.f83n.mark(available);
            this.f84o = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int read = this.f83n.read(bArr, i10, i11);
            this.f86q += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            int length = this.f86q + bArr.length;
            this.f86q = length;
            if (length <= this.f85p) {
                if (this.f83n.read(bArr, 0, bArr.length) != bArr.length) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        public b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a1.a$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final int f87a;

        /* renamed from: b */
        public final int f88b;

        /* renamed from: c */
        public final long f89c;

        /* renamed from: d */
        public final byte[] f90d;

        c(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        /* renamed from: a */
        public static c m65a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(C0005a.f45q0);
            return new c(2, bytes.length, bytes);
        }

        /* renamed from: b */
        public static c m66b(long j10, ByteOrder byteOrder) {
            return m67c(new long[]{j10}, byteOrder);
        }

        /* renamed from: c */
        public static c m67c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C0005a.f25W[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j10 : jArr) {
                wrap.putInt((int) j10);
            }
            return new c(4, jArr.length, wrap.array());
        }

        /* renamed from: d */
        public static c m68d(e eVar, ByteOrder byteOrder) {
            return m69e(new e[]{eVar}, byteOrder);
        }

        /* renamed from: e */
        public static c m69e(e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C0005a.f25W[5] * eVarArr.length]);
            wrap.order(byteOrder);
            for (e eVar : eVarArr) {
                wrap.putInt((int) eVar.f95a);
                wrap.putInt((int) eVar.f96b);
            }
            return new c(5, eVarArr.length, wrap.array());
        }

        /* renamed from: f */
        public static c m70f(int i10, ByteOrder byteOrder) {
            return m71g(new int[]{i10}, byteOrder);
        }

        /* renamed from: g */
        public static c m71g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C0005a.f25W[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putShort((short) i10);
            }
            return new c(3, iArr.length, wrap.array());
        }

        /* renamed from: h */
        public double m72h(ByteOrder byteOrder) {
            Object m75k = m75k(byteOrder);
            if (m75k != null) {
                if (m75k instanceof String) {
                    return Double.parseDouble((String) m75k);
                }
                if (m75k instanceof long[]) {
                    if (((long[]) m75k).length == 1) {
                        return r5[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (m75k instanceof int[]) {
                    if (((int[]) m75k).length == 1) {
                        return r5[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (m75k instanceof double[]) {
                    double[] dArr = (double[]) m75k;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (m75k instanceof e[]) {
                    e[] eVarArr = (e[]) m75k;
                    if (eVarArr.length == 1) {
                        return eVarArr[0].m77a();
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                throw new NumberFormatException("Couldn't find a double value");
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        /* renamed from: i */
        public int m73i(ByteOrder byteOrder) {
            Object m75k = m75k(byteOrder);
            if (m75k != null) {
                if (m75k instanceof String) {
                    return Integer.parseInt((String) m75k);
                }
                if (m75k instanceof long[]) {
                    long[] jArr = (long[]) m75k;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (m75k instanceof int[]) {
                    int[] iArr = (int[]) m75k;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                throw new NumberFormatException("Couldn't find a integer value");
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        /* renamed from: j */
        public String m74j(ByteOrder byteOrder) {
            Object m75k = m75k(byteOrder);
            if (m75k == null) {
                return null;
            }
            if (m75k instanceof String) {
                return (String) m75k;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (m75k instanceof long[]) {
                long[] jArr = (long[]) m75k;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (m75k instanceof int[]) {
                int[] iArr = (int[]) m75k;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (m75k instanceof double[]) {
                double[] dArr = (double[]) m75k;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (!(m75k instanceof e[])) {
                return null;
            }
            e[] eVarArr = (e[]) m75k;
            while (i10 < eVarArr.length) {
                sb2.append(eVarArr[i10].f95a);
                sb2.append('/');
                sb2.append(eVarArr[i10].f96b);
                i10++;
                if (i10 != eVarArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x019c: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:169:0x019c */
        /* JADX WARN: Removed duplicated region for block: B:172:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        java.lang.Object m75k(java.nio.ByteOrder r11) {
            /*
                Method dump skipped, instructions count: 452
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p002a1.C0005a.c.m75k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + C0005a.f24V[this.f87a] + ", data length:" + this.f90d.length + ")";
        }

        c(int i10, int i11, long j10, byte[] bArr) {
            this.f87a = i10;
            this.f88b = i11;
            this.f89c = j10;
            this.f90d = bArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a1.a$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        public final long f95a;

        /* renamed from: b */
        public final long f96b;

        e(long j10, long j11) {
            if (j11 == 0) {
                this.f95a = 0L;
                this.f96b = 1L;
            } else {
                this.f95a = j10;
                this.f96b = j11;
            }
        }

        /* renamed from: a */
        public double m77a() {
            return this.f95a / this.f96b;
        }

        public String toString() {
            return this.f95a + "/" + this.f96b;
        }
    }

    static {
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        f27Y = dVarArr;
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f28Z = dVarArr2;
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        f29a0 = dVarArr3;
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        f30b0 = dVarArr4;
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f31c0 = dVarArr5;
        f32d0 = new d("StripOffsets", 273, 3);
        d[] dVarArr6 = {new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)};
        f33e0 = dVarArr6;
        d[] dVarArr7 = {new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)};
        f34f0 = dVarArr7;
        d[] dVarArr8 = {new d("AspectFrame", 4371, 3)};
        f35g0 = dVarArr8;
        d[] dVarArr9 = {new d("ColorSpace", 55, 3)};
        f36h0 = dVarArr9;
        d[][] dVarArr10 = {dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, dVarArr6, dVarArr7, dVarArr8, dVarArr9};
        f37i0 = dVarArr10;
        f38j0 = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f39k0 = new d("JPEGInterchangeFormat", 513, 4);
        f40l0 = new d("JPEGInterchangeFormatLength", 514, 4);
        f41m0 = new HashMap[dVarArr10.length];
        f42n0 = new HashMap[dVarArr10.length];
        f43o0 = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f44p0 = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        f45q0 = forName;
        f46r0 = "Exif\u0000\u0000".getBytes(forName);
        f47s0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f22T = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f23U = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr11 = f37i0;
            if (i10 < dVarArr11.length) {
                f41m0[i10] = new HashMap<>();
                f42n0[i10] = new HashMap<>();
                for (d dVar : dVarArr11[i10]) {
                    f41m0[i10].put(Integer.valueOf(dVar.f91a), dVar);
                    f42n0[i10].put(dVar.f92b, dVar);
                }
                i10++;
            } else {
                HashMap<Integer, Integer> hashMap = f44p0;
                d[] dVarArr12 = f38j0;
                hashMap.put(Integer.valueOf(dVarArr12[0].f91a), 5);
                hashMap.put(Integer.valueOf(dVarArr12[1].f91a), 1);
                hashMap.put(Integer.valueOf(dVarArr12[2].f91a), 2);
                hashMap.put(Integer.valueOf(dVarArr12[3].f91a), 3);
                hashMap.put(Integer.valueOf(dVarArr12[4].f91a), 7);
                hashMap.put(Integer.valueOf(dVarArr12[5].f91a), 8);
                f48t0 = Pattern.compile(".*[1-9].*");
                f50u0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f52v0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f54w0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public C0005a(InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    /* renamed from: A */
    private boolean m15A(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f9G;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    /* renamed from: B */
    private boolean m16B(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: C */
    private boolean m17C(byte[] bArr) throws IOException {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteOrder m25K = m25K(bVar);
            this.f65h = m25K;
            bVar.m64l(m25K);
            boolean z10 = bVar.readShort() == 85;
            bVar.close();
            return z10;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    /* renamed from: D */
    private static boolean m18D(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f49u) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    /* renamed from: E */
    private boolean m19E(HashMap hashMap) throws IOException {
        c cVar;
        int m73i;
        c cVar2 = (c) hashMap.get("BitsPerSample");
        if (cVar2 != null) {
            int[] iArr = (int[]) cVar2.m75k(this.f65h);
            int[] iArr2 = f55x;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f61d == 3 && (cVar = (c) hashMap.get("PhotometricInterpretation")) != null && (((m73i = cVar.m73i(this.f65h)) == 1 && Arrays.equals(iArr, f57z)) || (m73i == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f49u) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    /* renamed from: F */
    private boolean m20F(HashMap hashMap) throws IOException {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.m73i(this.f65h) <= 512 && cVar2.m73i(this.f65h) <= 512;
    }

    /* renamed from: G */
    private boolean m21G(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f13K;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = f14L;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f13K.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
                i10++;
            }
        }
    }

    /* renamed from: H */
    private void m22H(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "inputstream shouldn't be null");
        for (int i10 = 0; i10 < f37i0.length; i10++) {
            try {
                try {
                    this.f63f[i10] = new HashMap<>();
                } catch (IOException e10) {
                    boolean z10 = f49u;
                    if (z10) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e10);
                    }
                    m34a();
                    if (!z10) {
                        return;
                    }
                }
            } finally {
                m34a();
                if (f49u) {
                    m24J();
                }
            }
        }
        if (!this.f62e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f61d = m41m(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        b bVar = new b(inputStream);
        if (!this.f62e) {
            switch (this.f61d) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                case 11:
                    m45q(bVar);
                    break;
                case 4:
                    m40k(bVar, 0, 0);
                    m34a();
                    if (f49u) {
                        m24J();
                        return;
                    }
                    return;
                case 7:
                    m42n(bVar);
                    break;
                case 9:
                    m44p(bVar);
                    m34a();
                    if (f49u) {
                        m24J();
                        return;
                    }
                    return;
                case 10:
                    m46r(bVar);
                    m34a();
                    if (f49u) {
                        m24J();
                        return;
                    }
                    return;
                case 12:
                    m39j(bVar);
                    break;
                case 13:
                    m43o(bVar);
                    m34a();
                    if (f49u) {
                        m24J();
                        return;
                    }
                    return;
                case 14:
                    m48t(bVar);
                    m34a();
                    if (f49u) {
                        m24J();
                        return;
                    }
                    return;
            }
        } else {
            m47s(bVar);
        }
        bVar.m63i(this.f73p);
        m29O(bVar);
    }

    /* renamed from: I */
    private void m23I(b bVar, int i10) throws IOException {
        ByteOrder m25K = m25K(bVar);
        this.f65h = m25K;
        bVar.m64l(m25K);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i11 = this.f61d;
        if (i11 != 7 && i11 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt >= 8 && readInt < i10) {
            int i12 = readInt - 8;
            if (i12 <= 0 || bVar.skipBytes(i12) == i12) {
                return;
            }
            throw new IOException("Couldn't jump to first Ifd: " + i12);
        }
        throw new IOException("Invalid first Ifd offset: " + readInt);
    }

    /* renamed from: J */
    private void m24J() {
        for (int i10 = 0; i10 < this.f63f.length; i10++) {
            Log.d("ExifInterface", "The size of tag group[" + i10 + "]: " + this.f63f[i10].size());
            for (Map.Entry<String, c> entry : this.f63f[i10].entrySet()) {
                c value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.m74j(this.f65h) + "'");
            }
        }
    }

    /* renamed from: K */
    private ByteOrder m25K(b bVar) throws IOException {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f49u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (f49u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    /* renamed from: L */
    private void m26L(byte[] bArr, int i10) throws IOException {
        b bVar = new b(bArr);
        m23I(bVar, bArr.length);
        m27M(bVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02cc  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m27M(p002a1.C0005a.b r30, int r31) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1019
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p002a1.C0005a.m27M(a1.a$b, int):void");
    }

    /* renamed from: N */
    private void m28N(b bVar, int i10) throws IOException {
        c cVar = this.f63f[i10].get("ImageLength");
        c cVar2 = this.f63f[i10].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            c cVar3 = this.f63f[i10].get("JPEGInterchangeFormat");
            c cVar4 = this.f63f[i10].get("JPEGInterchangeFormatLength");
            if (cVar3 == null || cVar4 == null) {
                return;
            }
            int m73i = cVar3.m73i(this.f65h);
            int m73i2 = cVar3.m73i(this.f65h);
            bVar.m63i(m73i);
            byte[] bArr = new byte[m73i2];
            bVar.read(bArr);
            m40k(new b(bArr), m73i, i10);
        }
    }

    /* renamed from: O */
    private void m29O(b bVar) throws IOException {
        HashMap<String, c> hashMap = this.f63f[4];
        c cVar = hashMap.get("Compression");
        if (cVar != null) {
            int m73i = cVar.m73i(this.f65h);
            this.f72o = m73i;
            if (m73i != 1) {
                if (m73i == 6) {
                    m49u(bVar, hashMap);
                    return;
                } else if (m73i != 7) {
                    return;
                }
            }
            if (m19E(hashMap)) {
                m50v(bVar, hashMap);
                return;
            }
            return;
        }
        this.f72o = 6;
        m49u(bVar, hashMap);
    }

    /* renamed from: P */
    private static boolean m30P(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr2.length; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Q */
    private void m31Q(int i10, int i11) throws IOException {
        if (!this.f63f[i10].isEmpty() && !this.f63f[i11].isEmpty()) {
            c cVar = this.f63f[i10].get("ImageLength");
            c cVar2 = this.f63f[i10].get("ImageWidth");
            c cVar3 = this.f63f[i11].get("ImageLength");
            c cVar4 = this.f63f[i11].get("ImageWidth");
            if (cVar == null || cVar2 == null) {
                if (f49u) {
                    Log.d("ExifInterface", "First image does not contain valid size information");
                    return;
                }
                return;
            }
            if (cVar3 != null && cVar4 != null) {
                int m73i = cVar.m73i(this.f65h);
                int m73i2 = cVar2.m73i(this.f65h);
                int m73i3 = cVar3.m73i(this.f65h);
                int m73i4 = cVar4.m73i(this.f65h);
                if (m73i >= m73i3 || m73i2 >= m73i4) {
                    return;
                }
                HashMap<String, c>[] hashMapArr = this.f63f;
                HashMap<String, c> hashMap = hashMapArr[i10];
                hashMapArr[i10] = hashMapArr[i11];
                hashMapArr[i11] = hashMap;
                return;
            }
            if (f49u) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        if (f49u) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    /* renamed from: R */
    private void m32R(b bVar, int i10) throws IOException {
        c m70f;
        c m70f2;
        c cVar = this.f63f[i10].get("DefaultCropSize");
        c cVar2 = this.f63f[i10].get("SensorTopBorder");
        c cVar3 = this.f63f[i10].get("SensorLeftBorder");
        c cVar4 = this.f63f[i10].get("SensorBottomBorder");
        c cVar5 = this.f63f[i10].get("SensorRightBorder");
        if (cVar == null) {
            if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
                int m73i = cVar2.m73i(this.f65h);
                int m73i2 = cVar4.m73i(this.f65h);
                int m73i3 = cVar5.m73i(this.f65h);
                int m73i4 = cVar3.m73i(this.f65h);
                if (m73i2 <= m73i || m73i3 <= m73i4) {
                    return;
                }
                c m70f3 = c.m70f(m73i2 - m73i, this.f65h);
                c m70f4 = c.m70f(m73i3 - m73i4, this.f65h);
                this.f63f[i10].put("ImageLength", m70f3);
                this.f63f[i10].put("ImageWidth", m70f4);
                return;
            }
            m28N(bVar, i10);
            return;
        }
        if (cVar.f87a == 5) {
            e[] eVarArr = (e[]) cVar.m75k(this.f65h);
            if (eVarArr != null && eVarArr.length == 2) {
                m70f = c.m68d(eVarArr[0], this.f65h);
                m70f2 = c.m68d(eVarArr[1], this.f65h);
            } else {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                return;
            }
        } else {
            int[] iArr = (int[]) cVar.m75k(this.f65h);
            if (iArr != null && iArr.length == 2) {
                m70f = c.m70f(iArr[0], this.f65h);
                m70f2 = c.m70f(iArr[1], this.f65h);
            } else {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
        }
        this.f63f[i10].put("ImageWidth", m70f);
        this.f63f[i10].put("ImageLength", m70f2);
    }

    /* renamed from: S */
    private void m33S() throws IOException {
        m31Q(0, 5);
        m31Q(0, 4);
        m31Q(5, 4);
        c cVar = this.f63f[1].get("PixelXDimension");
        c cVar2 = this.f63f[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            this.f63f[0].put("ImageWidth", cVar);
            this.f63f[0].put("ImageLength", cVar2);
        }
        if (this.f63f[4].isEmpty() && m20F(this.f63f[5])) {
            HashMap<String, c>[] hashMapArr = this.f63f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (m20F(this.f63f[4])) {
            return;
        }
        Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
    }

    /* renamed from: a */
    private void m34a() {
        String m56f = m56f("DateTimeOriginal");
        if (m56f != null && m56f("DateTime") == null) {
            this.f63f[0].put("DateTime", c.m65a(m56f));
        }
        if (m56f("ImageWidth") == null) {
            this.f63f[0].put("ImageWidth", c.m66b(0L, this.f65h));
        }
        if (m56f("ImageLength") == null) {
            this.f63f[0].put("ImageLength", c.m66b(0L, this.f65h));
        }
        if (m56f("Orientation") == null) {
            this.f63f[0].put("Orientation", c.m66b(0L, this.f65h));
        }
        if (m56f("LightSource") == null) {
            this.f63f[1].put("LightSource", c.m66b(0L, this.f65h));
        }
    }

    /* renamed from: b */
    private static String m35b(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            sb2.append(String.format("%02x", Byte.valueOf(b10)));
        }
        return sb2.toString();
    }

    /* renamed from: c */
    private static double m36c(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            double parseDouble = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            String[] split3 = split[1].split("/", -1);
            double parseDouble2 = Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim());
            String[] split4 = split[2].split("/", -1);
            double parseDouble3 = parseDouble + (parseDouble2 / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return parseDouble3;
            }
            return -parseDouble3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: d */
    private static long[] m37d(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                jArr[i10] = iArr[i10];
            }
            return jArr;
        }
        if (obj instanceof long[]) {
            return (long[]) obj;
        }
        return null;
    }

    /* renamed from: i */
    private c m38i(String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        if ("ISOSpeedRatings".equals(str)) {
            if (f49u) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < f37i0.length; i10++) {
            c cVar = this.f63f[i10].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: j */
    private void m39j(b bVar) throws IOException {
        String str;
        String str2;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                mediaMetadataRetriever.setDataSource(new a(bVar));
            } else {
                FileDescriptor fileDescriptor = this.f59b;
                if (fileDescriptor != null) {
                    mediaMetadataRetriever.setDataSource(fileDescriptor);
                } else {
                    String str3 = this.f58a;
                    if (str3 == null) {
                        return;
                    } else {
                        mediaMetadataRetriever.setDataSource(str3);
                    }
                }
            }
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            String str4 = null;
            if ("yes".equals(extractMetadata3)) {
                str4 = mediaMetadataRetriever.extractMetadata(29);
                str = mediaMetadataRetriever.extractMetadata(30);
                str2 = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(extractMetadata4)) {
                str4 = mediaMetadataRetriever.extractMetadata(18);
                str = mediaMetadataRetriever.extractMetadata(19);
                str2 = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str = null;
                str2 = null;
            }
            if (str4 != null) {
                this.f63f[0].put("ImageWidth", c.m70f(Integer.parseInt(str4), this.f65h));
            }
            if (str != null) {
                this.f63f[0].put("ImageLength", c.m70f(Integer.parseInt(str), this.f65h));
            }
            if (str2 != null) {
                int i10 = 1;
                int parseInt = Integer.parseInt(str2);
                if (parseInt == 90) {
                    i10 = 6;
                } else if (parseInt == 180) {
                    i10 = 3;
                } else if (parseInt == 270) {
                    i10 = 8;
                }
                this.f63f[0].put("Orientation", c.m70f(i10, this.f65h));
            }
            if (extractMetadata != null && extractMetadata2 != null) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 > 6) {
                    bVar.m63i(parseInt2);
                    byte[] bArr = new byte[6];
                    if (bVar.read(bArr) == 6) {
                        int i11 = parseInt2 + 6;
                        int i12 = parseInt3 - 6;
                        if (Arrays.equals(bArr, f46r0)) {
                            byte[] bArr2 = new byte[i12];
                            if (bVar.read(bArr2) == i12) {
                                this.f73p = i11;
                                m26L(bArr2, 0);
                            } else {
                                throw new IOException("Can't read exif");
                            }
                        } else {
                            throw new IOException("Invalid identifier");
                        }
                    } else {
                        throw new IOException("Can't read identifier");
                    }
                } else {
                    throw new IOException("Invalid exif length");
                }
            }
            if (f49u) {
                Log.d("ExifInterface", "Heif meta: " + str4 + "x" + str + ", rotation " + str2);
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a8, code lost:
    
        r22.m64l(r21.f65h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ad, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00b6. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bd A[FALL_THROUGH] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m40k(p002a1.C0005a.b r22, int r23, int r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p002a1.C0005a.m40k(a1.a$b, int, int):void");
    }

    /* renamed from: m */
    private int m41m(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m53y(bArr)) {
            return 4;
        }
        if (m16B(bArr)) {
            return 9;
        }
        if (m52x(bArr)) {
            return 12;
        }
        if (m54z(bArr)) {
            return 7;
        }
        if (m17C(bArr)) {
            return 10;
        }
        if (m15A(bArr)) {
            return 13;
        }
        return m21G(bArr) ? 14 : 0;
    }

    /* renamed from: n */
    private void m42n(b bVar) throws IOException {
        m45q(bVar);
        c cVar = this.f63f[1].get("MakerNote");
        if (cVar != null) {
            b bVar2 = new b(cVar.f90d);
            bVar2.m64l(this.f65h);
            byte[] bArr = f7E;
            byte[] bArr2 = new byte[bArr.length];
            bVar2.readFully(bArr2);
            bVar2.m63i(0L);
            byte[] bArr3 = f8F;
            byte[] bArr4 = new byte[bArr3.length];
            bVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                bVar2.m63i(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                bVar2.m63i(12L);
            }
            m27M(bVar2, 6);
            c cVar2 = this.f63f[7].get("PreviewImageStart");
            c cVar3 = this.f63f[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                this.f63f[5].put("JPEGInterchangeFormat", cVar2);
                this.f63f[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = this.f63f[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.m75k(this.f65h);
                if (iArr != null && iArr.length == 4) {
                    if (iArr[2] <= iArr[0] || iArr[3] <= iArr[1]) {
                        return;
                    }
                    int i10 = (iArr[2] - iArr[0]) + 1;
                    int i11 = (iArr[3] - iArr[1]) + 1;
                    if (i10 < i11) {
                        int i12 = i10 + i11;
                        i11 = i12 - i11;
                        i10 = i12 - i11;
                    }
                    c m70f = c.m70f(i10, this.f65h);
                    c m70f2 = c.m70f(i11, this.f65h);
                    this.f63f[0].put("ImageWidth", m70f);
                    this.f63f[0].put("ImageLength", m70f2);
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    /* renamed from: o */
    private void m43o(b bVar) throws IOException {
        if (f49u) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.mark(0);
        bVar.m64l(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f9G;
        bVar.skipBytes(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i10 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i11 = i10 + 4;
                    if (i11 == 16 && !Arrays.equals(bArr2, f11I)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (Arrays.equals(bArr2, f12J)) {
                        return;
                    }
                    if (Arrays.equals(bArr2, f10H)) {
                        byte[] bArr3 = new byte[readInt];
                        if (bVar.read(bArr3) == readInt) {
                            int readInt2 = bVar.readInt();
                            CRC32 crc32 = new CRC32();
                            crc32.update(bArr2);
                            crc32.update(bArr3);
                            if (((int) crc32.getValue()) == readInt2) {
                                this.f73p = i11;
                                m26L(bArr3, 0);
                                m33S();
                                m29O(new b(bArr3));
                                return;
                            }
                            throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + m35b(bArr2));
                    }
                    int i12 = readInt + 4;
                    bVar.skipBytes(i12);
                    length = i11 + i12;
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: p */
    private void m44p(b bVar) throws IOException {
        boolean z10 = f49u;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.mark(0);
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.m63i(i10);
        bVar.read(bArr4);
        m40k(new b(bArr4), i10, 5);
        bVar.m63i(i12);
        bVar.m64l(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i13 = 0; i13 < readInt; i13++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f32d0.f91a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c m70f = c.m70f(readShort, this.f65h);
                c m70f2 = c.m70f(readShort2, this.f65h);
                this.f63f[0].put("ImageLength", m70f);
                this.f63f[0].put("ImageWidth", m70f2);
                if (f49u) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.skipBytes(readUnsignedShort2);
        }
    }

    /* renamed from: q */
    private void m45q(b bVar) throws IOException {
        c cVar;
        m23I(bVar, bVar.available());
        m27M(bVar, 0);
        m32R(bVar, 0);
        m32R(bVar, 5);
        m32R(bVar, 4);
        m33S();
        if (this.f61d != 8 || (cVar = this.f63f[1].get("MakerNote")) == null) {
            return;
        }
        b bVar2 = new b(cVar.f90d);
        bVar2.m64l(this.f65h);
        bVar2.m63i(6L);
        m27M(bVar2, 9);
        c cVar2 = this.f63f[9].get("ColorSpace");
        if (cVar2 != null) {
            this.f63f[1].put("ColorSpace", cVar2);
        }
    }

    /* renamed from: r */
    private void m46r(b bVar) throws IOException {
        if (f49u) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + bVar);
        }
        m45q(bVar);
        c cVar = this.f63f[0].get("JpgFromRaw");
        if (cVar != null) {
            m40k(new b(cVar.f90d), (int) cVar.f89c, 5);
        }
        c cVar2 = this.f63f[0].get("ISO");
        c cVar3 = this.f63f[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        this.f63f[1].put("PhotographicSensitivity", cVar2);
    }

    /* renamed from: s */
    private void m47s(b bVar) throws IOException {
        byte[] bArr = f46r0;
        bVar.skipBytes(bArr.length);
        byte[] bArr2 = new byte[bVar.available()];
        bVar.readFully(bArr2);
        this.f73p = bArr.length;
        m26L(bArr2, 0);
    }

    /* renamed from: t */
    private void m48t(b bVar) throws IOException {
        if (f49u) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.mark(0);
        bVar.m64l(ByteOrder.LITTLE_ENDIAN);
        bVar.skipBytes(f13K.length);
        int readInt = bVar.readInt() + 8;
        int skipBytes = bVar.skipBytes(f14L.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) == 4) {
                    int readInt2 = bVar.readInt();
                    int i10 = skipBytes + 4 + 4;
                    if (Arrays.equals(f15M, bArr)) {
                        byte[] bArr2 = new byte[readInt2];
                        if (bVar.read(bArr2) == readInt2) {
                            this.f73p = i10;
                            m26L(bArr2, 0);
                            m29O(new b(bArr2));
                            return;
                        } else {
                            throw new IOException("Failed to read given length for given PNG chunk type: " + m35b(bArr));
                        }
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    int i11 = i10 + readInt2;
                    if (i11 == readInt) {
                        return;
                    }
                    if (i11 <= readInt) {
                        int skipBytes2 = bVar.skipBytes(readInt2);
                        if (skipBytes2 != readInt2) {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                        skipBytes = i10 + skipBytes2;
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* renamed from: u */
    private void m49u(b bVar, HashMap hashMap) throws IOException {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int m73i = cVar.m73i(this.f65h);
        int m73i2 = cVar2.m73i(this.f65h);
        if (this.f61d == 7) {
            m73i += this.f74q;
        }
        int min = Math.min(m73i2, bVar.m60b() - m73i);
        if (m73i > 0 && min > 0) {
            this.f66i = true;
            if (this.f58a == null && this.f60c == null && this.f59b == null) {
                byte[] bArr = new byte[min];
                bVar.skip(m73i);
                bVar.read(bArr);
                this.f71n = bArr;
            }
            this.f69l = m73i;
            this.f70m = min;
        }
        if (f49u) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + m73i + ", length: " + min);
        }
    }

    /* renamed from: v */
    private void m50v(b bVar, HashMap hashMap) throws IOException {
        c cVar = (c) hashMap.get("StripOffsets");
        c cVar2 = (c) hashMap.get("StripByteCounts");
        if (cVar == null || cVar2 == null) {
            return;
        }
        long[] m37d = m37d(cVar.m75k(this.f65h));
        long[] m37d2 = m37d(cVar2.m75k(this.f65h));
        if (m37d != null && m37d.length != 0) {
            if (m37d2 != null && m37d2.length != 0) {
                if (m37d.length != m37d2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j10 = 0;
                for (long j11 : m37d2) {
                    j10 += j11;
                }
                int i10 = (int) j10;
                byte[] bArr = new byte[i10];
                int i11 = 1;
                this.f68k = true;
                this.f67j = true;
                this.f66i = true;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (i12 < m37d.length) {
                    int i15 = (int) m37d[i12];
                    int i16 = (int) m37d2[i12];
                    if (i12 < m37d.length - i11 && i15 + i16 != m37d[i12 + 1]) {
                        this.f68k = false;
                    }
                    int i17 = i15 - i13;
                    if (i17 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j12 = i17;
                    if (bVar.skip(j12) != j12) {
                        Log.d("ExifInterface", "Failed to skip " + i17 + " bytes.");
                        return;
                    }
                    int i18 = i13 + i17;
                    byte[] bArr2 = new byte[i16];
                    if (bVar.read(bArr2) != i16) {
                        Log.d("ExifInterface", "Failed to read " + i16 + " bytes.");
                        return;
                    }
                    i13 = i18 + i16;
                    System.arraycopy(bArr2, 0, bArr, i14, i16);
                    i14 += i16;
                    i12++;
                    i11 = 1;
                }
                this.f71n = bArr;
                if (this.f68k) {
                    this.f69l = (int) m37d[0];
                    this.f70m = i10;
                    return;
                }
                return;
            }
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
    }

    /* renamed from: w */
    private static boolean m51w(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f46r0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i10 = 0;
        while (true) {
            byte[] bArr3 = f46r0;
            if (i10 >= bArr3.length) {
                return true;
            }
            if (bArr2[i10] != bArr3[i10]) {
                return false;
            }
            i10++;
        }
    }

    /* renamed from: x */
    private boolean m52x(byte[] bArr) throws IOException {
        b bVar;
        long readInt;
        byte[] bArr2;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
                try {
                    readInt = bVar.readInt();
                    bArr2 = new byte[4];
                    bVar.read(bArr2);
                } catch (Exception e10) {
                    e = e10;
                    bVar2 = bVar;
                    if (f49u) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (bVar2 != null) {
                        bVar2.close();
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e11) {
            e = e11;
        }
        if (!Arrays.equals(bArr2, f4B)) {
            bVar.close();
            return false;
        }
        long j10 = 16;
        if (readInt == 1) {
            readInt = bVar.readLong();
            if (readInt < 16) {
                bVar.close();
                return false;
            }
        } else {
            j10 = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j11 = readInt - j10;
        if (j11 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z10 = false;
        boolean z11 = false;
        for (long j12 = 0; j12 < j11 / 4; j12++) {
            if (bVar.read(bArr3) != 4) {
                bVar.close();
                return false;
            }
            if (j12 != 1) {
                if (Arrays.equals(bArr3, f5C)) {
                    z10 = true;
                } else if (Arrays.equals(bArr3, f6D)) {
                    z11 = true;
                }
                if (z10 && z11) {
                    bVar.close();
                    return true;
                }
            }
        }
        bVar.close();
        return false;
    }

    /* renamed from: y */
    private static boolean m53y(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f3A;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    /* renamed from: z */
    private boolean m54z(byte[] bArr) throws IOException {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteOrder m25K = m25K(bVar);
            this.f65h = m25K;
            bVar.m64l(m25K);
            short readShort = bVar.readShort();
            boolean z10 = readShort == 20306 || readShort == 21330;
            bVar.close();
            return z10;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    /* renamed from: e */
    public double m55e(double d10) {
        double m57g = m57g("GPSAltitude", -1.0d);
        int m58h = m58h("GPSAltitudeRef", -1);
        if (m57g < 0.0d || m58h < 0) {
            return d10;
        }
        return m57g * (m58h != 1 ? 1 : -1);
    }

    /* renamed from: f */
    public String m56f(String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        c m38i = m38i(str);
        if (m38i != null) {
            if (!f43o0.contains(str)) {
                return m38i.m74j(this.f65h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = m38i.f87a;
                if (i10 != 5 && i10 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + m38i.f87a);
                    return null;
                }
                e[] eVarArr = (e[]) m38i.m75k(this.f65h);
                if (eVarArr != null && eVarArr.length == 3) {
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) eVarArr[0].f95a) / ((float) eVarArr[0].f96b))), Integer.valueOf((int) (((float) eVarArr[1].f95a) / ((float) eVarArr[1].f96b))), Integer.valueOf((int) (((float) eVarArr[2].f95a) / ((float) eVarArr[2].f96b))));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                return null;
            }
            try {
                return Double.toString(m38i.m72h(this.f65h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: g */
    public double m57g(String str, double d10) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        c m38i = m38i(str);
        if (m38i == null) {
            return d10;
        }
        try {
            return m38i.m72h(this.f65h);
        } catch (NumberFormatException unused) {
            return d10;
        }
    }

    /* renamed from: h */
    public int m58h(String str, int i10) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        c m38i = m38i(str);
        if (m38i == null) {
            return i10;
        }
        try {
            return m38i.m73i(this.f65h);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    /* renamed from: l */
    public double[] m59l() {
        String m56f = m56f("GPSLatitude");
        String m56f2 = m56f("GPSLatitudeRef");
        String m56f3 = m56f("GPSLongitude");
        String m56f4 = m56f("GPSLongitudeRef");
        if (m56f == null || m56f2 == null || m56f3 == null || m56f4 == null) {
            return null;
        }
        try {
            return new double[]{m36c(m56f, m56f2), m36c(m56f3, m56f4)};
        } catch (IllegalArgumentException unused) {
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", m56f, m56f2, m56f3, m56f4));
            return null;
        }
    }

    public C0005a(InputStream inputStream, int i10) throws IOException {
        d[][] dVarArr = f37i0;
        this.f63f = new HashMap[dVarArr.length];
        this.f64g = new HashSet(dVarArr.length);
        this.f65h = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(inputStream, "inputStream cannot be null");
        this.f58a = null;
        if (i10 == 1) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            if (!m51w(bufferedInputStream)) {
                Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                return;
            }
            this.f62e = true;
            this.f60c = null;
            this.f59b = null;
            inputStream = bufferedInputStream;
        } else if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f60c = (AssetManager.AssetInputStream) inputStream;
            this.f59b = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (m18D(fileInputStream.getFD())) {
                    this.f60c = null;
                    this.f59b = fileInputStream.getFD();
                }
            }
            this.f60c = null;
            this.f59b = null;
        }
        m22H(inputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a1.a$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public final int f91a;

        /* renamed from: b */
        public final String f92b;

        /* renamed from: c */
        public final int f93c;

        /* renamed from: d */
        public final int f94d;

        d(String str, int i10, int i11) {
            this.f92b = str;
            this.f91a = i10;
            this.f93c = i11;
            this.f94d = -1;
        }

        /* renamed from: a */
        boolean m76a(int i10) {
            int i11;
            int i12 = this.f93c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f94d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            return (i12 == 12 || i11 == 12) && i10 == 11;
        }

        d(String str, int i10, int i11, int i12) {
            this.f92b = str;
            this.f91a = i10;
            this.f93c = i11;
            this.f94d = i12;
        }
    }
}
