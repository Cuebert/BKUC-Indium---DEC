package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.t4 */
/* loaded from: classes.dex */
public final class C1792t4 extends AbstractC1732p8<C1792t4, C1776s4> implements InterfaceC1829v9 {
    private static final C1792t4 zza;
    private InterfaceC1828v8 zze = AbstractC1732p8.m8674t();
    private InterfaceC1828v8 zzf = AbstractC1732p8.m8674t();
    private InterfaceC1844w8<C1497b4> zzg = AbstractC1732p8.m8667k();
    private InterfaceC1844w8<C1824v4> zzh = AbstractC1732p8.m8667k();

    static {
        C1792t4 c1792t4 = new C1792t4();
        zza = c1792t4;
        AbstractC1732p8.m8671o(C1792t4.class, c1792t4);
    }

    private C1792t4() {
    }

    /* renamed from: B */
    public static C1776s4 m8822B() {
        return zza.m8682p();
    }

    /* renamed from: D */
    public static C1792t4 m8824D() {
        return zza;
    }

    /* renamed from: J */
    public static /* synthetic */ void m8825J(C1792t4 c1792t4, Iterable iterable) {
        InterfaceC1828v8 interfaceC1828v8 = c1792t4.zze;
        if (!interfaceC1828v8.mo7888a()) {
            c1792t4.zze = AbstractC1732p8.m8675u(interfaceC1828v8);
        }
        AbstractC1890z6.m9142c(iterable, c1792t4.zze);
    }

    /* renamed from: L */
    public static /* synthetic */ void m8827L(C1792t4 c1792t4, Iterable iterable) {
        InterfaceC1828v8 interfaceC1828v8 = c1792t4.zzf;
        if (!interfaceC1828v8.mo7888a()) {
            c1792t4.zzf = AbstractC1732p8.m8675u(interfaceC1828v8);
        }
        AbstractC1890z6.m9142c(iterable, c1792t4.zzf);
    }

    /* renamed from: N */
    public static /* synthetic */ void m8829N(C1792t4 c1792t4, Iterable iterable) {
        c1792t4.m8833U();
        AbstractC1890z6.m9142c(iterable, c1792t4.zzg);
    }

    /* renamed from: P */
    public static /* synthetic */ void m8830P(C1792t4 c1792t4, int i10) {
        c1792t4.m8833U();
        c1792t4.zzg.remove(i10);
    }

    /* renamed from: R */
    public static /* synthetic */ void m8831R(C1792t4 c1792t4, Iterable iterable) {
        c1792t4.m8834V();
        AbstractC1890z6.m9142c(iterable, c1792t4.zzh);
    }

    /* renamed from: S */
    public static /* synthetic */ void m8832S(C1792t4 c1792t4, int i10) {
        c1792t4.m8834V();
        c1792t4.zzh.remove(i10);
    }

    /* renamed from: U */
    private final void m8833U() {
        InterfaceC1844w8<C1497b4> interfaceC1844w8 = this.zzg;
        if (interfaceC1844w8.mo7888a()) {
            return;
        }
        this.zzg = AbstractC1732p8.m8668l(interfaceC1844w8);
    }

    /* renamed from: V */
    private final void m8834V() {
        InterfaceC1844w8<C1824v4> interfaceC1844w8 = this.zzh;
        if (interfaceC1844w8.mo7888a()) {
            return;
        }
        this.zzh = AbstractC1732p8.m8668l(interfaceC1844w8);
    }

    /* renamed from: A */
    public final C1497b4 m8835A(int i10) {
        return this.zzg.get(i10);
    }

    /* renamed from: E */
    public final C1824v4 m8836E(int i10) {
        return this.zzh.get(i10);
    }

    /* renamed from: F */
    public final List<C1497b4> m8837F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final List<Long> m8838G() {
        return this.zzf;
    }

    /* renamed from: H */
    public final List<C1824v4> m8839H() {
        return this.zzh;
    }

    /* renamed from: I */
    public final List<Long> m8840I() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1732p8
    /* renamed from: v */
    public final Object mo7884v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC1732p8.m8670n(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", C1497b4.class, "zzh", C1824v4.class});
        }
        if (i11 == 3) {
            return new C1792t4();
        }
        if (i11 == 4) {
            return new C1776s4(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* renamed from: w */
    public final int m8841w() {
        return this.zzg.size();
    }

    /* renamed from: x */
    public final int m8842x() {
        return this.zzf.size();
    }

    /* renamed from: y */
    public final int m8843y() {
        return this.zzh.size();
    }

    /* renamed from: z */
    public final int m8844z() {
        return this.zze.size();
    }
}
