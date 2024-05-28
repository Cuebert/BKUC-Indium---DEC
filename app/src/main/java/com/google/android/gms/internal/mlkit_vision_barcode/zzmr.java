package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5182eb;

/* loaded from: classes.dex */
public final class zzmr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmr> CREATOR = new C5182eb();

    /* renamed from: n */
    private final int f7500n;

    public zzmr(int i10) {
        this.f7500n = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, this.f7500n);
        C0029b.m198b(parcel, m197a);
    }
}
