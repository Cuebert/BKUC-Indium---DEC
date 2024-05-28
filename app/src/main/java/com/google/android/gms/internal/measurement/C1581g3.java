package com.google.android.gms.internal.measurement;

import com.appsflyer.oaid.BuildConfig;

/* renamed from: com.google.android.gms.internal.measurement.g3 */
/* loaded from: classes.dex */
public final class C1581g3 extends AbstractC1732p8<C1581g3, C1564f3> implements InterfaceC1829v9 {
    private static final C1581g3 zza;
    private int zze;
    private int zzf;
    private String zzg = BuildConfig.FLAVOR;
    private C1886z2 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        C1581g3 c1581g3 = new C1581g3();
        zza = c1581g3;
        AbstractC1732p8.m8671o(C1581g3.class, c1581g3);
    }

    private C1581g3() {
    }

    /* renamed from: B */
    public static /* synthetic */ void m8175B(C1581g3 c1581g3, String str) {
        c1581g3.zze |= 2;
        c1581g3.zzg = str;
    }

    /* renamed from: y */
    public static C1564f3 m8176y() {
        return zza.m8682p();
    }

    /* renamed from: A */
    public final String m8178A() {
        return this.zzg;
    }

    /* renamed from: C */
    public final boolean m8179C() {
        return this.zzi;
    }

    /* renamed from: D */
    public final boolean m8180D() {
        return this.zzj;
    }

    /* renamed from: E */
    public final boolean m8181E() {
        return this.zzk;
    }

    /* renamed from: F */
    public final boolean m8182F() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: G */
    public final boolean m8183G() {
        return (this.zze & 32) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1732p8
    /* renamed from: v */
    public final Object mo7884v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC1732p8.m8670n(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new C1581g3();
        }
        if (i11 == 4) {
            return new C1564f3(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* renamed from: w */
    public final int m8184w() {
        return this.zzf;
    }

    /* renamed from: x */
    public final C1886z2 m8185x() {
        C1886z2 c1886z2 = this.zzh;
        return c1886z2 == null ? C1886z2.m9119x() : c1886z2;
    }
}
