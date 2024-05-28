package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.v2 */
/* loaded from: classes.dex */
public final class C1822v2 extends AbstractC1732p8<C1822v2, C1806u2> implements InterfaceC1829v9 {
    private static final C1822v2 zza;
    private int zze;
    private int zzf;
    private InterfaceC1844w8<C1581g3> zzg = AbstractC1732p8.m8667k();
    private InterfaceC1844w8<C1854x2> zzh = AbstractC1732p8.m8667k();
    private boolean zzi;
    private boolean zzj;

    static {
        C1822v2 c1822v2 = new C1822v2();
        zza = c1822v2;
        AbstractC1732p8.m8671o(C1822v2.class, c1822v2);
    }

    private C1822v2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static /* synthetic */ void m8876E(C1822v2 c1822v2, int i10, C1581g3 c1581g3) {
        c1581g3.getClass();
        InterfaceC1844w8<C1581g3> interfaceC1844w8 = c1822v2.zzg;
        if (!interfaceC1844w8.mo7888a()) {
            c1822v2.zzg = AbstractC1732p8.m8668l(interfaceC1844w8);
        }
        c1822v2.zzg.set(i10, c1581g3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static /* synthetic */ void m8877F(C1822v2 c1822v2, int i10, C1854x2 c1854x2) {
        c1854x2.getClass();
        InterfaceC1844w8<C1854x2> interfaceC1844w8 = c1822v2.zzh;
        if (!interfaceC1844w8.mo7888a()) {
            c1822v2.zzh = AbstractC1732p8.m8668l(interfaceC1844w8);
        }
        c1822v2.zzh.set(i10, c1854x2);
    }

    /* renamed from: A */
    public final C1854x2 m8879A(int i10) {
        return this.zzh.get(i10);
    }

    /* renamed from: B */
    public final C1581g3 m8880B(int i10) {
        return this.zzg.get(i10);
    }

    /* renamed from: C */
    public final List<C1854x2> m8881C() {
        return this.zzh;
    }

    /* renamed from: D */
    public final List<C1581g3> m8882D() {
        return this.zzg;
    }

    /* renamed from: G */
    public final boolean m8883G() {
        return (this.zze & 1) != 0;
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
            return AbstractC1732p8.m8670n(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", C1581g3.class, "zzh", C1854x2.class, "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new C1822v2();
        }
        C1790t2 c1790t2 = null;
        if (i11 == 4) {
            return new C1806u2(c1790t2);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* renamed from: w */
    public final int m8884w() {
        return this.zzf;
    }

    /* renamed from: x */
    public final int m8885x() {
        return this.zzh.size();
    }

    /* renamed from: y */
    public final int m8886y() {
        return this.zzg.size();
    }
}
