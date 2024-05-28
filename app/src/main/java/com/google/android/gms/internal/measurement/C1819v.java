package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.v */
/* loaded from: classes.dex */
public final class C1819v implements InterfaceC1739q {
    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: c */
    public final InterfaceC1739q mo8130c() {
        return InterfaceC1739q.f7165b;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: d */
    public final Double mo8131d() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: e */
    public final String mo8132e() {
        return "undefined";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C1819v;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: i */
    public final Iterator<InterfaceC1739q> mo8133i() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: m */
    public final Boolean mo8136m() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: p */
    public final InterfaceC1739q mo8138p(String str, C1728p4 c1728p4, List<InterfaceC1739q> list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }
}
