package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p004a3.C0028a;
import p004a3.C0029b;

/* renamed from: com.google.android.gms.measurement.internal.r */
/* loaded from: classes.dex */
public final class C2269r implements Parcelable.Creator<zzat> {
    /* renamed from: a */
    public static void m10225a(zzat zzatVar, Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 2, zzatVar.f8838n, false);
        C0029b.m213q(parcel, 3, zzatVar.f8839o, i10, false);
        C0029b.m215s(parcel, 4, zzatVar.f8840p, false);
        C0029b.m211o(parcel, 5, zzatVar.f8841q);
        C0029b.m198b(parcel, m197a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzat createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        String str = null;
        zzar zzarVar = null;
        String str2 = null;
        long j10 = 0;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            int m181l = C0028a.m181l(m187r);
            if (m181l == 2) {
                str = C0028a.m175f(parcel, m187r);
            } else if (m181l == 3) {
                zzarVar = (zzar) C0028a.m174e(parcel, m187r, zzar.CREATOR);
            } else if (m181l == 4) {
                str2 = C0028a.m175f(parcel, m187r);
            } else if (m181l != 5) {
                C0028a.m195z(parcel, m187r);
            } else {
                j10 = C0028a.m191v(parcel, m187r);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zzat(str, zzarVar, str2, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzat[] newArray(int i10) {
        return new zzat[i10];
    }
}
