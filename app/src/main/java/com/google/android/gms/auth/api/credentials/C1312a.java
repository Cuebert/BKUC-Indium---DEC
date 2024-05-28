package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p004a3.C0028a;

/* renamed from: com.google.android.gms.auth.api.credentials.a */
/* loaded from: classes.dex */
public final class C1312a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        ArrayList arrayList = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            switch (C0028a.m181l(m187r)) {
                case 1:
                    str = C0028a.m175f(parcel, m187r);
                    break;
                case 2:
                    str2 = C0028a.m175f(parcel, m187r);
                    break;
                case 3:
                    uri = (Uri) C0028a.m174e(parcel, m187r, Uri.CREATOR);
                    break;
                case 4:
                    arrayList = C0028a.m179j(parcel, m187r, IdToken.CREATOR);
                    break;
                case 5:
                    str3 = C0028a.m175f(parcel, m187r);
                    break;
                case 6:
                    str4 = C0028a.m175f(parcel, m187r);
                    break;
                case 7:
                case 8:
                default:
                    C0028a.m195z(parcel, m187r);
                    break;
                case 9:
                    str5 = C0028a.m175f(parcel, m187r);
                    break;
                case 10:
                    str6 = C0028a.m175f(parcel, m187r);
                    break;
            }
        }
        C0028a.m180k(parcel, m167A);
        return new Credential(str, str2, uri, arrayList, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Credential[i10];
    }
}
