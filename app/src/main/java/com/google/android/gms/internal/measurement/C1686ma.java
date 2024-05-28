package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.ma */
/* loaded from: classes.dex */
public final class C1686ma implements Map.Entry, Comparable<C1686ma> {

    /* renamed from: n */
    private final Comparable f7013n;

    /* renamed from: o */
    private Object f7014o;

    /* renamed from: p */
    final /* synthetic */ C1734pa f7015p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1686ma(C1734pa c1734pa, Comparable comparable, Object obj) {
        this.f7015p = c1734pa;
        this.f7013n = comparable;
        this.f7014o = obj;
    }

    /* renamed from: c */
    private static final boolean m8472c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public final Comparable m8473b() {
        return this.f7013n;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C1686ma c1686ma) {
        return this.f7013n.compareTo(c1686ma.f7013n);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m8472c(this.f7013n, entry.getKey()) && m8472c(this.f7014o, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f7013n;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f7014o;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f7013n;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f7014o;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f7015p.m8693n();
        Object obj2 = this.f7014o;
        this.f7014o = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7013n);
        String valueOf2 = String.valueOf(this.f7014o);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append("=");
        sb2.append(valueOf2);
        return sb2.toString();
    }
}
