package p283w3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmh;
import p004a3.C0028a;

/* renamed from: w3.ib */
/* loaded from: classes.dex */
public final class C5234ib implements Parcelable.Creator<zzmh> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzmh createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            switch (C0028a.m181l(m187r)) {
                case 1:
                    str = C0028a.m175f(parcel, m187r);
                    break;
                case 2:
                    str2 = C0028a.m175f(parcel, m187r);
                    break;
                case 3:
                    str3 = C0028a.m175f(parcel, m187r);
                    break;
                case 4:
                    str4 = C0028a.m175f(parcel, m187r);
                    break;
                case 5:
                    str5 = C0028a.m175f(parcel, m187r);
                    break;
                case 6:
                    str6 = C0028a.m175f(parcel, m187r);
                    break;
                case 7:
                    str7 = C0028a.m175f(parcel, m187r);
                    break;
                case 8:
                    str8 = C0028a.m175f(parcel, m187r);
                    break;
                case 9:
                    str9 = C0028a.m175f(parcel, m187r);
                    break;
                case 10:
                    str10 = C0028a.m175f(parcel, m187r);
                    break;
                case 11:
                    str11 = C0028a.m175f(parcel, m187r);
                    break;
                case 12:
                    str12 = C0028a.m175f(parcel, m187r);
                    break;
                case 13:
                    str13 = C0028a.m175f(parcel, m187r);
                    break;
                case 14:
                    str14 = C0028a.m175f(parcel, m187r);
                    break;
                default:
                    C0028a.m195z(parcel, m187r);
                    break;
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zzmh(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzmh[] newArray(int i10) {
        return new zzmh[i10];
    }
}
