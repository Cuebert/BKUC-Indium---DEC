package p085g4;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: g4.o0 */
/* loaded from: classes.dex */
public final class RunnableC3270o0 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ C3268n0 f13716n;

    /* renamed from: o */
    final /* synthetic */ Callable f13717o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3270o0(C3268n0 c3268n0, Callable callable) {
        this.f13716n = c3268n0;
        this.f13717o = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f13716n.m14522s(this.f13717o.call());
        } catch (Exception e10) {
            this.f13716n.m14521r(e10);
        } catch (Throwable th) {
            this.f13716n.m14521r(new RuntimeException(th));
        }
    }
}
