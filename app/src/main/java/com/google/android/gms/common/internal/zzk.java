package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;

/* loaded from: classes.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new C1404r();

    /* renamed from: n */
    Bundle f6395n;

    /* renamed from: o */
    Feature[] f6396o;

    /* renamed from: p */
    int f6397p;

    /* renamed from: q */
    ConnectionTelemetryConfiguration f6398q;

    public zzk() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzk(Bundle bundle, Feature[] featureArr, int i10, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f6395n = bundle;
        this.f6396o = featureArr;
        this.f6397p = i10;
        this.f6398q = connectionTelemetryConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m201e(parcel, 1, this.f6395n, false);
        C0029b.m218v(parcel, 2, this.f6396o, i10, false);
        C0029b.m208l(parcel, 3, this.f6397p);
        C0029b.m213q(parcel, 4, this.f6398q, i10, false);
        C0029b.m198b(parcel, m197a);
    }
}
