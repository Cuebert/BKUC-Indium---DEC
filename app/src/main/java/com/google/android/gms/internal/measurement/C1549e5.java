package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.e5 */
/* loaded from: classes.dex */
public final class C1549e5 extends AbstractC1732p8<C1549e5, C1532d5> implements InterfaceC1829v9 {
    private static final C1549e5 zza;
    private int zze;
    private InterfaceC1844w8<C1633j5> zzf = AbstractC1732p8.m8667k();
    private C1481a5 zzg;

    static {
        C1549e5 c1549e5 = new C1549e5();
        zza = c1549e5;
        AbstractC1732p8.m8671o(C1549e5.class, c1549e5);
    }

    private C1549e5() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1732p8
    /* renamed from: v */
    public final Object mo7884v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC1732p8.m8670n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", C1633j5.class, "zzg"});
        }
        if (i11 == 3) {
            return new C1549e5();
        }
        if (i11 == 4) {
            return new C1532d5(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* renamed from: w */
    public final C1481a5 m8086w() {
        C1481a5 c1481a5 = this.zzg;
        return c1481a5 == null ? C1481a5.m7883y() : c1481a5;
    }

    /* renamed from: y */
    public final List<C1633j5> m8087y() {
        return this.zzf;
    }
}
