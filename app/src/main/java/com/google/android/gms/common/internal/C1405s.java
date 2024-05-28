package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import p004a3.C0028a;
import p004a3.C0029b;

/* renamed from: com.google.android.gms.common.internal.s */
/* loaded from: classes.dex */
public final class C1405s implements Parcelable.Creator {
    /* renamed from: a */
    public static void m7708a(GetServiceRequest getServiceRequest, Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, getServiceRequest.f6281n);
        C0029b.m208l(parcel, 2, getServiceRequest.f6282o);
        C0029b.m208l(parcel, 3, getServiceRequest.f6283p);
        C0029b.m215s(parcel, 4, getServiceRequest.f6284q, false);
        C0029b.m207k(parcel, 5, getServiceRequest.f6285r, false);
        C0029b.m218v(parcel, 6, getServiceRequest.f6286s, i10, false);
        C0029b.m201e(parcel, 7, getServiceRequest.f6287t, false);
        C0029b.m213q(parcel, 8, getServiceRequest.f6288u, i10, false);
        C0029b.m218v(parcel, 10, getServiceRequest.f6289v, i10, false);
        C0029b.m218v(parcel, 11, getServiceRequest.f6290w, i10, false);
        C0029b.m199c(parcel, 12, getServiceRequest.f6291x);
        C0029b.m208l(parcel, 13, getServiceRequest.f6292y);
        C0029b.m199c(parcel, 14, getServiceRequest.f6293z);
        C0029b.m215s(parcel, 15, getServiceRequest.m7620x(), false);
        C0029b.m198b(parcel, m197a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        Scope[] scopeArr = GetServiceRequest.f6278B;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f6279C;
        Feature[] featureArr2 = featureArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            switch (C0028a.m181l(m187r)) {
                case 1:
                    i10 = C0028a.m189t(parcel, m187r);
                    break;
                case 2:
                    i11 = C0028a.m189t(parcel, m187r);
                    break;
                case 3:
                    i12 = C0028a.m189t(parcel, m187r);
                    break;
                case 4:
                    str = C0028a.m175f(parcel, m187r);
                    break;
                case 5:
                    iBinder = C0028a.m188s(parcel, m187r);
                    break;
                case 6:
                    scopeArr = (Scope[]) C0028a.m178i(parcel, m187r, Scope.CREATOR);
                    break;
                case 7:
                    bundle = C0028a.m170a(parcel, m187r);
                    break;
                case 8:
                    account = (Account) C0028a.m174e(parcel, m187r, Account.CREATOR);
                    break;
                case 9:
                default:
                    C0028a.m195z(parcel, m187r);
                    break;
                case 10:
                    featureArr = (Feature[]) C0028a.m178i(parcel, m187r, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) C0028a.m178i(parcel, m187r, Feature.CREATOR);
                    break;
                case 12:
                    z10 = C0028a.m182m(parcel, m187r);
                    break;
                case 13:
                    i13 = C0028a.m189t(parcel, m187r);
                    break;
                case 14:
                    z11 = C0028a.m182m(parcel, m187r);
                    break;
                case 15:
                    str2 = C0028a.m175f(parcel, m187r);
                    break;
            }
        }
        C0028a.m180k(parcel, m167A);
        return new GetServiceRequest(i10, i11, i12, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z10, i13, z11, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GetServiceRequest[i10];
    }
}
