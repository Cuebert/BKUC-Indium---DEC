package p283w3;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: w3.a1 */
/* loaded from: classes.dex */
public final class C5116a1 {

    /* renamed from: a */
    private static final ClassLoader f19383a = C5116a1.class.getClassLoader();

    private C5116a1() {
    }

    /* renamed from: a */
    public static void m19751a(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: b */
    public static void m19752b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
