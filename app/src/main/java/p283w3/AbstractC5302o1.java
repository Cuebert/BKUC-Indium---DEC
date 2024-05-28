package p283w3;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Objects;

/* renamed from: w3.o1 */
/* loaded from: classes.dex */
abstract class AbstractC5302o1<E> extends AbstractSet<E> {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        return C5315p1.m19888a(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        return super.retainAll(collection);
    }
}
