package p083g2;

import p028c2.C1126d;
import p028c2.InterfaceC1124b;
import p095h2.AbstractC3372f;
import p136k2.InterfaceC3749a;
import sa.InterfaceC4551a;

/* renamed from: g2.g */
/* loaded from: classes.dex */
public final class C3236g implements InterfaceC1124b<AbstractC3372f> {

    /* renamed from: a */
    private final InterfaceC4551a<InterfaceC3749a> f13673a;

    public C3236g(InterfaceC4551a<InterfaceC3749a> interfaceC4551a) {
        this.f13673a = interfaceC4551a;
    }

    /* renamed from: a */
    public static AbstractC3372f m14470a(InterfaceC3749a interfaceC3749a) {
        return (AbstractC3372f) C1126d.m6514c(AbstractC3235f.m14469a(interfaceC3749a), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C3236g m14471b(InterfaceC4551a<InterfaceC3749a> interfaceC4551a) {
        return new C3236g(interfaceC4551a);
    }

    @Override // sa.InterfaceC4551a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC3372f get() {
        return m14470a(this.f13673a.get());
    }
}
