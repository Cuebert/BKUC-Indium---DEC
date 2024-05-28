package p085g4;

import java.util.concurrent.Executor;

/* renamed from: g4.v */
/* loaded from: classes.dex */
final class C3277v implements InterfaceC3258i0 {

    /* renamed from: a */
    private final Executor f13723a;

    /* renamed from: b */
    private final InterfaceC3245c f13724b;

    /* renamed from: c */
    private final C3268n0 f13725c;

    public C3277v(Executor executor, InterfaceC3245c interfaceC3245c, C3268n0 c3268n0) {
        this.f13723a = executor;
        this.f13724b = interfaceC3245c;
        this.f13725c = c3268n0;
    }

    @Override // p085g4.InterfaceC3258i0
    /* renamed from: b */
    public final void mo14483b(AbstractC3263l abstractC3263l) {
        this.f13723a.execute(new RunnableC3276u(this, abstractC3263l));
    }
}
