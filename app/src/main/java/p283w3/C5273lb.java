package p283w3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzni;
import java.util.ArrayList;
import java.util.List;
import p110i3.InterfaceC3516a;

/* renamed from: w3.lb */
/* loaded from: classes.dex */
public final class C5273lb extends C5114a {
    public C5273lb(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    /* renamed from: J0 */
    public final List<zzmp> m19862J0(InterfaceC3516a interfaceC3516a, zzni zzniVar) throws RemoteException {
        Parcel m19747i = m19747i();
        C5116a1.m19752b(m19747i, interfaceC3516a);
        C5116a1.m19751a(m19747i, zzniVar);
        Parcel m19748l = m19748l(3, m19747i);
        ArrayList createTypedArrayList = m19748l.createTypedArrayList(zzmp.CREATOR);
        m19748l.recycle();
        return createTypedArrayList;
    }

    /* renamed from: K0 */
    public final void m19863K0() throws RemoteException {
        m19749n(1, m19747i());
    }

    /* renamed from: L0 */
    public final void m19864L0() throws RemoteException {
        m19749n(2, m19747i());
    }
}
