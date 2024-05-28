package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

/* renamed from: com.google.android.libraries.barhopper.l */
/* loaded from: classes.dex */
final class C2379l implements Parcelable.Creator<Barcode.Sms> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Barcode.Sms createFromParcel(Parcel parcel) {
        return new Barcode.Sms(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Barcode.Sms[] newArray(int i10) {
        return new Barcode.Sms[i10];
    }
}
