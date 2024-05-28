package p309y3;

import java.util.NoSuchElementException;

/* renamed from: y3.h6 */
/* loaded from: classes.dex */
abstract class AbstractC5714h6<E> extends AbstractC5666c8<E> {

    /* renamed from: n */
    private final int f21063n;

    /* renamed from: o */
    private int f21064o;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5714h6(int i10, int i11) {
        C5692f4.m20676b(i11, i10, "index");
        this.f21063n = i10;
        this.f21064o = i11;
    }

    /* renamed from: a */
    protected abstract E mo20690a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f21064o < this.f21063n;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f21064o > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i10 = this.f21064o;
            this.f21064o = i10 + 1;
            return mo20690a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f21064o;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f21064o - 1;
            this.f21064o = i10;
            return mo20690a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f21064o - 1;
    }
}
