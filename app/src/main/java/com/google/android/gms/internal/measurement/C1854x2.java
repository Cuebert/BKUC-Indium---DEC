package com.google.android.gms.internal.measurement;

import com.appsflyer.oaid.BuildConfig;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x2 */
/* loaded from: classes.dex */
public final class C1854x2 extends AbstractC1732p8<C1854x2, C1838w2> implements InterfaceC1829v9 {
    private static final C1854x2 zza;
    private int zze;
    private int zzf;
    private String zzg = BuildConfig.FLAVOR;
    private InterfaceC1844w8<C1886z2> zzh = AbstractC1732p8.m8667k();
    private boolean zzi;
    private C1547e3 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        C1854x2 c1854x2 = new C1854x2();
        zza = c1854x2;
        AbstractC1732p8.m8671o(C1854x2.class, c1854x2);
    }

    private C1854x2() {
    }

    /* renamed from: E */
    public static /* synthetic */ void m8954E(C1854x2 c1854x2, String str) {
        c1854x2.zze |= 2;
        c1854x2.zzg = str;
    }

    /* renamed from: F */
    public static /* synthetic */ void m8955F(C1854x2 c1854x2, int i10, C1886z2 c1886z2) {
        c1886z2.getClass();
        InterfaceC1844w8<C1886z2> interfaceC1844w8 = c1854x2.zzh;
        if (!interfaceC1844w8.mo7888a()) {
            c1854x2.zzh = AbstractC1732p8.m8668l(interfaceC1844w8);
        }
        c1854x2.zzh.set(i10, c1886z2);
    }

    /* renamed from: y */
    public static C1838w2 m8956y() {
        return zza.m8682p();
    }

    /* renamed from: A */
    public final C1886z2 m8958A(int i10) {
        return this.zzh.get(i10);
    }

    /* renamed from: B */
    public final C1547e3 m8959B() {
        C1547e3 c1547e3 = this.zzj;
        return c1547e3 == null ? C1547e3.m8072x() : c1547e3;
    }

    /* renamed from: C */
    public final String m8960C() {
        return this.zzg;
    }

    /* renamed from: D */
    public final List<C1886z2> m8961D() {
        return this.zzh;
    }

    /* renamed from: G */
    public final boolean m8962G() {
        return this.zzk;
    }

    /* renamed from: H */
    public final boolean m8963H() {
        return this.zzl;
    }

    /* renamed from: I */
    public final boolean m8964I() {
        return this.zzm;
    }

    /* renamed from: J */
    public final boolean m8965J() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: K */
    public final boolean m8966K() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: L */
    public final boolean m8967L() {
        return (this.zze & 64) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1732p8
    /* renamed from: v */
    public final Object mo7884v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC1732p8.m8670n(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", C1886z2.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i11 == 3) {
            return new C1854x2();
        }
        if (i11 == 4) {
            return new C1838w2(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* renamed from: w */
    public final int m8968w() {
        return this.zzh.size();
    }

    /* renamed from: x */
    public final int m8969x() {
        return this.zzf;
    }
}
