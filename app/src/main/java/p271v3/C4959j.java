package p271v3;

/* renamed from: v3.j */
/* loaded from: classes.dex */
public final class C4959j<E> extends AbstractC4955h<E> {

    /* renamed from: r */
    static final AbstractC4955h<Object> f19028r = new C4959j(new Object[0], 0);

    /* renamed from: p */
    final transient Object[] f19029p;

    /* renamed from: q */
    private final transient int f19030q;

    public C4959j(Object[] objArr, int i10) {
        this.f19029p = objArr;
        this.f19030q = i10;
    }

    @Override // p271v3.AbstractC4955h, p271v3.AbstractC4949e
    /* renamed from: c */
    final int mo19370c(Object[] objArr, int i10) {
        System.arraycopy(this.f19029p, 0, objArr, 0, this.f19030q);
        return this.f19030q;
    }

    @Override // p271v3.AbstractC4949e
    /* renamed from: e */
    final int mo19371e() {
        return this.f19030q;
    }

    @Override // java.util.List
    public final E get(int i10) {
        C4964l0.m19386a(i10, this.f19030q, "index");
        return (E) this.f19029p[i10];
    }

    @Override // p271v3.AbstractC4949e
    /* renamed from: i */
    public final int mo19372i() {
        return 0;
    }

    @Override // p271v3.AbstractC4949e
    /* renamed from: k */
    public final Object[] mo19373k() {
        return this.f19029p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19030q;
    }
}
