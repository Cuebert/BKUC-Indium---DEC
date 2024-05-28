package p283w3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: w3.u */
/* loaded from: classes.dex */
final class C5378u implements Iterator<Map.Entry> {

    /* renamed from: n */
    final Iterator<Map.Entry> f20167n;

    /* renamed from: o */
    @NullableDecl
    Collection f20168o;

    /* renamed from: p */
    final /* synthetic */ C5391v f20169p;

    public C5378u(C5391v c5391v) {
        this.f20169p = c5391v;
        this.f20167n = c5391v.f20189p.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20167n.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
        Map.Entry next = this.f20167n.next();
        this.f20168o = (Collection) next.getValue();
        C5391v c5391v = this.f20169p;
        Object key = next.getKey();
        return new C5418x0(key, c5391v.f20190q.mo19797f(key, (Collection) next.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        C5313p.m19885d(this.f20168o != null, "no calls to next() since the last call to remove()");
        this.f20167n.remove();
        AbstractC5171e0.m19790l(this.f20169p.f20190q, this.f20168o.size());
        this.f20168o.clear();
        this.f20168o = null;
    }
}
