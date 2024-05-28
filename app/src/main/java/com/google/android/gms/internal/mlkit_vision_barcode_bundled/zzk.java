package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p296x3.C5546w;

/* loaded from: classes.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new C5546w();

    /* renamed from: n */
    private final double f7577n;

    /* renamed from: o */
    private final double f7578o;

    public zzk(double d10, double d11) {
        this.f7577n = d10;
        this.f7578o = d11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m204h(parcel, 1, this.f7577n);
        C0029b.m204h(parcel, 2, this.f7578o);
        C0029b.m198b(parcel, m197a);
    }
}
