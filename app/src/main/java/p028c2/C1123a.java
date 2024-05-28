package p028c2;

import sa.InterfaceC4551a;

/* renamed from: c2.a */
/* loaded from: classes.dex */
public final class C1123a<T> implements InterfaceC4551a<T> {

    /* renamed from: c */
    private static final Object f5449c = new Object();

    /* renamed from: a */
    private volatile InterfaceC4551a<T> f5450a;

    /* renamed from: b */
    private volatile Object f5451b = f5449c;

    private C1123a(InterfaceC4551a<T> interfaceC4551a) {
        this.f5450a = interfaceC4551a;
    }

    /* renamed from: a */
    public static <P extends InterfaceC4551a<T>, T> InterfaceC4551a<T> m6509a(P p10) {
        C1126d.m6513b(p10);
        return p10 instanceof C1123a ? p10 : new C1123a(p10);
    }

    /* renamed from: b */
    public static Object m6510b(Object obj, Object obj2) {
        if (!(obj != f5449c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // sa.InterfaceC4551a
    public T get() {
        T t10 = (T) this.f5451b;
        Object obj = f5449c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = (T) this.f5451b;
                if (t10 == obj) {
                    t10 = this.f5450a.get();
                    this.f5451b = m6510b(this.f5451b, t10);
                    this.f5450a = null;
                }
            }
        }
        return t10;
    }
}
