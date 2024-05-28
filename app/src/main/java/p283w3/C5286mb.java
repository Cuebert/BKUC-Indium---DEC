package p283w3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmr;
import p110i3.InterfaceC3516a;

/* renamed from: w3.mb */
/* loaded from: classes.dex */
public final class C5286mb extends C5114a implements InterfaceC5312ob {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5286mb(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    @Override // p283w3.InterfaceC5312ob
    /* renamed from: Y */
    public final C5273lb mo19871Y(InterfaceC3516a interfaceC3516a, zzmr zzmrVar) throws RemoteException {
        C5273lb c5273lb;
        Parcel m19747i = m19747i();
        C5116a1.m19752b(m19747i, interfaceC3516a);
        C5116a1.m19751a(m19747i, zzmrVar);
        Parcel m19748l = m19748l(1, m19747i);
        IBinder readStrongBinder = m19748l.readStrongBinder();
        if (readStrongBinder == null) {
            c5273lb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            if (queryLocalInterface instanceof C5273lb) {
                c5273lb = (C5273lb) queryLocalInterface;
            } else {
                c5273lb = new C5273lb(readStrongBinder);
            }
        }
        m19748l.recycle();
        return c5273lb;
    }
}
