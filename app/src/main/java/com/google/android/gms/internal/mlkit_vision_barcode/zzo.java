package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p283w3.C5142c;

/* loaded from: classes.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new C5142c();

    /* renamed from: n */
    public String f7508n;

    /* renamed from: o */
    public String f7509o;

    public zzo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 2, this.f7508n, false);
        C0029b.m215s(parcel, 3, this.f7509o, false);
        C0029b.m198b(parcel, m197a);
    }

    public zzo(String str, String str2) {
        this.f7508n = str;
        this.f7509o = str2;
    }
}
