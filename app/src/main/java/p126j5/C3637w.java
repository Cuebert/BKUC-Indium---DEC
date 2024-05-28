package p126j5;

import p248t5.InterfaceC4733b;

/* renamed from: j5.w */
/* loaded from: classes.dex */
public class C3637w<T> implements InterfaceC4733b<T> {

    /* renamed from: c */
    private static final Object f15310c = new Object();

    /* renamed from: a */
    private volatile Object f15311a = f15310c;

    /* renamed from: b */
    private volatile InterfaceC4733b<T> f15312b;

    public C3637w(InterfaceC4733b<T> interfaceC4733b) {
        this.f15312b = interfaceC4733b;
    }

    @Override // p248t5.InterfaceC4733b
    public T get() {
        T t10 = (T) this.f15311a;
        Object obj = f15310c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = (T) this.f15311a;
                if (t10 == obj) {
                    t10 = this.f15312b.get();
                    this.f15311a = t10;
                    this.f15312b = null;
                }
            }
        }
        return t10;
    }
}
