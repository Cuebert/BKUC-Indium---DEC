package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.e0 */
/* loaded from: classes.dex */
final class C1928e0 extends C1942g0 {

    /* renamed from: b */
    private final byte[] f7647b;

    /* renamed from: c */
    private int f7648c;

    /* renamed from: d */
    private int f7649d;

    /* renamed from: e */
    private int f7650e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1928e0(byte[] bArr, int i10, int i11, boolean z10, C1921d0 c1921d0) {
        super(null);
        this.f7650e = Integer.MAX_VALUE;
        this.f7647b = bArr;
        this.f7648c = 0;
    }

    /* renamed from: c */
    public final int m9320c(int i10) throws C1964j1 {
        int i11 = this.f7650e;
        this.f7650e = 0;
        int i12 = this.f7648c + this.f7649d;
        this.f7648c = i12;
        if (i12 > 0) {
            this.f7649d = i12;
            this.f7648c = i12 - i12;
        } else {
            this.f7649d = 0;
        }
        return i11;
    }
}
