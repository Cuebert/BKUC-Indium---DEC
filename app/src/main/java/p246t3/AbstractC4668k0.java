package p246t3;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.SortedSet;

/* renamed from: t3.k0 */
/* loaded from: classes.dex */
public abstract class AbstractC4668k0 extends AbstractC4672l0 implements NavigableSet, InterfaceC4728z0 {

    /* renamed from: p */
    final transient Comparator f18468p;

    /* renamed from: q */
    transient AbstractC4668k0 f18469q;

    public AbstractC4668k0(Comparator comparator) {
        this.f18468p = comparator;
    }

    /* renamed from: A */
    public static C4708u0 m18780A(Comparator comparator) {
        if (C4688p0.f18487n.equals(comparator)) {
            return C4708u0.f18508s;
        }
        int i10 = AbstractC4624a0.f18417p;
        return new C4708u0(C4700s0.f18497s, comparator);
    }

    @Override // java.util.SortedSet, p246t3.InterfaceC4728z0
    public final Comparator comparator() {
        return this.f18468p;
    }

    @Override // java.util.SortedSet
    public abstract Object first();

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        Objects.requireNonNull(obj);
        return mo18783w(obj, false);
    }

    @Override // java.util.SortedSet
    public abstract Object last();

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        Objects.requireNonNull(obj);
        return mo18786z(obj, true);
    }

    /* renamed from: u */
    abstract AbstractC4668k0 mo18781u();

    @Override // java.util.NavigableSet
    /* renamed from: v */
    public final AbstractC4668k0 descendingSet() {
        AbstractC4668k0 abstractC4668k0 = this.f18469q;
        if (abstractC4668k0 != null) {
            return abstractC4668k0;
        }
        AbstractC4668k0 mo18781u = mo18781u();
        this.f18469q = mo18781u;
        mo18781u.f18469q = this;
        return mo18781u;
    }

    /* renamed from: w */
    public abstract AbstractC4668k0 mo18783w(Object obj, boolean z10);

    @Override // java.util.NavigableSet
    /* renamed from: x */
    public final AbstractC4668k0 subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj2);
        C4691q.m18805c(this.f18468p.compare(obj, obj2) <= 0);
        return mo18785y(obj, z10, obj2, z11);
    }

    /* renamed from: y */
    abstract AbstractC4668k0 mo18785y(Object obj, boolean z10, Object obj2, boolean z11);

    /* renamed from: z */
    abstract AbstractC4668k0 mo18786z(Object obj, boolean z10);

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet headSet(Object obj, boolean z10) {
        Objects.requireNonNull(obj);
        return mo18783w(obj, z10);
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet tailSet(Object obj, boolean z10) {
        Objects.requireNonNull(obj);
        return mo18786z(obj, z10);
    }
}
