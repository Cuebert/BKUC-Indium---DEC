package p283w3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzni;
import p004a3.C0028a;

/* renamed from: w3.ub */
/* loaded from: classes.dex */
public final class C5390ub implements Parcelable.Creator<zzni> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzni createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        long j10 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            int m181l = C0028a.m181l(m187r);
            if (m181l == 1) {
                i10 = C0028a.m189t(parcel, m187r);
            } else if (m181l == 2) {
                i11 = C0028a.m189t(parcel, m187r);
            } else if (m181l == 3) {
                i12 = C0028a.m189t(parcel, m187r);
            } else if (m181l == 4) {
                i13 = C0028a.m189t(parcel, m187r);
            } else if (m181l != 5) {
                C0028a.m195z(parcel, m187r);
            } else {
                j10 = C0028a.m191v(parcel, m187r);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zzni(i10, i11, i12, i13, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzni[] newArray(int i10) {
        return new zzni[i10];
    }
}
