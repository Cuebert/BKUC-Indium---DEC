package p283w3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zze;
import p004a3.C0028a;

/* renamed from: w3.a2 */
/* loaded from: classes.dex */
public final class C5117a2 implements Parcelable.Creator<zze> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zze createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        int i10 = 0;
        String[] strArr = null;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            int m181l = C0028a.m181l(m187r);
            if (m181l == 2) {
                i10 = C0028a.m189t(parcel, m187r);
            } else if (m181l != 3) {
                C0028a.m195z(parcel, m187r);
            } else {
                strArr = C0028a.m176g(parcel, m187r);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zze(i10, strArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zze[] newArray(int i10) {
        return new zze[i10];
    }
}
