package p198p3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import p308y2.InterfaceC5608e;

/* renamed from: p3.k */
/* loaded from: classes.dex */
public final class C4242k extends C4222a {
    public C4242k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    /* renamed from: J0 */
    public final void m17667J0(InterfaceC4232f interfaceC4232f, GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, String str) throws RemoteException {
        Parcel m17650i = m17650i();
        C4229d0.m17659d(m17650i, interfaceC4232f);
        C4229d0.m17658c(m17650i, getPhoneNumberHintIntentRequest);
        m17650i.writeString(str);
        m17651l(4, m17650i);
    }

    /* renamed from: K0 */
    public final void m17668K0(InterfaceC4236h interfaceC4236h, GetSignInIntentRequest getSignInIntentRequest) throws RemoteException {
        Parcel m17650i = m17650i();
        C4229d0.m17659d(m17650i, interfaceC4236h);
        C4229d0.m17658c(m17650i, getSignInIntentRequest);
        m17651l(3, m17650i);
    }

    /* renamed from: L0 */
    public final void m17669L0(InterfaceC5608e interfaceC5608e, String str) throws RemoteException {
        Parcel m17650i = m17650i();
        C4229d0.m17659d(m17650i, interfaceC5608e);
        m17650i.writeString(str);
        m17651l(2, m17650i);
    }

    /* renamed from: n */
    public final void m17670n(InterfaceC4226c interfaceC4226c, BeginSignInRequest beginSignInRequest) throws RemoteException {
        Parcel m17650i = m17650i();
        C4229d0.m17659d(m17650i, interfaceC4226c);
        C4229d0.m17658c(m17650i, beginSignInRequest);
        m17651l(1, m17650i);
    }
}
