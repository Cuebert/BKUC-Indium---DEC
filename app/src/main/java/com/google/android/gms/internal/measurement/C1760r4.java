package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r4 */
/* loaded from: classes.dex */
public final class C1760r4 extends AbstractC1732p8<C1760r4, C1712o4> implements InterfaceC1829v9 {
    private static final C1760r4 zza;
    private int zze;
    private int zzf = 1;
    private InterfaceC1844w8<C1565f4> zzg = AbstractC1732p8.m8667k();

    static {
        C1760r4 c1760r4 = new C1760r4();
        zza = c1760r4;
        AbstractC1732p8.m8671o(C1760r4.class, c1760r4);
    }

    private C1760r4() {
    }

    /* renamed from: w */
    public static C1712o4 m8756w() {
        return zza.m8682p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static /* synthetic */ void m8758y(C1760r4 c1760r4, C1565f4 c1565f4) {
        c1565f4.getClass();
        InterfaceC1844w8<C1565f4> interfaceC1844w8 = c1760r4.zzg;
        if (!interfaceC1844w8.mo7888a()) {
            c1760r4.zzg = AbstractC1732p8.m8668l(interfaceC1844w8);
        }
        c1760r4.zzg.add(c1565f4);
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
            return AbstractC1732p8.m8670n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", C1744q4.f7180a, "zzg", C1565f4.class});
        }
        if (i11 == 3) {
            return new C1760r4();
        }
        C1807u3 c1807u3 = null;
        if (i11 == 4) {
            return new C1712o4(c1807u3);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
