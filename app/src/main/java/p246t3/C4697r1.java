package p246t3;

import java.util.NoSuchElementException;

/* renamed from: t3.r1 */
/* loaded from: classes.dex */
final class C4697r1 extends AbstractC4705t1 {

    /* renamed from: n */
    private int f18492n = 0;

    /* renamed from: o */
    private final int f18493o;

    /* renamed from: p */
    final /* synthetic */ AbstractC4626a2 f18494p;

    public C4697r1(AbstractC4626a2 abstractC4626a2) {
        this.f18494p = abstractC4626a2;
        this.f18493o = abstractC4626a2.mo18731i();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18492n < this.f18493o;
    }

    @Override // p246t3.InterfaceC4713v1
    public final byte zza() {
        int i10 = this.f18492n;
        if (i10 < this.f18493o) {
            this.f18492n = i10 + 1;
            return this.f18494p.mo18730e(i10);
        }
        throw new NoSuchElementException();
    }
}
