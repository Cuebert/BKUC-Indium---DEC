package p283w3;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: w3.h */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5209h extends BinderC5443z implements InterfaceC5222i {
    /* renamed from: i */
    public static InterfaceC5222i m19838i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
        if (queryLocalInterface instanceof InterfaceC5222i) {
            return (InterfaceC5222i) queryLocalInterface;
        }
        return new C5196g(iBinder);
    }
}
