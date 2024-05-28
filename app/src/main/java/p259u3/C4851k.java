package p259u3;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: u3.k */
/* loaded from: classes.dex */
final class C4851k extends FilterInputStream {

    /* renamed from: n */
    private long f18716n;

    /* renamed from: o */
    private long f18717o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4851k(InputStream inputStream, long j10) {
        super(inputStream);
        this.f18717o = -1L;
        C4847g.m19034a(inputStream);
        this.f18716n = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f18716n);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        ((FilterInputStream) this).in.mark(i10);
        this.f18717o = this.f18716n;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f18716n == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f18716n--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f18717o != -1) {
            ((FilterInputStream) this).in.reset();
            this.f18716n = this.f18717o;
        } else {
            throw new IOException("Mark not set");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j10, this.f18716n));
        this.f18716n -= skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.f18716n;
        if (j10 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i10, (int) Math.min(i11, j10));
        if (read != -1) {
            this.f18716n -= read;
        }
        return read;
    }
}
