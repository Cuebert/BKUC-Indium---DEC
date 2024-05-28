package p309y3;

import java.util.HashMap;
import java.util.Map;
import p152l5.C3875b;
import p152l5.InterfaceC3877d;
import p152l5.InterfaceC3879f;
import p163m5.InterfaceC3957b;

/* renamed from: y3.c */
/* loaded from: classes.dex */
public final class C5657c implements InterfaceC3957b<C5657c> {

    /* renamed from: d */
    private static final InterfaceC3877d<Object> f20874d = new InterfaceC3877d() { // from class: y3.b
        @Override // p152l5.InterfaceC3877d
        /* renamed from: a */
        public final void mo79a(Object obj, Object obj2) {
            int i10 = C5657c.f20875e;
            String valueOf = String.valueOf(obj.getClass().getCanonicalName());
            throw new C3875b(valueOf.length() != 0 ? "Couldn't find encoder for type ".concat(valueOf) : new String("Couldn't find encoder for type "));
        }
    };

    /* renamed from: e */
    public static final /* synthetic */ int f20875e = 0;

    /* renamed from: a */
    private final Map<Class<?>, InterfaceC3877d<?>> f20876a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC3879f<?>> f20877b = new HashMap();

    /* renamed from: c */
    private final InterfaceC3877d<Object> f20878c = f20874d;

    @Override // p163m5.InterfaceC3957b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5657c mo16689a(Class cls, InterfaceC3877d interfaceC3877d) {
        this.f20876a.put(cls, interfaceC3877d);
        this.f20877b.remove(cls);
        return this;
    }

    /* renamed from: b */
    public final C5667d m20668b() {
        return new C5667d(new HashMap(this.f20876a), new HashMap(this.f20877b), this.f20878c);
    }
}
