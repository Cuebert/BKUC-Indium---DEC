package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p004a3.C0028a;

/* renamed from: com.google.android.gms.auth.api.signin.internal.a */
/* loaded from: classes.dex */
public final class C1340a implements Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInOptionsExtensionParcelable createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        int i10 = 0;
        Bundle bundle = null;
        int i11 = 0;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            int m181l = C0028a.m181l(m187r);
            if (m181l == 1) {
                i10 = C0028a.m189t(parcel, m187r);
            } else if (m181l == 2) {
                i11 = C0028a.m189t(parcel, m187r);
            } else if (m181l != 3) {
                C0028a.m195z(parcel, m187r);
            } else {
                bundle = C0028a.m170a(parcel, m187r);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new GoogleSignInOptionsExtensionParcelable(i10, i11, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptionsExtensionParcelable[] newArray(int i10) {
        return new GoogleSignInOptionsExtensionParcelable[i10];
    }
}
