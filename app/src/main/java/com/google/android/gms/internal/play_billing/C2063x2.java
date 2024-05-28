package com.google.android.gms.internal.play_billing;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.play_billing.x2 */
/* loaded from: classes.dex */
public final class C2063x2 implements Map.Entry, Comparable {

    /* renamed from: n */
    private final Comparable f7884n;

    /* renamed from: o */
    private Object f7885o;

    /* renamed from: p */
    final /* synthetic */ C1931e3 f7886p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2063x2(C1931e3 c1931e3, Comparable comparable, Object obj) {
        this.f7886p = c1931e3;
        this.f7884n = comparable;
        this.f7885o = obj;
    }

    /* renamed from: c */
    private static final boolean m9681c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public final Comparable m9682b() {
        return this.f7884n;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f7884n.compareTo(((C2063x2) obj).f7884n);
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
        return m9681c(this.f7884n, entry.getKey()) && m9681c(this.f7885o, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f7884n;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f7885o;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f7884n;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f7885o;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f7886p.m9335n();
        Object obj2 = this.f7885o;
        this.f7885o = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f7884n) + "=" + String.valueOf(this.f7885o);
    }
}
