package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.j */
/* loaded from: classes.dex */
public abstract class AbstractC1627j implements InterfaceC1739q, InterfaceC1675m {

    /* renamed from: n */
    protected final String f6915n;

    /* renamed from: o */
    protected final Map<String, InterfaceC1739q> f6916o = new HashMap();

    public AbstractC1627j(String str) {
        this.f6915n = str;
    }

    /* renamed from: a */
    public abstract InterfaceC1739q mo7931a(C1728p4 c1728p4, List<InterfaceC1739q> list);

    /* renamed from: b */
    public final String m8312b() {
        return this.f6915n;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: c */
    public InterfaceC1739q mo8130c() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: d */
    public final Double mo8131d() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: e */
    public final String mo8132e() {
        return this.f6915n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1627j)) {
            return false;
        }
        AbstractC1627j abstractC1627j = (AbstractC1627j) obj;
        String str = this.f6915n;
        if (str != null) {
            return str.equals(abstractC1627j.f6915n);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6915n;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: i */
    public final Iterator<InterfaceC1739q> mo8133i() {
        return C1643k.m8346b(this.f6916o);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1675m
    /* renamed from: k */
    public final boolean mo8134k(String str) {
        return this.f6916o.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1675m
    /* renamed from: l */
    public final InterfaceC1739q mo8135l(String str) {
        return this.f6916o.containsKey(str) ? this.f6916o.get(str) : InterfaceC1739q.f7165b;
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
            this.f6916o.remove(str);
        } else {
            this.f6916o.put(str, interfaceC1739q);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: p */
    public final InterfaceC1739q mo8138p(String str, C1728p4 c1728p4, List<InterfaceC1739q> list) {
        if ("toString".equals(str)) {
            return new C1803u(this.f6915n);
        }
        return C1643k.m8345a(this, new C1803u(str), c1728p4, list);
    }
}
