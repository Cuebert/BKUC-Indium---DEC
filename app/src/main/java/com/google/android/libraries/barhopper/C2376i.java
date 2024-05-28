package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

/* renamed from: com.google.android.libraries.barhopper.i */
/* loaded from: classes.dex */
final class C2376i implements Parcelable.Creator<Barcode.GeoPoint> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Barcode.GeoPoint createFromParcel(Parcel parcel) {
        return new Barcode.GeoPoint(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Barcode.GeoPoint[] newArray(int i10) {
        return new Barcode.GeoPoint[i10];
    }
}
