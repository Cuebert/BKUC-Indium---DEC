package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

/* renamed from: com.google.android.libraries.barhopper.j */
/* loaded from: classes.dex */
final class C2377j implements Parcelable.Creator<Barcode.PersonName> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Barcode.PersonName createFromParcel(Parcel parcel) {
        return new Barcode.PersonName(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Barcode.PersonName[] newArray(int i10) {
        return new Barcode.PersonName[i10];
    }
}
