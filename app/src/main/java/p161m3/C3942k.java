package p161m3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import p004a3.C0028a;

/* renamed from: m3.k */
/* loaded from: classes.dex */
public final class C3942k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            int m181l = C0028a.m181l(m187r);
            if (m181l == 2) {
                str = C0028a.m175f(parcel, m187r);
            } else if (m181l == 3) {
                str2 = C0028a.m175f(parcel, m187r);
            } else if (m181l != 4) {
                C0028a.m195z(parcel, m187r);
            } else {
                str3 = C0028a.m175f(parcel, m187r);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new PublicKeyCredentialRpEntity(str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PublicKeyCredentialRpEntity[i10];
    }
}
