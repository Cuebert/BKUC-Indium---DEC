package p283w3;

import java.util.Iterator;
import java.util.Objects;

/* renamed from: w3.q1 */
/* loaded from: classes.dex */
abstract class AbstractC5328q1<F, T> implements Iterator<T> {

    /* renamed from: n */
    final Iterator<? extends F> f20023n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC5328q1(Iterator<? extends F> it) {
        Objects.requireNonNull(it);
        this.f20023n = it;
    }

    /* renamed from: a */
    abstract T mo19805a(F f10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20023n.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return mo19805a(this.f20023n.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f20023n.remove();
    }
}
