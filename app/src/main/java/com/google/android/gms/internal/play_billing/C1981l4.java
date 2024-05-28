package com.google.android.gms.internal.play_billing;

import com.appsflyer.oaid.BuildConfig;

/* renamed from: com.google.android.gms.internal.play_billing.l4 */
/* loaded from: classes.dex */
public final class C1981l4 extends AbstractC1922d1 implements InterfaceC1951h2 {
    private static final C1981l4 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;

    static {
        C1981l4 c1981l4 = new C1981l4();
        zzb = c1981l4;
        AbstractC1922d1.m9293p(C1981l4.class, c1981l4);
    }

    private C1981l4() {
    }

    /* renamed from: A */
    public static /* synthetic */ void m9493A(C1981l4 c1981l4, int i10) {
        c1981l4.zzg = i10 - 1;
        c1981l4.zzd |= 4;
    }

    /* renamed from: w */
    public static C1967j4 m9494w() {
        return (C1967j4) zzb.m9302h();
    }

    /* renamed from: y */
    public static /* synthetic */ void m9496y(C1981l4 c1981l4, int i10) {
        c1981l4.zzd |= 1;
        c1981l4.zze = i10;
    }

    /* renamed from: z */
    public static /* synthetic */ void m9497z(C1981l4 c1981l4, String str) {
        str.getClass();
        c1981l4.zzd |= 2;
        c1981l4.zzf = str;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1922d1
    /* renamed from: t */
    public final Object mo9309t(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC1922d1.m9292m(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", C1974k4.f7728a, "zzh"});
        }
        if (i11 == 3) {
            return new C1981l4();
        }
        if (i11 == 4) {
            return new C1967j4(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
