package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

/* renamed from: com.google.android.libraries.barhopper.c */
/* loaded from: classes.dex */
final class C2370c implements Parcelable.Creator<Barcode.CalendarDateTime> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Barcode.CalendarDateTime createFromParcel(Parcel parcel) {
        return new Barcode.CalendarDateTime(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Barcode.CalendarDateTime[] newArray(int i10) {
        return new Barcode.CalendarDateTime[i10];
    }
}
