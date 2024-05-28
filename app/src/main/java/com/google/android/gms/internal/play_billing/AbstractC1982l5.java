package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.play_billing.l5 */
/* loaded from: classes.dex */
abstract class AbstractC1982l5 extends AbstractC1962j {

    /* renamed from: n */
    private final int f7736n;

    /* renamed from: o */
    private int f7737o;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1982l5(int i10, int i11) {
        C1968j5.m9471b(i11, i10, "index");
        this.f7736n = i10;
        this.f7737o = i11;
    }

    /* renamed from: a */
    protected abstract Object mo9498a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f7737o < this.f7736n;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7737o > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f7737o;
            this.f7737o = i10 + 1;
            return mo9498a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7737o;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f7737o - 1;
            this.f7737o = i10;
            return mo9498a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7737o - 1;
    }
}
