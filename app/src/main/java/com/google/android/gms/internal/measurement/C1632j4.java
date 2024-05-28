package com.google.android.gms.internal.measurement;

import com.appsflyer.oaid.BuildConfig;

/* renamed from: com.google.android.gms.internal.measurement.j4 */
/* loaded from: classes.dex */
public final class C1632j4 extends AbstractC1732p8<C1632j4, C1616i4> implements InterfaceC1829v9 {
    private static final C1632j4 zza;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private C1855x3 zzh;

    static {
        C1632j4 c1632j4 = new C1632j4();
        zza = c1632j4;
        AbstractC1732p8.m8671o(C1632j4.class, c1632j4);
    }

    private C1632j4() {
    }

    /* renamed from: w */
    public static /* synthetic */ C1632j4 m8318w() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1732p8
    /* renamed from: v */
    public final Object mo7884v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC1732p8.m8670n(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C1632j4();
        }
        if (i11 == 4) {
            return new C1616i4(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
