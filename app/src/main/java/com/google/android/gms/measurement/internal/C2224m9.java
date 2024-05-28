package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import p004a3.C0028a;

/* renamed from: com.google.android.gms.measurement.internal.m9 */
/* loaded from: classes.dex */
public final class C2224m9 implements Parcelable.Creator<zzp> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzp createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        String str9 = BuildConfig.FLAVOR;
        long j15 = -2147483648L;
        boolean z10 = true;
        boolean z11 = false;
        int i10 = 0;
        boolean z12 = true;
        boolean z13 = false;
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
                    str3 = C0028a.m175f(parcel, m187r);
                    break;
                case 5:
                    str4 = C0028a.m175f(parcel, m187r);
                    break;
                case 6:
                    j10 = C0028a.m191v(parcel, m187r);
                    break;
                case 7:
                    j11 = C0028a.m191v(parcel, m187r);
                    break;
                case 8:
                    str5 = C0028a.m175f(parcel, m187r);
                    break;
                case 9:
                    z10 = C0028a.m182m(parcel, m187r);
                    break;
                case 10:
                    z11 = C0028a.m182m(parcel, m187r);
                    break;
                case 11:
                    j15 = C0028a.m191v(parcel, m187r);
                    break;
                case 12:
                    str6 = C0028a.m175f(parcel, m187r);
                    break;
                case 13:
                    j12 = C0028a.m191v(parcel, m187r);
                    break;
                case 14:
                    j13 = C0028a.m191v(parcel, m187r);
                    break;
                case 15:
                    i10 = C0028a.m189t(parcel, m187r);
                    break;
                case 16:
                    z12 = C0028a.m182m(parcel, m187r);
                    break;
                case 17:
                case 20:
                default:
                    C0028a.m195z(parcel, m187r);
                    break;
                case 18:
                    z13 = C0028a.m182m(parcel, m187r);
                    break;
                case 19:
                    str7 = C0028a.m175f(parcel, m187r);
                    break;
                case 21:
                    bool = C0028a.m183n(parcel, m187r);
                    break;
                case 22:
                    j14 = C0028a.m191v(parcel, m187r);
                    break;
                case 23:
                    arrayList = C0028a.m177h(parcel, m187r);
                    break;
                case 24:
                    str8 = C0028a.m175f(parcel, m187r);
                    break;
                case 25:
                    str9 = C0028a.m175f(parcel, m187r);
                    break;
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zzp(str, str2, str3, str4, j10, j11, str5, z10, z11, j15, str6, j12, j13, i10, z12, z13, str7, bool, j14, arrayList, str8, str9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzp[] newArray(int i10) {
        return new zzp[i10];
    }
}
