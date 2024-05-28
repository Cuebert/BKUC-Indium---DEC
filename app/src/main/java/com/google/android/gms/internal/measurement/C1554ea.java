package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ea */
/* loaded from: classes.dex */
final class C1554ea implements InterfaceC1749q9 {

    /* renamed from: a */
    private final InterfaceC1813u9 f6764a;

    /* renamed from: b */
    private final String f6765b;

    /* renamed from: c */
    private final Object[] f6766c;

    /* renamed from: d */
    private final int f6767d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1554ea(InterfaceC1813u9 interfaceC1813u9, String str, Object[] objArr) {
        this.f6764a = interfaceC1813u9;
        this.f6765b = str;
        this.f6766c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f6767d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 < 55296) {
                this.f6767d = i10 | (charAt2 << i11);
                return;
            } else {
                i10 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1749q9
    /* renamed from: a */
    public final int mo8092a() {
        return (this.f6767d & 1) == 1 ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final String m8093b() {
        return this.f6765b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final Object[] m8094c() {
        return this.f6766c;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1749q9
    public final InterfaceC1813u9 zza() {
        return this.f6764a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1749q9
    public final boolean zzb() {
        return (this.f6767d & 2) == 2;
    }
}
