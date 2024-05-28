package p187o5;

import java.io.OutputStream;

/* renamed from: o5.b */
/* loaded from: classes.dex */
final class C4135b extends OutputStream {

    /* renamed from: n */
    private long f16845n = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public long m17138b() {
        return this.f16845n;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f16845n++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f16845n += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f16845n += i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
