package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import p004a3.C0028a;

/* renamed from: com.google.android.gms.fido.fido2.api.common.m */
/* loaded from: classes.dex */
public final class C1466m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        UvmEntries uvmEntries = null;
        zzf zzfVar = null;
        AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = null;
        zzh zzhVar = null;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            int m181l = C0028a.m181l(m187r);
            if (m181l == 1) {
                uvmEntries = (UvmEntries) C0028a.m174e(parcel, m187r, UvmEntries.CREATOR);
            } else if (m181l == 2) {
                zzfVar = (zzf) C0028a.m174e(parcel, m187r, zzf.CREATOR);
            } else if (m181l == 3) {
                authenticationExtensionsCredPropsOutputs = (AuthenticationExtensionsCredPropsOutputs) C0028a.m174e(parcel, m187r, AuthenticationExtensionsCredPropsOutputs.CREATOR);
            } else if (m181l != 4) {
                C0028a.m195z(parcel, m187r);
            } else {
                zzhVar = (zzh) C0028a.m174e(parcel, m187r, zzh.CREATOR);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new AuthenticationExtensionsClientOutputs(uvmEntries, zzfVar, authenticationExtensionsCredPropsOutputs, zzhVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AuthenticationExtensionsClientOutputs[i10];
    }
}
