package p161m3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.zzq;
import com.google.android.gms.fido.fido2.api.common.zzs;
import java.util.ArrayList;
import p004a3.C0028a;

/* renamed from: m3.r */
/* loaded from: classes.dex */
public final class C3949r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            if (C0028a.m181l(m187r) != 1) {
                C0028a.m195z(parcel, m187r);
            } else {
                arrayList = C0028a.m179j(parcel, m187r, zzq.CREATOR);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zzs(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzs[i10];
    }
}
