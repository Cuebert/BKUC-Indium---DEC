package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h */
/* loaded from: classes.dex */
public final class C1594h implements InterfaceC1739q {

    /* renamed from: n */
    private final InterfaceC1739q f6813n;

    /* renamed from: o */
    private final String f6814o;

    public C1594h() {
        throw null;
    }

    public C1594h(String str) {
        this.f6813n = InterfaceC1739q.f7165b;
        this.f6814o = str;
    }

    public C1594h(String str, InterfaceC1739q interfaceC1739q) {
        this.f6813n = interfaceC1739q;
        this.f6814o = str;
    }

    /* renamed from: a */
    public final InterfaceC1739q m8203a() {
        return this.f6813n;
    }

    /* renamed from: b */
    public final String m8204b() {
        return this.f6814o;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: c */
    public final InterfaceC1739q mo8130c() {
        return new C1594h(this.f6814o, this.f6813n.mo8130c());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: d */
    public final Double mo8131d() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: e */
    public final String mo8132e() {
        throw new IllegalStateException("Control is not a String");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1594h)) {
            return false;
        }
        C1594h c1594h = (C1594h) obj;
        return this.f6814o.equals(c1594h.f6814o) && this.f6813n.equals(c1594h.f6813n);
    }

    public final int hashCode() {
        return (this.f6814o.hashCode() * 31) + this.f6813n.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: i */
    public final Iterator<InterfaceC1739q> mo8133i() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: m */
    public final Boolean mo8136m() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1739q
    /* renamed from: p */
    public final InterfaceC1739q mo8138p(String str, C1728p4 c1728p4, List<InterfaceC1739q> list) {
        throw new IllegalStateException("Control does not have functions");
    }
}
