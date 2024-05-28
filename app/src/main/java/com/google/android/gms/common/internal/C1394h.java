package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p004a3.C0028a;

/* renamed from: com.google.android.gms.common.internal.h */
/* loaded from: classes.dex */
public final class C1394h implements Parcelable.Creator<zat> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zat createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            int m181l = C0028a.m181l(m187r);
            if (m181l == 1) {
                i10 = C0028a.m189t(parcel, m187r);
            } else if (m181l == 2) {
                account = (Account) C0028a.m174e(parcel, m187r, Account.CREATOR);
            } else if (m181l == 3) {
                i11 = C0028a.m189t(parcel, m187r);
            } else if (m181l != 4) {
                C0028a.m195z(parcel, m187r);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C0028a.m174e(parcel, m187r, GoogleSignInAccount.CREATOR);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zat(i10, account, i11, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zat[] newArray(int i10) {
        return new zat[i10];
    }
}
