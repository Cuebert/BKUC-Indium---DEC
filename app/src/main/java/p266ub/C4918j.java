package p266ub;

import ac.C0073c;
import ac.InterfaceC0074d;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p205pb.C4286e;
import p266ub.C4912d;

/* renamed from: ub.j */
/* loaded from: classes.dex */
final class C4918j implements Closeable {

    /* renamed from: t */
    private static final Logger f18941t = Logger.getLogger(C4913e.class.getName());

    /* renamed from: n */
    private final InterfaceC0074d f18942n;

    /* renamed from: o */
    private final boolean f18943o;

    /* renamed from: p */
    private final C0073c f18944p;

    /* renamed from: q */
    private int f18945q;

    /* renamed from: r */
    private boolean f18946r;

    /* renamed from: s */
    final C4912d.b f18947s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4918j(InterfaceC0074d interfaceC0074d, boolean z10) {
        this.f18942n = interfaceC0074d;
        this.f18943o = z10;
        C0073c c0073c = new C0073c();
        this.f18944p = c0073c;
        this.f18947s = new C4912d.b(c0073c);
        this.f18945q = 16384;
    }

    /* renamed from: j0 */
    private void m19291j0(int i10, long j10) throws IOException {
        while (j10 > 0) {
            int min = (int) Math.min(this.f18945q, j10);
            long j11 = min;
            j10 -= j11;
            m19304l(i10, min, (byte) 9, j10 == 0 ? (byte) 4 : (byte) 0);
            this.f18942n.mo313C(this.f18944p, j11);
        }
    }

    /* renamed from: k0 */
    private static void m19292k0(InterfaceC0074d interfaceC0074d, int i10) throws IOException {
        interfaceC0074d.mo330G((i10 >>> 16) & 255);
        interfaceC0074d.mo330G((i10 >>> 8) & 255);
        interfaceC0074d.mo330G(i10 & 255);
    }

    /* renamed from: O */
    public synchronized void m19293O(boolean z10, int i10, List<C4911c> list) throws IOException {
        if (!this.f18946r) {
            this.f18947s.m19193g(list);
            long m381y0 = this.f18944p.m381y0();
            int min = (int) Math.min(this.f18945q, m381y0);
            long j10 = min;
            byte b10 = m381y0 == j10 ? (byte) 4 : (byte) 0;
            if (z10) {
                b10 = (byte) (b10 | 1);
            }
            m19304l(i10, min, (byte) 1, b10);
            this.f18942n.mo313C(this.f18944p, j10);
            if (m381y0 > j10) {
                m19291j0(i10, m381y0 - j10);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: Q */
    public int m19294Q() {
        return this.f18945q;
    }

    /* renamed from: T */
    public synchronized void m19295T(boolean z10, int i10, int i11) throws IOException {
        if (!this.f18946r) {
            m19304l(0, 8, (byte) 6, z10 ? (byte) 1 : (byte) 0);
            this.f18942n.mo379x(i10);
            this.f18942n.mo379x(i11);
            this.f18942n.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: W */
    public synchronized void m19296W(int i10, int i11, List<C4911c> list) throws IOException {
        if (!this.f18946r) {
            this.f18947s.m19193g(list);
            long m381y0 = this.f18944p.m381y0();
            int min = (int) Math.min(this.f18945q - 4, m381y0);
            long j10 = min;
            m19304l(i10, min + 4, (byte) 5, m381y0 == j10 ? (byte) 4 : (byte) 0);
            this.f18942n.mo379x(i11 & Integer.MAX_VALUE);
            this.f18942n.mo313C(this.f18944p, j10);
            if (m381y0 > j10) {
                m19291j0(i10, m381y0 - j10);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: X */
    public synchronized void m19297X(int i10, EnumC4910b enumC4910b) throws IOException {
        if (!this.f18946r) {
            if (enumC4910b.f18793n != -1) {
                m19304l(i10, 4, (byte) 3, (byte) 0);
                this.f18942n.mo379x(enumC4910b.f18793n);
                this.f18942n.flush();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: Y */
    public synchronized void m19298Y(C4921m c4921m) throws IOException {
        if (!this.f18946r) {
            int i10 = 0;
            m19304l(0, c4921m.m19325j() * 6, (byte) 4, (byte) 0);
            while (i10 < 10) {
                if (c4921m.m19322g(i10)) {
                    this.f18942n.mo373t(i10 == 4 ? 3 : i10 == 7 ? 4 : i10);
                    this.f18942n.mo379x(c4921m.m19317b(i10));
                }
                i10++;
            }
            this.f18942n.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: b */
    public synchronized void m19299b(C4921m c4921m) throws IOException {
        if (!this.f18946r) {
            this.f18945q = c4921m.m19321f(this.f18945q);
            if (c4921m.m19318c() != -1) {
                this.f18947s.m19191e(c4921m.m19318c());
            }
            m19304l(0, 0, (byte) 4, (byte) 1);
            this.f18942n.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: c */
    public synchronized void m19300c() throws IOException {
        if (!this.f18946r) {
            if (this.f18943o) {
                Logger logger = f18941t;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C4286e.m17753q(">> CONNECTION %s", C4913e.f18823a.mo393k()));
                }
                this.f18942n.mo339M(C4913e.f18823a.mo403v());
                this.f18942n.flush();
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f18946r = true;
        this.f18942n.close();
    }

    /* renamed from: e */
    public synchronized void m19301e(boolean z10, int i10, C0073c c0073c, int i11) throws IOException {
        if (!this.f18946r) {
            m19303i(i10, z10 ? (byte) 1 : (byte) 0, c0073c, i11);
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: e0 */
    public synchronized void m19302e0(int i10, long j10) throws IOException {
        if (this.f18946r) {
            throw new IOException("closed");
        }
        if (j10 != 0 && j10 <= 2147483647L) {
            m19304l(i10, 4, (byte) 8, (byte) 0);
            this.f18942n.mo379x((int) j10);
            this.f18942n.flush();
        } else {
            throw C4913e.m19197c("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j10));
        }
    }

    public synchronized void flush() throws IOException {
        if (!this.f18946r) {
            this.f18942n.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: i */
    void m19303i(int i10, byte b10, C0073c c0073c, int i11) throws IOException {
        m19304l(i10, i11, (byte) 0, b10);
        if (i11 > 0) {
            this.f18942n.mo313C(c0073c, i11);
        }
    }

    /* renamed from: l */
    public void m19304l(int i10, int i11, byte b10, byte b11) throws IOException {
        Logger logger = f18941t;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C4913e.m19196b(false, i10, i11, b10, b11));
        }
        int i12 = this.f18945q;
        if (i11 > i12) {
            throw C4913e.m19197c("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i12), Integer.valueOf(i11));
        }
        if ((Integer.MIN_VALUE & i10) != 0) {
            throw C4913e.m19197c("reserved bit set: %s", Integer.valueOf(i10));
        }
        m19292k0(this.f18942n, i11);
        this.f18942n.mo330G(b10 & 255);
        this.f18942n.mo330G(b11 & 255);
        this.f18942n.mo379x(i10 & Integer.MAX_VALUE);
    }

    /* renamed from: z */
    public synchronized void m19305z(int i10, EnumC4910b enumC4910b, byte[] bArr) throws IOException {
        if (!this.f18946r) {
            if (enumC4910b.f18793n != -1) {
                m19304l(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f18942n.mo379x(i10);
                this.f18942n.mo379x(enumC4910b.f18793n);
                if (bArr.length > 0) {
                    this.f18942n.mo339M(bArr);
                }
                this.f18942n.flush();
            } else {
                throw C4913e.m19197c("errorCode.httpCode == -1", new Object[0]);
            }
        } else {
            throw new IOException("closed");
        }
    }
}
