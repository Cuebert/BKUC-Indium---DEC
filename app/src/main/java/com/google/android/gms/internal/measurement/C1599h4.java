package com.google.android.gms.internal.measurement;

import com.appsflyer.oaid.BuildConfig;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h4 */
/* loaded from: classes.dex */
public final class C1599h4 extends AbstractC1732p8<C1599h4, C1582g4> implements InterfaceC1829v9 {
    private static final C1599h4 zza;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private InterfaceC1844w8<C1599h4> zzk = AbstractC1732p8.m8667k();

    static {
        C1599h4 c1599h4 = new C1599h4();
        zza = c1599h4;
        AbstractC1732p8.m8671o(C1599h4.class, c1599h4);
    }

    private C1599h4() {
    }

    /* renamed from: A */
    public static C1582g4 m8205A() {
        return zza.m8682p();
    }

    /* renamed from: F */
    public static /* synthetic */ void m8207F(C1599h4 c1599h4, String str) {
        str.getClass();
        c1599h4.zze |= 1;
        c1599h4.zzf = str;
    }

    /* renamed from: G */
    public static /* synthetic */ void m8208G(C1599h4 c1599h4, String str) {
        str.getClass();
        c1599h4.zze |= 2;
        c1599h4.zzg = str;
    }

    /* renamed from: H */
    public static /* synthetic */ void m8209H(C1599h4 c1599h4) {
        c1599h4.zze &= -3;
        c1599h4.zzg = zza.zzg;
    }

    /* renamed from: I */
    public static /* synthetic */ void m8210I(C1599h4 c1599h4, long j10) {
        c1599h4.zze |= 4;
        c1599h4.zzh = j10;
    }

    /* renamed from: J */
    public static /* synthetic */ void m8211J(C1599h4 c1599h4) {
        c1599h4.zze &= -5;
        c1599h4.zzh = 0L;
    }

    /* renamed from: K */
    public static /* synthetic */ void m8212K(C1599h4 c1599h4, double d10) {
        c1599h4.zze |= 16;
        c1599h4.zzj = d10;
    }

    /* renamed from: L */
    public static /* synthetic */ void m8213L(C1599h4 c1599h4) {
        c1599h4.zze &= -17;
        c1599h4.zzj = 0.0d;
    }

    /* renamed from: M */
    public static /* synthetic */ void m8214M(C1599h4 c1599h4, C1599h4 c1599h42) {
        c1599h42.getClass();
        c1599h4.m8217Y();
        c1599h4.zzk.add(c1599h42);
    }

    /* renamed from: N */
    public static /* synthetic */ void m8215N(C1599h4 c1599h4, Iterable iterable) {
        c1599h4.m8217Y();
        AbstractC1890z6.m9142c(iterable, c1599h4.zzk);
    }

    /* renamed from: Y */
    private final void m8217Y() {
        InterfaceC1844w8<C1599h4> interfaceC1844w8 = this.zzk;
        if (interfaceC1844w8.mo7888a()) {
            return;
        }
        this.zzk = AbstractC1732p8.m8668l(interfaceC1844w8);
    }

    /* renamed from: C */
    public final String m8218C() {
        return this.zzf;
    }

    /* renamed from: D */
    public final String m8219D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final List<C1599h4> m8220E() {
        return this.zzk;
    }

    /* renamed from: R */
    public final boolean m8221R() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: S */
    public final boolean m8222S() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: U */
    public final boolean m8223U() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: V */
    public final boolean m8224V() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: W */
    public final boolean m8225W() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1732p8
    /* renamed from: v */
    public final Object mo7884v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC1732p8.m8670n(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C1599h4.class});
        }
        if (i11 == 3) {
            return new C1599h4();
        }
        if (i11 == 4) {
            return new C1582g4(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* renamed from: w */
    public final double m8226w() {
        return this.zzj;
    }

    /* renamed from: x */
    public final float m8227x() {
        return this.zzi;
    }

    /* renamed from: y */
    public final int m8228y() {
        return this.zzk.size();
    }

    /* renamed from: z */
    public final long m8229z() {
        return this.zzh;
    }
}
