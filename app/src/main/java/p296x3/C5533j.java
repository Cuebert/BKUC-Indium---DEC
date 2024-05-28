package p296x3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzo;
import p004a3.C0028a;

/* renamed from: x3.j */
/* loaded from: classes.dex */
public final class C5533j implements Parcelable.Creator<zzo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzo createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            int m181l = C0028a.m181l(m187r);
            if (m181l == 1) {
                str = C0028a.m175f(parcel, m187r);
            } else if (m181l != 2) {
                C0028a.m195z(parcel, m187r);
            } else {
                str2 = C0028a.m175f(parcel, m187r);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zzo(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzo[] newArray(int i10) {
        return new zzo[i10];
    }
}
