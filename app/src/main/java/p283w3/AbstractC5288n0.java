package p283w3;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: w3.n0 */
/* loaded from: classes.dex */
abstract class AbstractC5288n0<T> implements Iterator<T> {

    /* renamed from: n */
    int f19912n;

    /* renamed from: o */
    int f19913o;

    /* renamed from: p */
    int f19914p;

    /* renamed from: q */
    final /* synthetic */ C5340r0 f19915q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ AbstractC5288n0(C5340r0 c5340r0, C5236j0 c5236j0) {
        int i10;
        this.f19915q = c5340r0;
        i10 = c5340r0.f20080r;
        this.f19912n = i10;
        this.f19913o = c5340r0.m19935e();
        this.f19914p = -1;
    }

    /* renamed from: b */
    private final void m19872b() {
        int i10;
        i10 = this.f19915q.f20080r;
        if (i10 != this.f19912n) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    abstract T mo19843a(int i10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19913o >= 0;
    }

    @Override // java.util.Iterator
    public final T next() {
        m19872b();
        if (hasNext()) {
            int i10 = this.f19913o;
            this.f19914p = i10;
            T mo19843a = mo19843a(i10);
            this.f19913o = this.f19915q.m19936f(this.f19913o);
            return mo19843a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        m19872b();
        C5313p.m19885d(this.f19914p >= 0, "no calls to next() since the last call to remove()");
        this.f19912n += 32;
        C5340r0 c5340r0 = this.f19915q;
        c5340r0.remove(c5340r0.f20078p[this.f19914p]);
        this.f19913o--;
        this.f19914p = -1;
    }
}
