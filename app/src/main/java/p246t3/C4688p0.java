package p246t3;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: t3.p0 */
/* loaded from: classes.dex */
final class C4688p0 extends AbstractC4696r0 implements Serializable {

    /* renamed from: n */
    static final C4688p0 f18487n = new C4688p0();

    private C4688p0() {
    }

    @Override // p246t3.AbstractC4696r0
    /* renamed from: a */
    public final AbstractC4696r0 mo18800a() {
        return C4712v0.f18514n;
    }

    @Override // p246t3.AbstractC4696r0, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        Objects.requireNonNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
