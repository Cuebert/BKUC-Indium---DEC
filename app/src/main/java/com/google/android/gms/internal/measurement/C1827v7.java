package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.v7 */
/* loaded from: classes.dex */
public final class C1827v7 extends AbstractC1859x7 {

    /* renamed from: d */
    private final byte[] f7263d;

    /* renamed from: e */
    private final int f7264e;

    /* renamed from: f */
    private int f7265f;

    public C1827v7(byte[] bArr, int i10, int i11) {
        super(null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i11) | i11) >= 0) {
            this.f7263d = bArr;
            this.f7265f = 0;
            this.f7264e = i11;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
    }

    /* renamed from: E */
    public final void m8896E(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f7263d, this.f7265f, i11);
            this.f7265f += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new C1843w7(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7265f), Integer.valueOf(this.f7264e), Integer.valueOf(i11)), e10);
        }
    }

    /* renamed from: F */
    public final void m8897F(String str) throws IOException {
        int i10 = this.f7265f;
        try {
            int m8996a = AbstractC1859x7.m8996a(str.length() * 3);
            int m8996a2 = AbstractC1859x7.m8996a(str.length());
            if (m8996a2 == m8996a) {
                int i11 = i10 + m8996a2;
                this.f7265f = i11;
                int m8337b = C1639jb.m8337b(str, this.f7263d, i11, this.f7264e - i11);
                this.f7265f = i10;
                mo8912u((m8337b - i10) - m8996a2);
                this.f7265f = m8337b;
                return;
            }
            mo8912u(C1639jb.m8338c(str));
            byte[] bArr = this.f7263d;
            int i12 = this.f7265f;
            this.f7265f = C1639jb.m8337b(str, bArr, i12, this.f7264e - i12);
        } catch (C1623ib e10) {
            this.f7265f = i10;
            m9004e(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new C1843w7(e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1859x7
    /* renamed from: g */
    public final int mo8898g() {
        return this.f7264e - this.f7265f;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1859x7
    /* renamed from: h */
    public final void mo8899h(byte b10) throws IOException {
        try {
            byte[] bArr = this.f7263d;
            int i10 = this.f7265f;
            this.f7265f = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new C1843w7(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7265f), Integer.valueOf(this.f7264e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1859x7
    /* renamed from: i */
    public final void mo8900i(int i10, boolean z10) throws IOException {
        mo8912u(i10 << 3);
        mo8899h(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1859x7
    /* renamed from: j */
    public final void mo8901j(int i10, AbstractC1731p7 abstractC1731p7) throws IOException {
        mo8912u((i10 << 3) | 2);
        mo8912u(abstractC1731p7.mo8352i());
        abstractC1731p7.mo8616o(this);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1859x7
    /* renamed from: k */
    public final void mo8902k(int i10, int i11) throws IOException {
        mo8912u((i10 << 3) | 5);
        mo8903l(i11);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1859x7
    /* renamed from: l */
    public final void mo8903l(int i10) throws IOException {
        try {
            byte[] bArr = this.f7263d;
            int i11 = this.f7265f;
            int i12 = i11 + 1;
            this.f7265f = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            this.f7265f = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            this.f7265f = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f7265f = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new C1843w7(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7265f), Integer.valueOf(this.f7264e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1859x7
    /* renamed from: m */
    public final void mo8904m(int i10, long j10) throws IOException {
        mo8912u((i10 << 3) | 1);
        mo8905n(j10);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1859x7
    /* renamed from: n */
    public final void mo8905n(long j10) throws IOException {
        try {
            byte[] bArr = this.f7263d;
            int i10 = this.f7265f;
            int i11 = i10 + 1;
            this.f7265f = i11;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i11 + 1;
            this.f7265f = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i12 + 1;
            this.f7265f = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i13 + 1;
            this.f7265f = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i14 + 1;
            this.f7265f = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            this.f7265f = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            this.f7265f = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f7265f = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new C1843w7(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7265f), Integer.valueOf(this.f7264e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1859x7
    /* renamed from: o */
    public final void mo8906o(int i10, int i11) throws IOException {
        mo8912u(i10 << 3);
        mo8907p(i11);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1859x7
    /* renamed from: p */
    public final void mo8907p(int i10) throws IOException {
        if (i10 >= 0) {
            mo8912u(i10);
        } else {
            mo8914w(i10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1859x7
    /* renamed from: q */
    public final void mo8908q(byte[] bArr, int i10, int i11) throws IOException {
        m8896E(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1859x7
    /* renamed from: r */
    public final void mo8909r(int i10, String str) throws IOException {
        mo8912u((i10 << 3) | 2);
        m8897F(str);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1859x7
    /* renamed from: s */
    public final void mo8910s(int i10, int i11) throws IOException {
        mo8912u((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1859x7
    /* renamed from: t */
    public final void mo8911t(int i10, int i11) throws IOException {
        mo8912u(i10 << 3);
        mo8912u(i11);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1859x7
    /* renamed from: u */
    public final void mo8912u(int i10) throws IOException {
        boolean z10;
        z10 = AbstractC1859x7.f7289c;
        if (z10) {
            int i11 = C1500b7.f6661a;
        }
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.f7263d;
                int i12 = this.f7265f;
                this.f7265f = i12 + 1;
                bArr[i12] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new C1843w7(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7265f), Integer.valueOf(this.f7264e), 1), e10);
            }
        }
        byte[] bArr2 = this.f7263d;
        int i13 = this.f7265f;
        this.f7265f = i13 + 1;
        bArr2[i13] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1859x7
    /* renamed from: v */
    public final void mo8913v(int i10, long j10) throws IOException {
        mo8912u(i10 << 3);
        mo8914w(j10);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1859x7
    /* renamed from: w */
    public final void mo8914w(long j10) throws IOException {
        boolean z10;
        z10 = AbstractC1859x7.f7289c;
        if (z10 && this.f7264e - this.f7265f >= 10) {
            while ((j10 & (-128)) != 0) {
                byte[] bArr = this.f7263d;
                int i10 = this.f7265f;
                this.f7265f = i10 + 1;
                C1555eb.m8118s(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr2 = this.f7263d;
            int i11 = this.f7265f;
            this.f7265f = i11 + 1;
            C1555eb.m8118s(bArr2, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f7263d;
                int i12 = this.f7265f;
                this.f7265f = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new C1843w7(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7265f), Integer.valueOf(this.f7264e), 1), e10);
            }
        }
        byte[] bArr4 = this.f7263d;
        int i13 = this.f7265f;
        this.f7265f = i13 + 1;
        bArr4[i13] = (byte) j10;
    }
}
