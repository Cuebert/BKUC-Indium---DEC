package p072f5;

import java.util.NoSuchElementException;
import p059e5.C3075g;

/* renamed from: f5.a */
/* loaded from: classes.dex */
abstract class AbstractC3147a<E> extends AbstractC3157k<E> {

    /* renamed from: n */
    private final int f13178n;

    /* renamed from: o */
    private int f13179o;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3147a(int i10, int i11) {
        C3075g.m13553h(i11, i10);
        this.f13178n = i10;
        this.f13179o = i11;
    }

    /* renamed from: a */
    protected abstract E mo13828a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f13179o < this.f13178n;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f13179o > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i10 = this.f13179o;
            this.f13179o = i10 + 1;
            return mo13828a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f13179o;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f13179o - 1;
            this.f13179o = i10;
            return mo13828a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f13179o - 1;
    }
}
