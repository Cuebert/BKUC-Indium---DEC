package p209q2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import p004a3.C0028a;

/* renamed from: q2.d */
/* loaded from: classes.dex */
public final class C4296d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            if (C0028a.m181l(m187r) != 1) {
                C0028a.m195z(parcel, m187r);
            } else {
                pendingIntent = (PendingIntent) C0028a.m174e(parcel, m187r, PendingIntent.CREATOR);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new BeginSignInResult(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new BeginSignInResult[i10];
    }
}
