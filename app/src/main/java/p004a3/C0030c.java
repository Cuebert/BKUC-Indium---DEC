package p004a3;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p321z2.C5984j;

/* renamed from: a3.c */
/* loaded from: classes.dex */
public final class C0030c {
    /* renamed from: a */
    public static <T extends SafeParcelable> T m223a(byte[] bArr, Parcelable.Creator<T> creator) {
        C5984j.m21286j(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    /* renamed from: b */
    public static <T extends SafeParcelable> T m224b(Intent intent, String str, Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return (T) m223a(byteArrayExtra, creator);
    }
}
