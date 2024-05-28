package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

/* renamed from: com.google.android.libraries.barhopper.h */
/* loaded from: classes.dex */
final class C2375h implements Parcelable.Creator<Barcode.FlightSegment> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Barcode.FlightSegment createFromParcel(Parcel parcel) {
        return new Barcode.FlightSegment(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Barcode.FlightSegment[] newArray(int i10) {
        return new Barcode.FlightSegment[i10];
    }
}
