package kotlin.jvm.internal;

/* renamed from: kotlin.jvm.internal.k */
/* loaded from: classes.dex */
public final class C3846k implements InterfaceC3837b {

    /* renamed from: n */
    private final Class<?> f15901n;

    /* renamed from: o */
    private final String f15902o;

    public C3846k(Class<?> jClass, String moduleName) {
        C3844i.m16253f(jClass, "jClass");
        C3844i.m16253f(moduleName, "moduleName");
        this.f15901n = jClass;
        this.f15902o = moduleName;
    }

    @Override // kotlin.jvm.internal.InterfaceC3837b
    /* renamed from: a */
    public Class<?> mo16245a() {
        return this.f15901n;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3846k) && C3844i.m16248a(mo16245a(), ((C3846k) obj).mo16245a());
    }

    public int hashCode() {
        return mo16245a().hashCode();
    }

    public String toString() {
        return mo16245a().toString() + " (Kotlin reflection is not available)";
    }
}
