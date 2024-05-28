package p283w3;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: w3.e0 */
/* loaded from: classes.dex */
public abstract class AbstractC5171e0<K, V> extends AbstractC5197g0<K, V> implements Serializable {

    /* renamed from: p */
    private transient Map<K, Collection<V>> f19645p;

    /* renamed from: q */
    private transient int f19646q;

    public AbstractC5171e0(Map<K, Collection<V>> map) {
        if (map.isEmpty()) {
            this.f19645p = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    public static /* synthetic */ int m19787g(AbstractC5171e0 abstractC5171e0) {
        int i10 = abstractC5171e0.f19646q;
        abstractC5171e0.f19646q = i10 + 1;
        return i10;
    }

    /* renamed from: i */
    public static /* synthetic */ int m19788i(AbstractC5171e0 abstractC5171e0) {
        int i10 = abstractC5171e0.f19646q;
        abstractC5171e0.f19646q = i10 - 1;
        return i10;
    }

    /* renamed from: k */
    public static /* synthetic */ int m19789k(AbstractC5171e0 abstractC5171e0, int i10) {
        int i11 = abstractC5171e0.f19646q + i10;
        abstractC5171e0.f19646q = i11;
        return i11;
    }

    /* renamed from: l */
    public static /* synthetic */ int m19790l(AbstractC5171e0 abstractC5171e0, int i10) {
        int i11 = abstractC5171e0.f19646q - i10;
        abstractC5171e0.f19646q = i11;
        return i11;
    }

    /* renamed from: o */
    public static /* synthetic */ Map m19791o(AbstractC5171e0 abstractC5171e0) {
        return abstractC5171e0.f19645p;
    }

    /* renamed from: p */
    public static /* synthetic */ void m19792p(AbstractC5171e0 abstractC5171e0, Object obj) {
        Collection<V> collection;
        Map<K, Collection<V>> map = abstractC5171e0.f19645p;
        Objects.requireNonNull(map);
        try {
            collection = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            collection = null;
        }
        Collection<V> collection2 = collection;
        if (collection2 != null) {
            int size = collection2.size();
            collection2.clear();
            abstractC5171e0.f19646q -= size;
        }
    }

    @Override // p283w3.InterfaceC5263l1
    /* renamed from: a */
    public final boolean mo19793a(@NullableDecl K k10, @NullableDecl V v10) {
        Collection<V> collection = this.f19645p.get(k10);
        if (collection == null) {
            Collection<V> mo19796e = mo19796e();
            if (mo19796e.add(v10)) {
                this.f19646q++;
                this.f19645p.put(k10, mo19796e);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (!collection.add(v10)) {
            return false;
        }
        this.f19646q++;
        return true;
    }

    @Override // p283w3.AbstractC5197g0
    /* renamed from: c */
    final Map<K, Collection<V>> mo19794c() {
        return new C5391v(this, this.f19645p);
    }

    @Override // p283w3.AbstractC5197g0
    /* renamed from: d */
    final Set<K> mo19795d() {
        return new C5417x(this, this.f19645p);
    }

    /* renamed from: e */
    public abstract Collection<V> mo19796e();

    /* renamed from: f */
    public abstract Collection<V> mo19797f(@NullableDecl K k10, Collection<V> collection);

    /* renamed from: m */
    public final Collection<V> m19798m(@NullableDecl K k10) {
        Collection<V> collection = this.f19645p.get(k10);
        if (collection == null) {
            collection = mo19796e();
        }
        return mo19797f(k10, collection);
    }

    /* renamed from: n */
    public final List<V> m19799n(@NullableDecl K k10, List<V> list, @NullableDecl C5129b0 c5129b0) {
        if (list instanceof RandomAccess) {
            return new C5430y(this, k10, list, c5129b0);
        }
        return new C5157d0(this, k10, list, c5129b0);
    }

    /* renamed from: q */
    public final void m19800q() {
        Iterator<Collection<V>> it = this.f19645p.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f19645p.clear();
        this.f19646q = 0;
    }
}
