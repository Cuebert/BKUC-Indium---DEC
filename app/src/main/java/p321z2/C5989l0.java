package p321z2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import p004a3.C0028a;

/* renamed from: z2.l0 */
/* loaded from: classes.dex */
public final class C5989l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            int m181l = C0028a.m181l(m187r);
            if (m181l == 1) {
                i10 = C0028a.m189t(parcel, m187r);
            } else if (m181l == 2) {
                z10 = C0028a.m182m(parcel, m187r);
            } else if (m181l == 3) {
                z11 = C0028a.m182m(parcel, m187r);
            } else if (m181l == 4) {
                i11 = C0028a.m189t(parcel, m187r);
            } else if (m181l != 5) {
                C0028a.m195z(parcel, m187r);
            } else {
                i12 = C0028a.m189t(parcel, m187r);
            }
        }
        C0028a.m180k(parcel, m167A);
        return new RootTelemetryConfiguration(i10, z10, z11, i11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new RootTelemetryConfiguration[i10];
    }
}
