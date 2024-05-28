package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.g */
/* loaded from: classes.dex */
public final class C1577g implements InterfaceC1739q {

    /* renamed from: n */
    private final boolean f6797n;

    public C1577g(Boolean bool) {
        this.f6797n = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: c */
    public final InterfaceC1739q mo8130c() {
        return new C1577g(Boolean.valueOf(this.f6797n));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: d */
    public final Double mo8131d() {
        return Double.valueOf(true != this.f6797n ? 0.0d : 1.0d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: e */
    public final String mo8132e() {
        return Boolean.toString(this.f6797n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1577g) && this.f6797n == ((C1577g) obj).f6797n;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f6797n).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: i */
    public final Iterator<InterfaceC1739q> mo8133i() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: m */
    public final Boolean mo8136m() {
        return Boolean.valueOf(this.f6797n);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: p */
    public final InterfaceC1739q mo8138p(String str, C1728p4 c1728p4, List<InterfaceC1739q> list) {
        if ("toString".equals(str)) {
            return new C1803u(Boolean.toString(this.f6797n));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f6797n), str));
    }

    public final String toString() {
        return String.valueOf(this.f6797n);
    }
}
