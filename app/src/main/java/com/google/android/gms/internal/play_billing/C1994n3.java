package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* renamed from: com.google.android.gms.internal.play_billing.n3 */
/* loaded from: classes.dex */
public final class C1994n3 extends AbstractList implements RandomAccess, InterfaceC1992n1 {

    /* renamed from: n */
    private final InterfaceC1992n1 f7750n;

    public C1994n3(InterfaceC1992n1 interfaceC1992n1) {
        this.f7750n = interfaceC1992n1;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1992n1
    /* renamed from: b */
    public final InterfaceC1992n1 mo9504b() {
        return this;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1992n1
    /* renamed from: d */
    public final List mo9505d() {
        return this.f7750n.mo9505d();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((C1985m1) this.f7750n).get(i10);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1992n1
    /* renamed from: h */
    public final Object mo9507h(int i10) {
        return this.f7750n.mo9507h(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C1987m3(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new C1980l3(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7750n.size();
    }
}
