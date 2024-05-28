package p198p3;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;
import p085g4.C3265m;
import p308y2.C5625o;

/* renamed from: p3.n */
/* loaded from: classes.dex */
final class BinderC4248n extends AbstractBinderC4238i {

    /* renamed from: c */
    final /* synthetic */ C3265m f17433c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC4248n(C4250o c4250o, C3265m c3265m) {
        this.f17433c = c3265m;
    }

    @Override // p198p3.InterfaceC4240j
    /* renamed from: o0 */
    public final void mo17666o0(Status status, SavePasswordResult savePasswordResult) throws RemoteException {
        C5625o.m20649b(status, savePasswordResult, this.f17433c);
    }
}
