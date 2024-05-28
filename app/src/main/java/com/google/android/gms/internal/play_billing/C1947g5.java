package com.google.android.gms.internal.play_billing;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.play_billing.g5 */
/* loaded from: classes.dex */
public final class C1947g5 {

    /* renamed from: a */
    private static final ClassLoader f7671a = C1947g5.class.getClassLoader();

    private C1947g5() {
    }

    /* renamed from: a */
    public static Parcelable m9355a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m9356b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
