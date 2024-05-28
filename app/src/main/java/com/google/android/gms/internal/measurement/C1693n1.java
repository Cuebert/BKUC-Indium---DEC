package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p004a3.C0028a;

/* renamed from: com.google.android.gms.internal.measurement.n1 */
/* loaded from: classes.dex */
public final class C1693n1 implements Parcelable.Creator<zzcl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzcl createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            switch (C0028a.m181l(m187r)) {
                case 1:
                    j10 = C0028a.m191v(parcel, m187r);
                    break;
                case 2:
                    j11 = C0028a.m191v(parcel, m187r);
                    break;
                case 3:
                    z10 = C0028a.m182m(parcel, m187r);
                    break;
                case 4:
                    str = C0028a.m175f(parcel, m187r);
                    break;
                case 5:
                    str2 = C0028a.m175f(parcel, m187r);
                    break;
                case 6:
                    str3 = C0028a.m175f(parcel, m187r);
                    break;
                case 7:
                    bundle = C0028a.m170a(parcel, m187r);
                    break;
                case 8:
                    str4 = C0028a.m175f(parcel, m187r);
                    break;
                default:
                    C0028a.m195z(parcel, m187r);
                    break;
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zzcl(j10, j11, z10, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzcl[] newArray(int i10) {
        return new zzcl[i10];
    }
}
