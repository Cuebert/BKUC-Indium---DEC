package p246t3;

import java.util.List;

/* renamed from: t3.z */
/* loaded from: classes.dex */
public final class C4727z extends AbstractC4624a0 {

    /* renamed from: q */
    final transient int f18556q;

    /* renamed from: r */
    final transient int f18557r;

    /* renamed from: s */
    final /* synthetic */ AbstractC4624a0 f18558s;

    public C4727z(AbstractC4624a0 abstractC4624a0, int i10, int i11) {
        this.f18558s = abstractC4624a0;
        this.f18556q = i10;
        this.f18557r = i11;
    }

    @Override // p246t3.AbstractC4715w
    /* renamed from: e */
    public final int mo18813e() {
        return this.f18558s.mo18814i() + this.f18556q + this.f18557r;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C4691q.m18803a(i10, this.f18557r, "index");
        return this.f18558s.get(i10 + this.f18556q);
    }

    @Override // p246t3.AbstractC4715w
    /* renamed from: i */
    public final int mo18814i() {
        return this.f18558s.mo18814i() + this.f18556q;
    }

    @Override // p246t3.AbstractC4715w
    /* renamed from: l */
    public final Object[] mo18815l() {
        return this.f18558s.mo18815l();
    }

    @Override // p246t3.AbstractC4624a0
    /* renamed from: o */
    public final AbstractC4624a0 subList(int i10, int i11) {
        C4691q.m18807e(i10, i11, this.f18557r);
        AbstractC4624a0 abstractC4624a0 = this.f18558s;
        int i12 = this.f18556q;
        return abstractC4624a0.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18557r;
    }

    @Override // p246t3.AbstractC4624a0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
