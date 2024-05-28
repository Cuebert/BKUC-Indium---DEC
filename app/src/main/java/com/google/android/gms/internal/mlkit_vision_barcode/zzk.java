package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5141bc;

/* loaded from: classes.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new C5141bc();

    /* renamed from: n */
    public double f7414n;

    /* renamed from: o */
    public double f7415o;

    public zzk() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m204h(parcel, 2, this.f7414n);
        C0029b.m204h(parcel, 3, this.f7415o);
        C0029b.m198b(parcel, m197a);
    }

    public zzk(double d10, double d11) {
        this.f7414n = d10;
        this.f7415o = d11;
    }
}
