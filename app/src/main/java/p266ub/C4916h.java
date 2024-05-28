package p266ub;

import ac.C0073c;
import ac.C0076f;
import ac.C0091u;
import ac.InterfaceC0075e;
import ac.InterfaceC0090t;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p205pb.C4286e;
import p266ub.C4912d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ub.h */
/* loaded from: classes.dex */
public final class C4916h implements Closeable {

    /* renamed from: r */
    static final Logger f18905r = Logger.getLogger(C4913e.class.getName());

    /* renamed from: n */
    private final InterfaceC0075e f18906n;

    /* renamed from: o */
    private final a f18907o;

    /* renamed from: p */
    private final boolean f18908p;

    /* renamed from: q */
    final C4912d.a f18909q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ub.h$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC0090t {

        /* renamed from: n */
        private final InterfaceC0075e f18910n;

        /* renamed from: o */
        int f18911o;

        /* renamed from: p */
        byte f18912p;

        /* renamed from: q */
        int f18913q;

        /* renamed from: r */
        int f18914r;

        /* renamed from: s */
        short f18915s;

        a(InterfaceC0075e interfaceC0075e) {
            this.f18910n = interfaceC0075e;
        }

        /* renamed from: b */
        private void m19267b() throws IOException {
            int i10 = this.f18913q;
            int m19253Q = C4916h.m19253Q(this.f18910n);
            this.f18914r = m19253Q;
            this.f18911o = m19253Q;
            byte readByte = (byte) (this.f18910n.readByte() & 255);
            this.f18912p = (byte) (this.f18910n.readByte() & 255);
            Logger logger = C4916h.f18905r;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C4913e.m19196b(true, this.f18913q, this.f18911o, readByte, this.f18912p));
            }
            int readInt = this.f18910n.readInt() & Integer.MAX_VALUE;
            this.f18913q = readInt;
            if (readByte != 9) {
                throw C4913e.m19198d("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
            }
            if (readInt != i10) {
                throw C4913e.m19198d("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // ac.InterfaceC0090t
        /* renamed from: V */
        public long mo315V(C0073c c0073c, long j10) throws IOException {
            while (true) {
                int i10 = this.f18914r;
                if (i10 == 0) {
                    this.f18910n.mo369r(this.f18915s);
                    this.f18915s = (short) 0;
                    if ((this.f18912p & 4) != 0) {
                        return -1L;
                    }
                    m19267b();
                } else {
                    long mo315V = this.f18910n.mo315V(c0073c, Math.min(j10, i10));
                    if (mo315V == -1) {
                        return -1L;
                    }
                    this.f18914r = (int) (this.f18914r - mo315V);
                    return mo315V;
                }
            }
        }

        @Override // ac.InterfaceC0090t, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // ac.InterfaceC0090t
        /* renamed from: f */
        public C0091u mo316f() {
            return this.f18910n.mo316f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ub.h$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo19239a();

        /* renamed from: b */
        void mo19240b(boolean z10, int i10, int i11);

        /* renamed from: c */
        void mo19241c(int i10, int i11, int i12, boolean z10);

        /* renamed from: d */
        void mo19242d(boolean z10, C4921m c4921m);

        /* renamed from: e */
        void mo19243e(boolean z10, int i10, int i11, List<C4911c> list);

        /* renamed from: f */
        void mo19244f(int i10, EnumC4910b enumC4910b, C0076f c0076f);

        /* renamed from: g */
        void mo19245g(int i10, EnumC4910b enumC4910b);

        /* renamed from: h */
        void mo19246h(int i10, long j10);

        /* renamed from: i */
        void mo19247i(int i10, int i11, List<C4911c> list) throws IOException;

        /* renamed from: j */
        void mo19248j(boolean z10, int i10, InterfaceC0075e interfaceC0075e, int i11) throws IOException;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4916h(InterfaceC0075e interfaceC0075e, boolean z10) {
        this.f18906n = interfaceC0075e;
        this.f18908p = z10;
        a aVar = new a(interfaceC0075e);
        this.f18907o = aVar;
        this.f18909q = new C4912d.a(4096, aVar);
    }

    /* renamed from: O */
    private void m19252O(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i11 != 0) {
            boolean z10 = (b10 & 1) != 0;
            short readByte = (b10 & 8) != 0 ? (short) (this.f18906n.readByte() & 255) : (short) 0;
            if ((b10 & 32) != 0) {
                m19255W(bVar, i11);
                i10 -= 5;
            }
            bVar.mo19243e(z10, i11, -1, m19264z(m19258b(i10, b10, readByte), readByte, b10, i11));
            return;
        }
        throw C4913e.m19198d("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
    }

    /* renamed from: Q */
    static int m19253Q(InterfaceC0075e interfaceC0075e) throws IOException {
        return (interfaceC0075e.readByte() & 255) | ((interfaceC0075e.readByte() & 255) << 16) | ((interfaceC0075e.readByte() & 255) << 8);
    }

    /* renamed from: T */
    private void m19254T(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i10 != 8) {
            throw C4913e.m19198d("TYPE_PING length != 8: %s", Integer.valueOf(i10));
        }
        if (i11 == 0) {
            bVar.mo19240b((b10 & 1) != 0, this.f18906n.readInt(), this.f18906n.readInt());
            return;
        }
        throw C4913e.m19198d("TYPE_PING streamId != 0", new Object[0]);
    }

    /* renamed from: W */
    private void m19255W(b bVar, int i10) throws IOException {
        int readInt = this.f18906n.readInt();
        bVar.mo19241c(i10, readInt & Integer.MAX_VALUE, (this.f18906n.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    /* renamed from: X */
    private void m19256X(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i10 != 5) {
            throw C4913e.m19198d("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i10));
        }
        if (i11 != 0) {
            m19255W(bVar, i11);
            return;
        }
        throw C4913e.m19198d("TYPE_PRIORITY streamId == 0", new Object[0]);
    }

    /* renamed from: Y */
    private void m19257Y(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i11 != 0) {
            short readByte = (b10 & 8) != 0 ? (short) (this.f18906n.readByte() & 255) : (short) 0;
            bVar.mo19247i(i11, this.f18906n.readInt() & Integer.MAX_VALUE, m19264z(m19258b(i10 - 4, b10, readByte), readByte, b10, i11));
            return;
        }
        throw C4913e.m19198d("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
    }

    /* renamed from: b */
    static int m19258b(int i10, byte b10, short s10) throws IOException {
        if ((b10 & 8) != 0) {
            i10--;
        }
        if (s10 <= i10) {
            return (short) (i10 - s10);
        }
        throw C4913e.m19198d("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s10), Integer.valueOf(i10));
    }

    /* renamed from: e0 */
    private void m19259e0(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i10 != 4) {
            throw C4913e.m19198d("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i10));
        }
        if (i11 != 0) {
            int readInt = this.f18906n.readInt();
            EnumC4910b m19167b = EnumC4910b.m19167b(readInt);
            if (m19167b == null) {
                throw C4913e.m19198d("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            }
            bVar.mo19245g(i11, m19167b);
            return;
        }
        throw C4913e.m19198d("TYPE_RST_STREAM streamId == 0", new Object[0]);
    }

    /* renamed from: i */
    private void m19260i(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i11 == 0) {
            throw C4913e.m19198d("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        }
        boolean z10 = (b10 & 1) != 0;
        if (!((b10 & 32) != 0)) {
            short readByte = (b10 & 8) != 0 ? (short) (this.f18906n.readByte() & 255) : (short) 0;
            bVar.mo19248j(z10, i11, this.f18906n, m19258b(i10, b10, readByte));
            this.f18906n.mo369r(readByte);
            return;
        }
        throw C4913e.m19198d("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
    }

    /* renamed from: j0 */
    private void m19261j0(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i11 != 0) {
            throw C4913e.m19198d("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((b10 & 1) != 0) {
            if (i10 == 0) {
                bVar.mo19239a();
                return;
            }
            throw C4913e.m19198d("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
        }
        if (i10 % 6 != 0) {
            throw C4913e.m19198d("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i10));
        }
        C4921m c4921m = new C4921m();
        for (int i12 = 0; i12 < i10; i12 += 6) {
            int readShort = this.f18906n.readShort() & 65535;
            int readInt = this.f18906n.readInt();
            if (readShort != 2) {
                if (readShort == 3) {
                    readShort = 4;
                } else if (readShort == 4) {
                    readShort = 7;
                    if (readInt < 0) {
                        throw C4913e.m19198d("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                    }
                } else if (readShort == 5 && (readInt < 16384 || readInt > 16777215)) {
                    throw C4913e.m19198d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                }
            } else if (readInt != 0 && readInt != 1) {
                throw C4913e.m19198d("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
            }
            c4921m.m19324i(readShort, readInt);
        }
        bVar.mo19242d(false, c4921m);
    }

    /* renamed from: k0 */
    private void m19262k0(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i10 != 4) {
            throw C4913e.m19198d("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i10));
        }
        long readInt = this.f18906n.readInt() & 2147483647L;
        if (readInt == 0) {
            throw C4913e.m19198d("windowSizeIncrement was 0", Long.valueOf(readInt));
        }
        bVar.mo19246h(i11, readInt);
    }

    /* renamed from: l */
    private void m19263l(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i10 < 8) {
            throw C4913e.m19198d("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i10));
        }
        if (i11 == 0) {
            int readInt = this.f18906n.readInt();
            int readInt2 = this.f18906n.readInt();
            int i12 = i10 - 8;
            EnumC4910b m19167b = EnumC4910b.m19167b(readInt2);
            if (m19167b == null) {
                throw C4913e.m19198d("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            }
            C0076f c0076f = C0076f.f274r;
            if (i12 > 0) {
                c0076f = this.f18906n.mo366p(i12);
            }
            bVar.mo19244f(readInt, m19167b, c0076f);
            return;
        }
        throw C4913e.m19198d("TYPE_GOAWAY streamId != 0", new Object[0]);
    }

    /* renamed from: z */
    private List<C4911c> m19264z(int i10, short s10, byte b10, int i11) throws IOException {
        a aVar = this.f18907o;
        aVar.f18914r = i10;
        aVar.f18911o = i10;
        aVar.f18915s = s10;
        aVar.f18912p = b10;
        aVar.f18913q = i11;
        this.f18909q.m19185k();
        return this.f18909q.m19183e();
    }

    /* renamed from: c */
    public boolean m19265c(boolean z10, b bVar) throws IOException {
        try {
            this.f18906n.mo349a0(9L);
            int m19253Q = m19253Q(this.f18906n);
            if (m19253Q < 0 || m19253Q > 16384) {
                throw C4913e.m19198d("FRAME_SIZE_ERROR: %s", Integer.valueOf(m19253Q));
            }
            byte readByte = (byte) (this.f18906n.readByte() & 255);
            if (z10 && readByte != 4) {
                throw C4913e.m19198d("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
            }
            byte readByte2 = (byte) (this.f18906n.readByte() & 255);
            int readInt = this.f18906n.readInt() & Integer.MAX_VALUE;
            Logger logger = f18905r;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C4913e.m19196b(true, readInt, m19253Q, readByte, readByte2));
            }
            switch (readByte) {
                case 0:
                    m19260i(bVar, m19253Q, readByte2, readInt);
                    return true;
                case 1:
                    m19252O(bVar, m19253Q, readByte2, readInt);
                    return true;
                case 2:
                    m19256X(bVar, m19253Q, readByte2, readInt);
                    return true;
                case 3:
                    m19259e0(bVar, m19253Q, readByte2, readInt);
                    return true;
                case 4:
                    m19261j0(bVar, m19253Q, readByte2, readInt);
                    return true;
                case 5:
                    m19257Y(bVar, m19253Q, readByte2, readInt);
                    return true;
                case 6:
                    m19254T(bVar, m19253Q, readByte2, readInt);
                    return true;
                case 7:
                    m19263l(bVar, m19253Q, readByte2, readInt);
                    return true;
                case 8:
                    m19262k0(bVar, m19253Q, readByte2, readInt);
                    return true;
                default:
                    this.f18906n.mo369r(m19253Q);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f18906n.close();
    }

    /* renamed from: e */
    public void m19266e(b bVar) throws IOException {
        if (this.f18908p) {
            if (!m19265c(true, bVar)) {
                throw C4913e.m19198d("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        InterfaceC0075e interfaceC0075e = this.f18906n;
        C0076f c0076f = C4913e.f18823a;
        C0076f mo366p = interfaceC0075e.mo366p(c0076f.mo399r());
        Logger logger = f18905r;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C4286e.m17753q("<< CONNECTION %s", mo366p.mo393k()));
        }
        if (!c0076f.equals(mo366p)) {
            throw C4913e.m19198d("Expected a connection header but was %s", mo366p.mo404w());
        }
    }
}
