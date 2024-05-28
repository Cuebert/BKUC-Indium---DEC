package p296x3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzl;
import p004a3.C0028a;

/* renamed from: x3.g */
/* loaded from: classes.dex */
public final class C5530g implements Parcelable.Creator<zzl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzl createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
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
                default:
                    C0028a.m195z(parcel, m187r);
                    break;
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zzl(str, str2, str3, str4, str5, str6, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzl[] newArray(int i10) {
        return new zzl[i10];
    }
}
