package p085g4;

import java.util.concurrent.Executor;

/* renamed from: g4.w */
/* loaded from: classes.dex */
final class RunnableC3278w implements Runnable {

    /* renamed from: n */
    final /* synthetic */ AbstractC3263l f13726n;

    /* renamed from: o */
    final /* synthetic */ C3279x f13727o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3278w(C3279x c3279x, AbstractC3263l abstractC3263l) {
        this.f13727o = c3279x;
        this.f13726n = abstractC3263l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3268n0 c3268n0;
        C3268n0 c3268n02;
        C3268n0 c3268n03;
        InterfaceC3245c interfaceC3245c;
        try {
            interfaceC3245c = this.f13727o.f13729b;
            AbstractC3263l abstractC3263l = (AbstractC3263l) interfaceC3245c.mo11930a(this.f13726n);
            if (abstractC3263l == null) {
                this.f13727o.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C3267n.f13709b;
            abstractC3263l.mo14500g(executor, this.f13727o);
            abstractC3263l.mo14498e(executor, this.f13727o);
            abstractC3263l.mo14494a(executor, this.f13727o);
        } catch (C3259j e10) {
            if (e10.getCause() instanceof Exception) {
                c3268n03 = this.f13727o.f13730c;
                c3268n03.m14521r((Exception) e10.getCause());
            } else {
                c3268n02 = this.f13727o.f13730c;
                c3268n02.m14521r(e10);
            }
        } catch (Exception e11) {
            c3268n0 = this.f13727o.f13730c;
            c3268n0.m14521r(e11);
        }
    }
}
