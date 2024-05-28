package p246t3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;

/* renamed from: t3.c3 */
/* loaded from: classes.dex */
public final class C4637c3 extends C4623a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4637c3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public final void m18745n(InterfaceC4632b3 interfaceC4632b3, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) throws RemoteException {
        Parcel m18714i = m18714i();
        int i10 = C4625a1.f18419b;
        m18714i.writeStrongBinder(interfaceC4632b3);
        C4625a1.m18726c(m18714i, publicKeyCredentialCreationOptions);
        m18715l(1, m18714i);
    }
}
