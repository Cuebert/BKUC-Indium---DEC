package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.l */
/* loaded from: classes.dex */
final class C1659l implements Iterator<InterfaceC1739q> {

    /* renamed from: n */
    final /* synthetic */ Iterator f6958n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1659l(Iterator it) {
        this.f6958n = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6958n.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ InterfaceC1739q next() {
        return new C1803u((String) this.f6958n.next());
    }
}
