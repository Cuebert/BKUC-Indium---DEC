package p028c2;

/* renamed from: c2.c */
/* loaded from: classes.dex */
public final class C1125c<T> implements InterfaceC1124b<T> {

    /* renamed from: b */
    private static final C1125c<Object> f5452b = new C1125c<>(null);

    /* renamed from: a */
    private final T f5453a;

    private C1125c(T t10) {
        this.f5453a = t10;
    }

    /* renamed from: a */
    public static <T> InterfaceC1124b<T> m6511a(T t10) {
        return new C1125c(C1126d.m6514c(t10, "instance cannot be null"));
    }

    @Override // sa.InterfaceC4551a
    public T get() {
        return this.f5453a;
    }
}
