package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p004a3.C0028a;

/* renamed from: com.google.android.gms.measurement.internal.c */
/* loaded from: classes.dex */
public final class C2104c implements Parcelable.Creator<zzab> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzab createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        String str = null;
        String str2 = null;
        zzkv zzkvVar = null;
        String str3 = null;
        zzat zzatVar = null;
        zzat zzatVar2 = null;
        zzat zzatVar3 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            switch (C0028a.m181l(m187r)) {
                case 2:
                    str = C0028a.m175f(parcel, m187r);
                    break;
                case 3:
                    str2 = C0028a.m175f(parcel, m187r);
                    break;
                case 4:
                    zzkvVar = (zzkv) C0028a.m174e(parcel, m187r, zzkv.CREATOR);
                    break;
                case 5:
                    j10 = C0028a.m191v(parcel, m187r);
                    break;
                case 6:
                    z10 = C0028a.m182m(parcel, m187r);
                    break;
                case 7:
                    str3 = C0028a.m175f(parcel, m187r);
                    break;
                case 8:
                    zzatVar = (zzat) C0028a.m174e(parcel, m187r, zzat.CREATOR);
                    break;
                case 9:
                    j11 = C0028a.m191v(parcel, m187r);
                    break;
                case 10:
                    zzatVar2 = (zzat) C0028a.m174e(parcel, m187r, zzat.CREATOR);
                    break;
                case 11:
                    j12 = C0028a.m191v(parcel, m187r);
                    break;
                case 12:
                    zzatVar3 = (zzat) C0028a.m174e(parcel, m187r, zzat.CREATOR);
                    break;
                default:
                    C0028a.m195z(parcel, m187r);
                    break;
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zzab(str, str2, zzkvVar, j10, z10, str3, zzatVar, j11, zzatVar2, j12, zzatVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzab[] newArray(int i10) {
        return new zzab[i10];
    }
}
