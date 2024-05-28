package p246t3;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedSet;

/* renamed from: t3.b1 */
/* loaded from: classes.dex */
final class C4630b1 {
    /* renamed from: a */
    public static boolean m18740a(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        Objects.requireNonNull(comparator);
        Objects.requireNonNull(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = C4688p0.f18487n;
            }
        } else {
            if (!(iterable instanceof InterfaceC4728z0)) {
                return false;
            }
            comparator2 = ((InterfaceC4728z0) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
