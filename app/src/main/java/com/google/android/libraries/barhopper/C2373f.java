package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

/* renamed from: com.google.android.libraries.barhopper.f */
/* loaded from: classes.dex */
final class C2373f implements Parcelable.Creator<Barcode.DriverLicense> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Barcode.DriverLicense createFromParcel(Parcel parcel) {
        return new Barcode.DriverLicense(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Barcode.DriverLicense[] newArray(int i10) {
        return new Barcode.DriverLicense[i10];
    }
}
