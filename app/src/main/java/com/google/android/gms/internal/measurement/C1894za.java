package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.za */
/* loaded from: classes.dex */
public final class C1894za extends AbstractList<String> implements RandomAccess, InterfaceC1536d9 {

    /* renamed from: n */
    private final InterfaceC1536d9 f7349n;

    public C1894za(InterfaceC1536d9 interfaceC1536d9) {
        this.f7349n = interfaceC1536d9;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1536d9
    /* renamed from: b */
    public final InterfaceC1536d9 mo8005b() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1536d9
    /* renamed from: d */
    public final List<?> mo8006d() {
        return this.f7349n.mo8006d();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((C1519c9) this.f7349n).get(i10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1536d9
    /* renamed from: h */
    public final Object mo8009h(int i10) {
        return this.f7349n.mo8009h(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new C1878ya(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1536d9
    /* renamed from: j */
    public final void mo8010j(AbstractC1731p7 abstractC1731p7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i10) {
        return new C1862xa(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7349n.size();
    }
}
