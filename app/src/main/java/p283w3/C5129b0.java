package p283w3;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w3.b0 */
/* loaded from: classes.dex */
public class C5129b0 extends AbstractCollection {

    /* renamed from: n */
    @NullableDecl
    final Object f19393n;

    /* renamed from: o */
    Collection f19394o;

    /* renamed from: p */
    @NullableDecl
    final C5129b0 f19395p;

    /* renamed from: q */
    @NullableDecl
    final Collection f19396q;

    /* renamed from: r */
    final /* synthetic */ AbstractC5171e0 f19397r;

    public C5129b0(@NullableDecl AbstractC5171e0 abstractC5171e0, Object obj, @NullableDecl Collection collection, C5129b0 c5129b0) {
        this.f19397r = abstractC5171e0;
        this.f19393n = obj;
        this.f19394o = collection;
        this.f19395p = c5129b0;
        this.f19396q = c5129b0 == null ? null : c5129b0.f19394o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean isEmpty = this.f19394o.isEmpty();
        boolean add = this.f19394o.add(obj);
        if (!add) {
            return add;
        }
        AbstractC5171e0.m19787g(this.f19397r);
        if (!isEmpty) {
            return add;
        }
        m19755c();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f19394o.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        AbstractC5171e0.m19789k(this.f19397r, this.f19394o.size() - size);
        if (size != 0) {
            return addAll;
        }
        m19755c();
        return true;
    }

    /* renamed from: c */
    public final void m19755c() {
        Map map;
        C5129b0 c5129b0 = this.f19395p;
        if (c5129b0 != null) {
            c5129b0.m19755c();
        } else {
            map = this.f19397r.f19645p;
            map.put(this.f19393n, this.f19394o);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f19394o.clear();
        AbstractC5171e0.m19790l(this.f19397r, size);
        m19756e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.f19394o.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        zzb();
        return this.f19394o.containsAll(collection);
    }

    /* renamed from: e */
    public final void m19756e() {
        Map map;
        C5129b0 c5129b0 = this.f19395p;
        if (c5129b0 != null) {
            c5129b0.m19756e();
        } else if (this.f19394o.isEmpty()) {
            map = this.f19397r.f19645p;
            map.remove(this.f19393n);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f19394o.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f19394o.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new C5115a0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zzb();
        boolean remove = this.f19394o.remove(obj);
        if (remove) {
            AbstractC5171e0.m19788i(this.f19397r);
            m19756e();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f19394o.removeAll(collection);
        if (removeAll) {
            AbstractC5171e0.m19789k(this.f19397r, this.f19394o.size() - size);
            m19756e();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        int size = size();
        boolean retainAll = this.f19394o.retainAll(collection);
        if (retainAll) {
            AbstractC5171e0.m19789k(this.f19397r, this.f19394o.size() - size);
            m19756e();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f19394o.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f19394o.toString();
    }

    public final void zzb() {
        Map map;
        C5129b0 c5129b0 = this.f19395p;
        if (c5129b0 != null) {
            c5129b0.zzb();
            if (this.f19395p.f19394o != this.f19396q) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f19394o.isEmpty()) {
            map = this.f19397r.f19645p;
            Collection collection = (Collection) map.get(this.f19393n);
            if (collection != null) {
                this.f19394o = collection;
            }
        }
    }
}
