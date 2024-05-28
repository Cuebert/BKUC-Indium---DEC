package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.s */
/* loaded from: classes.dex */
final class C1771s implements Iterator<InterfaceC1739q> {

    /* renamed from: n */
    private int f7213n = 0;

    /* renamed from: o */
    final /* synthetic */ C1803u f7214o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1771s(C1803u c1803u) {
        this.f7214o = c1803u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i10 = this.f7213n;
        str = this.f7214o.f7249n;
        return i10 < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ InterfaceC1739q next() {
        String str;
        int i10 = this.f7213n;
        str = this.f7214o.f7249n;
        if (i10 < str.length()) {
            int i11 = this.f7213n;
            this.f7213n = i11 + 1;
            return new C1803u(String.valueOf(i11));
        }
        throw new NoSuchElementException();
    }
}
