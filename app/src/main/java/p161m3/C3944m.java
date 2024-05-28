package p161m3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import p004a3.C0028a;

/* renamed from: m3.m */
/* loaded from: classes.dex */
public final class C3944m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        boolean z10 = false;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            if (C0028a.m181l(m187r) != 1) {
                C0028a.m195z(parcel, m187r);
            } else {
                z10 = C0028a.m182m(parcel, m187r);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new UserVerificationMethodExtension(z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new UserVerificationMethodExtension[i10];
    }
}
