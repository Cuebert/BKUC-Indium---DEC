package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.d */
/* loaded from: classes.dex */
final class C1526d implements Iterator<InterfaceC1739q> {

    /* renamed from: n */
    final /* synthetic */ Iterator f6741n;

    /* renamed from: o */
    final /* synthetic */ Iterator f6742o;

    public C1526d(C1560f c1560f, Iterator it, Iterator it2) {
        this.f6741n = it;
        this.f6742o = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6741n.hasNext()) {
            return true;
        }
        return this.f6742o.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ InterfaceC1739q next() {
        if (this.f6741n.hasNext()) {
            return new C1803u(((Integer) this.f6741n.next()).toString());
        }
        if (this.f6742o.hasNext()) {
            return new C1803u((String) this.f6742o.next());
        }
        throw new NoSuchElementException();
    }
}
