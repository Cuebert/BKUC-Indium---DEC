package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.t */
/* loaded from: classes.dex */
final class C1787t implements Iterator<InterfaceC1739q> {

    /* renamed from: n */
    private int f7239n = 0;

    /* renamed from: o */
    final /* synthetic */ C1803u f7240o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1787t(C1803u c1803u) {
        this.f7240o = c1803u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i10 = this.f7239n;
        str = this.f7240o.f7249n;
        return i10 < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ InterfaceC1739q next() {
        String str;
        String str2;
        int i10 = this.f7239n;
        str = this.f7240o.f7249n;
        if (i10 < str.length()) {
            str2 = this.f7240o.f7249n;
            int i11 = this.f7239n;
            this.f7239n = i11 + 1;
            return new C1803u(String.valueOf(str2.charAt(i11)));
        }
        throw new NoSuchElementException();
    }
}
