package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.d5 */
/* loaded from: classes.dex */
public final class C1926d5 extends AbstractC1922d1 implements InterfaceC1951h2 {
    private static final C1926d5 zzb;
    private int zzd;
    private int zze;

    static {
        C1926d5 c1926d5 = new C1926d5();
        zzb = c1926d5;
        AbstractC1922d1.m9293p(C1926d5.class, c1926d5);
    }

    private C1926d5() {
    }

    /* renamed from: x */
    public static C1926d5 m9318x() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.play_billing.AbstractC1922d1
    /* renamed from: t */
    public final Object mo9309t(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC1922d1.m9292m(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C1919c5.f7641a});
        }
        if (i11 == 3) {
            return new C1926d5();
        }
        if (i11 == 4) {
            return new C1912b5(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
