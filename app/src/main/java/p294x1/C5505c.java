package p294x1;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: x1.c */
/* loaded from: classes.dex */
public final class C5505c {
    static {
        C5505c.class.getClassLoader();
    }

    private C5505c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m20241a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m20242b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
