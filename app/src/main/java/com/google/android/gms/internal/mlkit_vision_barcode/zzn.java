package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5128b;

/* loaded from: classes.dex */
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new C5128b();

    /* renamed from: n */
    public String f7501n;

    /* renamed from: o */
    public String f7502o;

    public zzn() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 2, this.f7501n, false);
        C0029b.m215s(parcel, 3, this.f7502o, false);
        C0029b.m198b(parcel, m197a);
    }

    public zzn(String str, String str2) {
        this.f7501n = str;
        this.f7502o = str2;
    }
}
