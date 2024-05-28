package p246t3;

/* renamed from: t3.s0 */
/* loaded from: classes.dex */
public final class C4700s0 extends AbstractC4624a0 {

    /* renamed from: s */
    static final AbstractC4624a0 f18497s = new C4700s0(new Object[0], 0);

    /* renamed from: q */
    final transient Object[] f18498q;

    /* renamed from: r */
    private final transient int f18499r;

    public C4700s0(Object[] objArr, int i10) {
        this.f18498q = objArr;
        this.f18499r = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p246t3.AbstractC4624a0, p246t3.AbstractC4715w
    /* renamed from: c */
    public final int mo18719c(Object[] objArr, int i10) {
        System.arraycopy(this.f18498q, 0, objArr, 0, this.f18499r);
        return this.f18499r;
    }

    @Override // p246t3.AbstractC4715w
    /* renamed from: e */
    public final int mo18813e() {
        return this.f18499r;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C4691q.m18803a(i10, this.f18499r, "index");
        Object obj = this.f18498q[i10];
        obj.getClass();
        return obj;
    }

    @Override // p246t3.AbstractC4715w
    /* renamed from: i */
    public final int mo18814i() {
        return 0;
    }

    @Override // p246t3.AbstractC4715w
    /* renamed from: l */
    public final Object[] mo18815l() {
        return this.f18498q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18499r;
    }
}
