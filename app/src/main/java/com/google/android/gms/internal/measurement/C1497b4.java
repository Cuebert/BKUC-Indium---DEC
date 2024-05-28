package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.b4 */
/* loaded from: classes.dex */
public final class C1497b4 extends AbstractC1732p8<C1497b4, C1480a4> implements InterfaceC1829v9 {
    private static final C1497b4 zza;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        C1497b4 c1497b4 = new C1497b4();
        zza = c1497b4;
        AbstractC1732p8.m8671o(C1497b4.class, c1497b4);
    }

    private C1497b4() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static /* synthetic */ void m7943A(C1497b4 c1497b4, int i10) {
        c1497b4.zze |= 1;
        c1497b4.zzf = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static /* synthetic */ void m7944B(C1497b4 c1497b4, long j10) {
        c1497b4.zze |= 2;
        c1497b4.zzg = j10;
    }

    /* renamed from: y */
    public static C1480a4 m7945y() {
        return zza.m8682p();
    }

    /* renamed from: C */
    public final boolean m7947C() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: D */
    public final boolean m7948D() {
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
            return AbstractC1732p8.m8670n(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C1497b4();
        }
        C1807u3 c1807u3 = null;
        if (i11 == 4) {
            return new C1480a4(c1807u3);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* renamed from: w */
    public final int m7949w() {
        return this.zzf;
    }

    /* renamed from: x */
    public final long m7950x() {
        return this.zzg;
    }
}
