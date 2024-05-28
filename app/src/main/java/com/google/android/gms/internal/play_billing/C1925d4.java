package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.d4 */
/* loaded from: classes.dex */
public final class C1925d4 extends AbstractC1922d1 implements InterfaceC1951h2 {
    private static final C1925d4 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private C1981l4 zzh;
    private C2030s4 zzi;

    static {
        C1925d4 c1925d4 = new C1925d4();
        zzb = c1925d4;
        AbstractC1922d1.m9293p(C1925d4.class, c1925d4);
    }

    private C1925d4() {
    }

    /* renamed from: A */
    public static /* synthetic */ void m9311A(C1925d4 c1925d4, C1981l4 c1981l4) {
        c1981l4.getClass();
        c1925d4.zzh = c1981l4;
        c1925d4.zzd |= 2;
    }

    /* renamed from: B */
    public static /* synthetic */ void m9312B(C1925d4 c1925d4, C2058w4 c2058w4) {
        c2058w4.getClass();
        c1925d4.zzf = c2058w4;
        c1925d4.zze = 4;
    }

    /* renamed from: w */
    public static /* synthetic */ void m9313w(C1925d4 c1925d4, int i10) {
        c1925d4.zzg = i10 - 1;
        c1925d4.zzd |= 1;
    }

    /* renamed from: x */
    public static C1918c4 m9314x() {
        return (C1918c4) zzb.m9302h();
    }

    /* renamed from: z */
    public static C1925d4 m9316z(byte[] bArr, C2005p0 c2005p0) throws C1964j1 {
        return (C1925d4) AbstractC1922d1.m9290k(zzb, bArr, c2005p0);
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
            return AbstractC1922d1.m9292m(zzb, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C1932e4.f7660a, "zzh", "zzi", C2058w4.class});
        }
        if (i11 == 3) {
            return new C1925d4();
        }
        if (i11 == 4) {
            return new C1918c4(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
