package p283w3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmg;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzml;
import p004a3.C0028a;

/* renamed from: w3.hb */
/* loaded from: classes.dex */
public final class C5221hb implements Parcelable.Creator<zzmg> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzmg createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        zzmk zzmkVar = null;
        String str = null;
        String str2 = null;
        zzml[] zzmlVarArr = null;
        zzmi[] zzmiVarArr = null;
        String[] strArr = null;
        zzmd[] zzmdVarArr = null;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            switch (C0028a.m181l(m187r)) {
                case 1:
                    zzmkVar = (zzmk) C0028a.m174e(parcel, m187r, zzmk.CREATOR);
                    break;
                case 2:
                    str = C0028a.m175f(parcel, m187r);
                    break;
                case 3:
                    str2 = C0028a.m175f(parcel, m187r);
                    break;
                case 4:
                    zzmlVarArr = (zzml[]) C0028a.m178i(parcel, m187r, zzml.CREATOR);
                    break;
                case 5:
                    zzmiVarArr = (zzmi[]) C0028a.m178i(parcel, m187r, zzmi.CREATOR);
                    break;
                case 6:
                    strArr = C0028a.m176g(parcel, m187r);
                    break;
                case 7:
                    zzmdVarArr = (zzmd[]) C0028a.m178i(parcel, m187r, zzmd.CREATOR);
                    break;
                default:
                    C0028a.m195z(parcel, m187r);
                    break;
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zzmg(zzmkVar, str, str2, zzmlVarArr, zzmiVarArr, strArr, zzmdVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzmg[] newArray(int i10) {
        return new zzmg[i10];
    }
}
