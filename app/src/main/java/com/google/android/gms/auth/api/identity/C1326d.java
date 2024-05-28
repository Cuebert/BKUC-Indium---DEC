package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import java.util.ArrayList;
import p004a3.C0028a;

/* renamed from: com.google.android.gms.auth.api.identity.d */
/* loaded from: classes.dex */
public final class C1326d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList<String> arrayList = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            switch (C0028a.m181l(m187r)) {
                case 1:
                    z10 = C0028a.m182m(parcel, m187r);
                    break;
                case 2:
                    str = C0028a.m175f(parcel, m187r);
                    break;
                case 3:
                    str2 = C0028a.m175f(parcel, m187r);
                    break;
                case 4:
                    z11 = C0028a.m182m(parcel, m187r);
                    break;
                case 5:
                    str3 = C0028a.m175f(parcel, m187r);
                    break;
                case 6:
                    arrayList = C0028a.m177h(parcel, m187r);
                    break;
                case 7:
                    z12 = C0028a.m182m(parcel, m187r);
                    break;
                default:
                    C0028a.m195z(parcel, m187r);
                    break;
            }
        }
        C0028a.m180k(parcel, m167A);
        return new BeginSignInRequest.GoogleIdTokenRequestOptions(z10, str, str2, z11, str3, arrayList, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new BeginSignInRequest.GoogleIdTokenRequestOptions[i10];
    }
}
