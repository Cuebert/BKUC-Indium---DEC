package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.oaid.BuildConfig;
import p004a3.C0028a;

/* renamed from: com.google.android.gms.auth.api.signin.g */
/* loaded from: classes.dex */
public final class C1339g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        String str = BuildConfig.FLAVOR;
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = BuildConfig.FLAVOR;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            int m181l = C0028a.m181l(m187r);
            if (m181l == 4) {
                str = C0028a.m175f(parcel, m187r);
            } else if (m181l == 7) {
                googleSignInAccount = (GoogleSignInAccount) C0028a.m174e(parcel, m187r, GoogleSignInAccount.CREATOR);
            } else if (m181l != 8) {
                C0028a.m195z(parcel, m187r);
            } else {
                str2 = C0028a.m175f(parcel, m187r);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInAccount[i10];
    }
}
