package androidx.camera.core.impl.utils;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* renamed from: androidx.camera.core.impl.utils.a */
/* loaded from: classes.dex */
class C0421a extends FilterOutputStream {

    /* renamed from: n */
    final OutputStream f1923n;

    /* renamed from: o */
    private ByteOrder f1924o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0421a(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f1923n = outputStream;
        this.f1924o = byteOrder;
    }

    /* renamed from: b */
    public void m2046b(ByteOrder byteOrder) {
        this.f1924o = byteOrder;
    }

    /* renamed from: c */
    public void m2047c(int i10) throws IOException {
        this.f1923n.write(i10);
    }

    /* renamed from: e */
    public void m2048e(int i10) throws IOException {
        ByteOrder byteOrder = this.f1924o;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f1923n.write((i10 >>> 0) & 255);
            this.f1923n.write((i10 >>> 8) & 255);
            this.f1923n.write((i10 >>> 16) & 255);
            this.f1923n.write((i10 >>> 24) & 255);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f1923n.write((i10 >>> 24) & 255);
            this.f1923n.write((i10 >>> 16) & 255);
            this.f1923n.write((i10 >>> 8) & 255);
            this.f1923n.write((i10 >>> 0) & 255);
        }
    }

    /* renamed from: i */
    public void m2049i(short s10) throws IOException {
        ByteOrder byteOrder = this.f1924o;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f1923n.write((s10 >>> 0) & 255);
            this.f1923n.write((s10 >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f1923n.write((s10 >>> 8) & 255);
            this.f1923n.write((s10 >>> 0) & 255);
        }
    }

    /* renamed from: l */
    public void m2050l(long j10) throws IOException {
        m2048e((int) j10);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f1923n.write(bArr);
    }

    /* renamed from: z */
    public void m2051z(int i10) throws IOException {
        m2049i((short) i10);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f1923n.write(bArr, i10, i11);
    }
}
