package p045d5;

/* renamed from: d5.i */
/* loaded from: classes.dex */
public final class C2990i implements InterfaceC2994m {

    /* renamed from: c */
    private static final Object f12686c = new Object();

    /* renamed from: a */
    private volatile InterfaceC2994m f12687a;

    /* renamed from: b */
    private volatile Object f12688b = f12686c;

    private C2990i(InterfaceC2994m interfaceC2994m) {
        this.f12687a = interfaceC2994m;
    }

    /* renamed from: b */
    public static InterfaceC2994m m13461b(InterfaceC2994m interfaceC2994m) {
        return interfaceC2994m instanceof C2990i ? interfaceC2994m : new C2990i(interfaceC2994m);
    }

    @Override // p045d5.InterfaceC2994m
    /* renamed from: a */
    public final Object mo6269a() {
        Object obj = this.f12688b;
        Object obj2 = f12686c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f12688b;
                if (obj == obj2) {
                    obj = this.f12687a.mo6269a();
                    Object obj3 = this.f12688b;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f12688b = obj;
                    this.f12687a = null;
                }
            }
        }
        return obj;
    }
}
