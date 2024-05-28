package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.measurement.xa */
/* loaded from: classes.dex */
final class C1862xa implements ListIterator<String> {

    /* renamed from: n */
    final ListIterator<String> f7314n;

    /* renamed from: o */
    final /* synthetic */ int f7315o;

    /* renamed from: p */
    final /* synthetic */ C1894za f7316p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1862xa(C1894za c1894za, int i10) {
        InterfaceC1536d9 interfaceC1536d9;
        this.f7316p = c1894za;
        this.f7315o = i10;
        interfaceC1536d9 = c1894za.f7349n;
        this.f7314n = interfaceC1536d9.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f7314n.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7314n.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.f7314n.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7314n.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ String previous() {
        return this.f7314n.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7314n.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
