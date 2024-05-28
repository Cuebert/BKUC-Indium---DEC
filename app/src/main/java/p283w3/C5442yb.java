package p283w3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zze;
import com.google.android.gms.internal.mlkit_vision_barcode.zzh;
import com.google.android.gms.internal.mlkit_vision_barcode.zzj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzm;
import p004a3.C0028a;

/* renamed from: w3.yb */
/* loaded from: classes.dex */
public final class C5442yb implements Parcelable.Creator<zzh> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzh createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        zzl zzlVar = null;
        String str = null;
        String str2 = null;
        zzm[] zzmVarArr = null;
        zzj[] zzjVarArr = null;
        String[] strArr = null;
        zze[] zzeVarArr = null;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            switch (C0028a.m181l(m187r)) {
                case 2:
                    zzlVar = (zzl) C0028a.m174e(parcel, m187r, zzl.CREATOR);
                    break;
                case 3:
                    str = C0028a.m175f(parcel, m187r);
                    break;
                case 4:
                    str2 = C0028a.m175f(parcel, m187r);
                    break;
                case 5:
                    zzmVarArr = (zzm[]) C0028a.m178i(parcel, m187r, zzm.CREATOR);
                    break;
                case 6:
                    zzjVarArr = (zzj[]) C0028a.m178i(parcel, m187r, zzj.CREATOR);
                    break;
                case 7:
                    strArr = C0028a.m176g(parcel, m187r);
                    break;
                case 8:
                    zzeVarArr = (zze[]) C0028a.m178i(parcel, m187r, zze.CREATOR);
                    break;
                default:
                    C0028a.m195z(parcel, m187r);
                    break;
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zzh(zzlVar, str, str2, zzmVarArr, zzjVarArr, strArr, zzeVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzh[] newArray(int i10) {
        return new zzh[i10];
    }
}
