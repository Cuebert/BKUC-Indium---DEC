package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.w4 */
/* loaded from: classes.dex */
public final class C2058w4 extends AbstractC1922d1 implements InterfaceC1951h2 {
    private static final C2058w4 zzb;
    private int zzd;
    private int zze;

    static {
        C2058w4 c2058w4 = new C2058w4();
        zzb = c2058w4;
        AbstractC1922d1.m9293p(C2058w4.class, c2058w4);
    }

    private C2058w4() {
    }

    /* renamed from: w */
    public static C2044u4 m9674w() {
        return (C2044u4) zzb.m9302h();
    }

    /* renamed from: y */
    public static /* synthetic */ void m9676y(C2058w4 c2058w4, int i10) {
        c2058w4.zze = i10 - 1;
        c2058w4.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1922d1
    /* renamed from: t */
    public final Object mo9309t(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC1922d1.m9292m(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C2051v4.f7872a});
        }
        if (i11 == 3) {
            return new C2058w4();
        }
        if (i11 == 4) {
            return new C2044u4(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
