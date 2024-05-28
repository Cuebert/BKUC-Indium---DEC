package com.google.android.gms.internal.measurement;

import com.appsflyer.oaid.BuildConfig;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.r3 */
/* loaded from: classes.dex */
public final class C1759r3 extends AbstractC1732p8<C1759r3, C1743q3> implements InterfaceC1829v9 {
    private static final C1759r3 zza;
    private int zze;
    private long zzf;
    private int zzh;
    private boolean zzm;
    private String zzg = BuildConfig.FLAVOR;
    private InterfaceC1844w8<C1791t3> zzi = AbstractC1732p8.m8667k();
    private InterfaceC1844w8<C1727p3> zzj = AbstractC1732p8.m8667k();
    private InterfaceC1844w8<C1822v2> zzk = AbstractC1732p8.m8667k();
    private String zzl = BuildConfig.FLAVOR;
    private InterfaceC1844w8<C1549e5> zzn = AbstractC1732p8.m8667k();

    static {
        C1759r3 c1759r3 = new C1759r3();
        zza = c1759r3;
        AbstractC1732p8.m8671o(C1759r3.class, c1759r3);
    }

    private C1759r3() {
    }

    /* renamed from: A */
    public static C1743q3 m8740A() {
        return zza.m8682p();
    }

    /* renamed from: C */
    public static C1759r3 m8742C() {
        return zza;
    }

    /* renamed from: H */
    public static /* synthetic */ void m8743H(C1759r3 c1759r3, int i10, C1727p3 c1727p3) {
        c1727p3.getClass();
        InterfaceC1844w8<C1727p3> interfaceC1844w8 = c1759r3.zzj;
        if (!interfaceC1844w8.mo7888a()) {
            c1759r3.zzj = AbstractC1732p8.m8668l(interfaceC1844w8);
        }
        c1759r3.zzj.set(i10, c1727p3);
    }

    /* renamed from: D */
    public final String m8745D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final List<C1822v2> m8746E() {
        return this.zzk;
    }

    /* renamed from: F */
    public final List<C1549e5> m8747F() {
        return this.zzn;
    }

    /* renamed from: G */
    public final List<C1791t3> m8748G() {
        return this.zzi;
    }

    /* renamed from: J */
    public final boolean m8749J() {
        return this.zzm;
    }

    /* renamed from: K */
    public final boolean m8750K() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: L */
    public final boolean m8751L() {
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
            return AbstractC1732p8.m8670n(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C1791t3.class, "zzj", C1727p3.class, "zzk", C1822v2.class, "zzl", "zzm", "zzn", C1549e5.class});
        }
        if (i11 == 3) {
            return new C1759r3();
        }
        if (i11 == 4) {
            return new C1743q3(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* renamed from: w */
    public final int m8752w() {
        return this.zzn.size();
    }

    /* renamed from: x */
    public final int m8753x() {
        return this.zzj.size();
    }

    /* renamed from: y */
    public final long m8754y() {
        return this.zzf;
    }

    /* renamed from: z */
    public final C1727p3 m8755z(int i10) {
        return this.zzj.get(i10);
    }
}
