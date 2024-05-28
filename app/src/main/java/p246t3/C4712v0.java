package p246t3;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: t3.v0 */
/* loaded from: classes.dex */
final class C4712v0 extends AbstractC4696r0 implements Serializable {

    /* renamed from: n */
    static final C4712v0 f18514n = new C4712v0();

    private C4712v0() {
    }

    @Override // p246t3.AbstractC4696r0
    /* renamed from: a */
    public final AbstractC4696r0 mo18800a() {
        return C4688p0.f18487n;
    }

    @Override // p246t3.AbstractC4696r0, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
