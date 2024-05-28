package p198p3;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p330authapi.zbu;
import p295x2.AbstractC5511f;
import p295x2.InterfaceC5518m;

/* renamed from: p3.i0 */
/* loaded from: classes.dex */
final class C4239i0 extends AbstractC4247m0 {

    /* renamed from: s */
    final /* synthetic */ Credential f17428s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4239i0(C4245l0 c4245l0, AbstractC5511f abstractC5511f, Credential credential) {
        super(abstractC5511f);
        this.f17428s = credential;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC5518m mo7423d(Status status) {
        return status;
    }

    @Override // p198p3.AbstractC4247m0
    /* renamed from: r */
    protected final void mo17665r(Context context, C4257r0 c4257r0) throws RemoteException {
        c4257r0.m17673K0(new BinderC4243k0(this), new zbu(this.f17428s));
    }
}
