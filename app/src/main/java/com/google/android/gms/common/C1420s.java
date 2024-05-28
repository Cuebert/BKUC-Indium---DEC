package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p004a3.C0028a;

/* renamed from: com.google.android.gms.common.s */
/* loaded from: classes.dex */
public final class C1420s implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            switch (C0028a.m181l(m187r)) {
                case 1:
                    str = C0028a.m175f(parcel, m187r);
                    break;
                case 2:
                    z10 = C0028a.m182m(parcel, m187r);
                    break;
                case 3:
                    z11 = C0028a.m182m(parcel, m187r);
                    break;
                case 4:
                    iBinder = C0028a.m188s(parcel, m187r);
                    break;
                case 5:
                    z12 = C0028a.m182m(parcel, m187r);
                    break;
                case 6:
                    z13 = C0028a.m182m(parcel, m187r);
                    break;
                default:
                    C0028a.m195z(parcel, m187r);
                    break;
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zzo(str, z10, z11, iBinder, z12, z13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzo[i10];
    }
}
