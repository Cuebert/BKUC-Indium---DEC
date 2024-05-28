package va;

import kotlin.jvm.internal.C3844i;
import p051db.InterfaceC3045p;
import va.InterfaceC5001e;

/* renamed from: va.a */
/* loaded from: classes.dex */
public abstract class AbstractC4997a implements InterfaceC5001e.a {

    /* renamed from: n */
    private final InterfaceC5001e.b<?> f19097n;

    public AbstractC4997a(InterfaceC5001e.b<?> key) {
        C3844i.m16253f(key, "key");
        this.f19097n = key;
    }

    @Override // va.InterfaceC5001e
    /* renamed from: b */
    public <R> R mo16089b(R r10, InterfaceC3045p<? super R, ? super InterfaceC5001e.a, ? extends R> interfaceC3045p) {
        return (R) InterfaceC5001e.a.C6060a.m19451a(this, r10, interfaceC3045p);
    }

    @Override // va.InterfaceC5001e.a
    public InterfaceC5001e.b<?> getKey() {
        return this.f19097n;
    }

    @Override // va.InterfaceC5001e
    /* renamed from: i */
    public <E extends InterfaceC5001e.a> E mo16094i(InterfaceC5001e.b<E> bVar) {
        return (E) InterfaceC5001e.a.C6060a.m19452b(this, bVar);
    }
}
