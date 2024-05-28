package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.z3 */
/* loaded from: classes.dex */
public final class C1887z3 extends AbstractC1732p8<C1887z3, C1871y3> implements InterfaceC1829v9 {
    private static final C1887z3 zza;
    private int zze;
    private int zzf;
    private C1792t4 zzg;
    private C1792t4 zzh;
    private boolean zzi;

    static {
        C1887z3 c1887z3 = new C1887z3();
        zza = c1887z3;
        AbstractC1732p8.m8671o(C1887z3.class, c1887z3);
    }

    private C1887z3() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static /* synthetic */ void m9128B(C1887z3 c1887z3, int i10) {
        c1887z3.zze |= 1;
        c1887z3.zzf = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static /* synthetic */ void m9129C(C1887z3 c1887z3, C1792t4 c1792t4) {
        c1792t4.getClass();
        c1887z3.zzg = c1792t4;
        c1887z3.zze |= 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static /* synthetic */ void m9130D(C1887z3 c1887z3, C1792t4 c1792t4) {
        c1887z3.zzh = c1792t4;
        c1887z3.zze |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static /* synthetic */ void m9131E(C1887z3 c1887z3, boolean z10) {
        c1887z3.zze |= 8;
        c1887z3.zzi = z10;
    }

    /* renamed from: x */
    public static C1871y3 m9132x() {
        return zza.m8682p();
    }

    /* renamed from: A */
    public final C1792t4 m9134A() {
        C1792t4 c1792t4 = this.zzh;
        return c1792t4 == null ? C1792t4.m8824D() : c1792t4;
    }

    /* renamed from: F */
    public final boolean m9135F() {
        return this.zzi;
    }

    /* renamed from: G */
    public final boolean m9136G() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: H */
    public final boolean m9137H() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: I */
    public final boolean m9138I() {
        return (this.zze & 4) != 0;
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
            return AbstractC1732p8.m8670n(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new C1887z3();
        }
        C1807u3 c1807u3 = null;
        if (i11 == 4) {
            return new C1871y3(c1807u3);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* renamed from: w */
    public final int m9139w() {
        return this.zzf;
    }

    /* renamed from: z */
    public final C1792t4 m9140z() {
        C1792t4 c1792t4 = this.zzg;
        return c1792t4 == null ? C1792t4.m8824D() : c1792t4;
    }
}
