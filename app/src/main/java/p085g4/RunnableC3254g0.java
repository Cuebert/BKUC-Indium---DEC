package p085g4;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: g4.g0 */
/* loaded from: classes.dex */
final class RunnableC3254g0 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ AbstractC3263l f13697n;

    /* renamed from: o */
    final /* synthetic */ C3256h0 f13698o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3254g0(C3256h0 c3256h0, AbstractC3263l abstractC3263l) {
        this.f13698o = c3256h0;
        this.f13697n = abstractC3263l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3261k interfaceC3261k;
        try {
            interfaceC3261k = this.f13698o.f13700b;
            AbstractC3263l mo6267a = interfaceC3261k.mo6267a(this.f13697n.mo14504k());
            if (mo6267a == null) {
                this.f13698o.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C3267n.f13709b;
            mo6267a.mo14500g(executor, this.f13698o);
            mo6267a.mo14498e(executor, this.f13698o);
            mo6267a.mo14494a(executor, this.f13698o);
        } catch (C3259j e10) {
            if (e10.getCause() instanceof Exception) {
                this.f13698o.onFailure((Exception) e10.getCause());
            } else {
                this.f13698o.onFailure(e10);
            }
        } catch (CancellationException unused) {
            this.f13698o.mo14487a();
        } catch (Exception e11) {
            this.f13698o.onFailure(e11);
        }
    }
}
