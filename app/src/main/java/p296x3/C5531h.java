package p296x3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzm;
import p004a3.C0028a;

/* renamed from: x3.h */
/* loaded from: classes.dex */
public final class C5531h implements Parcelable.Creator<zzm> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzm createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        int i10 = 0;
        String str = null;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            int m181l = C0028a.m181l(m187r);
            if (m181l == 1) {
                i10 = C0028a.m189t(parcel, m187r);
            } else if (m181l != 2) {
                C0028a.m195z(parcel, m187r);
            } else {
                str = C0028a.m175f(parcel, m187r);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zzm(i10, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzm[] newArray(int i10) {
        return new zzm[i10];
    }
}
