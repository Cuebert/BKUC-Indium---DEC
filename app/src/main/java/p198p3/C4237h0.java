package p198p3;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.common.api.Status;
import p295x2.AbstractC5511f;
import p295x2.InterfaceC5518m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: p3.h0 */
/* loaded from: classes.dex */
public final class C4237h0 extends AbstractC4247m0 {

    /* renamed from: s */
    final /* synthetic */ CredentialRequest f17427s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4237h0(C4245l0 c4245l0, AbstractC5511f abstractC5511f, CredentialRequest credentialRequest) {
        super(abstractC5511f);
        this.f17427s = credentialRequest;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: d */
    public final /* synthetic */ InterfaceC5518m mo7423d(Status status) {
        return new C4233f0(status, null);
    }

    @Override // p198p3.AbstractC4247m0
    /* renamed from: r */
    protected final void mo17665r(Context context, C4257r0 c4257r0) throws RemoteException {
        c4257r0.m17672J0(new BinderC4235g0(this), this.f17427s);
    }
}
