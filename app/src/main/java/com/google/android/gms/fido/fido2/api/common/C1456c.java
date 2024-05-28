package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p004a3.C0028a;

/* renamed from: com.google.android.gms.fido.fido2.api.common.c */
/* loaded from: classes.dex */
public final class C1456c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = null;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        Double d10 = null;
        ArrayList arrayList2 = null;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = null;
        Integer num = null;
        TokenBinding tokenBinding = null;
        String str = null;
        AuthenticationExtensions authenticationExtensions = null;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            switch (C0028a.m181l(m187r)) {
                case 2:
                    publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) C0028a.m174e(parcel, m187r, PublicKeyCredentialRpEntity.CREATOR);
                    break;
                case 3:
                    publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) C0028a.m174e(parcel, m187r, PublicKeyCredentialUserEntity.CREATOR);
                    break;
                case 4:
                    bArr = C0028a.m171b(parcel, m187r);
                    break;
                case 5:
                    arrayList = C0028a.m179j(parcel, m187r, PublicKeyCredentialParameters.CREATOR);
                    break;
                case 6:
                    d10 = C0028a.m185p(parcel, m187r);
                    break;
                case 7:
                    arrayList2 = C0028a.m179j(parcel, m187r, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case 8:
                    authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) C0028a.m174e(parcel, m187r, AuthenticatorSelectionCriteria.CREATOR);
                    break;
                case 9:
                    num = C0028a.m190u(parcel, m187r);
                    break;
                case 10:
                    tokenBinding = (TokenBinding) C0028a.m174e(parcel, m187r, TokenBinding.CREATOR);
                    break;
                case 11:
                    str = C0028a.m175f(parcel, m187r);
                    break;
                case 12:
                    authenticationExtensions = (AuthenticationExtensions) C0028a.m174e(parcel, m187r, AuthenticationExtensions.CREATOR);
                    break;
                default:
                    C0028a.m195z(parcel, m187r);
                    break;
            }
        }
        C0028a.m180k(parcel, m167A);
        return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr, arrayList, d10, arrayList2, authenticatorSelectionCriteria, num, tokenBinding, str, authenticationExtensions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PublicKeyCredentialCreationOptions[i10];
    }
}
