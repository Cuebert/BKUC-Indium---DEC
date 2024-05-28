package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import p004a3.C0028a;

/* renamed from: com.google.android.gms.fido.fido2.api.common.n */
/* loaded from: classes.dex */
public final class C1467n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        FidoAppIdExtension fidoAppIdExtension = null;
        zzs zzsVar = null;
        UserVerificationMethodExtension userVerificationMethodExtension = null;
        zzz zzzVar = null;
        zzab zzabVar = null;
        zzad zzadVar = null;
        zzu zzuVar = null;
        zzag zzagVar = null;
        GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = null;
        zzai zzaiVar = null;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            switch (C0028a.m181l(m187r)) {
                case 2:
                    fidoAppIdExtension = (FidoAppIdExtension) C0028a.m174e(parcel, m187r, FidoAppIdExtension.CREATOR);
                    break;
                case 3:
                    zzsVar = (zzs) C0028a.m174e(parcel, m187r, zzs.CREATOR);
                    break;
                case 4:
                    userVerificationMethodExtension = (UserVerificationMethodExtension) C0028a.m174e(parcel, m187r, UserVerificationMethodExtension.CREATOR);
                    break;
                case 5:
                    zzzVar = (zzz) C0028a.m174e(parcel, m187r, zzz.CREATOR);
                    break;
                case 6:
                    zzabVar = (zzab) C0028a.m174e(parcel, m187r, zzab.CREATOR);
                    break;
                case 7:
                    zzadVar = (zzad) C0028a.m174e(parcel, m187r, zzad.CREATOR);
                    break;
                case 8:
                    zzuVar = (zzu) C0028a.m174e(parcel, m187r, zzu.CREATOR);
                    break;
                case 9:
                    zzagVar = (zzag) C0028a.m174e(parcel, m187r, zzag.CREATOR);
                    break;
                case 10:
                    googleThirdPartyPaymentExtension = (GoogleThirdPartyPaymentExtension) C0028a.m174e(parcel, m187r, GoogleThirdPartyPaymentExtension.CREATOR);
                    break;
                case 11:
                    zzaiVar = (zzai) C0028a.m174e(parcel, m187r, zzai.CREATOR);
                    break;
                default:
                    C0028a.m195z(parcel, m187r);
                    break;
            }
        }
        C0028a.m180k(parcel, m167A);
        return new AuthenticationExtensions(fidoAppIdExtension, zzsVar, userVerificationMethodExtension, zzzVar, zzabVar, zzadVar, zzuVar, zzagVar, googleThirdPartyPaymentExtension, zzaiVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AuthenticationExtensions[i10];
    }
}
