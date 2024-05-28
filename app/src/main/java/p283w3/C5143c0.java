package p283w3;

import java.util.List;
import java.util.ListIterator;

/* renamed from: w3.c0 */
/* loaded from: classes.dex */
final class C5143c0 extends C5115a0 implements ListIterator {

    /* renamed from: q */
    final /* synthetic */ C5157d0 f19423q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5143c0(C5157d0 c5157d0) {
        super(c5157d0);
        this.f19423q = c5157d0;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean isEmpty = this.f19423q.isEmpty();
        m19750a();
        ((ListIterator) this.f19380n).add(obj);
        AbstractC5171e0.m19787g(this.f19423q.f19489s);
        if (isEmpty) {
            this.f19423q.m19755c();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        m19750a();
        return ((ListIterator) this.f19380n).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m19750a();
        return ((ListIterator) this.f19380n).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m19750a();
        return ((ListIterator) this.f19380n).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m19750a();
        return ((ListIterator) this.f19380n).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m19750a();
        ((ListIterator) this.f19380n).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5143c0(C5157d0 c5157d0, int i10) {
        super(c5157d0, ((List) c5157d0.f19394o).listIterator(i10));
        this.f19423q = c5157d0;
    }
}
