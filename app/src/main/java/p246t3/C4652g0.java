package p246t3;

import java.util.AbstractMap;

/* renamed from: t3.g0 */
/* loaded from: classes.dex */
final class C4652g0 extends AbstractC4624a0 {

    /* renamed from: q */
    final /* synthetic */ C4656h0 f18448q;

    public C4652g0(C4656h0 c4656h0) {
        this.f18448q = c4656h0;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        C4708u0 c4708u0;
        AbstractC4624a0 abstractC4624a0;
        c4708u0 = this.f18448q.f18450p.f18457p;
        Object obj = c4708u0.f18509r.get(i10);
        abstractC4624a0 = this.f18448q.f18450p.f18458q;
        return new AbstractMap.SimpleImmutableEntry(obj, abstractC4624a0.get(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18448q.f18450p.size();
    }
}
