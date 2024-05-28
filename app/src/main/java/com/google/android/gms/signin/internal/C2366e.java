package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;
import p004a3.C0028a;

/* renamed from: com.google.android.gms.signin.internal.e */
/* loaded from: classes.dex */
public final class C2366e implements Parcelable.Creator<zak> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zak createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        ConnectionResult connectionResult = null;
        zav zavVar = null;
        int i10 = 0;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            int m181l = C0028a.m181l(m187r);
            if (m181l == 1) {
                i10 = C0028a.m189t(parcel, m187r);
            } else if (m181l == 2) {
                connectionResult = (ConnectionResult) C0028a.m174e(parcel, m187r, ConnectionResult.CREATOR);
            } else if (m181l != 3) {
                C0028a.m195z(parcel, m187r);
            } else {
                zavVar = (zav) C0028a.m174e(parcel, m187r, zav.CREATOR);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zak(i10, connectionResult, zavVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zak[] newArray(int i10) {
        return new zak[i10];
    }
}
