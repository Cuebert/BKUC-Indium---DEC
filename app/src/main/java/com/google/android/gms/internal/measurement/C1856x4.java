package com.google.android.gms.internal.measurement;

import com.appsflyer.oaid.BuildConfig;

/* renamed from: com.google.android.gms.internal.measurement.x4 */
/* loaded from: classes.dex */
public final class C1856x4 extends AbstractC1732p8<C1856x4, C1840w4> implements InterfaceC1829v9 {
    private static final C1856x4 zza;
    private int zze;
    private long zzf;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        C1856x4 c1856x4 = new C1856x4();
        zza = c1856x4;
        AbstractC1732p8.m8671o(C1856x4.class, c1856x4);
    }

    private C1856x4() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static /* synthetic */ void m8972D(C1856x4 c1856x4, long j10) {
        c1856x4.zze |= 1;
        c1856x4.zzf = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static /* synthetic */ void m8973E(C1856x4 c1856x4, String str) {
        str.getClass();
        c1856x4.zze |= 2;
        c1856x4.zzg = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static /* synthetic */ void m8974F(C1856x4 c1856x4, String str) {
        str.getClass();
        c1856x4.zze |= 4;
        c1856x4.zzh = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static /* synthetic */ void m8975G(C1856x4 c1856x4) {
        c1856x4.zze &= -5;
        c1856x4.zzh = zza.zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static /* synthetic */ void m8976H(C1856x4 c1856x4, long j10) {
        c1856x4.zze |= 8;
        c1856x4.zzi = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public static /* synthetic */ void m8977I(C1856x4 c1856x4) {
        c1856x4.zze &= -9;
        c1856x4.zzi = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public static /* synthetic */ void m8978J(C1856x4 c1856x4, double d10) {
        c1856x4.zze |= 32;
        c1856x4.zzk = d10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public static /* synthetic */ void m8979K(C1856x4 c1856x4) {
        c1856x4.zze &= -33;
        c1856x4.zzk = 0.0d;
    }

    /* renamed from: z */
    public static C1840w4 m8980z() {
        return zza.m8682p();
    }

    /* renamed from: B */
    public final String m8981B() {
        return this.zzg;
    }

    /* renamed from: C */
    public final String m8982C() {
        return this.zzh;
    }

    /* renamed from: L */
    public final boolean m8983L() {
        return (this.zze & 32) != 0;
    }

    /* renamed from: M */
    public final boolean m8984M() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: N */
    public final boolean m8985N() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: P */
    public final boolean m8986P() {
        return (this.zze & 4) != 0;
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
            return AbstractC1732p8.m8670n(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new C1856x4();
        }
        C1807u3 c1807u3 = null;
        if (i11 == 4) {
            return new C1840w4(c1807u3);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* renamed from: w */
    public final double m8987w() {
        return this.zzk;
    }

    /* renamed from: x */
    public final long m8988x() {
        return this.zzi;
    }

    /* renamed from: y */
    public final long m8989y() {
        return this.zzf;
    }
}
