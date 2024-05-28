package com.google.android.gms.internal.measurement;

import com.appsflyer.oaid.BuildConfig;

/* renamed from: com.google.android.gms.internal.measurement.z2 */
/* loaded from: classes.dex */
public final class C1886z2 extends AbstractC1732p8<C1886z2, C1870y2> implements InterfaceC1829v9 {
    private static final C1886z2 zza;
    private int zze;
    private C1663l3 zzf;
    private C1547e3 zzg;
    private boolean zzh;
    private String zzi = BuildConfig.FLAVOR;

    static {
        C1886z2 c1886z2 = new C1886z2();
        zza = c1886z2;
        AbstractC1732p8.m8671o(C1886z2.class, c1886z2);
    }

    private C1886z2() {
    }

    /* renamed from: B */
    public static /* synthetic */ void m9117B(C1886z2 c1886z2, String str) {
        c1886z2.zze |= 8;
        c1886z2.zzi = str;
    }

    /* renamed from: x */
    public static C1886z2 m9119x() {
        return zza;
    }

    /* renamed from: A */
    public final String m9120A() {
        return this.zzi;
    }

    /* renamed from: C */
    public final boolean m9121C() {
        return this.zzh;
    }

    /* renamed from: D */
    public final boolean m9122D() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: E */
    public final boolean m9123E() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: F */
    public final boolean m9124F() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: G */
    public final boolean m9125G() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1732p8
    /* renamed from: v */
    public final Object mo7884v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC1732p8.m8670n(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new C1886z2();
        }
        if (i11 == 4) {
            return new C1870y2(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* renamed from: y */
    public final C1547e3 m9126y() {
        C1547e3 c1547e3 = this.zzg;
        return c1547e3 == null ? C1547e3.m8072x() : c1547e3;
    }

    /* renamed from: z */
    public final C1663l3 m9127z() {
        C1663l3 c1663l3 = this.zzf;
        return c1663l3 == null ? C1663l3.m8361y() : c1663l3;
    }
}
