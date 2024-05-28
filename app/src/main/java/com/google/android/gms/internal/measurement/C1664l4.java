package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.l4 */
/* loaded from: classes.dex */
public final class C1664l4 extends AbstractC1732p8<C1664l4, C1648k4> implements InterfaceC1829v9 {
    private static final C1664l4 zza;
    private InterfaceC1844w8<C1696n4> zze = AbstractC1732p8.m8667k();

    static {
        C1664l4 c1664l4 = new C1664l4();
        zza = c1664l4;
        AbstractC1732p8.m8671o(C1664l4.class, c1664l4);
    }

    private C1664l4() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static /* synthetic */ void m8370A(C1664l4 c1664l4, C1696n4 c1696n4) {
        c1696n4.getClass();
        InterfaceC1844w8<C1696n4> interfaceC1844w8 = c1664l4.zze;
        if (!interfaceC1844w8.mo7888a()) {
            c1664l4.zze = AbstractC1732p8.m8668l(interfaceC1844w8);
        }
        c1664l4.zze.add(c1696n4);
    }

    /* renamed from: w */
    public static C1648k4 m8371w() {
        return zza.m8682p();
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
            return AbstractC1732p8.m8670n(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C1696n4.class});
        }
        if (i11 == 3) {
            return new C1664l4();
        }
        C1807u3 c1807u3 = null;
        if (i11 == 4) {
            return new C1648k4(c1807u3);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* renamed from: y */
    public final C1696n4 m8373y(int i10) {
        return this.zze.get(0);
    }

    /* renamed from: z */
    public final List<C1696n4> m8374z() {
        return this.zze;
    }
}
