package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.z4 */
/* loaded from: classes.dex */
public final class C2077z4 extends AbstractC1922d1 implements InterfaceC1951h2 {
    private static final C2077z4 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private C2002o4 zzg;

    static {
        C2077z4 c2077z4 = new C2077z4();
        zzb = c2077z4;
        AbstractC1922d1.m9293p(C2077z4.class, c2077z4);
    }

    private C2077z4() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static /* synthetic */ void m9707A(C2077z4 c2077z4, C2002o4 c2002o4) {
        c2077z4.zzg = c2002o4;
        c2077z4.zzd |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static /* synthetic */ void m9708B(C2077z4 c2077z4, C1925d4 c1925d4) {
        c1925d4.getClass();
        c2077z4.zzf = c1925d4;
        c2077z4.zze = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static /* synthetic */ void m9709w(C2077z4 c2077z4, C1953h4 c1953h4) {
        c1953h4.getClass();
        c2077z4.zzf = c1953h4;
        c2077z4.zze = 3;
    }

    /* renamed from: x */
    public static C2071y4 m9710x() {
        return (C2071y4) zzb.m9302h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static /* synthetic */ void m9712z(C2077z4 c2077z4, C1926d5 c1926d5) {
        c1926d5.getClass();
        c2077z4.zzf = c1926d5;
        c2077z4.zze = 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.play_billing.AbstractC1922d1
    /* renamed from: t */
    public final Object mo9309t(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC1922d1.m9292m(zzb, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C1925d4.class, C1953h4.class, C1926d5.class});
        }
        if (i11 == 3) {
            return new C2077z4();
        }
        C2065x4 c2065x4 = null;
        if (i11 == 4) {
            return new C2071y4(c2065x4);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
