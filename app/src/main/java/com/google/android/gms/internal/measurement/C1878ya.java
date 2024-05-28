package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.ya */
/* loaded from: classes.dex */
final class C1878ya implements Iterator<String> {

    /* renamed from: n */
    final Iterator<String> f7335n;

    /* renamed from: o */
    final /* synthetic */ C1894za f7336o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1878ya(C1894za c1894za) {
        InterfaceC1536d9 interfaceC1536d9;
        this.f7336o = c1894za;
        interfaceC1536d9 = c1894za.f7349n;
        this.f7335n = interfaceC1536d9.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7335n.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ String next() {
        return this.f7335n.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
