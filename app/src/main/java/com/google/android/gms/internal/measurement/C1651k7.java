package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.k7 */
/* loaded from: classes.dex */
final class C1651k7 extends C1699n7 {

    /* renamed from: s */
    private final int f6931s;

    public C1651k7(byte[] bArr, int i10, int i11) {
        super(bArr);
        AbstractC1731p7.m8662q(0, i11, bArr.length);
        this.f6931s = i11;
    }

    @Override // com.google.android.gms.internal.measurement.C1699n7, com.google.android.gms.internal.measurement.AbstractC1731p7
    /* renamed from: c */
    public final byte mo8350c(int i10) {
        int i11 = this.f6931s;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f7097r[i10];
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(22);
            sb2.append("Index < 0: ");
            sb2.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(40);
        sb3.append("Index > length: ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(i11);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C1699n7, com.google.android.gms.internal.measurement.AbstractC1731p7
    /* renamed from: e */
    public final byte mo8351e(int i10) {
        return this.f7097r[i10];
    }

    @Override // com.google.android.gms.internal.measurement.C1699n7, com.google.android.gms.internal.measurement.AbstractC1731p7
    /* renamed from: i */
    public final int mo8352i() {
        return this.f6931s;
    }

    @Override // com.google.android.gms.internal.measurement.C1699n7
    /* renamed from: w */
    protected final int mo8353w() {
        return 0;
    }
}
