package p283w3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmr;
import p004a3.C0028a;

/* renamed from: w3.eb */
/* loaded from: classes.dex */
public final class C5182eb implements Parcelable.Creator<zzmr> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzmr createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        int i10 = 0;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            if (C0028a.m181l(m187r) != 1) {
                C0028a.m195z(parcel, m187r);
            } else {
                i10 = C0028a.m189t(parcel, m187r);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zzmr(i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzmr[] newArray(int i10) {
        return new zzmr[i10];
    }
}
