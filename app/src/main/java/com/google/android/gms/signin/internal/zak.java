package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;
import p004a3.C0029b;

/* loaded from: classes.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new C2366e();

    /* renamed from: n */
    final int f8883n;

    /* renamed from: o */
    private final ConnectionResult f8884o;

    /* renamed from: p */
    private final zav f8885p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zak(int i10, ConnectionResult connectionResult, zav zavVar) {
        this.f8883n = i10;
        this.f8884o = connectionResult;
        this.f8885p = zavVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, this.f8883n);
        C0029b.m213q(parcel, 2, this.f8884o, i10, false);
        C0029b.m213q(parcel, 3, this.f8885p, i10, false);
        C0029b.m198b(parcel, m197a);
    }

    /* renamed from: x */
    public final ConnectionResult m10416x() {
        return this.f8884o;
    }

    /* renamed from: y */
    public final zav m10417y() {
        return this.f8885p;
    }
}
