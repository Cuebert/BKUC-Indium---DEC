package ac;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* renamed from: ac.n */
/* loaded from: classes.dex */
public final class C0084n implements InterfaceC0074d {

    /* renamed from: n */
    public final C0073c f298n = new C0073c();

    /* renamed from: o */
    public final InterfaceC0089s f299o;

    /* renamed from: p */
    boolean f300p;

    public C0084n(InterfaceC0089s interfaceC0089s) {
        Objects.requireNonNull(interfaceC0089s, "sink == null");
        this.f299o = interfaceC0089s;
    }

    @Override // ac.InterfaceC0089s
    /* renamed from: C */
    public void mo313C(C0073c c0073c, long j10) throws IOException {
        if (!this.f300p) {
            this.f298n.mo313C(c0073c, j10);
            mo344R();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // ac.InterfaceC0074d
    /* renamed from: E */
    public InterfaceC0074d mo326E(C0076f c0076f) throws IOException {
        if (!this.f300p) {
            this.f298n.mo326E(c0076f);
            return mo344R();
        }
        throw new IllegalStateException("closed");
    }

    @Override // ac.InterfaceC0074d
    /* renamed from: G */
    public InterfaceC0074d mo330G(int i10) throws IOException {
        if (!this.f300p) {
            this.f298n.mo330G(i10);
            return mo344R();
        }
        throw new IllegalStateException("closed");
    }

    @Override // ac.InterfaceC0074d
    /* renamed from: M */
    public InterfaceC0074d mo339M(byte[] bArr) throws IOException {
        if (!this.f300p) {
            this.f298n.mo339M(bArr);
            return mo344R();
        }
        throw new IllegalStateException("closed");
    }

    @Override // ac.InterfaceC0074d
    /* renamed from: R */
    public InterfaceC0074d mo344R() throws IOException {
        if (!this.f300p) {
            long m359j0 = this.f298n.m359j0();
            if (m359j0 > 0) {
                this.f299o.mo313C(this.f298n, m359j0);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // ac.InterfaceC0074d
    /* renamed from: a */
    public C0073c mo348a() {
        return this.f298n;
    }

    @Override // ac.InterfaceC0074d
    /* renamed from: b0 */
    public InterfaceC0074d mo350b0(String str) throws IOException {
        if (!this.f300p) {
            this.f298n.mo350b0(str);
            return mo344R();
        }
        throw new IllegalStateException("closed");
    }

    @Override // ac.InterfaceC0074d
    /* renamed from: c0 */
    public InterfaceC0074d mo351c0(long j10) throws IOException {
        if (!this.f300p) {
            this.f298n.mo351c0(j10);
            return mo344R();
        }
        throw new IllegalStateException("closed");
    }

    @Override // ac.InterfaceC0089s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f300p) {
            return;
        }
        Throwable th = null;
        try {
            C0073c c0073c = this.f298n;
            long j10 = c0073c.f270o;
            if (j10 > 0) {
                this.f299o.mo313C(c0073c, j10);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f299o.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f300p = true;
        if (th != null) {
            C0092v.m456e(th);
        }
    }

    @Override // ac.InterfaceC0089s
    /* renamed from: f */
    public C0091u mo314f() {
        return this.f299o.mo314f();
    }

    @Override // ac.InterfaceC0074d, ac.InterfaceC0089s, java.io.Flushable
    public void flush() throws IOException {
        if (!this.f300p) {
            C0073c c0073c = this.f298n;
            long j10 = c0073c.f270o;
            if (j10 > 0) {
                this.f299o.mo313C(c0073c, j10);
            }
            this.f299o.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // ac.InterfaceC0074d
    /* renamed from: h */
    public InterfaceC0074d mo357h(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.f300p) {
            this.f298n.mo357h(bArr, i10, i11);
            return mo344R();
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f300p;
    }

    @Override // ac.InterfaceC0074d
    /* renamed from: n */
    public InterfaceC0074d mo363n(long j10) throws IOException {
        if (!this.f300p) {
            this.f298n.mo363n(j10);
            return mo344R();
        }
        throw new IllegalStateException("closed");
    }

    @Override // ac.InterfaceC0074d
    /* renamed from: t */
    public InterfaceC0074d mo373t(int i10) throws IOException {
        if (!this.f300p) {
            this.f298n.mo373t(i10);
            return mo344R();
        }
        throw new IllegalStateException("closed");
    }

    public String toString() {
        return "buffer(" + this.f299o + ")";
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.f300p) {
            int write = this.f298n.write(byteBuffer);
            mo344R();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    @Override // ac.InterfaceC0074d
    /* renamed from: x */
    public InterfaceC0074d mo379x(int i10) throws IOException {
        if (!this.f300p) {
            this.f298n.mo379x(i10);
            return mo344R();
        }
        throw new IllegalStateException("closed");
    }
}
