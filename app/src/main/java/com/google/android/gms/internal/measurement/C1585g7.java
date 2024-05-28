package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.g7 */
/* loaded from: classes.dex */
final class C1585g7 extends AbstractC1635j7 {

    /* renamed from: n */
    private int f6807n = 0;

    /* renamed from: o */
    private final int f6808o;

    /* renamed from: p */
    final /* synthetic */ AbstractC1731p7 f6809p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1585g7(AbstractC1731p7 abstractC1731p7) {
        this.f6809p = abstractC1731p7;
        this.f6808o = abstractC1731p7.mo8352i();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6807n < this.f6808o;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1667l7
    public final byte zza() {
        int i10 = this.f6807n;
        if (i10 < this.f6808o) {
            this.f6807n = i10 + 1;
            return this.f6809p.mo8351e(i10);
        }
        throw new NoSuchElementException();
    }
}
