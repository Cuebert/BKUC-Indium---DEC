package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

/* renamed from: com.google.android.libraries.barhopper.e */
/* loaded from: classes.dex */
final class C2372e implements Parcelable.Creator<Barcode.ContactInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Barcode.ContactInfo createFromParcel(Parcel parcel) {
        return new Barcode.ContactInfo(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Barcode.ContactInfo[] newArray(int i10) {
        return new Barcode.ContactInfo[i10];
    }
}
