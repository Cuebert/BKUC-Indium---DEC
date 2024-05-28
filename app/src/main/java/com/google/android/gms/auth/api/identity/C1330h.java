package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import p004a3.C0028a;

/* renamed from: com.google.android.gms.auth.api.identity.h */
/* loaded from: classes.dex */
public final class C1330h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        SignInPassword signInPassword = null;
        String str = null;
        int i10 = 0;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            int m181l = C0028a.m181l(m187r);
            if (m181l == 1) {
                signInPassword = (SignInPassword) C0028a.m174e(parcel, m187r, SignInPassword.CREATOR);
            } else if (m181l == 2) {
                str = C0028a.m175f(parcel, m187r);
            } else if (m181l != 3) {
                C0028a.m195z(parcel, m187r);
            } else {
                i10 = C0028a.m189t(parcel, m187r);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new SavePasswordRequest(signInPassword, str, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SavePasswordRequest[i10];
    }
}
