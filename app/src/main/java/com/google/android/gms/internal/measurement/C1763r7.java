package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r7 */
/* loaded from: classes.dex */
final class C1763r7 extends C1795t7 {

    /* renamed from: b */
    private final byte[] f7202b;

    /* renamed from: c */
    private int f7203c;

    /* renamed from: d */
    private int f7204d;

    /* renamed from: e */
    private int f7205e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1763r7(byte[] bArr, int i10, int i11, boolean z10, C1747q7 c1747q7) {
        super(null);
        this.f7205e = Integer.MAX_VALUE;
        this.f7202b = bArr;
        this.f7203c = 0;
    }

    /* renamed from: c */
    public final int m8766c(int i10) throws C1892z8 {
        int i11 = this.f7205e;
        this.f7205e = 0;
        int i12 = this.f7203c + this.f7204d;
        this.f7203c = i12;
        if (i12 > 0) {
            this.f7204d = i12;
            this.f7203c = 0;
        } else {
            this.f7204d = 0;
        }
        return i11;
    }
}
