package p019b5;

import android.os.Bundle;
import android.os.RemoteException;
import p045d5.C3005x;
import p085g4.C3265m;

/* renamed from: b5.q */
/* loaded from: classes.dex */
final class BinderC1040q extends BinderC1039p {

    /* renamed from: e */
    private final C3005x f5225e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC1040q(C1043t c1043t, C3265m c3265m) {
        super(c1043t, c3265m);
        this.f5225e = new C3005x("OnRequestIntegrityTokenCallback");
    }

    @Override // p019b5.BinderC1039p, p045d5.InterfaceC3004w
    /* renamed from: h0 */
    public final void mo6277h0(Bundle bundle) throws RemoteException {
        super.mo6277h0(bundle);
        this.f5225e.m13478b("onRequestExpressIntegrityToken", new Object[0]);
        int i10 = bundle.getInt("error");
        if (i10 != 0) {
            this.f5223c.m14515d(new C1014b(i10, null));
            return;
        }
        C3265m c3265m = this.f5223c;
        C1017c0 c1017c0 = new C1017c0();
        c1017c0.mo6263a(bundle.getString("token"));
        c3265m.m14516e(c1017c0.mo6264b());
    }
}
