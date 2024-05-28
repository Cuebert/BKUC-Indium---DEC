package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import p004a3.C0028a;

/* renamed from: com.google.android.gms.common.internal.r */
/* loaded from: classes.dex */
public final class C1404r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        Bundle bundle = null;
        Feature[] featureArr = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int i10 = 0;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            int m181l = C0028a.m181l(m187r);
            if (m181l == 1) {
                bundle = C0028a.m170a(parcel, m187r);
            } else if (m181l == 2) {
                featureArr = (Feature[]) C0028a.m178i(parcel, m187r, Feature.CREATOR);
            } else if (m181l == 3) {
                i10 = C0028a.m189t(parcel, m187r);
            } else if (m181l != 4) {
                C0028a.m195z(parcel, m187r);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) C0028a.m174e(parcel, m187r, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zzk(bundle, featureArr, i10, connectionTelemetryConfiguration);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzk[i10];
    }
}
