package com.google.android.gms.internal.measurement;

import com.appsflyer.oaid.BuildConfig;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.j5 */
/* loaded from: classes.dex */
public final class C1633j5 extends AbstractC1732p8<C1633j5, C1566f5> implements InterfaceC1829v9 {
    private static final C1633j5 zza;
    private int zze;
    private int zzf;
    private InterfaceC1844w8<C1633j5> zzg = AbstractC1732p8.m8667k();
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;
    private boolean zzj;
    private double zzk;

    static {
        C1633j5 c1633j5 = new C1633j5();
        zza = c1633j5;
        AbstractC1732p8.m8671o(C1633j5.class, c1633j5);
    }

    private C1633j5() {
    }

    /* renamed from: A */
    public final List<C1633j5> m8320A() {
        return this.zzg;
    }

    /* renamed from: B */
    public final boolean m8321B() {
        return this.zzj;
    }

    /* renamed from: C */
    public final boolean m8322C() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: D */
    public final boolean m8323D() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: E */
    public final boolean m8324E() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: F */
    public final int m8325F() {
        int m8297a = C1617i5.m8297a(this.zzf);
        if (m8297a == 0) {
            return 1;
        }
        return m8297a;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1732p8
    /* renamed from: v */
    public final Object mo7884v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC1732p8.m8670n(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", C1600h5.f6820a, "zzg", C1633j5.class, "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new C1633j5();
        }
        if (i11 == 4) {
            return new C1566f5(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* renamed from: w */
    public final double m8326w() {
        return this.zzk;
    }

    /* renamed from: y */
    public final String m8327y() {
        return this.zzh;
    }

    /* renamed from: z */
    public final String m8328z() {
        return this.zzi;
    }
}
