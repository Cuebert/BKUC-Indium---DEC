package p161m3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import java.util.ArrayList;
import p004a3.C0028a;

/* renamed from: m3.i */
/* loaded from: classes.dex */
public final class C3940i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        String str = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            int m181l = C0028a.m181l(m187r);
            if (m181l == 2) {
                str = C0028a.m175f(parcel, m187r);
            } else if (m181l == 3) {
                bArr = C0028a.m171b(parcel, m187r);
            } else if (m181l != 4) {
                C0028a.m195z(parcel, m187r);
            } else {
                arrayList = C0028a.m179j(parcel, m187r, Transport.CREATOR);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new PublicKeyCredentialDescriptor(str, bArr, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PublicKeyCredentialDescriptor[i10];
    }
}
