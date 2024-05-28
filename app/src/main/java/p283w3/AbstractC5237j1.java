package p283w3;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: w3.j1 */
/* loaded from: classes.dex */
abstract class AbstractC5237j1<K, V> extends AbstractMap<K, V> {

    /* renamed from: n */
    @NullableDecl
    private transient Set<Map.Entry<K, V>> f19815n;

    /* renamed from: o */
    @NullableDecl
    private transient Collection<V> f19816o;

    /* renamed from: a */
    abstract Set<Map.Entry<K, V>> mo19844a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f19815n;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> mo19844a = mo19844a();
        this.f19815n = mo19844a;
        return mo19844a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.f19816o;
        if (collection != null) {
            return collection;
        }
        C5224i1 c5224i1 = new C5224i1(this);
        this.f19816o = c5224i1;
        return c5224i1;
    }
}
