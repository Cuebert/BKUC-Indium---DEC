package p309y3;

import java.io.OutputStream;

/* renamed from: y3.f8 */
/* loaded from: classes.dex */
final class C5696f8 extends OutputStream {

    /* renamed from: n */
    private long f21017n = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final long m20682b() {
        return this.f21017n;
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f21017n++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f21017n += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int length;
        int i12;
        if (i10 >= 0 && i10 <= (length = bArr.length) && i11 >= 0 && (i12 = i10 + i11) <= length && i12 >= 0) {
            this.f21017n += i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
