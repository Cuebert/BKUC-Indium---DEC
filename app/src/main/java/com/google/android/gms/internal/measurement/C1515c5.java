package com.google.android.gms.internal.measurement;

import com.appsflyer.oaid.BuildConfig;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.c5 */
/* loaded from: classes.dex */
public final class C1515c5 extends AbstractC1732p8<C1515c5, C1498b5> implements InterfaceC1829v9 {
    private static final C1515c5 zza;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private InterfaceC1844w8<C1633j5> zzg = AbstractC1732p8.m8667k();

    static {
        C1515c5 c1515c5 = new C1515c5();
        zza = c1515c5;
        AbstractC1732p8.m8671o(C1515c5.class, c1515c5);
    }

    private C1515c5() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1732p8
    /* renamed from: v */
    public final Object mo7884v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC1732p8.m8670n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", C1633j5.class});
        }
        if (i11 == 3) {
            return new C1515c5();
        }
        if (i11 == 4) {
            return new C1498b5(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* renamed from: x */
    public final String m7999x() {
        return this.zzf;
    }

    /* renamed from: y */
    public final List<C1633j5> m8000y() {
        return this.zzg;
    }
}
