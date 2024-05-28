package p309y3;

import java.util.List;

/* renamed from: y3.y7 */
/* loaded from: classes.dex */
public final class C5872y7 extends AbstractC5881z7 {

    /* renamed from: p */
    final transient int f21588p;

    /* renamed from: q */
    final transient int f21589q;

    /* renamed from: r */
    final /* synthetic */ AbstractC5881z7 f21590r;

    public C5872y7(AbstractC5881z7 abstractC5881z7, int i10, int i11) {
        this.f21590r = abstractC5881z7;
        this.f21588p = i10;
        this.f21589q = i11;
    }

    @Override // p309y3.AbstractC5845v7
    /* renamed from: e */
    final int mo20661e() {
        return this.f21590r.mo20662i() + this.f21588p + this.f21589q;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C5692f4.m20675a(i10, this.f21589q, "index");
        return this.f21590r.get(i10 + this.f21588p);
    }

    @Override // p309y3.AbstractC5845v7
    /* renamed from: i */
    public final int mo20662i() {
        return this.f21590r.mo20662i() + this.f21588p;
    }

    @Override // p309y3.AbstractC5845v7
    /* renamed from: k */
    public final Object[] mo20663k() {
        return this.f21590r.mo20663k();
    }

    @Override // p309y3.AbstractC5881z7
    /* renamed from: l */
    public final AbstractC5881z7 subList(int i10, int i11) {
        C5692f4.m20677c(i10, i11, this.f21589q);
        AbstractC5881z7 abstractC5881z7 = this.f21590r;
        int i12 = this.f21588p;
        return abstractC5881z7.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21589q;
    }

    @Override // p309y3.AbstractC5881z7, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
