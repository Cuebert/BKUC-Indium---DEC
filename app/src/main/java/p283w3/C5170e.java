package p283w3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzad;
import p004a3.C0028a;

/* renamed from: w3.e */
/* loaded from: classes.dex */
public final class C5170e implements Parcelable.Creator<zzad> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzad createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        int i10 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            int m181l = C0028a.m181l(m187r);
            if (m181l == 2) {
                i10 = C0028a.m189t(parcel, m187r);
            } else if (m181l != 3) {
                C0028a.m195z(parcel, m187r);
            } else {
                z10 = C0028a.m182m(parcel, m187r);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zzad(i10, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzad[] newArray(int i10) {
        return new zzad[i10];
    }
}
