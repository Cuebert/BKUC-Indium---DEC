package p283w3;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: w3.q0 */
/* loaded from: classes.dex */
final class C5327q0 extends AbstractCollection {

    /* renamed from: n */
    final /* synthetic */ C5340r0 f20022n;

    public C5327q0(C5340r0 c5340r0) {
        this.f20022n = c5340r0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f20022n.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C5340r0 c5340r0 = this.f20022n;
        Map m19937j = c5340r0.m19937j();
        if (m19937j != null) {
            return m19937j.values().iterator();
        }
        return new C5262l0(c5340r0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f20022n.size();
    }
}
