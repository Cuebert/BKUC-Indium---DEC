package p296x3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzs;
import p110i3.InterfaceC3516a;

/* renamed from: x3.e */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5528e extends BinderC5536m implements InterfaceC5529f {
    public AbstractBinderC5528e() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    public static InterfaceC5529f asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        if (queryLocalInterface instanceof InterfaceC5529f) {
            return (InterfaceC5529f) queryLocalInterface;
        }
        return new C5527d(iBinder);
    }

    @Override // p296x3.BinderC5536m
    /* renamed from: i */
    protected final boolean mo20294i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        InterfaceC5526c newBarcodeScanner = newBarcodeScanner(InterfaceC3516a.a.m15327l(parcel.readStrongBinder()), (zzs) C5537n.m20295a(parcel, zzs.CREATOR));
        parcel2.writeNoException();
        C5537n.m20296b(parcel2, newBarcodeScanner);
        return true;
    }
}
