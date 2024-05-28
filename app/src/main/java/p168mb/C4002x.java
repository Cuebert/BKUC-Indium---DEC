package p168mb;

import gb.C3328f;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: mb.x */
/* loaded from: classes.dex */
public final class C4002x<T> {
    private volatile AtomicReferenceArray<T> array;

    public C4002x(int i10) {
        this.array = new AtomicReferenceArray<>(i10);
    }

    /* renamed from: a */
    public final int m16809a() {
        return this.array.length();
    }

    /* renamed from: b */
    public final T m16810b(int i10) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i10 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i10);
        }
        return null;
    }

    /* renamed from: c */
    public final void m16811c(int i10, T t10) {
        int m14622a;
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i10 < length) {
            atomicReferenceArray.set(i10, t10);
            return;
        }
        m14622a = C3328f.m14622a(i10 + 1, length * 2);
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(m14622a);
        for (int i11 = 0; i11 < length; i11++) {
            atomicReferenceArray2.set(i11, atomicReferenceArray.get(i11));
        }
        atomicReferenceArray2.set(i10, t10);
        this.array = atomicReferenceArray2;
    }
}
