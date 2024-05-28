package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.play_billing.y */
/* loaded from: classes.dex */
public class C2066y extends AbstractC2060x {

    /* renamed from: r */
    protected final byte[] f7889r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2066y(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f7889r = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1914c0
    /* renamed from: c */
    public byte mo9269c(int i10) {
        return this.f7889r[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC1914c0
    /* renamed from: e */
    public byte mo9270e(int i10) {
        return this.f7889r[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1914c0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1914c0) || mo9271i() != ((AbstractC1914c0) obj).mo9271i()) {
            return false;
        }
        if (mo9271i() == 0) {
            return true;
        }
        if (obj instanceof C2066y) {
            C2066y c2066y = (C2066y) obj;
            int m9277r = m9277r();
            int m9277r2 = c2066y.m9277r();
            if (m9277r != 0 && m9277r2 != 0 && m9277r != m9277r2) {
                return false;
            }
            int mo9271i = mo9271i();
            if (mo9271i <= c2066y.mo9271i()) {
                if (mo9271i <= c2066y.mo9271i()) {
                    byte[] bArr = this.f7889r;
                    byte[] bArr2 = c2066y.f7889r;
                    c2066y.mo9668v();
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < mo9271i) {
                        if (bArr[i10] != bArr2[i11]) {
                            return false;
                        }
                        i10++;
                        i11++;
                    }
                    return true;
                }
                throw new IllegalArgumentException("Ran off end of other: 0, " + mo9271i + ", " + c2066y.mo9271i());
            }
            throw new IllegalArgumentException("Length too large: " + mo9271i + mo9271i());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1914c0
    /* renamed from: i */
    public int mo9271i() {
        return this.f7889r.length;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1914c0
    /* renamed from: k */
    protected final int mo9272k(int i10, int i11, int i12) {
        return C1950h1.m9378b(i10, this.f7889r, 0, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1914c0
    /* renamed from: l */
    public final AbstractC1914c0 mo9273l(int i10, int i11) {
        int m9267q = AbstractC1914c0.m9267q(0, i11, mo9271i());
        return m9267q == 0 ? AbstractC1914c0.f7634o : new C2046v(this.f7889r, 0, m9267q);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1914c0
    /* renamed from: m */
    protected final String mo9274m(Charset charset) {
        return new String(this.f7889r, 0, mo9271i(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC1914c0
    /* renamed from: o */
    public final void mo9275o(C2018r c2018r) throws IOException {
        ((C1949h0) c2018r).m9358B(this.f7889r, 0, mo9271i());
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1914c0
    /* renamed from: p */
    public final boolean mo9276p() {
        return C2064x3.m9687e(this.f7889r, 0, mo9271i());
    }

    /* renamed from: v */
    protected int mo9668v() {
        return 0;
    }
}
