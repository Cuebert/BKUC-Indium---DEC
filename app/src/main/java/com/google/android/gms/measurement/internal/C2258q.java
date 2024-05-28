package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p004a3.C0028a;

/* renamed from: com.google.android.gms.measurement.internal.q */
/* loaded from: classes.dex */
public final class C2258q implements Parcelable.Creator<zzar> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzar createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            if (C0028a.m181l(m187r) != 2) {
                C0028a.m195z(parcel, m187r);
            } else {
                bundle = C0028a.m170a(parcel, m187r);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zzar(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzar[] newArray(int i10) {
        return new zzar[i10];
    }
}
