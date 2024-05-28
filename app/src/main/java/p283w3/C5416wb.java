package p283w3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzf;
import p004a3.C0028a;

/* renamed from: w3.wb */
/* loaded from: classes.dex */
public final class C5416wb implements Parcelable.Creator<zzf> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzf createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        String str = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            switch (C0028a.m181l(m187r)) {
                case 2:
                    i10 = C0028a.m189t(parcel, m187r);
                    break;
                case 3:
                    i11 = C0028a.m189t(parcel, m187r);
                    break;
                case 4:
                    i12 = C0028a.m189t(parcel, m187r);
                    break;
                case 5:
                    i13 = C0028a.m189t(parcel, m187r);
                    break;
                case 6:
                    i14 = C0028a.m189t(parcel, m187r);
                    break;
                case 7:
                    i15 = C0028a.m189t(parcel, m187r);
                    break;
                case 8:
                    z10 = C0028a.m182m(parcel, m187r);
                    break;
                case 9:
                    str = C0028a.m175f(parcel, m187r);
                    break;
                default:
                    C0028a.m195z(parcel, m187r);
                    break;
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zzf(i10, i11, i12, i13, i14, i15, z10, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzf[] newArray(int i10) {
        return new zzf[i10];
    }
}
