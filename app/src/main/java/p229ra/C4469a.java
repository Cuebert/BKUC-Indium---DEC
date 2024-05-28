package p229ra;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ra.a */
/* loaded from: classes.dex */
public class C4469a {

    /* renamed from: g */
    private static final Logger f18065g = Logger.getLogger(C4469a.class.getName());

    /* renamed from: h */
    private static final byte[] f18066h = new byte[4096];

    /* renamed from: a */
    final RandomAccessFile f18067a;

    /* renamed from: b */
    int f18068b;

    /* renamed from: c */
    private int f18069c;

    /* renamed from: d */
    private b f18070d;

    /* renamed from: e */
    private b f18071e;

    /* renamed from: f */
    private final byte[] f18072f = new byte[16];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ra.a$a */
    /* loaded from: classes.dex */
    public class a implements d {

        /* renamed from: a */
        boolean f18073a = true;

        /* renamed from: b */
        final /* synthetic */ StringBuilder f18074b;

        a(StringBuilder sb2) {
            this.f18074b = sb2;
        }

        @Override // p229ra.C4469a.d
        /* renamed from: a */
        public void mo18336a(InputStream inputStream, int i10) throws IOException {
            if (this.f18073a) {
                this.f18073a = false;
            } else {
                this.f18074b.append(", ");
            }
            this.f18074b.append(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ra.a$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: c */
        static final b f18076c = new b(0, 0);

        /* renamed from: a */
        final int f18077a;

        /* renamed from: b */
        final int f18078b;

        b(int i10, int i11) {
            this.f18077a = i10;
            this.f18078b = i11;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f18077a + ", length = " + this.f18078b + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ra.a$c */
    /* loaded from: classes.dex */
    public final class c extends InputStream {

        /* renamed from: n */
        private int f18079n;

        /* renamed from: o */
        private int f18080o;

        /* synthetic */ c(C4469a c4469a, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            C4469a.m18315k(bArr, "buffer");
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f18080o;
                if (i12 <= 0) {
                    return -1;
                }
                if (i11 > i12) {
                    i11 = i12;
                }
                C4469a.this.m18322s(this.f18079n, bArr, i10, i11);
                this.f18079n = C4469a.this.m18326w(this.f18079n + i11);
                this.f18080o -= i11;
                return i11;
            }
            throw new ArrayIndexOutOfBoundsException();
        }

        private c(b bVar) {
            this.f18079n = C4469a.this.m18326w(bVar.f18077a + 4);
            this.f18080o = bVar.f18078b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f18080o == 0) {
                return -1;
            }
            C4469a.this.f18067a.seek(this.f18079n);
            int read = C4469a.this.f18067a.read();
            this.f18079n = C4469a.this.m18326w(this.f18079n + 1);
            this.f18080o--;
            return read;
        }
    }

    /* renamed from: ra.a$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        void mo18336a(InputStream inputStream, int i10) throws IOException;
    }

    public C4469a(File file) throws IOException {
        if (!file.exists()) {
            m18314i(file);
        }
        this.f18067a = m18316l(file);
        m18318n();
    }

    /* renamed from: g */
    private void m18313g(int i10) throws IOException {
        int i11 = i10 + 4;
        int m18320p = m18320p();
        if (m18320p >= i11) {
            return;
        }
        int i12 = this.f18068b;
        do {
            m18320p += i12;
            i12 <<= 1;
        } while (m18320p < i11);
        m18324u(i12);
        b bVar = this.f18071e;
        int m18326w = m18326w(bVar.f18077a + 4 + bVar.f18078b);
        if (m18326w <= this.f18070d.f18077a) {
            FileChannel channel = this.f18067a.getChannel();
            channel.position(this.f18068b);
            int i13 = m18326w - 16;
            long j10 = i13;
            if (channel.transferTo(16L, j10, channel) == j10) {
                m18321r(16, i13);
            } else {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i14 = this.f18071e.f18077a;
        int i15 = this.f18070d.f18077a;
        if (i14 < i15) {
            int i16 = (this.f18068b + i14) - 16;
            m18327x(i12, this.f18069c, i15, i16);
            this.f18071e = new b(i16, this.f18071e.f18078b);
        } else {
            m18327x(i12, this.f18069c, i15, i14);
        }
        this.f18068b = i12;
    }

    /* renamed from: i */
    private static void m18314i(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile m18316l = m18316l(file2);
        try {
            m18316l.setLength(4096L);
            m18316l.seek(0L);
            byte[] bArr = new byte[16];
            m18329z(bArr, 4096, 0, 0, 0);
            m18316l.write(bArr);
            m18316l.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            m18316l.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static <T> T m18315k(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    /* renamed from: l */
    private static RandomAccessFile m18316l(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: m */
    private b m18317m(int i10) throws IOException {
        if (i10 == 0) {
            return b.f18076c;
        }
        m18322s(i10, this.f18072f, 0, 4);
        return new b(i10, m18319o(this.f18072f, 0));
    }

    /* renamed from: n */
    private void m18318n() throws IOException {
        this.f18067a.seek(0L);
        this.f18067a.readFully(this.f18072f);
        int m18319o = m18319o(this.f18072f, 0);
        this.f18068b = m18319o;
        if (m18319o <= this.f18067a.length()) {
            if (this.f18068b != 0) {
                this.f18069c = m18319o(this.f18072f, 4);
                int m18319o2 = m18319o(this.f18072f, 8);
                int m18319o3 = m18319o(this.f18072f, 12);
                this.f18070d = m18317m(m18319o2);
                this.f18071e = m18317m(m18319o3);
                return;
            }
            throw new IOException("File is corrupt; length stored in header is 0.");
        }
        throw new IOException("File is truncated. Expected length: " + this.f18068b + ", Actual length: " + this.f18067a.length());
    }

    /* renamed from: o */
    private static int m18319o(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    /* renamed from: p */
    private int m18320p() {
        return this.f18068b - m18325v();
    }

    /* renamed from: r */
    private void m18321r(int i10, int i11) throws IOException {
        while (i11 > 0) {
            byte[] bArr = f18066h;
            int min = Math.min(i11, bArr.length);
            m18323t(i10, bArr, 0, min);
            i11 -= min;
            i10 += min;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m18322s(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int m18326w = m18326w(i10);
        int i13 = m18326w + i12;
        int i14 = this.f18068b;
        if (i13 <= i14) {
            this.f18067a.seek(m18326w);
            this.f18067a.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - m18326w;
        this.f18067a.seek(m18326w);
        this.f18067a.readFully(bArr, i11, i15);
        this.f18067a.seek(16L);
        this.f18067a.readFully(bArr, i11 + i15, i12 - i15);
    }

    /* renamed from: t */
    private void m18323t(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int m18326w = m18326w(i10);
        int i13 = m18326w + i12;
        int i14 = this.f18068b;
        if (i13 <= i14) {
            this.f18067a.seek(m18326w);
            this.f18067a.write(bArr, i11, i12);
            return;
        }
        int i15 = i14 - m18326w;
        this.f18067a.seek(m18326w);
        this.f18067a.write(bArr, i11, i15);
        this.f18067a.seek(16L);
        this.f18067a.write(bArr, i11 + i15, i12 - i15);
    }

    /* renamed from: u */
    private void m18324u(int i10) throws IOException {
        this.f18067a.setLength(i10);
        this.f18067a.getChannel().force(true);
    }

    /* renamed from: v */
    private int m18325v() {
        if (this.f18069c == 0) {
            return 16;
        }
        b bVar = this.f18071e;
        int i10 = bVar.f18077a;
        int i11 = this.f18070d.f18077a;
        if (i10 >= i11) {
            return (i10 - i11) + 4 + bVar.f18078b + 16;
        }
        return (((i10 + 4) + bVar.f18078b) + this.f18068b) - i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public int m18326w(int i10) {
        int i11 = this.f18068b;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    /* renamed from: x */
    private void m18327x(int i10, int i11, int i12, int i13) throws IOException {
        m18329z(this.f18072f, i10, i11, i12, i13);
        this.f18067a.seek(0L);
        this.f18067a.write(this.f18072f);
    }

    /* renamed from: y */
    private static void m18328y(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    /* renamed from: z */
    private static void m18329z(byte[] bArr, int... iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            m18328y(bArr, i10, i11);
            i10 += 4;
        }
    }

    /* renamed from: d */
    public void m18330d(byte[] bArr) throws IOException {
        m18331e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public synchronized void m18331e(byte[] bArr, int i10, int i11) throws IOException {
        int m18326w;
        m18315k(bArr, "buffer");
        if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
            m18313g(i11);
            boolean m18334j = m18334j();
            if (m18334j) {
                m18326w = 16;
            } else {
                b bVar = this.f18071e;
                m18326w = m18326w(bVar.f18077a + 4 + bVar.f18078b);
            }
            b bVar2 = new b(m18326w, i11);
            m18328y(this.f18072f, 0, i11);
            m18323t(bVar2.f18077a, this.f18072f, 0, 4);
            m18323t(bVar2.f18077a + 4, bArr, i10, i11);
            m18327x(this.f18068b, this.f18069c + 1, m18334j ? bVar2.f18077a : this.f18070d.f18077a, bVar2.f18077a);
            this.f18071e = bVar2;
            this.f18069c++;
            if (m18334j) {
                this.f18070d = bVar2;
            }
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: f */
    public synchronized void m18332f() throws IOException {
        this.f18067a.seek(0L);
        this.f18067a.write(f18066h);
        m18327x(4096, 0, 0, 0);
        this.f18069c = 0;
        b bVar = b.f18076c;
        this.f18070d = bVar;
        this.f18071e = bVar;
        if (this.f18068b > 4096) {
            m18324u(4096);
        }
        this.f18068b = 4096;
    }

    /* renamed from: h */
    public synchronized void m18333h(d dVar) throws IOException {
        int i10 = this.f18070d.f18077a;
        for (int i11 = 0; i11 < this.f18069c; i11++) {
            b m18317m = m18317m(i10);
            dVar.mo18336a(new c(this, m18317m, null), m18317m.f18078b);
            i10 = m18326w(m18317m.f18077a + 4 + m18317m.f18078b);
        }
    }

    /* renamed from: j */
    public synchronized boolean m18334j() {
        return this.f18069c == 0;
    }

    /* renamed from: q */
    public synchronized void m18335q() throws IOException {
        if (!m18334j()) {
            if (this.f18069c == 1) {
                m18332f();
            } else {
                b bVar = this.f18070d;
                int i10 = bVar.f18078b + 4;
                m18321r(bVar.f18077a, i10);
                int m18326w = m18326w(this.f18070d.f18077a + i10);
                m18322s(m18326w, this.f18072f, 0, 4);
                int m18319o = m18319o(this.f18072f, 0);
                m18327x(this.f18068b, this.f18069c - 1, m18326w, this.f18071e.f18077a);
                this.f18069c--;
                this.f18070d = new b(m18326w, m18319o);
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.f18068b);
        sb2.append(", size=");
        sb2.append(this.f18069c);
        sb2.append(", first=");
        sb2.append(this.f18070d);
        sb2.append(", last=");
        sb2.append(this.f18071e);
        sb2.append(", element lengths=[");
        try {
            m18333h(new a(sb2));
        } catch (IOException e10) {
            f18065g.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }
}
