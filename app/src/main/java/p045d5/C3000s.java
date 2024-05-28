package p045d5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: d5.s */
/* loaded from: classes.dex */
public final class C3000s extends C2975a implements InterfaceC3002u {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3000s(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p045d5.InterfaceC3002u
    /* renamed from: I */
    public final void mo13473I(Bundle bundle, InterfaceC3004w interfaceC3004w) throws RemoteException {
        Parcel m13431i = m13431i();
        C2996o.m13467c(m13431i, bundle);
        m13431i.writeStrongBinder(interfaceC3004w);
        m13432l(2, m13431i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p045d5.InterfaceC3002u
    /* renamed from: X */
    public final void mo13474X(Bundle bundle, InterfaceC3004w interfaceC3004w) throws RemoteException {
        Parcel m13431i = m13431i();
        C2996o.m13467c(m13431i, bundle);
        m13431i.writeStrongBinder(interfaceC3004w);
        m13432l(3, m13431i);
    }
}
