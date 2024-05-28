package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import p004a3.C0028a;

/* renamed from: com.google.android.gms.fido.fido2.api.common.q */
/* loaded from: classes.dex */
public final class C1470q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        int i10 = 0;
        String str = null;
        int i11 = 0;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            int m181l = C0028a.m181l(m187r);
            if (m181l == 2) {
                i10 = C0028a.m189t(parcel, m187r);
            } else if (m181l == 3) {
                str = C0028a.m175f(parcel, m187r);
            } else if (m181l != 4) {
                C0028a.m195z(parcel, m187r);
            } else {
                i11 = C0028a.m189t(parcel, m187r);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new AuthenticatorErrorResponse(i10, str, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AuthenticatorErrorResponse[i10];
    }
}
