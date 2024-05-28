package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.play_billing.m3 */
/* loaded from: classes.dex */
final class C1987m3 implements Iterator {

    /* renamed from: n */
    final Iterator f7747n;

    /* renamed from: o */
    final /* synthetic */ C1994n3 f7748o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1987m3(C1994n3 c1994n3) {
        InterfaceC1992n1 interfaceC1992n1;
        this.f7748o = c1994n3;
        interfaceC1992n1 = c1994n3.f7750n;
        this.f7747n = interfaceC1992n1.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7747n.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f7747n.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
