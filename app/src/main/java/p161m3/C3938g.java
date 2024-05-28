package p161m3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.zzag;
import p004a3.C0028a;

/* renamed from: m3.g */
/* loaded from: classes.dex */
public final class C3938g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        String str = null;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            if (C0028a.m181l(m187r) != 1) {
                C0028a.m195z(parcel, m187r);
            } else {
                str = C0028a.m175f(parcel, m187r);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zzag(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzag[i10];
    }
}
