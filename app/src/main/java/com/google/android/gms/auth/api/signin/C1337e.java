package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p004a3.C0028a;

/* renamed from: com.google.android.gms.auth.api.signin.e */
/* loaded from: classes.dex */
public final class C1337e implements Parcelable.Creator<GoogleSignInOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInOptions createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            switch (C0028a.m181l(m187r)) {
                case 1:
                    i10 = C0028a.m189t(parcel, m187r);
                    break;
                case 2:
                    arrayList = C0028a.m179j(parcel, m187r, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) C0028a.m174e(parcel, m187r, Account.CREATOR);
                    break;
                case 4:
                    z10 = C0028a.m182m(parcel, m187r);
                    break;
                case 5:
                    z11 = C0028a.m182m(parcel, m187r);
                    break;
                case 6:
                    z12 = C0028a.m182m(parcel, m187r);
                    break;
                case 7:
                    str = C0028a.m175f(parcel, m187r);
                    break;
                case 8:
                    str2 = C0028a.m175f(parcel, m187r);
                    break;
                case 9:
                    arrayList2 = C0028a.m179j(parcel, m187r, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    str3 = C0028a.m175f(parcel, m187r);
                    break;
                default:
                    C0028a.m195z(parcel, m187r);
                    break;
            }
        }
        C0028a.m180k(parcel, m167A);
        return new GoogleSignInOptions(i10, (ArrayList<Scope>) arrayList, account, z10, z11, z12, str, str2, (ArrayList<GoogleSignInOptionsExtensionParcelable>) arrayList2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions[] newArray(int i10) {
        return new GoogleSignInOptions[i10];
    }
}
