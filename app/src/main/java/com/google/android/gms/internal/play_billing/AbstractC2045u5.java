package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.play_billing.u5 */
/* loaded from: classes.dex */
public abstract class AbstractC2045u5 implements Map, Serializable {

    /* renamed from: n */
    private transient AbstractC2052v5 f7812n;

    /* renamed from: o */
    private transient AbstractC2052v5 f7813o;

    /* renamed from: p */
    private transient AbstractC2003o5 f7814p;

    /* renamed from: a */
    abstract AbstractC2003o5 mo9346a();

    @Override // java.util.Map
    /* renamed from: b */
    public final AbstractC2003o5 values() {
        AbstractC2003o5 abstractC2003o5 = this.f7814p;
        if (abstractC2003o5 != null) {
            return abstractC2003o5;
        }
        AbstractC2003o5 mo9346a = mo9346a();
        this.f7814p = mo9346a;
        return mo9346a;
    }

    /* renamed from: c */
    abstract AbstractC2052v5 mo9347c();

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
        return values().contains(obj);
    }

    /* renamed from: d */
    abstract AbstractC2052v5 mo9348d();

    @Override // java.util.Map
    /* renamed from: e */
    public final AbstractC2052v5 entrySet() {
        AbstractC2052v5 abstractC2052v5 = this.f7812n;
        if (abstractC2052v5 != null) {
            return abstractC2052v5;
        }
        AbstractC2052v5 mo9347c = mo9347c();
        this.f7812n = mo9347c;
        return mo9347c;
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
        return C1948h.m9357a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC2052v5 abstractC2052v5 = this.f7813o;
        if (abstractC2052v5 != null) {
            return abstractC2052v5;
        }
        AbstractC2052v5 mo9348d = mo9348d();
        this.f7813o = mo9348d;
        return mo9348d;
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
