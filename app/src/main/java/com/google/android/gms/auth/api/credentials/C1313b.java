package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import p004a3.C0028a;

/* renamed from: com.google.android.gms.auth.api.credentials.b */
/* loaded from: classes.dex */
public final class C1313b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i11 = 0;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            int m181l = C0028a.m181l(m187r);
            if (m181l == 1) {
                z10 = C0028a.m182m(parcel, m187r);
            } else if (m181l == 2) {
                z11 = C0028a.m182m(parcel, m187r);
            } else if (m181l == 3) {
                z12 = C0028a.m182m(parcel, m187r);
            } else if (m181l == 4) {
                i11 = C0028a.m189t(parcel, m187r);
            } else if (m181l != 1000) {
                C0028a.m195z(parcel, m187r);
            } else {
                i10 = C0028a.m189t(parcel, m187r);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new CredentialPickerConfig(i10, z10, z11, z12, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new CredentialPickerConfig[i10];
    }
}
