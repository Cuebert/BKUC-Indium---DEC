package com.google.android.gms.internal.play_billing;

import com.appsflyer.oaid.BuildConfig;

/* renamed from: com.google.android.gms.internal.play_billing.s4 */
/* loaded from: classes.dex */
public final class C2030s4 extends AbstractC1922d1 implements InterfaceC1951h2 {
    private static final C2030s4 zzb;
    private int zzd;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;

    static {
        C2030s4 c2030s4 = new C2030s4();
        zzb = c2030s4;
        AbstractC1922d1.m9293p(C2030s4.class, c2030s4);
    }

    private C2030s4() {
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1922d1
    /* renamed from: t */
    public final Object mo9309t(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC1922d1.m9292m(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", C2009p4.f7769a, "zzf"});
        }
        if (i11 == 3) {
            return new C2030s4();
        }
        if (i11 == 4) {
            return new C2023r4(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
