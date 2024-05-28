package com.google.android.gms.internal.measurement;

import com.appsflyer.oaid.BuildConfig;

/* renamed from: com.google.android.gms.internal.measurement.t3 */
/* loaded from: classes.dex */
public final class C1791t3 extends AbstractC1732p8<C1791t3, C1775s3> implements InterfaceC1829v9 {
    private static final C1791t3 zza;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;

    static {
        C1791t3 c1791t3 = new C1791t3();
        zza = c1791t3;
        AbstractC1732p8.m8671o(C1791t3.class, c1791t3);
    }

    private C1791t3() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC1732p8
    /* renamed from: v */
    public final Object mo7884v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC1732p8.m8670n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C1791t3();
        }
        C1679m3 c1679m3 = null;
        if (i11 == 4) {
            return new C1775s3(c1679m3);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* renamed from: x */
    public final String m8820x() {
        return this.zzf;
    }

    /* renamed from: y */
    public final String m8821y() {
        return this.zzg;
    }
}
