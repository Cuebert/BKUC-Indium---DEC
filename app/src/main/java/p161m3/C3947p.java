package p161m3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.zzf;
import p004a3.C0028a;

/* renamed from: m3.p */
/* loaded from: classes.dex */
public final class C3947p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            int m181l = C0028a.m181l(m187r);
            if (m181l == 1) {
                bArr = C0028a.m171b(parcel, m187r);
            } else if (m181l != 2) {
                C0028a.m195z(parcel, m187r);
            } else {
                bArr2 = C0028a.m171b(parcel, m187r);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zzf(bArr, bArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzf[i10];
    }
}
