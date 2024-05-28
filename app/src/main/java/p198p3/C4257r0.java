package p198p3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.internal.p330authapi.zbp;
import com.google.android.gms.internal.p330authapi.zbu;

/* renamed from: p3.r0 */
/* loaded from: classes.dex */
public final class C4257r0 extends C4222a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4257r0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    /* renamed from: J0 */
    public final void m17672J0(InterfaceC4255q0 interfaceC4255q0, CredentialRequest credentialRequest) throws RemoteException {
        Parcel m17650i = m17650i();
        C4229d0.m17659d(m17650i, interfaceC4255q0);
        C4229d0.m17658c(m17650i, credentialRequest);
        m17651l(1, m17650i);
    }

    /* renamed from: K0 */
    public final void m17673K0(InterfaceC4255q0 interfaceC4255q0, zbu zbuVar) throws RemoteException {
        Parcel m17650i = m17650i();
        C4229d0.m17659d(m17650i, interfaceC4255q0);
        C4229d0.m17658c(m17650i, zbuVar);
        m17651l(2, m17650i);
    }

    /* renamed from: n */
    public final void m17674n(InterfaceC4255q0 interfaceC4255q0, zbp zbpVar) throws RemoteException {
        Parcel m17650i = m17650i();
        C4229d0.m17659d(m17650i, interfaceC4255q0);
        C4229d0.m17658c(m17650i, zbpVar);
        m17651l(3, m17650i);
    }
}
