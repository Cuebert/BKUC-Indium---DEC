package p059e5;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: e5.a */
/* loaded from: classes.dex */
public final class C3069a<T> extends AbstractC3072d<T> {

    /* renamed from: n */
    static final C3069a<Object> f12903n = new C3069a<>();

    private C3069a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static <T> AbstractC3072d<T> m13536f() {
        return f12903n;
    }

    @Override // p059e5.AbstractC3072d
    /* renamed from: b */
    public T mo13537b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // p059e5.AbstractC3072d
    /* renamed from: c */
    public boolean mo13538c() {
        return false;
    }

    @Override // p059e5.AbstractC3072d
    /* renamed from: e */
    public T mo13539e(T t10) {
        return (T) C3075g.m13552g(t10, "use Optional.orNull() instead of Optional.or(null)");
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
