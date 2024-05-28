package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5154cb;

/* loaded from: classes.dex */
public final class zzmd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmd> CREATOR = new C5154cb();

    /* renamed from: n */
    private final int f7425n;

    /* renamed from: o */
    private final String[] f7426o;

    public zzmd(int i10, String[] strArr) {
        this.f7425n = i10;
        this.f7426o = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 1, this.f7425n);
        C0029b.m216t(parcel, 2, this.f7426o, false);
        C0029b.m198b(parcel, m197a);
    }
}
