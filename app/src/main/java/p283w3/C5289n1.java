package p283w3;

/* renamed from: w3.n1 */
/* loaded from: classes.dex */
public final class C5289n1<E> extends AbstractC5144c1<E> {

    /* renamed from: r */
    static final AbstractC5144c1<Object> f19916r = new C5289n1(new Object[0], 0);

    /* renamed from: p */
    final transient Object[] f19917p;

    /* renamed from: q */
    private final transient int f19918q;

    public C5289n1(Object[] objArr, int i10) {
        this.f19917p = objArr;
        this.f19918q = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p283w3.AbstractC5144c1, p283w3.AbstractC5405w0
    /* renamed from: c */
    public final int mo19767c(Object[] objArr, int i10) {
        System.arraycopy(this.f19917p, 0, objArr, i10, this.f19918q);
        return i10 + this.f19918q;
    }

    @Override // p283w3.AbstractC5405w0
    /* renamed from: e */
    final int mo19757e() {
        return this.f19918q;
    }

    @Override // java.util.List
    public final E get(int i10) {
        C5313p.m19882a(i10, this.f19918q, "index");
        E e10 = (E) this.f19917p[i10];
        e10.getClass();
        return e10;
    }

    @Override // p283w3.AbstractC5405w0
    /* renamed from: i */
    public final int mo19758i() {
        return 0;
    }

    @Override // p283w3.AbstractC5405w0
    /* renamed from: l */
    public final Object[] mo19759l() {
        return this.f19917p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19918q;
    }
}
