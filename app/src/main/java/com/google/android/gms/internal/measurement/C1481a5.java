package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.a5 */
/* loaded from: classes.dex */
public final class C1481a5 extends AbstractC1732p8<C1481a5, C1888z4> implements InterfaceC1829v9 {
    private static final C1481a5 zza;
    private InterfaceC1844w8<C1515c5> zze = AbstractC1732p8.m8667k();

    static {
        C1481a5 c1481a5 = new C1481a5();
        zza = c1481a5;
        AbstractC1732p8.m8671o(C1481a5.class, c1481a5);
    }

    private C1481a5() {
    }

    /* renamed from: y */
    public static C1481a5 m7883y() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1732p8
    /* renamed from: v */
    public final Object mo7884v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC1732p8.m8670n(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C1515c5.class});
        }
        if (i11 == 3) {
            return new C1481a5();
        }
        if (i11 == 4) {
            return new C1888z4(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* renamed from: w */
    public final int m7885w() {
        return this.zze.size();
    }

    /* renamed from: z */
    public final List<C1515c5> m7886z() {
        return this.zze;
    }
}
