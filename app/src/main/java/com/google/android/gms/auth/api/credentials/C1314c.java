package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import p004a3.C0028a;

/* renamed from: com.google.android.gms.auth.api.credentials.c */
/* loaded from: classes.dex */
public final class C1314c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        String[] strArr = null;
        CredentialPickerConfig credentialPickerConfig = null;
        CredentialPickerConfig credentialPickerConfig2 = null;
        String str = null;
        String str2 = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            int m181l = C0028a.m181l(m187r);
            if (m181l != 1000) {
                switch (m181l) {
                    case 1:
                        z10 = C0028a.m182m(parcel, m187r);
                        break;
                    case 2:
                        strArr = C0028a.m176g(parcel, m187r);
                        break;
                    case 3:
                        credentialPickerConfig = (CredentialPickerConfig) C0028a.m174e(parcel, m187r, CredentialPickerConfig.CREATOR);
                        break;
                    case 4:
                        credentialPickerConfig2 = (CredentialPickerConfig) C0028a.m174e(parcel, m187r, CredentialPickerConfig.CREATOR);
                        break;
                    case 5:
                        z11 = C0028a.m182m(parcel, m187r);
                        break;
                    case 6:
                        str = C0028a.m175f(parcel, m187r);
                        break;
                    case 7:
                        str2 = C0028a.m175f(parcel, m187r);
                        break;
                    case 8:
                        z12 = C0028a.m182m(parcel, m187r);
                        break;
                    default:
                        C0028a.m195z(parcel, m187r);
                        break;
                }
            } else {
                i10 = C0028a.m189t(parcel, m187r);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new CredentialRequest(i10, z10, strArr, credentialPickerConfig, credentialPickerConfig2, z11, str, str2, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new CredentialRequest[i10];
    }
}
