package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.e */
/* loaded from: classes.dex */
public final class C1543e implements Iterator<InterfaceC1739q> {

    /* renamed from: n */
    private int f6756n = 0;

    /* renamed from: o */
    final /* synthetic */ C1560f f6757o;

    public C1543e(C1560f c1560f) {
        this.f6757o = c1560f;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6756n < this.f6757o.m8140r();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ InterfaceC1739q next() {
        if (this.f6756n < this.f6757o.m8140r()) {
            C1560f c1560f = this.f6757o;
            int i10 = this.f6756n;
            this.f6756n = i10 + 1;
            return c1560f.m8141s(i10);
        }
        int i11 = this.f6756n;
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Out of bounds index: ");
        sb2.append(i11);
        throw new NoSuchElementException(sb2.toString());
    }
}
