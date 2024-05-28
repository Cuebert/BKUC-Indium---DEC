package androidx.core.util;

/* renamed from: androidx.core.util.f */
/* loaded from: classes.dex */
public class C0652f<T> implements InterfaceC0651e<T> {

    /* renamed from: a */
    private final Object[] f3495a;

    /* renamed from: b */
    private int f3496b;

    public C0652f(int i10) {
        if (i10 > 0) {
            this.f3495a = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: c */
    private boolean m3461c(T t10) {
        for (int i10 = 0; i10 < this.f3496b; i10++) {
            if (this.f3495a[i10] == t10) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.util.InterfaceC0651e
    /* renamed from: a */
    public boolean mo3459a(T t10) {
        if (!m3461c(t10)) {
            int i10 = this.f3496b;
            Object[] objArr = this.f3495a;
            if (i10 >= objArr.length) {
                return false;
            }
            objArr[i10] = t10;
            this.f3496b = i10 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    @Override // androidx.core.util.InterfaceC0651e
    /* renamed from: b */
    public T mo3460b() {
        int i10 = this.f3496b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f3495a;
        T t10 = (T) objArr[i11];
        objArr[i11] = null;
        this.f3496b = i10 - 1;
        return t10;
    }
}
