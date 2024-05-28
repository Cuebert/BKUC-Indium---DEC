package p283w3;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: w3.nb */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5299nb extends BinderC5443z implements InterfaceC5312ob {
    /* renamed from: i */
    public static InterfaceC5312ob m19873i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        if (queryLocalInterface instanceof InterfaceC5312ob) {
            return (InterfaceC5312ob) queryLocalInterface;
        }
        return new C5286mb(iBinder);
    }
}
