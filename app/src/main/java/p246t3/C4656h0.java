package p246t3;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: t3.h0 */
/* loaded from: classes.dex */
public final class C4656h0 extends AbstractC4639d0 {

    /* renamed from: p */
    final /* synthetic */ C4660i0 f18450p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4656h0(C4660i0 c4660i0) {
        this.f18450p = c4660i0;
    }

    @Override // p246t3.AbstractC4644e0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo18752q().listIterator(0);
    }

    @Override // p246t3.AbstractC4644e0, p246t3.AbstractC4715w
    /* renamed from: k */
    public final AbstractC4635c1 iterator() {
        return mo18752q().listIterator(0);
    }

    @Override // p246t3.AbstractC4644e0
    /* renamed from: r */
    final AbstractC4624a0 mo18753r() {
        return new C4652g0(this);
    }

    @Override // p246t3.AbstractC4639d0
    /* renamed from: u */
    final AbstractC4634c0 mo18747u() {
        return this.f18450p;
    }
}
