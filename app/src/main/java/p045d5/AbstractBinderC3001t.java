package p045d5;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: d5.t */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3001t extends BinderC2995n implements InterfaceC3002u {
    /* renamed from: l */
    public static InterfaceC3002u m13475l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        return queryLocalInterface instanceof InterfaceC3002u ? (InterfaceC3002u) queryLocalInterface : new C3000s(iBinder);
    }
}
