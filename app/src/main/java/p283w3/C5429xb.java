package p283w3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzg;
import p004a3.C0028a;

/* renamed from: w3.xb */
/* loaded from: classes.dex */
public final class C5429xb implements Parcelable.Creator<zzg> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzg createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        zzf zzfVar = null;
        zzf zzfVar2 = null;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            switch (C0028a.m181l(m187r)) {
                case 2:
                    str = C0028a.m175f(parcel, m187r);
                    break;
                case 3:
                    str2 = C0028a.m175f(parcel, m187r);
                    break;
                case 4:
                    str3 = C0028a.m175f(parcel, m187r);
                    break;
                case 5:
                    str4 = C0028a.m175f(parcel, m187r);
                    break;
                case 6:
                    str5 = C0028a.m175f(parcel, m187r);
                    break;
                case 7:
                    zzfVar = (zzf) C0028a.m174e(parcel, m187r, zzf.CREATOR);
                    break;
                case 8:
                    zzfVar2 = (zzf) C0028a.m174e(parcel, m187r, zzf.CREATOR);
                    break;
                default:
                    C0028a.m195z(parcel, m187r);
                    break;
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zzg(str, str2, str3, str4, str5, zzfVar, zzfVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzg[] newArray(int i10) {
        return new zzg[i10];
    }
}
