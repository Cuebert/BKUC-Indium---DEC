package p296x3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zze;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzj;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzl;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzm;
import p004a3.C0028a;

/* renamed from: x3.t */
/* loaded from: classes.dex */
public final class C5543t implements Parcelable.Creator<zzh> {
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
                case 1:
                    zzlVar = (zzl) C0028a.m174e(parcel, m187r, zzl.CREATOR);
                    break;
                case 2:
                    str = C0028a.m175f(parcel, m187r);
                    break;
                case 3:
                    str2 = C0028a.m175f(parcel, m187r);
                    break;
                case 4:
                    zzmVarArr = (zzm[]) C0028a.m178i(parcel, m187r, zzm.CREATOR);
                    break;
                case 5:
                    zzjVarArr = (zzj[]) C0028a.m178i(parcel, m187r, zzj.CREATOR);
                    break;
                case 6:
                    strArr = C0028a.m176g(parcel, m187r);
                    break;
                case 7:
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
