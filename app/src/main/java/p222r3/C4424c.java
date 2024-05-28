package p222r3;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r3.c */
/* loaded from: classes.dex */
public final class C4424c {

    /* renamed from: a */
    private static final ClassLoader f18007a = C4424c.class.getClassLoader();

    private C4424c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m18225a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m18226b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* renamed from: c */
    public static void m18227c(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
