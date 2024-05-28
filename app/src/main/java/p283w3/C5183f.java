package p283w3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;
import p110i3.InterfaceC3516a;

/* renamed from: w3.f */
/* loaded from: classes.dex */
public final class C5183f extends C5114a {
    public C5183f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    /* renamed from: J0 */
    public final zzq[] m19802J0(InterfaceC3516a interfaceC3516a, zzaj zzajVar) throws RemoteException {
        Parcel m19747i = m19747i();
        C5116a1.m19752b(m19747i, interfaceC3516a);
        C5116a1.m19751a(m19747i, zzajVar);
        Parcel m19748l = m19748l(1, m19747i);
        zzq[] zzqVarArr = (zzq[]) m19748l.createTypedArray(zzq.CREATOR);
        m19748l.recycle();
        return zzqVarArr;
    }

    /* renamed from: K0 */
    public final zzq[] m19803K0(InterfaceC3516a interfaceC3516a, zzaj zzajVar) throws RemoteException {
        Parcel m19747i = m19747i();
        C5116a1.m19752b(m19747i, interfaceC3516a);
        C5116a1.m19751a(m19747i, zzajVar);
        Parcel m19748l = m19748l(2, m19747i);
        zzq[] zzqVarArr = (zzq[]) m19748l.createTypedArray(zzq.CREATOR);
        m19748l.recycle();
        return zzqVarArr;
    }

    /* renamed from: c */
    public final void m19804c() throws RemoteException {
        m19749n(3, m19747i());
    }
}
