package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.v4 */
/* loaded from: classes.dex */
public final class C1824v4 extends AbstractC1732p8<C1824v4, C1808u4> implements InterfaceC1829v9 {
    private static final C1824v4 zza;
    private int zze;
    private int zzf;
    private InterfaceC1828v8 zzg = AbstractC1732p8.m8674t();

    static {
        C1824v4 c1824v4 = new C1824v4();
        zza = c1824v4;
        AbstractC1732p8.m8671o(C1824v4.class, c1824v4);
    }

    private C1824v4() {
    }

    /* renamed from: C */
    public static /* synthetic */ void m8888C(C1824v4 c1824v4, int i10) {
        c1824v4.zze |= 1;
        c1824v4.zzf = i10;
    }

    /* renamed from: D */
    public static /* synthetic */ void m8889D(C1824v4 c1824v4, Iterable iterable) {
        InterfaceC1828v8 interfaceC1828v8 = c1824v4.zzg;
        if (!interfaceC1828v8.mo7888a()) {
            c1824v4.zzg = AbstractC1732p8.m8675u(interfaceC1828v8);
        }
        AbstractC1890z6.m9142c(iterable, c1824v4.zzg);
    }

    /* renamed from: z */
    public static C1808u4 m8890z() {
        return zza.m8682p();
    }

    /* renamed from: B */
    public final List<Long> m8891B() {
        return this.zzg;
    }

    /* renamed from: E */
    public final boolean m8892E() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1732p8
    /* renamed from: v */
    public final Object mo7884v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC1732p8.m8670n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C1824v4();
        }
        if (i11 == 4) {
            return new C1808u4(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* renamed from: w */
    public final int m8893w() {
        return this.zzg.size();
    }

    /* renamed from: x */
    public final int m8894x() {
        return this.zzf;
    }

    /* renamed from: y */
    public final long m8895y(int i10) {
        return this.zzg.mo8306f(i10);
    }
}
