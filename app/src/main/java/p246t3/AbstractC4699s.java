package p246t3;

import java.util.NoSuchElementException;

/* renamed from: t3.s */
/* loaded from: classes.dex */
abstract class AbstractC4699s extends AbstractC4640d1 {

    /* renamed from: n */
    private final int f18495n;

    /* renamed from: o */
    private int f18496o;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4699s(int i10, int i11) {
        C4691q.m18804b(i11, i10, "index");
        this.f18495n = i10;
        this.f18496o = i11;
    }

    /* renamed from: a */
    protected abstract Object mo18812a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f18496o < this.f18495n;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f18496o > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f18496o;
            this.f18496o = i10 + 1;
            return mo18812a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f18496o;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f18496o - 1;
            this.f18496o = i10;
            return mo18812a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f18496o - 1;
    }
}
