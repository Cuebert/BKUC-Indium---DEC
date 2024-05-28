package androidx.core.util;

/* renamed from: androidx.core.util.d */
/* loaded from: classes.dex */
public class C0650d<F, S> {

    /* renamed from: a */
    public final F f3493a;

    /* renamed from: b */
    public final S f3494b;

    public boolean equals(Object obj) {
        if (!(obj instanceof C0650d)) {
            return false;
        }
        C0650d c0650d = (C0650d) obj;
        return C0649c.m3452a(c0650d.f3493a, this.f3493a) && C0649c.m3452a(c0650d.f3494b, this.f3494b);
    }

    public int hashCode() {
        F f10 = this.f3493a;
        int hashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.f3494b;
        return hashCode ^ (s10 != null ? s10.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f3493a + " " + this.f3494b + "}";
    }
}
