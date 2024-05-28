package p283w3;

import java.util.HashMap;
import java.util.Map;
import p152l5.C3875b;
import p152l5.InterfaceC3877d;
import p152l5.InterfaceC3879f;
import p163m5.InterfaceC3957b;

/* renamed from: w3.f2 */
/* loaded from: classes.dex */
public final class C5186f2 implements InterfaceC3957b<C5186f2> {

    /* renamed from: d */
    private static final InterfaceC3877d<Object> f19665d = new InterfaceC3877d() { // from class: w3.e2
        @Override // p152l5.InterfaceC3877d
        /* renamed from: a */
        public final void mo79a(Object obj, Object obj2) {
            int i10 = C5186f2.f19666e;
            String valueOf = String.valueOf(obj.getClass().getCanonicalName());
            throw new C3875b(valueOf.length() != 0 ? "Couldn't find encoder for type ".concat(valueOf) : new String("Couldn't find encoder for type "));
        }
    };

    /* renamed from: e */
    public static final /* synthetic */ int f19666e = 0;

    /* renamed from: a */
    private final Map<Class<?>, InterfaceC3877d<?>> f19667a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC3879f<?>> f19668b = new HashMap();

    /* renamed from: c */
    private final InterfaceC3877d<Object> f19669c = f19665d;

    @Override // p163m5.InterfaceC3957b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5186f2 mo16689a(Class cls, InterfaceC3877d interfaceC3877d) {
        this.f19667a.put(cls, interfaceC3877d);
        this.f19668b.remove(cls);
        return this;
    }

    /* renamed from: b */
    public final C5199g2 m19806b() {
        return new C5199g2(new HashMap(this.f19667a), new HashMap(this.f19668b), this.f19669c);
    }
}
