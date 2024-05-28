package p020b6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: b6.i */
/* loaded from: classes.dex */
public final class C1058i extends AbstractC1061l implements Iterable<AbstractC1061l> {

    /* renamed from: n */
    private final List<AbstractC1061l> f5295n = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C1058i) && ((C1058i) obj).f5295n.equals(this.f5295n));
    }

    public int hashCode() {
        return this.f5295n.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<AbstractC1061l> iterator() {
        return this.f5295n.iterator();
    }

    /* renamed from: p */
    public void m6332p(AbstractC1061l abstractC1061l) {
        if (abstractC1061l == null) {
            abstractC1061l = C1063n.f5296a;
        }
        this.f5295n.add(abstractC1061l);
    }
}
