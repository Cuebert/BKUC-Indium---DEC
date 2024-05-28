package com.google.android.gms.internal.p330authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p198p3.C4251o0;

/* loaded from: classes.dex */
public final class zbp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zbp> CREATOR = new C4251o0();

    /* renamed from: n */
    private final Credential f6617n;

    public zbp(Credential credential) {
        this.f6617n = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m213q(parcel, 1, this.f6617n, i10, false);
        C0029b.m198b(parcel, m197a);
    }
}
