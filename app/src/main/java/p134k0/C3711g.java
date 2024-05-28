package p134k0;

/* renamed from: k0.g */
/* loaded from: classes.dex */
class C3711g<T> implements InterfaceC3710f<T> {

    /* renamed from: a */
    private final Object[] f15520a;

    /* renamed from: b */
    private int f15521b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3711g(int i10) {
        if (i10 > 0) {
            this.f15520a = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // p134k0.InterfaceC3710f
    /* renamed from: a */
    public boolean mo15780a(T t10) {
        int i10 = this.f15521b;
        Object[] objArr = this.f15520a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = t10;
        this.f15521b = i10 + 1;
        return true;
    }

    @Override // p134k0.InterfaceC3710f
    /* renamed from: b */
    public T mo15781b() {
        int i10 = this.f15521b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f15520a;
        T t10 = (T) objArr[i11];
        objArr[i11] = null;
        this.f15521b = i10 - 1;
        return t10;
    }

    @Override // p134k0.InterfaceC3710f
    /* renamed from: c */
    public void mo15782c(T[] tArr, int i10) {
        if (i10 > tArr.length) {
            i10 = tArr.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            T t10 = tArr[i11];
            int i12 = this.f15521b;
            Object[] objArr = this.f15520a;
            if (i12 < objArr.length) {
                objArr[i12] = t10;
                this.f15521b = i12 + 1;
            }
        }
    }
}
