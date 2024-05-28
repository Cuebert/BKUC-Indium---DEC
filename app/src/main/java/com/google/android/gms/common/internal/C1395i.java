package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import p004a3.C0028a;

/* renamed from: com.google.android.gms.common.internal.i */
/* loaded from: classes.dex */
public final class C1395i implements Parcelable.Creator<zav> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zav createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            int m181l = C0028a.m181l(m187r);
            if (m181l == 1) {
                i10 = C0028a.m189t(parcel, m187r);
            } else if (m181l == 2) {
                iBinder = C0028a.m188s(parcel, m187r);
            } else if (m181l == 3) {
                connectionResult = (ConnectionResult) C0028a.m174e(parcel, m187r, ConnectionResult.CREATOR);
            } else if (m181l == 4) {
                z10 = C0028a.m182m(parcel, m187r);
            } else if (m181l != 5) {
                C0028a.m195z(parcel, m187r);
            } else {
                z11 = C0028a.m182m(parcel, m187r);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zav(i10, iBinder, connectionResult, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zav[] newArray(int i10) {
        return new zav[i10];
    }
}
