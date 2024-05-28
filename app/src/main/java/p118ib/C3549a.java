package p118ib;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C3844i;

/* renamed from: ib.a */
/* loaded from: classes.dex */
public final class C3549a<T> implements InterfaceC3550b<T> {

    /* renamed from: a */
    private final AtomicReference<InterfaceC3550b<T>> f15145a;

    public C3549a(InterfaceC3550b<? extends T> sequence) {
        C3844i.m16253f(sequence, "sequence");
        this.f15145a = new AtomicReference<>(sequence);
    }

    @Override // p118ib.InterfaceC3550b
    public Iterator<T> iterator() {
        InterfaceC3550b<T> andSet = this.f15145a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
