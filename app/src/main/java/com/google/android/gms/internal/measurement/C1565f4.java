package com.google.android.gms.internal.measurement;

import com.appsflyer.oaid.BuildConfig;

/* renamed from: com.google.android.gms.internal.measurement.f4 */
/* loaded from: classes.dex */
public final class C1565f4 extends AbstractC1732p8<C1565f4, C1548e4> implements InterfaceC1829v9 {
    private static final C1565f4 zza;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private long zzg;

    static {
        C1565f4 c1565f4 = new C1565f4();
        zza = c1565f4;
        AbstractC1732p8.m8671o(C1565f4.class, c1565f4);
    }

    private C1565f4() {
    }

    /* renamed from: w */
    public static C1548e4 m8150w() {
        return zza.m8682p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static /* synthetic */ void m8152y(C1565f4 c1565f4, String str) {
        str.getClass();
        c1565f4.zze |= 1;
        c1565f4.zzf = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static /* synthetic */ void m8153z(C1565f4 c1565f4, long j10) {
        c1565f4.zze |= 2;
        c1565f4.zzg = j10;
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
            return AbstractC1732p8.m8670n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C1565f4();
        }
        C1807u3 c1807u3 = null;
        if (i11 == 4) {
            return new C1548e4(c1807u3);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
