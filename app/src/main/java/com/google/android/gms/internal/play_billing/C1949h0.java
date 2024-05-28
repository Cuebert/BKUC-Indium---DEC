package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.play_billing.h0 */
/* loaded from: classes.dex */
public final class C1949h0 extends AbstractC1970k0 {

    /* renamed from: e */
    private final byte[] f7672e;

    /* renamed from: f */
    private final int f7673f;

    /* renamed from: g */
    private int f7674g;

    public C1949h0(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) >= 0) {
            this.f7672e = bArr;
            this.f7674g = 0;
            this.f7673f = i11;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
    }

    /* renamed from: B */
    public final void m9358B(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f7672e, this.f7674g, i11);
            this.f7674g += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new C1956i0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7674g), Integer.valueOf(this.f7673f), Integer.valueOf(i11)), e10);
        }
    }

    /* renamed from: C */
    public final void m9359C(String str) throws IOException {
        int i10 = this.f7674g;
        try {
            int m9481y = AbstractC1970k0.m9481y(str.length() * 3);
            int m9481y2 = AbstractC1970k0.m9481y(str.length());
            if (m9481y2 == m9481y) {
                int i11 = i10 + m9481y2;
                this.f7674g = i11;
                int m9684b = C2064x3.m9684b(str, this.f7672e, i11, this.f7673f - i11);
                this.f7674g = i10;
                mo9374r((m9684b - i10) - m9481y2);
                this.f7674g = m9684b;
                return;
            }
            mo9374r(C2064x3.m9685c(str));
            byte[] bArr = this.f7672e;
            int i12 = this.f7674g;
            this.f7674g = C2064x3.m9684b(str, bArr, i12, this.f7673f - i12);
        } catch (C2057w3 e10) {
            this.f7674g = i10;
            m9484b(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new C1956i0(e11);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1970k0
    /* renamed from: d */
    public final int mo9360d() {
        return this.f7673f - this.f7674g;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1970k0
    /* renamed from: e */
    public final void mo9361e(byte b10) throws IOException {
        try {
            byte[] bArr = this.f7672e;
            int i10 = this.f7674g;
            this.f7674g = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new C1956i0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7674g), Integer.valueOf(this.f7673f), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1970k0
    /* renamed from: f */
    public final void mo9362f(int i10, boolean z10) throws IOException {
        mo9374r(i10 << 3);
        mo9361e(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1970k0
    /* renamed from: g */
    public final void mo9363g(int i10, AbstractC1914c0 abstractC1914c0) throws IOException {
        mo9374r((i10 << 3) | 2);
        mo9374r(abstractC1914c0.mo9271i());
        abstractC1914c0.mo9275o(this);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1970k0
    /* renamed from: h */
    public final void mo9364h(int i10, int i11) throws IOException {
        mo9374r((i10 << 3) | 5);
        mo9365i(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1970k0
    /* renamed from: i */
    public final void mo9365i(int i10) throws IOException {
        try {
            byte[] bArr = this.f7672e;
            int i11 = this.f7674g;
            int i12 = i11 + 1;
            this.f7674g = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            this.f7674g = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            this.f7674g = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f7674g = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new C1956i0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7674g), Integer.valueOf(this.f7673f), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1970k0
    /* renamed from: j */
    public final void mo9366j(int i10, long j10) throws IOException {
        mo9374r((i10 << 3) | 1);
        mo9367k(j10);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1970k0
    /* renamed from: k */
    public final void mo9367k(long j10) throws IOException {
        try {
            byte[] bArr = this.f7672e;
            int i10 = this.f7674g;
            int i11 = i10 + 1;
            this.f7674g = i11;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i11 + 1;
            this.f7674g = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i12 + 1;
            this.f7674g = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i13 + 1;
            this.f7674g = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i14 + 1;
            this.f7674g = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            this.f7674g = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            this.f7674g = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f7674g = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new C1956i0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7674g), Integer.valueOf(this.f7673f), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1970k0
    /* renamed from: l */
    public final void mo9368l(int i10, int i11) throws IOException {
        mo9374r(i10 << 3);
        mo9369m(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1970k0
    /* renamed from: m */
    public final void mo9369m(int i10) throws IOException {
        if (i10 >= 0) {
            mo9374r(i10);
        } else {
            mo9376t(i10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1970k0
    /* renamed from: n */
    public final void mo9370n(byte[] bArr, int i10, int i11) throws IOException {
        m9358B(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1970k0
    /* renamed from: o */
    public final void mo9371o(int i10, String str) throws IOException {
        mo9374r((i10 << 3) | 2);
        m9359C(str);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1970k0
    /* renamed from: p */
    public final void mo9372p(int i10, int i11) throws IOException {
        mo9374r((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1970k0
    /* renamed from: q */
    public final void mo9373q(int i10, int i11) throws IOException {
        mo9374r(i10 << 3);
        mo9374r(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1970k0
    /* renamed from: r */
    public final void mo9374r(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.f7672e;
                int i11 = this.f7674g;
                this.f7674g = i11 + 1;
                bArr[i11] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new C1956i0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7674g), Integer.valueOf(this.f7673f), 1), e10);
            }
        }
        byte[] bArr2 = this.f7672e;
        int i12 = this.f7674g;
        this.f7674g = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1970k0
    /* renamed from: s */
    public final void mo9375s(int i10, long j10) throws IOException {
        mo9374r(i10 << 3);
        mo9376t(j10);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1970k0
    /* renamed from: t */
    public final void mo9376t(long j10) throws IOException {
        boolean z10;
        z10 = AbstractC1970k0.f7707c;
        if (z10 && this.f7673f - this.f7674g >= 10) {
            while ((j10 & (-128)) != 0) {
                byte[] bArr = this.f7672e;
                int i10 = this.f7674g;
                this.f7674g = i10 + 1;
                C2029s3.m9635s(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr2 = this.f7672e;
            int i11 = this.f7674g;
            this.f7674g = i11 + 1;
            C2029s3.m9635s(bArr2, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f7672e;
                int i12 = this.f7674g;
                this.f7674g = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new C1956i0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7674g), Integer.valueOf(this.f7673f), 1), e10);
            }
        }
        byte[] bArr4 = this.f7672e;
        int i13 = this.f7674g;
        this.f7674g = i13 + 1;
        bArr4[i13] = (byte) j10;
    }
}
