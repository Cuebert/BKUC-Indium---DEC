package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.zat;
import p004a3.C0028a;

/* renamed from: com.google.android.gms.signin.internal.d */
/* loaded from: classes.dex */
public final class C2365d implements Parcelable.Creator<zai> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zai createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        int i10 = 0;
        zat zatVar = null;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            int m181l = C0028a.m181l(m187r);
            if (m181l == 1) {
                i10 = C0028a.m189t(parcel, m187r);
            } else if (m181l != 2) {
                C0028a.m195z(parcel, m187r);
            } else {
                zatVar = (zat) C0028a.m174e(parcel, m187r, zat.CREATOR);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zai(i10, zatVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zai[] newArray(int i10) {
        return new zai[i10];
    }
}
