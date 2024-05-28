package p246t3;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: t3.a1 */
/* loaded from: classes.dex */
public final class C4625a1 {

    /* renamed from: a */
    private static final ClassLoader f18418a = C4625a1.class.getClassLoader();

    /* renamed from: b */
    public static final /* synthetic */ int f18419b = 0;

    private C4625a1() {
    }

    /* renamed from: a */
    public static Parcelable m18724a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m18725b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + dataAvail);
    }

    /* renamed from: c */
    public static void m18726c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }
}
