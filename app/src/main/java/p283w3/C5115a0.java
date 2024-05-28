package p283w3;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: w3.a0 */
/* loaded from: classes.dex */
class C5115a0 implements Iterator {

    /* renamed from: n */
    final Iterator f19380n;

    /* renamed from: o */
    final Collection f19381o;

    /* renamed from: p */
    final /* synthetic */ C5129b0 f19382p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5115a0(C5129b0 c5129b0) {
        Iterator it;
        this.f19382p = c5129b0;
        Collection collection = c5129b0.f19394o;
        this.f19381o = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f19380n = it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5115a0(C5129b0 c5129b0, Iterator it) {
        this.f19382p = c5129b0;
        this.f19381o = c5129b0.f19394o;
        this.f19380n = it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m19750a() {
        this.f19382p.zzb();
        if (this.f19382p.f19394o != this.f19381o) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m19750a();
        return this.f19380n.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        m19750a();
        return this.f19380n.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f19380n.remove();
        AbstractC5171e0.m19788i(this.f19382p.f19397r);
        this.f19382p.m19756e();
    }
}
