package p095h2;

import java.util.concurrent.Executor;
import p028c2.InterfaceC1124b;
import p109i2.InterfaceC3475d;
import p123j2.InterfaceC3595b;
import sa.InterfaceC4551a;

/* renamed from: h2.w */
/* loaded from: classes.dex */
public final class C3389w implements InterfaceC1124b<C3388v> {

    /* renamed from: a */
    private final InterfaceC4551a<Executor> f14194a;

    /* renamed from: b */
    private final InterfaceC4551a<InterfaceC3475d> f14195b;

    /* renamed from: c */
    private final InterfaceC4551a<InterfaceC3390x> f14196c;

    /* renamed from: d */
    private final InterfaceC4551a<InterfaceC3595b> f14197d;

    public C3389w(InterfaceC4551a<Executor> interfaceC4551a, InterfaceC4551a<InterfaceC3475d> interfaceC4551a2, InterfaceC4551a<InterfaceC3390x> interfaceC4551a3, InterfaceC4551a<InterfaceC3595b> interfaceC4551a4) {
        this.f14194a = interfaceC4551a;
        this.f14195b = interfaceC4551a2;
        this.f14196c = interfaceC4551a3;
        this.f14197d = interfaceC4551a4;
    }

    /* renamed from: a */
    public static C3389w m14942a(InterfaceC4551a<Executor> interfaceC4551a, InterfaceC4551a<InterfaceC3475d> interfaceC4551a2, InterfaceC4551a<InterfaceC3390x> interfaceC4551a3, InterfaceC4551a<InterfaceC3595b> interfaceC4551a4) {
        return new C3389w(interfaceC4551a, interfaceC4551a2, interfaceC4551a3, interfaceC4551a4);
    }

    /* renamed from: c */
    public static C3388v m14943c(Executor executor, InterfaceC3475d interfaceC3475d, InterfaceC3390x interfaceC3390x, InterfaceC3595b interfaceC3595b) {
        return new C3388v(executor, interfaceC3475d, interfaceC3390x, interfaceC3595b);
    }

    @Override // sa.InterfaceC4551a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3388v get() {
        return m14943c(this.f14194a.get(), this.f14195b.get(), this.f14196c.get(), this.f14197d.get());
    }
}
