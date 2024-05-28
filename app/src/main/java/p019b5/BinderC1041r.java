package p019b5;

import android.os.Bundle;
import android.os.RemoteException;
import p045d5.C3005x;
import p085g4.C3265m;

/* renamed from: b5.r */
/* loaded from: classes.dex */
final class BinderC1041r extends BinderC1039p {

    /* renamed from: e */
    private final C3005x f5226e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC1041r(C1043t c1043t, C3265m c3265m) {
        super(c1043t, c3265m);
        this.f5226e = new C3005x("OnWarmUpIntegrityTokenCallback");
    }

    @Override // p019b5.BinderC1039p, p045d5.InterfaceC3004w
    /* renamed from: D */
    public final void mo6275D(Bundle bundle) throws RemoteException {
        super.mo6275D(bundle);
        this.f5226e.m13478b("onWarmUpExpressIntegrityToken", new Object[0]);
        int i10 = bundle.getInt("error");
        if (i10 != 0) {
            this.f5223c.m14515d(new C1014b(i10, null));
        } else {
            this.f5223c.m14516e(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
