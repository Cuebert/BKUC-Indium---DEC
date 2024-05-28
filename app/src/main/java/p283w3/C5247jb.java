package p283w3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmi;
import p004a3.C0028a;

/* renamed from: w3.jb */
/* loaded from: classes.dex */
public final class C5247jb implements Parcelable.Creator<zzmi> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzmi createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        int i10 = 0;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            int m181l = C0028a.m181l(m187r);
            if (m181l == 1) {
                i10 = C0028a.m189t(parcel, m187r);
            } else if (m181l == 2) {
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
        return new zzmi(i10, str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzmi[] newArray(int i10) {
        return new zzmi[i10];
    }
}
