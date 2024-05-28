package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5170e;

/* loaded from: classes.dex */
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new C5170e();

    /* renamed from: n */
    public int f7365n;

    /* renamed from: o */
    public boolean f7366o;

    public zzad() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m208l(parcel, 2, this.f7365n);
        C0029b.m199c(parcel, 3, this.f7366o);
        C0029b.m198b(parcel, m197a);
    }

    public zzad(int i10, boolean z10) {
        this.f7365n = i10;
        this.f7366o = z10;
    }
}
