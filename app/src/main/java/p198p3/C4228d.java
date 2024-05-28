package p198p3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;

/* renamed from: p3.d */
/* loaded from: classes.dex */
public final class C4228d extends C4222a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4228d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    /* renamed from: n */
    public final void m17655n(InterfaceC4240j interfaceC4240j, SavePasswordRequest savePasswordRequest) throws RemoteException {
        Parcel m17650i = m17650i();
        C4229d0.m17659d(m17650i, interfaceC4240j);
        C4229d0.m17658c(m17650i, savePasswordRequest);
        m17651l(2, m17650i);
    }
}
