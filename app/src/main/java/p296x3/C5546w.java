package p296x3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzk;
import p004a3.C0028a;

/* renamed from: x3.w */
/* loaded from: classes.dex */
public final class C5546w implements Parcelable.Creator<zzk> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzk createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        double d10 = 0.0d;
        double d11 = 0.0d;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            int m181l = C0028a.m181l(m187r);
            if (m181l == 1) {
                d10 = C0028a.m184o(parcel, m187r);
            } else if (m181l != 2) {
                C0028a.m195z(parcel, m187r);
            } else {
                d11 = C0028a.m184o(parcel, m187r);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zzk(d10, d11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzk[] newArray(int i10) {
        return new zzk[i10];
    }
}
