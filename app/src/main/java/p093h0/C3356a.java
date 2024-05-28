package p093h0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: h0.a */
/* loaded from: classes.dex */
public class C3356a<K, V> extends C3362g<K, V> implements Map<K, V> {

    /* renamed from: u */
    AbstractC3361f<K, V> f14057u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h0.a$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC3361f<K, V> {
        a() {
        }

        @Override // p093h0.AbstractC3361f
        /* renamed from: a */
        protected void mo14778a() {
            C3356a.this.clear();
        }

        @Override // p093h0.AbstractC3361f
        /* renamed from: b */
        protected Object mo14779b(int i10, int i11) {
            return C3356a.this.f14106o[(i10 << 1) + i11];
        }

        @Override // p093h0.AbstractC3361f
        /* renamed from: c */
        protected Map<K, V> mo14780c() {
            return C3356a.this;
        }

        @Override // p093h0.AbstractC3361f
        /* renamed from: d */
        protected int mo14781d() {
            return C3356a.this.f14107p;
        }

        @Override // p093h0.AbstractC3361f
        /* renamed from: e */
        protected int mo14782e(Object obj) {
            return C3356a.this.m14837f(obj);
        }

        @Override // p093h0.AbstractC3361f
        /* renamed from: f */
        protected int mo14783f(Object obj) {
            return C3356a.this.m14839h(obj);
        }

        @Override // p093h0.AbstractC3361f
        /* renamed from: g */
        protected void mo14784g(K k10, V v10) {
            C3356a.this.put(k10, v10);
        }

        @Override // p093h0.AbstractC3361f
        /* renamed from: h */
        protected void mo14785h(int i10) {
            C3356a.this.m14842k(i10);
        }

        @Override // p093h0.AbstractC3361f
        /* renamed from: i */
        protected V mo14786i(int i10, V v10) {
            return C3356a.this.m14843l(i10, v10);
        }
    }

    public C3356a() {
    }

    /* renamed from: n */
    private AbstractC3361f<K, V> m14776n() {
        if (this.f14057u == null) {
            this.f14057u = new a();
        }
        return this.f14057u;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m14776n().m14825l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m14776n().m14826m();
    }

    /* renamed from: o */
    public boolean m14777o(Collection<?> collection) {
        return AbstractC3361f.m14824p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m14835c(this.f14107p + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m14776n().m14827n();
    }

    public C3356a(int i10) {
        super(i10);
    }

    public C3356a(C3362g c3362g) {
        super(c3362g);
    }
}
