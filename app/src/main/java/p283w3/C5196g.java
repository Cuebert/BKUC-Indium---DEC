package p283w3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_barcode.zzad;
import p110i3.InterfaceC3516a;

/* renamed from: w3.g */
/* loaded from: classes.dex */
public final class C5196g extends C5114a implements InterfaceC5222i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5196g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
    }

    @Override // p283w3.InterfaceC5222i
    /* renamed from: p */
    public final C5183f mo19824p(InterfaceC3516a interfaceC3516a, zzad zzadVar) throws RemoteException {
        C5183f c5183f;
        Parcel m19747i = m19747i();
        C5116a1.m19752b(m19747i, interfaceC3516a);
        C5116a1.m19751a(m19747i, zzadVar);
        Parcel m19748l = m19748l(1, m19747i);
        IBinder readStrongBinder = m19748l.readStrongBinder();
        if (readStrongBinder == null) {
            c5183f = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            if (queryLocalInterface instanceof C5183f) {
                c5183f = (C5183f) queryLocalInterface;
            } else {
                c5183f = new C5183f(readStrongBinder);
            }
        }
        m19748l.recycle();
        return c5183f;
    }
}
