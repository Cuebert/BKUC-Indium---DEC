package ac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ac.l */
/* loaded from: classes.dex */
public final class C0082l {

    /* renamed from: a */
    static final Logger f290a = Logger.getLogger(C0082l.class.getName());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ac.l$a */
    /* loaded from: classes.dex */
    public final class a implements InterfaceC0089s {

        /* renamed from: n */
        final /* synthetic */ C0091u f291n;

        /* renamed from: o */
        final /* synthetic */ OutputStream f292o;

        a(C0091u c0091u, OutputStream outputStream) {
            this.f291n = c0091u;
            this.f292o = outputStream;
        }

        @Override // ac.InterfaceC0089s
        /* renamed from: C */
        public void mo313C(C0073c c0073c, long j10) throws IOException {
            C0092v.m453b(c0073c.f270o, 0L, j10);
            while (j10 > 0) {
                this.f291n.mo412f();
                C0086p c0086p = c0073c.f269n;
                int min = (int) Math.min(j10, c0086p.f307c - c0086p.f306b);
                this.f292o.write(c0086p.f305a, c0086p.f306b, min);
                int i10 = c0086p.f306b + min;
                c0086p.f306b = i10;
                long j11 = min;
                j10 -= j11;
                c0073c.f270o -= j11;
                if (i10 == c0086p.f307c) {
                    c0073c.f269n = c0086p.m442b();
                    C0087q.m447a(c0086p);
                }
            }
        }

        @Override // ac.InterfaceC0089s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f292o.close();
        }

        @Override // ac.InterfaceC0089s
        /* renamed from: f */
        public C0091u mo314f() {
            return this.f291n;
        }

        @Override // ac.InterfaceC0089s, java.io.Flushable
        public void flush() throws IOException {
            this.f292o.flush();
        }

        public String toString() {
            return "sink(" + this.f292o + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ac.l$b */
    /* loaded from: classes.dex */
    public final class b implements InterfaceC0090t {

        /* renamed from: n */
        final /* synthetic */ C0091u f293n;

        /* renamed from: o */
        final /* synthetic */ InputStream f294o;

        b(C0091u c0091u, InputStream inputStream) {
            this.f293n = c0091u;
            this.f294o = inputStream;
        }

        @Override // ac.InterfaceC0090t
        /* renamed from: V */
        public long mo315V(C0073c c0073c, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            if (j10 == 0) {
                return 0L;
            }
            try {
                this.f293n.mo412f();
                C0086p m322B0 = c0073c.m322B0(1);
                int read = this.f294o.read(m322B0.f305a, m322B0.f307c, (int) Math.min(j10, 8192 - m322B0.f307c));
                if (read == -1) {
                    return -1L;
                }
                m322B0.f307c += read;
                long j11 = read;
                c0073c.f270o += j11;
                return j11;
            } catch (AssertionError e10) {
                if (C0082l.m426e(e10)) {
                    throw new IOException(e10);
                }
                throw e10;
            }
        }

        @Override // ac.InterfaceC0090t, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f294o.close();
        }

        @Override // ac.InterfaceC0090t
        /* renamed from: f */
        public C0091u mo316f() {
            return this.f293n;
        }

        public String toString() {
            return "source(" + this.f294o + ")";
        }
    }

    /* renamed from: ac.l$c */
    /* loaded from: classes.dex */
    final class c implements InterfaceC0089s {
        c() {
        }

        @Override // ac.InterfaceC0089s
        /* renamed from: C */
        public void mo313C(C0073c c0073c, long j10) throws IOException {
            c0073c.mo369r(j10);
        }

        @Override // ac.InterfaceC0089s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // ac.InterfaceC0089s
        /* renamed from: f */
        public C0091u mo314f() {
            return C0091u.f316d;
        }

        @Override // ac.InterfaceC0089s, java.io.Flushable
        public void flush() throws IOException {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ac.l$d */
    /* loaded from: classes.dex */
    public final class d extends C0071a {

        /* renamed from: k */
        final /* synthetic */ Socket f295k;

        d(Socket socket) {
            this.f295k = socket;
        }

        @Override // ac.C0071a
        /* renamed from: o */
        protected IOException mo309o(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // ac.C0071a
        /* renamed from: t */
        protected void mo312t() {
            try {
                this.f295k.close();
            } catch (AssertionError e10) {
                if (C0082l.m426e(e10)) {
                    C0082l.f290a.log(Level.WARNING, "Failed to close timed out socket " + this.f295k, (Throwable) e10);
                    return;
                }
                throw e10;
            } catch (Exception e11) {
                C0082l.f290a.log(Level.WARNING, "Failed to close timed out socket " + this.f295k, (Throwable) e11);
            }
        }
    }

    private C0082l() {
    }

    /* renamed from: a */
    public static InterfaceC0089s m422a(File file) throws FileNotFoundException {
        if (file != null) {
            return m428g(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: b */
    public static InterfaceC0089s m423b() {
        return new c();
    }

    /* renamed from: c */
    public static InterfaceC0074d m424c(InterfaceC0089s interfaceC0089s) {
        return new C0084n(interfaceC0089s);
    }

    /* renamed from: d */
    public static InterfaceC0075e m425d(InterfaceC0090t interfaceC0090t) {
        return new C0085o(interfaceC0090t);
    }

    /* renamed from: e */
    static boolean m426e(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: f */
    public static InterfaceC0089s m427f(File file) throws FileNotFoundException {
        if (file != null) {
            return m428g(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: g */
    public static InterfaceC0089s m428g(OutputStream outputStream) {
        return m429h(outputStream, new C0091u());
    }

    /* renamed from: h */
    private static InterfaceC0089s m429h(OutputStream outputStream, C0091u c0091u) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (c0091u != null) {
            return new a(c0091u, outputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    /* renamed from: i */
    public static InterfaceC0089s m430i(Socket socket) throws IOException {
        if (socket != null) {
            if (socket.getOutputStream() != null) {
                C0071a m435n = m435n(socket);
                return m435n.m310r(m429h(socket.getOutputStream(), m435n));
            }
            throw new IOException("socket's output stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    /* renamed from: j */
    public static InterfaceC0090t m431j(File file) throws FileNotFoundException {
        if (file != null) {
            return m432k(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: k */
    public static InterfaceC0090t m432k(InputStream inputStream) {
        return m433l(inputStream, new C0091u());
    }

    /* renamed from: l */
    private static InterfaceC0090t m433l(InputStream inputStream, C0091u c0091u) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (c0091u != null) {
            return new b(c0091u, inputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    /* renamed from: m */
    public static InterfaceC0090t m434m(Socket socket) throws IOException {
        if (socket != null) {
            if (socket.getInputStream() != null) {
                C0071a m435n = m435n(socket);
                return m435n.m311s(m433l(socket.getInputStream(), m435n));
            }
            throw new IOException("socket's input stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    /* renamed from: n */
    private static C0071a m435n(Socket socket) {
        return new d(socket);
    }
}
