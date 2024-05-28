package p283w3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: w3.u0 */
/* loaded from: classes.dex */
class C5379u0<E> extends AbstractC5392v0<E> {

    /* renamed from: a */
    Object[] f20170a = new Object[4];

    /* renamed from: b */
    int f20171b = 0;

    /* renamed from: c */
    boolean f20172c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5379u0(int i10) {
    }

    /* renamed from: d */
    private final void m19980d(int i10) {
        Object[] objArr = this.f20170a;
        int length = objArr.length;
        if (length >= i10) {
            if (this.f20172c) {
                this.f20170a = (Object[]) objArr.clone();
                this.f20172c = false;
                return;
            }
            return;
        }
        int i11 = length + (length >> 1) + 1;
        if (i11 < i10) {
            int highestOneBit = Integer.highestOneBit(i10 - 1);
            i11 = highestOneBit + highestOneBit;
        }
        if (i11 < 0) {
            i11 = Integer.MAX_VALUE;
        }
        this.f20170a = Arrays.copyOf(objArr, i11);
        this.f20172c = false;
    }

    /* renamed from: b */
    public final C5379u0<E> m19981b(E e10) {
        Objects.requireNonNull(e10);
        m19980d(this.f20171b + 1);
        Object[] objArr = this.f20170a;
        int i10 = this.f20171b;
        this.f20171b = i10 + 1;
        objArr[i10] = e10;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final AbstractC5392v0<E> m19982c(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            m19980d(this.f20171b + iterable.size());
            if (iterable instanceof AbstractC5405w0) {
                this.f20171b = ((AbstractC5405w0) iterable).mo19767c(this.f20170a, this.f20171b);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            mo19986a(it.next());
        }
        return this;
    }
}
