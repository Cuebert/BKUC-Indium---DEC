package p198p3;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;
import p085g4.C3265m;
import p308y2.C5625o;

/* renamed from: p3.v */
/* loaded from: classes.dex */
final class BinderC4263v extends AbstractBinderC4224b {

    /* renamed from: c */
    final /* synthetic */ C3265m f17447c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC4263v(C4267z c4267z, C3265m c3265m) {
        this.f17447c = c3265m;
    }

    @Override // p198p3.InterfaceC4226c
    /* renamed from: O */
    public final void mo17653O(Status status, BeginSignInResult beginSignInResult) throws RemoteException {
        C5625o.m20649b(status, beginSignInResult, this.f17447c);
    }
}
