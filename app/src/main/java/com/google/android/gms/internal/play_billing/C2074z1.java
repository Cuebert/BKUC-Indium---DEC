package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.play_billing.z1 */
/* loaded from: classes.dex */
public final class C2074z1 extends LinkedHashMap {

    /* renamed from: o */
    private static final C2074z1 f7913o;

    /* renamed from: n */
    private boolean f7914n;

    static {
        C2074z1 c2074z1 = new C2074z1();
        f7913o = c2074z1;
        c2074z1.f7914n = false;
    }

    private C2074z1() {
        this.f7914n = true;
    }

    /* renamed from: a */
    public static C2074z1 m9699a() {
        return f7913o;
    }

    /* renamed from: j */
    private static int m9700j(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = C1950h1.f7678d;
            int length = bArr.length;
            int m9378b = C1950h1.m9378b(length, bArr, 0, length);
            if (m9378b == 0) {
                return 1;
            }
            return m9378b;
        }
        return obj.hashCode();
    }

    /* renamed from: k */
    private final void m9701k() {
        if (!this.f7914n) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m9701k();
        super.clear();
    }

    /* renamed from: d */
    public final C2074z1 m9702d() {
        return isEmpty() ? new C2074z1() : new C2074z1(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
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
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
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
    public final void m9703f() {
        this.f7914n = false;
    }

    /* renamed from: g */
    public final void m9704g(C2074z1 c2074z1) {
        m9701k();
        if (c2074z1.isEmpty()) {
            return;
        }
        putAll(c2074z1);
    }

    /* renamed from: h */
    public final boolean m9705h() {
        return this.f7914n;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i10 += m9700j(entry.getValue()) ^ m9700j(entry.getKey());
        }
        return i10;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m9701k();
        byte[] bArr = C1950h1.f7678d;
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m9701k();
        for (Object obj : map.keySet()) {
            byte[] bArr = C1950h1.f7678d;
            Objects.requireNonNull(obj);
            Objects.requireNonNull(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m9701k();
        return super.remove(obj);
    }

    private C2074z1(Map map) {
        super(map);
        this.f7914n = true;
    }
}
