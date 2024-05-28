package p271v3;

import java.util.NoSuchElementException;

/* renamed from: v3.c */
/* loaded from: classes.dex */
abstract class AbstractC4945c<E> extends AbstractC4963l<E> {

    /* renamed from: n */
    private final int f19013n;

    /* renamed from: o */
    private int f19014o;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4945c(int i10, int i11) {
        C4964l0.m19387b(i11, i10, "index");
        this.f19013n = i10;
        this.f19014o = i11;
    }

    /* renamed from: a */
    protected abstract E mo19369a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f19014o < this.f19013n;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f19014o > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i10 = this.f19014o;
            this.f19014o = i10 + 1;
            return mo19369a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f19014o;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f19014o - 1;
            this.f19014o = i10;
            return mo19369a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f19014o - 1;
    }
}
