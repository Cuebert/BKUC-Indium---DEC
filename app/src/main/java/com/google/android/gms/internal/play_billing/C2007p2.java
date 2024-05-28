package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.p2 */
/* loaded from: classes.dex */
final class C2007p2 implements InterfaceC1923d2 {

    /* renamed from: a */
    private final InterfaceC1944g2 f7765a;

    /* renamed from: b */
    private final String f7766b;

    /* renamed from: c */
    private final Object[] f7767c;

    /* renamed from: d */
    private final int f7768d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2007p2(InterfaceC1944g2 interfaceC1944g2, String str, Object[] objArr) {
        this.f7765a = interfaceC1944g2;
        this.f7766b = str;
        this.f7767c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f7768d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 < 55296) {
                this.f7768d = i10 | (charAt2 << i12);
                return;
            } else {
                i10 |= (charAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1923d2
    /* renamed from: a */
    public final int mo9310a() {
        return (this.f7768d & 1) != 0 ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final String m9541b() {
        return this.f7766b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final Object[] m9542c() {
        return this.f7767c;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1923d2
    public final InterfaceC1944g2 zza() {
        return this.f7765a;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1923d2
    public final boolean zzb() {
        return (this.f7768d & 2) == 2;
    }
}
