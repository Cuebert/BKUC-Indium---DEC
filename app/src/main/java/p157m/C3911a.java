package p157m;

import java.util.HashMap;
import java.util.Map;
import p157m.C3912b;

/* renamed from: m.a */
/* loaded from: classes.dex */
public class C3911a<K, V> extends C3912b<K, V> {

    /* renamed from: r */
    private HashMap<K, C3912b.c<K, V>> f16206r = new HashMap<>();

    public boolean contains(K k10) {
        return this.f16206r.containsKey(k10);
    }

    @Override // p157m.C3912b
    /* renamed from: e */
    protected C3912b.c<K, V> mo16579e(K k10) {
        return this.f16206r.get(k10);
    }

    @Override // p157m.C3912b
    /* renamed from: m */
    public V mo16580m(K k10, V v10) {
        C3912b.c<K, V> mo16579e = mo16579e(k10);
        if (mo16579e != null) {
            return mo16579e.f16212o;
        }
        this.f16206r.put(k10, m16586l(k10, v10));
        return null;
    }

    @Override // p157m.C3912b
    /* renamed from: o */
    public V mo16581o(K k10) {
        V v10 = (V) super.mo16581o(k10);
        this.f16206r.remove(k10);
        return v10;
    }

    /* renamed from: p */
    public Map.Entry<K, V> m16582p(K k10) {
        if (contains(k10)) {
            return this.f16206r.get(k10).f16214q;
        }
        return null;
    }
}
