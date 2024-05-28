package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import p004a3.C0028a;

/* renamed from: com.google.android.gms.common.api.b */
/* loaded from: classes.dex */
public final class C1344b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        ConnectionResult connectionResult = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            int m181l = C0028a.m181l(m187r);
            if (m181l == 1) {
                i11 = C0028a.m189t(parcel, m187r);
            } else if (m181l == 2) {
                str = C0028a.m175f(parcel, m187r);
            } else if (m181l == 3) {
                pendingIntent = (PendingIntent) C0028a.m174e(parcel, m187r, PendingIntent.CREATOR);
            } else if (m181l == 4) {
                connectionResult = (ConnectionResult) C0028a.m174e(parcel, m187r, ConnectionResult.CREATOR);
            } else if (m181l != 1000) {
                C0028a.m195z(parcel, m187r);
            } else {
                i10 = C0028a.m189t(parcel, m187r);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new Status(i10, i11, str, pendingIntent, connectionResult);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
