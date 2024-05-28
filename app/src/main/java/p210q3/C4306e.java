package p210q3;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: q3.e */
/* loaded from: classes.dex */
public final class C4306e {

    /* renamed from: a */
    private static final ClassLoader f17536a = C4306e.class.getClassLoader();

    private C4306e() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m17819a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m17820b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
