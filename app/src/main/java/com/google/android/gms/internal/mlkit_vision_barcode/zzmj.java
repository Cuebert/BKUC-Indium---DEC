package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5260kb;

/* loaded from: classes.dex */
public final class zzmj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmj> CREATOR = new C5260kb();

    /* renamed from: n */
    private final double f7467n;

    /* renamed from: o */
    private final double f7468o;

    public zzmj(double d10, double d11) {
        this.f7467n = d10;
        this.f7468o = d11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m204h(parcel, 1, this.f7467n);
        C0029b.m204h(parcel, 2, this.f7468o);
        C0029b.m198b(parcel, m197a);
    }
}
