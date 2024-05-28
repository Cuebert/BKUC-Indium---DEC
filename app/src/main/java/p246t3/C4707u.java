package p246t3;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

/* renamed from: t3.u */
/* loaded from: classes.dex */
final class C4707u extends AbstractC4696r0 implements Serializable {

    /* renamed from: n */
    final Comparator f18507n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4707u(Comparator comparator) {
        Objects.requireNonNull(comparator);
        this.f18507n = comparator;
    }

    @Override // p246t3.AbstractC4696r0, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f18507n.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4707u) {
            return this.f18507n.equals(((C4707u) obj).f18507n);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18507n.hashCode();
    }

    public final String toString() {
        return this.f18507n.toString();
    }
}
