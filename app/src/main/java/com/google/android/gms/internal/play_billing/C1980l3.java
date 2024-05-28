package com.google.android.gms.internal.play_billing;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.play_billing.l3 */
/* loaded from: classes.dex */
final class C1980l3 implements ListIterator {

    /* renamed from: n */
    final ListIterator f7733n;

    /* renamed from: o */
    final /* synthetic */ int f7734o;

    /* renamed from: p */
    final /* synthetic */ C1994n3 f7735p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1980l3(C1994n3 c1994n3, int i10) {
        InterfaceC1992n1 interfaceC1992n1;
        this.f7735p = c1994n3;
        this.f7734o = i10;
        interfaceC1992n1 = c1994n3.f7750n;
        this.f7733n = interfaceC1992n1.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f7733n.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7733n.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f7733n.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7733n.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f7733n.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7733n.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
