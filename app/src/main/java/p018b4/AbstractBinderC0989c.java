package p018b4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.BinderC1724p0;
import com.google.android.gms.internal.measurement.C1740q0;
import com.google.android.gms.measurement.internal.zzab;
import com.google.android.gms.measurement.internal.zzat;
import com.google.android.gms.measurement.internal.zzkv;
import com.google.android.gms.measurement.internal.zzp;
import java.util.List;

/* renamed from: b4.c */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0989c extends BinderC1724p0 implements InterfaceC0990d {
    public AbstractBinderC0989c() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.BinderC1724p0
    /* renamed from: i */
    protected final boolean mo6205i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                mo6208H0((zzat) C1740q0.m8704a(parcel, zzat.CREATOR), (zzp) C1740q0.m8704a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                mo6215g0((zzkv) C1740q0.m8704a(parcel, zzkv.CREATOR), (zzp) C1740q0.m8704a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                mo6218q0((zzp) C1740q0.m8704a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                mo6216k0((zzat) C1740q0.m8704a(parcel, zzat.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                mo6223y0((zzp) C1740q0.m8704a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                List<zzkv> mo6213a0 = mo6213a0((zzp) C1740q0.m8704a(parcel, zzp.CREATOR), C1740q0.m8709f(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(mo6213a0);
                return true;
            case 9:
                byte[] mo6214f0 = mo6214f0((zzat) C1740q0.m8704a(parcel, zzat.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(mo6214f0);
                return true;
            case 10:
                mo6219r(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String mo6210N = mo6210N((zzp) C1740q0.m8704a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(mo6210N);
                return true;
            case 12:
                mo6206A((zzab) C1740q0.m8704a(parcel, zzab.CREATOR), (zzp) C1740q0.m8704a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                mo6211W((zzab) C1740q0.m8704a(parcel, zzab.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                List<zzkv> mo6222x = mo6222x(parcel.readString(), parcel.readString(), C1740q0.m8709f(parcel), (zzp) C1740q0.m8704a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(mo6222x);
                return true;
            case 15:
                List<zzkv> mo6207E = mo6207E(parcel.readString(), parcel.readString(), parcel.readString(), C1740q0.m8709f(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(mo6207E);
                return true;
            case 16:
                List<zzab> mo6220r0 = mo6220r0(parcel.readString(), parcel.readString(), (zzp) C1740q0.m8704a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(mo6220r0);
                return true;
            case 17:
                List<zzab> mo6212Z = mo6212Z(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(mo6212Z);
                return true;
            case 18:
                mo6209J((zzp) C1740q0.m8704a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                mo6221v((Bundle) C1740q0.m8704a(parcel, Bundle.CREATOR), (zzp) C1740q0.m8704a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                mo6217q((zzp) C1740q0.m8704a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
