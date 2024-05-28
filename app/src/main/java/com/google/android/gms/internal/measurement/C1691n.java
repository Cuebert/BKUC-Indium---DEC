package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.n */
/* loaded from: classes.dex */
public class C1691n implements InterfaceC1739q, InterfaceC1675m {

    /* renamed from: n */
    final Map<String, InterfaceC1739q> f7024n = new HashMap();

    /* renamed from: a */
    public final List<String> m8483a() {
        return new ArrayList(this.f7024n.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: c */
    public final InterfaceC1739q mo8130c() {
        C1691n c1691n = new C1691n();
        for (Map.Entry<String, InterfaceC1739q> entry : this.f7024n.entrySet()) {
            if (entry.getValue() instanceof InterfaceC1675m) {
                c1691n.f7024n.put(entry.getKey(), entry.getValue());
            } else {
                c1691n.f7024n.put(entry.getKey(), entry.getValue().mo8130c());
            }
        }
        return c1691n;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: d */
    public final Double mo8131d() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: e */
    public final String mo8132e() {
        return "[object Object]";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1691n) {
            return this.f7024n.equals(((C1691n) obj).f7024n);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7024n.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: i */
    public final Iterator<InterfaceC1739q> mo8133i() {
        return C1643k.m8346b(this.f7024n);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1675m
    /* renamed from: k */
    public final boolean mo8134k(String str) {
        return this.f7024n.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1675m
    /* renamed from: l */
    public final InterfaceC1739q mo8135l(String str) {
        return this.f7024n.containsKey(str) ? this.f7024n.get(str) : InterfaceC1739q.f7165b;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: m */
    public final Boolean mo8136m() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1675m
    /* renamed from: o */
    public final void mo8137o(String str, InterfaceC1739q interfaceC1739q) {
        if (interfaceC1739q == null) {
            this.f7024n.remove(str);
        } else {
            this.f7024n.put(str, interfaceC1739q);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: p */
    public InterfaceC1739q mo8138p(String str, C1728p4 c1728p4, List<InterfaceC1739q> list) {
        if ("toString".equals(str)) {
            return new C1803u(toString());
        }
        return C1643k.m8345a(this, new C1803u(str), c1728p4, list);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        if (!this.f7024n.isEmpty()) {
            for (String str : this.f7024n.keySet()) {
                sb2.append(String.format("%s: %s,", str, this.f7024n.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }
}
