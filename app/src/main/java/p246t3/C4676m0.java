package p246t3;

import java.util.NoSuchElementException;

/* renamed from: t3.m0 */
/* loaded from: classes.dex */
final class C4676m0 extends AbstractC4635c1 {

    /* renamed from: n */
    boolean f18475n;

    /* renamed from: o */
    final /* synthetic */ Object f18476o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4676m0(Object obj) {
        this.f18476o = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f18475n;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f18475n) {
            throw new NoSuchElementException();
        }
        this.f18475n = true;
        return this.f18476o;
    }
}
