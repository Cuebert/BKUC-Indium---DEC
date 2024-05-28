package p283w3;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: w3.m0 */
/* loaded from: classes.dex */
final class C5275m0 extends AbstractSet<Map.Entry> {

    /* renamed from: n */
    final /* synthetic */ C5340r0 f19890n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5275m0(C5340r0 c5340r0) {
        this.f19890n = c5340r0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f19890n.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@NullableDecl Object obj) {
        int m19931p;
        Map m19937j = this.f19890n.m19937j();
        if (m19937j != null) {
            return m19937j.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            m19931p = this.f19890n.m19931p(entry.getKey());
            if (m19931p != -1 && C5261l.m19848a(this.f19890n.f20079q[m19931p], entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        C5340r0 c5340r0 = this.f19890n;
        Map m19937j = c5340r0.m19937j();
        if (m19937j != null) {
            return m19937j.entrySet().iterator();
        }
        return new C5249k0(c5340r0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@NullableDecl Object obj) {
        int m19930o;
        Object obj2;
        Map m19937j = this.f19890n.m19937j();
        if (m19937j != null) {
            return m19937j.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.f19890n.m19941n()) {
            return false;
        }
        m19930o = this.f19890n.m19930o();
        Object key = entry.getKey();
        Object value = entry.getValue();
        obj2 = this.f19890n.f20076n;
        C5340r0 c5340r0 = this.f19890n;
        int m19960b = C5353s0.m19960b(key, value, m19930o, obj2, c5340r0.f20077o, c5340r0.f20078p, c5340r0.f20079q);
        if (m19960b == -1) {
            return false;
        }
        this.f19890n.m19940m(m19960b, m19930o);
        C5340r0.m19926d(this.f19890n);
        this.f19890n.m19938k();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19890n.size();
    }
}
