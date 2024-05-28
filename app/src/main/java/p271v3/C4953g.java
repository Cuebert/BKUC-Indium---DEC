package p271v3;

import java.util.List;

/* renamed from: v3.g */
/* loaded from: classes.dex */
public final class C4953g extends AbstractC4955h {

    /* renamed from: p */
    final transient int f19018p;

    /* renamed from: q */
    final transient int f19019q;

    /* renamed from: r */
    final /* synthetic */ AbstractC4955h f19020r;

    public C4953g(AbstractC4955h abstractC4955h, int i10, int i11) {
        this.f19020r = abstractC4955h;
        this.f19018p = i10;
        this.f19019q = i11;
    }

    @Override // p271v3.AbstractC4949e
    /* renamed from: e */
    final int mo19371e() {
        return this.f19020r.mo19372i() + this.f19018p + this.f19019q;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C4964l0.m19386a(i10, this.f19019q, "index");
        return this.f19020r.get(i10 + this.f19018p);
    }

    @Override // p271v3.AbstractC4949e
    /* renamed from: i */
    public final int mo19372i() {
        return this.f19020r.mo19372i() + this.f19018p;
    }

    @Override // p271v3.AbstractC4949e
    /* renamed from: k */
    public final Object[] mo19373k() {
        return this.f19020r.mo19373k();
    }

    @Override // p271v3.AbstractC4955h
    /* renamed from: l */
    public final AbstractC4955h subList(int i10, int i11) {
        C4964l0.m19388c(i10, i11, this.f19019q);
        AbstractC4955h abstractC4955h = this.f19020r;
        int i12 = this.f19018p;
        return abstractC4955h.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19019q;
    }

    @Override // p271v3.AbstractC4955h, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
