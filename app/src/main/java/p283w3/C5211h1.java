package p283w3;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: w3.h1 */
/* loaded from: classes.dex */
class C5211h1<K, V> extends AbstractC5302o1<K> {

    /* renamed from: n */
    final Map<K, V> f19714n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5211h1(Map<K, V> map) {
        Objects.requireNonNull(map);
        this.f19714n = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f19714n.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f19714n.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<K> iterator() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19714n.size();
    }
}
