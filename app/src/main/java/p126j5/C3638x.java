package p126j5;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p248t5.InterfaceC4733b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j5.x */
/* loaded from: classes.dex */
public class C3638x<T> implements InterfaceC4733b<Set<T>> {

    /* renamed from: b */
    private volatile Set<T> f15314b = null;

    /* renamed from: a */
    private volatile Set<InterfaceC4733b<T>> f15313a = Collections.newSetFromMap(new ConcurrentHashMap());

    C3638x(Collection<InterfaceC4733b<T>> collection) {
        this.f15313a.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C3638x<?> m15544b(Collection<InterfaceC4733b<?>> collection) {
        return new C3638x<>((Set) collection);
    }

    /* renamed from: d */
    private synchronized void m15545d() {
        Iterator<InterfaceC4733b<T>> it = this.f15313a.iterator();
        while (it.hasNext()) {
            this.f15314b.add(it.next().get());
        }
        this.f15313a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m15546a(InterfaceC4733b<T> interfaceC4733b) {
        if (this.f15314b == null) {
            this.f15313a.add(interfaceC4733b);
        } else {
            this.f15314b.add(interfaceC4733b.get());
        }
    }

    @Override // p248t5.InterfaceC4733b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        if (this.f15314b == null) {
            synchronized (this) {
                if (this.f15314b == null) {
                    this.f15314b = Collections.newSetFromMap(new ConcurrentHashMap());
                    m15545d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f15314b);
    }
}
