package p283w3;

import java.util.NoSuchElementException;

/* renamed from: w3.r */
/* loaded from: classes.dex */
abstract class AbstractC5339r<E> extends AbstractC5354s1<E> {

    /* renamed from: n */
    private final int f20073n;

    /* renamed from: o */
    private int f20074o;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5339r(int i10, int i11) {
        C5313p.m19883b(i11, i10, "index");
        this.f20073n = i10;
        this.f20074o = i11;
    }

    /* renamed from: a */
    protected abstract E mo19922a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f20074o < this.f20073n;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f20074o > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i10 = this.f20074o;
            this.f20074o = i10 + 1;
            return mo19922a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f20074o;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f20074o - 1;
            this.f20074o = i10;
            return mo19922a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f20074o - 1;
    }
}
