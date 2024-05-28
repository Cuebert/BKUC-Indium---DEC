package androidx.core.util;

/* renamed from: androidx.core.util.g */
/* loaded from: classes.dex */
public class C0653g<T> extends C0652f<T> {

    /* renamed from: c */
    private final Object f3497c;

    public C0653g(int i10) {
        super(i10);
        this.f3497c = new Object();
    }

    @Override // androidx.core.util.C0652f, androidx.core.util.InterfaceC0651e
    /* renamed from: a */
    public boolean mo3459a(T t10) {
        boolean mo3459a;
        synchronized (this.f3497c) {
            mo3459a = super.mo3459a(t10);
        }
        return mo3459a;
    }

    @Override // androidx.core.util.C0652f, androidx.core.util.InterfaceC0651e
    /* renamed from: b */
    public T mo3460b() {
        T t10;
        synchronized (this.f3497c) {
            t10 = (T) super.mo3460b();
        }
        return t10;
    }
}
