package p198p3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.internal.p330authapi.zbu;
import p004a3.C0028a;

/* renamed from: p3.s0 */
/* loaded from: classes.dex */
public final class C4259s0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            if (C0028a.m181l(m187r) != 1) {
                C0028a.m195z(parcel, m187r);
            } else {
                credential = (Credential) C0028a.m174e(parcel, m187r, Credential.CREATOR);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zbu(credential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zbu[i10];
    }
}
