package p308y2;

/* renamed from: y2.h */
/* loaded from: classes.dex */
public final class C5614h<L> {

    /* renamed from: a */
    private final L f20793a;

    /* renamed from: b */
    private final String f20794b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5614h)) {
            return false;
        }
        C5614h c5614h = (C5614h) obj;
        return this.f20793a == c5614h.f20793a && this.f20794b.equals(c5614h.f20794b);
    }

    public int hashCode() {
        return (System.identityHashCode(this.f20793a) * 31) + this.f20794b.hashCode();
    }
}
