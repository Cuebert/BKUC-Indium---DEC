package p296x3;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzak;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzq;
import java.util.List;
import p110i3.InterfaceC3516a;

/* renamed from: x3.b */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5525b extends BinderC5536m implements InterfaceC5526c {
    public AbstractBinderC5525b() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    @Override // p296x3.BinderC5536m
    /* renamed from: i */
    protected final boolean mo20294i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            mo12080a();
            parcel2.writeNoException();
        } else if (i10 == 2) {
            mo12081c();
            parcel2.writeNoException();
        } else {
            if (i10 != 3) {
                return false;
            }
            List<zzq> mo12082w = mo12082w(InterfaceC3516a.a.m15327l(parcel.readStrongBinder()), (zzak) C5537n.m20295a(parcel, zzak.CREATOR));
            parcel2.writeNoException();
            parcel2.writeTypedList(mo12082w);
        }
        return true;
    }
}
