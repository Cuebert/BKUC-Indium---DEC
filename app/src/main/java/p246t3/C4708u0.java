package p246t3;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: t3.u0 */
/* loaded from: classes.dex */
public final class C4708u0 extends AbstractC4668k0 {

    /* renamed from: s */
    static final C4708u0 f18508s;

    /* renamed from: r */
    final transient AbstractC4624a0 f18509r;

    static {
        int i10 = AbstractC4624a0.f18417p;
        f18508s = new C4708u0(C4700s0.f18497s, C4688p0.f18487n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4708u0(AbstractC4624a0 abstractC4624a0, Comparator comparator) {
        super(comparator);
        this.f18509r = abstractC4624a0;
    }

    @Override // java.util.NavigableSet
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final AbstractC4635c1 descendingIterator() {
        return this.f18509r.mo18721m().listIterator(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public final int m18830C(Object obj, boolean z10) {
        AbstractC4624a0 abstractC4624a0 = this.f18509r;
        Objects.requireNonNull(obj);
        int binarySearch = Collections.binarySearch(abstractC4624a0, obj, this.f18468p);
        return binarySearch >= 0 ? z10 ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public final int m18831D(Object obj, boolean z10) {
        AbstractC4624a0 abstractC4624a0 = this.f18509r;
        Objects.requireNonNull(obj);
        int binarySearch = Collections.binarySearch(abstractC4624a0, obj, this.f18468p);
        return binarySearch >= 0 ? z10 ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public final C4708u0 m18832E(int i10, int i11) {
        if (i10 == 0) {
            if (i11 == this.f18509r.size()) {
                return this;
            }
            i10 = 0;
        }
        if (i10 < i11) {
            return new C4708u0(this.f18509r.subList(i10, i11), this.f18468p);
        }
        return AbstractC4668k0.m18780A(this.f18468p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p246t3.AbstractC4715w
    /* renamed from: c */
    public final int mo18719c(Object[] objArr, int i10) {
        return this.f18509r.mo18719c(objArr, 0);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int m18831D = m18831D(obj, true);
        if (m18831D == this.f18509r.size()) {
            return null;
        }
        return this.f18509r.get(m18831D);
    }

    @Override // p246t3.AbstractC4715w, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f18509r, obj, this.f18468p) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC4684o0) {
            collection = ((InterfaceC4684o0) collection).zza();
        }
        if (C4630b1.m18740a(this.f18468p, collection) && collection.size() > 1) {
            AbstractC4640d1 listIterator = this.f18509r.listIterator(0);
            Iterator it = collection.iterator();
            if (!listIterator.hasNext()) {
                return false;
            }
            Object next = it.next();
            E next2 = listIterator.next();
            while (true) {
                try {
                    int compare = this.f18468p.compare(next2, next);
                    if (compare >= 0) {
                        if (compare != 0) {
                            break;
                        }
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    } else {
                        if (!listIterator.hasNext()) {
                            return false;
                        }
                        next2 = listIterator.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        } else {
            return super.containsAll(collection);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p246t3.AbstractC4715w
    /* renamed from: e */
    public final int mo18813e() {
        return this.f18509r.mo18813e();
    }

    @Override // p246t3.AbstractC4644e0, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.f18509r.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (C4630b1.m18740a(this.f18468p, set)) {
            Iterator it = set.iterator();
            try {
                AbstractC4640d1 listIterator = this.f18509r.listIterator(0);
                while (listIterator.hasNext()) {
                    E next = listIterator.next();
                    Object next2 = it.next();
                    if (next2 == null || this.f18468p.compare(next, next2) != 0) {
                        return false;
                    }
                }
                return true;
            } catch (ClassCastException | NoSuchElementException unused) {
                return false;
            }
        }
        return containsAll(set);
    }

    @Override // p246t3.AbstractC4668k0, java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.f18509r.get(0);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int m18830C = m18830C(obj, true) - 1;
        if (m18830C == -1) {
            return null;
        }
        return this.f18509r.get(m18830C);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int m18831D = m18831D(obj, false);
        if (m18831D == this.f18509r.size()) {
            return null;
        }
        return this.f18509r.get(m18831D);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p246t3.AbstractC4715w
    /* renamed from: i */
    public final int mo18814i() {
        return this.f18509r.mo18814i();
    }

    @Override // p246t3.AbstractC4644e0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f18509r.listIterator(0);
    }

    @Override // p246t3.AbstractC4644e0, p246t3.AbstractC4715w
    /* renamed from: k */
    public final AbstractC4635c1 iterator() {
        return this.f18509r.listIterator(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p246t3.AbstractC4715w
    /* renamed from: l */
    public final Object[] mo18815l() {
        return this.f18509r.mo18815l();
    }

    @Override // p246t3.AbstractC4668k0, java.util.SortedSet
    public final Object last() {
        if (!isEmpty()) {
            return this.f18509r.get(r0.size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int m18830C = m18830C(obj, false) - 1;
        if (m18830C == -1) {
            return null;
        }
        return this.f18509r.get(m18830C);
    }

    @Override // p246t3.AbstractC4644e0
    /* renamed from: q */
    public final AbstractC4624a0 mo18752q() {
        return this.f18509r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18509r.size();
    }

    @Override // p246t3.AbstractC4668k0
    /* renamed from: u */
    final AbstractC4668k0 mo18781u() {
        Comparator reverseOrder = Collections.reverseOrder(this.f18468p);
        if (isEmpty()) {
            return AbstractC4668k0.m18780A(reverseOrder);
        }
        return new C4708u0(this.f18509r.mo18721m(), reverseOrder);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p246t3.AbstractC4668k0
    /* renamed from: w */
    public final AbstractC4668k0 mo18783w(Object obj, boolean z10) {
        return m18832E(0, m18830C(obj, z10));
    }

    @Override // p246t3.AbstractC4668k0
    /* renamed from: y */
    final AbstractC4668k0 mo18785y(Object obj, boolean z10, Object obj2, boolean z11) {
        return mo18786z(obj, z10).mo18783w(obj2, z11);
    }

    @Override // p246t3.AbstractC4668k0
    /* renamed from: z */
    final AbstractC4668k0 mo18786z(Object obj, boolean z10) {
        return m18832E(m18831D(obj, z10), this.f18509r.size());
    }
}
