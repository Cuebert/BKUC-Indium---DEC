package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5364sb;

/* loaded from: classes.dex */
public final class zzmn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmn> CREATOR = new C5364sb();

    /* renamed from: n */
    private final String f7480n;

    /* renamed from: o */
    private final String f7481o;

    public zzmn(String str, String str2) {
        this.f7480n = str;
        this.f7481o = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 1, this.f7480n, false);
        C0029b.m215s(parcel, 2, this.f7481o, false);
        C0029b.m198b(parcel, m197a);
    }
}
