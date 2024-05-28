package p309y3;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: y3.i7 */
/* loaded from: classes.dex */
class C5725i7<E> extends C5836u7<E> {

    /* renamed from: a */
    Object[] f21089a = new Object[4];

    /* renamed from: b */
    int f21090b = 0;

    /* renamed from: c */
    boolean f21091c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5725i7(int i10) {
    }

    /* renamed from: b */
    private final void m20691b(int i10) {
        Object[] objArr = this.f21089a;
        int length = objArr.length;
        if (length >= i10) {
            if (this.f21091c) {
                this.f21089a = (Object[]) objArr.clone();
                this.f21091c = false;
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
        this.f21089a = Arrays.copyOf(objArr, i11);
        this.f21091c = false;
    }

    /* renamed from: a */
    public final C5725i7<E> m20692a(E e10) {
        Objects.requireNonNull(e10);
        m20691b(this.f21090b + 1);
        Object[] objArr = this.f21089a;
        int i10 = this.f21090b;
        this.f21090b = i10 + 1;
        objArr[i10] = e10;
        return this;
    }
}
