package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import p004a3.C0028a;

/* renamed from: com.google.android.gms.auth.api.identity.i */
/* loaded from: classes.dex */
public final class C1331i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        PublicKeyCredential publicKeyCredential = null;
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
                    str3 = C0028a.m175f(parcel, m187r);
                    break;
                case 4:
                    str4 = C0028a.m175f(parcel, m187r);
                    break;
                case 5:
                    uri = (Uri) C0028a.m174e(parcel, m187r, Uri.CREATOR);
                    break;
                case 6:
                    str5 = C0028a.m175f(parcel, m187r);
                    break;
                case 7:
                    str6 = C0028a.m175f(parcel, m187r);
                    break;
                case 8:
                    str7 = C0028a.m175f(parcel, m187r);
                    break;
                case 9:
                    publicKeyCredential = (PublicKeyCredential) C0028a.m174e(parcel, m187r, PublicKeyCredential.CREATOR);
                    break;
                default:
                    C0028a.m195z(parcel, m187r);
                    break;
            }
        }
        C0028a.m180k(parcel, m167A);
        return new SignInCredential(str, str2, str3, str4, uri, str5, str6, str7, publicKeyCredential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInCredential[i10];
    }
}
