package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.n7 */
/* loaded from: classes.dex */
public class C1699n7 extends AbstractC1683m7 {

    /* renamed from: r */
    protected final byte[] f7097r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1699n7(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f7097r = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1731p7
    /* renamed from: c */
    public byte mo8350c(int i10) {
        return this.f7097r[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1731p7
    /* renamed from: e */
    public byte mo8351e(int i10) {
        return this.f7097r[i10];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1731p7
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1731p7) || mo8352i() != ((AbstractC1731p7) obj).mo8352i()) {
            return false;
        }
        if (mo8352i() == 0) {
            return true;
        }
        if (obj instanceof C1699n7) {
            C1699n7 c1699n7 = (C1699n7) obj;
            int m8665r = m8665r();
            int m8665r2 = c1699n7.m8665r();
            if (m8665r != 0 && m8665r2 != 0 && m8665r != m8665r2) {
                return false;
            }
            int mo8352i = mo8352i();
            if (mo8352i <= c1699n7.mo8352i()) {
                if (mo8352i <= c1699n7.mo8352i()) {
                    byte[] bArr = this.f7097r;
                    byte[] bArr2 = c1699n7.f7097r;
                    c1699n7.mo8353w();
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < mo8352i) {
                        if (bArr[i10] != bArr2[i11]) {
                            return false;
                        }
                        i10++;
                        i11++;
                    }
                    return true;
                }
                int mo8352i2 = c1699n7.mo8352i();
                StringBuilder sb2 = new StringBuilder(59);
                sb2.append("Ran off end of other: 0, ");
                sb2.append(mo8352i);
                sb2.append(", ");
                sb2.append(mo8352i2);
                throw new IllegalArgumentException(sb2.toString());
            }
            int mo8352i3 = mo8352i();
            StringBuilder sb3 = new StringBuilder(40);
            sb3.append("Length too large: ");
            sb3.append(mo8352i);
            sb3.append(mo8352i3);
            throw new IllegalArgumentException(sb3.toString());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1731p7
    /* renamed from: i */
    public int mo8352i() {
        return this.f7097r.length;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1731p7
    /* renamed from: k */
    protected final int mo8613k(int i10, int i11, int i12) {
        return C1860x8.m9008d(i10, this.f7097r, 0, i12);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1731p7
    /* renamed from: l */
    public final AbstractC1731p7 mo8614l(int i10, int i11) {
        int m8662q = AbstractC1731p7.m8662q(0, i11, mo8352i());
        return m8662q == 0 ? AbstractC1731p7.f7144o : new C1651k7(this.f7097r, 0, m8662q);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1731p7
    /* renamed from: m */
    protected final String mo8615m(Charset charset) {
        return new String(this.f7097r, 0, mo8352i(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1731p7
    /* renamed from: o */
    public final void mo8616o(C1568f7 c1568f7) throws IOException {
        ((C1827v7) c1568f7).m8896E(this.f7097r, 0, mo8352i());
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1731p7
    /* renamed from: p */
    public final boolean mo8617p() {
        return C1639jb.m8341f(this.f7097r, 0, mo8352i());
    }

    /* renamed from: w */
    protected int mo8353w() {
        return 0;
    }
}
