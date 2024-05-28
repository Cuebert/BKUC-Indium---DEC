package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p004a3.C0028a;

/* renamed from: com.google.android.gms.auth.api.signin.c */
/* loaded from: classes.dex */
public final class C1335c implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
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
                    str2 = C0028a.m175f(parcel, m187r);
                    break;
                case 4:
                    str3 = C0028a.m175f(parcel, m187r);
                    break;
                case 5:
                    str4 = C0028a.m175f(parcel, m187r);
                    break;
                case 6:
                    uri = (Uri) C0028a.m174e(parcel, m187r, Uri.CREATOR);
                    break;
                case 7:
                    str5 = C0028a.m175f(parcel, m187r);
                    break;
                case 8:
                    j10 = C0028a.m191v(parcel, m187r);
                    break;
                case 9:
                    str6 = C0028a.m175f(parcel, m187r);
                    break;
                case 10:
                    arrayList = C0028a.m179j(parcel, m187r, Scope.CREATOR);
                    break;
                case 11:
                    str7 = C0028a.m175f(parcel, m187r);
                    break;
                case 12:
                    str8 = C0028a.m175f(parcel, m187r);
                    break;
                default:
                    C0028a.m195z(parcel, m187r);
                    break;
            }
        }
        C0028a.m180k(parcel, m167A);
        return new GoogleSignInAccount(i10, str, str2, str3, str4, uri, str5, j10, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
