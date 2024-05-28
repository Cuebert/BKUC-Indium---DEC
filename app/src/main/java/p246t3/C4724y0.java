package p246t3;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: t3.y0 */
/* loaded from: classes.dex */
public final class C4724y0 extends AbstractC4644e0 {

    /* renamed from: p */
    final transient Object f18555p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4724y0(Object obj) {
        Objects.requireNonNull(obj);
        this.f18555p = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p246t3.AbstractC4715w
    /* renamed from: c */
    public final int mo18719c(Object[] objArr, int i10) {
        objArr[0] = this.f18555p;
        return 1;
    }

    @Override // p246t3.AbstractC4715w, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f18555p.equals(obj);
    }

    @Override // p246t3.AbstractC4644e0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f18555p.hashCode();
    }

    @Override // p246t3.AbstractC4644e0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C4676m0(this.f18555p);
    }

    @Override // p246t3.AbstractC4644e0, p246t3.AbstractC4715w
    /* renamed from: k */
    public final AbstractC4635c1 iterator() {
        return new C4676m0(this.f18555p);
    }

    @Override // p246t3.AbstractC4644e0
    /* renamed from: q */
    public final AbstractC4624a0 mo18752q() {
        return AbstractC4624a0.m18718r(this.f18555p);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f18555p.toString() + "]";
    }
}
