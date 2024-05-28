package p271v3;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: v3.f */
/* loaded from: classes.dex */
public final class C4951f<E> extends AbstractC4945c<E> {

    /* renamed from: p */
    private final AbstractC4955h<E> f19017p;

    public C4951f(AbstractC4955h<E> abstractC4955h, int i10) {
        super(abstractC4955h.size(), i10);
        this.f19017p = abstractC4955h;
    }

    @Override // p271v3.AbstractC4945c
    /* renamed from: a */
    protected final E mo19369a(int i10) {
        return this.f19017p.get(i10);
    }
}
