package p308y2;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y2.a0 */
/* loaded from: classes.dex */
public final class RunnableC5601a0 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ BinderC5607d0 f20772n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5601a0(BinderC5607d0 binderC5607d0) {
        this.f20772n = binderC5607d0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC5605c0 interfaceC5605c0;
        interfaceC5605c0 = this.f20772n.f20786i;
        interfaceC5605c0.mo7583c(new ConnectionResult(4));
    }
}
