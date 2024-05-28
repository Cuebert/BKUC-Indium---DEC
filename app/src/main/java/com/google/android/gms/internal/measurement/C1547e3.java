package com.google.android.gms.internal.measurement;

import com.appsflyer.oaid.BuildConfig;

/* renamed from: com.google.android.gms.internal.measurement.e3 */
/* loaded from: classes.dex */
public final class C1547e3 extends AbstractC1732p8<C1547e3, C1479a3> implements InterfaceC1829v9 {
    private static final C1547e3 zza;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;
    private String zzj = BuildConfig.FLAVOR;

    static {
        C1547e3 c1547e3 = new C1547e3();
        zza = c1547e3;
        AbstractC1732p8.m8671o(C1547e3.class, c1547e3);
    }

    private C1547e3() {
    }

    /* renamed from: x */
    public static C1547e3 m8072x() {
        return zza;
    }

    /* renamed from: A */
    public final String m8073A() {
        return this.zzi;
    }

    /* renamed from: B */
    public final boolean m8074B() {
        return this.zzg;
    }

    /* renamed from: C */
    public final boolean m8075C() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: D */
    public final boolean m8076D() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: E */
    public final boolean m8077E() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: F */
    public final boolean m8078F() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: G */
    public final boolean m8079G() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: H */
    public final int m8080H() {
        int m8018a = C1530d3.m8018a(this.zzf);
        if (m8018a == 0) {
            return 1;
        }
        return m8018a;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1732p8
    /* renamed from: v */
    public final Object mo7884v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC1732p8.m8670n(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", C1513c3.f6720a, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new C1547e3();
        }
        if (i11 == 4) {
            return new C1479a3(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* renamed from: y */
    public final String m8081y() {
        return this.zzh;
    }

    /* renamed from: z */
    public final String m8082z() {
        return this.zzj;
    }
}
