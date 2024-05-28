package p283w3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: w3.w */
/* loaded from: classes.dex */
final class C5404w implements Iterator {

    /* renamed from: n */
    @NullableDecl
    Map.Entry f20218n;

    /* renamed from: o */
    final /* synthetic */ Iterator f20219o;

    /* renamed from: p */
    final /* synthetic */ C5417x f20220p;

    public C5404w(C5417x c5417x, Iterator it) {
        this.f20220p = c5417x;
        this.f20219o = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20219o.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f20219o.next();
        this.f20218n = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        C5313p.m19885d(this.f20218n != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f20218n.getValue();
        this.f20219o.remove();
        AbstractC5171e0.m19790l(this.f20220p.f20252o, collection.size());
        collection.clear();
        this.f20218n = null;
    }
}
