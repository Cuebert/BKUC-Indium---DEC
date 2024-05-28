package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.play_billing.k2 */
/* loaded from: classes.dex */
final class C1972k2 implements InterfaceC2014q2 {

    /* renamed from: a */
    private final InterfaceC1944g2 f7724a;

    /* renamed from: b */
    private final AbstractC1959i3 f7725b;

    /* renamed from: c */
    private final boolean f7726c;

    /* renamed from: d */
    private final AbstractC2012q0 f7727d;

    private C1972k2(AbstractC1959i3 abstractC1959i3, AbstractC2012q0 abstractC2012q0, InterfaceC1944g2 interfaceC1944g2) {
        this.f7725b = abstractC1959i3;
        this.f7726c = abstractC2012q0.mo9555c(interfaceC1944g2);
        this.f7727d = abstractC2012q0;
        this.f7724a = interfaceC1944g2;
    }

    /* renamed from: j */
    public static C1972k2 m9486j(AbstractC1959i3 abstractC1959i3, AbstractC2012q0 abstractC2012q0, InterfaceC1944g2 interfaceC1944g2) {
        return new C1972k2(abstractC1959i3, abstractC2012q0, interfaceC1944g2);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2014q2
    /* renamed from: a */
    public final void mo9446a(Object obj) {
        this.f7725b.mo9396g(obj);
        this.f7727d.mo9554b(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2014q2
    /* renamed from: b */
    public final Object mo9447b() {
        InterfaceC1944g2 interfaceC1944g2 = this.f7724a;
        if (interfaceC1944g2 instanceof AbstractC1922d1) {
            return ((AbstractC1922d1) interfaceC1944g2).m9303j();
        }
        return interfaceC1944g2.mo9301g().mo9344b();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2014q2
    /* renamed from: c */
    public final int mo9448c(Object obj) {
        AbstractC1959i3 abstractC1959i3 = this.f7725b;
        int mo9391b = abstractC1959i3.mo9391b(abstractC1959i3.mo9393d(obj));
        if (!this.f7726c) {
            return mo9391b;
        }
        this.f7727d.mo9553a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2014q2
    /* renamed from: d */
    public final void mo9449d(Object obj, Object obj2) {
        C2028s2.m9587b(this.f7725b, obj, obj2);
        if (this.f7726c) {
            this.f7727d.mo9553a(obj2);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2014q2
    /* renamed from: e */
    public final int mo9450e(Object obj) {
        int hashCode = this.f7725b.mo9393d(obj).hashCode();
        if (!this.f7726c) {
            return hashCode;
        }
        this.f7727d.mo9553a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2014q2
    /* renamed from: f */
    public final void mo9451f(Object obj, InterfaceC1904a4 interfaceC1904a4) throws IOException {
        this.f7727d.mo9553a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2014q2
    /* renamed from: g */
    public final boolean mo9452g(Object obj, Object obj2) {
        if (!this.f7725b.mo9393d(obj).equals(this.f7725b.mo9393d(obj2))) {
            return false;
        }
        if (!this.f7726c) {
            return true;
        }
        this.f7727d.mo9553a(obj);
        this.f7727d.mo9553a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2014q2
    /* renamed from: h */
    public final boolean mo9453h(Object obj) {
        this.f7727d.mo9553a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2014q2
    /* renamed from: i */
    public final void mo9454i(Object obj, byte[] bArr, int i10, int i11, C1997o c1997o) throws IOException {
        AbstractC1922d1 abstractC1922d1 = (AbstractC1922d1) obj;
        if (abstractC1922d1.zzc == C1966j3.m9455c()) {
            abstractC1922d1.zzc = C1966j3.m9457f();
        }
        throw null;
    }
}
