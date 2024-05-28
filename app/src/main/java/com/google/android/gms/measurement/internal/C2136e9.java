package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p004a3.C0028a;
import p004a3.C0029b;

/* renamed from: com.google.android.gms.measurement.internal.e9 */
/* loaded from: classes.dex */
public final class C2136e9 implements Parcelable.Creator<zzkv> {
    /* renamed from: a */
    public static void m9856a(zzkv zzkvVar, Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, zzkvVar.f8842n);
        C0029b.m215s(parcel, 2, zzkvVar.f8843o, false);
        C0029b.m211o(parcel, 3, zzkvVar.f8844p);
        C0029b.m212p(parcel, 4, zzkvVar.f8845q, false);
        C0029b.m206j(parcel, 5, null, false);
        C0029b.m215s(parcel, 6, zzkvVar.f8846r, false);
        C0029b.m215s(parcel, 7, zzkvVar.f8847s, false);
        C0029b.m205i(parcel, 8, zzkvVar.f8848t, false);
        C0029b.m198b(parcel, m197a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzkv createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        String str = null;
        Long l10 = null;
        Float f10 = null;
        String str2 = null;
        String str3 = null;
        Double d10 = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            switch (C0028a.m181l(m187r)) {
                case 1:
                    i10 = C0028a.m189t(parcel, m187r);
                    break;
                case 2:
                    str = C0028a.m175f(parcel, m187r);
                    break;
                case 3:
                    j10 = C0028a.m191v(parcel, m187r);
                    break;
                case 4:
                    l10 = C0028a.m192w(parcel, m187r);
                    break;
                case 5:
                    f10 = C0028a.m186q(parcel, m187r);
                    break;
                case 6:
                    str2 = C0028a.m175f(parcel, m187r);
                    break;
                case 7:
                    str3 = C0028a.m175f(parcel, m187r);
                    break;
                case 8:
                    d10 = C0028a.m185p(parcel, m187r);
                    break;
                default:
                    C0028a.m195z(parcel, m187r);
                    break;
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zzkv(i10, str, j10, l10, f10, str2, str3, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzkv[] newArray(int i10) {
        return new zzkv[i10];
    }
}
