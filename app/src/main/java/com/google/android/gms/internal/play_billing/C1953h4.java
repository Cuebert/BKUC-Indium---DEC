package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.h4 */
/* loaded from: classes.dex */
public final class C1953h4 extends AbstractC1922d1 implements InterfaceC1951h2 {
    private static final C1953h4 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        C1953h4 c1953h4 = new C1953h4();
        zzb = c1953h4;
        AbstractC1922d1.m9293p(C1953h4.class, c1953h4);
    }

    private C1953h4() {
    }

    /* renamed from: w */
    public static C1946g4 m9382w() {
        return (C1946g4) zzb.m9302h();
    }

    /* renamed from: y */
    public static /* synthetic */ void m9384y(C1953h4 c1953h4, C2058w4 c2058w4) {
        c2058w4.getClass();
        c1953h4.zzf = c2058w4;
        c1953h4.zze = 2;
    }

    /* renamed from: z */
    public static /* synthetic */ void m9385z(C1953h4 c1953h4, int i10) {
        c1953h4.zzg = i10 - 1;
        c1953h4.zzd |= 1;
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
            return AbstractC1922d1.m9292m(zzb, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C1932e4.f7660a, C2058w4.class});
        }
        if (i11 == 3) {
            return new C1953h4();
        }
        if (i11 == 4) {
            return new C1946g4(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
