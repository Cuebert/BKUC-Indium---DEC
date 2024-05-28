package p258u2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p198p3.C4222a;
import p198p3.C4229d0;

/* renamed from: u2.s */
/* loaded from: classes.dex */
public final class C4837s extends C4222a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4837s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    /* renamed from: J0 */
    public final void m19028J0(InterfaceC4836r interfaceC4836r, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel m17650i = m17650i();
        C4229d0.m17659d(m17650i, interfaceC4836r);
        C4229d0.m17658c(m17650i, googleSignInOptions);
        m17651l(102, m17650i);
    }

    /* renamed from: n */
    public final void m19029n(InterfaceC4836r interfaceC4836r, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel m17650i = m17650i();
        C4229d0.m17659d(m17650i, interfaceC4836r);
        C4229d0.m17658c(m17650i, googleSignInOptions);
        m17651l(103, m17650i);
    }
}
