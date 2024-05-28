package p296x3;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: x3.n */
/* loaded from: classes.dex */
public final class C5537n {

    /* renamed from: a */
    private static final ClassLoader f20560a = C5537n.class.getClassLoader();

    private C5537n() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m20295a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m20296b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
