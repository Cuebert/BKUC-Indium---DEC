package p246t3;

import java.util.Map;

/* renamed from: t3.d0 */
/* loaded from: classes.dex */
abstract class AbstractC4639d0 extends AbstractC4644e0 {
    @Override // p246t3.AbstractC4715w, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = mo18747u().get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // p246t3.AbstractC4644e0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return C4720x0.m18859a(mo18747u().m18743c());
    }

    @Override // p246t3.AbstractC4644e0
    /* renamed from: o */
    final boolean mo18746o() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return mo18747u().size();
    }

    /* renamed from: u */
    abstract AbstractC4634c0 mo18747u();
}
