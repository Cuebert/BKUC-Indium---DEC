package p093h0;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: h0.f */
/* loaded from: classes.dex */
public abstract class AbstractC3361f<K, V> {

    /* renamed from: a */
    AbstractC3361f<K, V>.b f14086a;

    /* renamed from: b */
    AbstractC3361f<K, V>.c f14087b;

    /* renamed from: c */
    AbstractC3361f<K, V>.e f14088c;

    /* renamed from: h0.f$a */
    /* loaded from: classes.dex */
    final class a<T> implements Iterator<T> {

        /* renamed from: n */
        final int f14089n;

        /* renamed from: o */
        int f14090o;

        /* renamed from: p */
        int f14091p;

        /* renamed from: q */
        boolean f14092q = false;

        a(int i10) {
            this.f14089n = i10;
            this.f14090o = AbstractC3361f.this.mo14781d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f14091p < this.f14090o;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t10 = (T) AbstractC3361f.this.mo14779b(this.f14091p, this.f14089n);
                this.f14091p++;
                this.f14092q = true;
                return t10;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f14092q) {
                int i10 = this.f14091p - 1;
                this.f14091p = i10;
                this.f14090o--;
                this.f14092q = false;
                AbstractC3361f.this.mo14785h(i10);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: h0.f$b */
    /* loaded from: classes.dex */
    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int mo14781d = AbstractC3361f.this.mo14781d();
            for (Map.Entry<K, V> entry : collection) {
                AbstractC3361f.this.mo14784g(entry.getKey(), entry.getValue());
            }
            return mo14781d != AbstractC3361f.this.mo14781d();
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC3361f.this.mo14778a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int mo14782e = AbstractC3361f.this.mo14782e(entry.getKey());
            if (mo14782e < 0) {
                return false;
            }
            return C3358c.m14797c(AbstractC3361f.this.mo14779b(mo14782e, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC3361f.m14822k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i10 = 0;
            for (int mo14781d = AbstractC3361f.this.mo14781d() - 1; mo14781d >= 0; mo14781d--) {
                Object mo14779b = AbstractC3361f.this.mo14779b(mo14781d, 0);
                Object mo14779b2 = AbstractC3361f.this.mo14779b(mo14781d, 1);
                i10 += (mo14779b == null ? 0 : mo14779b.hashCode()) ^ (mo14779b2 == null ? 0 : mo14779b2.hashCode());
            }
            return i10;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC3361f.this.mo14781d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC3361f.this.mo14781d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: h0.f$c */
    /* loaded from: classes.dex */
    final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC3361f.this.mo14778a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC3361f.this.mo14782e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return AbstractC3361f.m14821j(AbstractC3361f.this.mo14780c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC3361f.m14822k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i10 = 0;
            for (int mo14781d = AbstractC3361f.this.mo14781d() - 1; mo14781d >= 0; mo14781d--) {
                Object mo14779b = AbstractC3361f.this.mo14779b(mo14781d, 0);
                i10 += mo14779b == null ? 0 : mo14779b.hashCode();
            }
            return i10;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC3361f.this.mo14781d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int mo14782e = AbstractC3361f.this.mo14782e(obj);
            if (mo14782e < 0) {
                return false;
            }
            AbstractC3361f.this.mo14785h(mo14782e);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return AbstractC3361f.m14823o(AbstractC3361f.this.mo14780c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return AbstractC3361f.m14824p(AbstractC3361f.this.mo14780c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC3361f.this.mo14781d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return AbstractC3361f.this.m14828q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC3361f.this.m14829r(tArr, 0);
        }
    }

    /* renamed from: h0.f$d */
    /* loaded from: classes.dex */
    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: n */
        int f14096n;

        /* renamed from: p */
        boolean f14098p = false;

        /* renamed from: o */
        int f14097o = -1;

        d() {
            this.f14096n = AbstractC3361f.this.mo14781d() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f14097o++;
                this.f14098p = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this.f14098p) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return C3358c.m14797c(entry.getKey(), AbstractC3361f.this.mo14779b(this.f14097o, 0)) && C3358c.m14797c(entry.getValue(), AbstractC3361f.this.mo14779b(this.f14097o, 1));
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f14098p) {
                return (K) AbstractC3361f.this.mo14779b(this.f14097o, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f14098p) {
                return (V) AbstractC3361f.this.mo14779b(this.f14097o, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f14097o < this.f14096n;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (this.f14098p) {
                Object mo14779b = AbstractC3361f.this.mo14779b(this.f14097o, 0);
                Object mo14779b2 = AbstractC3361f.this.mo14779b(this.f14097o, 1);
                return (mo14779b == null ? 0 : mo14779b.hashCode()) ^ (mo14779b2 != null ? mo14779b2.hashCode() : 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f14098p) {
                AbstractC3361f.this.mo14785h(this.f14097o);
                this.f14097o--;
                this.f14096n--;
                this.f14098p = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            if (this.f14098p) {
                return (V) AbstractC3361f.this.mo14786i(this.f14097o, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: h0.f$e */
    /* loaded from: classes.dex */
    final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            AbstractC3361f.this.mo14778a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC3361f.this.mo14783f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return AbstractC3361f.this.mo14781d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int mo14783f = AbstractC3361f.this.mo14783f(obj);
            if (mo14783f < 0) {
                return false;
            }
            AbstractC3361f.this.mo14785h(mo14783f);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int mo14781d = AbstractC3361f.this.mo14781d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < mo14781d) {
                if (collection.contains(AbstractC3361f.this.mo14779b(i10, 1))) {
                    AbstractC3361f.this.mo14785h(i10);
                    i10--;
                    mo14781d--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int mo14781d = AbstractC3361f.this.mo14781d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < mo14781d) {
                if (!collection.contains(AbstractC3361f.this.mo14779b(i10, 1))) {
                    AbstractC3361f.this.mo14785h(i10);
                    i10--;
                    mo14781d--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public int size() {
            return AbstractC3361f.this.mo14781d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC3361f.this.m14828q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC3361f.this.m14829r(tArr, 1);
        }
    }

    /* renamed from: j */
    public static <K, V> boolean m14821j(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static <T> boolean m14822k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: o */
    public static <K, V> boolean m14823o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    /* renamed from: p */
    public static <K, V> boolean m14824p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: a */
    protected abstract void mo14778a();

    /* renamed from: b */
    protected abstract Object mo14779b(int i10, int i11);

    /* renamed from: c */
    protected abstract Map<K, V> mo14780c();

    /* renamed from: d */
    protected abstract int mo14781d();

    /* renamed from: e */
    protected abstract int mo14782e(Object obj);

    /* renamed from: f */
    protected abstract int mo14783f(Object obj);

    /* renamed from: g */
    protected abstract void mo14784g(K k10, V v10);

    /* renamed from: h */
    protected abstract void mo14785h(int i10);

    /* renamed from: i */
    protected abstract V mo14786i(int i10, V v10);

    /* renamed from: l */
    public Set<Map.Entry<K, V>> m14825l() {
        if (this.f14086a == null) {
            this.f14086a = new b();
        }
        return this.f14086a;
    }

    /* renamed from: m */
    public Set<K> m14826m() {
        if (this.f14087b == null) {
            this.f14087b = new c();
        }
        return this.f14087b;
    }

    /* renamed from: n */
    public Collection<V> m14827n() {
        if (this.f14088c == null) {
            this.f14088c = new e();
        }
        return this.f14088c;
    }

    /* renamed from: q */
    public Object[] m14828q(int i10) {
        int mo14781d = mo14781d();
        Object[] objArr = new Object[mo14781d];
        for (int i11 = 0; i11 < mo14781d; i11++) {
            objArr[i11] = mo14779b(i11, i10);
        }
        return objArr;
    }

    /* renamed from: r */
    public <T> T[] m14829r(T[] tArr, int i10) {
        int mo14781d = mo14781d();
        if (tArr.length < mo14781d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), mo14781d));
        }
        for (int i11 = 0; i11 < mo14781d; i11++) {
            tArr[i11] = mo14779b(i11, i10);
        }
        if (tArr.length > mo14781d) {
            tArr[mo14781d] = null;
        }
        return tArr;
    }
}
