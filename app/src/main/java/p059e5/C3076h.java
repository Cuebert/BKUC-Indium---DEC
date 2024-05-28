package p059e5;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: e5.h */
/* loaded from: classes.dex */
public final class C3076h<T> extends AbstractC3072d<T> {

    /* renamed from: n */
    private final T f12906n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3076h(T t10) {
        this.f12906n = t10;
    }

    @Override // p059e5.AbstractC3072d
    /* renamed from: b */
    public T mo13537b() {
        return this.f12906n;
    }

    @Override // p059e5.AbstractC3072d
    /* renamed from: c */
    public boolean mo13538c() {
        return true;
    }

    @Override // p059e5.AbstractC3072d
    /* renamed from: e */
    public T mo13539e(T t10) {
        C3075g.m13552g(t10, "use Optional.orNull() instead of Optional.or(null)");
        return this.f12906n;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3076h) {
            return this.f12906n.equals(((C3076h) obj).f12906n);
        }
        return false;
    }

    public int hashCode() {
        return this.f12906n.hashCode() + 1502476572;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f12906n);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 13);
        sb2.append("Optional.of(");
        sb2.append(valueOf);
        sb2.append(")");
        return sb2.toString();
    }
}
