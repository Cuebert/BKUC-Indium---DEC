package p321z2;

import android.os.IBinder;
import android.os.IInterface;
import p235s3.BinderC4519b;

/* renamed from: z2.h0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5981h0 extends BinderC4519b implements InterfaceC5983i0 {
    /* renamed from: l */
    public static InterfaceC5983i0 m21273l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof InterfaceC5983i0 ? (InterfaceC5983i0) queryLocalInterface : new C5979g0(iBinder);
    }
}
