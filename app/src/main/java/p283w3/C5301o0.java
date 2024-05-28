package p283w3;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: w3.o0 */
/* loaded from: classes.dex */
final class C5301o0 extends AbstractSet {

    /* renamed from: n */
    final /* synthetic */ C5340r0 f19945n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5301o0(C5340r0 c5340r0) {
        this.f19945n = c5340r0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f19945n.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f19945n.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C5340r0 c5340r0 = this.f19945n;
        Map m19937j = c5340r0.m19937j();
        if (m19937j != null) {
            return m19937j.keySet().iterator();
        }
        return new C5236j0(c5340r0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@NullableDecl Object obj) {
        Object m19933r;
        Object obj2;
        Map m19937j = this.f19945n.m19937j();
        if (m19937j != null) {
            return m19937j.keySet().remove(obj);
        }
        m19933r = this.f19945n.m19933r(obj);
        obj2 = C5340r0.f20075w;
        return m19933r != obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19945n.size();
    }
}
