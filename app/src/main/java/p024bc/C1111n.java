package p024bc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bc.n */
/* loaded from: classes.dex */
public final class C1111n {

    /* renamed from: a */
    final Object f5438a;

    /* renamed from: b */
    final C1109l f5439b;

    /* renamed from: c */
    volatile boolean f5440c = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1111n(Object obj, C1109l c1109l) {
        this.f5438a = obj;
        this.f5439b = c1109l;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1111n)) {
            return false;
        }
        C1111n c1111n = (C1111n) obj;
        return this.f5438a == c1111n.f5438a && this.f5439b.equals(c1111n.f5439b);
    }

    public int hashCode() {
        return this.f5438a.hashCode() + this.f5439b.f5424f.hashCode();
    }
}
