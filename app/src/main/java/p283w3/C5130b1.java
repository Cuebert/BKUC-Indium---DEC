package p283w3;

import java.util.List;

/* renamed from: w3.b1 */
/* loaded from: classes.dex */
public final class C5130b1 extends AbstractC5144c1 {

    /* renamed from: p */
    final transient int f19398p;

    /* renamed from: q */
    final transient int f19399q;

    /* renamed from: r */
    final /* synthetic */ AbstractC5144c1 f19400r;

    public C5130b1(AbstractC5144c1 abstractC5144c1, int i10, int i11) {
        this.f19400r = abstractC5144c1;
        this.f19398p = i10;
        this.f19399q = i11;
    }

    @Override // p283w3.AbstractC5405w0
    /* renamed from: e */
    final int mo19757e() {
        return this.f19400r.mo19758i() + this.f19398p + this.f19399q;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C5313p.m19882a(i10, this.f19399q, "index");
        return this.f19400r.get(i10 + this.f19398p);
    }

    @Override // p283w3.AbstractC5405w0
    /* renamed from: i */
    public final int mo19758i() {
        return this.f19400r.mo19758i() + this.f19398p;
    }

    @Override // p283w3.AbstractC5405w0
    /* renamed from: l */
    public final Object[] mo19759l() {
        return this.f19400r.mo19759l();
    }

    @Override // p283w3.AbstractC5144c1
    /* renamed from: m */
    public final AbstractC5144c1 subList(int i10, int i11) {
        C5313p.m19884c(i10, i11, this.f19399q);
        AbstractC5144c1 abstractC5144c1 = this.f19400r;
        int i12 = this.f19398p;
        return abstractC5144c1.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19399q;
    }

    @Override // p283w3.AbstractC5144c1, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
