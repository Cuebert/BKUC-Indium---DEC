package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.n9 */
/* loaded from: classes.dex */
public final class C1701n9<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: o */
    private static final C1701n9 f7098o;

    /* renamed from: n */
    private boolean f7099n;

    static {
        C1701n9 c1701n9 = new C1701n9();
        f7098o = c1701n9;
        c1701n9.f7099n = false;
    }

    private C1701n9() {
        this.f7099n = true;
    }

    /* renamed from: a */
    public static <K, V> C1701n9<K, V> m8618a() {
        return f7098o;
    }

    /* renamed from: j */
    private static int m8619j(Object obj) {
        if (obj instanceof byte[]) {
            return C1860x8.m9006b((byte[]) obj);
        }
        return obj.hashCode();
    }

    /* renamed from: k */
    private final void m8620k() {
        if (!this.f7099n) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m8620k();
        super.clear();
    }

    /* renamed from: d */
    public final C1701n9<K, V> m8621d() {
        return isEmpty() ? new C1701n9<>() : new C1701n9<>(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            V value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
            } else {
                equals = value.equals(obj2);
            }
            if (!equals) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m8622f() {
        this.f7099n = false;
    }

    /* renamed from: g */
    public final void m8623g(C1701n9<K, V> c1701n9) {
        m8620k();
        if (c1701n9.isEmpty()) {
            return;
        }
        putAll(c1701n9);
    }

    /* renamed from: h */
    public final boolean m8624h() {
        return this.f7099n;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i10 += m8619j(entry.getValue()) ^ m8619j(entry.getKey());
        }
        return i10;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        m8620k();
        C1860x8.m9009e(k10);
        C1860x8.m9009e(v10);
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        m8620k();
        for (K k10 : map.keySet()) {
            C1860x8.m9009e(k10);
            C1860x8.m9009e(map.get(k10));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m8620k();
        return (V) super.remove(obj);
    }

    private C1701n9(Map<K, V> map) {
        super(map);
        this.f7099n = true;
    }
}
