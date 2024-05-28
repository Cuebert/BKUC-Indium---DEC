package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5169dc;

/* loaded from: classes.dex */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new C5169dc();

    /* renamed from: n */
    public int f7423n;

    /* renamed from: o */
    public String f7424o;

    public zzm() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 2, this.f7423n);
        C0029b.m215s(parcel, 3, this.f7424o, false);
        C0029b.m198b(parcel, m197a);
    }

    public zzm(int i10, String str) {
        this.f7423n = i10;
        this.f7424o = str;
    }
}
