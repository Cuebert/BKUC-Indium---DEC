package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

/* renamed from: com.google.android.libraries.barhopper.k */
/* loaded from: classes.dex */
final class C2378k implements Parcelable.Creator<Barcode.Phone> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Barcode.Phone createFromParcel(Parcel parcel) {
        return new Barcode.Phone(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Barcode.Phone[] newArray(int i10) {
        return new Barcode.Phone[i10];
    }
}
