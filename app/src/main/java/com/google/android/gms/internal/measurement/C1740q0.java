package com.google.android.gms.internal.measurement;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.q0 */
/* loaded from: classes.dex */
public final class C1740q0 {

    /* renamed from: a */
    private static final ClassLoader f7173a = C1740q0.class.getClassLoader();

    private C1740q0() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m8704a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static HashMap m8705b(Parcel parcel) {
        return parcel.readHashMap(f7173a);
    }

    /* renamed from: c */
    public static void m8706c(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    /* renamed from: d */
    public static void m8707d(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* renamed from: e */
    public static void m8708e(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: f */
    public static boolean m8709f(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
