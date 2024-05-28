package p283w3;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w3.z0 */
/* loaded from: classes.dex */
public final class C5444z0<E> extends AbstractC5339r<E> {

    /* renamed from: p */
    private final AbstractC5144c1<E> f20300p;

    public C5444z0(AbstractC5144c1<E> abstractC5144c1, int i10) {
        super(abstractC5144c1.size(), i10);
        this.f20300p = abstractC5144c1;
    }

    @Override // p283w3.AbstractC5339r
    /* renamed from: a */
    protected final E mo19922a(int i10) {
        return this.f20300p.get(i10);
    }
}
