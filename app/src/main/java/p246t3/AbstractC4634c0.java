package p246t3;

import java.io.Serializable;
import java.util.Map;

/* renamed from: t3.c0 */
/* loaded from: classes.dex */
public abstract class AbstractC4634c0 implements Map, Serializable {

    /* renamed from: o */
    static final Map.Entry[] f18424o = new Map.Entry[0];

    /* renamed from: n */
    private transient AbstractC4644e0 f18425n;

    /* renamed from: a */
    public abstract AbstractC4715w mo18741a();

    /* renamed from: b */
    abstract AbstractC4644e0 mo18742b();

    /* renamed from: c */
    public final AbstractC4644e0 m18743c() {
        AbstractC4644e0 abstractC4644e0 = this.f18425n;
        if (abstractC4644e0 != null) {
            return abstractC4644e0;
        }
        AbstractC4644e0 mo18742b = mo18742b();
        this.f18425n = mo18742b;
        return mo18742b;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return mo18741a().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return C4720x0.m18859a(m18743c());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
            sb2.append('{');
            boolean z10 = true;
            for (Map.Entry entry : entrySet()) {
                if (!z10) {
                    sb2.append(", ");
                }
                sb2.append(entry.getKey());
                sb2.append('=');
                sb2.append(entry.getValue());
                z10 = false;
            }
            sb2.append('}');
            return sb2.toString();
        }
        throw new IllegalArgumentException("size cannot be negative but was: " + size);
    }
}
