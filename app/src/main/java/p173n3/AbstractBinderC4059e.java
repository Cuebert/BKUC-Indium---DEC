package p173n3;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: n3.e */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4059e extends BinderC4056b implements InterfaceC4058d {
    /* renamed from: i */
    public static InterfaceC4058d m16860i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof InterfaceC4058d ? (InterfaceC4058d) queryLocalInterface : new C4060f(iBinder);
    }
}
