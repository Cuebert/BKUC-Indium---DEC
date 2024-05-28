package p309y3;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y3.a8 */
/* loaded from: classes.dex */
public final class C5646a8<E> extends AbstractC5881z7<E> {

    /* renamed from: r */
    static final AbstractC5881z7<Object> f20850r = new C5646a8(new Object[0], 0);

    /* renamed from: p */
    final transient Object[] f20851p;

    /* renamed from: q */
    private final transient int f20852q;

    public C5646a8(Object[] objArr, int i10) {
        this.f20851p = objArr;
        this.f20852q = i10;
    }

    @Override // p309y3.AbstractC5881z7, p309y3.AbstractC5845v7
    /* renamed from: c */
    final int mo20660c(Object[] objArr, int i10) {
        System.arraycopy(this.f20851p, 0, objArr, 0, this.f20852q);
        return this.f20852q;
    }

    @Override // p309y3.AbstractC5845v7
    /* renamed from: e */
    final int mo20661e() {
        return this.f20852q;
    }

    @Override // java.util.List
    public final E get(int i10) {
        C5692f4.m20675a(i10, this.f20852q, "index");
        E e10 = (E) this.f20851p[i10];
        e10.getClass();
        return e10;
    }

    @Override // p309y3.AbstractC5845v7
    /* renamed from: i */
    public final int mo20662i() {
        return 0;
    }

    @Override // p309y3.AbstractC5845v7
    /* renamed from: k */
    public final Object[] mo20663k() {
        return this.f20851p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20852q;
    }
}
