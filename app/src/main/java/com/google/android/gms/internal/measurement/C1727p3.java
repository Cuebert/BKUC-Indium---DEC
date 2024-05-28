package com.google.android.gms.internal.measurement;

import com.appsflyer.oaid.BuildConfig;

/* renamed from: com.google.android.gms.internal.measurement.p3 */
/* loaded from: classes.dex */
public final class C1727p3 extends AbstractC1732p8<C1727p3, C1695n3> implements InterfaceC1829v9 {
    private static final C1727p3 zza;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        C1727p3 c1727p3 = new C1727p3();
        zza = c1727p3;
        AbstractC1732p8.m8671o(C1727p3.class, c1727p3);
    }

    private C1727p3() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static /* synthetic */ void m8646z(C1727p3 c1727p3, String str) {
        str.getClass();
        c1727p3.zze |= 1;
        c1727p3.zzf = str;
    }

    /* renamed from: A */
    public final boolean m8647A() {
        return this.zzg;
    }

    /* renamed from: B */
    public final boolean m8648B() {
        return this.zzh;
    }

    /* renamed from: C */
    public final boolean m8649C() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: D */
    public final boolean m8650D() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: E */
    public final boolean m8651E() {
        return (this.zze & 8) != 0;
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
            return AbstractC1732p8.m8670n(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new C1727p3();
        }
        C1679m3 c1679m3 = null;
        if (i11 == 4) {
            return new C1695n3(c1679m3);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* renamed from: w */
    public final int m8652w() {
        return this.zzi;
    }

    /* renamed from: y */
    public final String m8653y() {
        return this.zzf;
    }
}
