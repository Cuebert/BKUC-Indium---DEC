package p126j5;

import p248t5.InterfaceC4732a;
import p248t5.InterfaceC4733b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j5.b0 */
/* loaded from: classes.dex */
public class C3614b0<T> implements InterfaceC4733b<T> {

    /* renamed from: c */
    private static final InterfaceC4732a<Object> f15248c = new InterfaceC4732a() { // from class: j5.z
        @Override // p248t5.InterfaceC4732a
        /* renamed from: a */
        public final void mo15548a(InterfaceC4733b interfaceC4733b) {
            C3614b0.m15453d(interfaceC4733b);
        }
    };

    /* renamed from: d */
    private static final InterfaceC4733b<Object> f15249d = new InterfaceC4733b() { // from class: j5.a0
        @Override // p248t5.InterfaceC4733b
        public final Object get() {
            Object m15454e;
            m15454e = C3614b0.m15454e();
            return m15454e;
        }
    };

    /* renamed from: a */
    private InterfaceC4732a<T> f15250a;

    /* renamed from: b */
    private volatile InterfaceC4733b<T> f15251b;

    private C3614b0(InterfaceC4732a<T> interfaceC4732a, InterfaceC4733b<T> interfaceC4733b) {
        this.f15250a = interfaceC4732a;
        this.f15251b = interfaceC4733b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static <T> C3614b0<T> m15452c() {
        return new C3614b0<>(f15248c, f15249d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m15453d(InterfaceC4733b interfaceC4733b) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ Object m15454e() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m15455f(InterfaceC4733b<T> interfaceC4733b) {
        InterfaceC4732a<T> interfaceC4732a;
        if (this.f15251b == f15249d) {
            synchronized (this) {
                interfaceC4732a = this.f15250a;
                this.f15250a = null;
                this.f15251b = interfaceC4733b;
            }
            interfaceC4732a.mo15548a(interfaceC4733b);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    @Override // p248t5.InterfaceC4733b
    public T get() {
        return this.f15251b.get();
    }
}
