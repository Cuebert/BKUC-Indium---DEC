package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.v */
/* loaded from: classes.dex */
final class C2046v extends C2066y {

    /* renamed from: s */
    private final int f7815s;

    public C2046v(byte[] bArr, int i10, int i11) {
        super(bArr);
        AbstractC1914c0.m9267q(0, i11, bArr.length);
        this.f7815s = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.C2066y, com.google.android.gms.internal.play_billing.AbstractC1914c0
    /* renamed from: c */
    public final byte mo9269c(int i10) {
        int i11 = this.f7815s;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f7889r[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.C2066y, com.google.android.gms.internal.play_billing.AbstractC1914c0
    /* renamed from: e */
    public final byte mo9270e(int i10) {
        return this.f7889r[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.C2066y, com.google.android.gms.internal.play_billing.AbstractC1914c0
    /* renamed from: i */
    public final int mo9271i() {
        return this.f7815s;
    }

    @Override // com.google.android.gms.internal.play_billing.C2066y
    /* renamed from: v */
    protected final int mo9668v() {
        return 0;
    }
}
