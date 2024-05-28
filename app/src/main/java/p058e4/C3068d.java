package p058e4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.signin.internal.zag;
import java.util.ArrayList;
import p004a3.C0028a;

/* renamed from: e4.d */
/* loaded from: classes.dex */
public final class C3068d implements Parcelable.Creator<zag> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zag createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            int m181l = C0028a.m181l(m187r);
            if (m181l == 1) {
                arrayList = C0028a.m177h(parcel, m187r);
            } else if (m181l != 2) {
                C0028a.m195z(parcel, m187r);
            } else {
                str = C0028a.m175f(parcel, m187r);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zag(arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zag[] newArray(int i10) {
        return new zag[i10];
    }
}
