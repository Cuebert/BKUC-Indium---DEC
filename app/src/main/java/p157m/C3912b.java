package p157m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: m.b */
/* loaded from: classes.dex */
public class C3912b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: n */
    c<K, V> f16207n;

    /* renamed from: o */
    private c<K, V> f16208o;

    /* renamed from: p */
    private WeakHashMap<f<K, V>, Boolean> f16209p = new WeakHashMap<>();

    /* renamed from: q */
    private int f16210q = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m.b$a */
    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p157m.C3912b.e
        /* renamed from: b */
        c<K, V> mo16587b(c<K, V> cVar) {
            return cVar.f16214q;
        }

        @Override // p157m.C3912b.e
        /* renamed from: c */
        c<K, V> mo16588c(c<K, V> cVar) {
            return cVar.f16213p;
        }
    }

    /* renamed from: m.b$b */
    /* loaded from: classes.dex */
    private static class b<K, V> extends e<K, V> {
        b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p157m.C3912b.e
        /* renamed from: b */
        c<K, V> mo16587b(c<K, V> cVar) {
            return cVar.f16213p;
        }

        @Override // p157m.C3912b.e
        /* renamed from: c */
        c<K, V> mo16588c(c<K, V> cVar) {
            return cVar.f16214q;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m.b$c */
    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: n */
        final K f16211n;

        /* renamed from: o */
        final V f16212o;

        /* renamed from: p */
        c<K, V> f16213p;

        /* renamed from: q */
        c<K, V> f16214q;

        c(K k10, V v10) {
            this.f16211n = k10;
            this.f16212o = v10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f16211n.equals(cVar.f16211n) && this.f16212o.equals(cVar.f16212o);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f16211n;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f16212o;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f16211n.hashCode() ^ this.f16212o.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f16211n + "=" + this.f16212o;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m.b$d */
    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: n */
        private c<K, V> f16215n;

        /* renamed from: o */
        private boolean f16216o = true;

        d() {
        }

        @Override // p157m.C3912b.f
        /* renamed from: a */
        public void mo16589a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f16215n;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f16214q;
                this.f16215n = cVar3;
                this.f16216o = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.f16216o) {
                this.f16216o = false;
                this.f16215n = C3912b.this.f16207n;
            } else {
                c<K, V> cVar = this.f16215n;
                this.f16215n = cVar != null ? cVar.f16213p : null;
            }
            return this.f16215n;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f16216o) {
                return C3912b.this.f16207n != null;
            }
            c<K, V> cVar = this.f16215n;
            return (cVar == null || cVar.f16213p == null) ? false : true;
        }
    }

    /* renamed from: m.b$e */
    /* loaded from: classes.dex */
    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: n */
        c<K, V> f16218n;

        /* renamed from: o */
        c<K, V> f16219o;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f16218n = cVar2;
            this.f16219o = cVar;
        }

        /* renamed from: e */
        private c<K, V> m16591e() {
            c<K, V> cVar = this.f16219o;
            c<K, V> cVar2 = this.f16218n;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo16588c(cVar);
        }

        @Override // p157m.C3912b.f
        /* renamed from: a */
        public void mo16589a(c<K, V> cVar) {
            if (this.f16218n == cVar && cVar == this.f16219o) {
                this.f16219o = null;
                this.f16218n = null;
            }
            c<K, V> cVar2 = this.f16218n;
            if (cVar2 == cVar) {
                this.f16218n = mo16587b(cVar2);
            }
            if (this.f16219o == cVar) {
                this.f16219o = m16591e();
            }
        }

        /* renamed from: b */
        abstract c<K, V> mo16587b(c<K, V> cVar);

        /* renamed from: c */
        abstract c<K, V> mo16588c(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f16219o;
            this.f16219o = m16591e();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16219o != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m.b$f */
    /* loaded from: classes.dex */
    public interface f<K, V> {
        /* renamed from: a */
        void mo16589a(c<K, V> cVar);
    }

    /* renamed from: c */
    public Map.Entry<K, V> m16583c() {
        return this.f16207n;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        b bVar = new b(this.f16208o, this.f16207n);
        this.f16209p.put(bVar, Boolean.FALSE);
        return bVar;
    }

    /* renamed from: e */
    protected c<K, V> mo16579e(K k10) {
        c<K, V> cVar = this.f16207n;
        while (cVar != null && !cVar.f16211n.equals(k10)) {
            cVar = cVar.f16213p;
        }
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3912b)) {
            return false;
        }
        C3912b c3912b = (C3912b) obj;
        if (size() != c3912b.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = c3912b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().hashCode();
        }
        return i10;
    }

    /* renamed from: i */
    public C3912b<K, V>.d m16584i() {
        C3912b<K, V>.d dVar = new d();
        this.f16209p.put(dVar, Boolean.FALSE);
        return dVar;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f16207n, this.f16208o);
        this.f16209p.put(aVar, Boolean.FALSE);
        return aVar;
    }

    /* renamed from: k */
    public Map.Entry<K, V> m16585k() {
        return this.f16208o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public c<K, V> m16586l(K k10, V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.f16210q++;
        c<K, V> cVar2 = this.f16208o;
        if (cVar2 == null) {
            this.f16207n = cVar;
            this.f16208o = cVar;
            return cVar;
        }
        cVar2.f16213p = cVar;
        cVar.f16214q = cVar2;
        this.f16208o = cVar;
        return cVar;
    }

    /* renamed from: m */
    public V mo16580m(K k10, V v10) {
        c<K, V> mo16579e = mo16579e(k10);
        if (mo16579e != null) {
            return mo16579e.f16212o;
        }
        m16586l(k10, v10);
        return null;
    }

    /* renamed from: o */
    public V mo16581o(K k10) {
        c<K, V> mo16579e = mo16579e(k10);
        if (mo16579e == null) {
            return null;
        }
        this.f16210q--;
        if (!this.f16209p.isEmpty()) {
            Iterator<f<K, V>> it = this.f16209p.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo16589a(mo16579e);
            }
        }
        c<K, V> cVar = mo16579e.f16214q;
        if (cVar != null) {
            cVar.f16213p = mo16579e.f16213p;
        } else {
            this.f16207n = mo16579e.f16213p;
        }
        c<K, V> cVar2 = mo16579e.f16213p;
        if (cVar2 != null) {
            cVar2.f16214q = cVar;
        } else {
            this.f16208o = cVar;
        }
        mo16579e.f16213p = null;
        mo16579e.f16214q = null;
        return mo16579e.f16212o;
    }

    public int size() {
        return this.f16210q;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
