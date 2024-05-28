package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

/* renamed from: com.google.android.libraries.barhopper.n */
/* loaded from: classes.dex */
final class C2381n implements Parcelable.Creator<Barcode.WiFi> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Barcode.WiFi createFromParcel(Parcel parcel) {
        return new Barcode.WiFi(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Barcode.WiFi[] newArray(int i10) {
        return new Barcode.WiFi[i10];
    }
}
