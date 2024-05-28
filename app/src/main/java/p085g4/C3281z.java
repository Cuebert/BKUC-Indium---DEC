package p085g4;

import java.util.concurrent.Executor;

/* renamed from: g4.z */
/* loaded from: classes.dex */
final class C3281z implements InterfaceC3258i0 {

    /* renamed from: a */
    private final Executor f13732a;

    /* renamed from: b */
    private final Object f13733b = new Object();

    /* renamed from: c */
    private InterfaceC3249e f13734c;

    public C3281z(Executor executor, InterfaceC3249e interfaceC3249e) {
        this.f13732a = executor;
        this.f13734c = interfaceC3249e;
    }

    @Override // p085g4.InterfaceC3258i0
    /* renamed from: b */
    public final void mo14483b(AbstractC3263l abstractC3263l) {
        if (abstractC3263l.mo14506m()) {
            synchronized (this.f13733b) {
                if (this.f13734c == null) {
                    return;
                }
                this.f13732a.execute(new RunnableC3280y(this));
            }
        }
    }
}
