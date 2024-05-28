package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

/* renamed from: com.google.android.libraries.barhopper.m */
/* loaded from: classes.dex */
final class C2380m implements Parcelable.Creator<Barcode.UrlBookmark> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Barcode.UrlBookmark createFromParcel(Parcel parcel) {
        return new Barcode.UrlBookmark(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Barcode.UrlBookmark[] newArray(int i10) {
        return new Barcode.UrlBookmark[i10];
    }
}
