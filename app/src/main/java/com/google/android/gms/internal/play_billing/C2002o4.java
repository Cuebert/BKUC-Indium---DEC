package com.google.android.gms.internal.play_billing;

import com.appsflyer.oaid.BuildConfig;

/* renamed from: com.google.android.gms.internal.play_billing.o4 */
/* loaded from: classes.dex */
public final class C2002o4 extends AbstractC1922d1 implements InterfaceC1951h2 {
    private static final C2002o4 zzb;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;

    static {
        C2002o4 c2002o4 = new C2002o4();
        zzb = c2002o4;
        AbstractC1922d1.m9293p(C2002o4.class, c2002o4);
    }

    private C2002o4() {
    }

    /* renamed from: w */
    public static C1995n4 m9517w() {
        return (C1995n4) zzb.m9302h();
    }

    /* renamed from: y */
    public static /* synthetic */ void m9519y(C2002o4 c2002o4, String str) {
        str.getClass();
        c2002o4.zzd |= 1;
        c2002o4.zze = str;
    }

    /* renamed from: z */
    public static /* synthetic */ void m9520z(C2002o4 c2002o4, String str) {
        str.getClass();
        c2002o4.zzd |= 2;
        c2002o4.zzf = str;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1922d1
    /* renamed from: t */
    public final Object mo9309t(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC1922d1.m9292m(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C2002o4();
        }
        if (i11 == 4) {
            return new C1995n4(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
