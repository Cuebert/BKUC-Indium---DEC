package p283w3;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w3.v */
/* loaded from: classes.dex */
public final class C5391v extends AbstractC5237j1 {

    /* renamed from: p */
    final transient Map f20189p;

    /* renamed from: q */
    final /* synthetic */ AbstractC5171e0 f20190q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5391v(AbstractC5171e0 abstractC5171e0, Map map) {
        this.f20190q = abstractC5171e0;
        this.f20189p = map;
    }

    @Override // p283w3.AbstractC5237j1
    /* renamed from: a */
    protected final Set<Map.Entry> mo19844a() {
        return new C5365t(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map;
        Map map2 = this.f20189p;
        map = this.f20190q.f19645p;
        if (map2 == map) {
            this.f20190q.m19800q();
        } else {
            C5158d1.m19771a(new C5378u(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return C5250k1.m19847b(this.f20189p, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(@NullableDecl Object obj) {
        return this == obj || this.f20189p.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) C5250k1.m19846a(this.f20189p, obj);
        if (collection == null) {
            return null;
        }
        return this.f20190q.mo19797f(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f20189p.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f20190q.mo19826j();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f20189p.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection mo19796e = this.f20190q.mo19796e();
        mo19796e.addAll(collection);
        AbstractC5171e0.m19790l(this.f20190q, collection.size());
        collection.clear();
        return mo19796e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f20189p.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f20189p.toString();
    }
}
