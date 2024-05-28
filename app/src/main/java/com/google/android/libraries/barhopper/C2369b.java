package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

/* renamed from: com.google.android.libraries.barhopper.b */
/* loaded from: classes.dex */
final class C2369b implements Parcelable.Creator<Barcode.BoardingPass> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Barcode.BoardingPass createFromParcel(Parcel parcel) {
        return new Barcode.BoardingPass(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Barcode.BoardingPass[] newArray(int i10) {
        return new Barcode.BoardingPass[i10];
    }
}
