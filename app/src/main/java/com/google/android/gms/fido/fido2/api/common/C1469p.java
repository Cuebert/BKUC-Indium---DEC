package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import p004a3.C0028a;

/* renamed from: com.google.android.gms.fido.fido2.api.common.p */
/* loaded from: classes.dex */
public final class C1469p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        String[] strArr = null;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            int m181l = C0028a.m181l(m187r);
            if (m181l == 2) {
                bArr = C0028a.m171b(parcel, m187r);
            } else if (m181l == 3) {
                bArr2 = C0028a.m171b(parcel, m187r);
            } else if (m181l == 4) {
                bArr3 = C0028a.m171b(parcel, m187r);
            } else if (m181l != 5) {
                C0028a.m195z(parcel, m187r);
            } else {
                strArr = C0028a.m176g(parcel, m187r);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new AuthenticatorAttestationResponse(bArr, bArr2, bArr3, strArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AuthenticatorAttestationResponse[i10];
    }
}
