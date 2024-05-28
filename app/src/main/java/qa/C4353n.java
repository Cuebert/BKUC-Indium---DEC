package qa;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: qa.n */
/* loaded from: classes.dex */
final class C4353n extends InputStream {

    /* renamed from: n */
    private final InputStream f17710n;

    /* renamed from: o */
    private long f17711o;

    /* renamed from: p */
    private long f17712p;

    /* renamed from: q */
    private long f17713q;

    /* renamed from: r */
    private long f17714r;

    public C4353n(InputStream inputStream) {
        this(inputStream, 4096);
    }

    /* renamed from: e */
    private void m17987e(long j10) {
        try {
            long j11 = this.f17712p;
            long j12 = this.f17711o;
            if (j11 < j12 && j12 <= this.f17713q) {
                this.f17710n.reset();
                this.f17710n.mark((int) (j10 - this.f17712p));
                m17988i(this.f17712p, this.f17711o);
            } else {
                this.f17712p = j12;
                this.f17710n.mark((int) (j10 - j12));
            }
            this.f17713q = j10;
        } catch (IOException e10) {
            throw new IllegalStateException("Unable to mark: " + e10);
        }
    }

    /* renamed from: i */
    private void m17988i(long j10, long j11) throws IOException {
        while (j10 < j11) {
            long skip = this.f17710n.skip(j11 - j10);
            if (skip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    skip = 1;
                }
            }
            j10 += skip;
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f17710n.available();
    }

    /* renamed from: b */
    public void m17989b(long j10) throws IOException {
        if (this.f17711o <= this.f17713q && j10 >= this.f17712p) {
            this.f17710n.reset();
            m17988i(this.f17712p, j10);
            this.f17711o = j10;
            return;
        }
        throw new IOException("Cannot reset");
    }

    /* renamed from: c */
    public long m17990c(int i10) {
        long j10 = this.f17711o + i10;
        if (this.f17713q < j10) {
            m17987e(j10);
        }
        return this.f17711o;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f17710n.close();
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f17714r = m17990c(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f17710n.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int read = this.f17710n.read();
        if (read != -1) {
            this.f17711o++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        m17989b(this.f17714r);
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        long skip = this.f17710n.skip(j10);
        this.f17711o += skip;
        return skip;
    }

    public C4353n(InputStream inputStream, int i10) {
        this.f17714r = -1L;
        this.f17710n = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i10);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int read = this.f17710n.read(bArr);
        if (read != -1) {
            this.f17711o += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int read = this.f17710n.read(bArr, i10, i11);
        if (read != -1) {
            this.f17711o += read;
        }
        return read;
    }
}
