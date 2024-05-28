package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.r */
/* loaded from: classes.dex */
public final class C1755r implements InterfaceC1739q {

    /* renamed from: n */
    private final String f7187n;

    /* renamed from: o */
    private final ArrayList<InterfaceC1739q> f7188o;

    public C1755r(String str, List<InterfaceC1739q> list) {
        this.f7187n = str;
        ArrayList<InterfaceC1739q> arrayList = new ArrayList<>();
        this.f7188o = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: a */
    public final String m8737a() {
        return this.f7187n;
    }

    /* renamed from: b */
    public final ArrayList<InterfaceC1739q> m8738b() {
        return this.f7188o;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: c */
    public final InterfaceC1739q mo8130c() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: d */
    public final Double mo8131d() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: e */
    public final String mo8132e() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1755r)) {
            return false;
        }
        C1755r c1755r = (C1755r) obj;
        String str = this.f7187n;
        if (str == null ? c1755r.f7187n == null : str.equals(c1755r.f7187n)) {
            return this.f7188o.equals(c1755r.f7188o);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7187n;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f7188o.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: i */
    public final Iterator<InterfaceC1739q> mo8133i() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: m */
    public final Boolean mo8136m() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: p */
    public final InterfaceC1739q mo8138p(String str, C1728p4 c1728p4, List<InterfaceC1739q> list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
