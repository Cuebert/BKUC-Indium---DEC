package p246t3;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: t3.w0 */
/* loaded from: classes.dex */
public final class C4716w0 extends AbstractC4696r0 implements Serializable {

    /* renamed from: n */
    final AbstractC4696r0 f18520n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4716w0(AbstractC4696r0 abstractC4696r0) {
        this.f18520n = abstractC4696r0;
    }

    @Override // p246t3.AbstractC4696r0
    /* renamed from: a */
    public final AbstractC4696r0 mo18800a() {
        return this.f18520n;
    }

    @Override // p246t3.AbstractC4696r0, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f18520n.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4716w0) {
            return this.f18520n.equals(((C4716w0) obj).f18520n);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f18520n.hashCode();
    }

    public final String toString() {
        return this.f18520n.toString().concat(".reverse()");
    }
}
