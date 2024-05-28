package p109i2;

import p028c2.InterfaceC1124b;
import p136k2.InterfaceC3749a;
import sa.InterfaceC4551a;

/* renamed from: i2.n0 */
/* loaded from: classes.dex */
public final class C3496n0 implements InterfaceC1124b<C3494m0> {

    /* renamed from: a */
    private final InterfaceC4551a<InterfaceC3749a> f14462a;

    /* renamed from: b */
    private final InterfaceC4551a<InterfaceC3749a> f14463b;

    /* renamed from: c */
    private final InterfaceC4551a<AbstractC3477e> f14464c;

    /* renamed from: d */
    private final InterfaceC4551a<C3508t0> f14465d;

    /* renamed from: e */
    private final InterfaceC4551a<String> f14466e;

    public C3496n0(InterfaceC4551a<InterfaceC3749a> interfaceC4551a, InterfaceC4551a<InterfaceC3749a> interfaceC4551a2, InterfaceC4551a<AbstractC3477e> interfaceC4551a3, InterfaceC4551a<C3508t0> interfaceC4551a4, InterfaceC4551a<String> interfaceC4551a5) {
        this.f14462a = interfaceC4551a;
        this.f14463b = interfaceC4551a2;
        this.f14464c = interfaceC4551a3;
        this.f14465d = interfaceC4551a4;
        this.f14466e = interfaceC4551a5;
    }

    /* renamed from: a */
    public static C3496n0 m15307a(InterfaceC4551a<InterfaceC3749a> interfaceC4551a, InterfaceC4551a<InterfaceC3749a> interfaceC4551a2, InterfaceC4551a<AbstractC3477e> interfaceC4551a3, InterfaceC4551a<C3508t0> interfaceC4551a4, InterfaceC4551a<String> interfaceC4551a5) {
        return new C3496n0(interfaceC4551a, interfaceC4551a2, interfaceC4551a3, interfaceC4551a4, interfaceC4551a5);
    }

    /* renamed from: c */
    public static C3494m0 m15308c(InterfaceC3749a interfaceC3749a, InterfaceC3749a interfaceC3749a2, Object obj, Object obj2, InterfaceC4551a<String> interfaceC4551a) {
        return new C3494m0(interfaceC3749a, interfaceC3749a2, (AbstractC3477e) obj, (C3508t0) obj2, interfaceC4551a);
    }

    @Override // sa.InterfaceC4551a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3494m0 get() {
        return m15308c(this.f14462a.get(), this.f14463b.get(), this.f14464c.get(), this.f14465d.get(), this.f14466e);
    }
}
