package p282w2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import p004a3.C0028a;

/* renamed from: w2.i */
/* loaded from: classes.dex */
public final class C5111i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        long j10 = -1;
        int i10 = 0;
        String str = null;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            int m181l = C0028a.m181l(m187r);
            if (m181l == 1) {
                str = C0028a.m175f(parcel, m187r);
            } else if (m181l == 2) {
                i10 = C0028a.m189t(parcel, m187r);
            } else if (m181l != 3) {
                C0028a.m195z(parcel, m187r);
            } else {
                j10 = C0028a.m191v(parcel, m187r);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new Feature(str, i10, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Feature[i10];
    }
}
