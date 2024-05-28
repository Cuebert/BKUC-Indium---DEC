package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.b */
/* loaded from: classes.dex */
public final class C1492b {

    /* renamed from: a */
    private String f6649a;

    /* renamed from: b */
    private final long f6650b;

    /* renamed from: c */
    private final Map<String, Object> f6651c;

    public C1492b(String str, long j10, Map<String, Object> map) {
        this.f6649a = str;
        this.f6650b = j10;
        HashMap hashMap = new HashMap();
        this.f6651c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    /* renamed from: a */
    public final long m7932a() {
        return this.f6650b;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1492b clone() {
        return new C1492b(this.f6649a, this.f6650b, new HashMap(this.f6651c));
    }

    /* renamed from: c */
    public final Object m7934c(String str) {
        if (this.f6651c.containsKey(str)) {
            return this.f6651c.get(str);
        }
        return null;
    }

    /* renamed from: d */
    public final String m7935d() {
        return this.f6649a;
    }

    /* renamed from: e */
    public final Map<String, Object> m7936e() {
        return this.f6651c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1492b)) {
            return false;
        }
        C1492b c1492b = (C1492b) obj;
        if (this.f6650b == c1492b.f6650b && this.f6649a.equals(c1492b.f6649a)) {
            return this.f6651c.equals(c1492b.f6651c);
        }
        return false;
    }

    /* renamed from: f */
    public final void m7937f(String str) {
        this.f6649a = str;
    }

    /* renamed from: g */
    public final void m7938g(String str, Object obj) {
        if (obj == null) {
            this.f6651c.remove(str);
        } else {
            this.f6651c.put(str, obj);
        }
    }

    public final int hashCode() {
        int hashCode = this.f6649a.hashCode();
        long j10 = this.f6650b;
        return (((hashCode * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f6651c.hashCode();
    }

    public final String toString() {
        String str = this.f6649a;
        long j10 = this.f6650b;
        String obj = this.f6651c.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 55 + obj.length());
        sb2.append("Event{name='");
        sb2.append(str);
        sb2.append("', timestamp=");
        sb2.append(j10);
        sb2.append(", params=");
        sb2.append(obj);
        sb2.append('}');
        return sb2.toString();
    }
}
