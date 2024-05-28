package p083g2;

import java.util.concurrent.Executor;
import p016b2.InterfaceC0973e;
import p028c2.InterfaceC1124b;
import p095h2.InterfaceC3390x;
import p109i2.InterfaceC3475d;
import p123j2.InterfaceC3595b;
import sa.InterfaceC4551a;

/* renamed from: g2.d */
/* loaded from: classes.dex */
public final class C3233d implements InterfaceC1124b<C3232c> {

    /* renamed from: a */
    private final InterfaceC4551a<Executor> f13668a;

    /* renamed from: b */
    private final InterfaceC4551a<InterfaceC0973e> f13669b;

    /* renamed from: c */
    private final InterfaceC4551a<InterfaceC3390x> f13670c;

    /* renamed from: d */
    private final InterfaceC4551a<InterfaceC3475d> f13671d;

    /* renamed from: e */
    private final InterfaceC4551a<InterfaceC3595b> f13672e;

    public C3233d(InterfaceC4551a<Executor> interfaceC4551a, InterfaceC4551a<InterfaceC0973e> interfaceC4551a2, InterfaceC4551a<InterfaceC3390x> interfaceC4551a3, InterfaceC4551a<InterfaceC3475d> interfaceC4551a4, InterfaceC4551a<InterfaceC3595b> interfaceC4551a5) {
        this.f13668a = interfaceC4551a;
        this.f13669b = interfaceC4551a2;
        this.f13670c = interfaceC4551a3;
        this.f13671d = interfaceC4551a4;
        this.f13672e = interfaceC4551a5;
    }

    /* renamed from: a */
    public static C3233d m14466a(InterfaceC4551a<Executor> interfaceC4551a, InterfaceC4551a<InterfaceC0973e> interfaceC4551a2, InterfaceC4551a<InterfaceC3390x> interfaceC4551a3, InterfaceC4551a<InterfaceC3475d> interfaceC4551a4, InterfaceC4551a<InterfaceC3595b> interfaceC4551a5) {
        return new C3233d(interfaceC4551a, interfaceC4551a2, interfaceC4551a3, interfaceC4551a4, interfaceC4551a5);
    }

    /* renamed from: c */
    public static C3232c m14467c(Executor executor, InterfaceC0973e interfaceC0973e, InterfaceC3390x interfaceC3390x, InterfaceC3475d interfaceC3475d, InterfaceC3595b interfaceC3595b) {
        return new C3232c(executor, interfaceC0973e, interfaceC3390x, interfaceC3475d, interfaceC3595b);
    }

    @Override // sa.InterfaceC4551a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3232c get() {
        return m14467c(this.f13668a.get(), this.f13669b.get(), this.f13670c.get(), this.f13671d.get(), this.f13672e.get());
    }
}
