package com.google.android.gms.internal.measurement;

import com.appsflyer.oaid.BuildConfig;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.d4 */
/* loaded from: classes.dex */
public final class C1531d4 extends AbstractC1732p8<C1531d4, C1514c4> implements InterfaceC1829v9 {
    private static final C1531d4 zza;
    private int zze;
    private InterfaceC1844w8<C1599h4> zzf = AbstractC1732p8.m8667k();
    private String zzg = BuildConfig.FLAVOR;
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        C1531d4 c1531d4 = new C1531d4();
        zza = c1531d4;
        AbstractC1732p8.m8671o(C1531d4.class, c1531d4);
    }

    private C1531d4() {
    }

    /* renamed from: A */
    public static C1514c4 m8019A() {
        return zza.m8682p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static /* synthetic */ void m8021F(C1531d4 c1531d4, int i10, C1599h4 c1599h4) {
        c1599h4.getClass();
        c1531d4.m8029S();
        c1531d4.zzf.set(i10, c1599h4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static /* synthetic */ void m8022G(C1531d4 c1531d4, C1599h4 c1599h4) {
        c1599h4.getClass();
        c1531d4.m8029S();
        c1531d4.zzf.add(c1599h4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static /* synthetic */ void m8023H(C1531d4 c1531d4, Iterable iterable) {
        c1531d4.m8029S();
        AbstractC1890z6.m9142c(iterable, c1531d4.zzf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public static /* synthetic */ void m8025J(C1531d4 c1531d4, int i10) {
        c1531d4.m8029S();
        c1531d4.zzf.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public static /* synthetic */ void m8026K(C1531d4 c1531d4, String str) {
        str.getClass();
        c1531d4.zze |= 1;
        c1531d4.zzg = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static /* synthetic */ void m8027L(C1531d4 c1531d4, long j10) {
        c1531d4.zze |= 2;
        c1531d4.zzh = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public static /* synthetic */ void m8028M(C1531d4 c1531d4, long j10) {
        c1531d4.zze |= 4;
        c1531d4.zzi = j10;
    }

    /* renamed from: S */
    private final void m8029S() {
        InterfaceC1844w8<C1599h4> interfaceC1844w8 = this.zzf;
        if (interfaceC1844w8.mo7888a()) {
            return;
        }
        this.zzf = AbstractC1732p8.m8668l(interfaceC1844w8);
    }

    /* renamed from: C */
    public final C1599h4 m8030C(int i10) {
        return this.zzf.get(i10);
    }

    /* renamed from: D */
    public final String m8031D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final List<C1599h4> m8032E() {
        return this.zzf;
    }

    /* renamed from: N */
    public final boolean m8033N() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: P */
    public final boolean m8034P() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: R */
    public final boolean m8035R() {
        return (this.zze & 2) != 0;
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
            return AbstractC1732p8.m8670n(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", C1599h4.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new C1531d4();
        }
        C1807u3 c1807u3 = null;
        if (i11 == 4) {
            return new C1514c4(c1807u3);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* renamed from: w */
    public final int m8036w() {
        return this.zzj;
    }

    /* renamed from: x */
    public final int m8037x() {
        return this.zzf.size();
    }

    /* renamed from: y */
    public final long m8038y() {
        return this.zzi;
    }

    /* renamed from: z */
    public final long m8039z() {
        return this.zzh;
    }
}
