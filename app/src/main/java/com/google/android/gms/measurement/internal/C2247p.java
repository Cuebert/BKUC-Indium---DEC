package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.p */
/* loaded from: classes.dex */
final class C2247p implements Iterator<String> {

    /* renamed from: n */
    final Iterator<String> f8418n;

    /* renamed from: o */
    final /* synthetic */ zzar f8419o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2247p(zzar zzarVar) {
        Bundle bundle;
        this.f8419o = zzarVar;
        bundle = zzarVar.f8837n;
        this.f8418n = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return this.f8418n.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8418n.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
