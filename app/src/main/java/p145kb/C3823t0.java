package p145kb;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p051db.InterfaceC3041l;
import p253ta.C4755l;

/* renamed from: kb.t0 */
/* loaded from: classes.dex */
final class C3823t0 extends AbstractC3831x0 {

    /* renamed from: s */
    private static final AtomicIntegerFieldUpdater f15882s = AtomicIntegerFieldUpdater.newUpdater(C3823t0.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: r */
    private final InterfaceC3041l<Throwable, C4755l> f15883r;

    /* JADX WARN: Multi-variable type inference failed */
    public C3823t0(InterfaceC3041l<? super Throwable, C4755l> interfaceC3041l) {
        this.f15883r = interfaceC3041l;
    }

    @Override // p051db.InterfaceC3041l
    public /* bridge */ /* synthetic */ C4755l invoke(Throwable th) {
        mo16100s(th);
        return C4755l.f18582a;
    }

    @Override // p145kb.AbstractC3818r
    /* renamed from: s */
    public void mo16100s(Throwable th) {
        if (f15882s.compareAndSet(this, 0, 1)) {
            this.f15883r.invoke(th);
        }
    }
}
