package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.play_billing.s */
/* loaded from: classes.dex */
final class C2025s extends AbstractC2039u {

    /* renamed from: n */
    private int f7780n = 0;

    /* renamed from: o */
    private final int f7781o;

    /* renamed from: p */
    final /* synthetic */ AbstractC1914c0 f7782p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2025s(AbstractC1914c0 abstractC1914c0) {
        this.f7782p = abstractC1914c0;
        this.f7781o = abstractC1914c0.mo9271i();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7780n < this.f7781o;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2053w
    public final byte zza() {
        int i10 = this.f7780n;
        if (i10 < this.f7781o) {
            this.f7780n = i10 + 1;
            return this.f7782p.mo9270e(i10);
        }
        throw new NoSuchElementException();
    }
}
