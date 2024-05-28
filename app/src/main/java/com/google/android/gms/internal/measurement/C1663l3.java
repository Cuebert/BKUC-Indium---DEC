package com.google.android.gms.internal.measurement;

import com.appsflyer.oaid.BuildConfig;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.l3 */
/* loaded from: classes.dex */
public final class C1663l3 extends AbstractC1732p8<C1663l3, C1598h3> implements InterfaceC1829v9 {
    private static final C1663l3 zza;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = BuildConfig.FLAVOR;
    private InterfaceC1844w8<String> zzi = AbstractC1732p8.m8667k();

    static {
        C1663l3 c1663l3 = new C1663l3();
        zza = c1663l3;
        AbstractC1732p8.m8671o(C1663l3.class, c1663l3);
    }

    private C1663l3() {
    }

    /* renamed from: y */
    public static C1663l3 m8361y() {
        return zza;
    }

    /* renamed from: A */
    public final List<String> m8362A() {
        return this.zzi;
    }

    /* renamed from: B */
    public final boolean m8363B() {
        return this.zzh;
    }

    /* renamed from: C */
    public final boolean m8364C() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: D */
    public final boolean m8365D() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: E */
    public final boolean m8366E() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: F */
    public final int m8367F() {
        int m8347a = C1647k3.m8347a(this.zzf);
        if (m8347a == 0) {
            return 1;
        }
        return m8347a;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1732p8
    /* renamed from: v */
    public final Object mo7884v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC1732p8.m8670n(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", C1631j3.f6920a, "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new C1663l3();
        }
        if (i11 == 4) {
            return new C1598h3(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* renamed from: w */
    public final int m8368w() {
        return this.zzi.size();
    }

    /* renamed from: z */
    public final String m8369z() {
        return this.zzg;
    }
}
