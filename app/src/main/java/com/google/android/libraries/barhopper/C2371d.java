package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

/* renamed from: com.google.android.libraries.barhopper.d */
/* loaded from: classes.dex */
final class C2371d implements Parcelable.Creator<Barcode.CalendarEvent> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Barcode.CalendarEvent createFromParcel(Parcel parcel) {
        return new Barcode.CalendarEvent(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Barcode.CalendarEvent[] newArray(int i10) {
        return new Barcode.CalendarEvent[i10];
    }
}
